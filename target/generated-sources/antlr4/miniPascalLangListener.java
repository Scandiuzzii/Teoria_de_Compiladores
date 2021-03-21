// Generated from miniPascalLang.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniPascalLangParser}.
 */
public interface miniPascalLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#paramFormais}.
	 * @param ctx the parse tree
	 */
	void enterParamFormais(@NotNull miniPascalLangParser.ParamFormaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#paramFormais}.
	 * @param ctx the parse tree
	 */
	void exitParamFormais(@NotNull miniPascalLangParser.ParamFormaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comandoCondicional}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicional(@NotNull miniPascalLangParser.ComandoCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comandoCondicional}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicional(@NotNull miniPascalLangParser.ComandoCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull miniPascalLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull miniPascalLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(@NotNull miniPascalLangParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(@NotNull miniPascalLangParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(@NotNull miniPascalLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(@NotNull miniPascalLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(@NotNull miniPascalLangParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(@NotNull miniPascalLangParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull miniPascalLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull miniPascalLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull miniPascalLangParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull miniPascalLangParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull miniPascalLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull miniPascalLangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#chamadaProcedimento}.
	 * @param ctx the parse tree
	 */
	void enterChamadaProcedimento(@NotNull miniPascalLangParser.ChamadaProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#chamadaProcedimento}.
	 * @param ctx the parse tree
	 */
	void exitChamadaProcedimento(@NotNull miniPascalLangParser.ChamadaProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(@NotNull miniPascalLangParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(@NotNull miniPascalLangParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(@NotNull miniPascalLangParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(@NotNull miniPascalLangParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#declProced}.
	 * @param ctx the parse tree
	 */
	void enterDeclProced(@NotNull miniPascalLangParser.DeclProcedContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#declProced}.
	 * @param ctx the parse tree
	 */
	void exitDeclProced(@NotNull miniPascalLangParser.DeclProcedContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#partDeclVar}.
	 * @param ctx the parse tree
	 */
	void enterPartDeclVar(@NotNull miniPascalLangParser.PartDeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#partDeclVar}.
	 * @param ctx the parse tree
	 */
	void exitPartDeclVar(@NotNull miniPascalLangParser.PartDeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#listExpressoes}.
	 * @param ctx the parse tree
	 */
	void enterListExpressoes(@NotNull miniPascalLangParser.ListExpressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#listExpressoes}.
	 * @param ctx the parse tree
	 */
	void exitListExpressoes(@NotNull miniPascalLangParser.ListExpressoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(@NotNull miniPascalLangParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(@NotNull miniPascalLangParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comandoComposto}.
	 * @param ctx the parse tree
	 */
	void enterComandoComposto(@NotNull miniPascalLangParser.ComandoCompostoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comandoComposto}.
	 * @param ctx the parse tree
	 */
	void exitComandoComposto(@NotNull miniPascalLangParser.ComandoCompostoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#partDecSubRot}.
	 * @param ctx the parse tree
	 */
	void enterPartDecSubRot(@NotNull miniPascalLangParser.PartDecSubRotContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#partDecSubRot}.
	 * @param ctx the parse tree
	 */
	void exitPartDecSubRot(@NotNull miniPascalLangParser.PartDecSubRotContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#secParamFormais}.
	 * @param ctx the parse tree
	 */
	void enterSecParamFormais(@NotNull miniPascalLangParser.SecParamFormaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#secParamFormais}.
	 * @param ctx the parse tree
	 */
	void exitSecParamFormais(@NotNull miniPascalLangParser.SecParamFormaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comandoRepetitivo}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepetitivo(@NotNull miniPascalLangParser.ComandoRepetitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comandoRepetitivo}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepetitivo(@NotNull miniPascalLangParser.ComandoRepetitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#expressaoSimples}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoSimples(@NotNull miniPascalLangParser.ExpressaoSimplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#expressaoSimples}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoSimples(@NotNull miniPascalLangParser.ExpressaoSimplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#declVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclVar(@NotNull miniPascalLangParser.DeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#declVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclVar(@NotNull miniPascalLangParser.DeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull miniPascalLangParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull miniPascalLangParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(@NotNull miniPascalLangParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(@NotNull miniPascalLangParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#listIdent}.
	 * @param ctx the parse tree
	 */
	void enterListIdent(@NotNull miniPascalLangParser.ListIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#listIdent}.
	 * @param ctx the parse tree
	 */
	void exitListIdent(@NotNull miniPascalLangParser.ListIdentContext ctx);
}