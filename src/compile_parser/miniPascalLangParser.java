// Generated from miniPascalLang.g4 by ANTLR 4.7.2
package compile_parser;
<<<<<<< HEAD

	import data_structure.PascalSymbol;
	import data_structure.PascalVariable;
	import data_structure.PascalSymbolTable;
	import exceptions.PascalSemanticException;
	import java.util.ArrayList;


=======
>>>>>>> parent of 08655c7... Em andamento
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
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'procedure'", "'var'", "'begin'", "'end'", "'if'", 
			"'then'", "'else'", "'while'", "'do'", "'+'", "'-'", "'or'", "'*'", "'div'", 
			"'and'", "'integer'", "'real'", "'boolean'", "'char'", "'string'", null, 
			null, null, "'true'", "'false'", "';'", "','", "'('", "')'", "':'", "':='", 
			"'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Operacao", 
			"Digitos", "Letras", "TRUE", "FALSE", "SC", "V", "OP", "CP", "TD", "TDE", 
			"NOT", "WS"
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
		
		public void verificaID(String id){
			if(!symbolTable.exists(id)){
				throw new PascalSemanticException("Symbol "+_varName+" already declared");
			}
		}

=======
>>>>>>> parent of 08655c7... Em andamento
	public miniPascalLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
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
			match(T__0);
			setState(51);
			ident();
			 verificaID(_input.LT(-1).getText()); 
			setState(53);
			match(SC);
			setState(54);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				setState(56);
				partDeclVar();
				}
			}

			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(59);
				partDecSubRot();
				}
				break;
			}
			setState(62);
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
			setState(64);
			declVar();
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					match(SC);
					setState(66);
					declVar();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(72);
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
			setState(74);
			tipo();
			setState(75);
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
			setState(77);
			ident();
<<<<<<< HEAD

													_varName = _input.LT(-1).getText();
													_varValue = null;
													symbol = new PascalVariable(_varName,_tipo, _varValue);
													if(!symbolTable.exists(_varName)){
														symbolTable.add(symbol);
													}else {
														throw new PascalSemanticException("Symbol"+ _varName+"2 already declared");
													}
													
			setState(85);
=======
			setState(81);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V) {
				{
				{
<<<<<<< HEAD
				setState(79);
				match(V);
				setState(80);
				ident();
				 
														_varName = _input.LT(-1).getText();
														_varValue = null;
														symbol = new PascalVariable(_varName,_tipo, _varValue);
														if(!symbolTable.exists(_varName)){
															symbolTable.add(symbol);
														}else {
															throw new PascalSemanticException("Symbol"+ _varName+" 3 already declared");
														}
												
				}
				}
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
<<<<<<< HEAD
			setState(93);
=======
			setState(89);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
<<<<<<< HEAD
				setState(88);
				declProced();
				setState(89);
				match(SC);
				}
				}
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
<<<<<<< HEAD
			setState(96);
			match(T__0);
			setState(97);
			ident();
			 verificaID(_input.LT(-1).getText()); 
			setState(100);
=======
			setState(92);
			match(T__1);
			setState(93);
			ident();
			setState(95);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP) {
				{
<<<<<<< HEAD
				setState(99);
=======
				setState(94);
>>>>>>> parent of 08655c7... Em andamento
				paramFormais();
				}
			}

<<<<<<< HEAD
			setState(102);
			match(SC);
			setState(103);
=======
			setState(97);
			match(SC);
			setState(98);
>>>>>>> parent of 08655c7... Em andamento
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
<<<<<<< HEAD
			setState(105);
			match(OP);
			setState(106);
			secParamFormais();
			setState(111);
