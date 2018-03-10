package test.sets;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.log4j.Logger;
import org.exprint.type.AtomicType;

import antlr.sets.SetsLexer;
import antlr.sets.SetsParser;
import test.sets.antlr.EvalVisitor;

@SuppressWarnings("deprecation")
public class TestSets {

	final static Logger logger = Logger.getLogger(TestSets.class);

	public boolean testSets(String file, String result) throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));

        SetsLexer lexer = new SetsLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SetsParser parser = new SetsParser(tokenStream);

        SetsParser.ExprContext input = parser.expr();
        EvalVisitor visitor = new EvalVisitor();
        MathSet<AtomicType> atomic = visitor.visit(input);
        System.out.println(atomic);
        
        return result.equals(atomic+"");
	}

	@Test
	public void setunion() throws IOException {
		assertEquals(true, testSets("data/setunion.txt", "{1,2,3,4,5}"));
	}

	@Test
	public void setintersection() throws IOException {
		assertEquals(true, testSets("data/setintersection.txt", "{1,3,5}"));
	}

	@Test
	public void setcomplements () throws IOException {
		assertEquals(true, testSets("data/setcomplements.txt", "{1,5}"));
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		TestRig.main(new String[] {"sets.Sets", "input", "-gui","-tokens","-diagnostics","-trace","data/setunion.txt"});
		TestRig.main(new String[] {"sets.Sets", "input", "-gui","-tokens","-diagnostics","-trace","data/setintersection.txt"});
		TestRig.main(new String[] {"sets.Sets", "input", "-gui","-tokens","-diagnostics","-trace","data/setcomplements.txt"});
		
		logger.info("Goodbye!");
	}
}
