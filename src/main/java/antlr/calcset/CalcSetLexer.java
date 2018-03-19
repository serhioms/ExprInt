// Generated from gramma/CalcSet.g4 by ANTLR 4.7.1
package antlr.calcset;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, NL=7, INT=8, DOUBLE=9, MATH_PI=10, 
		MATH_E=11, UNIVERSAL_SET=12, TRUE=13, FALSE=14, ID=15, STRING=16, ASSIGN=17, 
		PLUS=18, MINUS=19, MULT=20, DIV=21, POW=22, BIT_INVERS=23, BIT_XOR=24, 
		BIT_LEFT=25, BIT_RIGHT=26, BIT_RIGHTU=27, GR=28, GRE=29, LS=30, LSE=31, 
		EQUAL=32, NEQUAL=33, AND=34, OR=35, NOT=36, IMPLICATION=37, NAND=38, NOR=39, 
		XOR=40, XNOR=41, CARDINALITY=42, INTERSECTION=43, UNION=44, COMPLEMENTS=45, 
		SUBSET=46, COMPLEMENT_SET=47, DISJUNCTIVE_UNION=48, LPAR=49, RPAR=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "WS", "NL", "INT", "DOUBLE", "MATH_PI", 
		"MATH_E", "UNIVERSAL_SET", "TRUE", "FALSE", "ID", "STRING", "ASSIGN", 
		"PLUS", "MINUS", "MULT", "DIV", "POW", "BIT_INVERS", "BIT_XOR", "BIT_LEFT", 
		"BIT_RIGHT", "BIT_RIGHTU", "GR", "GRE", "LS", "LSE", "EQUAL", "NEQUAL", 
		"AND", "OR", "NOT", "IMPLICATION", "NAND", "NOR", "XOR", "XNOR", "CARDINALITY", 
		"INTERSECTION", "UNION", "COMPLEMENTS", "SUBSET", "COMPLEMENT_SET", "DISJUNCTIVE_UNION", 
		"LPAR", "RPAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "','", null, "'\n'", null, null, "'_pi'", 
		"'_e'", "'_u'", "'true'", "'false'", null, null, "'='", "'+'", "'-'", 
		"'*'", "'/'", "'**'", "'~'", "'^'", "'<<'", "'>>'", "'>>>'", "'>'", "'>='", 
		"'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'->'", "'!&'", 
		"'!|'", "'X|'", "'X!'", "'#'", "'&'", "'|'", "'\\'", "'@'", "'''", "'/\\'", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "WS", "NL", "INT", "DOUBLE", "MATH_PI", 
		"MATH_E", "UNIVERSAL_SET", "TRUE", "FALSE", "ID", "STRING", "ASSIGN", 
		"PLUS", "MINUS", "MULT", "DIV", "POW", "BIT_INVERS", "BIT_XOR", "BIT_LEFT", 
		"BIT_RIGHT", "BIT_RIGHTU", "GR", "GRE", "LS", "LSE", "EQUAL", "NEQUAL", 
		"AND", "OR", "NOT", "IMPLICATION", "NAND", "NOR", "XOR", "XNOR", "CARDINALITY", 
		"INTERSECTION", "UNION", "COMPLEMENTS", "SUBSET", "COMPLEMENT_SET", "DISJUNCTIVE_UNION", 
		"LPAR", "RPAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0104\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7s\n\7\r\7\16\7t\3\7\3\7\3"+
		"\b\3\b\3\t\6\t|\n\t\r\t\16\t}\3\n\6\n\u0081\n\n\r\n\16\n\u0082\3\n\3\n"+
		"\6\n\u0087\n\n\r\n\16\n\u0088\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\7\20\u00a2\n\20\f\20\16\20\u00a5\13\20\3\21\3\21\7\21\u00a9\n\21\f\21"+
		"\16\21\u00ac\13\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64\3\2\7\5\2\13\13\17\17\"\"\3\2\62;\5\2C\\aac|\6\2"+
		"\62;C\\aac|\5\2\f\f\17\17$$\2\u0109\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2"+
		"\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rr\3\2\2\2\17x\3\2\2"+
		"\2\21{\3\2\2\2\23\u0080\3\2\2\2\25\u008a\3\2\2\2\27\u008e\3\2\2\2\31\u0091"+
		"\3\2\2\2\33\u0094\3\2\2\2\35\u0099\3\2\2\2\37\u009f\3\2\2\2!\u00a6\3\2"+
		"\2\2#\u00af\3\2\2\2%\u00b1\3\2\2\2\'\u00b3\3\2\2\2)\u00b5\3\2\2\2+\u00b7"+
		"\3\2\2\2-\u00b9\3\2\2\2/\u00bc\3\2\2\2\61\u00be\3\2\2\2\63\u00c0\3\2\2"+
		"\2\65\u00c3\3\2\2\2\67\u00c6\3\2\2\29\u00ca\3\2\2\2;\u00cc\3\2\2\2=\u00cf"+
		"\3\2\2\2?\u00d1\3\2\2\2A\u00d4\3\2\2\2C\u00d7\3\2\2\2E\u00da\3\2\2\2G"+
		"\u00dd\3\2\2\2I\u00e0\3\2\2\2K\u00e2\3\2\2\2M\u00e5\3\2\2\2O\u00e8\3\2"+
		"\2\2Q\u00eb\3\2\2\2S\u00ee\3\2\2\2U\u00f1\3\2\2\2W\u00f3\3\2\2\2Y\u00f5"+
		"\3\2\2\2[\u00f7\3\2\2\2]\u00f9\3\2\2\2_\u00fb\3\2\2\2a\u00fd\3\2\2\2c"+
		"\u0100\3\2\2\2e\u0102\3\2\2\2gh\7}\2\2h\4\3\2\2\2ij\7\177\2\2j\6\3\2\2"+
		"\2kl\7]\2\2l\b\3\2\2\2mn\7_\2\2n\n\3\2\2\2op\7.\2\2p\f\3\2\2\2qs\t\2\2"+
		"\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\7\2\2w\16\3\2"+
		"\2\2xy\7\f\2\2y\20\3\2\2\2z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\22\3\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\7\60\2\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\24\3\2\2\2\u008a"+
		"\u008b\7a\2\2\u008b\u008c\7r\2\2\u008c\u008d\7k\2\2\u008d\26\3\2\2\2\u008e"+
		"\u008f\7a\2\2\u008f\u0090\7g\2\2\u0090\30\3\2\2\2\u0091\u0092\7a\2\2\u0092"+
		"\u0093\7w\2\2\u0093\32\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096"+
		"\u0097\7w\2\2\u0097\u0098\7g\2\2\u0098\34\3\2\2\2\u0099\u009a\7h\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2"+
		"\u009e\36\3\2\2\2\u009f\u00a3\t\4\2\2\u00a0\u00a2\t\5\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		" \3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00aa\7$\2\2\u00a7\u00a9\n\6\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7$\2\2\u00ae"+
		"\"\3\2\2\2\u00af\u00b0\7?\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7-\2\2\u00b2"+
		"&\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6*"+
		"\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8,\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba"+
		"\u00bb\7,\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7\u0080\2\2\u00bd\60\3\2\2\2"+
		"\u00be\u00bf\7`\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2\7"+
		">\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4\u00c5\7@\2\2\u00c5\66"+
		"\3\2\2\2\u00c6\u00c7\7@\2\2\u00c7\u00c8\7@\2\2\u00c8\u00c9\7@\2\2\u00c9"+
		"8\3\2\2\2\u00ca\u00cb\7@\2\2\u00cb:\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce<\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7"+
		">\2\2\u00d2\u00d3\7?\2\2\u00d3@\3\2\2\2\u00d4\u00d5\7?\2\2\u00d5\u00d6"+
		"\7?\2\2\u00d6B\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9\7?\2\2\u00d9D\3"+
		"\2\2\2\u00da\u00db\7(\2\2\u00db\u00dc\7(\2\2\u00dcF\3\2\2\2\u00dd\u00de"+
		"\7~\2\2\u00de\u00df\7~\2\2\u00dfH\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1J\3"+
		"\2\2\2\u00e2\u00e3\7/\2\2\u00e3\u00e4\7@\2\2\u00e4L\3\2\2\2\u00e5\u00e6"+
		"\7#\2\2\u00e6\u00e7\7(\2\2\u00e7N\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea"+
		"\7~\2\2\u00eaP\3\2\2\2\u00eb\u00ec\7Z\2\2\u00ec\u00ed\7~\2\2\u00edR\3"+
		"\2\2\2\u00ee\u00ef\7Z\2\2\u00ef\u00f0\7#\2\2\u00f0T\3\2\2\2\u00f1\u00f2"+
		"\7%\2\2\u00f2V\3\2\2\2\u00f3\u00f4\7(\2\2\u00f4X\3\2\2\2\u00f5\u00f6\7"+
		"~\2\2\u00f6Z\3\2\2\2\u00f7\u00f8\7^\2\2\u00f8\\\3\2\2\2\u00f9\u00fa\7"+
		"B\2\2\u00fa^\3\2\2\2\u00fb\u00fc\7)\2\2\u00fc`\3\2\2\2\u00fd\u00fe\7\61"+
		"\2\2\u00fe\u00ff\7^\2\2\u00ffb\3\2\2\2\u0100\u0101\7*\2\2\u0101d\3\2\2"+
		"\2\u0102\u0103\7+\2\2\u0103f\3\2\2\2\t\2t}\u0082\u0088\u00a3\u00aa\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}