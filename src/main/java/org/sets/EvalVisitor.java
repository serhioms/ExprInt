package org.sets;

import java.util.HashSet;
import java.util.Set;

import org.exprint.type.AtomicType;
import org.exprint.type.IntegerType;

import sets.SetsBaseVisitor;
import sets.SetsParser;

public class EvalVisitor extends SetsBaseVisitor<MathSet<AtomicType>> {

	@Override
    public MathSet<AtomicType> visitExpr(SetsParser.ExprContext ctx) {
        if (ctx.ADD_SUB() != null) {
            MathSet<AtomicType> left = visit(ctx.expr());
            MathSet<AtomicType> right = visit(ctx.term());
            switch (ctx.ADD_SUB().getText()) {
                case "+":
                    return left.union(right);
                case "-":
                    return left.difference(right);
            }
            return null;
        } else {
            return visit(ctx.term());
        }
    }

    @Override
    public MathSet<AtomicType> visitTerm(SetsParser.TermContext ctx) {
        if (ctx.MUL() != null) {
            MathSet<AtomicType> left = visit(ctx.term());
            MathSet<AtomicType> right = visit(ctx.factor());
            switch (ctx.MUL().getText()) {
                case "*":
                    return left.intersection(right);
            }
            return null;
        } else {
            return visitFactor(ctx.factor());
        }
    }

    @Override
    public MathSet<AtomicType> visitFactor(SetsParser.FactorContext ctx) {
        if (ctx.expr() != null) {
            return visit(ctx.expr());
        } else {
            return visit(ctx.set());
        }
    }

    @Override
    public MathSet<AtomicType> visitSet(SetsParser.SetContext ctx) {
        if (ctx.list() != null) {
        	return visitList(ctx.list());
        } else {
            return MathSet.of(new HashSet<>());
        }
    }

    @Override
    public MathSet<AtomicType> visitList(SetsParser.ListContext ctx) {
        Set<AtomicType> set = new HashSet<>();
        set.add(new IntegerType(ctx.atom().getText()));
        while (ctx.list() != null) {
            ctx = ctx.list();
            set.add(new IntegerType(ctx.atom().getText()));
        }
        return MathSet.of(set);
    }
}
