package org.exprint.antlr;

import java.util.HashMap;

import org.exprint.type.AtomicType;
import org.exprint.type.BooleanType;
import org.exprint.type.IntegerType;
import org.exprint.type.RealType;
import org.exprint.type.SetType;
import org.exprint.type.StringType;
import org.exprint.type.WildcardType;
import org.exprint.util.UtilSet;

import antlr.calcset.CalcSetBaseVisitor;
import antlr.calcset.CalcSetParser;
import antlr.calcset.CalcSetParser.AndContext;
import antlr.calcset.CalcSetParser.BitInversContext;
import antlr.calcset.CalcSetParser.BitLeftContext;
import antlr.calcset.CalcSetParser.BitRightContext;
import antlr.calcset.CalcSetParser.BitRightUnsignedContext;
import antlr.calcset.CalcSetParser.BitXorContext;
import antlr.calcset.CalcSetParser.CalculateContext;
import antlr.calcset.CalcSetParser.CardinalityContext;
import antlr.calcset.CalcSetParser.ComplementSetContext;
import antlr.calcset.CalcSetParser.ComplementsSetContext;
import antlr.calcset.CalcSetParser.ConstantBooleanContext;
import antlr.calcset.CalcSetParser.DisjunctiveUnionContext;
import antlr.calcset.CalcSetParser.EqualContext;
import antlr.calcset.CalcSetParser.ExpressionContext;
import antlr.calcset.CalcSetParser.GreaterContext;
import antlr.calcset.CalcSetParser.GreaterEqualContext;
import antlr.calcset.CalcSetParser.ImplicationSetContext;
import antlr.calcset.CalcSetParser.IntContext;
import antlr.calcset.CalcSetParser.IntersectionSetContext;
import antlr.calcset.CalcSetParser.LessContext;
import antlr.calcset.CalcSetParser.LessEqualContext;
import antlr.calcset.CalcSetParser.ListContext;
import antlr.calcset.CalcSetParser.NandContext;
import antlr.calcset.CalcSetParser.NequalContext;
import antlr.calcset.CalcSetParser.NorContext;
import antlr.calcset.CalcSetParser.NormContext;
import antlr.calcset.CalcSetParser.OrContext;
import antlr.calcset.CalcSetParser.OrandContext;
import antlr.calcset.CalcSetParser.OrderedComplementSetContext;
import antlr.calcset.CalcSetParser.OrderedEmptySetContext;
import antlr.calcset.CalcSetParser.OrderedPairContext;
import antlr.calcset.CalcSetParser.OrderedUniversalSetContext;
import antlr.calcset.CalcSetParser.SetVariableContext;
import antlr.calcset.CalcSetParser.StringContext;
import antlr.calcset.CalcSetParser.SubSetContext;
import antlr.calcset.CalcSetParser.UnaryNotContext;
import antlr.calcset.CalcSetParser.UnionSetContext;
import antlr.calcset.CalcSetParser.UnorderedComplementSetContext;
import antlr.calcset.CalcSetParser.UnorderedEmptySetContext;
import antlr.calcset.CalcSetParser.UnorderedPairContext;
import antlr.calcset.CalcSetParser.UnorderedUniversalSetContext;
import antlr.calcset.CalcSetParser.WildcardContext;
import antlr.calcset.CalcSetParser.XnorContext;
import antlr.calcset.CalcSetParser.XorContext;

public class EvalVisitor extends CalcSetBaseVisitor<AtomicType> {

	private HashMap<String, AtomicType> variables = new HashMap<String, AtomicType>();

	public AtomicType visitList(ListContext ctx, SetType<AtomicType> set) {
		if( ctx != null ) {
			set.add(visit(ctx.atom()));
			while (ctx.list() != null) {
				ctx = ctx.list();
				set.add(visit(ctx.atom()));
			}
		}
		return set;
	}

	@Override
	public AtomicType visitExpression(ExpressionContext ctx) {
		if (ctx.expression() != null) {
			return visit(ctx.expression());
		} else if( ctx.orderedset() != null ){
			return visit(ctx.orderedset());
		} else if( ctx.unorderedset() != null ){
			return visit(ctx.unorderedset());
		} else {
			throw new RuntimeException("Wrong expression!");
		}
	}

	@Override
	public AtomicType visitNorm(NormContext ctx) {
		return visit(ctx.orand()).norm();
	}

	@Override
	public AtomicType visitCardinality(CardinalityContext ctx) {
		return visit(ctx.orand()).cardinality();
	}
	
