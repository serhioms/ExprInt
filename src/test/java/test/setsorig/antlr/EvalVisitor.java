package test.setsorig.antlr;

import java.util.HashSet;
import java.util.Set;

import antlr.setsorig.SetsOrigBaseVisitor;
import antlr.setsorig.SetsOrigParser;
import test.sets.MathSet;

public class EvalVisitor extends SetsOrigBaseVisitor<MathSet<Integer>> {

    @Override
    public MathSet<Integer> visitExpr(SetsOrigParser.ExprContext ctx) {
        if (ctx.OP_ADD() != null) {
            MathSet<Integer> left = visit(ctx.expr());
            MathSet<Integer> right = visit(ctx.term());
            switch (ctx.OP_ADD().getText()) {
                case "|":
                    return left.union(right);
                case "\\":
                    return left.complements(right);
            }
            return null;
        } else {
            return visit(ctx.term());
        }
    }

    @Override
    public MathSet<Integer> visitTerm(SetsOrigParser.TermContext ctx) {
        if (ctx.OP_MUL() != null) {
            MathSet<Integer> left = visit(ctx.term());
            MathSet<Integer> right = visit(ctx.factor());
            switch (ctx.OP_MUL().getText()) {
                case "&":
                    return left.intersection(right);
            }
            return null;
        } else {
            return visitFactor(ctx.factor());
        }
    }

    @Override
    public MathSet<Integer> visitFactor(SetsOrigParser.FactorContext ctx) {
        if (ctx.expr() != null) {
            return visit(ctx.expr());
        } else {
            return visit(ctx.set());
        }
    }

    @Override
    public MathSet<Integer> visitSet(SetsOrigParser.SetContext ctx) {
        if (ctx.ints() == null) {
            return MathSet.of(new HashSet<>());
        } else {
        	return visitInts(ctx.ints());
        }
    }

    @Override
    public MathSet<Integer> visitInts(SetsOrigParser.IntsContext ctx) {
        Set<Integer> set = new HashSet<>();
        set.add(Integer.parseInt(ctx.INT().getText()));
        while (ctx.ints() != null) {
            ctx = ctx.ints();
            set.add(Integer.parseInt(ctx.INT().getText()));
        }
        return MathSet.of(set);
    }
}
