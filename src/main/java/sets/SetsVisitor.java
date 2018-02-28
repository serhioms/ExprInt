// Generated from gramma/Sets.g4 by ANTLR 4.7.1
package sets;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SetsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SetsParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(SetsParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SetsParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SetsParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SetsParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(SetsParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(SetsParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(SetsParser.AtomContext ctx);
}