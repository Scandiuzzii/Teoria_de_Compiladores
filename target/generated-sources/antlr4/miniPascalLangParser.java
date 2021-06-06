// Generated from miniPascalLang.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, Operacao=22, Digitos=23, 
		Letras=24, TRUE=25, FALSE=26, SC=27, V=28, OP=29, CP=30, TD=31, TDE=32, 
		NOT=33, WS=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "'char'", "'boolean'", "'integer'", "'procedure'", 
		"'while'", "'if'", "'or'", "'string'", "'program'", "'div'", "'else'", 
		"'begin'", "'do'", "'end'", "'and'", "'*'", "'+'", "'then'", "'-'", "'real'", 
		"Operacao", "Digitos", "Letras", "'true'", "'false'", "';'", "','", "'('", 
		"')'", "':'", "':='", "'not'", "WS"
	};
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_partDeclVar = 2, RULE_declVar = 3, 
		RULE_listIdent = 4, RULE_partDecSubRot = 5, RULE_declProced = 6, RULE_paramFormais = 7, 
		RULE_secParamFormais = 8, RULE_comandoComposto = 9, RULE_comando = 10, 
		RULE_atribuicao = 11, RULE_chamadaProcedimento = 12, RULE_comandoCondicional = 13, 
		RULE_comandoRepetitivo = 14, RULE_expressao = 15, RULE_relacao = 16, RULE_expressaoSimples = 17, 
		RULE_termo = 18, RULE_fator = 19, RULE_variavel = 20, RULE_listExpressoes = 21, 
		RULE_numero = 22, RULE_ident = 23, RULE_tipo = 24;
	public static final String[] ruleNames = {
		"programa", "bloco", "partDeclVar", "declVar", "listIdent", "partDecSubRot", 
		"declProced", "paramFormais", "secParamFormais", "comandoComposto", "comando", 
		"atribuicao", "chamadaProcedimento", "comandoCondicional", "comandoRepetitivo", 
		"expressao", "relacao", "expressaoSimples", "termo", "fator", "variavel", 
		"listExpressoes", "numero", "ident", "tipo"
	};

	@Override
	public String getGrammarFileName() { return "miniPascalLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniPascalLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode SC() { return getToken(miniPascalLangParser.SC, 0); }
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
			setState(50); match(T__11);
			setState(51); ident();
			setState(52); match(SC);
			setState(53); bloco();
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
		public PartDeclVarContext partDeclVar() {
			return getRuleContext(PartDeclVarContext.class,0);
		}
		public PartDecSubRotContext partDecSubRot() {
			return getRuleContext(PartDecSubRotContext.class,0);
		}
		public ComandoCompostoContext comandoComposto() {
			return getRuleContext(ComandoCompostoContext.class,0);
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
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__18) | (1L << T__17) | (1L << T__12) | (1L << T__0))) != 0)) {
				{
				setState(55); partDeclVar();
				}
			}

			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(58); partDecSubRot();
				}
				break;
			}
			setState(61); comandoComposto();
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
		public TerminalNode SC(int i) {
			return getToken(miniPascalLangParser.SC, i);
		}
		public DeclVarContext declVar(int i) {
			return getRuleContext(DeclVarContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(miniPascalLangParser.SC); }
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
			setState(63); declVar();
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64); match(SC);
					setState(65); declVar();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(71); match(SC);
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
			setState(73); tipo();
			setState(74); listIdent();
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
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode V(int i) {
			return getToken(miniPascalLangParser.V, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public List<TerminalNode> V() { return getTokens(miniPascalLangParser.V); }
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
			setState(76); ident();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V) {
				{
				{
				setState(77); match(V);
				setState(78); ident();
				}
				}
				setState(83);
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
		public TerminalNode SC(int i) {
			return getToken(miniPascalLangParser.SC, i);
		}
		public List<DeclProcedContext> declProced() {
			return getRuleContexts(DeclProcedContext.class);
		}
		public List<TerminalNode> SC() { return getTokens(miniPascalLangParser.SC); }
		public DeclProcedContext declProced(int i) {
			return getRuleContext(DeclProcedContext.class,i);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(84); declProced();
				setState(85); match(SC);
				}
				}
				setState(91);
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
		public ParamFormaisContext paramFormais() {
			return getRuleContext(ParamFormaisContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode SC() { return getToken(miniPascalLangParser.SC, 0); }
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
			setState(92); match(T__16);
			setState(93); ident();
			setState(95);
			_la = _input.LA(1);
			if (_la==OP) {
				{
				setState(94); paramFormais();
				}
			}

			setState(97); match(SC);
			setState(98); bloco();
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
		public List<SecParamFormaisContext> secParamFormais() {
			return getRuleContexts(SecParamFormaisContext.class);
		}
		public TerminalNode OP() { return getToken(miniPascalLangParser.OP, 0); }
		public SecParamFormaisContext secParamFormais(int i) {
			return getRuleContext(SecParamFormaisContext.class,i);
		}
		public TerminalNode SC(int i) {
			return getToken(miniPascalLangParser.SC, i);
		}
		public TerminalNode CP() { return getToken(miniPascalLangParser.CP, 0); }
		public List<TerminalNode> SC() { return getTokens(miniPascalLangParser.SC); }
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
			setState(100); match(OP);
			setState(101); secParamFormais();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SC) {
				{
				{
				setState(102); match(SC);
				setState(103); secParamFormais();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(CP);
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode TD() { return getToken(miniPascalLangParser.TD, 0); }
		public ListIdentContext listIdent() {
			return getRuleContext(ListIdentContext.class,0);
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
			setState(112);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(111); match(T__20);
				}
			}

			setState(114); listIdent();
			setState(115); match(TD);
			setState(116); ident();
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
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode SC(int i) {
			return getToken(miniPascalLangParser.SC, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public List<TerminalNode> SC() { return getTokens(miniPascalLangParser.SC); }
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
			setState(118); match(T__8);
			setState(119); comando();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SC) {
				{
				{
				setState(120); match(SC);
				setState(121); comando();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127); match(T__6);
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
		public ChamadaProcedimentoContext chamadaProcedimento() {
			return getRuleContext(ChamadaProcedimentoContext.class,0);
		}
		public ComandoCondicionalContext comandoCondicional() {
			return getRuleContext(ComandoCondicionalContext.class,0);
		}
		public ComandoCompostoContext comandoComposto() {
			return getRuleContext(ComandoCompostoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
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
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); chamadaProcedimento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131); comandoComposto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132); comandoCondicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133); comandoRepetitivo();
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode TDE() { return getToken(miniPascalLangParser.TDE, 0); }
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
			setState(136); variavel();
			setState(137); match(TDE);
			setState(138); expressao();
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
		public TerminalNode OP() { return getToken(miniPascalLangParser.OP, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
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
			setState(140); ident();
			setState(145);
			_la = _input.LA(1);
			if (_la==OP) {
				{
				setState(141); match(OP);
				setState(142); listExpressoes();
				setState(143); match(CP);
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
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
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
			setState(147); match(T__14);
			setState(148); expressao();
			setState(149); match(T__2);
			setState(150); comando();
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(151); match(T__9);
				setState(152); comando();
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
			setState(155); match(T__15);
			setState(156); expressao();
			setState(157); match(T__7);
			setState(158); comando();
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
		public RelacaoContext relacao() {
			return getRuleContext(RelacaoContext.class,0);
		}
		public ExpressaoSimplesContext expressaoSimples(int i) {
			return getRuleContext(ExpressaoSimplesContext.class,i);
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
			setState(160); expressaoSimples();
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(161); relacao();
				setState(162); expressaoSimples();
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
			setState(166); match(Operacao);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__1) {
				{
				setState(168);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(171); termo();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__3) | (1L << T__1))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(173); termo();
					}
					} 
				}
				setState(178);
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
			setState(179); fator();
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__5) | (1L << T__4))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(181); fator();
					}
					} 
				}
				setState(186);
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
		public TerminalNode NOT() { return getToken(miniPascalLangParser.NOT, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode OP() { return getToken(miniPascalLangParser.OP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode CP() { return getToken(miniPascalLangParser.CP, 0); }
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
			setState(195);
			switch (_input.LA(1)) {
			case Letras:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); variavel();
				}
				break;
			case Digitos:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); numero();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); match(OP);
				setState(190); expressao();
				setState(191); match(CP);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(193); match(NOT);
				setState(194); fator();
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
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
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); ident();
				setState(200);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(199); expressao();
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
		public TerminalNode V(int i) {
			return getToken(miniPascalLangParser.V, i);
		}
		public List<TerminalNode> V() { return getTokens(miniPascalLangParser.V); }
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
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
			setState(204); expressao();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V) {
				{
				{
				setState(205); match(V);
				setState(206); expressao();
				}
				}
				setState(211);
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
			setState(212); match(Digitos);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Digitos) {
				{
				{
				setState(213); match(Digitos);
				}
				}
				setState(218);
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
		public TerminalNode Letras(int i) {
			return getToken(miniPascalLangParser.Letras, i);
		}
		public List<TerminalNode> Digitos() { return getTokens(miniPascalLangParser.Digitos); }
		public TerminalNode Digitos(int i) {
			return getToken(miniPascalLangParser.Digitos, i);
		}
		public List<TerminalNode> Letras() { return getTokens(miniPascalLangParser.Letras); }
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
			setState(219); match(Letras);
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
					consume();
					}
					} 
				}
				setState(225);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__18) | (1L << T__17) | (1L << T__12) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00e7\4\2\t\2\4"+
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
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\4\2\24\24\26"+
		"\26\5\2\n\n\24\24\26\26\4\2\r\r\22\23\3\2\31\32\5\2\4\6\13\13\27\27\u00e8"+
		"\2\64\3\2\2\2\4:\3\2\2\2\6A\3\2\2\2\bK\3\2\2\2\nN\3\2\2\2\f[\3\2\2\2\16"+
		"^\3\2\2\2\20f\3\2\2\2\22r\3\2\2\2\24x\3\2\2\2\26\u0088\3\2\2\2\30\u008a"+
		"\3\2\2\2\32\u008e\3\2\2\2\34\u0095\3\2\2\2\36\u009d\3\2\2\2 \u00a2\3\2"+
		"\2\2\"\u00a8\3\2\2\2$\u00ab\3\2\2\2&\u00b5\3\2\2\2(\u00c5\3\2\2\2*\u00cc"+
		"\3\2\2\2,\u00ce\3\2\2\2.\u00d6\3\2\2\2\60\u00dd\3\2\2\2\62\u00e4\3\2\2"+
		"\2\64\65\7\f\2\2\65\66\5\60\31\2\66\67\7\35\2\2\678\5\4\3\28\3\3\2\2\2"+
		"9;\5\6\4\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<>\5\f\7\2=<\3\2\2\2=>\3\2\2\2"+
		">?\3\2\2\2?@\5\24\13\2@\5\3\2\2\2AF\5\b\5\2BC\7\35\2\2CE\5\b\5\2DB\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\35\2\2J\7\3"+
		"\2\2\2KL\5\62\32\2LM\5\n\6\2M\t\3\2\2\2NS\5\60\31\2OP\7\36\2\2PR\5\60"+
		"\31\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\13\3\2\2\2US\3\2\2\2VW"+
		"\5\16\b\2WX\7\35\2\2XZ\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\\r\3\2\2\2][\3\2\2\2^_\7\7\2\2_a\5\60\31\2`b\5\20\t\2a`\3\2\2\2ab"+
		"\3\2\2\2bc\3\2\2\2cd\7\35\2\2de\5\4\3\2e\17\3\2\2\2fg\7\37\2\2gl\5\22"+
		"\n\2hi\7\35\2\2ik\5\22\n\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3"+
		"\2\2\2nl\3\2\2\2op\7 \2\2p\21\3\2\2\2qs\7\3\2\2rq\3\2\2\2rs\3\2\2\2st"+
		"\3\2\2\2tu\5\n\6\2uv\7!\2\2vw\5\60\31\2w\23\3\2\2\2xy\7\17\2\2y~\5\26"+
		"\f\2z{\7\35\2\2{}\5\26\f\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\21\2\2\u0082\25\3"+
		"\2\2\2\u0083\u0089\5\30\r\2\u0084\u0089\5\32\16\2\u0085\u0089\5\24\13"+
		"\2\u0086\u0089\5\34\17\2\u0087\u0089\5\36\20\2\u0088\u0083\3\2\2\2\u0088"+
		"\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2"+
		"\2\2\u0089\27\3\2\2\2\u008a\u008b\5*\26\2\u008b\u008c\7\"\2\2\u008c\u008d"+
		"\5 \21\2\u008d\31\3\2\2\2\u008e\u0093\5\60\31\2\u008f\u0090\7\37\2\2\u0090"+
		"\u0091\5,\27\2\u0091\u0092\7 \2\2\u0092\u0094\3\2\2\2\u0093\u008f\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\33\3\2\2\2\u0095\u0096\7\t\2\2\u0096\u0097"+
		"\5 \21\2\u0097\u0098\7\25\2\2\u0098\u009b\5\26\f\2\u0099\u009a\7\16\2"+
		"\2\u009a\u009c\5\26\f\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\35\3\2\2\2\u009d\u009e\7\b\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7\20\2"+
		"\2\u00a0\u00a1\5\26\f\2\u00a1\37\3\2\2\2\u00a2\u00a6\5$\23\2\u00a3\u00a4"+
		"\5\"\22\2\u00a4\u00a5\5$\23\2\u00a5\u00a7\3\2\2\2\u00a6\u00a3\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7!\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9#\3\2\2"+
		"\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00b2\5&\24\2\u00ae\u00af\t\3\2\2\u00af\u00b1\5&\24\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3%\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ba\5(\25\2\u00b6\u00b7"+
		"\t\4\2\2\u00b7\u00b9\5(\25\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\'\3\2\2\2\u00bc\u00ba\3\2\2\2"+
		"\u00bd\u00c6\5*\26\2\u00be\u00c6\5.\30\2\u00bf\u00c0\7\37\2\2\u00c0\u00c1"+
		"\5 \21\2\u00c1\u00c2\7 \2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4"+
		"\u00c6\5(\25\2\u00c5\u00bd\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00bf\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6)\3\2\2\2\u00c7\u00cd\5\60\31\2\u00c8\u00ca"+
		"\5\60\31\2\u00c9\u00cb\5 \21\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2"+
		"\u00cb\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd+\3"+
		"\2\2\2\u00ce\u00d3\5 \21\2\u00cf\u00d0\7\36\2\2\u00d0\u00d2\5 \21\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4-\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00da\7\31\2\2\u00d7\u00d9"+
		"\7\31\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db/\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1\7"+
		"\32\2\2\u00de\u00e0\t\5\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\61\3\2\2\2\u00e3\u00e1\3\2\2"+
		"\2\u00e4\u00e5\t\6\2\2\u00e5\63\3\2\2\2\30:=FS[alr~\u0088\u0093\u009b"+
		"\u00a6\u00ab\u00b2\u00ba\u00c5\u00ca\u00cc\u00d3\u00da\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}