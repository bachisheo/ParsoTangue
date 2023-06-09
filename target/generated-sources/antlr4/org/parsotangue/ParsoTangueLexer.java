// Generated from org/parsotangue/ParsoTangue.g4 by ANTLR 4.9.3
package org.parsotangue;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParsoTangueLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, INT_NUMBER=14, STRING=15, NAME=16, 
		BOOL=17, COMMENT=18, WHITESPACE=19, ASTERISK=20, SLASH=21, MOD=22, PLUS=23, 
		MINUS=24, ASSIGMENT=25, LESS=26, GREATER=27, LEQ=28, GEQ=29, EQ=30, NEQ=31, 
		EOE=32, QUOT=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "WORD", "DIGIT", "INT_NUMBER", "STRING", 
			"NAME", "BOOL", "COMMENT", "WHITESPACE", "ASTERISK", "SLASH", "MOD", 
			"PLUS", "MINUS", "ASSIGMENT", "LESS", "GREATER", "LEQ", "GEQ", "EQ", 
			"NEQ", "EOE", "QUOT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'('", "')'", "','", "'Integer'", "'String'", "'Boolean'", 
			"'void'", "'{'", "'}'", "'if'", "'else'", "'return'", null, null, null, 
			null, null, null, "'*'", "'/'", "'%'", "'+'", "'-'", "':='", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "';'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_NUMBER", "STRING", "NAME", "BOOL", "COMMENT", "WHITESPACE", 
			"ASTERISK", "SLASH", "MOD", "PLUS", "MINUS", "ASSIGMENT", "LESS", "GREATER", 
			"LEQ", "GEQ", "EQ", "NEQ", "EOE", "QUOT"
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


	public ParsoTangueLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParsoTangue.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\7\21\u008a\n\21\f\21\16\21\u008d\13\21\5\21\u008f\n\21"+
		"\3\22\3\22\7\22\u0093\n\22\f\22\16\22\u0096\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\7\23\u009d\n\23\f\23\16\23\u00a0\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00ab\n\24\3\25\3\25\3\25\3\25\7\25\u00b1\n"+
		"\25\f\25\16\25\u00b4\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\4"+
		"\u0094\u00b2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\2\37\2!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32"+
		"\67\339\34;\35=\36?\37A C!E\"G#\3\2\6\5\2C\\aac|\3\2\62;\3\2\63;\5\2\13"+
		"\f\16\17\"\"\2\u00e2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I"+
		"\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\r[\3\2\2\2\17b\3"+
		"\2\2\2\21j\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31v\3\2\2\2\33"+
		"{\3\2\2\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2!\u008e\3\2\2\2#\u0090\3\2"+
		"\2\2%\u0099\3\2\2\2\'\u00aa\3\2\2\2)\u00ac\3\2\2\2+\u00b9\3\2\2\2-\u00bd"+
		"\3\2\2\2/\u00bf\3\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2\2\65\u00c5\3\2"+
		"\2\2\67\u00c7\3\2\2\29\u00ca\3\2\2\2;\u00cc\3\2\2\2=\u00ce\3\2\2\2?\u00d1"+
		"\3\2\2\2A\u00d4\3\2\2\2C\u00d7\3\2\2\2E\u00da\3\2\2\2G\u00dc\3\2\2\2I"+
		"J\7n\2\2JK\7g\2\2KL\7v\2\2L\4\3\2\2\2MN\7*\2\2N\6\3\2\2\2OP\7+\2\2P\b"+
		"\3\2\2\2QR\7.\2\2R\n\3\2\2\2ST\7K\2\2TU\7p\2\2UV\7v\2\2VW\7g\2\2WX\7i"+
		"\2\2XY\7g\2\2YZ\7t\2\2Z\f\3\2\2\2[\\\7U\2\2\\]\7v\2\2]^\7t\2\2^_\7k\2"+
		"\2_`\7p\2\2`a\7i\2\2a\16\3\2\2\2bc\7D\2\2cd\7q\2\2de\7q\2\2ef\7n\2\2f"+
		"g\7g\2\2gh\7c\2\2hi\7p\2\2i\20\3\2\2\2jk\7x\2\2kl\7q\2\2lm\7k\2\2mn\7"+
		"f\2\2n\22\3\2\2\2op\7}\2\2p\24\3\2\2\2qr\7\177\2\2r\26\3\2\2\2st\7k\2"+
		"\2tu\7h\2\2u\30\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7g\2\2z\32\3\2\2"+
		"\2{|\7t\2\2|}\7g\2\2}~\7v\2\2~\177\7w\2\2\177\u0080\7t\2\2\u0080\u0081"+
		"\7p\2\2\u0081\34\3\2\2\2\u0082\u0083\t\2\2\2\u0083\36\3\2\2\2\u0084\u0085"+
		"\t\3\2\2\u0085 \3\2\2\2\u0086\u008f\7\62\2\2\u0087\u008b\t\4\2\2\u0088"+
		"\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0086\3\2\2\2\u008e\u0087\3\2\2\2\u008f\"\3\2\2\2\u0090\u0094\7$\2\2"+
		"\u0091\u0093\13\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7$\2\2\u0098$\3\2\2\2\u0099\u009e\5\35\17\2\u009a\u009d\5\35\17"+
		"\2\u009b\u009d\5\37\20\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f&\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4"+
		"\7w\2\2\u00a4\u00ab\7g\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7c\2\2\u00a7"+
		"\u00a8\7n\2\2\u00a8\u00a9\7u\2\2\u00a9\u00ab\7g\2\2\u00aa\u00a1\3\2\2"+
		"\2\u00aa\u00a5\3\2\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae"+
		"\7\61\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2"+
		"\u00b1\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\b\25\2\2\u00b8*\3\2\2\2\u00b9\u00ba\t\5\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00bc\b\26\2\2\u00bc,\3\2\2\2\u00bd\u00be\7,\2\2\u00be.\3\2\2\2"+
		"\u00bf\u00c0\7\61\2\2\u00c0\60\3\2\2\2\u00c1\u00c2\7\'\2\2\u00c2\62\3"+
		"\2\2\2\u00c3\u00c4\7-\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7/\2\2\u00c6\66"+
		"\3\2\2\2\u00c7\u00c8\7<\2\2\u00c8\u00c9\7?\2\2\u00c98\3\2\2\2\u00ca\u00cb"+
		"\7>\2\2\u00cb:\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7"+
		">\2\2\u00cf\u00d0\7?\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3@\3\2\2\2\u00d4\u00d5\7?\2\2\u00d5\u00d6\7?\2\2\u00d6B\3"+
		"\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9\7?\2\2\u00d9D\3\2\2\2\u00da\u00db"+
		"\7=\2\2\u00dbF\3\2\2\2\u00dc\u00dd\7$\2\2\u00ddH\3\2\2\2\n\2\u008b\u008e"+
		"\u0094\u009c\u009e\u00aa\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}