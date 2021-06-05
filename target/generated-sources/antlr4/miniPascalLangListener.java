// Generated from miniPascalLang.g4 by ANTLR 4.4

	import data_structure.PascalSymbol;
	import data_structure.PascalVariable;
	import data_structure.PascalSymbolTable;
	import exceptions.PascalSemanticException;
	import java.util.ArrayList;


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniPascalLangParser}.
 */
public interface miniPascalLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#decl_procedimento}.
	 * @param ctx the parse tree
	 */
	void enterDecl_procedimento(@NotNull miniPascalLangParser.Decl_procedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#decl_procedimento}.
	 * @param ctx the parse tree
	 */
	void exitDecl_procedimento(@NotNull miniPascalLangParser.Decl_procedimentoContext ctx);
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#chamada_procedimento}.
	 * @param ctx the parse tree
	 */
	void enterChamada_procedimento(@NotNull miniPascalLangParser.Chamada_procedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#chamada_procedimento}.
	 * @param ctx the parse tree
	 */
	void exitChamada_procedimento(@NotNull miniPascalLangParser.Chamada_procedimentoContext ctx);
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#lista_identificadores}.
	 * @param ctx the parse tree
	 */
	void enterLista_identificadores(@NotNull miniPascalLangParser.Lista_identificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#lista_identificadores}.
	 * @param ctx the parse tree
	 */
	void exitLista_identificadores(@NotNull miniPascalLangParser.Lista_identificadoresContext ctx);
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#selec_parametr_formais}.
	 * @param ctx the parse tree
	 */
	void enterSelec_parametr_formais(@NotNull miniPascalLangParser.Selec_parametr_formaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#selec_parametr_formais}.
	 * @param ctx the parse tree
	 */
	void exitSelec_parametr_formais(@NotNull miniPascalLangParser.Selec_parametr_formaisContext ctx);
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#list_expressoes}.
	 * @param ctx the parse tree
	 */
	void enterList_expressoes(@NotNull miniPascalLangParser.List_expressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#list_expressoes}.
	 * @param ctx the parse tree
	 */
	void exitList_expressoes(@NotNull miniPascalLangParser.List_expressoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#parametr_formais}.
	 * @param ctx the parse tree
	 */
	void enterParametr_formais(@NotNull miniPascalLangParser.Parametr_formaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#parametr_formais}.
	 * @param ctx the parse tree
	 */
	void exitParametr_formais(@NotNull miniPascalLangParser.Parametr_formaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comando_condicional}.
	 * @param ctx the parse tree
	 */
	void enterComando_condicional(@NotNull miniPascalLangParser.Comando_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comando_condicional}.
	 * @param ctx the parse tree
	 */
	void exitComando_condicional(@NotNull miniPascalLangParser.Comando_condicionalContext ctx);
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#decl_vars}.
	 * @param ctx the parse tree
	 */
	void enterDecl_vars(@NotNull miniPascalLangParser.Decl_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#decl_vars}.
	 * @param ctx the parse tree
	 */
	void exitDecl_vars(@NotNull miniPascalLangParser.Decl_varsContext ctx);
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#comando_composto}.
	 * @param ctx the parse tree
	 */
	void enterComando_composto(@NotNull miniPascalLangParser.Comando_compostoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comando_composto}.
	 * @param ctx the parse tree
	 */
	void exitComando_composto(@NotNull miniPascalLangParser.Comando_compostoContext ctx);
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#comando_repetitivo}.
	 * @param ctx the parse tree
	 */
	void enterComando_repetitivo(@NotNull miniPascalLangParser.Comando_repetitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comando_repetitivo}.
	 * @param ctx the parse tree
	 */
	void exitComando_repetitivo(@NotNull miniPascalLangParser.Comando_repetitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#part_decl_var}.
	 * @param ctx the parse tree
	 */
	void enterPart_decl_var(@NotNull miniPascalLangParser.Part_decl_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#part_decl_var}.
	 * @param ctx the parse tree
	 */
	void exitPart_decl_var(@NotNull miniPascalLangParser.Part_decl_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#part_decl_sub_rotinas}.
	 * @param ctx the parse tree
	 */
	void enterPart_decl_sub_rotinas(@NotNull miniPascalLangParser.Part_decl_sub_rotinasContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#part_decl_sub_rotinas}.
	 * @param ctx the parse tree
	 */
	void exitPart_decl_sub_rotinas(@NotNull miniPascalLangParser.Part_decl_sub_rotinasContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_simples(@NotNull miniPascalLangParser.Expressao_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_simples(@NotNull miniPascalLangParser.Expressao_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(@NotNull miniPascalLangParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(@NotNull miniPascalLangParser.IdentificadorContext ctx);
}