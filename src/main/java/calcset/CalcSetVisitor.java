// Generated from gramma/CalcSet.g4 by ANTLR 4.7.1
package calcset;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcSetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcSetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ToSetVar}
	 * labeled alternative in {@link CalcSetParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSetVar(CalcSetParser.ToSetVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalcSetParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(CalcSetParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link CalcSetParser#setVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(CalcSetParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMultOrDiv(CalcSetParser.ToMultOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(CalcSetParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subset}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubset(CalcSetParser.SubsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(CalcSetParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(CalcSetParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nequal}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNequal(CalcSetParser.NequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(CalcSetParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Implication}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplication(CalcSetParser.ImplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(CalcSetParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Complements}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplements(CalcSetParser.ComplementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalcSetParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(CalcSetParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalcSetParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(CalcSetParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToPow}
	 * labeled alternative in {@link CalcSetParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToPow(CalcSetParser.ToPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link CalcSetParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(CalcSetParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link CalcSetParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeSign(CalcSetParser.ChangeSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryNot}
	 * labeled alternative in {@link CalcSetParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNot(CalcSetParser.UnaryNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cardinality}
	 * labeled alternative in {@link CalcSetParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardinality(CalcSetParser.CardinalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalcSetParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(CalcSetParser.ToAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcSetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalcSetParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcSetParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CalcSetParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcSetParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CalcSetParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcSetParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(CalcSetParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcSetParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CalcSetParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CalcSetParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantPI(CalcSetParser.ConstantPIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantE(CalcSetParser.ConstantEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CalcSetParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(CalcSetParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(CalcSetParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CalcSetParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(CalcSetParser.BracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(CalcSetParser.AtomExprContext ctx);
}