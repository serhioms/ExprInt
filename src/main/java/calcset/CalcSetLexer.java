// Generated from gramma/CalcSet.g4 by ANTLR 4.7.1
package calcset;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcSetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4, NL=5, INT=6, DOUBLE=7, PI=8, E=9, POW=10, 
		ID=11, PLUS=12, EQUAL=13, MINUS=14, MULT=15, DIV=16, LPAR=17, RPAR=18, 
		OP_UNION_SUBSTRUCTION=19, OP_INTERSECTION=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "WS", "NL", "INT", "DOUBLE", "PI", "E", "POW", 
		"ID", "PLUS", "EQUAL", "MINUS", "MULT", "DIV", "LPAR", "RPAR", "OP_UNION_SUBSTRUCTION", 
		"OP_INTERSECTION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", null, "'\n'", null, null, "'pi'", "'e'", "'^'", 
		null, "'+'", "'='", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WS", "NL", "INT", "DOUBLE", "PI", "E", "POW", 
		"ID", "PLUS", "EQUAL", "MINUS", "MULT", "DIV", "LPAR", "RPAR", "OP_UNION_SUBSTRUCTION", 
		"OP_INTERSECTION"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CalcSetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalcSet.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\63\n\5"+
		"\r\5\16\5\64\3\5\3\5\3\6\3\6\3\7\6\7<\n\7\r\7\16\7=\3\b\6\bA\n\b\r\b\16"+
		"\bB\3\b\3\b\6\bG\n\b\r\b\16\bH\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\7"+
		"\fT\n\f\f\f\16\fW\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\5\24i\n\24\3\25\3\25\2\2\26\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26\3\2\6\5\2\13\13\17\17\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\2q\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7"+
		"/\3\2\2\2\t\62\3\2\2\2\138\3\2\2\2\r;\3\2\2\2\17@\3\2\2\2\21J\3\2\2\2"+
		"\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35\\\3\2"+
		"\2\2\37^\3\2\2\2!`\3\2\2\2#b\3\2\2\2%d\3\2\2\2\'h\3\2\2\2)j\3\2\2\2+,"+
		"\7}\2\2,\4\3\2\2\2-.\7\177\2\2.\6\3\2\2\2/\60\7.\2\2\60\b\3\2\2\2\61\63"+
		"\t\2\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66"+
		"\3\2\2\2\66\67\b\5\2\2\67\n\3\2\2\289\7\f\2\29\f\3\2\2\2:<\t\3\2\2;:\3"+
		"\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\16\3\2\2\2?A\t\3\2\2@?\3\2\2\2A"+
		"B\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\7\60\2\2EG\t\3\2\2FE\3\2\2\2"+
		"GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\20\3\2\2\2JK\7r\2\2KL\7k\2\2L\22\3\2\2"+
		"\2MN\7g\2\2N\24\3\2\2\2OP\7`\2\2P\26\3\2\2\2QU\t\4\2\2RT\t\5\2\2SR\3\2"+
		"\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\30\3\2\2\2WU\3\2\2\2XY\7-\2\2Y\32"+
		"\3\2\2\2Z[\7?\2\2[\34\3\2\2\2\\]\7/\2\2]\36\3\2\2\2^_\7,\2\2_ \3\2\2\2"+
		"`a\7\61\2\2a\"\3\2\2\2bc\7*\2\2c$\3\2\2\2de\7+\2\2e&\3\2\2\2fi\7%\2\2"+
		"gi\5!\21\2hf\3\2\2\2hg\3\2\2\2i(\3\2\2\2jk\5\37\20\2k*\3\2\2\2\t\2\64"+
		"=BHUh\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}