=======
			setState(100);
			match(OP);
			setState(101);
			secParamFormais();
			setState(106);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SC) {
				{
				{
<<<<<<< HEAD
				setState(107);
				match(SC);
				setState(108);
				secParamFormais();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
<<<<<<< HEAD
			setState(117);
=======
			setState(112);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
<<<<<<< HEAD
				setState(116);
				match(VAR);
				}
			}

			setState(119);
			listIdent();
			setState(120);
			match(TD);
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
		enterRule(_localctx, 20, RULE_comando);
		try {
<<<<<<< HEAD
			setState(129);
=======
			setState(134);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(124);
=======
				setState(129);
>>>>>>> parent of 08655c7... Em andamento
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(125);
=======
				setState(130);
>>>>>>> parent of 08655c7... Em andamento
				chamadaProcedimento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(126);
=======
				setState(131);
>>>>>>> parent of 08655c7... Em andamento
				comandoComposto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(127);
=======
				setState(132);
>>>>>>> parent of 08655c7... Em andamento
				comandoCondicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
				setState(128);
=======
				setState(133);
>>>>>>> parent of 08655c7... Em andamento
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

<<<<<<< HEAD
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
			setState(131);
			match(BEGIN);
			setState(132);
			comando();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SC) {
				{
				{
				setState(133);
				match(SC);
				setState(134);
				comando();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(END);
			System.out.println("Comando composto reconhecido!");
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
<<<<<<< HEAD
			setState(143);
			variavel();
			setState(144);
			match(TDE);
			setState(145);
=======
			setState(136);
			variavel();
			setState(137);
			match(TDE);
			setState(138);
>>>>>>> parent of 08655c7... Em andamento
			expressao();
			System.out.println("Comando atribuição reconhecido!");
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
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP) {
				{
<<<<<<< HEAD
				setState(150);
				match(OP);
				setState(151);
				listExpressoes();
				setState(152);
=======
				setState(141);
				match(OP);
				setState(142);
				listExpressoes();
				setState(143);
>>>>>>> parent of 08655c7... Em andamento
				match(CP);
				}
			}

			System.out.println("Comando chamada de procedimento reconhecido!");
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
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
<<<<<<< HEAD
			setState(158);
			match(IF);
			setState(159);
			expressao();
			setState(160);
			match(THEN);
			setState(161);
			comando();
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
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(162);
				match(ELSE);
				setState(163);
=======
				setState(151);
				match(T__7);
				setState(152);
>>>>>>> parent of 08655c7... Em andamento
				comando();
				}
				break;
			}
			System.out.println("Comando condicional reconhecido!");
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
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
<<<<<<< HEAD
			setState(168);
			match(WHILE);
			setState(169);
			expressao();
			setState(170);
			match(DO);
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
			comando();
			System.out.println("Comando repetitivo reconhecido!");
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(174);
			expressaoSimples();
			setState(178);
=======
			setState(160);
			expressaoSimples();
			setState(164);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Operacao) {
				{
<<<<<<< HEAD
				setState(175);
				relacao();
				setState(176);
=======
				setState(161);
				relacao();
				setState(162);
>>>>>>> parent of 08655c7... Em andamento
				expressaoSimples();
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
			setState(180);
=======
			setState(166);
>>>>>>> parent of 08655c7... Em andamento
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
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(183);
=======
			setState(169);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
<<<<<<< HEAD
				setState(182);
=======
				setState(168);
>>>>>>> parent of 08655c7... Em andamento
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
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
			setState(185);
			termo();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIS) | (1L << MENOS) | (1L << OR))) != 0)) {
				{
				{
				setState(186);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIS) | (1L << MENOS) | (1L << OR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				termo();
				}
				}
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
					setState(172);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(173);
					termo();
					}
					} 
				}
				setState(178);
>>>>>>> parent of 08655c7... Em andamento
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

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(193);
			fator();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VEZES) | (1L << DIV) | (1L << AND))) != 0)) {
				{
				{
				setState(194);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VEZES) | (1L << DIV) | (1L << AND))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				fator();
				}
				}
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
					setState(180);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(181);
					fator();
					}
					} 
				}
				setState(186);
>>>>>>> parent of 08655c7... Em andamento
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
<<<<<<< HEAD
			setState(209);
=======
			setState(195);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letras:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(201);
=======
				setState(187);
>>>>>>> parent of 08655c7... Em andamento
				variavel();
				}
				break;
			case Digitos:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(202);
=======
				setState(188);
>>>>>>> parent of 08655c7... Em andamento
				numero();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(203);
				match(OP);
				setState(204);
				expressao();
				setState(205);
=======
				setState(189);
				match(OP);
				setState(190);
				expressao();
				setState(191);
>>>>>>> parent of 08655c7... Em andamento
				match(CP);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(207);
				match(NOT);
				setState(208);
=======
				setState(193);
				match(NOT);
				setState(194);
>>>>>>> parent of 08655c7... Em andamento
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
<<<<<<< HEAD
			setState(217);
=======
			setState(202);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(211);
=======
				setState(197);
>>>>>>> parent of 08655c7... Em andamento
				ident();
				 verificaID(_input.LT(-1).getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(214);
				ident();
				 verificaID(_input.LT(-1).getText()); 
=======
				setState(198);
				ident();
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(199);
					expressao();
					}
					break;
				}
>>>>>>> parent of 08655c7... Em andamento
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
<<<<<<< HEAD
			setState(219);
			expressao();
			setState(224);
=======
			setState(204);
			expressao();
			setState(209);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V) {
				{
				{
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
<<<<<<< HEAD
			setState(227);
			match(Digitos);
			setState(231);
=======
			setState(212);
			match(Digitos);
			setState(216);
>>>>>>> parent of 08655c7... Em andamento
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Digitos) {
				{
				{
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
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(234);
			match(Letras);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Digitos || _la==Letras) {
				{
				{
				setState(235);
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
				setState(240);
=======
			setState(219);
			match(Letras);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
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
				setState(225);
>>>>>>> parent of 08655c7... Em andamento
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

	public static class TipoContext extends ParserRuleContext {
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
		int _la;
		try {
<<<<<<< HEAD
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(INTEGER);
				_tipo = PascalVariable.INTEGER;
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(REAL);
				_tipo = PascalVariable.REAL;
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(BOOLEAN);
				_tipo = PascalVariable.BOOLEAN;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(STRING);
				_tipo = PascalVariable.STRING;
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
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}