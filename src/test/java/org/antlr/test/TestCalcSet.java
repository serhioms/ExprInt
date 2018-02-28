package org.antlr.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.log4j.Logger;
import org.exprint.EvalVisitor;
import org.exprint.type.AtomicType;
import org.junit.Test;

import calcset.CalcSetLexer;
import calcset.CalcSetParser;

@SuppressWarnings("deprecation")
public class TestCalcSet {

	final static Logger logger = Logger.getLogger(TestCalcSet.class);

	public boolean checkInt(String file, String result) throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));

        CalcSetLexer lexer = new CalcSetLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CalcSetParser parser = new CalcSetParser(tokenStream);

        CalcSetParser.InputContext input = parser.input();
        EvalVisitor visitor = new EvalVisitor();
        AtomicType atomic = visitor.visit(input);
        System.out.println(atomic);
        
        return result.equals(atomic+"");
	}

	@Test
	public void calcIntPlus() throws IOException {
		assertEquals(true, checkSet("data/calcsetIntPlus.txt", "3"));
	}
	
	@Test
	public void calcIntPlusMinusPow() throws IOException {
		assertEquals(true, checkSet("data/calcsetIntPlusMinusPow.txt", "33"));
	}
	
	public boolean checkSet(String file, String result) throws IOException {
    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));

        CalcSetLexer lexer = new CalcSetLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CalcSetParser parser = new CalcSetParser(tokenStream);

        CalcSetParser.InputContext input = parser.input();
        EvalVisitor visitor = new EvalVisitor();
        AtomicType atomic = visitor.visit(input);
        System.out.println(atomic);
        
        return result.equals(atomic+"");
	}
	
	@Test
	public void setUnion() throws IOException {
		assertEquals(true, checkSet("data/setUnion.txt", "{1,2,3,4,5}"));
	}
	
	@Test
	public void setUnionInter() throws IOException {
		assertEquals(true, checkSet("data/setUnionInter.txt", "{1,3,5}"));
	}
	
	@Test
	public void setUnionIntersectionSubstruction() throws IOException {
		assertEquals(true, checkSet("data/setUnionInterSub.txt", "{1,5}"));
	}
	
	public boolean checkCalcSet(String file, String result) throws IOException {
		ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));

        CalcSetLexer lexer = new CalcSetLexer(inputs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CalcSetParser parser = new CalcSetParser(tokenStream);

        CalcSetParser.InputContext input = parser.input();
        EvalVisitor visitor = new EvalVisitor();
        AtomicType atomic = visitor.visit(input);
        System.out.println(atomic);
        
        return result.equals(atomic+"");
	}
	
	
	@Test
	public void calcsetInterUnionEmpty() throws IOException {
		assertEquals(true, checkCalcSet("data/calcsetInterUnionEmpty.txt", "true"));
	}
	
	@Test
	public void calcsetSubsetEmpty() throws IOException {
		assertEquals(true, checkCalcSet("data/calcsetSubsetEmpty.txt", "true"));
	}
	
	@Test
	public void calcsetCardinality() throws IOException {
		assertEquals(true, checkCalcSet("data/calcsetCardinality.txt", "true"));
	}
	
	@Test
	public void calcsetIntUnion() throws IOException {
		assertEquals(true, checkCalcSet("data/calcsetIntUnion.txt", "true"));
	}

	@Test
	public void calcsetInit() throws IOException {
		assertEquals(true, checkCalcSet("data/calcsetInit.txt", "true"));
	}

	@Test
	public void calcsetBoolean() throws IOException {
		assertEquals(true, checkCalcSet("data/calcsetBoolean.txt", "true"));
	}
	
	@Test
	public void calcsetStringConcat() throws IOException {
		assertEquals(true, checkCalcSet("data/calcsetStringConcat.txt", "true"));
	}
	
	@Test
	public void calcsetStringBoolean() throws IOException {
		assertEquals(true, checkCalcSet("data/calcsetStringBoolean.txt", "true"));
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetIntPlus.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetIntPlusMinusPow.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetBoolean.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetCardinality.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetInit.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetInterUnionEmpty.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetIntUnion.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetStringBoolean.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetStringConcat.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetSubsetEmpty.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setUnion.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setUnionInter.txt"});
		TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setUnionInterSub.txt"});
		
		logger.info("Goodbye!");
	}
}
