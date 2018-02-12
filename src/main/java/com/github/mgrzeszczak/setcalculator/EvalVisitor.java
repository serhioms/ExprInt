package com.github.mgrzeszczak.setcalculator;

import java.util.HashSet;
import java.util.Set;

import org.exprint.type.MathType;

import sets.SetsBaseVisitor;
import sets.SetsParser;

public class EvalVisitor extends SetsBaseVisitor<MathSet<MathType>> {

	@Override
    public MathSet<MathType> visitExpr(SetsParser.ExprContext ctx) {
        if (ctx.ADD_SUB() != null) {
            MathSet<MathType> left = visit(ctx.expr());
            MathSet<MathType> right = visit(ctx.term());
            switch (ctx.ADD_SUB().getText()) {
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
    public MathSet<MathType> visitTerm(SetsParser.TermContext ctx) {
        if (ctx.MUL() != null) {
            MathSet<MathType> left = visit(ctx.term());
            MathSet<MathType> right = visit(ctx.factor());
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
    public MathSet<MathType> visitFactor(SetsParser.FactorContext ctx) {
        if (ctx.expr() != null) {
            return visit(ctx.expr());
        } else {
            return visit(ctx.set());
        }
    }

    @Override
    public MathSet<MathType> visitSet(SetsParser.SetContext ctx) {
        if (ctx.list() != null) {
        	return visitList(ctx.list());
        } else {
            return MathSet.of(new HashSet<>());
        }
    }

    @Override
    public MathSet<MathType> visitList(SetsParser.ListContext ctx) {
        Set<MathType> set = new HashSet<>();
        set.add(MathType.parseInt(ctx.atom().getText()));
        while (ctx.list() != null) {
            ctx = ctx.list();
            set.add(MathType.parseInt(ctx.atom().getText()));
        }
        return MathSet.of(set);
    }
}
