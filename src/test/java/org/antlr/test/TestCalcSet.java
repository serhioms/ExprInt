package org.antlr.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.log4j.Logger;
import org.exprint.type.MathType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sets.SetsLexer;
import sets.SetsParser;

public class TestCalcSet {

	final static Logger logger = Logger.getLogger(TestCalcSet.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sets1() throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/sets1.txt"))));

    	sets.SetsLexer lexer = new sets.SetsLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        sets.SetsParser parser = new sets.SetsParser(tokenStream);

        sets.SetsParser.ExprContext expr = parser.expr();
        com.github.mgrzeszczak.setcalculator.EvalVisitor visitor = new com.github.mgrzeszczak.setcalculator.EvalVisitor();
        com.github.mgrzeszczak.setcalculator.MathSet<MathType> result = visitor.visit(expr);
        System.out.println(result);
        
        assertEquals("NotNull", result==null?"Null":"NotNull");
        assertEquals("{1,2,3,4,5}", result.toString());
	}
	
	//@Test
	public void calcsetCalculator1() throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/calculator1.txt"))));

        calcset.CalcSetLexer lexer = new calcset.CalcSetLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        calcset.CalcSetParser parser = new calcset.CalcSetParser(tokenStream);

        calcset.CalcSetParser.InputContext input = parser.input();
        org.exprint.EvalVisitor visitor = new org.exprint.EvalVisitor();
        org.exprint.MathSet<MathType> result = visitor.visit(input);
        System.out.println(result);
        
        assertEquals("NotNull", result==null?"Null":"NotNull");
        assertEquals("{33}", result.toString());
	}
	
	@Test
	public void calcsetCalculator2() throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/calculator2.txt"))));

        calcset.CalcSetLexer lexer = new calcset.CalcSetLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        calcset.CalcSetParser parser = new calcset.CalcSetParser(tokenStream);

        calcset.CalcSetParser.InputContext input = parser.input();
        org.exprint.EvalVisitor visitor = new org.exprint.EvalVisitor();
        org.exprint.MathSet<MathType> result = visitor.visit(input);
        System.out.println(result);
        
        assertEquals("NotNull", result==null?"Null":"NotNull");
        assertEquals("{3}", result.toString());
	}
	
	@Test
	public void calcsetSet1() throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/sets1.txt"))));

        calcset.CalcSetLexer lexer = new calcset.CalcSetLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        calcset.CalcSetParser parser = new calcset.CalcSetParser(tokenStream);

        calcset.CalcSetParser.InputContext input = parser.input();
        org.exprint.EvalVisitor visitor = new org.exprint.EvalVisitor();
        org.exprint.MathSet<MathType> result = visitor.visit(input);
        System.out.println(result);
        
        assertEquals("NotNull", result==null?"Null":"NotNull");
        assertEquals("{1,2,3,4,5}", result.toString());
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/sets1.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calculator1.txt"});
		
		logger.info("Goodbye!");
	}
}
