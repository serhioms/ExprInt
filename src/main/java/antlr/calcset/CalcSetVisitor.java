// Generated from gramma/CalcSet.g4 by ANTLR 4.7.1
package antlr.calcset;
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
	 * Visit a parse tree produced by the {@code Nor}
	 * labeled alternative in {@link CalcSetParser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNor(CalcSetParser.NorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xnor}
	 * labeled alternative in {@link CalcSetParser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXnor(CalcSetParser.XnorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link CalcSetParser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(CalcSetParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link CalcSetParser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(CalcSetParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToEqualNotequal}
	 * labeled alternative in {@link CalcSetParser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToEqualNotequal(CalcSetParser.ToEqualNotequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link CalcSetParser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(CalcSetParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nand}
	 * labeled alternative in {@link CalcSetParser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNand(CalcSetParser.NandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToPlusOrMinus}
	 * labeled alternative in {@link CalcSetParser#equalNotequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToPlusOrMinus(CalcSetParser.ToPlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqual}
	 * labeled alternative in {@link CalcSetParser#equalNotequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqual(CalcSetParser.GreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CalcSetParser#equalNotequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(CalcSetParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nequal}
	 * labeled alternative in {@link CalcSetParser#equalNotequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNequal(CalcSetParser.NequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqual}
	 * labeled alternative in {@link CalcSetParser#equalNotequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(CalcSetParser.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link CalcSetParser#equalNotequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(CalcSetParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Less}
	 * labeled alternative in {@link CalcSetParser#equalNotequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(CalcSetParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToImplicationSubset}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToImplicationSubset(CalcSetParser.ToImplicationSubsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(CalcSetParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalcSetParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(CalcSetParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToUnion}
	 * labeled alternative in {@link CalcSetParser#implicationSubset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToUnion(CalcSetParser.ToUnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubSet}
	 * labeled alternative in {@link CalcSetParser#implicationSubset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSet(CalcSetParser.SubSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImplicationSet}
	 * labeled alternative in {@link CalcSetParser#implicationSubset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationSet(CalcSetParser.ImplicationSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToIntersectionComplements}
	 * labeled alternative in {@link CalcSetParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToIntersectionComplements(CalcSetParser.ToIntersectionComplementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnionSet}
	 * labeled alternative in {@link CalcSetParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionSet(CalcSetParser.UnionSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisjunctiveUnion}
	 * labeled alternative in {@link CalcSetParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctiveUnion(CalcSetParser.DisjunctiveUnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalcSetParser#intersectionComplements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMultOrDiv(CalcSetParser.ToMultOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntersectionSet}
	 * labeled alternative in {@link CalcSetParser#intersectionComplements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionSet(CalcSetParser.IntersectionSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplementsSet}
	 * labeled alternative in {@link CalcSetParser#intersectionComplements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplementsSet(CalcSetParser.ComplementsSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToBit}
	 * labeled alternative in {@link CalcSetParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToBit(CalcSetParser.ToBitContext ctx);
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
	 * Visit a parse tree produced by the {@code BitXor}
	 * labeled alternative in {@link CalcSetParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXor(CalcSetParser.BitXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitRightUnsigned}
	 * labeled alternative in {@link CalcSetParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitRightUnsigned(CalcSetParser.BitRightUnsignedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitLeft}
	 * labeled alternative in {@link CalcSetParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitLeft(CalcSetParser.BitLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitRight}
	 * labeled alternative in {@link CalcSetParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitRight(CalcSetParser.BitRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToPow}
	 * labeled alternative in {@link CalcSetParser#bit}.
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
	 * Visit a parse tree produced by the {@code ComplementSet}
	 * labeled alternative in {@link CalcSetParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplementSet(CalcSetParser.ComplementSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryNot}
	 * labeled alternative in {@link CalcSetParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNot(CalcSetParser.UnaryNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link CalcSetParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeSign(CalcSetParser.ChangeSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitInvers}
	 * labeled alternative in {@link CalcSetParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitInvers(CalcSetParser.BitInversContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalcSetParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(CalcSetParser.ToAtomContext ctx);
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
	 * Visit a parse tree produced by the {@code AtomCardinality}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomCardinality(CalcSetParser.AtomCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToExprFrAtom}
	 * labeled alternative in {@link CalcSetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToExprFrAtom(CalcSetParser.ToExprFrAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcSetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalcSetParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnorderedSet}
	 * labeled alternative in {@link CalcSetParser#unorderedsetexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnorderedSet(CalcSetParser.UnorderedSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnorderedSetCardinality}
	 * labeled alternative in {@link CalcSetParser#unorderedsetexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnorderedSetCardinality(CalcSetParser.UnorderedSetCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnorderedComplementSet}
	 * labeled alternative in {@link CalcSetParser#unorderedsetexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnorderedComplementSet(CalcSetParser.UnorderedComplementSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnorderedEmptySet}
	 * labeled alternative in {@link CalcSetParser#unorderedsetexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnorderedEmptySet(CalcSetParser.UnorderedEmptySetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnorderedUniversalSet}
	 * labeled alternative in {@link CalcSetParser#unorderedsetexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnorderedUniversalSet(CalcSetParser.UnorderedUniversalSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrderedSet}
	 * labeled alternative in {@link CalcSetParser#orderedsetexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedSet(CalcSetParser.OrderedSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrderedSetCardinality}
	 * labeled alternative in {@link CalcSetParser#orderedsetexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedSetCardinality(CalcSetParser.OrderedSetCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrderedComplementSet}
	 * labeled alternative in {@link CalcSetParser#orderedsetexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedComplementSet(CalcSetParser.OrderedComplementSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrderedEmptySet}
	 * labeled alternative in {@link CalcSetParser#orderedsetexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedEmptySet(CalcSetParser.OrderedEmptySetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrderedUniversalSet}
	 * labeled alternative in {@link CalcSetParser#orderedsetexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedUniversalSet(CalcSetParser.OrderedUniversalSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcSetParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CalcSetParser.ListContext ctx);
}