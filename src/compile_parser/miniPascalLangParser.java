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
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniPascalLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
<<<<<<< HEAD
		Digito=1, Letra=2, Relacao=3, PROGRAM=4, PROCEDURE=5, VAR=6, BEGIN=7, 
		END=8, THEN=9, ELSE=10, WHILE=11, DO=12, OR=13, DIV=14, AND=15, NOT=16, 
		Integer=17, Real=18, Boolean=19, Char=20, String=21, TRUE=22, FALSE=23, 
		PLUS=24, MINUS=25, TIMES=26, AP=27, FP=28, PV=29, VG=30, DP=31, ATB=32, 
		IF=33, WS=34;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_part_decl_var = 2, RULE_decl_vars = 3, 
		RULE_lista_identificadores = 4, RULE_part_decl_sub_rotinas = 5, RULE_decl_procedimento = 6, 
		RULE_parametr_formais = 7, RULE_selec_parametr_formais = 8, RULE_comando_composto = 9, 
		RULE_comando = 10, RULE_atribuicao = 11, RULE_chamada_procedimento = 12, 
		RULE_comando_condicional = 13, RULE_comando_repetitivo = 14, RULE_expressao = 15, 
		RULE_expressao_simples = 16, RULE_termo = 17, RULE_fator = 18, RULE_variavel = 19, 
		RULE_list_expressoes = 20, RULE_numero = 21, RULE_identificador = 22, 
		RULE_tipo = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloco", "part_decl_var", "decl_vars", "lista_identificadores", 
			"part_decl_sub_rotinas", "decl_procedimento", "parametr_formais", "selec_parametr_formais", 
			"comando_composto", "comando", "atribuicao", "chamada_procedimento", 
			"comando_condicional", "comando_repetitivo", "expressao", "expressao_simples", 
			"termo", "fator", "variavel", "list_expressoes", "numero", "identificador", 
			"tipo"
=======
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, Operacao=22, Digitos=23, Letras=24, 
		TRUE=25, FALSE=26, SC=27, V=28, OP=29, CP=30, TD=31, TDE=32, NOT=33, WS=34;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_partDeclVar = 2, RULE_declVar = 3, 
		RULE_listIdent = 4, RULE_partDecSubRot = 5, RULE_declProced = 6, RULE_paramFormais = 7, 
		RULE_secParamFormais = 8, RULE_comandoComposto = 9, RULE_comando = 10, 
		RULE_atribuicao = 11, RULE_chamadaProcedimento = 12, RULE_comandoCondicional = 13, 
		RULE_comandoRepetitivo = 14, RULE_expressao = 15, RULE_relacao = 16, RULE_expressaoSimples = 17, 
		RULE_termo = 18, RULE_fator = 19, RULE_variavel = 20, RULE_listExpressoes = 21, 
		RULE_numero = 22, RULE_ident = 23, RULE_tipo = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloco", "partDeclVar", "declVar", "listIdent", "partDecSubRot", 
			"declProced", "paramFormais", "secParamFormais", "comandoComposto", "comando", 
			"atribuicao", "chamadaProcedimento", "comandoCondicional", "comandoRepetitivo", 
			"expressao", "relacao", "expressaoSimples", "termo", "fator", "variavel", 
			"listExpressoes", "numero", "ident", "tipo"
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
<<<<<<< HEAD
			null, null, null, null, "'program'", "'procedure'", "'var'", "'begin'", 
			"'end'", "'then'", "'else'", "'while'", "'do'", "'or'", "'div'", "'and'", 
			"'not'", "'integer'", "'real'", "'boolean'", "'char'", "'String'", "'TRUE'", 
			"'FALSE'", "'+'", "'-'", "'*'", "'('", "')'", "';'", "','", "':'", "':='", 
			"'if'"
=======
			null, "'program'", "'procedure'", "'var'", "'begin'", "'end'", "'if'", 
			"'then'", "'else'", "'while'", "'do'", "'+'", "'-'", "'or'", "'*'", "'div'", 
			"'and'", "'integer'", "'real'", "'boolean'", "'char'", "'string'", null, 
			null, null, "'true'", "'false'", "';'", "','", "'('", "')'", "':'", "':='", 
			"'not'"
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
<<<<<<< HEAD
			null, "Digito", "Letra", "Relacao", "PROGRAM", "PROCEDURE", "VAR", "BEGIN", 
			"END", "THEN", "ELSE", "WHILE", "DO", "OR", "DIV", "AND", "NOT", "Integer", 
			"Real", "Boolean", "Char", "String", "TRUE", "FALSE", "PLUS", "MINUS", 
			"TIMES", "AP", "FP", "PV", "VG", "DP", "ATB", "IF", "WS"
=======
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Operacao", 
			"Digitos", "Letras", "TRUE", "FALSE", "SC", "V", "OP", "CP", "TD", "TDE", 
			"NOT", "WS"
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "miniPascalLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

<<<<<<< HEAD

		private int _tipo;
		private String _varName;
		private String _varValue;
		private PascalSymbolTable symbolTable = new PascalSymbolTable();
		private PascalSymbol symbol;
<<<<<<< HEAD
		
		public void verificaID(String id){
			if(!symbolTable.exists(id)){
				throw new PascalSemanticException("Symbol "+_varName+" already declared");
			}
		}
<<<<<<< HEAD
		
=======
=======
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e

=======
>>>>>>> parent of 08655c7... Em andamento
	public miniPascalLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
<<<<<<< HEAD
		public TerminalNode PROGRAM() { return getToken(miniPascalLangParser.PROGRAM, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
=======
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		}
		public TerminalNode PV() { return getToken(miniPascalLangParser.PV, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(48);
			match(PROGRAM);
			setState(49);
			identificador();
			setState(50);
			match(PV);
			setState(51);
=======
			setState(50);
			match(T__0);
			setState(51);
			ident();
<<<<<<< HEAD
			 verificaID(_input.LT(-1).getText()); 
			setState(53);
=======
			setState(52);
>>>>>>> parent of 943c220... Em andamento v4
			match(SC);
			setState(53);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public Comando_compostoContext comando_composto() {
			return getRuleContext(Comando_compostoContext.class,0);
		}
		public Part_decl_varContext part_decl_var() {
			return getRuleContext(Part_decl_varContext.class,0);
		}
		public Part_decl_sub_rotinasContext part_decl_sub_rotinas() {
			return getRuleContext(Part_decl_sub_rotinasContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Real) | (1L << Boolean) | (1L << String))) != 0)) {
				{
				setState(53);
				part_decl_var();
				}
			}

			setState(57);
=======
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				setState(55);
				partDeclVar();
				}
			}

			setState(59);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(56);
				part_decl_sub_rotinas();
				}
				break;
			}
			setState(59);
			comando_composto();
