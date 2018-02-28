package org.exprint;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.exprint.type.AtomicType;
import org.exprint.type.BooleanType;
import org.exprint.type.DoubleType;
import org.exprint.type.IntegerType;
import org.exprint.type.SetType;
import org.exprint.type.StringType;

import calcset.CalcSetBaseVisitor;
import calcset.CalcSetParser;
import calcset.CalcSetParser.AndContext;
import calcset.CalcSetParser.BooleanContext;
import calcset.CalcSetParser.CalculateContext;
import calcset.CalcSetParser.CardinalityContext;
import calcset.CalcSetParser.EqualContext;
import calcset.CalcSetParser.ExprContext;
import calcset.CalcSetParser.FactorContext;
import calcset.CalcSetParser.ImplicationContext;
import calcset.CalcSetParser.IntContext;
import calcset.CalcSetParser.ListContext;
import calcset.CalcSetParser.NequalContext;
import calcset.CalcSetParser.OrContext;
import calcset.CalcSetParser.PlusOrMinusContext;
import calcset.CalcSetParser.SetContext;
import calcset.CalcSetParser.SetVariableContext;
import calcset.CalcSetParser.StringContext;
import calcset.CalcSetParser.SubsetContext;
import calcset.CalcSetParser.TermContext;
import calcset.CalcSetParser.ToSetVarContext;
import calcset.CalcSetParser.UnaryNotContext;

public class EvalVisitor extends CalcSetBaseVisitor<AtomicType> {

	private HashMap<String, AtomicType> variables = new HashMap<String, AtomicType>();

	@Override
	public AtomicType visitExpr(ExprContext ctx) {
		return visit(ctx.term());
	}

	@Override
	public AtomicType visitTerm(TermContext ctx) {
		return visitFactor(ctx.factor());
	}

	@Override
	public AtomicType visitFactor(FactorContext ctx) {
		if (ctx.expr() != null) {
			return visit(ctx.expr());
		} else {
			return visit(ctx.set());
		}
	}

	@Override
	public AtomicType visitSet(SetContext ctx) {
		return visitList(ctx.list());
	}

	@Override
	public AtomicType visitList(ListContext ctx) {
		Set<AtomicType> set = new HashSet<>();
		if( ctx != null ) {
			set.add(visit(ctx.atom()));
			while (ctx.list() != null) {
				ctx = ctx.list();
				set.add(visit(ctx.atom()));
			}
		}
		return SetType.ofSet(set);
	}

	/*
	 * *********************************
	 */

	
	@Override
	public AtomicType visitPlus(CalcSetParser.PlusContext ctx) {
		return visit(ctx.plusOrMinus()).sum(visit(ctx.multOrDiv()));
	}

	@Override
	public AtomicType visitSubset(SubsetContext ctx) {
		return visit(ctx.plusOrMinus()).subset(visit(ctx.multOrDiv()));
	}

	@Override
	public AtomicType visitImplication(ImplicationContext ctx) {
		return visit(ctx.plusOrMinus()).implication(visit(ctx.multOrDiv()));
	}

	@Override
	public AtomicType visitOr(OrContext ctx) {
		return visit(ctx.plusOrMinus()).or(visit(ctx.multOrDiv()));
	}

	@Override
	public AtomicType visitNequal(NequalContext ctx) {
		return visit(ctx.plusOrMinus()).notequal(visit(ctx.multOrDiv()));
	}

	@Override
	public AtomicType visitEqual(EqualContext ctx) {
		return visit(ctx.plusOrMinus()).equal(visit(ctx.multOrDiv()));
	}

	@Override
	public AtomicType visitMinus(CalcSetParser.MinusContext ctx) {
		return visit(ctx.plusOrMinus()).substruction(visit(ctx.multOrDiv()));
	}

	@Override
	public AtomicType visitAnd(AndContext ctx) {
		return visit(ctx.plusOrMinus()).and(visit(ctx.multOrDiv()));
	}
	
	@Override
	public AtomicType visitMultiplication(CalcSetParser.MultiplicationContext ctx) {
		return visit(ctx.multOrDiv()).multiplication(visit(ctx.pow()));
	}

	@Override
	public AtomicType visitDivision(CalcSetParser.DivisionContext ctx) {
		return visit(ctx.multOrDiv()).division(visit(ctx.pow()));
	}

	@Override
	public AtomicType visitToSetVar(ToSetVarContext ctx) {
		return super.visitToSetVar(ctx);
	}

	@Override
	public AtomicType visitCalculate(CalculateContext ctx) {
		return visit(ctx.plusOrMinus());
	}

	@Override
	public AtomicType visitSetVariable(SetVariableContext ctx) {
		PlusOrMinusContext plusOrMinus = ctx.plusOrMinus();
		if (plusOrMinus != null) {
			AtomicType value = visit(plusOrMinus);
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
	public AtomicType visitCardinality(CardinalityContext ctx) {
		return visit(ctx.unaryMinus()).cardinality();
	}

	@Override
	public AtomicType visitBraces(CalcSetParser.BracesContext ctx) {
		return visit(ctx.plusOrMinus());
	}

	@Override
	public AtomicType visitConstantPI(CalcSetParser.ConstantPIContext ctx) {
		return new DoubleType(Math.PI);
	}

	@Override
	public AtomicType visitConstantE(CalcSetParser.ConstantEContext ctx) {
		return new DoubleType(Math.E);
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
		return new DoubleType(ctx.getText());
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