	@Override
	public AtomicType visitUnorderedPair(UnorderedPairContext ctx) {
		return visitList(ctx.list(), SetType.normalSet(UtilSet.unorderedSet()));
	}

	@Override
	public AtomicType visitUnorderedComplementSet(UnorderedComplementSetContext ctx) {
		return visitList(ctx.list(), SetType.complementarySet(UtilSet.unorderedSet()));
	}

	@Override
	public AtomicType visitUnorderedEmptySet(UnorderedEmptySetContext ctx) {
		return SetType.normalSet(UtilSet.unorderedSet());
	}

	@Override
	public AtomicType visitUnorderedUniversalSet(UnorderedUniversalSetContext ctx) {
		return SetType.complementarySet(UtilSet.unorderedSet());
	}

	@Override
	public AtomicType visitOrderedPair(OrderedPairContext ctx) {
		return visitList(ctx.list(), SetType.normalSet(UtilSet.orderedSet()));
	}

	@Override
	public AtomicType visitOrderedComplementSet(OrderedComplementSetContext ctx) {
		return visitList(ctx.list(), SetType.complementarySet(UtilSet.orderedSet()));
	}

	@Override
	public AtomicType visitOrderedEmptySet(OrderedEmptySetContext ctx) {
		return SetType.normalSet(UtilSet.orderedSet());
	}

	@Override
	public AtomicType visitOrderedUniversalSet(OrderedUniversalSetContext ctx) {
		return SetType.complementarySet(UtilSet.orderedSet());
	}
	
	/*
	 * *********************************
	 */

	@Override
	public AtomicType visitOr(OrContext ctx) {
		return visit(ctx.orand()).or(visit(ctx.equalgrls()));
	}

	@Override
	public AtomicType visitXor(XorContext ctx) {
		return visit(ctx.orand()).xor(visit(ctx.equalgrls()));
	}

	@Override
	public AtomicType visitNor(NorContext ctx) {
		return visit(ctx.orand()).nor(visit(ctx.equalgrls()));
	}

	@Override
	public AtomicType visitXnor(XnorContext ctx) {
		return visit(ctx.orand()).xnor(visit(ctx.equalgrls()));
	}

	@Override
	public AtomicType visitNand(NandContext ctx) {
		return visit(ctx.orand()).nand(visit(ctx.equalgrls()));
	}

	@Override
	public AtomicType visitAnd(AndContext ctx) {
		return visit(ctx.orand()).and(visit(ctx.equalgrls()));
	}

	@Override
	public AtomicType visitNequal(NequalContext ctx) {
		return visit(ctx.equalgrls()).notequal(visit(ctx.plusminus()));
	}

	@Override
	public AtomicType visitEqual(EqualContext ctx) {
		return visit(ctx.equalgrls()).equal(visit(ctx.plusminus()));
	}

	
	@Override
	public AtomicType visitGreaterEqual(GreaterEqualContext ctx) {
		return visit(ctx.equalgrls()).greaterEqual(visit(ctx.plusminus()));
	}

	@Override
	public AtomicType visitLessEqual(LessEqualContext ctx) {
		return visit(ctx.equalgrls()).lessEqual(visit(ctx.plusminus()));
	}

	@Override
	public AtomicType visitGreater(GreaterContext ctx) {
		return visit(ctx.equalgrls()).greater(visit(ctx.plusminus()));
	}

	@Override
	public AtomicType visitLess(LessContext ctx) {
		return visit(ctx.equalgrls()).less(visit(ctx.plusminus()));
	}

	@Override
	public AtomicType visitPlus(CalcSetParser.PlusContext ctx) {
		return visit(ctx.plusminus()).sum(visit(ctx.implicationsubset()));
	}

	@Override
	public AtomicType visitMinus(CalcSetParser.MinusContext ctx) {
		return visit(ctx.plusminus()).substruction(visit(ctx.implicationsubset()));
	}

	@Override
	public AtomicType visitSubSet(SubSetContext ctx) {
		return visit(ctx.implicationsubset()).subset(visit(ctx.multdiv()));
	}

	@Override
	public AtomicType visitImplicationSet(ImplicationSetContext ctx) {
		return visit(ctx.implicationsubset()).implication(visit(ctx.multdiv()));
	}
	
	@Override
	public AtomicType visitIntersectionSet(IntersectionSetContext ctx) {
		return visit(ctx.intersectioncomplements()).intersection(visit(ctx.bit()));
	}

