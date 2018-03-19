package org.exprint.antlr;

import java.util.HashMap;

import org.exprint.type.AtomicType;
import org.exprint.type.BooleanType;
import org.exprint.type.IntegerType;
import org.exprint.type.RealType;
import org.exprint.type.SetType;
import org.exprint.type.StringType;
import org.exprint.util.UtilSet;

import antlr.calcset.CalcSetBaseVisitor;
import antlr.calcset.CalcSetParser;
import antlr.calcset.CalcSetParser.AndContext;
import antlr.calcset.CalcSetParser.BitInversContext;
import antlr.calcset.CalcSetParser.BitLeftContext;
import antlr.calcset.CalcSetParser.BitRightContext;
import antlr.calcset.CalcSetParser.BitRightUnsignedContext;
import antlr.calcset.CalcSetParser.BitXorContext;
import antlr.calcset.CalcSetParser.BooleanContext;
import antlr.calcset.CalcSetParser.BooleanOpContext;
import antlr.calcset.CalcSetParser.CalculateContext;
import antlr.calcset.CalcSetParser.CardinalityContext;
import antlr.calcset.CalcSetParser.ComplementSetContext;
import antlr.calcset.CalcSetParser.ComplementsSetContext;
import antlr.calcset.CalcSetParser.DisjunctiveUnionContext;
import antlr.calcset.CalcSetParser.EqualContext;
import antlr.calcset.CalcSetParser.ExprContext;
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
import antlr.calcset.CalcSetParser.OrContext;
import antlr.calcset.CalcSetParser.OrderedComplementSetInstContext;
import antlr.calcset.CalcSetParser.OrderedEmptySetInstContext;
import antlr.calcset.CalcSetParser.OrderedSetInstContext;
import antlr.calcset.CalcSetParser.OrderedUniversalSetInstContext;
import antlr.calcset.CalcSetParser.SetVariableContext;
import antlr.calcset.CalcSetParser.StringContext;
import antlr.calcset.CalcSetParser.SubSetContext;
import antlr.calcset.CalcSetParser.UnaryNotContext;
import antlr.calcset.CalcSetParser.UnionSetContext;
import antlr.calcset.CalcSetParser.UniversalSetContext;
import antlr.calcset.CalcSetParser.UnorderedComplementSetInstContext;
import antlr.calcset.CalcSetParser.UnorderedEmptySetInstContext;
import antlr.calcset.CalcSetParser.UnorderedSetInstContext;
import antlr.calcset.CalcSetParser.UnorderedUniversalSetInstContext;
import antlr.calcset.CalcSetParser.XnorContext;
import antlr.calcset.CalcSetParser.XorContext;

public class EvalVisitor extends CalcSetBaseVisitor<AtomicType> {

	private HashMap<String, AtomicType> variables = new HashMap<String, AtomicType>();

	@Override
	public AtomicType visitExpr(ExprContext ctx) {
		if (ctx.expr() != null) {
			return visit(ctx.expr());
		} else if( ctx.orderedset() != null ){
			return visit(ctx.orderedset());
		} else {
			return visit(ctx.unorderedset());
		}
	}

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
	public AtomicType visitUnorderedSetInst(UnorderedSetInstContext ctx) {
		return visitList(ctx.list(), SetType.normalSet(UtilSet.unorderedSet()));
	}

	@Override
	public AtomicType visitUnorderedComplementSetInst(UnorderedComplementSetInstContext ctx) {
		return visitList(ctx.list(), SetType.complementarySet(UtilSet.unorderedSet()));
	}

	@Override
	public AtomicType visitUnorderedEmptySetInst(UnorderedEmptySetInstContext ctx) {
		return SetType.normalSet(UtilSet.unorderedSet());
	}

	@Override
	public AtomicType visitUnorderedUniversalSetInst(UnorderedUniversalSetInstContext ctx) {
		return SetType.complementarySet(UtilSet.unorderedSet());
	}

	@Override
	public AtomicType visitOrderedSetInst(OrderedSetInstContext ctx) {
		return visitList(ctx.list(), SetType.normalSet(UtilSet.orderedSet()));
	}

	@Override
	public AtomicType visitOrderedComplementSetInst(OrderedComplementSetInstContext ctx) {
		return visitList(ctx.list(), SetType.complementarySet(UtilSet.orderedSet()));
	}

	@Override
	public AtomicType visitOrderedEmptySetInst(OrderedEmptySetInstContext ctx) {
		return SetType.normalSet(UtilSet.orderedSet());
	}

	@Override
	public AtomicType visitOrderedUniversalSetInst(OrderedUniversalSetInstContext ctx) {
		return SetType.complementarySet(UtilSet.orderedSet());
	}
	
	/*
	 * *********************************
	 */

	@Override
	public AtomicType visitOr(OrContext ctx) {
		return visit(ctx.booleanOp()).or(visit(ctx.equalNotequal()));
	}

	@Override
	public AtomicType visitXor(XorContext ctx) {
		return visit(ctx.booleanOp()).xor(visit(ctx.equalNotequal()));
	}

	@Override
	public AtomicType visitNor(NorContext ctx) {
		return visit(ctx.booleanOp()).nor(visit(ctx.equalNotequal()));
	}

	@Override
	public AtomicType visitXnor(XnorContext ctx) {
		return visit(ctx.booleanOp()).xnor(visit(ctx.equalNotequal()));
	}

	@Override
	public AtomicType visitNand(NandContext ctx) {
		return visit(ctx.booleanOp()).nand(visit(ctx.equalNotequal()));
	}

	@Override
	public AtomicType visitAnd(AndContext ctx) {
		return visit(ctx.booleanOp()).and(visit(ctx.equalNotequal()));
	}

