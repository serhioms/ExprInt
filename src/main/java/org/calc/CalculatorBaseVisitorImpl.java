package org.calc;
import java.util.HashMap;

import calculator.CalculatorBaseVisitor;
import calculator.CalculatorParser;

public class CalculatorBaseVisitorImpl extends CalculatorBaseVisitor<Double> {
    private HashMap<String, Double> variables = new HashMap<String, Double>();

    
    public Double visitPlus(CalculatorParser.PlusContext ctx) {
        return visit(ctx.plusOrMinus()) + visit(ctx.multOrDiv());
    }
    
    
    public Double visitMinus(CalculatorParser.MinusContext ctx) {
        return visit(ctx.plusOrMinus()) - visit(ctx.multOrDiv());
    }

    
    public Double visitMultiplication(CalculatorParser.MultiplicationContext ctx) {
        return visit(ctx.multOrDiv()) * visit(ctx.pow());
    }

    
    public Double visitDivision(CalculatorParser.DivisionContext ctx) {
        return visit(ctx.multOrDiv()) / visit(ctx.pow());
    }

    
    public Double visitSetVariable(CalculatorParser.SetVariableContext ctx) {
        Double value = visit(ctx.plusOrMinus());
        variables.put(ctx.ID().getText(), value);
        return value;
    }

    
    public Double visitPower(CalculatorParser.PowerContext ctx) {
        if (ctx.pow() != null)
            return Math.pow(visit(ctx.unaryMinus()), visit(ctx.pow()));
        return visit(ctx.unaryMinus());
    }

    
    public Double visitChangeSign(CalculatorParser.ChangeSignContext ctx) {
        return -1*visit(ctx.unaryMinus());
    }

    
    public Double visitBraces(CalculatorParser.BracesContext ctx) {
        return visit(ctx.plusOrMinus());
    }

    
    public Double visitConstantPI(CalculatorParser.ConstantPIContext ctx) {
        return Math.PI;
    }

    
    public Double visitConstantE(CalculatorParser.ConstantEContext ctx) {
        return Math.E;
    }

    
    public Double visitInt(CalculatorParser.IntContext ctx) {
        return Double.parseDouble(ctx.INT().getText());
    }

    
    public Double visitVariable(CalculatorParser.VariableContext ctx) {
        return variables.get(ctx.ID().getText());
    }

    
    public Double visitDouble(CalculatorParser.DoubleContext ctx) {
        return Double.parseDouble(ctx.DOUBLE().getText());
    }

    
    public Double visitCalculate(CalculatorParser.CalculateContext ctx) {
        return visit(ctx.plusOrMinus());
    }
}