=======
				setState(58);
				partDecSubRot();
				}
				break;
			}
			setState(61);
			comandoComposto();
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Part_decl_varContext extends ParserRuleContext {
		public List<Decl_varsContext> decl_vars() {
			return getRuleContexts(Decl_varsContext.class);
		}
		public Decl_varsContext decl_vars(int i) {
			return getRuleContext(Decl_varsContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(miniPascalLangParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(miniPascalLangParser.PV, i);
		}
		public Part_decl_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_decl_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterPart_decl_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitPart_decl_var(this);
		}
	}

	public final Part_decl_varContext part_decl_var() throws RecognitionException {
		Part_decl_varContext _localctx = new Part_decl_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_part_decl_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(61);
			decl_vars();
			setState(66);
=======
			setState(63);
			declVar();
			setState(68);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(62);
					match(PV);
					setState(63);
					decl_vars();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(69);
			match(PV);
=======
					setState(64);
					match(SC);
					setState(65);
					declVar();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(71);
			match(SC);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_varsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_identificadoresContext lista_identificadores() {
			return getRuleContext(Lista_identificadoresContext.class,0);
		}
		public Decl_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterDecl_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitDecl_vars(this);
		}
	}

	public final Decl_varsContext decl_vars() throws RecognitionException {
		Decl_varsContext _localctx = new Decl_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(71);
			tipo();
			setState(72);
			lista_identificadores();
=======
			setState(73);
			tipo();
			setState(74);
			listIdent();
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_identificadoresContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<TerminalNode> VG() { return getTokens(miniPascalLangParser.VG); }
		public TerminalNode VG(int i) {
			return getToken(miniPascalLangParser.VG, i);
		}
		public Lista_identificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_identificadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterLista_identificadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitLista_identificadores(this);
		}
	}

	public final Lista_identificadoresContext lista_identificadores() throws RecognitionException {
		Lista_identificadoresContext _localctx = new Lista_identificadoresContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_identificadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(74);
			identificador();

											_varName = _input.LT(-1).getText();
											_varValue = null;
											symbol = new PascalVariable( _varName, _tipo, _varValue);
											System.out.println("Simbolo adicionado" + symbol);
											if (!symbolTable.exists(_varName)){
												symbolTable.add(symbol);
											}
											else{
												throw new PascalSemanticException("Symbol "+_varName+" already declared");
											}		
									
			setState(82);
=======
			setState(76);
			ident();
<<<<<<< HEAD

													_varName = _input.LT(-1).getText();
													_varValue = null;
													symbol = new PascalVariable(_varName,_tipo, _varValue);
													if(!symbolTable.exists(_varName)){
														symbolTable.add(symbol);
													}else {
														throw new PascalSemanticException("Symbol"+ _varName+"already declared");
													}
													
<<<<<<< HEAD
			setState(85);
=======
			setState(81);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(84);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VG) {
				{
				{
<<<<<<< HEAD
				setState(76);
				match(VG);
				setState(77);
				identificador();

												_varName = _input.LT(-1).getText();
												_varValue = null;
												symbol = new PascalVariable( _varName, _tipo, _varValue);
												System.out.println("Simbolo adicionado" + symbol);
												if (!symbolTable.exists(_varName)){
													symbolTable.add(symbol);
												}
												else{
													throw new PascalSemanticException("Symbol "+_varName+" already declared");
												}	
										
				}
				}
				setState(84);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(79);
=======
				setState(78);
>>>>>>> parent of 943c220... Em andamento v4
				match(V);
				setState(79);
				ident();
				 
														_varName = _input.LT(-1).getText();
														_varValue = null;
														symbol = new PascalVariable(_varName,_tipo, _varValue);
														if(!symbolTable.exists(_varName)){
															symbolTable.add(symbol);
														}else {
															throw new PascalSemanticException("Symbol"+ _varName+"already declared");
														}
												
				}
				}
<<<<<<< HEAD
				setState(87);
=======
				setState(77);
				match(V);
				setState(78);
				ident();
				}
				}
				setState(83);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(86);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Part_decl_sub_rotinasContext extends ParserRuleContext {
		public List<Decl_procedimentoContext> decl_procedimento() {
			return getRuleContexts(Decl_procedimentoContext.class);
		}
		public Decl_procedimentoContext decl_procedimento(int i) {
			return getRuleContext(Decl_procedimentoContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(miniPascalLangParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(miniPascalLangParser.PV, i);
		}
		public Part_decl_sub_rotinasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_decl_sub_rotinas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterPart_decl_sub_rotinas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitPart_decl_sub_rotinas(this);
		}
	}

	public final Part_decl_sub_rotinasContext part_decl_sub_rotinas() throws RecognitionException {
		Part_decl_sub_rotinasContext _localctx = new Part_decl_sub_rotinasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_part_decl_sub_rotinas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(85);
				decl_procedimento();
				setState(86);
				match(PV);
				}
				}
				setState(92);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(93);
=======
			setState(89);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(92);
>>>>>>> parent of 943c220... Em andamento v4
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
<<<<<<< HEAD
<<<<<<< HEAD
				setState(88);
=======
				setState(87);
>>>>>>> parent of 943c220... Em andamento v4
				declProced();
				setState(88);
				match(SC);
				}
				}
<<<<<<< HEAD
				setState(95);
=======
				setState(84);
				declProced();
				setState(85);
				match(SC);
				}
				}
				setState(91);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(94);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_procedimentoContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(miniPascalLangParser.PROCEDURE, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PV() { return getToken(miniPascalLangParser.PV, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Parametr_formaisContext parametr_formais() {
			return getRuleContext(Parametr_formaisContext.class,0);
		}
		public Decl_procedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterDecl_procedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitDecl_procedimento(this);
		}
	}

	public final Decl_procedimentoContext decl_procedimento() throws RecognitionException {
		Decl_procedimentoContext _localctx = new Decl_procedimentoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(93);
			match(PROCEDURE);
			setState(94);
			identificador();
			 verificaID(_input.LT(-1).getText()); 
			setState(97);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(96);
=======
			setState(95);
>>>>>>> parent of 943c220... Em andamento v4
			match(T__0);
			setState(96);
			ident();
<<<<<<< HEAD
			 verificaID(_input.LT(-1).getText()); 
			setState(100);
=======
			setState(92);
			match(T__1);
			setState(93);
			ident();
			setState(95);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(98);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AP) {
				{
<<<<<<< HEAD
				setState(96);
				parametr_formais();
				}
			}

			setState(99);
			match(PV);
			setState(100);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(99);
=======
				setState(94);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(97);
>>>>>>> parent of 943c220... Em andamento v4
				paramFormais();
				}
			}

<<<<<<< HEAD
<<<<<<< HEAD
			setState(102);
			match(SC);
			setState(103);
