package org.exprint;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.exprint.type.MathType;

import calcset.CalcSetBaseVisitor;
import calcset.CalcSetParser;
import calcset.CalcSetParser.CalculateContext;
import calcset.CalcSetParser.ExprContext;
import calcset.CalcSetParser.FactorContext;
import calcset.CalcSetParser.IntContext;
import calcset.CalcSetParser.ListContext;
import calcset.CalcSetParser.PlusOrMinusContext;
import calcset.CalcSetParser.SetContext;
import calcset.CalcSetParser.SetVariableContext;
import calcset.CalcSetParser.TermContext;
import calcset.CalcSetParser.ToSetVarContext;


public class EvalVisitor extends CalcSetBaseVisitor<MathSet<MathType>> {

	private HashMap<String, MathSet<MathType>> variables = new HashMap<String, MathSet<MathType>>();

	@Override
	public MathSet<MathType> visitExpr(ExprContext ctx) {
		if (ctx.OP_UNION_SUBSTRUCTION() != null) {
            MathSet<MathType> left = visit(ctx.expr());
            MathSet<MathType> right = visit(ctx.term());
            switch (ctx.OP_UNION_SUBSTRUCTION().getText()) {
                case "#":
                    return left.union(right);
                case "/":
                    return left.difference(right);
            }
            return null;
        } else {
            return visit(ctx.term());
        }
	}

	@Override
	public MathSet<MathType> visitTerm(TermContext ctx) {
        if (ctx.OP_INTERSECTION() != null) {
            MathSet<MathType> left = visit(ctx.term());
            MathSet<MathType> right = visit(ctx.factor());
            switch (ctx.OP_INTERSECTION().getText()) {
                case "*":
                    return left.intersection(right);
            }
            return null;
        } else {
            return visitFactor(ctx.factor());
        }
	}

	@Override
	public MathSet<MathType> visitFactor(FactorContext ctx) {
        if (ctx.expr() != null) {
            return visit(ctx.expr());
        } else {
            return visit(ctx.set());
        }
	}

	@Override
	public MathSet<MathType> visitSet(SetContext ctx) {
        if (ctx.list() != null) {
            return visitList(ctx.list());
        } else {
            return MathSet.ofSet(new HashSet<>());
        }
	}

	@Override
	public MathSet<MathType> visitList(ListContext ctx) {
        Set<MathType> set = new HashSet<>();
        set.add(MathType.parseInt(ctx.atom().getText()));
        while (ctx.list() != null) {
            ctx = ctx.list();
            set.add(MathType.parseInt(ctx.atom().getText()));
        }
        return MathSet.ofSet(set);
	}

	/*
     * *********************************
     */
    
	@Override
    public MathSet<MathType> visitPlus(CalcSetParser.PlusContext ctx) {
        return visit(ctx.plusOrMinus()).plus(visit(ctx.multOrDiv()));
    }
    
    
	@Override
    public MathSet<MathType> visitMinus(CalcSetParser.MinusContext ctx) {
        return visit(ctx.plusOrMinus()).minus(visit(ctx.multOrDiv()));
    }

    
	@Override
    public MathSet<MathType> visitMultiplication(CalcSetParser.MultiplicationContext ctx) {
        return visit(ctx.multOrDiv()).mult(visit(ctx.pow()));
    }

    
	@Override
    public MathSet<MathType> visitDivision(CalcSetParser.DivisionContext ctx) {
        return visit(ctx.multOrDiv()).div(visit(ctx.pow()));
    }
   
    
	@Override
	public MathSet<MathType> visitToSetVar(ToSetVarContext ctx) {
		return super.visitToSetVar(ctx);
	}

	@Override
	public MathSet<MathType> visitCalculate(CalculateContext ctx) {
        return visit(ctx.plusOrMinus());
	}


	@Override
	public MathSet<MathType> visitSetVariable(SetVariableContext ctx) {
		PlusOrMinusContext plusOrMinus = ctx.plusOrMinus();
		if( plusOrMinus != null ) {
			MathSet<MathType> value = visit(plusOrMinus);
	        variables.put(ctx.ID().getText(), value);
	        return value;
		} else {
			return variables.get(ctx.ID().getText()); 
		}
	}
	
	@Override
	public MathSet<MathType> visitInt(IntContext ctx) {
        Set<MathType> set = new HashSet<>();
        set.add(MathType.parseInt(ctx.getText()));
        return  MathSet.ofSet(set);
	}
    
/*
 * 			CalcSetParser.VariableContext
 */

	@Override
	public MathSet<MathType>  visitPower(CalcSetParser.PowerContext ctx) {
        if (ctx.pow() != null) {
        	return visit(ctx.unaryMinus()).pow(visit(ctx.pow()));
        }
        return visit(ctx.unaryMinus());
    }

    
	@Override
    public MathSet<MathType>  visitChangeSign(CalcSetParser.ChangeSignContext ctx) {
        return visit(ctx.unaryMinus()).changeSign();
    }

    
	@Override
    public MathSet<MathType>  visitBraces(CalcSetParser.BracesContext ctx) {
        return visit(ctx.plusOrMinus());
    }

    
	@Override
    public MathSet<MathType> visitConstantPI(CalcSetParser.ConstantPIContext ctx) {
        Set<MathType> set = new HashSet<>();
        set.add(MathType.parseDouble(Math.PI));
        return  MathSet.ofSet(set);
    }

    
	@Override
    public MathSet<MathType> visitConstantE(CalcSetParser.ConstantEContext ctx) {
        Set<MathType> set = new HashSet<>();
        set.add(MathType.parseDouble(Math.E));
        return  MathSet.ofSet(set);
    }
    
	@Override
    public MathSet<MathType> visitDouble(CalcSetParser.DoubleContext ctx) {
        Set<MathType> set = new HashSet<>();
        set.add(MathType.parseDouble(ctx.DOUBLE().getText()));
        return  MathSet.ofSet(set);
    }
	
	@Override
    public MathSet<MathType> visitVariable(CalcSetParser.VariableContext ctx) {
        return variables.get(ctx.ID().getText());
    }
}
