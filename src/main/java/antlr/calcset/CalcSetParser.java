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
		MINUS=17, MULT=18, DIV=19, POW=20, BIT_INVERS=21, BIT_XOR=22, BIT_LEFT=23, 
		BIT_RIGHT=24, BIT_RIGHTU=25, GR=26, GRE=27, LS=28, LSE=29, EQUAL=30, NEQUAL=31, 
		AND=32, OR=33, NOT=34, IMPLICATION=35, NAND=36, NOR=37, XOR=38, XNOR=39, 
		CARDINALITY=40, INTERSECTION=41, UNION=42, COMPLEMENTS=43, SUBSET=44, 
		COMPLEMENT_SET=45, DISJUNCTIVE_UNION=46, LPAR=47, RPAR=48;
	public static final int
		RULE_input = 0, RULE_setVar = 1, RULE_booleanOp = 2, RULE_equalNotequal = 3, 
		RULE_plusOrMinus = 4, RULE_implicationSubset = 5, RULE_union = 6, RULE_intersectionComplements = 7, 
		RULE_multOrDiv = 8, RULE_bit = 9, RULE_pow = 10, RULE_unaryMinus = 11, 
		RULE_atom = 12, RULE_expr = 13, RULE_set = 14, RULE_list = 15;
	public static final String[] ruleNames = {
		"input", "setVar", "booleanOp", "equalNotequal", "plusOrMinus", "implicationSubset", 
		"union", "intersectionComplements", "multOrDiv", "bit", "pow", "unaryMinus", 
		"atom", "expr", "set", "list"
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ToSetVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				setVar();
				setState(33);
				match(NL);
				setState(34);
				input();
				}
				break;
			case 2:
				_localctx = new CalculateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				booleanOp(0);
				setState(37);
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
			setState(41);
			match(ID);
			setState(42);
			match(ASSIGN);
			setState(43);
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

			setState(46);
			equalNotequal(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new OrContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(48);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(49);
						match(OR);
						setState(50);
						equalNotequal(0);
						}
						break;
					case 2:
						{
						_localctx = new XorContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(51);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(52);
						match(XOR);
						setState(53);
						equalNotequal(0);
						}
						break;
					case 3:
						{
						_localctx = new NorContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(54);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(55);
						match(NOR);
						setState(56);
						equalNotequal(0);
						}
						break;
					case 4:
						{
						_localctx = new XnorContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(57);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(58);
						match(XNOR);
						setState(59);
						equalNotequal(0);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(60);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(61);
						match(AND);
						setState(62);
						equalNotequal(0);
						}
						break;
					case 6:
						{
						_localctx = new NandContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(63);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(64);
						match(NAND);
						setState(65);
						equalNotequal(0);
						}
						break;
					}
					} 
				}
				setState(70);
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

			setState(72);
			plusOrMinus(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new EqualContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(74);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(75);
						match(EQUAL);
						setState(76);
						plusOrMinus(0);
						}
						break;
					case 2:
						{
						_localctx = new NequalContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(77);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(78);
						match(NEQUAL);
						setState(79);
						plusOrMinus(0);
						}
						break;
					case 3:
						{
						_localctx = new GreaterContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(80);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(81);
						match(GR);
						setState(82);
						plusOrMinus(0);
						}
						break;
					case 4:
						{
						_localctx = new GreaterEqualContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(83);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(84);
						match(GRE);
						setState(85);
						plusOrMinus(0);
						}
						break;
					case 5:
						{
						_localctx = new LessContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(86);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(87);
						match(LS);
						setState(88);
						plusOrMinus(0);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(89);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(90);
						match(LSE);
						setState(91);
						plusOrMinus(0);
						}
						break;
					}
					} 
				}
				setState(96);
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

			setState(98);
			implicationSubset(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new PlusOrMinusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusOrMinus);
						setState(100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101);
						match(PLUS);
						setState(102);
						implicationSubset(0);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new PlusOrMinusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusOrMinus);
						setState(103);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(104);
						match(MINUS);
						setState(105);
						implicationSubset(0);
						}
						break;
					}
					} 
				}
				setState(110);
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

			setState(112);
			union(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ImplicationSetContext(new ImplicationSubsetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_implicationSubset);
						setState(114);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(115);
						match(IMPLICATION);
						setState(116);
						union(0);
						}
						break;
					case 2:
						{
						_localctx = new SubSetContext(new ImplicationSubsetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_implicationSubset);
						setState(117);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(118);
						match(SUBSET);
						setState(119);
						union(0);
						}
						break;
					}
					} 
				}
				setState(124);
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

			setState(126);
			intersectionComplements(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new UnionSetContext(new UnionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_union);
						setState(128);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(129);
						match(UNION);
						setState(130);
						intersectionComplements(0);
						}
						break;
					case 2:
						{
						_localctx = new DisjunctiveUnionContext(new UnionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_union);
						setState(131);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(132);
						match(DISJUNCTIVE_UNION);
						setState(133);
						intersectionComplements(0);
						}
						break;
					}
					} 
				}
				setState(138);
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

			setState(140);
			multOrDiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new IntersectionSetContext(new IntersectionComplementsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intersectionComplements);
						setState(142);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(143);
						match(INTERSECTION);
						setState(144);
						multOrDiv(0);
						}
						break;
					case 2:
						{
						_localctx = new ComplementsSetContext(new IntersectionComplementsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intersectionComplements);
						setState(145);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(146);
						match(COMPLEMENTS);
						setState(147);
						multOrDiv(0);
						}
						break;
					}
					} 
				}
				setState(152);
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
	public static class ToBitContext extends MultOrDivContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public ToBitContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToBit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends MultOrDivContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CalcSetParser.MULT, 0); }
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public MultiplicationContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends MultOrDivContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public TerminalNode DIV() { return getToken(CalcSetParser.DIV, 0); }
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public DivisionContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitDivision(this);
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
			_localctx = new ToBitContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(154);
			bit(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(156);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(157);
						match(MULT);
						setState(158);
						bit(0);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(159);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(160);
						match(DIV);
						setState(161);
						bit(0);
						}
						break;
					}
					} 
				}
				setState(166);
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
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
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
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
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
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
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
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public BitRightContext(BitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBitRight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToPowContext extends BitContext {
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
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

			setState(168);
			pow();
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new BitLeftContext(new BitContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(171);
						match(BIT_LEFT);
						setState(172);
						pow();
						}
						break;
					case 2:
						{
						_localctx = new BitRightContext(new BitContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(173);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(174);
						match(BIT_RIGHT);
						setState(175);
						pow();
						}
						break;
					case 3:
						{
						_localctx = new BitRightUnsignedContext(new BitContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(176);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(177);
						match(BIT_RIGHTU);
						setState(178);
						pow();
						}
						break;
					case 4:
						{
						_localctx = new BitXorContext(new BitContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(179);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(180);
						match(BIT_XOR);
						setState(181);
						pow();
						}
						break;
					}
					} 
				}
				setState(186);
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
		enterRule(_localctx, 20, RULE_pow);
		try {
			_localctx = new PowerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			unaryMinus(0);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(188);
				match(POW);
				setState(189);
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
	public static class ComplementSetContext extends UnaryMinusContext {
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public TerminalNode COMPLEMENT_SET() { return getToken(CalcSetParser.COMPLEMENT_SET, 0); }
		public ComplementSetContext(UnaryMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitComplementSet(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode BIT_INVERS() { return getToken(CalcSetParser.BIT_INVERS, 0); }
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
		return unaryMinus(0);
	}

	private UnaryMinusContext unaryMinus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnaryMinusContext _localctx = new UnaryMinusContext(_ctx, _parentState);
		UnaryMinusContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_unaryMinus, _p);
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

				setState(193);
				match(MINUS);
				setState(194);
				unaryMinus(6);
				}
				break;
			case NOT:
				{
				_localctx = new UnaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(NOT);
				setState(196);
				unaryMinus(5);
				}
				break;
			case BIT_INVERS:
				{
				_localctx = new BitInversContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(BIT_INVERS);
				setState(198);
				unaryMinus(3);
				}
				break;
			case CARDINALITY:
				{
				_localctx = new CardinalityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(CARDINALITY);
				setState(200);
				unaryMinus(2);
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
					_localctx = new ComplementSetContext(new UnaryMinusContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_unaryMinus);
					setState(204);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
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
		enterRule(_localctx, 24, RULE_atom);
		try {
			setState(225);
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
				_localctx = new UniversalSetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(UNIVERSAL_SET);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(TRUE);
				}
				break;
			case 7:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(217);
				match(FALSE);
				}
				break;
			case 8:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				match(DOUBLE);
				}
				break;
			case 9:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(219);
				match(INT);
				}
				break;
			case 10:
				_localctx = new BracesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(220);
				match(LPAR);
				setState(221);
				booleanOp(0);
				setState(222);
				match(RPAR);
				}
				break;
			case 11:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(224);
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
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				set();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(LPAR);
				setState(229);
				expr();
				setState(230);
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
		enterRule(_localctx, 28, RULE_set);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__0);
				setState(235);
				list();
				setState(236);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__0);
				setState(239);
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
		enterRule(_localctx, 30, RULE_list);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				atom();
				setState(243);
				match(T__2);
				setState(244);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
		case 9:
			return bit_sempred((BitContext)_localctx, predIndex);
		case 11:
			return unaryMinus_sempred((UnaryMinusContext)_localctx, predIndex);
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
	private boolean unaryMinus_sempred(UnaryMinusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u00fc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2*\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4E\n\4"+
		"\f\4\16\4H\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0097\n\t\f\t\16\t\u009a\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00a5\n\n\f\n\16\n\u00a8\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b9\n\13\f\13\16\13\u00bc"+
		"\13\13\3\f\3\f\3\f\5\f\u00c1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00cd\n\r\3\r\3\r\7\r\u00d1\n\r\f\r\16\r\u00d4\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e4"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00eb\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00f3\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00fa\n\21\3\21\2"+
		"\13\6\b\n\f\16\20\22\24\30\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\2\2\2\u0119\2)\3\2\2\2\4+\3\2\2\2\6/\3\2\2\2\bI\3\2\2\2\nc\3\2\2\2\f"+
		"q\3\2\2\2\16\177\3\2\2\2\20\u008d\3\2\2\2\22\u009b\3\2\2\2\24\u00a9\3"+
		"\2\2\2\26\u00bd\3\2\2\2\30\u00cc\3\2\2\2\32\u00e3\3\2\2\2\34\u00ea\3\2"+
		"\2\2\36\u00f2\3\2\2\2 \u00f9\3\2\2\2\"#\5\4\3\2#$\7\7\2\2$%\5\2\2\2%*"+
		"\3\2\2\2&\'\5\6\4\2\'(\7\7\2\2(*\3\2\2\2)\"\3\2\2\2)&\3\2\2\2*\3\3\2\2"+
		"\2+,\7\17\2\2,-\7\21\2\2-.\5\6\4\2.\5\3\2\2\2/\60\b\4\1\2\60\61\5\b\5"+
		"\2\61F\3\2\2\2\62\63\f\t\2\2\63\64\7#\2\2\64E\5\b\5\2\65\66\f\b\2\2\66"+
		"\67\7(\2\2\67E\5\b\5\289\f\7\2\29:\7\'\2\2:E\5\b\5\2;<\f\6\2\2<=\7)\2"+
		"\2=E\5\b\5\2>?\f\5\2\2?@\7\"\2\2@E\5\b\5\2AB\f\4\2\2BC\7&\2\2CE\5\b\5"+
		"\2D\62\3\2\2\2D\65\3\2\2\2D8\3\2\2\2D;\3\2\2\2D>\3\2\2\2DA\3\2\2\2EH\3"+
		"\2\2\2FD\3\2\2\2FG\3\2\2\2G\7\3\2\2\2HF\3\2\2\2IJ\b\5\1\2JK\5\n\6\2K`"+
		"\3\2\2\2LM\f\t\2\2MN\7 \2\2N_\5\n\6\2OP\f\b\2\2PQ\7!\2\2Q_\5\n\6\2RS\f"+
		"\7\2\2ST\7\34\2\2T_\5\n\6\2UV\f\6\2\2VW\7\35\2\2W_\5\n\6\2XY\f\5\2\2Y"+
		"Z\7\36\2\2Z_\5\n\6\2[\\\f\4\2\2\\]\7\37\2\2]_\5\n\6\2^L\3\2\2\2^O\3\2"+
		"\2\2^R\3\2\2\2^U\3\2\2\2^X\3\2\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2a\t\3\2\2\2b`\3\2\2\2cd\b\6\1\2de\5\f\7\2en\3\2\2\2fg\f\5\2\2gh\7"+
		"\22\2\2hm\5\f\7\2ij\f\4\2\2jk\7\23\2\2km\5\f\7\2lf\3\2\2\2li\3\2\2\2m"+
		"p\3\2\2\2nl\3\2\2\2no\3\2\2\2o\13\3\2\2\2pn\3\2\2\2qr\b\7\1\2rs\5\16\b"+
		"\2s|\3\2\2\2tu\f\5\2\2uv\7%\2\2v{\5\16\b\2wx\f\4\2\2xy\7.\2\2y{\5\16\b"+
		"\2zt\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~|\3\2"+
		"\2\2\177\u0080\b\b\1\2\u0080\u0081\5\20\t\2\u0081\u008a\3\2\2\2\u0082"+
		"\u0083\f\5\2\2\u0083\u0084\7,\2\2\u0084\u0089\5\20\t\2\u0085\u0086\f\4"+
		"\2\2\u0086\u0087\7\60\2\2\u0087\u0089\5\20\t\2\u0088\u0082\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\17\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\t\1\2\u008e\u008f"+
		"\5\22\n\2\u008f\u0098\3\2\2\2\u0090\u0091\f\5\2\2\u0091\u0092\7+\2\2\u0092"+
		"\u0097\5\22\n\2\u0093\u0094\f\4\2\2\u0094\u0095\7-\2\2\u0095\u0097\5\22"+
		"\n\2\u0096\u0090\3\2\2\2\u0096\u0093\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\21\3\2\2\2\u009a\u0098\3\2\2"+
		"\2\u009b\u009c\b\n\1\2\u009c\u009d\5\24\13\2\u009d\u00a6\3\2\2\2\u009e"+
		"\u009f\f\5\2\2\u009f\u00a0\7\24\2\2\u00a0\u00a5\5\24\13\2\u00a1\u00a2"+
		"\f\4\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a5\5\24\13\2\u00a4\u009e\3\2\2"+
		"\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\23\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\b\13\1\2\u00aa"+
		"\u00ab\5\26\f\2\u00ab\u00ba\3\2\2\2\u00ac\u00ad\f\7\2\2\u00ad\u00ae\7"+
		"\31\2\2\u00ae\u00b9\5\26\f\2\u00af\u00b0\f\6\2\2\u00b0\u00b1\7\32\2\2"+
		"\u00b1\u00b9\5\26\f\2\u00b2\u00b3\f\5\2\2\u00b3\u00b4\7\33\2\2\u00b4\u00b9"+
		"\5\26\f\2\u00b5\u00b6\f\4\2\2\u00b6\u00b7\7\30\2\2\u00b7\u00b9\5\26\f"+
		"\2\u00b8\u00ac\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\25\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\5\30\r\2\u00be\u00bf\7\26"+
		"\2\2\u00bf\u00c1\5\26\f\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\27\3\2\2\2\u00c2\u00c3\b\r\1\2\u00c3\u00c4\7\23\2\2\u00c4\u00cd\5\30"+
		"\r\b\u00c5\u00c6\7$\2\2\u00c6\u00cd\5\30\r\7\u00c7\u00c8\7\27\2\2\u00c8"+
		"\u00cd\5\30\r\5\u00c9\u00ca\7*\2\2\u00ca\u00cd\5\30\r\4\u00cb\u00cd\5"+
		"\32\16\2\u00cc\u00c2\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc"+
		"\u00c9\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d2\3\2\2\2\u00ce\u00cf\f\6"+
		"\2\2\u00cf\u00d1\7/\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d2\3\2\2"+
		"\2\u00d5\u00e4\7\17\2\2\u00d6\u00e4\7\n\2\2\u00d7\u00e4\7\13\2\2\u00d8"+
		"\u00e4\7\f\2\2\u00d9\u00e4\7\20\2\2\u00da\u00e4\7\r\2\2\u00db\u00e4\7"+
		"\16\2\2\u00dc\u00e4\7\t\2\2\u00dd\u00e4\7\b\2\2\u00de\u00df\7\61\2\2\u00df"+
		"\u00e0\5\6\4\2\u00e0\u00e1\7\62\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e4\5"+
		"\34\17\2\u00e3\u00d5\3\2\2\2\u00e3\u00d6\3\2\2\2\u00e3\u00d7\3\2\2\2\u00e3"+
		"\u00d8\3\2\2\2\u00e3\u00d9\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2"+
		"\2\2\u00e3\u00dc\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\33\3\2\2\2\u00e5\u00eb\5\36\20\2\u00e6\u00e7\7\61"+
		"\2\2\u00e7\u00e8\5\34\17\2\u00e8\u00e9\7\62\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\35\3\2\2\2\u00ec\u00ed\7\3\2"+
		"\2\u00ed\u00ee\5 \21\2\u00ee\u00ef\7\4\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f1"+
		"\7\3\2\2\u00f1\u00f3\7\4\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\37\3\2\2\2\u00f4\u00f5\5\32\16\2\u00f5\u00f6\7\5\2\2\u00f6\u00f7\5 \21"+
		"\2\u00f7\u00fa\3\2\2\2\u00f8\u00fa\5\32\16\2\u00f9\u00f4\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa!\3\2\2\2\32)DF^`lnz|\u0088\u008a\u0096\u0098\u00a4"+
		"\u00a6\u00b8\u00ba\u00c0\u00cc\u00d2\u00e3\u00ea\u00f2\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}