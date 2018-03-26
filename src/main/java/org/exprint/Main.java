package org.exprint;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.exprint.type.AtomicType;
import org.exprint.util.UtilExprInt;
import org.apache.log4j.Logger;

public class Main {

	final static Logger logger = Logger.getLogger(Main.class);

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String text="";

		Pattern assignment = Pattern.compile("[a-zA-Z_][a-zA-Z_0-9]*[\\s]*=(.*)");
		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.print("Enter expression, help or quit...\n>");
			for(String line = scanner.nextLine(); true; line = scanner.nextLine()) {
				
				line = line.trim();
				
				if( line.isEmpty() || "text".equalsIgnoreCase(line)) {
		        	System.out.print(text.isEmpty()?">":text+"\n>");
					continue;
				}
				
				if("clear".equalsIgnoreCase(line)) {
					text = "";
		        	System.out.print(">");
					continue;
				}
				
				if("bye".equalsIgnoreCase(line) || "quit".equalsIgnoreCase(line) || "exit".equalsIgnoreCase(line)) {
					break;
				}
				
				if("help".equalsIgnoreCase(line) ) {
					System.out.printf(
							"quit, exit, bye        // get out\n"+
							"enter or text          // show program text\n"+
							"clear                  // clear program text\n"+
							"ident = expression     // variable assignment where expression is:\n"+
							"\n"+
							"Boolean algebra: true, false, >, >=, <, <=, == (equals), != (not equal), && (and), || (or), ! (not), -> (implication), !& (nand), !| (nor), X| (xor), X! (xnor)\n"+
							"Number algebra: _pi, _e, +, -, *, /, ** (power), # (cardinality), ==, !=, <=, <, >=, > for both Integer and Real\n"+
							"String operations: # (length), + (concatenation), ==, != for \"this is a string constant\"\n"+
							"Bit operations: ~ (inversion), >> (right shift), >>> (unsigned right shift), << (left shift), & (and), | (or), ^^(xor) for integers only\n"+
							"Sets algebra: {} (empty set), _u (universal set), # (cardinality), == (equals), @ (belongs), & (intersection), && (recursive intersection), | (union), \\ (complements), /\\ (disjunctive union), ' (complement set), ! (not empty)\n"+
							""
						);
		        	System.out.print(text+"\n>");
					continue;
				}
				
				String expr = "";
				
				Matcher matcher = assignment.matcher(line);
			    if( matcher.find() ) {
			    	text += (text.isEmpty()?"":"\n")+line;
			    	expr = text+"\n"+matcher.group(1)+"\n";
			    } else {
			    	expr = text+(text.isEmpty()?"":"\n")+line + "\n";
			    }
				
				try {
					AtomicType result = UtilExprInt.evaluate(expr);
					if( result != null ) {
						System.out.print(result+"\n>");
					} else {
						System.out.println("ignore...");
						System.out.print(">");
					}
				} catch (Exception e) {
					System.out.print(e.getMessage());
					System.err.flush();
					System.out.flush();
		        	System.out.print("\n>");
				}
			}
		} finally {
			scanner.close();
		}
		
		System.out.println("Goodbye!");
	}

}
