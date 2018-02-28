package org.antlr.test;

import static org.junit.Assert.assertEquals;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.sets.MathSet;
import org.setsorig.EvalVisitor;

import setsorig.SetsOrigLexer;
import setsorig.SetsOrigParser;

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
	public void setUnion() throws Exception {
		assertEquals(true, testSetsOrig("data/setUnion.txt", "{1,2,3,4,5}"));
	}

	@Test
	public void setUnionInter () throws Exception {
		assertEquals(true, testSetsOrig("data/setUnionInter.txt", "{1,3,5}"));
	}

	@Test
	public void setUnionInterSub () throws Exception {
		assertEquals(true, testSetsOrig("data/setUnionInterSub.txt", "{1,5}"));
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		TestRig.main(new String[] {"setsorig.SetsOrig", "expr", "-gui","-tokens","-diagnostics","-trace","data/setUnion.txt"});
		TestRig.main(new String[] {"setsorig.SetsOrig", "expr", "-gui","-tokens","-diagnostics","-trace","data/setUnionInter.txt"});
		TestRig.main(new String[] {"setsorig.SetsOrig", "expr", "-gui","-tokens","-diagnostics","-trace","data/setUnionInterSub.txt"});
		
		logger.info("Goodbye!");
	}
}
