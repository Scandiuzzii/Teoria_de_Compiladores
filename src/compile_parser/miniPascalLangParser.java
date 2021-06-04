// Generated from miniPascalLang.g4 by ANTLR 4.7.2
package compile_parser;

	import data_structure.PascalSymbol;
	import data_structure.PascalVariable;
	import data_structure.PascalSymbolTable;
	import exceptions.PascalSemanticException;
	import java.util.ArrayList;

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
		T__0=1, PROGRAM=2, INTEGER=3, REAL=4, BOOLEAN=5, CHAR=6, STRING=7, Operacao=8, 
		MAIS=9, MENOS=10, OR=11, VEZES=12, DIV=13, AND=14, Digitos=15, Letras=16, 
		TRUE=17, FALSE=18, SC=19, V=20, VAR=21, OP=22, CP=23, TD=24, TDE=25, NOT=26, 
		WS=27, BEGIN=28, END=29, IF=30, THEN=31, ELSE=32, WHILE=33, DO=34;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_partDeclVar = 2, RULE_declVar = 3, 
		RULE_listIdent = 4, RULE_partDecSubRot = 5, RULE_declProced = 6, RULE_paramFormais = 7, 
		RULE_secParamFormais = 8, RULE_comando = 9, RULE_comandoComposto = 10, 
		RULE_atribuicao = 11, RULE_chamadaProcedimento = 12, RULE_comandoCondicional = 13, 
		RULE_comandoRepetitivo = 14, RULE_expressao = 15, RULE_relacao = 16, RULE_expressaoSimples = 17, 
		RULE_termo = 18, RULE_fator = 19, RULE_variavel = 20, RULE_listExpressoes = 21, 
		RULE_numero = 22, RULE_ident = 23, RULE_tipo = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloco", "partDeclVar", "declVar", "listIdent", "partDecSubRot", 
			"declProced", "paramFormais", "secParamFormais", "comando", "comandoComposto", 
			"atribuicao", "chamadaProcedimento", "comandoCondicional", "comandoRepetitivo", 
			"expressao", "relacao", "expressaoSimples", "termo", "fator", "variavel", 
			"listExpressoes", "numero", "ident", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedure'", "'program'", "'integer'", "'real'", "'boolean'", 
			"'char'", "'string'", null, "'+'", "'-'", "'or'", "'*'", "'div'", "'and'", 
			null, null, "'true'", "'false'", "';'", "','", "'var'", "'('", "')'", 
			"':'", "':='", "'not'", null, "'begin'", "'end'", "'if'", "'then'", "'else'", 
			"'while'", "'do'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PROGRAM", "INTEGER", "REAL", "BOOLEAN", "CHAR", "STRING", 
			"Operacao", "MAIS", "MENOS", "OR", "VEZES", "DIV", "AND", "Digitos", 
			"Letras", "TRUE", "FALSE", "SC", "V", "VAR", "OP", "CP", "TD", "TDE", 
			"NOT", "WS", "BEGIN", "END", "IF", "THEN", "ELSE", "WHILE", "DO"
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


		private int _tipo;
		private String _varName;
		private String _varValue;
		private PascalSymbolTable symbolTable = new PascalSymbolTable();
		private PascalSymbol symbol;

	public miniPascalLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(miniPascalLangParser.PROGRAM, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode SC() { return getToken(miniPascalLangParser.SC, 0); }
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
			setState(50);
			match(PROGRAM);
			setState(51);
			ident();
			setState(52);
			match(SC);
			setState(53);
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
		public ComandoCompostoContext comandoComposto() {
			return getRuleContext(ComandoCompostoContext.class,0);
		}
		public PartDeclVarContext partDeclVar() {
			return getRuleContext(PartDeclVarContext.class,0);
		}
		public PartDecSubRotContext partDecSubRot() {
			return getRuleContext(PartDecSubRotContext.class,0);
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << REAL) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(55);
				partDeclVar();
				}
			}

			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(58);
				partDecSubRot();
				}
				break;
			}
			setState(61);
			comandoComposto();
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

	public static class PartDeclVarContext extends ParserRuleContext {
		public List<DeclVarContext> declVar() {
			return getRuleContexts(DeclVarContext.class);
		}
		public DeclVarContext declVar(int i) {
			return getRuleContext(DeclVarContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(miniPascalLangParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(miniPascalLangParser.SC, i);
		}
		public PartDeclVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partDeclVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterPartDeclVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitPartDeclVar(this);
		}
	}

	public final PartDeclVarContext partDeclVar() throws RecognitionException {
		PartDeclVarContext _localctx = new PartDeclVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_partDeclVar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			declVar();
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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

	public static class DeclVarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListIdentContext listIdent() {
			return getRuleContext(ListIdentContext.class,0);
		}
		public DeclVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterDeclVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitDeclVar(this);
		}
	}

	public final DeclVarContext declVar() throws RecognitionException {
		DeclVarContext _localctx = new DeclVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			tipo();
			setState(74);
			listIdent();
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

	public static class ListIdentContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> V() { return getTokens(miniPascalLangParser.V); }
		public TerminalNode V(int i) {
			return getToken(miniPascalLangParser.V, i);
		}
		public ListIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterListIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitListIdent(this);
		}
	}

	public final ListIdentContext listIdent() throws RecognitionException {
		ListIdentContext _localctx = new ListIdentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listIdent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			ident();

													_varName = _input.LT(-1).getText();
													_varValue = null;
													symbol = new PascalVariable(_varName,_tipo, _varValue);
													if(!symbolTable.exists(_varName)){
														symbolTable.add(symbol);
													}else {
														throw new PascalSemanticException("Symbol"+ _varName+"already declared");
													}
													
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V) {
				{
				{
				setState(78);
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
				setState(86);
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

	public static class PartDecSubRotContext extends ParserRuleContext {
		public List<DeclProcedContext> declProced() {
			return getRuleContexts(DeclProcedContext.class);
		}
		public DeclProcedContext declProced(int i) {
			return getRuleContext(DeclProcedContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(miniPascalLangParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(miniPascalLangParser.SC, i);
		}
		public PartDecSubRotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partDecSubRot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterPartDecSubRot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitPartDecSubRot(this);
		}
	}

	public final PartDecSubRotContext partDecSubRot() throws RecognitionException {
		PartDecSubRotContext _localctx = new PartDecSubRotContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_partDecSubRot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(87);
				declProced();
				setState(88);
				match(SC);
				}
				}
				setState(94);
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

	public static class DeclProcedContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode SC() { return getToken(miniPascalLangParser.SC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParamFormaisContext paramFormais() {
			return getRuleContext(ParamFormaisContext.class,0);
		}
		public DeclProcedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declProced; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterDeclProced(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitDeclProced(this);
		}
	}

	public final DeclProcedContext declProced() throws RecognitionException {
		DeclProcedContext _localctx = new DeclProcedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declProced);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__0);
			setState(96);
			ident();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP) {
				{
				setState(97);
				paramFormais();
				}
			}

			setState(100);
			match(SC);
			setState(101);
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

	public static class ParamFormaisContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(miniPascalLangParser.OP, 0); }
		public List<SecParamFormaisContext> secParamFormais() {
			return getRuleContexts(SecParamFormaisContext.class);
		}
		public SecParamFormaisContext secParamFormais(int i) {
			return getRuleContext(SecParamFormaisContext.class,i);
		}
		public TerminalNode CP() { return getToken(miniPascalLangParser.CP, 0); }
		public List<TerminalNode> SC() { return getTokens(miniPascalLangParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(miniPascalLangParser.SC, i);
		}
		public ParamFormaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramFormais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterParamFormais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitParamFormais(this);
		}
	}

	public final ParamFormaisContext paramFormais() throws RecognitionException {
		ParamFormaisContext _localctx = new ParamFormaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramFormais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(OP);
			setState(104);
			secParamFormais();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SC) {
				{
				{
				setState(105);
				match(SC);
				setState(106);
				secParamFormais();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(CP);
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

	public static class SecParamFormaisContext extends ParserRuleContext {
		public ListIdentContext listIdent() {
			return getRuleContext(ListIdentContext.class,0);
		}
		public TerminalNode TD() { return getToken(miniPascalLangParser.TD, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode VAR() { return getToken(miniPascalLangParser.VAR, 0); }
		public SecParamFormaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secParamFormais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterSecParamFormais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitSecParamFormais(this);
		}
	}

	public final SecParamFormaisContext secParamFormais() throws RecognitionException {
		SecParamFormaisContext _localctx = new SecParamFormaisContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_secParamFormais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(114);
				match(VAR);
				}
			}

			setState(117);
			listIdent();
			setState(118);
			match(TD);
			setState(119);
			ident();
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
		}
		public ComandoRepetitivoContext comandoRepetitivo() {
			return getRuleContext(ComandoRepetitivoContext.class,0);
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
		enterRule(_localctx, 18, RULE_comando);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				chamadaProcedimento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				comandoComposto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				comandoCondicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				comandoRepetitivo();
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

	public static class ComandoCompostoContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(miniPascalLangParser.BEGIN, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode END() { return getToken(miniPascalLangParser.END, 0); }
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
		enterRule(_localctx, 20, RULE_comandoComposto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(BEGIN);
			setState(129);
			comando();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SC) {
				{
				{
				setState(130);
				match(SC);
				setState(131);
				comando();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(END);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode TDE() { return getToken(miniPascalLangParser.TDE, 0); }
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
			setState(139);
			variavel();
			setState(140);
			match(TDE);
			setState(141);
			expressao();
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

	public static class ChamadaProcedimentoContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode OP() { return getToken(miniPascalLangParser.OP, 0); }
		public ListExpressoesContext listExpressoes() {
			return getRuleContext(ListExpressoesContext.class,0);
		}
		public TerminalNode CP() { return getToken(miniPascalLangParser.CP, 0); }
		public ChamadaProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaProcedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterChamadaProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitChamadaProcedimento(this);
		}
	}

	public final ChamadaProcedimentoContext chamadaProcedimento() throws RecognitionException {
		ChamadaProcedimentoContext _localctx = new ChamadaProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chamadaProcedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			ident();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP) {
				{
				setState(144);
				match(OP);
				setState(145);
				listExpressoes();
				setState(146);
				match(CP);
				}
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

	public static class ComandoCondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miniPascalLangParser.IF, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode THEN() { return getToken(miniPascalLangParser.THEN, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(miniPascalLangParser.ELSE, 0); }
		public ComandoCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterComandoCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitComandoCondicional(this);
		}
	}

	public final ComandoCondicionalContext comandoCondicional() throws RecognitionException {
		ComandoCondicionalContext _localctx = new ComandoCondicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandoCondicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IF);
			setState(151);
			expressao();
			setState(152);
			match(THEN);
			setState(153);
			comando();
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(154);
				match(ELSE);
				setState(155);
				comando();
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

	public static class ComandoRepetitivoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(miniPascalLangParser.WHILE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DO() { return getToken(miniPascalLangParser.DO, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoRepetitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepetitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterComandoRepetitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitComandoRepetitivo(this);
		}
	}

	public final ComandoRepetitivoContext comandoRepetitivo() throws RecognitionException {
		ComandoRepetitivoContext _localctx = new ComandoRepetitivoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comandoRepetitivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(WHILE);
			setState(159);
			expressao();
			setState(160);
			match(DO);
			setState(161);
			comando();
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
		public List<ExpressaoSimplesContext> expressaoSimples() {
			return getRuleContexts(ExpressaoSimplesContext.class);
		}
		public ExpressaoSimplesContext expressaoSimples(int i) {
			return getRuleContext(ExpressaoSimplesContext.class,i);
		}
		public RelacaoContext relacao() {
			return getRuleContext(RelacaoContext.class,0);
		}
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
			setState(163);
			expressaoSimples();
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(164);
				relacao();
				setState(165);
				expressaoSimples();
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
			setState(169);
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
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> MAIS() { return getTokens(miniPascalLangParser.MAIS); }
		public TerminalNode MAIS(int i) {
			return getToken(miniPascalLangParser.MAIS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(miniPascalLangParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(miniPascalLangParser.MENOS, i);
		}
		public List<TerminalNode> OR() { return getTokens(miniPascalLangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(miniPascalLangParser.OR, i);
		}
		public ExpressaoSimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoSimples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterExpressaoSimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitExpressaoSimples(this);
		}
	}

	public final ExpressaoSimplesContext expressaoSimples() throws RecognitionException {
		ExpressaoSimplesContext _localctx = new ExpressaoSimplesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressaoSimples);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIS || _la==MENOS) {
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==MAIS || _la==MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(174);
			termo();
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIS) | (1L << MENOS) | (1L << OR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(176);
					termo();
					}
					} 
				}
				setState(181);
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
		public List<TerminalNode> VEZES() { return getTokens(miniPascalLangParser.VEZES); }
		public TerminalNode VEZES(int i) {
			return getToken(miniPascalLangParser.VEZES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(miniPascalLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(miniPascalLangParser.DIV, i);
		}
		public List<TerminalNode> AND() { return getTokens(miniPascalLangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(miniPascalLangParser.AND, i);
		}
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
		enterRule(_localctx, 36, RULE_termo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			fator();
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VEZES) | (1L << DIV) | (1L << AND))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(184);
					fator();
					}
					} 
				}
				setState(189);
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
		public TerminalNode OP() { return getToken(miniPascalLangParser.OP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode CP() { return getToken(miniPascalLangParser.CP, 0); }
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
		enterRule(_localctx, 38, RULE_fator);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letras:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				variavel();
				}
				break;
			case Digitos:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				numero();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(OP);
				setState(193);
				expressao();
				setState(194);
				match(CP);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(NOT);
				setState(197);
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
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
		enterRule(_localctx, 40, RULE_variavel);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				ident();
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(202);
					expressao();
					}
					break;
				}
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

	public static class ListExpressoesContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> V() { return getTokens(miniPascalLangParser.V); }
		public TerminalNode V(int i) {
			return getToken(miniPascalLangParser.V, i);
		}
		public ListExpressoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpressoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterListExpressoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitListExpressoes(this);
		}
	}

	public final ListExpressoesContext listExpressoes() throws RecognitionException {
		ListExpressoesContext _localctx = new ListExpressoesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_listExpressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			expressao();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V) {
				{
				{
				setState(208);
				match(V);
				setState(209);
				expressao();
				}
				}
				setState(214);
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
		public List<TerminalNode> Digitos() { return getTokens(miniPascalLangParser.Digitos); }
		public TerminalNode Digitos(int i) {
			return getToken(miniPascalLangParser.Digitos, i);
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
		enterRule(_localctx, 44, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(Digitos);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Digitos) {
				{
				{
				setState(216);
				match(Digitos);
				}
				}
				setState(221);
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

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> Letras() { return getTokens(miniPascalLangParser.Letras); }
		public TerminalNode Letras(int i) {
			return getToken(miniPascalLangParser.Letras, i);
		}
		public List<TerminalNode> Digitos() { return getTokens(miniPascalLangParser.Digitos); }
		public TerminalNode Digitos(int i) {
			return getToken(miniPascalLangParser.Digitos, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalLangListener ) ((miniPascalLangListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(Letras);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
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
				setState(228);
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
		public TerminalNode INTEGER() { return getToken(miniPascalLangParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(miniPascalLangParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(miniPascalLangParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(miniPascalLangParser.STRING, 0); }
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
		enterRule(_localctx, 48, RULE_tipo);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(INTEGER);
				_tipo = PascalVariable.INTEGER;
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(REAL);
				_tipo = PascalVariable.REAL;
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(BOOLEAN);
				_tipo = PascalVariable.BOOLEAN;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(STRING);
				_tipo = PascalVariable.STRING;
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

	public static final String _serializedATN =
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
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}