=======
			setState(97);
			match(SC);
			setState(98);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(100);
			match(SC);
			setState(101);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametr_formaisContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(miniPascalLangParser.AP, 0); }
		public List<Selec_parametr_formaisContext> selec_parametr_formais() {
			return getRuleContexts(Selec_parametr_formaisContext.class);
		}
		public Selec_parametr_formaisContext selec_parametr_formais(int i) {
			return getRuleContext(Selec_parametr_formaisContext.class,i);
		}
		public TerminalNode FP() { return getToken(miniPascalLangParser.FP, 0); }
		public List<TerminalNode> PV() { return getTokens(miniPascalLangParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(miniPascalLangParser.PV, i);
		}
		public Parametr_formaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametr_formais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterParametr_formais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitParametr_formais(this);
		}
	}

	public final Parametr_formaisContext parametr_formais() throws RecognitionException {
		Parametr_formaisContext _localctx = new Parametr_formaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametr_formais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(102);
			match(AP);
			setState(103);
			selec_parametr_formais();
			setState(108);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(105);
=======
			setState(103);
>>>>>>> parent of 943c220... Em andamento v4
			match(OP);
			setState(104);
			secParamFormais();
<<<<<<< HEAD
			setState(111);
=======
			setState(100);
			match(OP);
			setState(101);
			secParamFormais();
			setState(106);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(109);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PV) {
				{
				{
<<<<<<< HEAD
				setState(104);
				match(PV);
				setState(105);
				selec_parametr_formais();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(FP);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(107);
=======
				setState(105);
>>>>>>> parent of 943c220... Em andamento v4
				match(SC);
				setState(106);
				secParamFormais();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
<<<<<<< HEAD
			setState(114);
=======
				setState(102);
				match(SC);
				setState(103);
				secParamFormais();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(112);
>>>>>>> parent of 943c220... Em andamento v4
			match(CP);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selec_parametr_formaisContext extends ParserRuleContext {
		public Lista_identificadoresContext lista_identificadores() {
			return getRuleContext(Lista_identificadoresContext.class,0);
		}
		public TerminalNode DP() { return getToken(miniPascalLangParser.DP, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
<<<<<<< HEAD
		public TerminalNode VAR() { return getToken(miniPascalLangParser.VAR, 0); }
		public Selec_parametr_formaisContext(ParserRuleContext parent, int invokingState) {
=======
		public SecParamFormaisContext(ParserRuleContext parent, int invokingState) {
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selec_parametr_formais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterSelec_parametr_formais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitSelec_parametr_formais(this);
		}
	}

	public final Selec_parametr_formaisContext selec_parametr_formais() throws RecognitionException {
		Selec_parametr_formaisContext _localctx = new Selec_parametr_formaisContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selec_parametr_formais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(114);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(117);
=======
			setState(112);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(115);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
<<<<<<< HEAD
				setState(113);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(116);
=======
				setState(114);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				match(VAR);
				}
			}

<<<<<<< HEAD
			setState(116);
			lista_identificadores();
			setState(117);
			match(DP);
			setState(118);
			identificador();
=======
			setState(117);
			listIdent();
			setState(118);
			match(TD);
<<<<<<< HEAD
			setState(121);
=======
				setState(111);
				match(T__2);
				}
			}

			setState(114);
			listIdent();
			setState(115);
			match(TD);
			setState(116);
>>>>>>> parent of 08655c7... Em andamento
			ident();
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			 verificaID(_input.LT(-1).getText()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

<<<<<<< HEAD
	public static class Comando_compostoContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(miniPascalLangParser.BEGIN, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
=======
	public static class ComandoCompostoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(miniPascalLangParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(miniPascalLangParser.SC, i);
		}
		public ComandoCompostoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoComposto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterComandoComposto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitComandoComposto(this);
		}
	}

	public final ComandoCompostoContext comandoComposto() throws RecognitionException {
		ComandoCompostoContext _localctx = new ComandoCompostoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comandoComposto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__3);
			setState(119);
			comando();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SC) {
				{
				{
				setState(120);
				match(SC);
				setState(121);
				comando();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(T__4);
=======
			setState(119);
			ident();
>>>>>>> parent of 943c220... Em andamento v4
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ChamadaProcedimentoContext chamadaProcedimento() {
			return getRuleContext(ChamadaProcedimentoContext.class,0);
		}
		public ComandoCompostoContext comandoComposto() {
			return getRuleContext(ComandoCompostoContext.class,0);
		}
		public ComandoCondicionalContext comandoCondicional() {
			return getRuleContext(ComandoCondicionalContext.class,0);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode END() { return getToken(miniPascalLangParser.END, 0); }
		public Comando_compostoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_composto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterComando_composto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitComando_composto(this);
		}
	}

<<<<<<< HEAD
	public final Comando_compostoContext comando_composto() throws RecognitionException {
		Comando_compostoContext _localctx = new Comando_compostoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando_composto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(BEGIN);
			setState(122);
			comando();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letra) | (1L << BEGIN) | (1L << WHILE) | (1L << IF))) != 0)) {
				{
				{
				setState(123);
				comando();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(END);
			System.out.println("Reconheci um comando composto");
=======
	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comando);
		try {
<<<<<<< HEAD
<<<<<<< HEAD
			setState(129);
=======
			setState(134);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(126);
>>>>>>> parent of 943c220... Em andamento v4
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
<<<<<<< HEAD
				setState(124);
=======
				setState(129);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(121);
>>>>>>> parent of 943c220... Em andamento v4
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
<<<<<<< HEAD
				setState(125);
=======
				setState(130);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(122);
>>>>>>> parent of 943c220... Em andamento v4
				chamadaProcedimento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
<<<<<<< HEAD
				setState(126);
=======
				setState(131);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(123);
>>>>>>> parent of 943c220... Em andamento v4
				comandoComposto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
<<<<<<< HEAD
				setState(127);
=======
				setState(132);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(124);
>>>>>>> parent of 943c220... Em andamento v4
				comandoCondicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
<<<<<<< HEAD
				setState(128);
=======
				setState(133);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(125);
>>>>>>> parent of 943c220... Em andamento v4
				comandoRepetitivo();
				}
				break;
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

<<<<<<< HEAD
	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
=======
<<<<<<< HEAD
	public static class ComandoCompostoContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(miniPascalLangParser.BEGIN, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		}
		public Chamada_procedimentoContext chamada_procedimento() {
			return getRuleContext(Chamada_procedimentoContext.class,0);
		}
		public Comando_compostoContext comando_composto() {
			return getRuleContext(Comando_compostoContext.class,0);
		}
		public Comando_condicionalContext comando_condicional() {
			return getRuleContext(Comando_condicionalContext.class,0);
		}
		public Comando_repetitivoContext comando_repetitivo() {
			return getRuleContext(Comando_repetitivoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comando);
		try {
<<<<<<< HEAD
			setState(137);
=======
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(BEGIN);
			setState(129);
			comando();
			setState(134);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(133);
				chamada_procedimento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				comando_composto();
=======
				setState(130);
				match(SC);
				setState(131);
				comando();
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				comando_condicional();
				}
<<<<<<< HEAD
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				comando_repetitivo();
				}
				break;
=======
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(END);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

=======
>>>>>>> parent of 08655c7... Em andamento
	public static class AtribuicaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode ATB() { return getToken(miniPascalLangParser.ATB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(139);
			variavel();
			setState(140);
			match(ATB);
			setState(141);
			expressao();
			System.out.println("Reconheci um comando de atribuicao");
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(143);
=======
			setState(139);
>>>>>>> parent of 943c220... Em andamento v4
			variavel();
			setState(140);
			match(TDE);
<<<<<<< HEAD
			setState(145);
=======
			setState(136);
			variavel();
			setState(137);
			match(TDE);
			setState(138);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(141);
>>>>>>> parent of 943c220... Em andamento v4
			expressao();
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_procedimentoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode AP() { return getToken(miniPascalLangParser.AP, 0); }
		public List_expressoesContext list_expressoes() {
			return getRuleContext(List_expressoesContext.class,0);
		}
		public TerminalNode FP() { return getToken(miniPascalLangParser.FP, 0); }
		public Chamada_procedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterChamada_procedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitChamada_procedimento(this);
		}
	}

	public final Chamada_procedimentoContext chamada_procedimento() throws RecognitionException {
		Chamada_procedimentoContext _localctx = new Chamada_procedimentoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chamada_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(144);
			identificador();
			 verificaID(_input.LT(-1).getText()); 
			setState(150);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(148);
			ident();
			 verificaID(_input.LT(-1).getText()); 
			setState(154);
=======
			setState(140);
			ident();
			setState(145);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(143);
			ident();
			setState(148);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AP) {
				{
<<<<<<< HEAD
				setState(146);
				match(AP);
				setState(147);
				list_expressoes();
				setState(148);
				match(FP);
				}
			}

			System.out.println("Reconheci um comando de chamada de procedimento");
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(150);
=======
				setState(144);
>>>>>>> parent of 943c220... Em andamento v4
				match(OP);
				setState(145);
				listExpressoes();
<<<<<<< HEAD
				setState(152);
=======
				setState(141);
				match(OP);
				setState(142);
				listExpressoes();
				setState(143);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(146);
>>>>>>> parent of 943c220... Em andamento v4
				match(CP);
				}
			}

>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

<<<<<<< HEAD
	public static class Comando_condicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miniPascalLangParser.IF, 0); }
=======
	public static class ComandoCondicionalContext extends ParserRuleContext {
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
<<<<<<< HEAD
		public TerminalNode ELSE() { return getToken(miniPascalLangParser.ELSE, 0); }
		public Comando_condicionalContext(ParserRuleContext parent, int invokingState) {
=======
		public ComandoCondicionalContext(ParserRuleContext parent, int invokingState) {
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterComando_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitComando_condicional(this);
		}
	}

	public final Comando_condicionalContext comando_condicional() throws RecognitionException {
		Comando_condicionalContext _localctx = new Comando_condicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comando_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(154);
			match(IF);
			setState(155);
			expressao();
			setState(156);
			match(THEN);
			setState(157);
			comando();
			setState(160);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(158);
=======
			setState(150);
>>>>>>> parent of 943c220... Em andamento v4
			match(IF);
			setState(151);
			expressao();
			setState(152);
			match(THEN);
			setState(153);
			comando();
<<<<<<< HEAD
			setState(164);
=======
			setState(147);
			match(T__5);
			setState(148);
			expressao();
			setState(149);
			match(T__6);
			setState(150);
			comando();
			setState(153);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(156);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(158);
				match(ELSE);
				setState(159);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(162);
				match(ELSE);
				setState(163);
=======
				setState(151);
				match(T__7);
				setState(152);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(154);
				match(ELSE);
				setState(155);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				comando();
				}
				break;
			}
<<<<<<< HEAD
			System.out.println("Reconheci um comando condicional");
=======
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

<<<<<<< HEAD
	public static class Comando_repetitivoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(miniPascalLangParser.WHILE, 0); }
