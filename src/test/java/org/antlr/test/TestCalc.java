package org.antlr.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.log4j.Logger;
import org.calc.CalculatorBaseVisitorImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculator.CalculatorLexer;
import calculator.CalculatorParser;

public class TestCalc {

	final static Logger logger = Logger.getLogger(TestHello.class);

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
	public void expression() throws IOException {
    	ANTLRInputStream input = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get("data/calculator.txt"))));
    	
    	CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.input();

        CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
        Double result = calcVisitor.visit(tree);
        System.out.println("Result: " + result);
        
        assertEquals(33.0d, result.doubleValue(), 0.00001);
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		TestRig.main(new String[] {"calculator.Calculator", "input", "-gui","-tokens","-diagnostics","-trace","data/calculator.txt"});
		
		logger.info("Goodbye!");
	}
}