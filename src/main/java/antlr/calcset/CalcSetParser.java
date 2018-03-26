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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, COMMENT=8, WS=9, 
		NL=10, INT=11, DOUBLE=12, MATH_PI=13, MATH_E=14, TRUE=15, FALSE=16, ID=17, 
		STRING=18, ASSIGN=19, PLUS=20, MINUS=21, MULT=22, DIV=23, POW=24, BIT_INVERS=25, 
		BIT_XOR=26, BIT_LEFT=27, BIT_RIGHT=28, BIT_RIGHTU=29, GR=30, GRE=31, LS=32, 
		LSE=33, EQUAL=34, NEQUAL=35, AND=36, OR=37, NOT=38, IMPLICATION=39, NAND=40, 
		NOR=41, XOR=42, XNOR=43, INTERSECTION=44, UNION=45, COMPLEMENTS=46, SUBSET=47, 
		COMPLEMENT_SET=48, DISJUNCTIVE_UNION=49;
	public static final int
		RULE_input = 0, RULE_setVar = 1, RULE_booleanOp = 2, RULE_equalNotequal = 3, 
		RULE_plusOrMinus = 4, RULE_implicationSubset = 5, RULE_union = 6, RULE_intersectionComplements = 7, 
		RULE_multOrDiv = 8, RULE_bit = 9, RULE_pow = 10, RULE_unaryMinus = 11, 
		RULE_atom = 12, RULE_expr = 13, RULE_unorderedsetexpr = 14, RULE_orderedsetexpr = 15, 
		RULE_list = 16;
	public static final String[] ruleNames = {
		"input", "setVar", "booleanOp", "equalNotequal", "plusOrMinus", "implicationSubset", 
		"union", "intersectionComplements", "multOrDiv", "bit", "pow", "unaryMinus", 
		"atom", "expr", "unorderedsetexpr", "orderedsetexpr", "list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "','", null, null, "'\n'", 
		null, null, "'_pi'", "'_e'", "'true'", "'false'", null, null, "'='", "'+'", 
		"'-'", "'*'", "'/'", "'**'", "'~'", "'^'", "'<<'", "'>>'", "'>>>'", "'>'", 
		"'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'->'", 
		"'!&'", "'!|'", "'X|'", "'X!'", "'&'", "'|'", "'\\'", "'@'", "'''", "'/\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "COMMENT", "WS", "NL", 
		"INT", "DOUBLE", "MATH_PI", "MATH_E", "TRUE", "FALSE", "ID", "STRING", 
		"ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "POW", "BIT_INVERS", "BIT_XOR", 
		"BIT_LEFT", "BIT_RIGHT", "BIT_RIGHTU", "GR", "GRE", "LS", "LSE", "EQUAL", 
		"NEQUAL", "AND", "OR", "NOT", "IMPLICATION", "NAND", "NOR", "XOR", "XNOR", 
		"INTERSECTION", "UNION", "COMPLEMENTS", "SUBSET", "COMPLEMENT_SET", "DISJUNCTIVE_UNION"
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ToSetVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				setVar();
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
				booleanOp(0);
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
			setState(43);
			match(ID);
			setState(44);
			match(ASSIGN);
			setState(45);
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

			setState(48);
			equalNotequal(0);
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
						_localctx = new OrContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(50);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(51);
						match(OR);
						setState(52);
						equalNotequal(0);
						}
						break;
					case 2:
						{
						_localctx = new XorContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(53);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(54);
						match(XOR);
						setState(55);
						equalNotequal(0);
						}
						break;
					case 3:
						{
						_localctx = new NorContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(56);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(57);
						match(NOR);
						setState(58);
						equalNotequal(0);
						}
						break;
					case 4:
						{
						_localctx = new XnorContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60);
						match(XNOR);
						setState(61);
						equalNotequal(0);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(62);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(63);
						match(AND);
						setState(64);
						equalNotequal(0);
						}
						break;
					case 6:
						{
						_localctx = new NandContext(new BooleanOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanOp);
						setState(65);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(66);
						match(NAND);
						setState(67);
						equalNotequal(0);
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

			setState(74);
			plusOrMinus(0);
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
						_localctx = new EqualContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(76);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(77);
						match(EQUAL);
						setState(78);
						plusOrMinus(0);
						}
						break;
					case 2:
						{
						_localctx = new NequalContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(79);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(80);
						match(NEQUAL);
						setState(81);
						plusOrMinus(0);
						}
						break;
					case 3:
						{
						_localctx = new GreaterContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(82);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(83);
						match(GR);
						setState(84);
						plusOrMinus(0);
						}
						break;
					case 4:
						{
						_localctx = new GreaterEqualContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(85);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(86);
						match(GRE);
						setState(87);
						plusOrMinus(0);
						}
						break;
					case 5:
						{
						_localctx = new LessContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(88);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(89);
						match(LS);
						setState(90);
						plusOrMinus(0);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new EqualNotequalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalNotequal);
						setState(91);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(92);
						match(LSE);
						setState(93);
						plusOrMinus(0);
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

			setState(100);
			implicationSubset(0);
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
						_localctx = new PlusContext(new PlusOrMinusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusOrMinus);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						match(PLUS);
						setState(104);
						implicationSubset(0);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new PlusOrMinusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusOrMinus);
						setState(105);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(106);
						match(MINUS);
						setState(107);
						implicationSubset(0);
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

			setState(114);
			union(0);
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
						_localctx = new ImplicationSetContext(new ImplicationSubsetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_implicationSubset);
						setState(116);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(117);
						match(IMPLICATION);
						setState(118);
						union(0);
						}
						break;
					case 2:
						{
						_localctx = new SubSetContext(new ImplicationSubsetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_implicationSubset);
						setState(119);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(120);
						match(SUBSET);
						setState(121);
						union(0);
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

			setState(128);
			intersectionComplements(0);
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
						_localctx = new UnionSetContext(new UnionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_union);
						setState(130);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(131);
						match(UNION);
						setState(132);
						intersectionComplements(0);
						}
						break;
					case 2:
						{
						_localctx = new DisjunctiveUnionContext(new UnionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_union);
						setState(133);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(134);
						match(DISJUNCTIVE_UNION);
						setState(135);
						intersectionComplements(0);
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

			setState(142);
			multOrDiv(0);
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
						_localctx = new IntersectionSetContext(new IntersectionComplementsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intersectionComplements);
						setState(144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(145);
						match(INTERSECTION);
						setState(146);
						multOrDiv(0);
						}
						break;
					case 2:
						{
						_localctx = new ComplementsSetContext(new IntersectionComplementsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intersectionComplements);
						setState(147);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(148);
						match(COMPLEMENTS);
						setState(149);
						multOrDiv(0);
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
						_localctx = new MultiplicationContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						match(MULT);
						setState(160);
						bit(0);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						match(DIV);
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

			setState(170);
			pow();
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
						pow();
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
						pow();
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
						pow();
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
						pow();
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
			setState(189);
			unaryMinus(0);
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(190);
				match(POW);
				setState(191);
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

				setState(195);
				match(MINUS);
				setState(196);
				unaryMinus(5);
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
				unaryMinus(4);
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
				unaryMinus(2);
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
					_localctx = new ComplementSetContext(new UnaryMinusContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_unaryMinus);
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
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public BracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitBraces(this);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ToExprFrAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitToExprFrAtom(this);
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
	public static class AtomCardinalityContext extends AtomContext {
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public AtomCardinalityContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitAtomCardinality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atom);
		try {
			setState(228);
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
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(TRUE);
				}
				break;
			case 6:
				_localctx = new BooleanContext(_localctx);
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
				booleanOp(0);
				setState(221);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new AtomCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(223);
				match(UNION);
				setState(224);
				booleanOp(0);
				setState(225);
				match(UNION);
				}
				break;
			case 11:
				_localctx = new ToExprFrAtomContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(227);
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
		public UnorderedsetexprContext unorderedsetexpr() {
			return getRuleContext(UnorderedsetexprContext.class,0);
		}
		public OrderedsetexprContext orderedsetexpr() {
			return getRuleContext(OrderedsetexprContext.class,0);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				unorderedsetexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				orderedsetexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__0);
				setState(233);
				expr();
				setState(234);
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

	public static class UnorderedsetexprContext extends ParserRuleContext {
		public UnorderedsetexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unorderedsetexpr; }
	 
		public UnorderedsetexprContext() { }
		public void copyFrom(UnorderedsetexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnorderedEmptySetContext extends UnorderedsetexprContext {
		public UnorderedEmptySetContext(UnorderedsetexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnorderedEmptySet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnorderedSetCardinalityContext extends UnorderedsetexprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public UnorderedSetCardinalityContext(UnorderedsetexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnorderedSetCardinality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnorderedComplementSetContext extends UnorderedsetexprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode COMPLEMENT_SET() { return getToken(CalcSetParser.COMPLEMENT_SET, 0); }
		public UnorderedComplementSetContext(UnorderedsetexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnorderedComplementSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnorderedSetContext extends UnorderedsetexprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public UnorderedSetContext(UnorderedsetexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnorderedSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnorderedUniversalSetContext extends UnorderedsetexprContext {
		public TerminalNode COMPLEMENT_SET() { return getToken(CalcSetParser.COMPLEMENT_SET, 0); }
		public UnorderedUniversalSetContext(UnorderedsetexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitUnorderedUniversalSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnorderedsetexprContext unorderedsetexpr() throws RecognitionException {
		UnorderedsetexprContext _localctx = new UnorderedsetexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unorderedsetexpr);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new UnorderedSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(T__2);
				setState(239);
				list();
				setState(240);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new UnorderedSetCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(UNION);
				setState(243);
				list();
				setState(244);
				match(UNION);
				}
				break;
			case 3:
				_localctx = new UnorderedComplementSetContext(_localctx);
				enterOuterAlt(_localctx, 3);
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
			case 4:
				_localctx = new UnorderedEmptySetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(T__2);
				setState(252);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new UnorderedUniversalSetContext(_localctx);
				enterOuterAlt(_localctx, 5);
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

	public static class OrderedsetexprContext extends ParserRuleContext {
		public OrderedsetexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedsetexpr; }
	 
		public OrderedsetexprContext() { }
		public void copyFrom(OrderedsetexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrderedSetContext extends OrderedsetexprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public OrderedSetContext(OrderedsetexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOrderedSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderedUniversalSetContext extends OrderedsetexprContext {
		public TerminalNode COMPLEMENT_SET() { return getToken(CalcSetParser.COMPLEMENT_SET, 0); }
		public OrderedUniversalSetContext(OrderedsetexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOrderedUniversalSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderedSetCardinalityContext extends OrderedsetexprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public OrderedSetCardinalityContext(OrderedsetexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOrderedSetCardinality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderedComplementSetContext extends OrderedsetexprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode COMPLEMENT_SET() { return getToken(CalcSetParser.COMPLEMENT_SET, 0); }
		public OrderedComplementSetContext(OrderedsetexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOrderedComplementSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderedEmptySetContext extends OrderedsetexprContext {
		public OrderedEmptySetContext(OrderedsetexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcSetVisitor ) return ((CalcSetVisitor<? extends T>)visitor).visitOrderedEmptySet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedsetexprContext orderedsetexpr() throws RecognitionException {
		OrderedsetexprContext _localctx = new OrderedsetexprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderedsetexpr);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new OrderedSetContext(_localctx);
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
				_localctx = new OrderedSetCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(UNION);
				setState(263);
				list();
				setState(264);
				match(UNION);
				}
				break;
			case 3:
				_localctx = new OrderedComplementSetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(T__4);
				setState(267);
				list();
				setState(268);
				match(T__5);
				setState(269);
				match(COMPLEMENT_SET);
				}
				break;
			case 4:
				_localctx = new OrderedEmptySetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(T__4);
				setState(272);
				match(T__5);
				}
				break;
			case 5:
				_localctx = new OrderedUniversalSetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				match(T__4);
				setState(274);
				match(T__5);
				setState(275);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				atom();
				setState(279);
				match(T__6);
				setState(280);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
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
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0120\4\2\t\2"+
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
		"\16\3\16\5\16\u00e7\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ef\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0103\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0117\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u011e\n\22\3\22\2\13\6\b\n\f\16\20\22\24"+
		"\30\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u0143\2+\3\2\2"+
		"\2\4-\3\2\2\2\6\61\3\2\2\2\bK\3\2\2\2\ne\3\2\2\2\fs\3\2\2\2\16\u0081\3"+
		"\2\2\2\20\u008f\3\2\2\2\22\u009d\3\2\2\2\24\u00ab\3\2\2\2\26\u00bf\3\2"+
		"\2\2\30\u00cc\3\2\2\2\32\u00e6\3\2\2\2\34\u00ee\3\2\2\2\36\u0102\3\2\2"+
		"\2 \u0116\3\2\2\2\"\u011d\3\2\2\2$%\5\4\3\2%&\7\f\2\2&\'\5\2\2\2\',\3"+
		"\2\2\2()\5\6\4\2)*\7\f\2\2*,\3\2\2\2+$\3\2\2\2+(\3\2\2\2,\3\3\2\2\2-."+
		"\7\23\2\2./\7\25\2\2/\60\5\6\4\2\60\5\3\2\2\2\61\62\b\4\1\2\62\63\5\b"+
		"\5\2\63H\3\2\2\2\64\65\f\t\2\2\65\66\7\'\2\2\66G\5\b\5\2\678\f\b\2\28"+
		"9\7,\2\29G\5\b\5\2:;\f\7\2\2;<\7+\2\2<G\5\b\5\2=>\f\6\2\2>?\7-\2\2?G\5"+
		"\b\5\2@A\f\5\2\2AB\7&\2\2BG\5\b\5\2CD\f\4\2\2DE\7*\2\2EG\5\b\5\2F\64\3"+
		"\2\2\2F\67\3\2\2\2F:\3\2\2\2F=\3\2\2\2F@\3\2\2\2FC\3\2\2\2GJ\3\2\2\2H"+
		"F\3\2\2\2HI\3\2\2\2I\7\3\2\2\2JH\3\2\2\2KL\b\5\1\2LM\5\n\6\2Mb\3\2\2\2"+
		"NO\f\t\2\2OP\7$\2\2Pa\5\n\6\2QR\f\b\2\2RS\7%\2\2Sa\5\n\6\2TU\f\7\2\2U"+
		"V\7 \2\2Va\5\n\6\2WX\f\6\2\2XY\7!\2\2Ya\5\n\6\2Z[\f\5\2\2[\\\7\"\2\2\\"+
		"a\5\n\6\2]^\f\4\2\2^_\7#\2\2_a\5\n\6\2`N\3\2\2\2`Q\3\2\2\2`T\3\2\2\2`"+
		"W\3\2\2\2`Z\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2"+
		"db\3\2\2\2ef\b\6\1\2fg\5\f\7\2gp\3\2\2\2hi\f\5\2\2ij\7\26\2\2jo\5\f\7"+
		"\2kl\f\4\2\2lm\7\27\2\2mo\5\f\7\2nh\3\2\2\2nk\3\2\2\2or\3\2\2\2pn\3\2"+
		"\2\2pq\3\2\2\2q\13\3\2\2\2rp\3\2\2\2st\b\7\1\2tu\5\16\b\2u~\3\2\2\2vw"+
		"\f\5\2\2wx\7)\2\2x}\5\16\b\2yz\f\4\2\2z{\7\61\2\2{}\5\16\b\2|v\3\2\2\2"+
		"|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\r\3\2\2\2\u0080~"+
		"\3\2\2\2\u0081\u0082\b\b\1\2\u0082\u0083\5\20\t\2\u0083\u008c\3\2\2\2"+
		"\u0084\u0085\f\5\2\2\u0085\u0086\7/\2\2\u0086\u008b\5\20\t\2\u0087\u0088"+
		"\f\4\2\2\u0088\u0089\7\63\2\2\u0089\u008b\5\20\t\2\u008a\u0084\3\2\2\2"+
		"\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\17\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\t\1\2\u0090"+
		"\u0091\5\22\n\2\u0091\u009a\3\2\2\2\u0092\u0093\f\5\2\2\u0093\u0094\7"+
		".\2\2\u0094\u0099\5\22\n\2\u0095\u0096\f\4\2\2\u0096\u0097\7\60\2\2\u0097"+
		"\u0099\5\22\n\2\u0098\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\21\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\b\n\1\2\u009e\u009f\5\24\13\2\u009f\u00a8\3"+
		"\2\2\2\u00a0\u00a1\f\5\2\2\u00a1\u00a2\7\30\2\2\u00a2\u00a7\5\24\13\2"+
		"\u00a3\u00a4\f\4\2\2\u00a4\u00a5\7\31\2\2\u00a5\u00a7\5\24\13\2\u00a6"+
		"\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\23\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac"+
		"\b\13\1\2\u00ac\u00ad\5\26\f\2\u00ad\u00bc\3\2\2\2\u00ae\u00af\f\7\2\2"+
		"\u00af\u00b0\7\35\2\2\u00b0\u00bb\5\26\f\2\u00b1\u00b2\f\6\2\2\u00b2\u00b3"+
		"\7\36\2\2\u00b3\u00bb\5\26\f\2\u00b4\u00b5\f\5\2\2\u00b5\u00b6\7\37\2"+
		"\2\u00b6\u00bb\5\26\f\2\u00b7\u00b8\f\4\2\2\u00b8\u00b9\7\34\2\2\u00b9"+
		"\u00bb\5\26\f\2\u00ba\u00ae\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b4\3"+
		"\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\25\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\5\30\r"+
		"\2\u00c0\u00c1\7\32\2\2\u00c1\u00c3\5\26\f\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\27\3\2\2\2\u00c4\u00c5\b\r\1\2\u00c5\u00c6\7\27\2"+
		"\2\u00c6\u00cd\5\30\r\7\u00c7\u00c8\7(\2\2\u00c8\u00cd\5\30\r\6\u00c9"+
		"\u00ca\7\33\2\2\u00ca\u00cd\5\30\r\4\u00cb\u00cd\5\32\16\2\u00cc\u00c4"+
		"\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00d2\3\2\2\2\u00ce\u00cf\f\5\2\2\u00cf\u00d1\7\62\2\2\u00d0\u00ce\3"+
		"\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\31\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00e7\7\23\2\2\u00d6\u00e7\7\17"+
		"\2\2\u00d7\u00e7\7\20\2\2\u00d8\u00e7\7\24\2\2\u00d9\u00e7\7\21\2\2\u00da"+
		"\u00e7\7\22\2\2\u00db\u00e7\7\16\2\2\u00dc\u00e7\7\r\2\2\u00dd\u00de\7"+
		"\3\2\2\u00de\u00df\5\6\4\2\u00df\u00e0\7\4\2\2\u00e0\u00e7\3\2\2\2\u00e1"+
		"\u00e2\7/\2\2\u00e2\u00e3\5\6\4\2\u00e3\u00e4\7/\2\2\u00e4\u00e7\3\2\2"+
		"\2\u00e5\u00e7\5\34\17\2\u00e6\u00d5\3\2\2\2\u00e6\u00d6\3\2\2\2\u00e6"+
		"\u00d7\3\2\2\2\u00e6\u00d8\3\2\2\2\u00e6\u00d9\3\2\2\2\u00e6\u00da\3\2"+
		"\2\2\u00e6\u00db\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6"+
		"\u00e1\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\33\3\2\2\2\u00e8\u00ef\5\36\20"+
		"\2\u00e9\u00ef\5 \21\2\u00ea\u00eb\7\3\2\2\u00eb\u00ec\5\34\17\2\u00ec"+
		"\u00ed\7\4\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00e9\3\2"+
		"\2\2\u00ee\u00ea\3\2\2\2\u00ef\35\3\2\2\2\u00f0\u00f1\7\5\2\2\u00f1\u00f2"+
		"\5\"\22\2\u00f2\u00f3\7\6\2\2\u00f3\u0103\3\2\2\2\u00f4\u00f5\7/\2\2\u00f5"+
		"\u00f6\5\"\22\2\u00f6\u00f7\7/\2\2\u00f7\u0103\3\2\2\2\u00f8\u00f9\7\5"+
		"\2\2\u00f9\u00fa\5\"\22\2\u00fa\u00fb\7\6\2\2\u00fb\u00fc\7\62\2\2\u00fc"+
		"\u0103\3\2\2\2\u00fd\u00fe\7\5\2\2\u00fe\u0103\7\6\2\2\u00ff\u0100\7\5"+
		"\2\2\u0100\u0101\7\6\2\2\u0101\u0103\7\62\2\2\u0102\u00f0\3\2\2\2\u0102"+
		"\u00f4\3\2\2\2\u0102\u00f8\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00ff\3\2"+
		"\2\2\u0103\37\3\2\2\2\u0104\u0105\7\7\2\2\u0105\u0106\5\"\22\2\u0106\u0107"+
		"\7\b\2\2\u0107\u0117\3\2\2\2\u0108\u0109\7/\2\2\u0109\u010a\5\"\22\2\u010a"+
		"\u010b\7/\2\2\u010b\u0117\3\2\2\2\u010c\u010d\7\7\2\2\u010d\u010e\5\""+
		"\22\2\u010e\u010f\7\b\2\2\u010f\u0110\7\62\2\2\u0110\u0117\3\2\2\2\u0111"+
		"\u0112\7\7\2\2\u0112\u0117\7\b\2\2\u0113\u0114\7\7\2\2\u0114\u0115\7\b"+
		"\2\2\u0115\u0117\7\62\2\2\u0116\u0104\3\2\2\2\u0116\u0108\3\2\2\2\u0116"+
		"\u010c\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0113\3\2\2\2\u0117!\3\2\2\2"+
		"\u0118\u0119\5\32\16\2\u0119\u011a\7\t\2\2\u011a\u011b\5\"\22\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011e\5\32\16\2\u011d\u0118\3\2\2\2\u011d\u011c\3"+
		"\2\2\2\u011e#\3\2\2\2\33+FH`bnp|~\u008a\u008c\u0098\u009a\u00a6\u00a8"+
		"\u00ba\u00bc\u00c2\u00cc\u00d2\u00e6\u00ee\u0102\u0116\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}