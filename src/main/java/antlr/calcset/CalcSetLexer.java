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
		ASSIGN=18, PLUS=19, MINUS=20, MULT=21, DIV=22, POW=23, BIT_INVERS=24, 
		BIT_XOR=25, BIT_LEFT=26, BIT_RIGHT=27, BIT_RIGHTU=28, GR=29, GRE=30, LS=31, 
		LSE=32, EQUAL=33, NEQUAL=34, AND=35, OR=36, NOT=37, IMPLICATION=38, NAND=39, 
		NOR=40, XOR=41, XNOR=42, INTERSECTION=43, UNION=44, COMPLEMENTS=45, SUBSET=46, 
		COMPLEMENT_SET=47, DISJUNCTIVE_UNION=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "WS", "NL", "INT", 
		"DOUBLE", "MATH_PI", "MATH_E", "TRUE", "FALSE", "ID", "STRING", "ASSIGN", 
		"PLUS", "MINUS", "MULT", "DIV", "POW", "BIT_INVERS", "BIT_XOR", "BIT_LEFT", 
		"BIT_RIGHT", "BIT_RIGHTU", "GR", "GRE", "LS", "LSE", "EQUAL", "NEQUAL", 
		"AND", "OR", "NOT", "IMPLICATION", "NAND", "NOR", "XOR", "XNOR", "INTERSECTION", 
		"UNION", "COMPLEMENTS", "SUBSET", "COMPLEMENT_SET", "DISJUNCTIVE_UNION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "','", null, "'\n'", null, 
		null, "'_pi'", "'_e'", "'true'", "'false'", null, null, "'='", "'+'", 
		"'-'", "'*'", "'/'", "'**'", "'~'", "'^'", "'<<'", "'>>'", "'>>>'", "'>'", 
		"'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'->'", 
		"'!&'", "'!|'", "'X|'", "'X!'", "'&'", "'|'", "'\\'", "'@'", "'''", "'/\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "WS", "NL", "INT", "DOUBLE", 
		"MATH_PI", "MATH_E", "TRUE", "FALSE", "ID", "STRING", "ASSIGN", "PLUS", 
		"MINUS", "MULT", "DIV", "POW", "BIT_INVERS", "BIT_XOR", "BIT_LEFT", "BIT_RIGHT", 
		"BIT_RIGHTU", "GR", "GRE", "LS", "LSE", "EQUAL", "NEQUAL", "AND", "OR", 
		"NOT", "IMPLICATION", "NAND", "NOR", "XOR", "XNOR", "INTERSECTION", "UNION", 
		"COMPLEMENTS", "SUBSET", "COMPLEMENT_SET", "DISJUNCTIVE_UNION"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u00fb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\ts\n\t\r\t\16\tt\3\t\3\t\3\n\3"+
		"\n\3\13\6\13|\n\13\r\13\16\13}\3\f\6\f\u0081\n\f\r\f\16\f\u0082\3\f\3"+
		"\f\6\f\u0087\n\f\r\f\16\f\u0088\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21\u009f"+
		"\n\21\f\21\16\21\u00a2\13\21\3\22\3\22\7\22\u00a6\n\22\f\22\16\22\u00a9"+
		"\13\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\2\2\62\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\7\5\2\13\13\17\17\"\"\3\2\62"+
		";\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\2\u0100\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5"+
		"e\3\2\2\2\7g\3\2\2\2\ti\3\2\2\2\13k\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21"+
		"r\3\2\2\2\23x\3\2\2\2\25{\3\2\2\2\27\u0080\3\2\2\2\31\u008a\3\2\2\2\33"+
		"\u008e\3\2\2\2\35\u0091\3\2\2\2\37\u0096\3\2\2\2!\u009c\3\2\2\2#\u00a3"+
		"\3\2\2\2%\u00ac\3\2\2\2\'\u00ae\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2"+
		"-\u00b4\3\2\2\2/\u00b6\3\2\2\2\61\u00b9\3\2\2\2\63\u00bb\3\2\2\2\65\u00bd"+
		"\3\2\2\2\67\u00c0\3\2\2\29\u00c3\3\2\2\2;\u00c7\3\2\2\2=\u00c9\3\2\2\2"+
		"?\u00cc\3\2\2\2A\u00ce\3\2\2\2C\u00d1\3\2\2\2E\u00d4\3\2\2\2G\u00d7\3"+
		"\2\2\2I\u00da\3\2\2\2K\u00dd\3\2\2\2M\u00df\3\2\2\2O\u00e2\3\2\2\2Q\u00e5"+
		"\3\2\2\2S\u00e8\3\2\2\2U\u00eb\3\2\2\2W\u00ee\3\2\2\2Y\u00f0\3\2\2\2["+
		"\u00f2\3\2\2\2]\u00f4\3\2\2\2_\u00f6\3\2\2\2a\u00f8\3\2\2\2cd\7*\2\2d"+
		"\4\3\2\2\2ef\7+\2\2f\6\3\2\2\2gh\7}\2\2h\b\3\2\2\2ij\7\177\2\2j\n\3\2"+
		"\2\2kl\7]\2\2l\f\3\2\2\2mn\7_\2\2n\16\3\2\2\2op\7.\2\2p\20\3\2\2\2qs\t"+
		"\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\t\2\2w\22"+
		"\3\2\2\2xy\7\f\2\2y\24\3\2\2\2z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\26\3\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\7\60\2\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\30\3\2\2\2\u008a"+
		"\u008b\7a\2\2\u008b\u008c\7r\2\2\u008c\u008d\7k\2\2\u008d\32\3\2\2\2\u008e"+
		"\u008f\7a\2\2\u008f\u0090\7g\2\2\u0090\34\3\2\2\2\u0091\u0092\7v\2\2\u0092"+
		"\u0093\7t\2\2\u0093\u0094\7w\2\2\u0094\u0095\7g\2\2\u0095\36\3\2\2\2\u0096"+
		"\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2"+
		"\u009a\u009b\7g\2\2\u009b \3\2\2\2\u009c\u00a0\t\4\2\2\u009d\u009f\t\5"+
		"\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a7\7$\2\2"+
		"\u00a4\u00a6\n\6\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7$\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad&\3\2\2\2\u00ae\u00af"+
		"\7-\2\2\u00af(\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7"+
		",\2\2\u00b3,\3\2\2\2\u00b4\u00b5\7\61\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7"+
		",\2\2\u00b7\u00b8\7,\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7\u0080\2\2\u00ba"+
		"\62\3\2\2\2\u00bb\u00bc\7`\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7>\2\2\u00be"+
		"\u00bf\7>\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1\u00c2\7@\2\2\u00c2"+
		"8\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4\u00c5\7@\2\2\u00c5\u00c6\7@\2\2\u00c6"+
		":\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8<\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd@\3\2\2\2\u00ce\u00cf\7"+
		">\2\2\u00cf\u00d0\7?\2\2\u00d0B\3\2\2\2\u00d1\u00d2\7?\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3D\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\7?\2\2\u00d6F\3"+
		"\2\2\2\u00d7\u00d8\7(\2\2\u00d8\u00d9\7(\2\2\u00d9H\3\2\2\2\u00da\u00db"+
		"\7~\2\2\u00db\u00dc\7~\2\2\u00dcJ\3\2\2\2\u00dd\u00de\7#\2\2\u00deL\3"+
		"\2\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1\7@\2\2\u00e1N\3\2\2\2\u00e2\u00e3"+
		"\7#\2\2\u00e3\u00e4\7(\2\2\u00e4P\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e7"+
		"\7~\2\2\u00e7R\3\2\2\2\u00e8\u00e9\7Z\2\2\u00e9\u00ea\7~\2\2\u00eaT\3"+
		"\2\2\2\u00eb\u00ec\7Z\2\2\u00ec\u00ed\7#\2\2\u00edV\3\2\2\2\u00ee\u00ef"+
		"\7(\2\2\u00efX\3\2\2\2\u00f0\u00f1\7~\2\2\u00f1Z\3\2\2\2\u00f2\u00f3\7"+
		"^\2\2\u00f3\\\3\2\2\2\u00f4\u00f5\7B\2\2\u00f5^\3\2\2\2\u00f6\u00f7\7"+
		")\2\2\u00f7`\3\2\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\7^\2\2\u00fab\3"+
		"\2\2\2\t\2t}\u0082\u0088\u00a0\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}