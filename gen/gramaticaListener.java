// Generated from gramatica.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPar(gramaticaParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPar(gramaticaParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDiv(gramaticaParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDiv(gramaticaParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSub(gramaticaParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSub(gramaticaParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMult(gramaticaParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMult(gramaticaParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pot}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPot(gramaticaParser.PotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pot}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPot(gramaticaParser.PotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVar(gramaticaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVar(gramaticaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConst(gramaticaParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConst(gramaticaParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSoma(gramaticaParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSoma(gramaticaParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(gramaticaParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(gramaticaParser.NumContext ctx);
}