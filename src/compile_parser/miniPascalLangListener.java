// Generated from miniPascalLang.g4 by ANTLR 4.7.2
package compile_parser;
<<<<<<< HEAD

	import data_structure.PascalSymbol;
	import data_structure.PascalVariable;
	import data_structure.PascalSymbolTable;
	import exceptions.PascalSemanticException;
	import java.util.ArrayList;

<<<<<<< HEAD

=======
>>>>>>> parent of 08655c7... Em andamento
=======
>>>>>>> parent of 943c220... Em andamento v4
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#part_decl_var}.
	 * @param ctx the parse tree
	 */
	void enterPart_decl_var(miniPascalLangParser.Part_decl_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#part_decl_var}.
	 * @param ctx the parse tree
	 */
	void exitPart_decl_var(miniPascalLangParser.Part_decl_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#decl_vars}.
	 * @param ctx the parse tree
	 */
	void enterDecl_vars(miniPascalLangParser.Decl_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#decl_vars}.
	 * @param ctx the parse tree
	 */
	void exitDecl_vars(miniPascalLangParser.Decl_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#lista_identificadores}.
	 * @param ctx the parse tree
	 */
	void enterLista_identificadores(miniPascalLangParser.Lista_identificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#lista_identificadores}.
	 * @param ctx the parse tree
	 */
	void exitLista_identificadores(miniPascalLangParser.Lista_identificadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#part_decl_sub_rotinas}.
	 * @param ctx the parse tree
	 */
	void enterPart_decl_sub_rotinas(miniPascalLangParser.Part_decl_sub_rotinasContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#part_decl_sub_rotinas}.
	 * @param ctx the parse tree
	 */
	void exitPart_decl_sub_rotinas(miniPascalLangParser.Part_decl_sub_rotinasContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#decl_procedimento}.
	 * @param ctx the parse tree
	 */
	void enterDecl_procedimento(miniPascalLangParser.Decl_procedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#decl_procedimento}.
	 * @param ctx the parse tree
	 */
	void exitDecl_procedimento(miniPascalLangParser.Decl_procedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#parametr_formais}.
	 * @param ctx the parse tree
	 */
	void enterParametr_formais(miniPascalLangParser.Parametr_formaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#parametr_formais}.
	 * @param ctx the parse tree
	 */
	void exitParametr_formais(miniPascalLangParser.Parametr_formaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#selec_parametr_formais}.
	 * @param ctx the parse tree
	 */
	void enterSelec_parametr_formais(miniPascalLangParser.Selec_parametr_formaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#selec_parametr_formais}.
	 * @param ctx the parse tree
	 */
	void exitSelec_parametr_formais(miniPascalLangParser.Selec_parametr_formaisContext ctx);
	/**
<<<<<<< HEAD
	 * Enter a parse tree produced by {@link miniPascalLangParser#comando_composto}.
	 * @param ctx the parse tree
	 */
	void enterComando_composto(miniPascalLangParser.Comando_compostoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comando_composto}.
	 * @param ctx the parse tree
	 */
	void exitComando_composto(miniPascalLangParser.Comando_compostoContext ctx);
=======
	 * Enter a parse tree produced by {@link miniPascalLangParser#comandoComposto}.
	 * @param ctx the parse tree
	 */
	void enterComandoComposto(miniPascalLangParser.ComandoCompostoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comandoComposto}.
	 * @param ctx the parse tree
	 */
	void exitComandoComposto(miniPascalLangParser.ComandoCompostoContext ctx);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#chamada_procedimento}.
	 * @param ctx the parse tree
	 */
	void enterChamada_procedimento(miniPascalLangParser.Chamada_procedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#chamada_procedimento}.
	 * @param ctx the parse tree
	 */
	void exitChamada_procedimento(miniPascalLangParser.Chamada_procedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comando_condicional}.
	 * @param ctx the parse tree
	 */
	void enterComando_condicional(miniPascalLangParser.Comando_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comando_condicional}.
	 * @param ctx the parse tree
	 */
	void exitComando_condicional(miniPascalLangParser.Comando_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalLangParser#comando_repetitivo}.
	 * @param ctx the parse tree
	 */
	void enterComando_repetitivo(miniPascalLangParser.Comando_repetitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#comando_repetitivo}.
	 * @param ctx the parse tree
	 */
	void exitComando_repetitivo(miniPascalLangParser.Comando_repetitivoContext ctx);
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_simples(miniPascalLangParser.Expressao_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_simples(miniPascalLangParser.Expressao_simplesContext ctx);
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#list_expressoes}.
	 * @param ctx the parse tree
	 */
	void enterList_expressoes(miniPascalLangParser.List_expressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#list_expressoes}.
	 * @param ctx the parse tree
	 */
	void exitList_expressoes(miniPascalLangParser.List_expressoesContext ctx);
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
	 * Enter a parse tree produced by {@link miniPascalLangParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(miniPascalLangParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalLangParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(miniPascalLangParser.IdentificadorContext ctx);
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