=======
	public static class ComandoRepetitivoContext extends ParserRuleContext {
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Comando_repetitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_repetitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterComando_repetitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitComando_repetitivo(this);
		}
	}

	public final Comando_repetitivoContext comando_repetitivo() throws RecognitionException {
		Comando_repetitivoContext _localctx = new Comando_repetitivoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando_repetitivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(164);
			match(WHILE);
			setState(165);
			expressao();
			setState(166);
			match(DO);
			setState(167);
			comando();
			System.out.println("Reconheci um comando repetitivo");
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(168);
=======
			setState(158);
>>>>>>> parent of 943c220... Em andamento v4
			match(WHILE);
			setState(159);
			expressao();
			setState(160);
			match(DO);
<<<<<<< HEAD
			setState(171);
=======
			setState(155);
			match(T__8);
			setState(156);
			expressao();
			setState(157);
			match(T__9);
			setState(158);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(161);
>>>>>>> parent of 943c220... Em andamento v4
			comando();
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Expressao_simplesContext> expressao_simples() {
			return getRuleContexts(Expressao_simplesContext.class);
		}
		public Expressao_simplesContext expressao_simples(int i) {
			return getRuleContext(Expressao_simplesContext.class,i);
		}
		public TerminalNode Relacao() { return getToken(miniPascalLangParser.Relacao, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(170);
			expressao_simples();
			setState(173);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(174);
			expressaoSimples();
			setState(178);
=======
			setState(160);
			expressaoSimples();
			setState(164);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(163);
			expressaoSimples();
			setState(167);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(171);
				match(Relacao);
				setState(172);
				expressao_simples();
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(175);
				relacao();
				setState(176);
=======
				setState(161);
				relacao();
				setState(162);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(164);
				relacao();
				setState(165);
>>>>>>> parent of 943c220... Em andamento v4
				expressaoSimples();
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

<<<<<<< HEAD
	public static class Expressao_simplesContext extends ParserRuleContext {
=======
	public static class RelacaoContext extends ParserRuleContext {
		public TerminalNode Operacao() { return getToken(miniPascalLangParser.Operacao, 0); }
		public RelacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterRelacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitRelacao(this);
		}
	}

	public final RelacaoContext relacao() throws RecognitionException {
		RelacaoContext _localctx = new RelacaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
<<<<<<< HEAD
			setState(180);
=======
			setState(166);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(169);
>>>>>>> parent of 943c220... Em andamento v4
			match(Operacao);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoSimplesContext extends ParserRuleContext {
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
<<<<<<< HEAD
		public List<TerminalNode> PLUS() { return getTokens(miniPascalLangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(miniPascalLangParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(miniPascalLangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(miniPascalLangParser.MINUS, i);
		}
		public List<TerminalNode> OR() { return getTokens(miniPascalLangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(miniPascalLangParser.OR, i);
		}
		public Expressao_simplesContext(ParserRuleContext parent, int invokingState) {
=======
		public ExpressaoSimplesContext(ParserRuleContext parent, int invokingState) {
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterExpressao_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitExpressao_simples(this);
		}
	}

	public final Expressao_simplesContext expressao_simples() throws RecognitionException {
		Expressao_simplesContext _localctx = new Expressao_simplesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressao_simples);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(183);
=======
			setState(169);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(172);
>>>>>>> parent of 943c220... Em andamento v4
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
<<<<<<< HEAD
<<<<<<< HEAD
				setState(182);
=======
				setState(168);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(171);
>>>>>>> parent of 943c220... Em andamento v4
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

<<<<<<< HEAD
			setState(178);
			termo();
			setState(183);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(185);
=======
			setState(174);
>>>>>>> parent of 943c220... Em andamento v4
			termo();
			setState(179);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(180);
					termo();
					}
					} 
				}
<<<<<<< HEAD
				setState(185);
=======
				setState(192);
=======
			setState(171);
			termo();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(172);
=======
					setState(175);
>>>>>>> parent of 943c220... Em andamento v4
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
<<<<<<< HEAD
					setState(173);
=======
					setState(176);
>>>>>>> parent of 943c220... Em andamento v4
					termo();
					}
					} 
				}
<<<<<<< HEAD
				setState(178);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(181);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
<<<<<<< HEAD
		public List<TerminalNode> TIMES() { return getTokens(miniPascalLangParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(miniPascalLangParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(miniPascalLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(miniPascalLangParser.DIV, i);
		}
		public List<TerminalNode> AND() { return getTokens(miniPascalLangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(miniPascalLangParser.AND, i);
		}
=======
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(186);
			fator();
			setState(191);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(193);
=======
			setState(182);
>>>>>>> parent of 943c220... Em andamento v4
			fator();
			setState(187);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << AND) | (1L << TIMES))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(188);
					fator();
					}
					} 
				}
<<<<<<< HEAD
				setState(193);
=======
				setState(200);
=======
			setState(179);
			fator();
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(180);
=======
					setState(183);
>>>>>>> parent of 943c220... Em andamento v4
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
<<<<<<< HEAD
					setState(181);
=======
					setState(184);
>>>>>>> parent of 943c220... Em andamento v4
					fator();
					}
					} 
				}
<<<<<<< HEAD
				setState(186);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(189);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode AP() { return getToken(miniPascalLangParser.AP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(miniPascalLangParser.FP, 0); }
		public TerminalNode NOT() { return getToken(miniPascalLangParser.NOT, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fator);
		try {
<<<<<<< HEAD
			setState(202);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(209);
=======
			setState(195);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(198);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letra:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(194);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(201);
=======
				setState(187);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(190);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				variavel();
				}
				break;
			case Digito:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(195);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(202);
=======
				setState(188);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(191);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				numero();
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(196);
				match(AP);
				setState(197);
				expressao();
				setState(198);
				match(FP);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(203);
=======
				setState(192);
>>>>>>> parent of 943c220... Em andamento v4
				match(OP);
				setState(193);
				expressao();
<<<<<<< HEAD
				setState(205);
=======
				setState(189);
				match(OP);
				setState(190);
				expressao();
				setState(191);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(194);
>>>>>>> parent of 943c220... Em andamento v4
				match(CP);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(200);
				match(NOT);
				setState(201);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(207);
				match(NOT);
				setState(208);
=======
				setState(193);
				match(NOT);
				setState(194);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(196);
				match(NOT);
				setState(197);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				fator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variavel);
		try {
<<<<<<< HEAD
			setState(212);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(217);
=======
			setState(202);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(205);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(204);
				identificador();
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(211);
=======
				setState(197);
>>>>>>> parent of 08655c7... Em andamento
				ident();
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				 verificaID(_input.LT(-1).getText()); 
=======
				setState(200);
				ident();
>>>>>>> parent of 943c220... Em andamento v4
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(207);
				identificador();
				 verificaID(_input.LT(-1).getText()); 
				setState(210);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(214);
				ident();
				 verificaID(_input.LT(-1).getText()); 
=======
				setState(198);
				ident();
				setState(200);
=======
				setState(201);
				ident();
				setState(203);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
<<<<<<< HEAD
					setState(209);
=======
<<<<<<< HEAD
					setState(199);
=======
					setState(202);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
					expressao();
					}
					break;
				}
<<<<<<< HEAD
=======
>>>>>>> parent of 08655c7... Em andamento
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_expressoesContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VG() { return getTokens(miniPascalLangParser.VG); }
		public TerminalNode VG(int i) {
			return getToken(miniPascalLangParser.VG, i);
		}
		public List_expressoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expressoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterList_expressoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitList_expressoes(this);
		}
	}

	public final List_expressoesContext list_expressoes() throws RecognitionException {
		List_expressoesContext _localctx = new List_expressoesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_expressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(214);
			expressao();
			setState(219);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(219);
			expressao();
			setState(224);
=======
			setState(204);
			expressao();
			setState(209);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(207);
			expressao();
			setState(212);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VG) {
				{
				{
<<<<<<< HEAD
				setState(215);
				match(VG);
				setState(216);
				expressao();
				}
				}
				setState(221);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(220);
				match(V);
				setState(221);
				expressao();
				}
				}
				setState(226);
