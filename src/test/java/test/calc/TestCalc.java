package test.calc;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.log4j.Logger;
import org.junit.Test;

import antlr.calculator.CalculatorLexer;
import antlr.calculator.CalculatorParser;
import test.calc.antlr.EvalVisitor;

@SuppressWarnings("deprecation")
public class TestCalc {

	final static Logger logger = Logger.getLogger(TestCalc.class);

	public boolean testCalc(String file, double result) throws IOException {
    	ANTLRInputStream input = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));
    	
    	CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.input();

        EvalVisitor calcVisitor = new EvalVisitor();
        Double dbl = calcVisitor.visit(tree);
        System.out.println("Result: " + dbl);
        
        return dbl.equals(result);
	}

	@Test
	public void numsetvar() throws IOException {
        assertEquals(true, testCalc("data/numsetvar.txt", 3.0d));
	}

	@Test
	public void numarifmetika() throws IOException {
        assertEquals(true, testCalc("data/numarifmetika.txt", 33.0d));
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		TestRig.main(new String[] {"calculator.Calculator", "input", "-gui","-tokens","-diagnostics","-trace","data/numsetvar.txt"});
		TestRig.main(new String[] {"calculator.Calculator", "input", "-gui","-tokens","-diagnostics","-trace","data/numarifmetika.txt"});
		
		logger.info("Goodbye!");
	}
}
