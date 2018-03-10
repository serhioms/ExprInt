package test.setsorig;

import static org.junit.Assert.assertEquals;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.log4j.Logger;
import org.junit.Test;

import antlr.setsorig.SetsOrigLexer;
import antlr.setsorig.SetsOrigParser;
import test.sets.MathSet;
import test.setsorig.antlr.EvalVisitor;

@SuppressWarnings("deprecation")
public class TestSetsOrig {

	final static Logger logger = Logger.getLogger(TestSetsOrig.class);

	public boolean testSetsOrig(String file, String expected) throws Exception {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));

        SetsOrigLexer lexer = new SetsOrigLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SetsOrigParser parser = new SetsOrigParser(tokenStream);

        SetsOrigParser.ExprContext input = parser.expr();
        EvalVisitor visitor = new EvalVisitor();
        MathSet<Integer> result = visitor.visit(input);
        System.out.println(result);
        
        return expected.equals(result+"");
	}

	@Test
	public void setunion() throws Exception {
		assertEquals(true, testSetsOrig("data/setunion.txt", "{1,2,3,4,5}"));
	}

	@Test
	public void setintersection() throws Exception {
		assertEquals(true, testSetsOrig("data/setintersection.txt", "{1,3,5}"));
	}

	@Test
	public void setcomplements() throws Exception {
		assertEquals(true, testSetsOrig("data/setcomplements.txt", "{1,5}"));
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		TestRig.main(new String[] {"setsorig.SetsOrig", "expr", "-gui","-tokens","-diagnostics","-trace","data/setunion.txt"});
		TestRig.main(new String[] {"setsorig.SetsOrig", "expr", "-gui","-tokens","-diagnostics","-trace","data/setintersection.txt"});
		TestRig.main(new String[] {"setsorig.SetsOrig", "expr", "-gui","-tokens","-diagnostics","-trace","data/setcomplements.txt"});
		
		logger.info("Goodbye!");
	}
}
