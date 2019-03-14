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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8, NL=9, INT=10, 
		DOUBLE=11, MATH_PI=12, MATH_E=13, TRUE=14, FALSE=15, ID=16, STRING=17, 
		WILDCARD=18, ASSIGN=19, PLUS=20, MINUS=21, MULT=22, DIV=23, POW=24, BIT_INVERS=25, 
		BIT_XOR=26, BIT_LEFT=27, BIT_RIGHT=28, BIT_RIGHTU=29, GR=30, GRE=31, LS=32, 
		LSE=33, EQUAL=34, NEQUAL=35, AND=36, OR=37, NOT=38, IMPLICATION=39, NAND=40, 
		NOR=41, XOR=42, XNOR=43, INTERSECTION=44, UNION=45, COMPLEMENTS=46, SUBSET=47, 
		COMPLEMENT_SET=48, DISJUNCTIVE_UNION=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "WS", "NL", "INT", 
		"DOUBLE", "MATH_PI", "MATH_E", "TRUE", "FALSE", "ID", "STRING", "WILDCARD", 
		"ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "POW", "BIT_INVERS", "BIT_XOR", 
		"BIT_LEFT", "BIT_RIGHT", "BIT_RIGHTU", "GR", "GRE", "LS", "LSE", "EQUAL", 
		"NEQUAL", "AND", "OR", "NOT", "IMPLICATION", "NAND", "NOR", "XOR", "XNOR", 
		"INTERSECTION", "UNION", "COMPLEMENTS", "SUBSET", "COMPLEMENT_SET", "DISJUNCTIVE_UNION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "','", null, "'\n'", null, 
		null, "'_pi'", "'_e'", "'true'", "'false'", null, null, "'?'", "'='", 
		"'+'", "'-'", "'*'", "'/'", "'**'", "'~'", "'^'", "'<<'", "'>>'", "'>>>'", 
		"'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'->'", 
		"'!&'", "'!|'", "'X|'", "'X!'", "'&'", "'|'", "'\\'", "'@'", "'''", "'/\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "WS", "NL", "INT", "DOUBLE", 
		"MATH_PI", "MATH_E", "TRUE", "FALSE", "ID", "STRING", "WILDCARD", "ASSIGN", 
		"PLUS", "MINUS", "MULT", "DIV", "POW", "BIT_INVERS", "BIT_XOR", "BIT_LEFT", 
		"BIT_RIGHT", "BIT_RIGHTU", "GR", "GRE", "LS", "LSE", "EQUAL", "NEQUAL", 
		"AND", "OR", "NOT", "IMPLICATION", "NAND", "NOR", "XOR", "XNOR", "INTERSECTION", 
		"UNION", "COMPLEMENTS", "SUBSET", "COMPLEMENT_SET", "DISJUNCTIVE_UNION"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u00ff\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\tu\n\t\r\t\16\tv\3\t"+
		"\3\t\3\n\3\n\3\13\6\13~\n\13\r\13\16\13\177\3\f\6\f\u0083\n\f\r\f\16\f"+
		"\u0084\3\f\3\f\6\f\u0089\n\f\r\f\16\f\u008a\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\7\21\u00a1\n\21\f\21\16\21\u00a4\13\21\3\22\3\22\7\22\u00a8\n\22\f\22"+
		"\16\22\u00ab\13\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3"+
		"*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\7\5"+
		"\2\13\13\17\17\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\2"+
		"\u0104\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13"+
		"m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21t\3\2\2\2\23z\3\2\2\2\25}\3\2\2\2\27"+
		"\u0082\3\2\2\2\31\u008c\3\2\2\2\33\u0090\3\2\2\2\35\u0093\3\2\2\2\37\u0098"+
		"\3\2\2\2!\u009e\3\2\2\2#\u00a5\3\2\2\2%\u00ae\3\2\2\2\'\u00b0\3\2\2\2"+
		")\u00b2\3\2\2\2+\u00b4\3\2\2\2-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61\u00ba"+
		"\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67\u00c1\3\2\2\29\u00c4\3\2"+
		"\2\2;\u00c7\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00d0\3\2\2\2C\u00d2"+
		"\3\2\2\2E\u00d5\3\2\2\2G\u00d8\3\2\2\2I\u00db\3\2\2\2K\u00de\3\2\2\2M"+
		"\u00e1\3\2\2\2O\u00e3\3\2\2\2Q\u00e6\3\2\2\2S\u00e9\3\2\2\2U\u00ec\3\2"+
		"\2\2W\u00ef\3\2\2\2Y\u00f2\3\2\2\2[\u00f4\3\2\2\2]\u00f6\3\2\2\2_\u00f8"+
		"\3\2\2\2a\u00fa\3\2\2\2c\u00fc\3\2\2\2ef\7*\2\2f\4\3\2\2\2gh\7+\2\2h\6"+
		"\3\2\2\2ij\7}\2\2j\b\3\2\2\2kl\7\177\2\2l\n\3\2\2\2mn\7]\2\2n\f\3\2\2"+
		"\2op\7_\2\2p\16\3\2\2\2qr\7.\2\2r\20\3\2\2\2su\t\2\2\2ts\3\2\2\2uv\3\2"+
		"\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\t\2\2y\22\3\2\2\2z{\7\f\2\2{\24"+
		"\3\2\2\2|~\t\3\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\26\3\2\2\2\u0081\u0083\t\3\2\2\u0082\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0088\7\60\2\2\u0087\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\30\3\2\2\2\u008c"+
		"\u008d\7a\2\2\u008d\u008e\7r\2\2\u008e\u008f\7k\2\2\u008f\32\3\2\2\2\u0090"+
		"\u0091\7a\2\2\u0091\u0092\7g\2\2\u0092\34\3\2\2\2\u0093\u0094\7v\2\2\u0094"+
		"\u0095\7t\2\2\u0095\u0096\7w\2\2\u0096\u0097\7g\2\2\u0097\36\3\2\2\2\u0098"+
		"\u0099\7h\2\2\u0099\u009a\7c\2\2\u009a\u009b\7n\2\2\u009b\u009c\7u\2\2"+
		"\u009c\u009d\7g\2\2\u009d \3\2\2\2\u009e\u00a2\t\4\2\2\u009f\u00a1\t\5"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a9\7$\2\2"+
		"\u00a6\u00a8\n\6\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\7$\2\2\u00ad$\3\2\2\2\u00ae\u00af\7A\2\2\u00af&\3\2\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7-\2\2\u00b3*\3\2\2\2\u00b4\u00b5\7"+
		"/\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7\61"+
		"\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bc\7,\2\2\u00bc\62\3"+
		"\2\2\2\u00bd\u00be\7\u0080\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7`\2\2\u00c0"+
		"\66\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7>\2\2\u00c38\3\2\2\2\u00c4"+
		"\u00c5\7@\2\2\u00c5\u00c6\7@\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8"+
		"\u00c9\7@\2\2\u00c9\u00ca\7@\2\2\u00ca<\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc"+
		">\3\2\2\2\u00cd\u00ce\7@\2\2\u00ce\u00cf\7?\2\2\u00cf@\3\2\2\2\u00d0\u00d1"+
		"\7>\2\2\u00d1B\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7?\2\2\u00d4D\3"+
		"\2\2\2\u00d5\u00d6\7?\2\2\u00d6\u00d7\7?\2\2\u00d7F\3\2\2\2\u00d8\u00d9"+
		"\7#\2\2\u00d9\u00da\7?\2\2\u00daH\3\2\2\2\u00db\u00dc\7(\2\2\u00dc\u00dd"+
		"\7(\2\2\u00ddJ\3\2\2\2\u00de\u00df\7~\2\2\u00df\u00e0\7~\2\2\u00e0L\3"+
		"\2\2\2\u00e1\u00e2\7#\2\2\u00e2N\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5"+
		"\7@\2\2\u00e5P\3\2\2\2\u00e6\u00e7\7#\2\2\u00e7\u00e8\7(\2\2\u00e8R\3"+
		"\2\2\2\u00e9\u00ea\7#\2\2\u00ea\u00eb\7~\2\2\u00ebT\3\2\2\2\u00ec\u00ed"+
		"\7Z\2\2\u00ed\u00ee\7~\2\2\u00eeV\3\2\2\2\u00ef\u00f0\7Z\2\2\u00f0\u00f1"+
		"\7#\2\2\u00f1X\3\2\2\2\u00f2\u00f3\7(\2\2\u00f3Z\3\2\2\2\u00f4\u00f5\7"+
		"~\2\2\u00f5\\\3\2\2\2\u00f6\u00f7\7^\2\2\u00f7^\3\2\2\2\u00f8\u00f9\7"+
		"B\2\2\u00f9`\3\2\2\2\u00fa\u00fb\7)\2\2\u00fbb\3\2\2\2\u00fc\u00fd\7\61"+
		"\2\2\u00fd\u00fe\7^\2\2\u00fed\3\2\2\2\t\2v\177\u0084\u008a\u00a2\u00a9"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}