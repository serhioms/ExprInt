package org.exprint;

import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.log4j.Logger;
import org.exprint.type.AtomicType;

import calcset.CalcSetLexer;
import calcset.CalcSetParser;

public class Main {

	final static Logger logger = Logger.getLogger(Main.class);

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		logger.info("Expression interpretator...");

		System.out.print("Enter Expression: ");
		
		Scanner scanner = new Scanner(System.in);
				
		for(String text = ""; true; ) {
			try {
				for(String expr = scanner.next(); !expr.isEmpty(); expr = scanner.next()) {
					
					if("bye".equalsIgnoreCase(expr) || "quit".equalsIgnoreCase(expr) || "exit".equalsIgnoreCase(expr)) {
						throw new RuntimeException("exit");
					}
	
					String newtext = text;
					
					if( expr.indexOf("=") == -1 ) {
						newtext += expr + System.lineSeparator();
					} else {
						newtext += expr + "\n0";
					}
					
					ANTLRInputStream inputs = new ANTLRInputStream(newtext);
	
			        CalcSetLexer lexer = new CalcSetLexer(inputs);
			        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			        CalcSetParser parser = new CalcSetParser(tokenStream);
	
			        CalcSetParser.InputContext input = parser.input();
			        EvalVisitor visitor = new EvalVisitor();
			        AtomicType result = visitor.visit(input);
	
			        if( result == null ) {
			        	System.out.println(text);
			        }
			        
					if( expr.indexOf("=") == -1 ) {
			        	System.out.println(expr +" = "+result);
			        } else {
						text += expr + "\n";
			        }
				}		
			} catch (Exception e) {
				if( "Not implemented".equals(e.getMessage())) {
					System.out.flush();
					System.err.println(e.getMessage());
					System.err.flush();
				} else if( "exit".equals(e.getMessage())) {
					break;
				} else {
					e.printStackTrace(System.err);
					break;
				}
			}
		}
		logger.info("Goodbye!");
	}

}