	@Override
	public AtomicType visitUnionSet(UnionSetContext ctx) {
		return visit(ctx.uniondisjunctive()).union(visit(ctx.intersectioncomplements()));
	}

	@Override
	public AtomicType visitDisjunctiveUnion(DisjunctiveUnionContext ctx) {
		return visit(ctx.uniondisjunctive()).disjunctiveUnion(visit(ctx.intersectioncomplements()));
	}

	@Override
	public AtomicType visitComplementsSet(ComplementsSetContext ctx) {
		return visit(ctx.intersectioncomplements()).complements(visit(ctx.bit()));
	}

	@Override
	public AtomicType visitMultiplication(CalcSetParser.MultiplicationContext ctx) {
		return visit(ctx.multdiv()).multiplication(visit(ctx.uniondisjunctive()));
	}

	@Override
	public AtomicType visitDivision(CalcSetParser.DivisionContext ctx) {
		return visit(ctx.multdiv()).division(visit(ctx.uniondisjunctive()));
	}

	
 	@Override
	public AtomicType visitBitRightUnsigned(BitRightUnsignedContext ctx) {
		return visit(ctx.bit()).bitRightUnsigned(visit(ctx.power()));
	}

	@Override
	public AtomicType visitBitLeft(BitLeftContext ctx) {
		return visit(ctx.bit()).bitLeft(visit(ctx.power()));
	}

	@Override
	public AtomicType visitBitRight(BitRightContext ctx) {
		return visit(ctx.bit()).bitRight(visit(ctx.power()));
	}

	@Override
	public AtomicType visitBitXor(BitXorContext ctx) {
		return visit(ctx.bit()).bitXor(visit(ctx.power()));
	}

	@Override
	public AtomicType visitCalculate(CalculateContext ctx) {
		return visit(ctx.orand());
	}

	@Override
	public AtomicType visitSetVariable(SetVariableContext ctx) {
		OrandContext orand = ctx.orand();
		if (orand != null) {
			AtomicType value = visit(orand);
			variables.put(ctx.ID().getText(), value);
			return value;
		} else {
			return variables.get(ctx.ID().getText());
		}
	}

	@Override
	public AtomicType visitPowerPower(CalcSetParser.PowerPowerContext ctx) {
		if (ctx.power() != null) {
			return visit(ctx.unarycomplementsbitinvers()).power(visit(ctx.power()));
		} else {
			return visit(ctx.unarycomplementsbitinvers());
		}
	}

	@Override
	public AtomicType visitChangeSign(CalcSetParser.ChangeSignContext ctx) {
		return visit(ctx.unarycomplementsbitinvers()).changeSign();
	}

	@Override
	public AtomicType visitUnaryNot(UnaryNotContext ctx) {
		return visit(ctx.unarycomplementsbitinvers()).not();
	}
	
	@Override
	public AtomicType visitComplementSet(ComplementSetContext ctx) {
		return visit(ctx.unarycomplementsbitinvers()).complementSet();
	}

	@Override
	public AtomicType visitBitInvers(BitInversContext ctx) {
		return visit(ctx.unarycomplementsbitinvers()).bitInvers();
	}

	@Override
	public AtomicType visitBraces(CalcSetParser.BracesContext ctx) {
		return visit(ctx.orand());
	}

	@Override
	public AtomicType visitConstantPI(CalcSetParser.ConstantPIContext ctx) {
		return new RealType(Math.PI);
	}

	@Override
	public AtomicType visitConstantE(CalcSetParser.ConstantEContext ctx) {
		return new RealType(Math.E);
	}

	@Override
	public AtomicType visitString(StringContext ctx) {
		return new StringType(ctx.getText());
	}

	@Override
	public AtomicType visitConstantBoolean(ConstantBooleanContext ctx) {
		return new BooleanType(ctx.getText());
	}

	@Override
	public AtomicType visitDouble(CalcSetParser.DoubleContext ctx) {
		return new RealType(ctx.getText());
	}

	@Override
	public AtomicType visitInt(IntContext ctx) {
		return new IntegerType(ctx.getText());
	}

	@Override
	public AtomicType visitVariable(CalcSetParser.VariableContext ctx) {
		AtomicType atomicType = variables.get(ctx.ID().getText());
		return atomicType;
	}

	@Override
	public AtomicType visitWildcard(WildcardContext ctx) {
		return WildcardType.instance;
	}
}
