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

import com.github.mgrzeszczak.setcalculator.EvalVisitor;
import com.github.mgrzeszczak.setcalculator.MathSet;

import sets.SetsLexer;
import sets.SetsParser;

public class TestSets {

	final static Logger logger = Logger.getLogger(TestSets.class);

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
	public void union() throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/sets1.txt"))));

        SetsLexer lexer = new SetsLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SetsParser parser = new SetsParser(tokenStream);

        SetsParser.ExprContext input = parser.expr();
        EvalVisitor visitor = new EvalVisitor();
        MathSet<MathType> result = visitor.visit(input);
        System.out.println(result);
        
        assertEquals("NotNull", result==null?"Null":"NotNull");
        assertEquals("{1,2,3,4,5}", result.toString());
	}

	@Test
	public void intersection () throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/sets2.txt"))));

        SetsLexer lexer = new SetsLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SetsParser parser = new SetsParser(tokenStream);

        SetsParser.ExprContext input = parser.expr();
        EvalVisitor visitor = new EvalVisitor();
        MathSet<MathType> result = visitor.visit(input);
        System.out.println(result);
        
        assertEquals("NotNull", result==null?"Null":"NotNull");
        assertEquals("{1,3,5}", result.toString());
	}

	@Test
	public void subtraction () throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/sets3.txt"))));

        SetsLexer lexer = new SetsLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SetsParser parser = new SetsParser(tokenStream);

        SetsParser.ExprContext input = parser.expr();
        EvalVisitor visitor = new EvalVisitor();
        MathSet<MathType> result = visitor.visit(input);
        System.out.println(result);
        
        assertEquals("NotNull", result==null?"Null":"NotNull");
        assertEquals("{1,5}", result.toString());
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		TestRig.main(new String[] {"sets.Sets", "input", "-gui","-tokens","-diagnostics","-trace","data/sets1.txt"});
		
		logger.info("Goodbye!");
	}
}
