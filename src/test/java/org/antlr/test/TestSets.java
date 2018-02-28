package org.antlr.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.log4j.Logger;
import org.exprint.type.AtomicType;
import org.junit.Test;
import org.sets.EvalVisitor;
import org.sets.MathSet;

import sets.SetsLexer;
import sets.SetsParser;

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
	public void setUnion() throws IOException {
		assertEquals(true, testSets("data/setUnion.txt", "{1,2,3,4,5}"));
	}

	@Test
	public void setUnionInter() throws IOException {
		assertEquals(true, testSets("data/setUnionInter.txt", "{1,3,5}"));
	}

	@Test
	public void setUnionInterSub () throws IOException {
		assertEquals(true, testSets("data/setUnionInterSub.txt", "{1,5}"));
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		TestRig.main(new String[] {"sets.Sets", "input", "-gui","-tokens","-diagnostics","-trace","data/setUnion.txt"});
		TestRig.main(new String[] {"sets.Sets", "input", "-gui","-tokens","-diagnostics","-trace","data/setUnionInter.txt"});
		TestRig.main(new String[] {"sets.Sets", "input", "-gui","-tokens","-diagnostics","-trace","data/setUnionInterSub.txt"});
		
		logger.info("Goodbye!");
	}
}
