package test.exprint;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.log4j.Logger;
import org.exprint.antlr.EvalVisitor;
import org.exprint.type.AtomicType;
import org.exprint.util.UtilExprInt;
import org.junit.Test;

import antlr.calcset.CalcSetLexer;
import antlr.calcset.CalcSetParser;

/*
 * Test cases based on following info:
 * 
 * 		https://en.wikipedia.org/wiki/Set_(mathematics)
 * 		https://en.wikipedia.org/wiki/Symmetric_difference
 * 		https://en.wikipedia.org/wiki/Complement_(set_theory)
 * 		https://en.wikipedia.org/wiki/Boolean_algebra
 * 		https://en.wikipedia.org/wiki/De_Morgan%27s_laws
 *   
 */

@SuppressWarnings("deprecation")
public class TestCalcSet {

	final static Logger logger = Logger.getLogger(TestCalcSet.class);

	public String testCalcSet(String file, String expected) throws IOException {
		try {
	    	ANTLRInputStream inputs = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));
	
	        CalcSetLexer lexer = new CalcSetLexer(inputs);
	        lexer.addErrorListener(new UtilExprInt.ErrorListener(file));
	        
	        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
	        CalcSetParser parser = new CalcSetParser(tokenStream);
	        CalcSetParser.InputContext input = parser.input();
	        
	        EvalVisitor visitor = new EvalVisitor();
	        AtomicType result = visitor.visit(input);
	        
	        System.out.println(result);
	        
	        return expected.equals(result+"")+"";
		} catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@Test
	public void plus() throws IOException {
		assertEquals("true", testCalcSet("data/plus.txt", "3"));
	}
	
	@Test
	public void arifmetika() throws IOException {
		assertEquals("true", testCalcSet("data/arifmetika.txt", "33"));
	}
	
	@Test
	public void setunion() throws IOException {
		assertEquals("true", testCalcSet("data/setunion.txt", "{1,2,3,4,5}"));
	}
	
	@Test
	public void setintersection() throws IOException {
		assertEquals("true", testCalcSet("data/setintersection.txt", "{1,3,5}"));
	}
	
	@Test
	public void setcomplements() throws IOException {
		assertEquals("true", testCalcSet("data/setcomplements.txt", "{1,5}"));
	}
	
	@Test
	public void setcardinality() throws IOException {
		assertEquals("true", testCalcSet("data/setcardinality.txt", "true"));
	}
	
	@Test
	public void setbasic() throws IOException {
		assertEquals("true", testCalcSet("data/setbasic.txt", "true"));
	}

	@Test
	public void setsimple() throws IOException {
		assertEquals("true", testCalcSet("data/setsimple.txt", "true"));
	}

	@Test
	public void booleanbasic() throws IOException {
		assertEquals("true", testCalcSet("data/booleanbasic.txt", "true"));
	}
	
	@Test
	public void string() throws IOException {
		assertEquals("true", testCalcSet("data/string.txt", "true"));
	}
	
	@Test
	public void subsetlaw() throws IOException {
		assertEquals("true", testCalcSet("data/subsetlaw.txt", "true"));
	}
	
	@Test
	public void union() throws IOException {
		assertEquals("true", testCalcSet("data/union.txt", "true"));
	}
	
	@Test
	public void setintersectionlaw() throws IOException {
		assertEquals("true", testCalcSet("data/setintersectionlaw.txt", "true"));
	}
	
	@Test
	public void setcomplementslaw() throws IOException {
		assertEquals("true", testCalcSet("data/setcomplementslaw.txt", "true"));
	}	
	
	@Test
	public void setuniversalbasic() throws IOException {
		assertEquals("true", testCalcSet("data/setuniversalbasic.txt", "true"));
	}	
	
	@Test
	public void setemptylaw() throws IOException {
		assertEquals("true", testCalcSet("data/setemptylaw.txt", "true"));
	}

	@Test
	public void booleanmorgan() throws IOException {
		assertEquals("true", testCalcSet("data/booleanmorgan.txt", "true"));
	}

	@Test
	public void setsymmetricdifferencelaw() throws IOException {
		assertEquals("true", testCalcSet("data/setsymmetricdifferencelaw.txt", "true"));
	}

	@Test
	public void setmembershipbasic() throws IOException {
		assertEquals("true", testCalcSet("data/setmembershipbasic.txt", "true"));
	}

	@Test
	public void comparision() throws IOException {
		assertEquals("true", testCalcSet("data/comparision.txt", "true"));
	}

	@Test
	public void setrelativelaw() throws IOException {
		assertEquals("true", testCalcSet("data/setrelativelaw.txt", "true"));
	}

	@Test
	public void booleanlaw() throws IOException {
		assertEquals("true", testCalcSet("data/booleanlaw.txt", "true"));
	}

	@Test
	public void booleanint01() throws IOException {
		assertEquals("true", testCalcSet("data/booleanint01.txt", "true"));
	}

	@Test
	public void boleanint10() throws IOException {
		assertEquals("true", testCalcSet("data/boleanint10.txt", "true"));
	}

	@Test
	public void bit() throws IOException {
		assertEquals("true", testCalcSet("data/bit.txt", "true"));
	}

	@Test
	public void setcomplex() throws IOException {
		assertEquals("true", testCalcSet("data/setcomplex.txt", "true"));
	}
	

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/plus.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/arifmetika.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setunion.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setintersection.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcomplements.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setemptylaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetSubsetEmpty.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcardinality.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setbasic.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setsimple.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/booleanbasic.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/string.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/subsetlaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/booleanmorgan.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setsymmetricdifferencelaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setmembershipbasic.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/comparision.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setrelativelaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/booleanlaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setintersectionlaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/booleanint01.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/boleanint10.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/bit.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcomplementslaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setuniversalbasic.txt"});
		
		logger.info("Goodbye!");
	}
}
