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
		T__0=1, T__1=2, T__2=3, WS=4, NL=5, INT=6, DOUBLE=7, MATH_PI=8, MATH_E=9, 
		UNIVERSAL_SET=10, TRUE=11, FALSE=12, ID=13, STRING=14, ASSIGN=15, PLUS=16, 
		MINUS=17, MULT=18, DIV=19, POW=20, BINVERS=21, BLEFT=22, BRIGHT=23, BRIGHTU=24, 
		GR=25, GRE=26, LS=27, LSE=28, EQUAL=29, NEQUAL=30, AND=31, OR=32, NOT=33, 
		IMPLICATION=34, NAND=35, NOR=36, XOR=37, XNOR=38, SUBSET=39, CARDINALITY=40, 
		INTERSECTION=41, UNION=42, COMPLEMENTS=43, DISJUNCTIVE_UNION=44, LPAR=45, 
		RPAR=46;
	public static final int
		RULE_input = 0, RULE_setVar = 1, RULE_booleanOp = 2, RULE_equalNotequal = 3, 
		RULE_plusOrMinus = 4, RULE_implicationSubset = 5, RULE_union = 6, RULE_intersectionComplements = 7, 
		RULE_multOrDiv = 8, RULE_pow = 9, RULE_unaryMinus = 10, RULE_atom = 11, 
		RULE_expr = 12, RULE_set = 13, RULE_list = 14;
	public static final String[] ruleNames = {
		"input", "setVar", "booleanOp", "equalNotequal", "plusOrMinus", "implicationSubset", 
		"union", "intersectionComplements", "multOrDiv", "pow", "unaryMinus", 
		"atom", "expr", "set", "list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", null, "'\n'", null, null, "'_pi'", "'_e'", 
		"'_u'", "'true'", "'false'", null, null, "'='", "'+'", "'-'", "'*'", "'/'", 
		"'^'", "'~'", "'<<'", "'>>'", "'>>>'", "'>'", "'>='", "'<'", "'<='", "'=='", 
		"'!='", "'&&'", "'||'", "'!'", "'->'", "'!&'", "'!|'", "'X|'", "'X!'", 
		"'@'", "'#'", "'&'", "'|'", "'\\'", "'/\\'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WS", "NL", "INT", "DOUBLE", "MATH_PI", "MATH_E", 
		"UNIVERSAL_SET", "TRUE", "FALSE", "ID", "STRING", "ASSIGN", "PLUS", "MINUS", 
		"MULT", "DIV", "POW", "BINVERS", "BLEFT", "BRIGHT", "BRIGHTU", "GR", "GRE", 
		"LS", "LSE", "EQUAL", "NEQUAL", "AND", "OR", "NOT", "IMPLICATION", "NAND", 
		"NOR", "XOR", "XNOR", "SUBSET", "CARDINALITY", "INTERSECTION", "UNION", 
		"COMPLEMENTS", "DISJUNCTIVE_UNION", "LPAR", "RPAR"
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
	public static class CalculateContext extends InputContext {
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public TerminalNode NL() { return getToken(CalcSetParser.NL, 0); }
		public CalculateContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToSetVarContext extends InputContext {
		public SetVarContext setVar() {
			return getRuleContext(SetVarContext.class,0);
		}
		public TerminalNode NL() { return getToken(CalcSetParser.NL, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ToSetVarContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToSetVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ToSetVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				setVar();
				setState(31);
				match(NL);
				setState(32);
				input();
				}
				break;
			case 2:
				_localctx = new CalculateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				booleanOp(0);
				setState(35);
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

	public static class SetVarContext extends ParserRuleContext {
		public SetVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVar; }
	 
		public SetVarContext() { }
		public void copyFrom(SetVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetVariableContext extends SetVarContext {
		public TerminalNode ID() { return getToken(CalcSetParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalcSetParser.ASSIGN, 0); }
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public SetVariableContext(SetVarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitSetVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetVarContext setVar() throws RecognitionException {
		SetVarContext _localctx = new SetVarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setVar);
		try {
			_localctx = new SetVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
			setState(40);
			match(ASSIGN);
			setState(41);
			booleanOp(0);
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

	public static class BooleanOpContext extends ParserRuleContext {
		public BooleanOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOp; }
	 
		public BooleanOpContext() { }
		public void copyFrom(BooleanOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NorContext extends BooleanOpContext {
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public TerminalNode NOR() { return getToken(CalcSetParser.NOR, 0); }
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public NorContext(BooleanOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitNor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XnorContext extends BooleanOpContext {
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public TerminalNode XNOR() { return getToken(CalcSetParser.XNOR, 0); }
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public XnorContext(BooleanOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitXnor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends BooleanOpContext {
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public TerminalNode OR() { return getToken(CalcSetParser.OR, 0); }
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public OrContext(BooleanOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends BooleanOpContext {
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public TerminalNode AND() { return getToken(CalcSetParser.AND, 0); }
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public AndContext(BooleanOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToEqualNotequalContext extends BooleanOpContext {
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public ToEqualNotequalContext(BooleanOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToEqualNotequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorContext extends BooleanOpContext {
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public TerminalNode XOR() { return getToken(CalcSetParser.XOR, 0); }
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public XorContext(BooleanOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NandContext extends BooleanOpContext {
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public TerminalNode NAND() { return getToken(CalcSetParser.NAND, 0); }
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public NandContext(BooleanOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitNand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOpContext booleanOp() throws RecognitionException {
		return booleanOp(0);
	}

	private BooleanOpContext booleanOp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanOpContext _localctx = new BooleanOpContext(_ctx, _parentState);
		BooleanOpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_booleanOp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToEqualNotequalContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(44);
			equalNotequal(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new OrContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(46);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(47);
						match(OR);
						setState(48);
						equalNotequal(0);
						}
						break;
					case 2:
						{
						_localctx = new XorContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(49);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(50);
						match(XOR);
						setState(51);
						equalNotequal(0);
						}
						break;
					case 3:
						{
						_localctx = new NorContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(52);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(53);
						match(NOR);
						setState(54);
						equalNotequal(0);
						}
						break;
					case 4:
						{
						_localctx = new XnorContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(55);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(56);
						match(XNOR);
						setState(57);
						equalNotequal(0);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						match(AND);
						setState(60);
						equalNotequal(0);
						}
						break;
					case 6:
						{
						_localctx = new NandContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						match(NAND);
						setState(63);
						equalNotequal(0);
						}
						break;
					}
					} 
				}
				setState(68);
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

	public static class EqualNotequalContext extends ParserRuleContext {
		public EqualNotequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalNotequal; }
	 
		public EqualNotequalContext() { }
		public void copyFrom(EqualNotequalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToPlusOrMinusContext extends EqualNotequalContext {
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public ToPlusOrMinusContext(EqualNotequalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToPlusOrMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualContext extends EqualNotequalContext {
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public TerminalNode GRE() { return getToken(CalcSetParser.GRE, 0); }
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public GreaterEqualContext(EqualNotequalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitGreaterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends EqualNotequalContext {
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CalcSetParser.EQUAL, 0); }
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public EqualContext(EqualNotequalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NequalContext extends EqualNotequalContext {
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public TerminalNode NEQUAL() { return getToken(CalcSetParser.NEQUAL, 0); }
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public NequalContext(EqualNotequalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitNequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualContext extends EqualNotequalContext {
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public TerminalNode LSE() { return getToken(CalcSetParser.LSE, 0); }
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public LessEqualContext(EqualNotequalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterContext extends EqualNotequalContext {
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public TerminalNode GR() { return getToken(CalcSetParser.GR, 0); }
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public GreaterContext(EqualNotequalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends EqualNotequalContext {
		public EqualNotequalContext equalNotequal() {
			return getRuleContext(EqualNotequalContext.class,0);
		}
		public TerminalNode LS() { return getToken(CalcSetParser.LS, 0); }
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public LessContext(EqualNotequalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualNotequalContext equalNotequal() throws RecognitionException {
		return equalNotequal(0);
	}

	private EqualNotequalContext equalNotequal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualNotequalContext _localctx = new EqualNotequalContext(_ctx, _parentState);
		EqualNotequalContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_equalNotequal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToPlusOrMinusContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(70);
			plusOrMinus(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new EqualContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(72);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(73);
						match(EQUAL);
						setState(74);
						plusOrMinus(0);
						}
						break;
					case 2:
						{
						_localctx = new NequalContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(75);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(76);
						match(NEQUAL);
						setState(77);
						plusOrMinus(0);
						}
						break;
					case 3:
						{
						_localctx = new GreaterContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(78);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(79);
						match(GR);
						setState(80);
						plusOrMinus(0);
						}
						break;
					case 4:
						{
						_localctx = new GreaterEqualContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(81);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(82);
						match(GRE);
						setState(83);
						plusOrMinus(0);
						}
						break;
					case 5:
						{
						_localctx = new LessContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						match(LS);
						setState(86);
						plusOrMinus(0);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(87);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(88);
						match(LSE);
						setState(89);
						plusOrMinus(0);
						}
						break;
					}
					} 
				}
				setState(94);
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

	public static class PlusOrMinusContext extends ParserRuleContext {
		public PlusOrMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusOrMinus; }
	 
		public PlusOrMinusContext() { }
		public void copyFrom(PlusOrMinusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToImplicationSubsetContext extends PlusOrMinusContext {
		public ImplicationSubsetContext implicationSubset() {
			return getRuleContext(ImplicationSubsetContext.class,0);
		}
		public ToImplicationSubsetContext(PlusOrMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToImplicationSubset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends PlusOrMinusContext {
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CalcSetParser.PLUS, 0); }
		public ImplicationSubsetContext implicationSubset() {
			return getRuleContext(ImplicationSubsetContext.class,0);
		}
		public PlusContext(PlusOrMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends PlusOrMinusContext {
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalcSetParser.MINUS, 0); }
		public ImplicationSubsetContext implicationSubset() {
			return getRuleContext(ImplicationSubsetContext.class,0);
		}
		public MinusContext(PlusOrMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusOrMinusContext plusOrMinus() throws RecognitionException {
		return plusOrMinus(0);
	}

	private PlusOrMinusContext plusOrMinus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlusOrMinusContext _localctx = new PlusOrMinusContext(_ctx, _parentState);
		PlusOrMinusContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_plusOrMinus, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToImplicationSubsetContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(96);
			implicationSubset(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(104);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new PlusOrMinusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusOrMinus);
						setState(98);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(99);
						match(PLUS);
						setState(100);
						implicationSubset(0);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new PlusOrMinusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusOrMinus);
						setState(101);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(102);
						match(MINUS);
						setState(103);
						implicationSubset(0);
						}
						break;
					}
					} 
				}
				setState(108);
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

	public static class ImplicationSubsetContext extends ParserRuleContext {
		public ImplicationSubsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicationSubset; }
	 
		public ImplicationSubsetContext() { }
		public void copyFrom(ImplicationSubsetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToUnionContext extends ImplicationSubsetContext {
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public ToUnionContext(ImplicationSubsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubSetContext extends ImplicationSubsetContext {
		public ImplicationSubsetContext implicationSubset() {
			return getRuleContext(ImplicationSubsetContext.class,0);
		}
		public TerminalNode SUBSET() { return getToken(CalcSetParser.SUBSET, 0); }
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public SubSetContext(ImplicationSubsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitSubSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplicationSetContext extends ImplicationSubsetContext {
		public ImplicationSubsetContext implicationSubset() {
			return getRuleContext(ImplicationSubsetContext.class,0);
		}
		public TerminalNode IMPLICATION() { return getToken(CalcSetParser.IMPLICATION, 0); }
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public ImplicationSetContext(ImplicationSubsetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitImplicationSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationSubsetContext implicationSubset() throws RecognitionException {
		return implicationSubset(0);
	}

	private ImplicationSubsetContext implicationSubset(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImplicationSubsetContext _localctx = new ImplicationSubsetContext(_ctx, _parentState);
		ImplicationSubsetContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_implicationSubset, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToUnionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(110);
			union(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ImplicationSetContext(new ImplicationSubsetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_implicationSubset);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						match(IMPLICATION);
						setState(114);
						union(0);
						}
						break;
					case 2:
						{
						_localctx = new SubSetContext(new ImplicationSubsetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_implicationSubset);
						setState(115);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(116);
						match(SUBSET);
						setState(117);
						union(0);
						}
						break;
					}
					} 
				}
				setState(122);
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

	public static class UnionContext extends ParserRuleContext {
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
	 
		public UnionContext() { }
		public void copyFrom(UnionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToIntersectionComplementsContext extends UnionContext {
		public IntersectionComplementsContext intersectionComplements() {
			return getRuleContext(IntersectionComplementsContext.class,0);
		}
		public ToIntersectionComplementsContext(UnionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToIntersectionComplements(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionSetContext extends UnionContext {
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public TerminalNode UNION() { return getToken(CalcSetParser.UNION, 0); }
		public IntersectionComplementsContext intersectionComplements() {
			return getRuleContext(IntersectionComplementsContext.class,0);
		}
		public UnionSetContext(UnionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnionSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DisjunctiveUnionContext extends UnionContext {
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public TerminalNode DISJUNCTIVE_UNION() { return getToken(CalcSetParser.DISJUNCTIVE_UNION, 0); }
		public IntersectionComplementsContext intersectionComplements() {
			return getRuleContext(IntersectionComplementsContext.class,0);
		}
		public DisjunctiveUnionContext(UnionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitDisjunctiveUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		return union(0);
	}

	private UnionContext union(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnionContext _localctx = new UnionContext(_ctx, _parentState);
		UnionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_union, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToIntersectionComplementsContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(124);
			intersectionComplements(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new UnionSetContext(new UnionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_union);
						setState(126);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(127);
						match(UNION);
						setState(128);
						intersectionComplements(0);
						}
						break;
					case 2:
						{
						_localctx = new DisjunctiveUnionContext(new UnionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_union);
						setState(129);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(130);
						match(DISJUNCTIVE_UNION);
						setState(131);
						intersectionComplements(0);
						}
						break;
					}
					} 
				}
				setState(136);
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

	public static class IntersectionComplementsContext extends ParserRuleContext {
		public IntersectionComplementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionComplements; }
	 
		public IntersectionComplementsContext() { }
		public void copyFrom(IntersectionComplementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToMultOrDivContext extends IntersectionComplementsContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public ToMultOrDivContext(IntersectionComplementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToMultOrDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntersectionSetContext extends IntersectionComplementsContext {
		public IntersectionComplementsContext intersectionComplements() {
			return getRuleContext(IntersectionComplementsContext.class,0);
		}
		public TerminalNode INTERSECTION() { return getToken(CalcSetParser.INTERSECTION, 0); }
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public IntersectionSetContext(IntersectionComplementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitIntersectionSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplementsSetContext extends IntersectionComplementsContext {
		public IntersectionComplementsContext intersectionComplements() {
			return getRuleContext(IntersectionComplementsContext.class,0);
		}
		public TerminalNode COMPLEMENTS() { return getToken(CalcSetParser.COMPLEMENTS, 0); }
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public ComplementsSetContext(IntersectionComplementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitComplementsSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectionComplementsContext intersectionComplements() throws RecognitionException {
		return intersectionComplements(0);
	}

	private IntersectionComplementsContext intersectionComplements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntersectionComplementsContext _localctx = new IntersectionComplementsContext(_ctx, _parentState);
		IntersectionComplementsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_intersectionComplements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMultOrDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(138);
			multOrDiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new IntersectionSetContext(new IntersectionComplementsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intersectionComplements);
						setState(140);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(141);
						match(INTERSECTION);
						setState(142);
						multOrDiv(0);
						}
						break;
					case 2:
						{
						_localctx = new ComplementsSetContext(new IntersectionComplementsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intersectionComplements);
						setState(143);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(144);
						match(COMPLEMENTS);
						setState(145);
						multOrDiv(0);
						}
						break;
					}
					} 
				}
				setState(150);
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

	public static class MultOrDivContext extends ParserRuleContext {
		public MultOrDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOrDiv; }
	 
		public MultOrDivContext() { }
		public void copyFrom(MultOrDivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationContext extends MultOrDivContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CalcSetParser.MULT, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public MultiplicationContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitRightUnsignedContext extends MultOrDivContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public TerminalNode BRIGHTU() { return getToken(CalcSetParser.BRIGHTU, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public BitRightUnsignedContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBitRightUnsigned(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends MultOrDivContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public TerminalNode DIV() { return getToken(CalcSetParser.DIV, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public DivisionContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitLeftContext extends MultOrDivContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public TerminalNode BLEFT() { return getToken(CalcSetParser.BLEFT, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public BitLeftContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBitLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitRightContext extends MultOrDivContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public TerminalNode BRIGHT() { return getToken(CalcSetParser.BRIGHT, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public BitRightContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBitRight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToPowContext extends MultOrDivContext {
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public ToPowContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOrDivContext multOrDiv() throws RecognitionException {
		return multOrDiv(0);
	}

	private MultOrDivContext multOrDiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultOrDivContext _localctx = new MultOrDivContext(_ctx, _parentState);
		MultOrDivContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_multOrDiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToPowContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(152);
			pow();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(154);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						match(MULT);
						setState(156);
						pow();
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158);
						match(DIV);
						setState(159);
						pow();
						}
						break;
					case 3:
						{
						_localctx = new BitLeftContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(161);
						match(BLEFT);
						setState(162);
						pow();
						}
						break;
					case 4:
						{
						_localctx = new BitRightContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						match(BRIGHT);
						setState(165);
						pow();
						}
						break;
					case 5:
						{
						_localctx = new BitRightUnsignedContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						match(BRIGHTU);
						setState(168);
						pow();
						}
						break;
					}
					} 
				}
				setState(173);
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

	public static class PowContext extends ParserRuleContext {
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
	 
		public PowContext() { }
		public void copyFrom(PowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PowerContext extends PowContext {
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public TerminalNode POW() { return getToken(CalcSetParser.POW, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public PowerContext(PowContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pow);
		try {
			_localctx = new PowerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			unaryMinus();
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(175);
				match(POW);
				setState(176);
				pow();
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

	public static class UnaryMinusContext extends ParserRuleContext {
		public UnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMinus; }
	 
		public UnaryMinusContext() { }
		public void copyFrom(UnaryMinusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryNotContext extends UnaryMinusContext {
		public TerminalNode NOT() { return getToken(CalcSetParser.NOT, 0); }
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public UnaryNotContext(UnaryMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnaryNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeSignContext extends UnaryMinusContext {
		public TerminalNode MINUS() { return getToken(CalcSetParser.MINUS, 0); }
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public ChangeSignContext(UnaryMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitChangeSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CardinalityContext extends UnaryMinusContext {
		public TerminalNode CARDINALITY() { return getToken(CalcSetParser.CARDINALITY, 0); }
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public CardinalityContext(UnaryMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitCardinality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitInversContext extends UnaryMinusContext {
		public TerminalNode BINVERS() { return getToken(CalcSetParser.BINVERS, 0); }
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public BitInversContext(UnaryMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBitInvers(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAtomContext extends UnaryMinusContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToAtomContext(UnaryMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryMinusContext unaryMinus() throws RecognitionException {
		UnaryMinusContext _localctx = new UnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unaryMinus);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new ChangeSignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(MINUS);
				setState(180);
				unaryMinus();
				}
				break;
			case NOT:
				_localctx = new UnaryNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(NOT);
				setState(182);
				unaryMinus();
				}
				break;
			case BINVERS:
				_localctx = new BitInversContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(BINVERS);
				setState(184);
				unaryMinus();
				}
				break;
			case CARDINALITY:
				_localctx = new CardinalityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(CARDINALITY);
				setState(186);
				unaryMinus();
				}
				break;
			case T__0:
			case INT:
			case DOUBLE:
			case MATH_PI:
			case MATH_E:
			case UNIVERSAL_SET:
			case TRUE:
			case FALSE:
			case ID:
			case STRING:
			case LPAR:
				_localctx = new ToAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				atom();
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
		public TerminalNode LPAR() { return getToken(CalcSetParser.LPAR, 0); }
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CalcSetParser.RPAR, 0); }
		public BracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToExprContext extends AtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ToExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToExpr(this);
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
	public static class UniversalSetContext extends AtomContext {
		public TerminalNode UNIVERSAL_SET() { return getToken(CalcSetParser.UNIVERSAL_SET, 0); }
		public UniversalSetContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUniversalSet(this);
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
	public static class BooleanContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(CalcSetParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CalcSetParser.FALSE, 0); }
		public BooleanContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBoolean(this);
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
		enterRule(_localctx, 22, RULE_atom);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ConstantPIContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(MATH_PI);
				}
				break;
			case 3:
				_localctx = new ConstantEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(MATH_E);
				}
				break;
			case 4:
				_localctx = new UniversalSetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(UNIVERSAL_SET);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				match(TRUE);
				}
				break;
			case 7:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				match(FALSE);
				}
				break;
			case 8:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				match(DOUBLE);
				}
				break;
			case 9:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(198);
				match(INT);
				}
				break;
			case 10:
				_localctx = new BracesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(199);
				match(LPAR);
				setState(200);
				booleanOp(0);
				setState(201);
				match(RPAR);
				}
				break;
			case 11:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(203);
				expr();
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

	public static class ExprContext extends ParserRuleContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				set();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(LPAR);
				setState(208);
				expr();
				setState(209);
				match(RPAR);
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

	public static class SetContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_set);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__0);
				setState(214);
				list();
				setState(215);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__0);
				setState(218);
				match(T__1);
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
		enterRule(_localctx, 28, RULE_list);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				atom();
				setState(222);
				match(T__2);
				setState(223);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
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
			return booleanOp_sempred((BooleanOpContext)_localctx, predIndex);
		case 3:
			return equalNotequal_sempred((EqualNotequalContext)_localctx, predIndex);
		case 4:
			return plusOrMinus_sempred((PlusOrMinusContext)_localctx, predIndex);
		case 5:
			return implicationSubset_sempred((ImplicationSubsetContext)_localctx, predIndex);
		case 6:
			return union_sempred((UnionContext)_localctx, predIndex);
		case 7:
			return intersectionComplements_sempred((IntersectionComplementsContext)_localctx, predIndex);
		case 8:
			return multOrDiv_sempred((MultOrDivContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanOp_sempred(BooleanOpContext _localctx, int predIndex) {
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
	private boolean equalNotequal_sempred(EqualNotequalContext _localctx, int predIndex) {
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
	private boolean plusOrMinus_sempred(PlusOrMinusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean implicationSubset_sempred(ImplicationSubsetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean union_sempred(UnionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean intersectionComplements_sempred(IntersectionComplementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multOrDiv_sempred(MultOrDivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 6);
		case 21:
			return precpred(_ctx, 5);
		case 22:
			return precpred(_ctx, 4);
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00e7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2(\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4\f\4\16\4F"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7y\n\7\f\7\16\7|\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0087"+
		"\n\b\f\b\16\b\u008a\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0095"+
		"\n\t\f\t\16\t\u0098\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ac\n\n\f\n\16\n\u00af\13\n\3\13\3\13"+
		"\3\13\5\13\u00b4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bf\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cf\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d6\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00de\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00e5\n\20\3\20\2\t"+
		"\6\b\n\f\16\20\22\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u0103"+
		"\2\'\3\2\2\2\4)\3\2\2\2\6-\3\2\2\2\bG\3\2\2\2\na\3\2\2\2\fo\3\2\2\2\16"+
		"}\3\2\2\2\20\u008b\3\2\2\2\22\u0099\3\2\2\2\24\u00b0\3\2\2\2\26\u00be"+
		"\3\2\2\2\30\u00ce\3\2\2\2\32\u00d5\3\2\2\2\34\u00dd\3\2\2\2\36\u00e4\3"+
		"\2\2\2 !\5\4\3\2!\"\7\7\2\2\"#\5\2\2\2#(\3\2\2\2$%\5\6\4\2%&\7\7\2\2&"+
		"(\3\2\2\2\' \3\2\2\2\'$\3\2\2\2(\3\3\2\2\2)*\7\17\2\2*+\7\21\2\2+,\5\6"+
		"\4\2,\5\3\2\2\2-.\b\4\1\2./\5\b\5\2/D\3\2\2\2\60\61\f\t\2\2\61\62\7\""+
		"\2\2\62C\5\b\5\2\63\64\f\b\2\2\64\65\7\'\2\2\65C\5\b\5\2\66\67\f\7\2\2"+
		"\678\7&\2\28C\5\b\5\29:\f\6\2\2:;\7(\2\2;C\5\b\5\2<=\f\5\2\2=>\7!\2\2"+
		">C\5\b\5\2?@\f\4\2\2@A\7%\2\2AC\5\b\5\2B\60\3\2\2\2B\63\3\2\2\2B\66\3"+
		"\2\2\2B9\3\2\2\2B<\3\2\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7"+
		"\3\2\2\2FD\3\2\2\2GH\b\5\1\2HI\5\n\6\2I^\3\2\2\2JK\f\t\2\2KL\7\37\2\2"+
		"L]\5\n\6\2MN\f\b\2\2NO\7 \2\2O]\5\n\6\2PQ\f\7\2\2QR\7\33\2\2R]\5\n\6\2"+
		"ST\f\6\2\2TU\7\34\2\2U]\5\n\6\2VW\f\5\2\2WX\7\35\2\2X]\5\n\6\2YZ\f\4\2"+
		"\2Z[\7\36\2\2[]\5\n\6\2\\J\3\2\2\2\\M\3\2\2\2\\P\3\2\2\2\\S\3\2\2\2\\"+
		"V\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\t\3\2\2\2`^\3\2\2"+
		"\2ab\b\6\1\2bc\5\f\7\2cl\3\2\2\2de\f\5\2\2ef\7\22\2\2fk\5\f\7\2gh\f\4"+
		"\2\2hi\7\23\2\2ik\5\f\7\2jd\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2m\13\3\2\2\2nl\3\2\2\2op\b\7\1\2pq\5\16\b\2qz\3\2\2\2rs\f\5\2\2"+
		"st\7$\2\2ty\5\16\b\2uv\f\4\2\2vw\7)\2\2wy\5\16\b\2xr\3\2\2\2xu\3\2\2\2"+
		"y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\r\3\2\2\2|z\3\2\2\2}~\b\b\1\2~\177\5\20"+
		"\t\2\177\u0088\3\2\2\2\u0080\u0081\f\5\2\2\u0081\u0082\7,\2\2\u0082\u0087"+
		"\5\20\t\2\u0083\u0084\f\4\2\2\u0084\u0085\7.\2\2\u0085\u0087\5\20\t\2"+
		"\u0086\u0080\3\2\2\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\17\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\b\t\1\2\u008c\u008d\5\22\n\2\u008d\u0096\3\2\2\2\u008e\u008f\f"+
		"\5\2\2\u008f\u0090\7+\2\2\u0090\u0095\5\22\n\2\u0091\u0092\f\4\2\2\u0092"+
		"\u0093\7-\2\2\u0093\u0095\5\22\n\2\u0094\u008e\3\2\2\2\u0094\u0091\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\21\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\b\n\1\2\u009a\u009b\5\24\13"+
		"\2\u009b\u00ad\3\2\2\2\u009c\u009d\f\b\2\2\u009d\u009e\7\24\2\2\u009e"+
		"\u00ac\5\24\13\2\u009f\u00a0\f\7\2\2\u00a0\u00a1\7\25\2\2\u00a1\u00ac"+
		"\5\24\13\2\u00a2\u00a3\f\6\2\2\u00a3\u00a4\7\30\2\2\u00a4\u00ac\5\24\13"+
		"\2\u00a5\u00a6\f\5\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00ac\5\24\13\2\u00a8"+
		"\u00a9\f\4\2\2\u00a9\u00aa\7\32\2\2\u00aa\u00ac\5\24\13\2\u00ab\u009c"+
		"\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\23\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\5\26\f\2\u00b1\u00b2"+
		"\7\26\2\2\u00b2\u00b4\5\24\13\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2"+
		"\2\u00b4\25\3\2\2\2\u00b5\u00b6\7\23\2\2\u00b6\u00bf\5\26\f\2\u00b7\u00b8"+
		"\7#\2\2\u00b8\u00bf\5\26\f\2\u00b9\u00ba\7\27\2\2\u00ba\u00bf\5\26\f\2"+
		"\u00bb\u00bc\7*\2\2\u00bc\u00bf\5\26\f\2\u00bd\u00bf\5\30\r\2\u00be\u00b5"+
		"\3\2\2\2\u00be\u00b7\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00bb\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u00cf\7\17\2\2\u00c1\u00cf\7\n\2"+
		"\2\u00c2\u00cf\7\13\2\2\u00c3\u00cf\7\f\2\2\u00c4\u00cf\7\20\2\2\u00c5"+
		"\u00cf\7\r\2\2\u00c6\u00cf\7\16\2\2\u00c7\u00cf\7\t\2\2\u00c8\u00cf\7"+
		"\b\2\2\u00c9\u00ca\7/\2\2\u00ca\u00cb\5\6\4\2\u00cb\u00cc\7\60\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cf\5\32\16\2\u00ce\u00c0\3\2\2\2\u00ce\u00c1\3"+
		"\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce"+
		"\u00c5\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00c8\3\2"+
		"\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00d6"+
		"\5\34\17\2\u00d1\u00d2\7/\2\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\7\60\2"+
		"\2\u00d4\u00d6\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\33"+
		"\3\2\2\2\u00d7\u00d8\7\3\2\2\u00d8\u00d9\5\36\20\2\u00d9\u00da\7\4\2\2"+
		"\u00da\u00de\3\2\2\2\u00db\u00dc\7\3\2\2\u00dc\u00de\7\4\2\2\u00dd\u00d7"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\35\3\2\2\2\u00df\u00e0\5\30\r\2\u00e0"+
		"\u00e1\7\5\2\2\u00e1\u00e2\5\36\20\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\5"+
		"\30\r\2\u00e4\u00df\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\37\3\2\2\2\27\'"+
		"BD\\^jlxz\u0086\u0088\u0094\u0096\u00ab\u00ad\u00b3\u00be\u00ce\u00d5"+
		"\u00dd\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}