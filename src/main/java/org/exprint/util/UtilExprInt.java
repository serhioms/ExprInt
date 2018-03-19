package org.exprint.util;

import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.exprint.antlr.EvalVisitor;
import org.exprint.type.AtomicType;

import antlr.calcset.CalcSetLexer;
import antlr.calcset.CalcSetParser;

@SuppressWarnings("deprecation")
public class UtilExprInt {

	public static AtomicType evaluate(String newtext) throws Exception {
		newtext += "\n";
		
		ANTLRInputStream inputs = new ANTLRInputStream(newtext);
		
        CalcSetLexer lexer = new CalcSetLexer(inputs);
        lexer.addErrorListener(new ErrorListener(newtext));
        
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CalcSetParser parser = new CalcSetParser(tokenStream);

        CalcSetParser.InputContext input = parser.input();
        EvalVisitor visitor = new EvalVisitor();
        return visitor.visit(input);
	}

	
	static public class ErrorListener extends BaseErrorListener {

		final public String ident;
		
		public ErrorListener(String ident) {
			super();
			this.ident = ident;
		}

		@Override
		public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
				BitSet ambigAlts, ATNConfigSet configs) {
			//super.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
			//throw new ParseCancellationException("Ambiguity: "+ident);
		}

		@Override
		public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
				BitSet conflictingAlts, ATNConfigSet configs) {
			//super.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs);
			//throw new ParseCancellationException("Attempting Full Context: "+ident);
		}

		@Override
		public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
				ATNConfigSet configs) {
			//super.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs);
			//throw new ParseCancellationException("Context Sensitivity: "+ident);
		}

		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
				String msg, RecognitionException e) throws ParseCancellationException {
			//throw new ParseCancellationException("Syntax Error: "+ident+" line " + line + ":" + charPositionInLine + " " + msg);
		}
	}
}
