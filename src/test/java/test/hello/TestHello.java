package test.hello;

import org.antlr.v4.gui.TestRig;
import org.apache.log4j.Logger;

public class TestHello {

	final static Logger logger = Logger.getLogger(TestHello.class);

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Antlr test...");
		
		TestRig.main(new String[] {"antlr.hello.Hello", "r", "-gui","-tokens","-diagnostics","-trace","data/hello.txt"});
		
		logger.info("Goodbye!");
	}

}
