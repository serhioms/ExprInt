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
							"Number algebra: +, -, *, /, ^ for integers 1,2,3 and real _pi (3.14), _e (2.71)\n"+
							"String operations: + (concatenation), # (length) for \"strings\"\n"+
							"Bit operations: ~, >>, >>>, <<, &, | for integers only\n"+
							"Boolean algebra: true, false, >, >=, <, <=, == (equals), != (not equals), && (and), || (or), ! (not), -> (implication), !& (nand), !| (nor), X| (xor), X! (xnor)\n"+
							"Set algebra: {} (empty set), _u (universal set), @ (belongs), # (cardinality), & (intersection), && (recursive intersection), | (union), \\ (complements), /\\ (disjunctive union)\n"+
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
