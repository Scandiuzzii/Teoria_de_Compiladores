// Generated from miniPascalLang.g4 by ANTLR 4.7.2
package compile_parser;

	import PascalSymbol;
	import PascalVariabel;
	import PascalSymbolTable;
	import PascalSemanticException;
	import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniPascalLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PROGRAM=2, INTEGER=3, REAL=4, BOOLEAN=5, CHAR=6, STRING=7, Operacao=8, 
		MAIS=9, MENOS=10, OR=11, VEZES=12, DIV=13, AND=14, Digitos=15, Letras=16, 
		TRUE=17, FALSE=18, SC=19, V=20, VAR=21, OP=22, CP=23, TD=24, TDE=25, NOT=26, 
		WS=27, BEGIN=28, END=29, IF=30, THEN=31, ELSE=32, WHILE=33, DO=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PROGRAM", "INTEGER", "REAL", "BOOLEAN", "CHAR", "STRING", "Operacao", 
			"MAIS", "MENOS", "OR", "VEZES", "DIV", "AND", "Digitos", "Letras", "TRUE", 
			"FALSE", "SC", "V", "VAR", "OP", "CP", "TD", "TDE", "NOT", "WS", "BEGIN", 
			"END", "IF", "THEN", "ELSE", "WHILE", "DO"
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


		private int _tipo;
		private String _varName;
		private String _varValue;


	public miniPascalLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniPascalLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\6\20\u0098\n\20\r\20\16\20\u0099\3\20\3\20\6\20\u009e\n\20\r\20"+
		"\16\20\u009f\5\20\u00a2\n\20\3\21\3\21\3\21\7\21\u00a7\n\21\f\21\16\21"+
		"\u00aa\13\21\5\21\u00ac\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u00d4\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\7\3\2\62;\3\2c|\3\2C\\\5"+
		"\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u0102\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5Q\3\2\2\2\7Y\3\2\2\2\ta\3\2\2"+
		"\2\13f\3\2\2\2\rn\3\2\2\2\17s\3\2\2\2\21\u0083\3\2\2\2\23\u0085\3\2\2"+
		"\2\25\u0087\3\2\2\2\27\u0089\3\2\2\2\31\u008c\3\2\2\2\33\u008e\3\2\2\2"+
		"\35\u0092\3\2\2\2\37\u0097\3\2\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2\2%\u00b2"+
		"\3\2\2\2\'\u00b8\3\2\2\2)\u00ba\3\2\2\2+\u00bc\3\2\2\2-\u00c0\3\2\2\2"+
		"/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c9\3\2\2\2\67"+
		"\u00d3\3\2\2\29\u00d7\3\2\2\2;\u00dd\3\2\2\2=\u00e1\3\2\2\2?\u00e4\3\2"+
		"\2\2A\u00e9\3\2\2\2C\u00ee\3\2\2\2E\u00f4\3\2\2\2GH\7r\2\2HI\7t\2\2IJ"+
		"\7q\2\2JK\7e\2\2KL\7g\2\2LM\7f\2\2MN\7w\2\2NO\7t\2\2OP\7g\2\2P\4\3\2\2"+
		"\2QR\7r\2\2RS\7t\2\2ST\7q\2\2TU\7i\2\2UV\7t\2\2VW\7c\2\2WX\7o\2\2X\6\3"+
		"\2\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v\2\2\\]\7g\2\2]^\7i\2\2^_\7g\2\2_`\7t\2"+
		"\2`\b\3\2\2\2ab\7t\2\2bc\7g\2\2cd\7c\2\2de\7n\2\2e\n\3\2\2\2fg\7d\2\2"+
		"gh\7q\2\2hi\7q\2\2ij\7n\2\2jk\7g\2\2kl\7c\2\2lm\7p\2\2m\f\3\2\2\2no\7"+
		"e\2\2op\7j\2\2pq\7c\2\2qr\7t\2\2r\16\3\2\2\2st\7u\2\2tu\7v\2\2uv\7t\2"+
		"\2vw\7k\2\2wx\7p\2\2xy\7i\2\2y\20\3\2\2\2z\u0084\7?\2\2{|\7>\2\2|\u0084"+
		"\7@\2\2}\u0084\7>\2\2~\177\7>\2\2\177\u0084\7?\2\2\u0080\u0081\7@\2\2"+
		"\u0081\u0084\7?\2\2\u0082\u0084\7@\2\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083"+
		"}\3\2\2\2\u0083~\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\22\3\2\2\2\u0085\u0086\7-\2\2\u0086\24\3\2\2\2\u0087\u0088\7/\2\2\u0088"+
		"\26\3\2\2\2\u0089\u008a\7q\2\2\u008a\u008b\7t\2\2\u008b\30\3\2\2\2\u008c"+
		"\u008d\7,\2\2\u008d\32\3\2\2\2\u008e\u008f\7f\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7x\2\2\u0091\34\3\2\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7f\2\2\u0095\36\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a1"+
		"\3\2\2\2\u009b\u009d\7\60\2\2\u009c\u009e\t\2\2\2\u009d\u009c\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2 \3\2\2\2\u00a3"+
		"\u00ac\t\3\2\2\u00a4\u00a8\t\4\2\2\u00a5\u00a7\t\5\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a4\3\2"+
		"\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0"+
		"\7w\2\2\u00b0\u00b1\7g\2\2\u00b1$\3\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4"+
		"\7c\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		"&\3\2\2\2\u00b8\u00b9\7=\2\2\u00b9(\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb*"+
		"\3\2\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7t\2\2\u00bf"+
		",\3\2\2\2\u00c0\u00c1\7*\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7+\2\2\u00c3\60"+
		"\3\2\2\2\u00c4\u00c5\7<\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7<\2\2\u00c7"+
		"\u00c8\7?\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"\u00cc\7v\2\2\u00cc\66\3\2\2\2\u00cd\u00d4\t\6\2\2\u00ce\u00cf\7\61\2"+
		"\2\u00cf\u00d4\7\61\2\2\u00d0\u00d1\7}\2\2\u00d1\u00d2\7\"\2\2\u00d2\u00d4"+
		"\7\177\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d0\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\34\2\2\u00d68\3\2\2\2\u00d7\u00d8\7"+
		"d\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7i\2\2\u00da\u00db\7k\2\2\u00db\u00dc"+
		"\7p\2\2\u00dc:\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df\u00e0"+
		"\7f\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7h\2\2\u00e3>\3"+
		"\2\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00edB\3\2\2\2\u00ee\u00ef\7y\2\2\u00ef"+
		"\u00f0\7j\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7g\2\2"+
		"\u00f3D\3\2\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6\7q\2\2\u00f6F\3\2\2\2\13"+
		"\2\u0083\u0099\u009f\u00a1\u00a6\u00a8\u00ab\u00d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}