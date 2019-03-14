package test.exprint;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.log4j.Logger;
import org.exprint.type.AtomicType;
import org.exprint.util.UtilExprInt;
import org.junit.Test;

public class TestTask {

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
	public void queen8() throws IOException {
		// http://np-soft.ru/npproject/quick_np/base/queens_example.htm
		assertEquals("true", evaluate("data/task/queen8.txt", "true"));
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		org.antlr.v4.gui.TestRig.main(new String[] {"antlr.calcset.CalcSet", "input", "-gui","-tokens","-diagnostics","-trace","data/task/queen8.txt"});
		
		logger.info("Goodbye!");
	}
}
