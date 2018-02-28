package org.antlr.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sets.MathSet;
import org.setsorig.EvalVisitor;

import setsorig.SetsOrigLexer;
import setsorig.SetsOrigParser;

@SuppressWarnings("deprecation")
public class TestSetsOrig {

	final static Logger logger = Logger.getLogger(TestSetsOrig.class);

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
	public void setUnion() throws Exception {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/setUnion.txt"))));

        SetsOrigLexer lexer = new SetsOrigLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SetsOrigParser parser = new SetsOrigParser(tokenStream);

        SetsOrigParser.ExprContext input = parser.expr();
        EvalVisitor visitor = new EvalVisitor();
        MathSet<Integer> result = visitor.visit(input);
        System.out.println(result);
        
        assertEquals("NotNull", result==null?"Null":"NotNull");
        assertEquals("{1,2,3,4,5}", result.toString());
	}

	@Test
	public void setUnionInter () throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/setUnionInter.txt"))));

        SetsOrigLexer lexer = new SetsOrigLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SetsOrigParser parser = new SetsOrigParser(tokenStream);

        SetsOrigParser.ExprContext input = parser.expr();
        EvalVisitor visitor = new EvalVisitor();
        MathSet<Integer> result = visitor.visit(input);
        System.out.println(result);
        
        assertEquals("NotNull", result==null?"Null":"NotNull");
        assertEquals("{1,3,5}", result.toString());
	}

	@Test
	public void setUnionInterSub () throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/setUnionInterSub.txt"))));

        SetsOrigLexer lexer = new SetsOrigLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SetsOrigParser parser = new SetsOrigParser(tokenStream);

        SetsOrigParser.ExprContext input = parser.expr();
        EvalVisitor visitor = new EvalVisitor();
        MathSet<Integer> result = visitor.visit(input);
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
		
		TestRig.main(new String[] {"setsorig.SetsOrig", "expr", "-gui","-tokens","-diagnostics","-trace","data/sets1.txt"});
		TestRig.main(new String[] {"setsorig.SetsOrig", "expr", "-gui","-tokens","-diagnostics","-trace","data/sets2.txt"});
		TestRig.main(new String[] {"setsorig.SetsOrig", "expr", "-gui","-tokens","-diagnostics","-trace","data/sets3.txt"});
		
		logger.info("Goodbye!");
	}
}
