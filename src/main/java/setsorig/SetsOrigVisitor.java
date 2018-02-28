// Generated from gramma/SetsOrig.g4 by ANTLR 4.7.1
package setsorig;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetsOrigParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SetsOrigVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SetsOrigParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SetsOrigParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsOrigParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SetsOrigParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsOrigParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SetsOrigParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsOrigParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(SetsOrigParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsOrigParser#ints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInts(SetsOrigParser.IntsContext ctx);
}