	@Override
	public AtomicType visitNequal(NequalContext ctx) {
		return visit(ctx.equalNotequal()).notequal(visit(ctx.plusOrMinus()));
	}

	@Override
	public AtomicType visitEqual(EqualContext ctx) {
		return visit(ctx.equalNotequal()).equal(visit(ctx.plusOrMinus()));
	}

	
	@Override
	public AtomicType visitGreaterEqual(GreaterEqualContext ctx) {
		return visit(ctx.equalNotequal()).greaterEqual(visit(ctx.plusOrMinus()));
	}

	@Override
	public AtomicType visitLessEqual(LessEqualContext ctx) {
		return visit(ctx.equalNotequal()).lessEqual(visit(ctx.plusOrMinus()));
	}

	@Override
	public AtomicType visitGreater(GreaterContext ctx) {
		return visit(ctx.equalNotequal()).greater(visit(ctx.plusOrMinus()));
	}

	@Override
	public AtomicType visitLess(LessContext ctx) {
		return visit(ctx.equalNotequal()).less(visit(ctx.plusOrMinus()));
	}

	@Override
	public AtomicType visitPlus(CalcSetParser.PlusContext ctx) {
		return visit(ctx.plusOrMinus()).sum(visit(ctx.implicationSubset()));
	}

	@Override
	public AtomicType visitMinus(CalcSetParser.MinusContext ctx) {
		return visit(ctx.plusOrMinus()).substruction(visit(ctx.implicationSubset()));
	}

	@Override
	public AtomicType visitSubSet(SubSetContext ctx) {
		return visit(ctx.implicationSubset()).subset(visit(ctx.union()));
	}

	@Override
	public AtomicType visitImplicationSet(ImplicationSetContext ctx) {
		return visit(ctx.implicationSubset()).implication(visit(ctx.union()));
	}
	
	@Override
	public AtomicType visitIntersectionSet(IntersectionSetContext ctx) {
		return visit(ctx.intersectionComplements()).intersection(visit(ctx.multOrDiv()));
	}

	@Override
	public AtomicType visitUnionSet(UnionSetContext ctx) {
		return visit(ctx.union()).union(visit(ctx.intersectionComplements()));
	}

	@Override
	public AtomicType visitDisjunctiveUnion(DisjunctiveUnionContext ctx) {
		return visit(ctx.union()).disjunctiveUnion(visit(ctx.intersectionComplements()));
	}

	@Override
	public AtomicType visitComplementsSet(ComplementsSetContext ctx) {
		return visit(ctx.intersectionComplements()).complements(visit(ctx.multOrDiv()));
	}

	@Override
	public AtomicType visitMultiplication(CalcSetParser.MultiplicationContext ctx) {
		return visit(ctx.multOrDiv()).multiplication(visit(ctx.bit()));
	}

	@Override
	public AtomicType visitDivision(CalcSetParser.DivisionContext ctx) {
		return visit(ctx.multOrDiv()).division(visit(ctx.bit()));
	}

	
 	@Override
	public AtomicType visitBitRightUnsigned(BitRightUnsignedContext ctx) {
		return visit(ctx.bit()).bitRightUnsigned(visit(ctx.pow()));
	}

	@Override
	public AtomicType visitBitLeft(BitLeftContext ctx) {
		return visit(ctx.bit()).bitLeft(visit(ctx.pow()));
	}

	@Override
	public AtomicType visitBitRight(BitRightContext ctx) {
		return visit(ctx.bit()).bitRight(visit(ctx.pow()));
	}

	@Override
	public AtomicType visitBitXor(BitXorContext ctx) {
		return visit(ctx.bit()).bitXor(visit(ctx.pow()));
	}

	@Override
	public AtomicType visitCalculate(CalculateContext ctx) {
		return visit(ctx.booleanOp());
	}

	@Override
	public AtomicType visitSetVariable(SetVariableContext ctx) {
		BooleanOpContext booleanOp = ctx.booleanOp();
		if (booleanOp != null) {
			AtomicType value = visit(booleanOp);
			variables.put(ctx.ID().getText(), value);
			return value;
		} else {
			return variables.get(ctx.ID().getText());
		}
	}

	@Override
	public AtomicType visitPower(CalcSetParser.PowerContext ctx) {
		if (ctx.pow() != null) {
			return visit(ctx.unaryMinus()).power(visit(ctx.pow()));
		} else {
			return visit(ctx.unaryMinus());
		}
	}

	@Override
	public AtomicType visitChangeSign(CalcSetParser.ChangeSignContext ctx) {
		return visit(ctx.unaryMinus()).changeSign();
	}

	@Override
	public AtomicType visitUnaryNot(UnaryNotContext ctx) {
		return visit(ctx.unaryMinus()).not();
	}
	
	@Override
	public AtomicType visitComplementSet(ComplementSetContext ctx) {
		return visit(ctx.unaryMinus()).complementSet();
	}

	@Override
	public AtomicType visitBitInvers(BitInversContext ctx) {
		return visit(ctx.unaryMinus()).bitInvers();
	}

	@Override
	public AtomicType visitCardinality(CardinalityContext ctx) {
		return visit(ctx.unaryMinus()).cardinality();
	}

	@Override
	public AtomicType visitBraces(CalcSetParser.BracesContext ctx) {
		return visit(ctx.booleanOp());
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
	public AtomicType visitUniversalSet(UniversalSetContext ctx) {
		return SetType.universalSet();
	}

	@Override
	public AtomicType visitString(StringContext ctx) {
		return new StringType(ctx.getText());
	}

	@Override
	public AtomicType visitBoolean(BooleanContext ctx) {
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
	
	
}