=======
				setState(205);
				match(V);
				setState(206);
				expressao();
				}
				}
				setState(211);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(208);
				match(V);
				setState(209);
				expressao();
				}
				}
				setState(214);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeroContext extends ParserRuleContext {
		public List<TerminalNode> Digito() { return getTokens(miniPascalLangParser.Digito); }
		public TerminalNode Digito(int i) {
			return getToken(miniPascalLangParser.Digito, i);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(222);
			match(Digito);
			setState(226);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(227);
			match(Digitos);
			setState(231);
=======
			setState(212);
			match(Digitos);
			setState(216);
>>>>>>> parent of 08655c7... Em andamento
=======
			setState(215);
			match(Digitos);
			setState(219);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Digito) {
				{
				{
<<<<<<< HEAD
				setState(223);
				match(Digito);
				}
				}
				setState(228);
=======
<<<<<<< HEAD
<<<<<<< HEAD
				setState(228);
				match(Digitos);
				}
				}
				setState(233);
=======
				setState(213);
				match(Digitos);
				}
				}
				setState(218);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(216);
				match(Digitos);
				}
				}
				setState(221);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> Letra() { return getTokens(miniPascalLangParser.Letra); }
		public TerminalNode Letra(int i) {
			return getToken(miniPascalLangParser.Letra, i);
		}
		public List<TerminalNode> Digito() { return getTokens(miniPascalLangParser.Digito); }
		public TerminalNode Digito(int i) {
			return getToken(miniPascalLangParser.Digito, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identificador);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(229);
			match(Letra);
			setState(233);
=======
<<<<<<< HEAD
<<<<<<< HEAD
			setState(234);
			match(Letras);
			setState(238);
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					_la = _input.LA(1);
					if ( !(_la==Digito || _la==Letra) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
<<<<<<< HEAD
				setState(235);
=======
				setState(240);
=======
			setState(219);
			match(Letras);
			setState(223);
=======
			setState(222);
			match(Letras);
			setState(226);
>>>>>>> parent of 943c220... Em andamento v4
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(220);
=======
					setState(223);
>>>>>>> parent of 943c220... Em andamento v4
					_la = _input.LA(1);
					if ( !(_la==Digitos || _la==Letras) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
<<<<<<< HEAD
				setState(225);
>>>>>>> parent of 08655c7... Em andamento
=======
				setState(228);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
<<<<<<< HEAD
		public TerminalNode Integer() { return getToken(miniPascalLangParser.Integer, 0); }
		public TerminalNode Real() { return getToken(miniPascalLangParser.Real, 0); }
		public TerminalNode Boolean() { return getToken(miniPascalLangParser.Boolean, 0); }
		public TerminalNode String() { return getToken(miniPascalLangParser.String, 0); }
=======
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 46, RULE_tipo);
		try {
			setState(244);
=======
		enterRule(_localctx, 48, RULE_tipo);
		int _la;
		try {
<<<<<<< HEAD
<<<<<<< HEAD
			setState(249);
=======
			setState(237);
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(236);
				match(Integer);
				 _tipo = PascalVariable.INTEGER; 
=======
<<<<<<< HEAD
				setState(241);
=======
				setState(229);
>>>>>>> parent of 943c220... Em andamento v4
				match(INTEGER);
				_tipo = PascalVariable.INTEGER;
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				}
				break;
			case Real:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(238);
				match(Real);
				 _tipo = PascalVariable.REAL; 
=======
<<<<<<< HEAD
				setState(243);
=======
				setState(231);
>>>>>>> parent of 943c220... Em andamento v4
				match(REAL);
				_tipo = PascalVariable.REAL;
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(240);
				match(Boolean);
				 _tipo = PascalVariable.BOOLEAN; 
=======
<<<<<<< HEAD
				setState(245);
=======
				setState(233);
>>>>>>> parent of 943c220... Em andamento v4
				match(BOOLEAN);
				_tipo = PascalVariable.BOOLEAN;
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(242);
				match(String);
				 _tipo = PascalVariable.STRING; 
=======
<<<<<<< HEAD
				setState(247);
=======
				setState(235);
>>>>>>> parent of 943c220... Em andamento v4
				match(STRING);
				_tipo = PascalVariable.STRING;
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
				}
				break;
			default:
				throw new NoViableAltException(this);
=======
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
>>>>>>> parent of 08655c7... Em andamento
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00f9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\5\39\n\3\3\3\5\3<\n\3\3\3\3\3\3\4\3\4\3\4\7\4"+
		"C\n\4\f\4\16\4F\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6S"+
		"\n\6\f\6\16\6V\13\6\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\b\3\b\3\b\3"+
		"\b\5\bd\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\t\3"+
		"\t\3\n\5\nu\n\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\177\n\13\f\13"+
		"\16\13\u0082\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0099\n\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00b0\n\21\3\22\5\22\u00b3\n"+
		"\22\3\22\3\22\3\22\7\22\u00b8\n\22\f\22\16\22\u00bb\13\22\3\23\3\23\3"+
		"\23\7\23\u00c0\n\23\f\23\16\23\u00c3\13\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u00cd\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d5"+
		"\n\25\5\25\u00d7\n\25\3\26\3\26\3\26\7\26\u00dc\n\26\f\26\16\26\u00df"+
		"\13\26\3\27\3\27\7\27\u00e3\n\27\f\27\16\27\u00e6\13\27\3\30\3\30\7\30"+
		"\u00ea\n\30\f\30\16\30\u00ed\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00f7\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\6\3\2\32\33\4\2\17\17\32\33\4\2\20\21\34\34\3\2\3\4"+
		"\2\u00fe\2\62\3\2\2\2\48\3\2\2\2\6?\3\2\2\2\bI\3\2\2\2\nL\3\2\2\2\f\\"+
		"\3\2\2\2\16_\3\2\2\2\20h\3\2\2\2\22t\3\2\2\2\24{\3\2\2\2\26\u008b\3\2"+
		"\2\2\30\u008d\3\2\2\2\32\u0092\3\2\2\2\34\u009c\3\2\2\2\36\u00a6\3\2\2"+
		"\2 \u00ac\3\2\2\2\"\u00b2\3\2\2\2$\u00bc\3\2\2\2&\u00cc\3\2\2\2(\u00d6"+
		"\3\2\2\2*\u00d8\3\2\2\2,\u00e0\3\2\2\2.\u00e7\3\2\2\2\60\u00f6\3\2\2\2"+
		"\62\63\7\6\2\2\63\64\5.\30\2\64\65\7\37\2\2\65\66\5\4\3\2\66\3\3\2\2\2"+
		"\679\5\6\4\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\f\7\2;:\3\2\2\2;<\3\2"+
		"\2\2<=\3\2\2\2=>\5\24\13\2>\5\3\2\2\2?D\5\b\5\2@A\7\37\2\2AC\5\b\5\2B"+
		"@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\37\2\2"+
		"H\7\3\2\2\2IJ\5\60\31\2JK\5\n\6\2K\t\3\2\2\2LM\5.\30\2MT\b\6\1\2NO\7 "+
		"\2\2OP\5.\30\2PQ\b\6\1\2QS\3\2\2\2RN\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2"+
		"\2\2U\13\3\2\2\2VT\3\2\2\2WX\5\16\b\2XY\7\37\2\2Y[\3\2\2\2ZW\3\2\2\2["+
		"^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\r\3\2\2\2^\\\3\2\2\2_`\7\7\2\2`a\5.\30"+
		"\2ac\b\b\1\2bd\5\20\t\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\37\2\2fg\5\4"+
		"\3\2g\17\3\2\2\2hi\7\35\2\2in\5\22\n\2jk\7\37\2\2km\5\22\n\2lj\3\2\2\2"+
		"mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\36\2\2r\21\3\2"+
		"\2\2su\7\b\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5\n\6\2wx\7!\2\2xy\5.\30"+
		"\2yz\b\n\1\2z\23\3\2\2\2{|\7\t\2\2|\u0080\5\26\f\2}\177\5\26\f\2~}\3\2"+
		"\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\n\2\2\u0084\u0085\b\13\1\2"+
		"\u0085\25\3\2\2\2\u0086\u008c\5\30\r\2\u0087\u008c\5\32\16\2\u0088\u008c"+
		"\5\24\13\2\u0089\u008c\5\34\17\2\u008a\u008c\5\36\20\2\u008b\u0086\3\2"+
		"\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\27\3\2\2\2\u008d\u008e\5(\25\2\u008e\u008f\7\"\2"+
		"\2\u008f\u0090\5 \21\2\u0090\u0091\b\r\1\2\u0091\31\3\2\2\2\u0092\u0093"+
		"\5.\30\2\u0093\u0098\b\16\1\2\u0094\u0095\7\35\2\2\u0095\u0096\5*\26\2"+
		"\u0096\u0097\7\36\2\2\u0097\u0099\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\16\1\2\u009b\33\3\2\2\2\u009c"+
		"\u009d\7#\2\2\u009d\u009e\5 \21\2\u009e\u009f\7\13\2\2\u009f\u00a2\5\26"+
		"\f\2\u00a0\u00a1\7\f\2\2\u00a1\u00a3\5\26\f\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\17\1\2\u00a5\35\3\2\2"+
		"\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\7\16\2\2\u00a9"+
		"\u00aa\5\26\f\2\u00aa\u00ab\b\20\1\2\u00ab\37\3\2\2\2\u00ac\u00af\5\""+
		"\22\2\u00ad\u00ae\7\5\2\2\u00ae\u00b0\5\"\22\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0!\3\2\2\2\u00b1\u00b3\t\2\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b9\5$\23\2\u00b5\u00b6"+
		"\t\3\2\2\u00b6\u00b8\5$\23\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba#\3\2\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bc\u00c1\5&\24\2\u00bd\u00be\t\4\2\2\u00be\u00c0\5&\24\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"%\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00cd\5(\25\2\u00c5\u00cd\5,\27\2"+
		"\u00c6\u00c7\7\35\2\2\u00c7\u00c8\5 \21\2\u00c8\u00c9\7\36\2\2\u00c9\u00cd"+
		"\3\2\2\2\u00ca\u00cb\7\22\2\2\u00cb\u00cd\5&\24\2\u00cc\u00c4\3\2\2\2"+
		"\u00cc\u00c5\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\'\3"+
		"\2\2\2\u00ce\u00cf\5.\30\2\u00cf\u00d0\b\25\1\2\u00d0\u00d7\3\2\2\2\u00d1"+
		"\u00d2\5.\30\2\u00d2\u00d4\b\25\1\2\u00d3\u00d5\5 \21\2\u00d4\u00d3\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6"+
		"\u00d1\3\2\2\2\u00d7)\3\2\2\2\u00d8\u00dd\5 \21\2\u00d9\u00da\7 \2\2\u00da"+
		"\u00dc\5 \21\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de+\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e4"+
		"\7\3\2\2\u00e1\u00e3\7\3\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5-\3\2\2\2\u00e6\u00e4\3\2\2\2"+
		"\u00e7\u00eb\7\4\2\2\u00e8\u00ea\t\5\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec/\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\7\23\2\2\u00ef\u00f7\b\31\1\2\u00f0\u00f1\7"+
		"\24\2\2\u00f1\u00f7\b\31\1\2\u00f2\u00f3\7\25\2\2\u00f3\u00f7\b\31\1\2"+
		"\u00f4\u00f5\7\27\2\2\u00f5\u00f7\b\31\1\2\u00f6\u00ee\3\2\2\2\u00f6\u00f0"+
		"\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\61\3\2\2\2\318"+
		";DT\\cnt\u0080\u008b\u0098\u00a2\u00af\u00b2\u00b9\u00c1\u00cc\u00d4\u00d6"+
		"\u00dd\u00e4\u00eb\u00f6";
=======
<<<<<<< HEAD
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\5\3<\n\3\3\3\5\3?\n\3\3\3\3\3\3"+
		"\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7\3"+
		"\b\3\b\3\b\3\b\5\bg\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tp\n\t\f\t\16\t"+
		"s\13\t\3\t\3\t\3\n\5\nx\n\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0084\n\13\3\f\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009d"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a7\n\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00b5\n\21\3\22"+
		"\3\22\3\23\5\23\u00ba\n\23\3\23\3\23\3\23\7\23\u00bf\n\23\f\23\16\23\u00c2"+
		"\13\23\3\24\3\24\3\24\7\24\u00c7\n\24\f\24\16\24\u00ca\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d4\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00dc\n\26\3\27\3\27\3\27\7\27\u00e1\n\27\f\27\16\27\u00e4"+
		"\13\27\3\30\3\30\7\30\u00e8\n\30\f\30\16\30\u00eb\13\30\3\31\3\31\7\31"+
		"\u00ef\n\31\f\31\16\31\u00f2\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00fc\n\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\2\6\3\2\13\f\3\2\13\r\3\2\16\20\3\2\21\22\2\u0101\2"+
		"\64\3\2\2\2\4;\3\2\2\2\6B\3\2\2\2\bL\3\2\2\2\nO\3\2\2\2\f_\3\2\2\2\16"+
		"b\3\2\2\2\20k\3\2\2\2\22w\3\2\2\2\24\u0083\3\2\2\2\26\u0085\3\2\2\2\30"+
		"\u0091\3\2\2\2\32\u0096\3\2\2\2\34\u00a0\3\2\2\2\36\u00aa\3\2\2\2 \u00b0"+
		"\3\2\2\2\"\u00b6\3\2\2\2$\u00b9\3\2\2\2&\u00c3\3\2\2\2(\u00d3\3\2\2\2"+
		"*\u00db\3\2\2\2,\u00dd\3\2\2\2.\u00e5\3\2\2\2\60\u00ec\3\2\2\2\62\u00fb"+
		"\3\2\2\2\64\65\7\4\2\2\65\66\5\60\31\2\66\67\b\2\1\2\678\7\25\2\289\5"+
		"\4\3\29\3\3\2\2\2:<\5\6\4\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\f\7\2>="+
		"\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\5\26\f\2A\5\3\2\2\2BG\5\b\5\2CD\7\25\2"+
		"\2DF\5\b\5\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2"+
		"\2JK\7\25\2\2K\7\3\2\2\2LM\5\62\32\2MN\5\n\6\2N\t\3\2\2\2OP\5\60\31\2"+
		"PW\b\6\1\2QR\7\26\2\2RS\5\60\31\2ST\b\6\1\2TV\3\2\2\2UQ\3\2\2\2VY\3\2"+
		"\2\2WU\3\2\2\2WX\3\2\2\2X\13\3\2\2\2YW\3\2\2\2Z[\5\16\b\2[\\\7\25\2\2"+
		"\\^\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2a_\3\2\2"+
		"\2bc\7\3\2\2cd\5\60\31\2df\b\b\1\2eg\5\20\t\2fe\3\2\2\2fg\3\2\2\2gh\3"+
		"\2\2\2hi\7\25\2\2ij\5\4\3\2j\17\3\2\2\2kl\7\30\2\2lq\5\22\n\2mn\7\25\2"+
		"\2np\5\22\n\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2"+
		"\2\2tu\7\31\2\2u\21\3\2\2\2vx\7\27\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y"+
		"z\5\n\6\2z{\7\32\2\2{|\5\60\31\2|}\b\n\1\2}\23\3\2\2\2~\u0084\5\30\r\2"+
		"\177\u0084\5\32\16\2\u0080\u0084\5\26\f\2\u0081\u0084\5\34\17\2\u0082"+
		"\u0084\5\36\20\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\25\3\2\2\2\u0085\u0086"+
		"\7\36\2\2\u0086\u008b\5\24\13\2\u0087\u0088\7\25\2\2\u0088\u008a\5\24"+
		"\13\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\37"+
		"\2\2\u008f\u0090\b\f\1\2\u0090\27\3\2\2\2\u0091\u0092\5*\26\2\u0092\u0093"+
		"\7\33\2\2\u0093\u0094\5 \21\2\u0094\u0095\b\r\1\2\u0095\31\3\2\2\2\u0096"+
		"\u0097\5\60\31\2\u0097\u009c\b\16\1\2\u0098\u0099\7\30\2\2\u0099\u009a"+
		"\5,\27\2\u009a\u009b\7\31\2\2\u009b\u009d\3\2\2\2\u009c\u0098\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\16\1\2\u009f\33"+
		"\3\2\2\2\u00a0\u00a1\7 \2\2\u00a1\u00a2\5 \21\2\u00a2\u00a3\7!\2\2\u00a3"+
		"\u00a6\5\24\13\2\u00a4\u00a5\7\"\2\2\u00a5\u00a7\5\24\13\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\17\1\2"+
		"\u00a9\35\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\7"+
		"$\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\b\20\1\2\u00af\37\3\2\2\2\u00b0"+
		"\u00b4\5$\23\2\u00b1\u00b2\5\"\22\2\u00b2\u00b3\5$\23\2\u00b3\u00b5\3"+
		"\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00b7"+
		"\7\n\2\2\u00b7#\3\2\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0\5&\24\2\u00bc\u00bd\t\3"+
		"\2\2\u00bd\u00bf\5&\24\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1%\3\2\2\2\u00c2\u00c0\3\2\2\2"+
		"\u00c3\u00c8\5(\25\2\u00c4\u00c5\t\4\2\2\u00c5\u00c7\5(\25\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\'\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d4\5*\26\2\u00cc\u00d4\5.\30\2"+
		"\u00cd\u00ce\7\30\2\2\u00ce\u00cf\5 \21\2\u00cf\u00d0\7\31\2\2\u00d0\u00d4"+
		"\3\2\2\2\u00d1\u00d2\7\34\2\2\u00d2\u00d4\5(\25\2\u00d3\u00cb\3\2\2\2"+
		"\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4)\3"+
		"\2\2\2\u00d5\u00d6\5\60\31\2\u00d6\u00d7\b\26\1\2\u00d7\u00dc\3\2\2\2"+
		"\u00d8\u00d9\5\60\31\2\u00d9\u00da\b\26\1\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d5\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc+\3\2\2\2\u00dd\u00e2\5 \21\2"+
		"\u00de\u00df\7\26\2\2\u00df\u00e1\5 \21\2\u00e0\u00de\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3-\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e9\7\21\2\2\u00e6\u00e8\7\21\2\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"/\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0\7\22\2\2\u00ed\u00ef\t\5\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\61\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\5\2\2\u00f4"+
		"\u00fc\b\32\1\2\u00f5\u00f6\7\6\2\2\u00f6\u00fc\b\32\1\2\u00f7\u00f8\7"+
		"\7\2\2\u00f8\u00fc\b\32\1\2\u00f9\u00fa\7\t\2\2\u00fa\u00fc\b\32\1\2\u00fb"+
		"\u00f3\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\63\3\2\2\2\30;>GW_fqw\u0083\u008b\u009c\u00a6\u00b4\u00b9\u00c0"+
		"\u00c8\u00d3\u00db\u00e2\u00e9\u00f0\u00fb";
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\5\3;\n\3\3\3\5\3>\n\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\7\6R\n"+
		"\6\f\6\16\6U\13\6\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\3\b\5\b"+
		"b\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\n"+
		"\5\ns\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0094\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u009c\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00a7\n"+
		"\21\3\22\3\22\3\23\5\23\u00ac\n\23\3\23\3\23\3\23\7\23\u00b1\n\23\f\23"+
		"\16\23\u00b4\13\23\3\24\3\24\3\24\7\24\u00b9\n\24\f\24\16\24\u00bc\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c6\n\25\3\26\3\26"+
		"\3\26\5\26\u00cb\n\26\5\26\u00cd\n\26\3\27\3\27\3\27\7\27\u00d2\n\27\f"+
		"\27\16\27\u00d5\13\27\3\30\3\30\7\30\u00d9\n\30\f\30\16\30\u00dc\13\30"+
		"\3\31\3\31\7\31\u00e0\n\31\f\31\16\31\u00e3\13\31\3\32\3\32\3\32\2\2\33"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\3\2\r\16\3"+
		"\2\r\17\3\2\20\22\3\2\31\32\3\2\23\27\2\u00e8\2\64\3\2\2\2\4:\3\2\2\2"+
		"\6A\3\2\2\2\bK\3\2\2\2\nN\3\2\2\2\f[\3\2\2\2\16^\3\2\2\2\20f\3\2\2\2\22"+
		"r\3\2\2\2\24x\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2\2\32\u008e\3\2\2"+
		"\2\34\u0095\3\2\2\2\36\u009d\3\2\2\2 \u00a2\3\2\2\2\"\u00a8\3\2\2\2$\u00ab"+
		"\3\2\2\2&\u00b5\3\2\2\2(\u00c5\3\2\2\2*\u00cc\3\2\2\2,\u00ce\3\2\2\2."+
		"\u00d6\3\2\2\2\60\u00dd\3\2\2\2\62\u00e4\3\2\2\2\64\65\7\3\2\2\65\66\5"+
		"\60\31\2\66\67\7\35\2\2\678\5\4\3\28\3\3\2\2\29;\5\6\4\2:9\3\2\2\2:;\3"+
		"\2\2\2;=\3\2\2\2<>\5\f\7\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\24\13\2@"+
		"\5\3\2\2\2AF\5\b\5\2BC\7\35\2\2CE\5\b\5\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\35\2\2J\7\3\2\2\2KL\5\62\32\2LM\5"+
		"\n\6\2M\t\3\2\2\2NS\5\60\31\2OP\7\36\2\2PR\5\60\31\2QO\3\2\2\2RU\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2T\13\3\2\2\2US\3\2\2\2VW\5\16\b\2WX\7\35\2\2XZ\3"+
		"\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2][\3\2\2\2"+
		"^_\7\4\2\2_a\5\60\31\2`b\5\20\t\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\35"+
		"\2\2de\5\4\3\2e\17\3\2\2\2fg\7\37\2\2gl\5\22\n\2hi\7\35\2\2ik\5\22\n\2"+
		"jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7 \2\2"+
		"p\21\3\2\2\2qs\7\5\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\5\n\6\2uv\7!\2"+
		"\2vw\5\60\31\2w\23\3\2\2\2xy\7\6\2\2y~\5\26\f\2z{\7\35\2\2{}\5\26\f\2"+
		"|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0082\7\7\2\2\u0082\25\3\2\2\2\u0083\u0089\5\30\r\2\u0084"+
		"\u0089\5\32\16\2\u0085\u0089\5\24\13\2\u0086\u0089\5\34\17\2\u0087\u0089"+
		"\5\36\20\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\27\3\2\2\2\u008a\u008b"+
		"\5*\26\2\u008b\u008c\7\"\2\2\u008c\u008d\5 \21\2\u008d\31\3\2\2\2\u008e"+
		"\u0093\5\60\31\2\u008f\u0090\7\37\2\2\u0090\u0091\5,\27\2\u0091\u0092"+
		"\7 \2\2\u0092\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\33\3\2\2\2\u0095\u0096\7\b\2\2\u0096\u0097\5 \21\2\u0097\u0098\7\t\2"+
		"\2\u0098\u009b\5\26\f\2\u0099\u009a\7\n\2\2\u009a\u009c\5\26\f\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\35\3\2\2\2\u009d\u009e\7\13\2"+
		"\2\u009e\u009f\5 \21\2\u009f\u00a0\7\f\2\2\u00a0\u00a1\5\26\f\2\u00a1"+
		"\37\3\2\2\2\u00a2\u00a6\5$\23\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5\5$\23"+
		"\2\u00a5\u00a7\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7!"+
		"\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9#\3\2\2\2\u00aa\u00ac\t\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b2\5&"+
		"\24\2\u00ae\u00af\t\3\2\2\u00af\u00b1\5&\24\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3%\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b5\u00ba\5(\25\2\u00b6\u00b7\t\4\2\2\u00b7\u00b9"+
		"\5(\25\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\'\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c6\5*\26\2"+
		"\u00be\u00c6\5.\30\2\u00bf\u00c0\7\37\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c2"+
		"\7 \2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4\u00c6\5(\25\2\u00c5"+
		"\u00bd\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6)\3\2\2\2\u00c7\u00cd\5\60\31\2\u00c8\u00ca\5\60\31\2\u00c9"+
		"\u00cb\5 \21\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd+\3\2\2\2\u00ce\u00d3"+
		"\5 \21\2\u00cf\u00d0\7\36\2\2\u00d0\u00d2\5 \21\2\u00d1\u00cf\3\2\2\2"+
		"\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4-\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00da\7\31\2\2\u00d7\u00d9\7\31\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db/\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1\7\32\2\2\u00de\u00e0"+
		"\t\5\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\61\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\t\6\2"+
		"\2\u00e5\63\3\2\2\2\30:=FS[alr~\u0088\u0093\u009b\u00a6\u00ab\u00b2\u00ba"+
		"\u00c5\u00ca\u00cc\u00d3\u00da\u00e1";
>>>>>>> parent of 08655c7... Em andamento
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\5\3;\n\3\3\3\5\3>\n\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6U\n\6\f\6\16\6X\13\6\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\b\3"+
		"\b\3\b\5\be\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3"+
		"\t\3\t\3\n\5\nv\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0081"+
		"\n\13\3\f\3\f\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u009f\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\5\21\u00aa\n\21\3\22\3\22\3\23\5\23\u00af\n\23\3\23\3\23\3\23\7\23\u00b4"+
		"\n\23\f\23\16\23\u00b7\13\23\3\24\3\24\3\24\7\24\u00bc\n\24\f\24\16\24"+
		"\u00bf\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c9\n\25\3"+
		"\26\3\26\3\26\5\26\u00ce\n\26\5\26\u00d0\n\26\3\27\3\27\3\27\7\27\u00d5"+
		"\n\27\f\27\16\27\u00d8\13\27\3\30\3\30\7\30\u00dc\n\30\f\30\16\30\u00df"+
		"\13\30\3\31\3\31\7\31\u00e3\n\31\f\31\16\31\u00e6\13\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u00f0\n\32\3\32\2\2\33\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\13\f\3\2\13\r\3\2\16\20\3"+
		"\2\21\22\2\u00f6\2\64\3\2\2\2\4:\3\2\2\2\6A\3\2\2\2\bK\3\2\2\2\nN\3\2"+
		"\2\2\f^\3\2\2\2\16a\3\2\2\2\20i\3\2\2\2\22u\3\2\2\2\24\u0080\3\2\2\2\26"+
		"\u0082\3\2\2\2\30\u008d\3\2\2\2\32\u0091\3\2\2\2\34\u0098\3\2\2\2\36\u00a0"+
		"\3\2\2\2 \u00a5\3\2\2\2\"\u00ab\3\2\2\2$\u00ae\3\2\2\2&\u00b8\3\2\2\2"+
		"(\u00c8\3\2\2\2*\u00cf\3\2\2\2,\u00d1\3\2\2\2.\u00d9\3\2\2\2\60\u00e0"+
		"\3\2\2\2\62\u00ef\3\2\2\2\64\65\7\4\2\2\65\66\5\60\31\2\66\67\7\25\2\2"+
		"\678\5\4\3\28\3\3\2\2\29;\5\6\4\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<>\5\f"+
		"\7\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\26\f\2@\5\3\2\2\2AF\5\b\5\2BC\7"+
		"\25\2\2CE\5\b\5\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF"+
		"\3\2\2\2IJ\7\25\2\2J\7\3\2\2\2KL\5\62\32\2LM\5\n\6\2M\t\3\2\2\2NO\5\60"+
		"\31\2OV\b\6\1\2PQ\7\26\2\2QR\5\60\31\2RS\b\6\1\2SU\3\2\2\2TP\3\2\2\2U"+
		"X\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2\2YZ\5\16\b\2Z[\7\25"+
		"\2\2[]\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`^"+
		"\3\2\2\2ab\7\3\2\2bd\5\60\31\2ce\5\20\t\2dc\3\2\2\2de\3\2\2\2ef\3\2\2"+
		"\2fg\7\25\2\2gh\5\4\3\2h\17\3\2\2\2ij\7\30\2\2jo\5\22\n\2kl\7\25\2\2l"+
		"n\5\22\n\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rs\7\31\2\2s\21\3\2\2\2tv\7\27\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\n"+
		"\6\2xy\7\32\2\2yz\5\60\31\2z\23\3\2\2\2{\u0081\5\30\r\2|\u0081\5\32\16"+
		"\2}\u0081\5\26\f\2~\u0081\5\34\17\2\177\u0081\5\36\20\2\u0080{\3\2\2\2"+
		"\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081"+
		"\25\3\2\2\2\u0082\u0083\7\36\2\2\u0083\u0088\5\24\13\2\u0084\u0085\7\25"+
		"\2\2\u0085\u0087\5\24\13\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008c\7\37\2\2\u008c\27\3\2\2\2\u008d\u008e\5*\26\2\u008e\u008f"+
		"\7\33\2\2\u008f\u0090\5 \21\2\u0090\31\3\2\2\2\u0091\u0096\5\60\31\2\u0092"+
		"\u0093\7\30\2\2\u0093\u0094\5,\27\2\u0094\u0095\7\31\2\2\u0095\u0097\3"+
		"\2\2\2\u0096\u0092\3\2\2\2\u0096\u0097\3\2\2\2\u0097\33\3\2\2\2\u0098"+
		"\u0099\7 \2\2\u0099\u009a\5 \21\2\u009a\u009b\7!\2\2\u009b\u009e\5\24"+
		"\13\2\u009c\u009d\7\"\2\2\u009d\u009f\5\24\13\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\35\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\5 \21\2"+
		"\u00a2\u00a3\7$\2\2\u00a3\u00a4\5\24\13\2\u00a4\37\3\2\2\2\u00a5\u00a9"+
		"\5$\23\2\u00a6\u00a7\5\"\22\2\u00a7\u00a8\5$\23\2\u00a8\u00aa\3\2\2\2"+
		"\u00a9\u00a6\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa!\3\2\2\2\u00ab\u00ac\7"+
		"\n\2\2\u00ac#\3\2\2\2\u00ad\u00af\t\2\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b5\5&\24\2\u00b1\u00b2\t\3\2\2\u00b2"+
		"\u00b4\5&\24\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6%\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bd"+
		"\5(\25\2\u00b9\u00ba\t\4\2\2\u00ba\u00bc\5(\25\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\'\3\2\2\2"+
		"\u00bf\u00bd\3\2\2\2\u00c0\u00c9\5*\26\2\u00c1\u00c9\5.\30\2\u00c2\u00c3"+
		"\7\30\2\2\u00c3\u00c4\5 \21\2\u00c4\u00c5\7\31\2\2\u00c5\u00c9\3\2\2\2"+
		"\u00c6\u00c7\7\34\2\2\u00c7\u00c9\5(\25\2\u00c8\u00c0\3\2\2\2\u00c8\u00c1"+
		"\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9)\3\2\2\2\u00ca"+
		"\u00d0\5\60\31\2\u00cb\u00cd\5\60\31\2\u00cc\u00ce\5 \21\2\u00cd\u00cc"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00d0+\3\2\2\2\u00d1\u00d6\5 \21\2\u00d2\u00d3\7\26\2\2"+
		"\u00d3\u00d5\5 \21\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7-\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00dd\7\21\2\2\u00da\u00dc\7\21\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de/\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00e0\u00e4\7\22\2\2\u00e1\u00e3\t\5\2\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\61"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\5\2\2\u00e8\u00f0\b\32\1\2"+
		"\u00e9\u00ea\7\6\2\2\u00ea\u00f0\b\32\1\2\u00eb\u00ec\7\7\2\2\u00ec\u00f0"+
		"\b\32\1\2\u00ed\u00ee\7\t\2\2\u00ee\u00f0\b\32\1\2\u00ef\u00e7\3\2\2\2"+
		"\u00ef\u00e9\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\63"+
		"\3\2\2\2\31:=FV^dou\u0080\u0088\u0096\u009e\u00a9\u00ae\u00b5\u00bd\u00c8"+
		"\u00cd\u00cf\u00d6\u00dd\u00e4\u00ef";
>>>>>>> parent of 943c220... Em andamento v4
>>>>>>> e2a8b9574887e7cd733a0415d105ff7bedb98c8e
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}