package test.exprint;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.log4j.Logger;
import org.exprint.type.AtomicType;
import org.exprint.util.UtilExprInt;
import org.junit.Test;

/*
 * Test cases based on following info:
 * 
 * 		https://en.wikipedia.org/wiki/Boolean_algebra
 * 		https://en.wikipedia.org/wiki/De_Morgan%27s_laws
 * 		https://en.wikipedia.org/wiki/Set_(mathematics)
 * 		https://en.wikipedia.org/wiki/Symmetric_difference
 * 		https://en.wikipedia.org/wiki/Complement_(set_theory)
 * 		https://en.wikipedia.org/wiki/Cartesian_product
 * 		https://en.wikipedia.org/wiki/Ordered_pair
 * 		https://en.wikipedia.org/wiki/Universe_(mathematics)
 */

public class TestCalcSet {

	final static Logger logger = Logger.getLogger(TestCalcSet.class);

	private String evaluate(String file, String expected) throws IOException {
		try {
	        AtomicType result = UtilExprInt.evaluate(new String(Files.readAllBytes(Paths.get(file))));
	        
	        System.out.println(result);
	        
	        return expected.equals(result+"")+"";
		} catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@Test
	public void numsetvar() throws IOException {
		assertEquals("true", evaluate("data/numsetvar.txt", "3"));
	}
	
	@Test
	public void numarifmetika() throws IOException {
		assertEquals("true", evaluate("data/numarifmetika.txt", "33"));
	}
	
	@Test
	public void setunion() throws IOException {
		assertEquals("true", evaluate("data/setunion.txt", "{1,2,3,4,5}"));
	}
	
	@Test
	public void setintersection() throws IOException {
		assertEquals("true", evaluate("data/setintersection.txt", "{1,3,5}"));
	}
	
	@Test
	public void setcomplements() throws IOException {
		assertEquals("true", evaluate("data/setcomplements.txt", "{1,5}"));
	}
	
	@Test
	public void setcardinality() throws IOException {
		assertEquals("true", evaluate("data/setcardinality.txt", "true"));
	}
	
	@Test
	public void setcardinalitylaws() throws IOException {
		assertEquals("true", evaluate("data/setcardinalitylaws.txt", "true"));
	}
	
	@Test
	public void setbasic() throws IOException {
		assertEquals("true", evaluate("data/setbasic.txt", "true"));
	}

	@Test
	public void setsimple() throws IOException {
		assertEquals("true", evaluate("data/setsimple.txt", "true"));
	}

	@Test
	public void booleanbasic() throws IOException {
		assertEquals("true", evaluate("data/booleanbasic.txt", "true"));
	}
	
	@Test
	public void string() throws IOException {
		assertEquals("true", evaluate("data/string.txt", "true"));
	}
	
	@Test
	public void subsetlaw() throws IOException {
		assertEquals("true", evaluate("data/subsetlaw.txt", "true"));
	}
	
	@Test
	public void setunionlaws() throws IOException {
		assertEquals("true", evaluate("data/setunionlaws.txt", "true"));
	}
	
	@Test
	public void setintersectionlaw() throws IOException {
		assertEquals("true", evaluate("data/setintersectionlaw.txt", "true"));
	}
	
	@Test
	public void setcomplementslaw() throws IOException {
		assertEquals("true", evaluate("data/setcomplementslaw.txt", "true"));
	}	
	
	@Test
	public void setuniversalbasic() throws IOException {
		assertEquals("true", evaluate("data/setuniversalbasic.txt", "true"));
	}	
	
	@Test
	public void setemptylaw() throws IOException {
		assertEquals("true", evaluate("data/setemptylaw.txt", "true"));
	}

	@Test
	public void setmorgan() throws IOException {
		assertEquals("true", evaluate("data/setmorgan.txt", "true"));
	}

	@Test
	public void setsymmetricdifferencelaw() throws IOException {
		assertEquals("true", evaluate("data/setsymmetricdifferencelaw.txt", "true"));
	}

	@Test
	public void setmembershipbasic() throws IOException {
		assertEquals("true", evaluate("data/setmembershipbasic.txt", "true"));
	}

	@Test
	public void comparison() throws IOException {
		assertEquals("true", evaluate("data/comparison.txt", "true"));
	}

	@Test
	public void setrelativelaw() throws IOException {
		assertEquals("true", evaluate("data/setrelativelaw.txt", "true"));
	}

	@Test
	public void booleanlaw() throws IOException {
		assertEquals("true", evaluate("data/booleanlaw.txt", "true"));
	}

	@Test
	public void bit() throws IOException {
		assertEquals("true", evaluate("data/bit.txt", "true"));
	}

	@Test
	public void setcomplex() throws IOException {
		assertEquals("true", evaluate("data/setcomplex.txt", "true"));
	}
	
	@Test
	public void setcartesian() throws IOException {
		assertEquals("true", evaluate("data/setcartesian.txt", "true"));
	}
	
	@Test
	public void setcomparison() throws IOException {
		assertEquals("true", evaluate("data/setcomparison.txt", "true"));
	}
	
	@Test
	public void equality() throws IOException {
		assertEquals("true", evaluate("data/equality.txt", "true"));
	}
	
	@Test
	public void setcarddeck() throws IOException {
		assertEquals("true", evaluate("data/setcarddeck.txt", "true"));
	}
	
	@Test
	public void setcartesianlaws() throws IOException {
		assertEquals("true", evaluate("data/setcartesianlaws.txt", "true"));
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcartesianlaws.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcarddeck.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/equality.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcomparison.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/numsetvar.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/numarifmetika.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setunion.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setunionlaws.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setintersection.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcomplements.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setemptylaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/calcsetSubsetEmpty.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcardinality.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcardinalitylaws.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setbasic.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setsimple.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/booleanbasic.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/string.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/subsetlaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setmorgan.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setsymmetricdifferencelaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setmembershipbasic.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/comparison.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setrelativelaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/booleanlaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setintersectionlaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/bit.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcomplementslaw.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setuniversalbasic.txt"});
		org.antlr.v4.gui.TestRig.main(new String[] {"calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/setcartesian.txt"});
		
		logger.info("Goodbye!");
	}
}
