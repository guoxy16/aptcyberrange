// Generated from Stitch.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StitchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODULE=1, IMPORT=2, LIB=3, MODEL=4, OP=5, AS=6, TACTIC=7, CONDITION=8, 
		ACTION=9, EFFECT=10, ERROR=11, STRATEGY=12, DEFINE=13, FUNCTION=14, SUCCESS=15, 
		FAILURE=16, DEFAULT=17, NULLTACTIC=18, DO=19, DONE=20, IF=21, ELSE=22, 
		FOR=23, WHILE=24, OBJECT=25, INT=26, FLOAT=27, BOOLEAN=28, CHAR=29, STRING=30, 
		SET=31, SEQUENCE=32, RECORD=33, ENUM=34, FORALL=35, EXISTS=36, UNIQUE=37, 
		SELECT=38, AND=39, OR=40, IN=41, TRUE=42, FALSE=43, NULL=44, IDENTIFIER=45, 
		SL_COMMENT=46, ML_COMMENT=47, INTEGER_LIT=48, FLOAT_LIT=49, STRING_LIT=50, 
		CHAR_LIT=51, LPAREN=52, RPAREN=53, LBRACKET=54, RBRACKET=55, LBRACE=56, 
		RBRACE=57, COLON=58, SEMICOLON=59, COMMA=60, DOT=61, DQUOTE=62, SQUOTE=63, 
		BSLASH=64, BAR=65, HASH=66, AT=67, DOLLAR=68, ASSIGN=69, PLUS_ASSIGN=70, 
		MINUS_ASSIGN=71, STAR_ASSIGN=72, DIV_ASSIGN=73, MOD_ASSIGN=74, COLON_BANG=75, 
		LOGICAL_OR=76, LOGICAL_AND=77, EQ=78, NE=79, LT=80, LE=81, GE=82, GT=83, 
		PLUS=84, MINUS=85, STAR=86, SLASH=87, MOD=88, INCR=89, DECR=90, LOGICAL_NOT=91, 
		IMPLIES=92, IFF=93, LETTER=94, DIGIT=95, UNDERSCORE=96, NL=97, WS=98;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MODULE", "IMPORT", "LIB", "MODEL", "OP", "AS", "TACTIC", "CONDITION", 
		"ACTION", "EFFECT", "ERROR", "STRATEGY", "DEFINE", "FUNCTION", "SUCCESS", 
		"FAILURE", "DEFAULT", "NULLTACTIC", "DO", "DONE", "IF", "ELSE", "FOR", 
		"WHILE", "OBJECT", "INT", "FLOAT", "BOOLEAN", "CHAR", "STRING", "SET", 
		"SEQUENCE", "RECORD", "ENUM", "FORALL", "EXISTS", "UNIQUE", "SELECT", 
		"AND", "OR", "IN", "TRUE", "FALSE", "NULL", "IDENTIFIER", "SL_COMMENT", 
		"ML_COMMENT", "INTEGER_LIT", "FLOAT_LIT", "STRING_LIT", "CHAR_LIT", "LPAREN", 
		"RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "COLON", "SEMICOLON", 
		"COMMA", "DOT", "DQUOTE", "SQUOTE", "BSLASH", "BAR", "HASH", "AT", "DOLLAR", 
		"ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "STAR_ASSIGN", "DIV_ASSIGN", 
		"MOD_ASSIGN", "COLON_BANG", "LOGICAL_OR", "LOGICAL_AND", "EQ", "NE", "LT", 
		"LE", "GE", "GT", "PLUS", "MINUS", "STAR", "SLASH", "MOD", "INCR", "DECR", 
		"LOGICAL_NOT", "IMPLIES", "IFF", "LETTER", "DIGIT", "UNDERSCORE", "NL", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "'import'", "'lib'", "'model'", "'op'", "'as'", "'tactic'", 
		"'condition'", "'action'", "'effect'", "'error'", "'strategy'", "'define'", 
		"'function'", "'success'", "'failure'", "'default'", "'TNULL'", "'do'", 
		"'done'", "'if'", "'else'", "'for'", "'while'", "'object'", "'int'", "'float'", 
		"'boolean'", "'char'", "'string'", "'set'", "'sequence'", "'record'", 
		"'enum'", "'forall'", "'exists'", "'unique'", "'select'", "'and'", "'or'", 
		"'in'", "'true'", "'false'", "'null'", null, null, null, null, null, null, 
		null, "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "';'", "','", "'.'", 
		"'\"'", "'''", "'\\'", "'|'", "'#'", "'@'", "'$'", "'='", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "':!'", null, null, "'=='", "'!='", "'<'", "'<='", 
		"'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", 
		"'->'", "'<->'", null, null, "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MODULE", "IMPORT", "LIB", "MODEL", "OP", "AS", "TACTIC", "CONDITION", 
		"ACTION", "EFFECT", "ERROR", "STRATEGY", "DEFINE", "FUNCTION", "SUCCESS", 
		"FAILURE", "DEFAULT", "NULLTACTIC", "DO", "DONE", "IF", "ELSE", "FOR", 
		"WHILE", "OBJECT", "INT", "FLOAT", "BOOLEAN", "CHAR", "STRING", "SET", 
		"SEQUENCE", "RECORD", "ENUM", "FORALL", "EXISTS", "UNIQUE", "SELECT", 
		"AND", "OR", "IN", "TRUE", "FALSE", "NULL", "IDENTIFIER", "SL_COMMENT", 
		"ML_COMMENT", "INTEGER_LIT", "FLOAT_LIT", "STRING_LIT", "CHAR_LIT", "LPAREN", 
		"RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "COLON", "SEMICOLON", 
		"COMMA", "DOT", "DQUOTE", "SQUOTE", "BSLASH", "BAR", "HASH", "AT", "DOLLAR", 
		"ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "STAR_ASSIGN", "DIV_ASSIGN", 
		"MOD_ASSIGN", "COLON_BANG", "LOGICAL_OR", "LOGICAL_AND", "EQ", "NE", "LT", 
		"LE", "GE", "GT", "PLUS", "MINUS", "STAR", "SLASH", "MOD", "INCR", "DECR", 
		"LOGICAL_NOT", "IMPLIES", "IFF", "LETTER", "DIGIT", "UNDERSCORE", "NL", 
		"WS"
	};
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


	public StitchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stitch.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			ML_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 96:
			NL_action((RuleContext)_localctx, actionIndex);
			break;
		case 97:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    setChannel(HIDDEN);
			  
			break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setChannel(HIDDEN);
			break;
		}
	}
	private void NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			setChannel(HIDDEN); setLine (getLine ()+1);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			setChannel(HIDDEN); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2d\u0293\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3-\3.\7.\u01d1\n.\f.\16.\u01d4\13.\3.\3.\3.\3.\3.\3.\7.\u01dc"+
		"\n.\f.\16.\u01df\13.\3/\3/\3/\3/\7/\u01e5\n/\f/\16/\u01e8\13/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\7\60\u01f1\n\60\f\60\16\60\u01f4\13\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\6\61\u01fc\n\61\r\61\16\61\u01fd\3\62\6\62\u0201"+
		"\n\62\r\62\16\62\u0202\3\62\3\62\6\62\u0207\n\62\r\62\16\62\u0208\3\63"+
		"\3\63\7\63\u020d\n\63\f\63\16\63\u0210\13\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3"+
		"=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3H\3"+
		"H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3M\5M\u0252\nM\3N\3"+
		"N\3N\3N\3N\5N\u0259\nN\3O\3O\3O\3P\3P\3P\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3"+
		"T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3]\3]\3]\3^"+
		"\3^\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3b\5b\u028d\nb\3b\3b\3c\3c\3c\3\u01f2"+
		"\2d\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5"+
		"\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\3\2\7\4\2\f"+
		"\f\17\17\3\2$$\3\2))\4\2C\\c|\4\2\13\13\"\"\2\u02a1\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\3\u00c7\3\2\2\2\5\u00ce\3\2\2\2\7\u00d5\3\2\2\2\t\u00d9\3\2\2\2\13"+
		"\u00df\3\2\2\2\r\u00e2\3\2\2\2\17\u00e5\3\2\2\2\21\u00ec\3\2\2\2\23\u00f6"+
		"\3\2\2\2\25\u00fd\3\2\2\2\27\u0104\3\2\2\2\31\u010a\3\2\2\2\33\u0113\3"+
		"\2\2\2\35\u011a\3\2\2\2\37\u0123\3\2\2\2!\u012b\3\2\2\2#\u0133\3\2\2\2"+
		"%\u013b\3\2\2\2\'\u0141\3\2\2\2)\u0144\3\2\2\2+\u0149\3\2\2\2-\u014c\3"+
		"\2\2\2/\u0151\3\2\2\2\61\u0155\3\2\2\2\63\u015b\3\2\2\2\65\u0162\3\2\2"+
		"\2\67\u0166\3\2\2\29\u016c\3\2\2\2;\u0174\3\2\2\2=\u0179\3\2\2\2?\u0180"+
		"\3\2\2\2A\u0184\3\2\2\2C\u018d\3\2\2\2E\u0194\3\2\2\2G\u0199\3\2\2\2I"+
		"\u01a0\3\2\2\2K\u01a7\3\2\2\2M\u01ae\3\2\2\2O\u01b5\3\2\2\2Q\u01b9\3\2"+
		"\2\2S\u01bc\3\2\2\2U\u01bf\3\2\2\2W\u01c4\3\2\2\2Y\u01ca\3\2\2\2[\u01d2"+
		"\3\2\2\2]\u01e0\3\2\2\2_\u01ec\3\2\2\2a\u01fb\3\2\2\2c\u0200\3\2\2\2e"+
		"\u020a\3\2\2\2g\u0213\3\2\2\2i\u0217\3\2\2\2k\u0219\3\2\2\2m\u021b\3\2"+
		"\2\2o\u021d\3\2\2\2q\u021f\3\2\2\2s\u0221\3\2\2\2u\u0223\3\2\2\2w\u0225"+
		"\3\2\2\2y\u0227\3\2\2\2{\u0229\3\2\2\2}\u022b\3\2\2\2\177\u022d\3\2\2"+
		"\2\u0081\u022f\3\2\2\2\u0083\u0231\3\2\2\2\u0085\u0233\3\2\2\2\u0087\u0235"+
		"\3\2\2\2\u0089\u0237\3\2\2\2\u008b\u0239\3\2\2\2\u008d\u023b\3\2\2\2\u008f"+
		"\u023e\3\2\2\2\u0091\u0241\3\2\2\2\u0093\u0244\3\2\2\2\u0095\u0247\3\2"+
		"\2\2\u0097\u024a\3\2\2\2\u0099\u0251\3\2\2\2\u009b\u0258\3\2\2\2\u009d"+
		"\u025a\3\2\2\2\u009f\u025d\3\2\2\2\u00a1\u0260\3\2\2\2\u00a3\u0262\3\2"+
		"\2\2\u00a5\u0265\3\2\2\2\u00a7\u0268\3\2\2\2\u00a9\u026a\3\2\2\2\u00ab"+
		"\u026c\3\2\2\2\u00ad\u026e\3\2\2\2\u00af\u0270\3\2\2\2\u00b1\u0272\3\2"+
		"\2\2\u00b3\u0274\3\2\2\2\u00b5\u0277\3\2\2\2\u00b7\u027a\3\2\2\2\u00b9"+
		"\u027c\3\2\2\2\u00bb\u027f\3\2\2\2\u00bd\u0283\3\2\2\2\u00bf\u0285\3\2"+
		"\2\2\u00c1\u0287\3\2\2\2\u00c3\u028c\3\2\2\2\u00c5\u0290\3\2\2\2\u00c7"+
		"\u00c8\7o\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7w\2\2"+
		"\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd\4\3\2\2\2\u00ce\u00cf\7k"+
		"\2\2\u00cf\u00d0\7o\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3"+
		"\7t\2\2\u00d3\u00d4\7v\2\2\u00d4\6\3\2\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7d\2\2\u00d8\b\3\2\2\2\u00d9\u00da\7o\2\2\u00da\u00db"+
		"\7q\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7n\2\2\u00de"+
		"\n\3\2\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7r\2\2\u00e1\f\3\2\2\2\u00e2"+
		"\u00e3\7c\2\2\u00e3\u00e4\7u\2\2\u00e4\16\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6"+
		"\u00e7\7c\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7k\2\2"+
		"\u00ea\u00eb\7e\2\2\u00eb\20\3\2\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7"+
		"q\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2"+
		"\7v\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\22\3\2\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7v\2\2\u00f9"+
		"\u00fa\7k\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7p\2\2\u00fc\24\3\2\2\2\u00fd"+
		"\u00fe\7g\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7g\2\2"+
		"\u0101\u0102\7e\2\2\u0102\u0103\7v\2\2\u0103\26\3\2\2\2\u0104\u0105\7"+
		"g\2\2\u0105\u0106\7t\2\2\u0106\u0107\7t\2\2\u0107\u0108\7q\2\2\u0108\u0109"+
		"\7t\2\2\u0109\30\3\2\2\2\u010a\u010b\7u\2\2\u010b\u010c\7v\2\2\u010c\u010d"+
		"\7t\2\2\u010d\u010e\7c\2\2\u010e\u010f\7v\2\2\u010f\u0110\7g\2\2\u0110"+
		"\u0111\7i\2\2\u0111\u0112\7{\2\2\u0112\32\3\2\2\2\u0113\u0114\7f\2\2\u0114"+
		"\u0115\7g\2\2\u0115\u0116\7h\2\2\u0116\u0117\7k\2\2\u0117\u0118\7p\2\2"+
		"\u0118\u0119\7g\2\2\u0119\34\3\2\2\2\u011a\u011b\7h\2\2\u011b\u011c\7"+
		"w\2\2\u011c\u011d\7p\2\2\u011d\u011e\7e\2\2\u011e\u011f\7v\2\2\u011f\u0120"+
		"\7k\2\2\u0120\u0121\7q\2\2\u0121\u0122\7p\2\2\u0122\36\3\2\2\2\u0123\u0124"+
		"\7u\2\2\u0124\u0125\7w\2\2\u0125\u0126\7e\2\2\u0126\u0127\7e\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7u\2\2\u0129\u012a\7u\2\2\u012a \3\2\2\2\u012b"+
		"\u012c\7h\2\2\u012c\u012d\7c\2\2\u012d\u012e\7k\2\2\u012e\u012f\7n\2\2"+
		"\u012f\u0130\7w\2\2\u0130\u0131\7t\2\2\u0131\u0132\7g\2\2\u0132\"\3\2"+
		"\2\2\u0133\u0134\7f\2\2\u0134\u0135\7g\2\2\u0135\u0136\7h\2\2\u0136\u0137"+
		"\7c\2\2\u0137\u0138\7w\2\2\u0138\u0139\7n\2\2\u0139\u013a\7v\2\2\u013a"+
		"$\3\2\2\2\u013b\u013c\7V\2\2\u013c\u013d\7P\2\2\u013d\u013e\7W\2\2\u013e"+
		"\u013f\7N\2\2\u013f\u0140\7N\2\2\u0140&\3\2\2\2\u0141\u0142\7f\2\2\u0142"+
		"\u0143\7q\2\2\u0143(\3\2\2\2\u0144\u0145\7f\2\2\u0145\u0146\7q\2\2\u0146"+
		"\u0147\7p\2\2\u0147\u0148\7g\2\2\u0148*\3\2\2\2\u0149\u014a\7k\2\2\u014a"+
		"\u014b\7h\2\2\u014b,\3\2\2\2\u014c\u014d\7g\2\2\u014d\u014e\7n\2\2\u014e"+
		"\u014f\7u\2\2\u014f\u0150\7g\2\2\u0150.\3\2\2\2\u0151\u0152\7h\2\2\u0152"+
		"\u0153\7q\2\2\u0153\u0154\7t\2\2\u0154\60\3\2\2\2\u0155\u0156\7y\2\2\u0156"+
		"\u0157\7j\2\2\u0157\u0158\7k\2\2\u0158\u0159\7n\2\2\u0159\u015a\7g\2\2"+
		"\u015a\62\3\2\2\2\u015b\u015c\7q\2\2\u015c\u015d\7d\2\2\u015d\u015e\7"+
		"l\2\2\u015e\u015f\7g\2\2\u015f\u0160\7e\2\2\u0160\u0161\7v\2\2\u0161\64"+
		"\3\2\2\2\u0162\u0163\7k\2\2\u0163\u0164\7p\2\2\u0164\u0165\7v\2\2\u0165"+
		"\66\3\2\2\2\u0166\u0167\7h\2\2\u0167\u0168\7n\2\2\u0168\u0169\7q\2\2\u0169"+
		"\u016a\7c\2\2\u016a\u016b\7v\2\2\u016b8\3\2\2\2\u016c\u016d\7d\2\2\u016d"+
		"\u016e\7q\2\2\u016e\u016f\7q\2\2\u016f\u0170\7n\2\2\u0170\u0171\7g\2\2"+
		"\u0171\u0172\7c\2\2\u0172\u0173\7p\2\2\u0173:\3\2\2\2\u0174\u0175\7e\2"+
		"\2\u0175\u0176\7j\2\2\u0176\u0177\7c\2\2\u0177\u0178\7t\2\2\u0178<\3\2"+
		"\2\2\u0179\u017a\7u\2\2\u017a\u017b\7v\2\2\u017b\u017c\7t\2\2\u017c\u017d"+
		"\7k\2\2\u017d\u017e\7p\2\2\u017e\u017f\7i\2\2\u017f>\3\2\2\2\u0180\u0181"+
		"\7u\2\2\u0181\u0182\7g\2\2\u0182\u0183\7v\2\2\u0183@\3\2\2\2\u0184\u0185"+
		"\7u\2\2\u0185\u0186\7g\2\2\u0186\u0187\7s\2\2\u0187\u0188\7w\2\2\u0188"+
		"\u0189\7g\2\2\u0189\u018a\7p\2\2\u018a\u018b\7e\2\2\u018b\u018c\7g\2\2"+
		"\u018cB\3\2\2\2\u018d\u018e\7t\2\2\u018e\u018f\7g\2\2\u018f\u0190\7e\2"+
		"\2\u0190\u0191\7q\2\2\u0191\u0192\7t\2\2\u0192\u0193\7f\2\2\u0193D\3\2"+
		"\2\2\u0194\u0195\7g\2\2\u0195\u0196\7p\2\2\u0196\u0197\7w\2\2\u0197\u0198"+
		"\7o\2\2\u0198F\3\2\2\2\u0199\u019a\7h\2\2\u019a\u019b\7q\2\2\u019b\u019c"+
		"\7t\2\2\u019c\u019d\7c\2\2\u019d\u019e\7n\2\2\u019e\u019f\7n\2\2\u019f"+
		"H\3\2\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7z\2\2\u01a2\u01a3\7k\2\2\u01a3"+
		"\u01a4\7u\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6\7u\2\2\u01a6J\3\2\2\2\u01a7"+
		"\u01a8\7w\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa\7k\2\2\u01aa\u01ab\7s\2\2"+
		"\u01ab\u01ac\7w\2\2\u01ac\u01ad\7g\2\2\u01adL\3\2\2\2\u01ae\u01af\7u\2"+
		"\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7n\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3"+
		"\7e\2\2\u01b3\u01b4\7v\2\2\u01b4N\3\2\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7"+
		"\7p\2\2\u01b7\u01b8\7f\2\2\u01b8P\3\2\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb"+
		"\7t\2\2\u01bbR\3\2\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be\7p\2\2\u01beT\3"+
		"\2\2\2\u01bf\u01c0\7v\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7w\2\2\u01c2"+
		"\u01c3\7g\2\2\u01c3V\3\2\2\2\u01c4\u01c5\7h\2\2\u01c5\u01c6\7c\2\2\u01c6"+
		"\u01c7\7n\2\2\u01c7\u01c8\7u\2\2\u01c8\u01c9\7g\2\2\u01c9X\3\2\2\2\u01ca"+
		"\u01cb\7p\2\2\u01cb\u01cc\7w\2\2\u01cc\u01cd\7n\2\2\u01cd\u01ce\7n\2\2"+
		"\u01ceZ\3\2\2\2\u01cf\u01d1\5\u00c1a\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4"+
		"\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d5\u01dd\5\u00bd_\2\u01d6\u01dc\5\u00c1a\2\u01d7\u01dc"+
		"\5{>\2\u01d8\u01dc\5\u00bd_\2\u01d9\u01dc\5\u00bf`\2\u01da\u01dc\5\u00ab"+
		"V\2\u01db\u01d6\3\2\2\2\u01db\u01d7\3\2\2\2\u01db\u01d8\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\\\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1"+
		"\7\61\2\2\u01e1\u01e2\7\61\2\2\u01e2\u01e6\3\2\2\2\u01e3\u01e5\n\2\2\2"+
		"\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\5\u00c3b"+
		"\2\u01ea\u01eb\b/\2\2\u01eb^\3\2\2\2\u01ec\u01ed\7\61\2\2\u01ed\u01ee"+
		"\7,\2\2\u01ee\u01f2\3\2\2\2\u01ef\u01f1\13\2\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f5\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7,\2\2\u01f6\u01f7\7\61\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01f9\b\60\3\2\u01f9`\3\2\2\2\u01fa\u01fc\5\u00bf"+
		"`\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01feb\3\2\2\2\u01ff\u0201\5\u00bf`\2\u0200\u01ff\3\2\2"+
		"\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204"+
		"\3\2\2\2\u0204\u0206\5{>\2\u0205\u0207\5\u00bf`\2\u0206\u0205\3\2\2\2"+
		"\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209d\3"+
		"\2\2\2\u020a\u020e\5}?\2\u020b\u020d\n\3\2\2\u020c\u020b\3\2\2\2\u020d"+
		"\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0211\u0212\5}?\2\u0212f\3\2\2\2\u0213\u0214"+
		"\5\177@\2\u0214\u0215\n\4\2\2\u0215\u0216\5\177@\2\u0216h\3\2\2\2\u0217"+
		"\u0218\7*\2\2\u0218j\3\2\2\2\u0219\u021a\7+\2\2\u021al\3\2\2\2\u021b\u021c"+
		"\7]\2\2\u021cn\3\2\2\2\u021d\u021e\7_\2\2\u021ep\3\2\2\2\u021f\u0220\7"+
		"}\2\2\u0220r\3\2\2\2\u0221\u0222\7\177\2\2\u0222t\3\2\2\2\u0223\u0224"+
		"\7<\2\2\u0224v\3\2\2\2\u0225\u0226\7=\2\2\u0226x\3\2\2\2\u0227\u0228\7"+
		".\2\2\u0228z\3\2\2\2\u0229\u022a\7\60\2\2\u022a|\3\2\2\2\u022b\u022c\7"+
		"$\2\2\u022c~\3\2\2\2\u022d\u022e\7)\2\2\u022e\u0080\3\2\2\2\u022f\u0230"+
		"\7^\2\2\u0230\u0082\3\2\2\2\u0231\u0232\7~\2\2\u0232\u0084\3\2\2\2\u0233"+
		"\u0234\7%\2\2\u0234\u0086\3\2\2\2\u0235\u0236\7B\2\2\u0236\u0088\3\2\2"+
		"\2\u0237\u0238\7&\2\2\u0238\u008a\3\2\2\2\u0239\u023a\7?\2\2\u023a\u008c"+
		"\3\2\2\2\u023b\u023c\7-\2\2\u023c\u023d\7?\2\2\u023d\u008e\3\2\2\2\u023e"+
		"\u023f\7/\2\2\u023f\u0240\7?\2\2\u0240\u0090\3\2\2\2\u0241\u0242\7,\2"+
		"\2\u0242\u0243\7?\2\2\u0243\u0092\3\2\2\2\u0244\u0245\7\61\2\2\u0245\u0246"+
		"\7?\2\2\u0246\u0094\3\2\2\2\u0247\u0248\7\'\2\2\u0248\u0249\7?\2\2\u0249"+
		"\u0096\3\2\2\2\u024a\u024b\7<\2\2\u024b\u024c\7#\2\2\u024c\u0098\3\2\2"+
		"\2\u024d\u024e\7~\2\2\u024e\u0252\7~\2\2\u024f\u0250\7q\2\2\u0250\u0252"+
		"\7t\2\2\u0251\u024d\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u009a\3\2\2\2\u0253"+
		"\u0254\7(\2\2\u0254\u0259\7(\2\2\u0255\u0256\7c\2\2\u0256\u0257\7p\2\2"+
		"\u0257\u0259\7f\2\2\u0258\u0253\3\2\2\2\u0258\u0255\3\2\2\2\u0259\u009c"+
		"\3\2\2\2\u025a\u025b\7?\2\2\u025b\u025c\7?\2\2\u025c\u009e\3\2\2\2\u025d"+
		"\u025e\7#\2\2\u025e\u025f\7?\2\2\u025f\u00a0\3\2\2\2\u0260\u0261\7>\2"+
		"\2\u0261\u00a2\3\2\2\2\u0262\u0263\7>\2\2\u0263\u0264\7?\2\2\u0264\u00a4"+
		"\3\2\2\2\u0265\u0266\7@\2\2\u0266\u0267\7?\2\2\u0267\u00a6\3\2\2\2\u0268"+
		"\u0269\7@\2\2\u0269\u00a8\3\2\2\2\u026a\u026b\7-\2\2\u026b\u00aa\3\2\2"+
		"\2\u026c\u026d\7/\2\2\u026d\u00ac\3\2\2\2\u026e\u026f\7,\2\2\u026f\u00ae"+
		"\3\2\2\2\u0270\u0271\7\61\2\2\u0271\u00b0\3\2\2\2\u0272\u0273\7\'\2\2"+
		"\u0273\u00b2\3\2\2\2\u0274\u0275\7-\2\2\u0275\u0276\7-\2\2\u0276\u00b4"+
		"\3\2\2\2\u0277\u0278\7/\2\2\u0278\u0279\7/\2\2\u0279\u00b6\3\2\2\2\u027a"+
		"\u027b\7#\2\2\u027b\u00b8\3\2\2\2\u027c\u027d\7/\2\2\u027d\u027e\7@\2"+
		"\2\u027e\u00ba\3\2\2\2\u027f\u0280\7>\2\2\u0280\u0281\7/\2\2\u0281\u0282"+
		"\7@\2\2\u0282\u00bc\3\2\2\2\u0283\u0284\t\5\2\2\u0284\u00be\3\2\2\2\u0285"+
		"\u0286\4\62;\2\u0286\u00c0\3\2\2\2\u0287\u0288\7a\2\2\u0288\u00c2\3\2"+
		"\2\2\u0289\u028a\7\17\2\2\u028a\u028d\7\f\2\2\u028b\u028d\t\2\2\2\u028c"+
		"\u0289\3\2\2\2\u028c\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\bb"+
		"\4\2\u028f\u00c4\3\2\2\2\u0290\u0291\t\6\2\2\u0291\u0292\bc\5\2\u0292"+
		"\u00c6\3\2\2\2\17\2\u01d2\u01db\u01dd\u01e6\u01f2\u01fd\u0202\u0208\u020e"+
		"\u0251\u0258\u028c\6\3/\2\3\60\3\3b\4\3c\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}