// Generated from gramma/CalcSet.g4 by ANTLR 4.7.1
package antlr.calcset;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcSetParser extends Parser {
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
	public static final int
		RULE_input = 0, RULE_assign = 1, RULE_orand = 2, RULE_equalgrls = 3, RULE_plusminus = 4, 
		RULE_implicationsubset = 5, RULE_multdiv = 6, RULE_uniondisjunctive = 7, 
		RULE_intersectioncomplements = 8, RULE_bit = 9, RULE_power = 10, RULE_unarycomplementsbitinvers = 11, 
		RULE_atom = 12, RULE_expression = 13, RULE_unorderedset = 14, RULE_orderedset = 15, 
		RULE_list = 16;
	public static final String[] ruleNames = {
		"input", "assign", "orand", "equalgrls", "plusminus", "implicationsubset", 
		"multdiv", "uniondisjunctive", "intersectioncomplements", "bit", "power", 
		"unarycomplementsbitinvers", "atom", "expression", "unorderedset", "orderedset", 
		"list"
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

	@Override
	public String getGrammarFileName() { return "CalcSet.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcSetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToAssignContext extends InputContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode NL() { return getToken(CalcSetParser.NL, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ToAssignContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalculateContext extends InputContext {
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public TerminalNode NL() { return getToken(CalcSetParser.NL, 0); }
		public CalculateContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ToAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				assign();
				setState(35);
				match(NL);
				setState(36);
				input();
				}
				break;
			case 2:
				_localctx = new CalculateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				orand(0);
				setState(39);
				match(NL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetVariableContext extends AssignContext {
		public TerminalNode ID() { return getToken(CalcSetParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalcSetParser.ASSIGN, 0); }
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public SetVariableContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitSetVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			_localctx = new SetVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(ID);
			setState(44);
			match(ASSIGN);
			setState(45);
			orand(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrandContext extends ParserRuleContext {
		public OrandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orand; }
	 
		public OrandContext() { }
		public void copyFrom(OrandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NorContext extends OrandContext {
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public TerminalNode NOR() { return getToken(CalcSetParser.NOR, 0); }
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public NorContext(OrandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitNor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XnorContext extends OrandContext {
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public TerminalNode XNOR() { return getToken(CalcSetParser.XNOR, 0); }
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public XnorContext(OrandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitXnor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends OrandContext {
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public TerminalNode OR() { return getToken(CalcSetParser.OR, 0); }
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public OrContext(OrandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends OrandContext {
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public TerminalNode AND() { return getToken(CalcSetParser.AND, 0); }
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public AndContext(OrandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToEqualNotequalContext extends OrandContext {
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public ToEqualNotequalContext(OrandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToEqualNotequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorContext extends OrandContext {
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public TerminalNode XOR() { return getToken(CalcSetParser.XOR, 0); }
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public XorContext(OrandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NandContext extends OrandContext {
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public TerminalNode NAND() { return getToken(CalcSetParser.NAND, 0); }
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public NandContext(OrandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitNand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrandContext orand() throws RecognitionException {
		return orand(0);
	}

	private OrandContext orand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrandContext _localctx = new OrandContext(_ctx, _parentState);
		OrandContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_orand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToEqualNotequalContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(48);
			equalgrls(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new OrContext(new OrandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_orand);
						setState(50);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(51);
						match(OR);
						setState(52);
						equalgrls(0);
						}
						break;
					case 2:
						{
						_localctx = new XorContext(new OrandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_orand);
						setState(53);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(54);
						match(XOR);
						setState(55);
						equalgrls(0);
						}
						break;
					case 3:
						{
						_localctx = new NorContext(new OrandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_orand);
						setState(56);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(57);
						match(NOR);
						setState(58);
						equalgrls(0);
						}
						break;
					case 4:
						{
						_localctx = new XnorContext(new OrandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_orand);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60);
						match(XNOR);
						setState(61);
						equalgrls(0);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new OrandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_orand);
						setState(62);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(63);
						match(AND);
						setState(64);
						equalgrls(0);
						}
						break;
					case 6:
						{
						_localctx = new NandContext(new OrandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_orand);
						setState(65);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(66);
						match(NAND);
						setState(67);
						equalgrls(0);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualgrlsContext extends ParserRuleContext {
		public EqualgrlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalgrls; }
	 
		public EqualgrlsContext() { }
		public void copyFrom(EqualgrlsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToPlusOrMinusContext extends EqualgrlsContext {
		public PlusminusContext plusminus() {
			return getRuleContext(PlusminusContext.class,0);
		}
		public ToPlusOrMinusContext(EqualgrlsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToPlusOrMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualContext extends EqualgrlsContext {
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public TerminalNode GRE() { return getToken(CalcSetParser.GRE, 0); }
		public PlusminusContext plusminus() {
			return getRuleContext(PlusminusContext.class,0);
		}
		public GreaterEqualContext(EqualgrlsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitGreaterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends EqualgrlsContext {
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CalcSetParser.EQUAL, 0); }
		public PlusminusContext plusminus() {
			return getRuleContext(PlusminusContext.class,0);
		}
		public EqualContext(EqualgrlsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NequalContext extends EqualgrlsContext {
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public TerminalNode NEQUAL() { return getToken(CalcSetParser.NEQUAL, 0); }
		public PlusminusContext plusminus() {
			return getRuleContext(PlusminusContext.class,0);
		}
		public NequalContext(EqualgrlsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitNequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualContext extends EqualgrlsContext {
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public TerminalNode LSE() { return getToken(CalcSetParser.LSE, 0); }
		public PlusminusContext plusminus() {
			return getRuleContext(PlusminusContext.class,0);
		}
		public LessEqualContext(EqualgrlsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterContext extends EqualgrlsContext {
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public TerminalNode GR() { return getToken(CalcSetParser.GR, 0); }
		public PlusminusContext plusminus() {
			return getRuleContext(PlusminusContext.class,0);
		}
		public GreaterContext(EqualgrlsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends EqualgrlsContext {
		public EqualgrlsContext equalgrls() {
			return getRuleContext(EqualgrlsContext.class,0);
		}
		public TerminalNode LS() { return getToken(CalcSetParser.LS, 0); }
		public PlusminusContext plusminus() {
			return getRuleContext(PlusminusContext.class,0);
		}
		public LessContext(EqualgrlsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualgrlsContext equalgrls() throws RecognitionException {
		return equalgrls(0);
	}

	private EqualgrlsContext equalgrls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualgrlsContext _localctx = new EqualgrlsContext(_ctx, _parentState);
		EqualgrlsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_equalgrls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToPlusOrMinusContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(74);
			plusminus(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new EqualContext(new EqualgrlsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalgrls);
						setState(76);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(77);
						match(EQUAL);
						setState(78);
						plusminus(0);
						}
						break;
					case 2:
						{
						_localctx = new NequalContext(new EqualgrlsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalgrls);
						setState(79);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(80);
						match(NEQUAL);
						setState(81);
						plusminus(0);
						}
						break;
					case 3:
						{
						_localctx = new GreaterContext(new EqualgrlsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalgrls);
						setState(82);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(83);
						match(GR);
						setState(84);
						plusminus(0);
						}
						break;
					case 4:
						{
						_localctx = new GreaterEqualContext(new EqualgrlsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalgrls);
						setState(85);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(86);
						match(GRE);
						setState(87);
						plusminus(0);
						}
						break;
					case 5:
						{
						_localctx = new LessContext(new EqualgrlsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalgrls);
						setState(88);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(89);
						match(LS);
						setState(90);
						plusminus(0);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new EqualgrlsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalgrls);
						setState(91);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(92);
						match(LSE);
						setState(93);
						plusminus(0);
						}
						break;
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PlusminusContext extends ParserRuleContext {
		public PlusminusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusminus; }
	 
		public PlusminusContext() { }
		public void copyFrom(PlusminusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToImplicationSubsetContext extends PlusminusContext {
		public ImplicationsubsetContext implicationsubset() {
			return getRuleContext(ImplicationsubsetContext.class,0);
		}
		public ToImplicationSubsetContext(PlusminusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToImplicationSubset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends PlusminusContext {
		public PlusminusContext plusminus() {
			return getRuleContext(PlusminusContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CalcSetParser.PLUS, 0); }
		public ImplicationsubsetContext implicationsubset() {
			return getRuleContext(ImplicationsubsetContext.class,0);
		}
		public PlusContext(PlusminusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends PlusminusContext {
		public PlusminusContext plusminus() {
			return getRuleContext(PlusminusContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalcSetParser.MINUS, 0); }
		public ImplicationsubsetContext implicationsubset() {
			return getRuleContext(ImplicationsubsetContext.class,0);
		}
		public MinusContext(PlusminusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusminusContext plusminus() throws RecognitionException {
		return plusminus(0);
	}

	private PlusminusContext plusminus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlusminusContext _localctx = new PlusminusContext(_ctx, _parentState);
		PlusminusContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_plusminus, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToImplicationSubsetContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(100);
			implicationsubset(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new PlusminusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusminus);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						match(PLUS);
						setState(104);
						implicationsubset(0);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new PlusminusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusminus);
						setState(105);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(106);
						match(MINUS);
						setState(107);
						implicationsubset(0);
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ImplicationsubsetContext extends ParserRuleContext {
		public ImplicationsubsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicationsubset; }
	 
		public ImplicationsubsetContext() { }
		public void copyFrom(ImplicationsubsetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToUnionContext extends ImplicationsubsetContext {
		public MultdivContext multdiv() {
			return getRuleContext(MultdivContext.class,0);
		}
		public ToUnionContext(ImplicationsubsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubSetContext extends ImplicationsubsetContext {
		public ImplicationsubsetContext implicationsubset() {
			return getRuleContext(ImplicationsubsetContext.class,0);
		}
		public TerminalNode SUBSET() { return getToken(CalcSetParser.SUBSET, 0); }
		public MultdivContext multdiv() {
			return getRuleContext(MultdivContext.class,0);
		}
		public SubSetContext(ImplicationsubsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitSubSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplicationSetContext extends ImplicationsubsetContext {
		public ImplicationsubsetContext implicationsubset() {
			return getRuleContext(ImplicationsubsetContext.class,0);
		}
		public TerminalNode IMPLICATION() { return getToken(CalcSetParser.IMPLICATION, 0); }
		public MultdivContext multdiv() {
			return getRuleContext(MultdivContext.class,0);
		}
		public ImplicationSetContext(ImplicationsubsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitImplicationSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationsubsetContext implicationsubset() throws RecognitionException {
		return implicationsubset(0);
	}

	private ImplicationsubsetContext implicationsubset(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImplicationsubsetContext _localctx = new ImplicationsubsetContext(_ctx, _parentState);
		ImplicationsubsetContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_implicationsubset, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToUnionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(114);
			multdiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ImplicationSetContext(new ImplicationsubsetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_implicationsubset);
						setState(116);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(117);
						match(IMPLICATION);
						setState(118);
						multdiv(0);
						}
						break;
					case 2:
						{
						_localctx = new SubSetContext(new ImplicationsubsetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_implicationsubset);
						setState(119);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(120);
						match(SUBSET);
						setState(121);
						multdiv(0);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultdivContext extends ParserRuleContext {
		public MultdivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multdiv; }
	 
		public MultdivContext() { }
		public void copyFrom(MultdivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToBitContext extends MultdivContext {
		public UniondisjunctiveContext uniondisjunctive() {
			return getRuleContext(UniondisjunctiveContext.class,0);
		}
		public ToBitContext(MultdivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToBit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends MultdivContext {
		public MultdivContext multdiv() {
			return getRuleContext(MultdivContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CalcSetParser.MULT, 0); }
		public UniondisjunctiveContext uniondisjunctive() {
			return getRuleContext(UniondisjunctiveContext.class,0);
		}
		public MultiplicationContext(MultdivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends MultdivContext {
		public MultdivContext multdiv() {
			return getRuleContext(MultdivContext.class,0);
		}
		public TerminalNode DIV() { return getToken(CalcSetParser.DIV, 0); }
		public UniondisjunctiveContext uniondisjunctive() {
			return getRuleContext(UniondisjunctiveContext.class,0);
		}
		public DivisionContext(MultdivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultdivContext multdiv() throws RecognitionException {
		return multdiv(0);
	}

	private MultdivContext multdiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultdivContext _localctx = new MultdivContext(_ctx, _parentState);
		MultdivContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_multdiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToBitContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(128);
			uniondisjunctive(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new MultdivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multdiv);
						setState(130);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(131);
						match(MULT);
						setState(132);
						uniondisjunctive(0);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new MultdivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multdiv);
						setState(133);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(134);
						match(DIV);
						setState(135);
						uniondisjunctive(0);
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UniondisjunctiveContext extends ParserRuleContext {
		public UniondisjunctiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniondisjunctive; }
	 
		public UniondisjunctiveContext() { }
		public void copyFrom(UniondisjunctiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToIntersectionComplementsContext extends UniondisjunctiveContext {
		public IntersectioncomplementsContext intersectioncomplements() {
			return getRuleContext(IntersectioncomplementsContext.class,0);
		}
		public ToIntersectionComplementsContext(UniondisjunctiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToIntersectionComplements(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionSetContext extends UniondisjunctiveContext {
		public UniondisjunctiveContext uniondisjunctive() {
			return getRuleContext(UniondisjunctiveContext.class,0);
		}
		public TerminalNode UNION() { return getToken(CalcSetParser.UNION, 0); }
		public IntersectioncomplementsContext intersectioncomplements() {
			return getRuleContext(IntersectioncomplementsContext.class,0);
		}
		public UnionSetContext(UniondisjunctiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnionSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DisjunctiveUnionContext extends UniondisjunctiveContext {
		public UniondisjunctiveContext uniondisjunctive() {
			return getRuleContext(UniondisjunctiveContext.class,0);
		}
		public TerminalNode DISJUNCTIVE_UNION() { return getToken(CalcSetParser.DISJUNCTIVE_UNION, 0); }
		public IntersectioncomplementsContext intersectioncomplements() {
			return getRuleContext(IntersectioncomplementsContext.class,0);
		}
		public DisjunctiveUnionContext(UniondisjunctiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitDisjunctiveUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniondisjunctiveContext uniondisjunctive() throws RecognitionException {
		return uniondisjunctive(0);
	}

	private UniondisjunctiveContext uniondisjunctive(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UniondisjunctiveContext _localctx = new UniondisjunctiveContext(_ctx, _parentState);
		UniondisjunctiveContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_uniondisjunctive, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToIntersectionComplementsContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(142);
			intersectioncomplements(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new UnionSetContext(new UniondisjunctiveContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_uniondisjunctive);
						setState(144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(145);
						match(UNION);
						setState(146);
						intersectioncomplements(0);
						}
						break;
					case 2:
						{
						_localctx = new DisjunctiveUnionContext(new UniondisjunctiveContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_uniondisjunctive);
						setState(147);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(148);
						match(DISJUNCTIVE_UNION);
						setState(149);
						intersectioncomplements(0);
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntersectioncomplementsContext extends ParserRuleContext {
		public IntersectioncomplementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectioncomplements; }
	 
		public IntersectioncomplementsContext() { }
		public void copyFrom(IntersectioncomplementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToMultOrDivContext extends IntersectioncomplementsContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public ToMultOrDivContext(IntersectioncomplementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToMultOrDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntersectionSetContext extends IntersectioncomplementsContext {
		public IntersectioncomplementsContext intersectioncomplements() {
			return getRuleContext(IntersectioncomplementsContext.class,0);
		}
		public TerminalNode INTERSECTION() { return getToken(CalcSetParser.INTERSECTION, 0); }
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public IntersectionSetContext(IntersectioncomplementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitIntersectionSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplementsSetContext extends IntersectioncomplementsContext {
		public IntersectioncomplementsContext intersectioncomplements() {
			return getRuleContext(IntersectioncomplementsContext.class,0);
		}
		public TerminalNode COMPLEMENTS() { return getToken(CalcSetParser.COMPLEMENTS, 0); }
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public ComplementsSetContext(IntersectioncomplementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitComplementsSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectioncomplementsContext intersectioncomplements() throws RecognitionException {
		return intersectioncomplements(0);
	}

	private IntersectioncomplementsContext intersectioncomplements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntersectioncomplementsContext _localctx = new IntersectioncomplementsContext(_ctx, _parentState);
		IntersectioncomplementsContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_intersectioncomplements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMultOrDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(156);
			bit(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new IntersectionSetContext(new IntersectioncomplementsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intersectioncomplements);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						match(INTERSECTION);
						setState(160);
						bit(0);
						}
						break;
					case 2:
						{
						_localctx = new ComplementsSetContext(new IntersectioncomplementsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intersectioncomplements);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						match(COMPLEMENTS);
						setState(163);
						bit(0);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BitContext extends ParserRuleContext {
		public BitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit; }
	 
		public BitContext() { }
		public void copyFrom(BitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BitXorContext extends BitContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public TerminalNode BIT_XOR() { return getToken(CalcSetParser.BIT_XOR, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public BitXorContext(BitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBitXor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitRightUnsignedContext extends BitContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public TerminalNode BIT_RIGHTU() { return getToken(CalcSetParser.BIT_RIGHTU, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public BitRightUnsignedContext(BitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBitRightUnsigned(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitLeftContext extends BitContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public TerminalNode BIT_LEFT() { return getToken(CalcSetParser.BIT_LEFT, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public BitLeftContext(BitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBitLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitRightContext extends BitContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public TerminalNode BIT_RIGHT() { return getToken(CalcSetParser.BIT_RIGHT, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public BitRightContext(BitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBitRight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToPowContext extends BitContext {
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public ToPowContext(BitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitContext bit() throws RecognitionException {
		return bit(0);
	}

	private BitContext bit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitContext _localctx = new BitContext(_ctx, _parentState);
		BitContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_bit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToPowContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(170);
			power();
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new BitLeftContext(new BitContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(172);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(173);
						match(BIT_LEFT);
						setState(174);
						power();
						}
						break;
					case 2:
						{
						_localctx = new BitRightContext(new BitContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(175);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(176);
						match(BIT_RIGHT);
						setState(177);
						power();
						}
						break;
					case 3:
						{
						_localctx = new BitRightUnsignedContext(new BitContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						match(BIT_RIGHTU);
						setState(180);
						power();
						}
						break;
					case 4:
						{
						_localctx = new BitXorContext(new BitContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(181);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(182);
						match(BIT_XOR);
						setState(183);
						power();
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
	 
		public PowerContext() { }
		public void copyFrom(PowerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PowerPowerContext extends PowerContext {
		public UnarycomplementsbitinversContext unarycomplementsbitinvers() {
			return getRuleContext(UnarycomplementsbitinversContext.class,0);
		}
		public TerminalNode POW() { return getToken(CalcSetParser.POW, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public PowerPowerContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitPowerPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_power);
		try {
			_localctx = new PowerPowerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			unarycomplementsbitinvers(0);
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(190);
				match(POW);
				setState(191);
				power();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnarycomplementsbitinversContext extends ParserRuleContext {
		public UnarycomplementsbitinversContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unarycomplementsbitinvers; }
	 
		public UnarycomplementsbitinversContext() { }
		public void copyFrom(UnarycomplementsbitinversContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplementSetContext extends UnarycomplementsbitinversContext {
		public UnarycomplementsbitinversContext unarycomplementsbitinvers() {
			return getRuleContext(UnarycomplementsbitinversContext.class,0);
		}
		public TerminalNode COMPLEMENT_SET() { return getToken(CalcSetParser.COMPLEMENT_SET, 0); }
		public ComplementSetContext(UnarycomplementsbitinversContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitComplementSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryNotContext extends UnarycomplementsbitinversContext {
		public TerminalNode NOT() { return getToken(CalcSetParser.NOT, 0); }
		public UnarycomplementsbitinversContext unarycomplementsbitinvers() {
			return getRuleContext(UnarycomplementsbitinversContext.class,0);
		}
		public UnaryNotContext(UnarycomplementsbitinversContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnaryNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeSignContext extends UnarycomplementsbitinversContext {
		public TerminalNode MINUS() { return getToken(CalcSetParser.MINUS, 0); }
		public UnarycomplementsbitinversContext unarycomplementsbitinvers() {
			return getRuleContext(UnarycomplementsbitinversContext.class,0);
		}
		public ChangeSignContext(UnarycomplementsbitinversContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitChangeSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitInversContext extends UnarycomplementsbitinversContext {
		public TerminalNode BIT_INVERS() { return getToken(CalcSetParser.BIT_INVERS, 0); }
		public UnarycomplementsbitinversContext unarycomplementsbitinvers() {
			return getRuleContext(UnarycomplementsbitinversContext.class,0);
		}
		public BitInversContext(UnarycomplementsbitinversContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBitInvers(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAtomContext extends UnarycomplementsbitinversContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToAtomContext(UnarycomplementsbitinversContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnarycomplementsbitinversContext unarycomplementsbitinvers() throws RecognitionException {
		return unarycomplementsbitinvers(0);
	}

	private UnarycomplementsbitinversContext unarycomplementsbitinvers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnarycomplementsbitinversContext _localctx = new UnarycomplementsbitinversContext(_ctx, _parentState);
		UnarycomplementsbitinversContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_unarycomplementsbitinvers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new ChangeSignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				match(MINUS);
				setState(196);
				unarycomplementsbitinvers(5);
				}
				break;
			case NOT:
				{
				_localctx = new UnaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(NOT);
				setState(198);
				unarycomplementsbitinvers(4);
				}
				break;
			case BIT_INVERS:
				{
				_localctx = new BitInversContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(BIT_INVERS);
				setState(200);
				unarycomplementsbitinvers(2);
				}
				break;
			case T__0:
			case T__2:
			case T__4:
			case INT:
			case DOUBLE:
			case MATH_PI:
			case MATH_E:
			case TRUE:
			case FALSE:
			case ID:
			case STRING:
			case OR:
			case UNION:
				{
				_localctx = new ToAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComplementSetContext(new UnarycomplementsbitinversContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_unarycomplementsbitinvers);
					setState(204);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(205);
					match(COMPLEMENT_SET);
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantPIContext extends AtomContext {
		public TerminalNode MATH_PI() { return getToken(CalcSetParser.MATH_PI, 0); }
		public ConstantPIContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitConstantPI(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends AtomContext {
		public TerminalNode ID() { return getToken(CalcSetParser.ID, 0); }
		public VariableContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracesContext extends AtomContext {
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public BracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CardinalityContext extends AtomContext {
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public CardinalityContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitCardinality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantEContext extends AtomContext {
		public TerminalNode MATH_E() { return getToken(CalcSetParser.MATH_E, 0); }
		public ConstantEContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitConstantE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormContext extends AtomContext {
		public OrandContext orand() {
			return getRuleContext(OrandContext.class,0);
		}
		public NormContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitNorm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends AtomContext {
		public TerminalNode STRING() { return getToken(CalcSetParser.STRING, 0); }
		public StringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToExprFrAtomContext extends AtomContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ToExprFrAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToExprFrAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends AtomContext {
		public TerminalNode DOUBLE() { return getToken(CalcSetParser.DOUBLE, 0); }
		public DoubleContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantBooleanContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(CalcSetParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CalcSetParser.FALSE, 0); }
		public ConstantBooleanContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitConstantBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends AtomContext {
		public TerminalNode INT() { return getToken(CalcSetParser.INT, 0); }
		public IntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atom);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ConstantPIContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(MATH_PI);
				}
				break;
			case 3:
				_localctx = new ConstantEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(MATH_E);
				}
				break;
			case 4:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new ConstantBooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(TRUE);
				}
				break;
			case 6:
				_localctx = new ConstantBooleanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(FALSE);
				}
				break;
			case 7:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(217);
				match(DOUBLE);
				}
				break;
			case 8:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				match(INT);
				}
				break;
			case 9:
				_localctx = new BracesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(219);
				match(T__0);
				setState(220);
				orand(0);
				setState(221);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new CardinalityContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(223);
				match(UNION);
				setState(224);
				orand(0);
				setState(225);
				match(UNION);
				}
				break;
			case 11:
				_localctx = new NormContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(227);
				match(OR);
				setState(228);
				orand(0);
				setState(229);
				match(OR);
				}
				break;
			case 12:
				_localctx = new ToExprFrAtomContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(231);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public UnorderedsetContext unorderedset() {
			return getRuleContext(UnorderedsetContext.class,0);
		}
		public OrderedsetContext orderedset() {
			return getRuleContext(OrderedsetContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				unorderedset();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				orderedset();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(T__0);
				setState(237);
				expression();
				setState(238);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnorderedsetContext extends ParserRuleContext {
		public UnorderedsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unorderedset; }
	 
		public UnorderedsetContext() { }
		public void copyFrom(UnorderedsetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnorderedPairContext extends UnorderedsetContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public UnorderedPairContext(UnorderedsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnorderedPair(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnorderedEmptySetContext extends UnorderedsetContext {
		public UnorderedEmptySetContext(UnorderedsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnorderedEmptySet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnorderedComplementSetContext extends UnorderedsetContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode COMPLEMENT_SET() { return getToken(CalcSetParser.COMPLEMENT_SET, 0); }
		public UnorderedComplementSetContext(UnorderedsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnorderedComplementSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnorderedUniversalSetContext extends UnorderedsetContext {
		public TerminalNode COMPLEMENT_SET() { return getToken(CalcSetParser.COMPLEMENT_SET, 0); }
		public UnorderedUniversalSetContext(UnorderedsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnorderedUniversalSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnorderedsetContext unorderedset() throws RecognitionException {
		UnorderedsetContext _localctx = new UnorderedsetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unorderedset);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new UnorderedPairContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__2);
				setState(243);
				list();
				setState(244);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new UnorderedComplementSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__2);
				setState(247);
				list();
				setState(248);
				match(T__3);
				setState(249);
				match(COMPLEMENT_SET);
				}
				break;
			case 3:
				_localctx = new UnorderedEmptySetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(T__2);
				setState(252);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new UnorderedUniversalSetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(T__2);
				setState(254);
				match(T__3);
				setState(255);
				match(COMPLEMENT_SET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedsetContext extends ParserRuleContext {
		public OrderedsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedset; }
	 
		public OrderedsetContext() { }
		public void copyFrom(OrderedsetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrderedUniversalSetContext extends OrderedsetContext {
		public TerminalNode COMPLEMENT_SET() { return getToken(CalcSetParser.COMPLEMENT_SET, 0); }
		public OrderedUniversalSetContext(OrderedsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOrderedUniversalSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderedPairContext extends OrderedsetContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public OrderedPairContext(OrderedsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOrderedPair(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderedComplementSetContext extends OrderedsetContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode COMPLEMENT_SET() { return getToken(CalcSetParser.COMPLEMENT_SET, 0); }
		public OrderedComplementSetContext(OrderedsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOrderedComplementSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderedEmptySetContext extends OrderedsetContext {
		public OrderedEmptySetContext(OrderedsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOrderedEmptySet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedsetContext orderedset() throws RecognitionException {
		OrderedsetContext _localctx = new OrderedsetContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderedset);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new OrderedPairContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__4);
				setState(259);
				list();
				setState(260);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new OrderedComplementSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__4);
				setState(263);
				list();
				setState(264);
				match(T__5);
				setState(265);
				match(COMPLEMENT_SET);
				}
				break;
			case 3:
				_localctx = new OrderedEmptySetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(T__4);
				setState(268);
				match(T__5);
				}
				break;
			case 4:
				_localctx = new OrderedUniversalSetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(T__4);
				setState(270);
				match(T__5);
				setState(271);
				match(COMPLEMENT_SET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_list);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				atom();
				setState(275);
				match(T__6);
				setState(276);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return orand_sempred((OrandContext)_localctx, predIndex);
		case 3:
			return equalgrls_sempred((EqualgrlsContext)_localctx, predIndex);
		case 4:
			return plusminus_sempred((PlusminusContext)_localctx, predIndex);
		case 5:
			return implicationsubset_sempred((ImplicationsubsetContext)_localctx, predIndex);
		case 6:
			return multdiv_sempred((MultdivContext)_localctx, predIndex);
		case 7:
			return uniondisjunctive_sempred((UniondisjunctiveContext)_localctx, predIndex);
		case 8:
			return intersectioncomplements_sempred((IntersectioncomplementsContext)_localctx, predIndex);
		case 9:
			return bit_sempred((BitContext)_localctx, predIndex);
		case 11:
			return unarycomplementsbitinvers_sempred((UnarycomplementsbitinversContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean orand_sempred(OrandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equalgrls_sempred(EqualgrlsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean plusminus_sempred(PlusminusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean implicationsubset_sempred(ImplicationsubsetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multdiv_sempred(MultdivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean uniondisjunctive_sempred(UniondisjunctiveContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean intersectioncomplements_sempred(IntersectioncomplementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bit_sempred(BitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 5);
		case 23:
			return precpred(_ctx, 4);
		case 24:
			return precpred(_ctx, 3);
		case 25:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean unarycomplementsbitinvers_sempred(UnarycomplementsbitinversContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u011c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4G\n\4\f\4\16\4J\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u0099\n\t\f\t\16\t\u009c\13\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00a7\n\n\f\n\16\n\u00aa\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00bb\n\13\f\13"+
		"\16\13\u00be\13\13\3\f\3\f\3\f\5\f\u00c3\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00cd\n\r\3\r\3\r\7\r\u00d1\n\r\f\r\16\r\u00d4\13\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00eb\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00f3\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0103\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0113\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u011a\n\22\3\22\2\13\6\b\n\f\16\20\22\24\30\23\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"\2\2\2\u013e\2+\3\2\2\2\4-\3\2\2\2\6\61"+
		"\3\2\2\2\bK\3\2\2\2\ne\3\2\2\2\fs\3\2\2\2\16\u0081\3\2\2\2\20\u008f\3"+
		"\2\2\2\22\u009d\3\2\2\2\24\u00ab\3\2\2\2\26\u00bf\3\2\2\2\30\u00cc\3\2"+
		"\2\2\32\u00ea\3\2\2\2\34\u00f2\3\2\2\2\36\u0102\3\2\2\2 \u0112\3\2\2\2"+
		"\"\u0119\3\2\2\2$%\5\4\3\2%&\7\13\2\2&\'\5\2\2\2\',\3\2\2\2()\5\6\4\2"+
		")*\7\13\2\2*,\3\2\2\2+$\3\2\2\2+(\3\2\2\2,\3\3\2\2\2-.\7\22\2\2./\7\24"+
		"\2\2/\60\5\6\4\2\60\5\3\2\2\2\61\62\b\4\1\2\62\63\5\b\5\2\63H\3\2\2\2"+
		"\64\65\f\t\2\2\65\66\7&\2\2\66G\5\b\5\2\678\f\b\2\289\7+\2\29G\5\b\5\2"+
		":;\f\7\2\2;<\7*\2\2<G\5\b\5\2=>\f\6\2\2>?\7,\2\2?G\5\b\5\2@A\f\5\2\2A"+
		"B\7%\2\2BG\5\b\5\2CD\f\4\2\2DE\7)\2\2EG\5\b\5\2F\64\3\2\2\2F\67\3\2\2"+
		"\2F:\3\2\2\2F=\3\2\2\2F@\3\2\2\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2"+
		"\2I\7\3\2\2\2JH\3\2\2\2KL\b\5\1\2LM\5\n\6\2Mb\3\2\2\2NO\f\t\2\2OP\7#\2"+
		"\2Pa\5\n\6\2QR\f\b\2\2RS\7$\2\2Sa\5\n\6\2TU\f\7\2\2UV\7\37\2\2Va\5\n\6"+
		"\2WX\f\6\2\2XY\7 \2\2Ya\5\n\6\2Z[\f\5\2\2[\\\7!\2\2\\a\5\n\6\2]^\f\4\2"+
		"\2^_\7\"\2\2_a\5\n\6\2`N\3\2\2\2`Q\3\2\2\2`T\3\2\2\2`W\3\2\2\2`Z\3\2\2"+
		"\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2db\3\2\2\2ef\b\6"+
		"\1\2fg\5\f\7\2gp\3\2\2\2hi\f\5\2\2ij\7\25\2\2jo\5\f\7\2kl\f\4\2\2lm\7"+
		"\26\2\2mo\5\f\7\2nh\3\2\2\2nk\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\13"+
		"\3\2\2\2rp\3\2\2\2st\b\7\1\2tu\5\16\b\2u~\3\2\2\2vw\f\5\2\2wx\7(\2\2x"+
		"}\5\16\b\2yz\f\4\2\2z{\7\60\2\2{}\5\16\b\2|v\3\2\2\2|y\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\r\3\2\2\2\u0080~\3\2\2\2\u0081\u0082"+
		"\b\b\1\2\u0082\u0083\5\20\t\2\u0083\u008c\3\2\2\2\u0084\u0085\f\5\2\2"+
		"\u0085\u0086\7\27\2\2\u0086\u008b\5\20\t\2\u0087\u0088\f\4\2\2\u0088\u0089"+
		"\7\30\2\2\u0089\u008b\5\20\t\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\17"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\t\1\2\u0090\u0091\5\22\n\2"+
		"\u0091\u009a\3\2\2\2\u0092\u0093\f\5\2\2\u0093\u0094\7.\2\2\u0094\u0099"+
		"\5\22\n\2\u0095\u0096\f\4\2\2\u0096\u0097\7\62\2\2\u0097\u0099\5\22\n"+
		"\2\u0098\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\21\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\b\n\1\2\u009e\u009f\5\24\13\2\u009f\u00a8\3\2\2\2\u00a0\u00a1\f"+
		"\5\2\2\u00a1\u00a2\7-\2\2\u00a2\u00a7\5\24\13\2\u00a3\u00a4\f\4\2\2\u00a4"+
		"\u00a5\7/\2\2\u00a5\u00a7\5\24\13\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\23\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\b\13\1\2\u00ac\u00ad\5\26"+
		"\f\2\u00ad\u00bc\3\2\2\2\u00ae\u00af\f\7\2\2\u00af\u00b0\7\34\2\2\u00b0"+
		"\u00bb\5\26\f\2\u00b1\u00b2\f\6\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00bb\5"+
		"\26\f\2\u00b4\u00b5\f\5\2\2\u00b5\u00b6\7\36\2\2\u00b6\u00bb\5\26\f\2"+
		"\u00b7\u00b8\f\4\2\2\u00b8\u00b9\7\33\2\2\u00b9\u00bb\5\26\f\2\u00ba\u00ae"+
		"\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\25\3\2\2"+
		"\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\5\30\r\2\u00c0\u00c1\7\31\2\2\u00c1"+
		"\u00c3\5\26\f\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\27\3\2\2"+
		"\2\u00c4\u00c5\b\r\1\2\u00c5\u00c6\7\26\2\2\u00c6\u00cd\5\30\r\7\u00c7"+
		"\u00c8\7\'\2\2\u00c8\u00cd\5\30\r\6\u00c9\u00ca\7\32\2\2\u00ca\u00cd\5"+
		"\30\r\4\u00cb\u00cd\5\32\16\2\u00cc\u00c4\3\2\2\2\u00cc\u00c7\3\2\2\2"+
		"\u00cc\u00c9\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d2\3\2\2\2\u00ce\u00cf"+
		"\f\5\2\2\u00cf\u00d1\7\61\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00eb\7\22\2\2\u00d6\u00eb\7\16\2\2\u00d7\u00eb\7\17\2"+
		"\2\u00d8\u00eb\7\23\2\2\u00d9\u00eb\7\20\2\2\u00da\u00eb\7\21\2\2\u00db"+
		"\u00eb\7\r\2\2\u00dc\u00eb\7\f\2\2\u00dd\u00de\7\3\2\2\u00de\u00df\5\6"+
		"\4\2\u00df\u00e0\7\4\2\2\u00e0\u00eb\3\2\2\2\u00e1\u00e2\7.\2\2\u00e2"+
		"\u00e3\5\6\4\2\u00e3\u00e4\7.\2\2\u00e4\u00eb\3\2\2\2\u00e5\u00e6\7&\2"+
		"\2\u00e6\u00e7\5\6\4\2\u00e7\u00e8\7&\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb"+
		"\5\34\17\2\u00ea\u00d5\3\2\2\2\u00ea\u00d6\3\2\2\2\u00ea\u00d7\3\2\2\2"+
		"\u00ea\u00d8\3\2\2\2\u00ea\u00d9\3\2\2\2\u00ea\u00da\3\2\2\2\u00ea\u00db"+
		"\3\2\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00dd\3\2\2\2\u00ea\u00e1\3\2\2\2\u00ea"+
		"\u00e5\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\33\3\2\2\2\u00ec\u00f3\5\36\20"+
		"\2\u00ed\u00f3\5 \21\2\u00ee\u00ef\7\3\2\2\u00ef\u00f0\5\34\17\2\u00f0"+
		"\u00f1\7\4\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ed\3\2"+
		"\2\2\u00f2\u00ee\3\2\2\2\u00f3\35\3\2\2\2\u00f4\u00f5\7\5\2\2\u00f5\u00f6"+
		"\5\"\22\2\u00f6\u00f7\7\6\2\2\u00f7\u0103\3\2\2\2\u00f8\u00f9\7\5\2\2"+
		"\u00f9\u00fa\5\"\22\2\u00fa\u00fb\7\6\2\2\u00fb\u00fc\7\61\2\2\u00fc\u0103"+
		"\3\2\2\2\u00fd\u00fe\7\5\2\2\u00fe\u0103\7\6\2\2\u00ff\u0100\7\5\2\2\u0100"+
		"\u0101\7\6\2\2\u0101\u0103\7\61\2\2\u0102\u00f4\3\2\2\2\u0102\u00f8\3"+
		"\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\37\3\2\2\2\u0104"+
		"\u0105\7\7\2\2\u0105\u0106\5\"\22\2\u0106\u0107\7\b\2\2\u0107\u0113\3"+
		"\2\2\2\u0108\u0109\7\7\2\2\u0109\u010a\5\"\22\2\u010a\u010b\7\b\2\2\u010b"+
		"\u010c\7\61\2\2\u010c\u0113\3\2\2\2\u010d\u010e\7\7\2\2\u010e\u0113\7"+
		"\b\2\2\u010f\u0110\7\7\2\2\u0110\u0111\7\b\2\2\u0111\u0113\7\61\2\2\u0112"+
		"\u0104\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u010f\3\2"+
		"\2\2\u0113!\3\2\2\2\u0114\u0115\5\32\16\2\u0115\u0116\7\t\2\2\u0116\u0117"+
		"\5\"\22\2\u0117\u011a\3\2\2\2\u0118\u011a\5\32\16\2\u0119\u0114\3\2\2"+
		"\2\u0119\u0118\3\2\2\2\u011a#\3\2\2\2\33+FH`bnp|~\u008a\u008c\u0098\u009a"+
		"\u00a6\u00a8\u00ba\u00bc\u00c2\u00cc\u00d2\u00ea\u00f2\u0102\u0112\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}