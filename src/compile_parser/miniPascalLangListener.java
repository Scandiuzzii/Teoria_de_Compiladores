// Generated from miniPascalLang.g4 by ANTLR 4.7.2
package compile_parser;

	import data_structure.PascalSymbol;
	import data_structure.PascalVariable;
	import data_structure.PascalSymbolTable;
	import exceptions.PascalSemanticException;
	import java.util.ArrayList;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniPascalLangParser}.
 */
public interface miniPascalLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(miniPascalLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(miniPascalLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(miniPascalLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(miniPascalLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#partDeclVar}.
	 * @param ctx the parse tree
	 */
	void enterPartDeclVar(miniPascalLangParser.PartDeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#partDeclVar}.
	 * @param ctx the parse tree
	 */
	void exitPartDeclVar(miniPascalLangParser.PartDeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#declVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclVar(miniPascalLangParser.DeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#declVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclVar(miniPascalLangParser.DeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#listIdent}.
	 * @param ctx the parse tree
	 */
	void enterListIdent(miniPascalLangParser.ListIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#listIdent}.
	 * @param ctx the parse tree
	 */
	void exitListIdent(miniPascalLangParser.ListIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#partDecSubRot}.
	 * @param ctx the parse tree
	 */
	void enterPartDecSubRot(miniPascalLangParser.PartDecSubRotContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#partDecSubRot}.
	 * @param ctx the parse tree
	 */
	void exitPartDecSubRot(miniPascalLangParser.PartDecSubRotContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#declProced}.
	 * @param ctx the parse tree
	 */
	void enterDeclProced(miniPascalLangParser.DeclProcedContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#declProced}.
	 * @param ctx the parse tree
	 */
	void exitDeclProced(miniPascalLangParser.DeclProcedContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#paramFormais}.
	 * @param ctx the parse tree
	 */
	void enterParamFormais(miniPascalLangParser.ParamFormaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#paramFormais}.
	 * @param ctx the parse tree
	 */
	void exitParamFormais(miniPascalLangParser.ParamFormaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#secParamFormais}.
	 * @param ctx the parse tree
	 */
	void enterSecParamFormais(miniPascalLangParser.SecParamFormaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#secParamFormais}.
	 * @param ctx the parse tree
	 */
	void exitSecParamFormais(miniPascalLangParser.SecParamFormaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(miniPascalLangParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(miniPascalLangParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comandoComposto}.
	 * @param ctx the parse tree
	 */
	void enterComandoComposto(miniPascalLangParser.ComandoCompostoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comandoComposto}.
	 * @param ctx the parse tree
	 */
	void exitComandoComposto(miniPascalLangParser.ComandoCompostoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(miniPascalLangParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(miniPascalLangParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#chamadaProcedimento}.
	 * @param ctx the parse tree
	 */
	void enterChamadaProcedimento(miniPascalLangParser.ChamadaProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#chamadaProcedimento}.
	 * @param ctx the parse tree
	 */
	void exitChamadaProcedimento(miniPascalLangParser.ChamadaProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comandoCondicional}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicional(miniPascalLangParser.ComandoCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comandoCondicional}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicional(miniPascalLangParser.ComandoCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comandoRepetitivo}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepetitivo(miniPascalLangParser.ComandoRepetitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comandoRepetitivo}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepetitivo(miniPascalLangParser.ComandoRepetitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(miniPascalLangParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(miniPascalLangParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(miniPascalLangParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(miniPascalLangParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#expressaoSimples}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoSimples(miniPascalLangParser.ExpressaoSimplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#expressaoSimples}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoSimples(miniPascalLangParser.ExpressaoSimplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(miniPascalLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(miniPascalLangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(miniPascalLangParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(miniPascalLangParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(miniPascalLangParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(miniPascalLangParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#listExpressoes}.
	 * @param ctx the parse tree
	 */
	void enterListExpressoes(miniPascalLangParser.ListExpressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#listExpressoes}.
	 * @param ctx the parse tree
	 */
	void exitListExpressoes(miniPascalLangParser.ListExpressoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(miniPascalLangParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(miniPascalLangParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(miniPascalLangParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(miniPascalLangParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(miniPascalLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(miniPascalLangParser.TipoContext ctx);
}