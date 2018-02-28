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
		T__0=1, T__1=2, T__2=3, WS=4, NL=5, INT=6, DOUBLE=7, PI=8, E=9, TRUE=10, 
		FALSE=11, POW=12, ID=13, STRING=14, PLUS=15, ASSIGN=16, AND=17, OR=18, 
		COMPLEMENTS=19, EQUAL=20, NEQUAL=21, IMPLICATION=22, NOT=23, MINUS=24, 
		MULT=25, SUBSET=26, CARDINALITY=27, DIV=28, LPAR=29, RPAR=30, OP_UNION_SUBSTRUCTION=31, 
		OP_INTERSECTION=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "WS", "NL", "INT", "DOUBLE", "PI", "E", "TRUE", 
		"FALSE", "POW", "ID", "STRING", "PLUS", "ASSIGN", "AND", "OR", "COMPLEMENTS", 
		"EQUAL", "NEQUAL", "IMPLICATION", "NOT", "MINUS", "MULT", "SUBSET", "CARDINALITY", 
		"DIV", "LPAR", "RPAR", "OP_UNION_SUBSTRUCTION", "OP_INTERSECTION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", null, "'\n'", null, null, "'_pi'", "'_e'", 
		"'true'", "'false'", "'^'", null, null, "'+'", "'='", "'&'", "'|'", "'\\'", 
		"'=='", "'!='", "'->'", "'!'", "'-'", "'*'", "'@'", "'#'", "'/'", "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WS", "NL", "INT", "DOUBLE", "PI", "E", "TRUE", 
		"FALSE", "POW", "ID", "STRING", "PLUS", "ASSIGN", "AND", "OR", "COMPLEMENTS", 
		"EQUAL", "NEQUAL", "IMPLICATION", "NOT", "MINUS", "MULT", "SUBSET", "CARDINALITY", 
		"DIV", "LPAR", "RPAR", "OP_UNION_SUBSTRUCTION", "OP_INTERSECTION"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00af\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5K\n\5\r\5\16\5L\3\5\3\5\3\6\3\6\3\7"+
		"\6\7T\n\7\r\7\16\7U\3\b\6\bY\n\b\r\b\16\bZ\3\b\3\b\6\b_\n\b\r\b\16\b`"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\7\16y\n\16\f\16\16\16|\13\16\3\17\3\17\7\17"+
		"\u0080\n\17\f\17\16\17\u0083\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \5 \u00ac\n \3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\7\5\2\13\13\17\17"+
		"\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\2\u00b5\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tJ\3"+
		"\2\2\2\13P\3\2\2\2\rS\3\2\2\2\17X\3\2\2\2\21b\3\2\2\2\23f\3\2\2\2\25i"+
		"\3\2\2\2\27n\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35}\3\2\2\2\37\u0086\3\2"+
		"\2\2!\u0088\3\2\2\2#\u008a\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2)\u0090"+
		"\3\2\2\2+\u0093\3\2\2\2-\u0096\3\2\2\2/\u0099\3\2\2\2\61\u009b\3\2\2\2"+
		"\63\u009d\3\2\2\2\65\u009f\3\2\2\2\67\u00a1\3\2\2\29\u00a3\3\2\2\2;\u00a5"+
		"\3\2\2\2=\u00a7\3\2\2\2?\u00ab\3\2\2\2A\u00ad\3\2\2\2CD\7}\2\2D\4\3\2"+
		"\2\2EF\7\177\2\2F\6\3\2\2\2GH\7.\2\2H\b\3\2\2\2IK\t\2\2\2JI\3\2\2\2KL"+
		"\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\5\2\2O\n\3\2\2\2PQ\7\f\2\2"+
		"Q\f\3\2\2\2RT\t\3\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\16\3\2"+
		"\2\2WY\t\3\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7"+
		"\60\2\2]_\t\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\20\3\2\2\2"+
		"bc\7a\2\2cd\7r\2\2de\7k\2\2e\22\3\2\2\2fg\7a\2\2gh\7g\2\2h\24\3\2\2\2"+
		"ij\7v\2\2jk\7t\2\2kl\7w\2\2lm\7g\2\2m\26\3\2\2\2no\7h\2\2op\7c\2\2pq\7"+
		"n\2\2qr\7u\2\2rs\7g\2\2s\30\3\2\2\2tu\7`\2\2u\32\3\2\2\2vz\t\4\2\2wy\t"+
		"\5\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\34\3\2\2\2|z\3\2\2\2}"+
		"\u0081\7$\2\2~\u0080\n\6\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\7$\2\2\u0085\36\3\2\2\2\u0086\u0087\7-\2\2\u0087 \3\2\2\2\u0088"+
		"\u0089\7?\2\2\u0089\"\3\2\2\2\u008a\u008b\7(\2\2\u008b$\3\2\2\2\u008c"+
		"\u008d\7~\2\2\u008d&\3\2\2\2\u008e\u008f\7^\2\2\u008f(\3\2\2\2\u0090\u0091"+
		"\7?\2\2\u0091\u0092\7?\2\2\u0092*\3\2\2\2\u0093\u0094\7#\2\2\u0094\u0095"+
		"\7?\2\2\u0095,\3\2\2\2\u0096\u0097\7/\2\2\u0097\u0098\7@\2\2\u0098.\3"+
		"\2\2\2\u0099\u009a\7#\2\2\u009a\60\3\2\2\2\u009b\u009c\7/\2\2\u009c\62"+
		"\3\2\2\2\u009d\u009e\7,\2\2\u009e\64\3\2\2\2\u009f\u00a0\7B\2\2\u00a0"+
		"\66\3\2\2\2\u00a1\u00a2\7%\2\2\u00a28\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4"+
		":\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6<\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8>"+
		"\3\2\2\2\u00a9\u00ac\5\37\20\2\u00aa\u00ac\5\61\31\2\u00ab\u00a9\3\2\2"+
		"\2\u00ab\u00aa\3\2\2\2\u00ac@\3\2\2\2\u00ad\u00ae\5\63\32\2\u00aeB\3\2"+
		"\2\2\n\2LUZ`z\u0081\u00ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}