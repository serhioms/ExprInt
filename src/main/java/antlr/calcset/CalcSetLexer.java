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
		T__0=1, T__1=2, T__2=3, WS=4, NL=5, INT=6, DOUBLE=7, MATH_PI=8, MATH_E=9, 
		UNIVERSAL_SET=10, TRUE=11, FALSE=12, ID=13, STRING=14, ASSIGN=15, PLUS=16, 
		MINUS=17, MULT=18, DIV=19, POW=20, BIT_INVERS=21, BIT_XOR=22, BIT_LEFT=23, 
		BIT_RIGHT=24, BIT_RIGHTU=25, GR=26, GRE=27, LS=28, LSE=29, EQUAL=30, NEQUAL=31, 
		AND=32, OR=33, NOT=34, IMPLICATION=35, NAND=36, NOR=37, XOR=38, XNOR=39, 
		CARDINALITY=40, INTERSECTION=41, UNION=42, COMPLEMENTS=43, SUBSET=44, 
		COMPLEMENT_SET=45, DISJUNCTIVE_UNION=46, LPAR=47, RPAR=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "WS", "NL", "INT", "DOUBLE", "MATH_PI", "MATH_E", 
		"UNIVERSAL_SET", "TRUE", "FALSE", "ID", "STRING", "ASSIGN", "PLUS", "MINUS", 
		"MULT", "DIV", "POW", "BIT_INVERS", "BIT_XOR", "BIT_LEFT", "BIT_RIGHT", 
		"BIT_RIGHTU", "GR", "GRE", "LS", "LSE", "EQUAL", "NEQUAL", "AND", "OR", 
		"NOT", "IMPLICATION", "NAND", "NOR", "XOR", "XNOR", "CARDINALITY", "INTERSECTION", 
		"UNION", "COMPLEMENTS", "SUBSET", "COMPLEMENT_SET", "DISJUNCTIVE_UNION", 
		"LPAR", "RPAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", null, "'\n'", null, null, "'_pi'", "'_e'", 
		"'_u'", "'true'", "'false'", null, null, "'='", "'+'", "'-'", "'*'", "'/'", 
		"'**'", "'~'", "'^'", "'<<'", "'>>'", "'>>>'", "'>'", "'>='", "'<'", "'<='", 
		"'=='", "'!='", "'&&'", "'||'", "'!'", "'->'", "'!&'", "'!|'", "'X|'", 
		"'X!'", "'#'", "'&'", "'|'", "'\\'", "'@'", "'''", "'/\\'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WS", "NL", "INT", "DOUBLE", "MATH_PI", "MATH_E", 
		"UNIVERSAL_SET", "TRUE", "FALSE", "ID", "STRING", "ASSIGN", "PLUS", "MINUS", 
		"MULT", "DIV", "POW", "BIT_INVERS", "BIT_XOR", "BIT_LEFT", "BIT_RIGHT", 
		"BIT_RIGHTU", "GR", "GRE", "LS", "LSE", "EQUAL", "NEQUAL", "AND", "OR", 
		"NOT", "IMPLICATION", "NAND", "NOR", "XOR", "XNOR", "CARDINALITY", "INTERSECTION", 
		"UNION", "COMPLEMENTS", "SUBSET", "COMPLEMENT_SET", "DISJUNCTIVE_UNION", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u00fc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\6\5k\n\5\r\5\16\5l\3\5\3\5\3\6\3\6\3\7\6\7t\n\7\r\7\16\7u\3\b\6\b"+
		"y\n\b\r\b\16\bz\3\b\3\b\6\b\177\n\b\r\b\16\b\u0080\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\7\16\u009a\n\16\f\16\16\16\u009d\13\16\3\17\3\17\7\17\u00a1\n"+
		"\17\f\17\16\17\u00a4\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62\3\2\7\5\2\13\13\17\17\"\"\3\2\62;\5\2C\\aac|\6\2"+
		"\62;C\\aac|\5\2\f\f\17\17$$\2\u0101\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2"+
		"\2\2\tj\3\2\2\2\13p\3\2\2\2\rs\3\2\2\2\17x\3\2\2\2\21\u0082\3\2\2\2\23"+
		"\u0086\3\2\2\2\25\u0089\3\2\2\2\27\u008c\3\2\2\2\31\u0091\3\2\2\2\33\u0097"+
		"\3\2\2\2\35\u009e\3\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2#\u00ab\3\2\2"+
		"\2%\u00ad\3\2\2\2\'\u00af\3\2\2\2)\u00b1\3\2\2\2+\u00b4\3\2\2\2-\u00b6"+
		"\3\2\2\2/\u00b8\3\2\2\2\61\u00bb\3\2\2\2\63\u00be\3\2\2\2\65\u00c2\3\2"+
		"\2\2\67\u00c4\3\2\2\29\u00c7\3\2\2\2;\u00c9\3\2\2\2=\u00cc\3\2\2\2?\u00cf"+
		"\3\2\2\2A\u00d2\3\2\2\2C\u00d5\3\2\2\2E\u00d8\3\2\2\2G\u00da\3\2\2\2I"+
		"\u00dd\3\2\2\2K\u00e0\3\2\2\2M\u00e3\3\2\2\2O\u00e6\3\2\2\2Q\u00e9\3\2"+
		"\2\2S\u00eb\3\2\2\2U\u00ed\3\2\2\2W\u00ef\3\2\2\2Y\u00f1\3\2\2\2[\u00f3"+
		"\3\2\2\2]\u00f5\3\2\2\2_\u00f8\3\2\2\2a\u00fa\3\2\2\2cd\7}\2\2d\4\3\2"+
		"\2\2ef\7\177\2\2f\6\3\2\2\2gh\7.\2\2h\b\3\2\2\2ik\t\2\2\2ji\3\2\2\2kl"+
		"\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\5\2\2o\n\3\2\2\2pq\7\f\2\2"+
		"q\f\3\2\2\2rt\t\3\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\16\3\2"+
		"\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\7\60"+
		"\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\20\3\2\2\2\u0082\u0083\7a\2\2\u0083\u0084\7r\2\2\u0084"+
		"\u0085\7k\2\2\u0085\22\3\2\2\2\u0086\u0087\7a\2\2\u0087\u0088\7g\2\2\u0088"+
		"\24\3\2\2\2\u0089\u008a\7a\2\2\u008a\u008b\7w\2\2\u008b\26\3\2\2\2\u008c"+
		"\u008d\7v\2\2\u008d\u008e\7t\2\2\u008e\u008f\7w\2\2\u008f\u0090\7g\2\2"+
		"\u0090\30\3\2\2\2\u0091\u0092\7h\2\2\u0092\u0093\7c\2\2\u0093\u0094\7"+
		"n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\32\3\2\2\2\u0097\u009b"+
		"\t\4\2\2\u0098\u009a\t\5\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\34\3\2\2\2\u009d\u009b\3\2\2"+
		"\2\u009e\u00a2\7$\2\2\u009f\u00a1\n\6\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7$\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7?\2\2"+
		"\u00a8 \3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7/\2\2"+
		"\u00ac$\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae&\3\2\2\2\u00af\u00b0\7\61\2\2"+
		"\u00b0(\3\2\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b3\7,\2\2\u00b3*\3\2\2\2\u00b4"+
		"\u00b5\7\u0080\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7`\2\2\u00b7.\3\2\2\2\u00b8"+
		"\u00b9\7>\2\2\u00b9\u00ba\7>\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc"+
		"\u00bd\7@\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7@\2\2\u00c0"+
		"\u00c1\7@\2\2\u00c1\64\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3\66\3\2\2\2\u00c4"+
		"\u00c5\7@\2\2\u00c5\u00c6\7?\2\2\u00c68\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8"+
		":\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\u00cb\7?\2\2\u00cb<\3\2\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cd\u00ce\7?\2\2\u00ce>\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1@\3\2\2\2\u00d2\u00d3\7(\2\2\u00d3\u00d4\7(\2\2\u00d4B\3"+
		"\2\2\2\u00d5\u00d6\7~\2\2\u00d6\u00d7\7~\2\2\u00d7D\3\2\2\2\u00d8\u00d9"+
		"\7#\2\2\u00d9F\3\2\2\2\u00da\u00db\7/\2\2\u00db\u00dc\7@\2\2\u00dcH\3"+
		"\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df\7(\2\2\u00dfJ\3\2\2\2\u00e0\u00e1"+
		"\7#\2\2\u00e1\u00e2\7~\2\2\u00e2L\3\2\2\2\u00e3\u00e4\7Z\2\2\u00e4\u00e5"+
		"\7~\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7Z\2\2\u00e7\u00e8\7#\2\2\u00e8P\3"+
		"\2\2\2\u00e9\u00ea\7%\2\2\u00eaR\3\2\2\2\u00eb\u00ec\7(\2\2\u00ecT\3\2"+
		"\2\2\u00ed\u00ee\7~\2\2\u00eeV\3\2\2\2\u00ef\u00f0\7^\2\2\u00f0X\3\2\2"+
		"\2\u00f1\u00f2\7B\2\2\u00f2Z\3\2\2\2\u00f3\u00f4\7)\2\2\u00f4\\\3\2\2"+
		"\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\7^\2\2\u00f7^\3\2\2\2\u00f8\u00f9"+
		"\7*\2\2\u00f9`\3\2\2\2\u00fa\u00fb\7+\2\2\u00fbb\3\2\2\2\t\2luz\u0080"+
		"\u009b\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}