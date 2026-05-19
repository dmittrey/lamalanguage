// Generated from /workspace/language/src/main/java/com/oracle/truffle/lama/parser/Lama.g4 by ANTLR 4.13.2
package com.oracle.truffle.lama.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LamaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IMPORT=4, VAR=5, FUN=6, IF=7, THEN=8, ELSE=9, 
		FI=10, ELIF=11, CASE=12, OF=13, ESAC=14, LET=15, IN=16, WHILE=17, DO=18, 
		OD=19, FOR=20, SKIP_RULE=21, TRUE=22, FALSE=23, PUBLIC=24, ETA=25, INFIX=26, 
		INFIXR=27, INFIXL=28, AT=29, BEFORE=30, AFTER=31, ASSIGN=32, OR=33, AND=34, 
		EQ=35, NE=36, LT=37, LE=38, GT=39, GE=40, PLUS=41, MINUS=42, MUL=43, DIV=44, 
		MOD=45, DOT=46, LPAREN=47, RPAREN=48, LBRACK=49, RBRACK=50, LBRACE=51, 
		RBRACE=52, COMMA=53, SEMICOLON=54, COLON=55, ARROW=56, UNDERSCORE=57, 
		CUSTOM_OP=58, SHARP_VAL=59, SHARP_FUN=60, SHARP_STR=61, SHARP_ARRAY=62, 
		SHARP_SEXP=63, SHARP_BOX=64, UIDENT=65, LIDENT=66, DECIMAL=67, STRING=68, 
		CHAR=69, WS=70, LINE_COMMENT=71, BLOCK_COMMENT=72;
	public static final int
		RULE_program = 0, RULE_topScope = 1, RULE_importStatement = 2, RULE_scopeExpression = 3, 
		RULE_definition = 4, RULE_varDefinition = 5, RULE_varInit = 6, RULE_funDefinition = 7, 
		RULE_infixDefinition = 8, RULE_patternList = 9, RULE_pattern = 10, RULE_expression = 11, 
		RULE_sequenceExpression = 12, RULE_assignExpression = 13, RULE_binaryExpression = 14, 
		RULE_binaryOp = 15, RULE_prefixExpression = 16, RULE_postfixExpression = 17, 
		RULE_primary = 18, RULE_etaExpression = 19, RULE_literal = 20, RULE_identifier = 21, 
		RULE_arrayLiteral = 22, RULE_listLiteral = 23, RULE_sexp = 24, RULE_ifExpression = 25, 
		RULE_letExpression = 26, RULE_caseExpression = 27, RULE_caseBranch = 28, 
		RULE_loopExpression = 29, RULE_whileLoop = 30, RULE_doWhileLoop = 31, 
		RULE_forLoop = 32, RULE_forInit = 33, RULE_forStep = 34, RULE_lambdaExpression = 35, 
		RULE_argumentList = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topScope", "importStatement", "scopeExpression", "definition", 
			"varDefinition", "varInit", "funDefinition", "infixDefinition", "patternList", 
			"pattern", "expression", "sequenceExpression", "assignExpression", "binaryExpression", 
			"binaryOp", "prefixExpression", "postfixExpression", "primary", "etaExpression", 
			"literal", "identifier", "arrayLiteral", "listLiteral", "sexp", "ifExpression", 
			"letExpression", "caseExpression", "caseBranch", "loopExpression", "whileLoop", 
			"doWhileLoop", "forLoop", "forInit", "forStep", "lambdaExpression", "argumentList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'@'", "'|'", "'import'", "'var'", "'fun'", "'if'", "'then'", 
			"'else'", "'fi'", "'elif'", "'case'", "'of'", "'esac'", "'let'", "'in'", 
			"'while'", "'do'", "'od'", "'for'", "'skip'", "'true'", "'false'", "'public'", 
			"'eta'", "'infix'", "'infixr'", "'infixl'", "'at'", "'before'", "'after'", 
			"':='", "'!!'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'.'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "','", "';'", "':'", "'->'", "'_'", null, "'#val'", "'#fun'", 
			"'#str'", "'#array'", "'#sexp'", "'#box'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IMPORT", "VAR", "FUN", "IF", "THEN", "ELSE", 
			"FI", "ELIF", "CASE", "OF", "ESAC", "LET", "IN", "WHILE", "DO", "OD", 
			"FOR", "SKIP_RULE", "TRUE", "FALSE", "PUBLIC", "ETA", "INFIX", "INFIXR", 
			"INFIXL", "AT", "BEFORE", "AFTER", "ASSIGN", "OR", "AND", "EQ", "NE", 
			"LT", "LE", "GT", "GE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "DOT", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", 
			"SEMICOLON", "COLON", "ARROW", "UNDERSCORE", "CUSTOM_OP", "SHARP_VAL", 
			"SHARP_FUN", "SHARP_STR", "SHARP_ARRAY", "SHARP_SEXP", "SHARP_BOX", "UIDENT", 
			"LIDENT", "DECIMAL", "STRING", "CHAR", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "Lama.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LamaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TopScopeContext topScope() {
			return getRuleContext(TopScopeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LamaParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(74);
				importStatement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			topScope();
			setState(81);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TopScopeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public TopScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterTopScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitTopScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitTopScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopScopeContext topScope() throws RecognitionException {
		TopScopeContext _localctx = new TopScopeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topScope);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					definition();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(89);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(LamaParser.IMPORT, 0); }
		public List<TerminalNode> LIDENT() { return getTokens(LamaParser.LIDENT); }
		public TerminalNode LIDENT(int i) {
			return getToken(LamaParser.LIDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public TerminalNode SEMICOLON() { return getToken(LamaParser.SEMICOLON, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IMPORT);
			setState(92);
			match(LIDENT);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				match(LIDENT);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(100);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeExpressionContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterScopeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitScopeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitScopeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeExpressionContext scopeExpression() throws RecognitionException {
		ScopeExpressionContext _localctx = new ScopeExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scopeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					definition();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(109);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public FunDefinitionContext funDefinition() {
			return getRuleContext(FunDefinitionContext.class,0);
		}
		public InfixDefinitionContext infixDefinition() {
			return getRuleContext(InfixDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definition);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				varDefinition();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				funDefinition();
				}
				break;
			case INFIX:
			case INFIXR:
			case INFIXL:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				infixDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefinitionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LamaParser.VAR, 0); }
		public List<VarInitContext> varInit() {
			return getRuleContexts(VarInitContext.class);
		}
		public VarInitContext varInit(int i) {
			return getRuleContext(VarInitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public TerminalNode SEMICOLON() { return getToken(LamaParser.SEMICOLON, 0); }
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitVarDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(VAR);
			setState(118);
			varInit();
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					match(COMMA);
					setState(120);
					varInit();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(126);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarInitContext extends ParserRuleContext {
		public TerminalNode LIDENT() { return getToken(LamaParser.LIDENT, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public VarInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitVarInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitVarInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInitContext varInit() throws RecognitionException {
		VarInitContext _localctx = new VarInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(LIDENT);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(130);
				match(T__0);
				setState(131);
				assignExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunDefinitionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(LamaParser.FUN, 0); }
		public TerminalNode LIDENT() { return getToken(LamaParser.LIDENT, 0); }
		public TerminalNode LPAREN() { return getToken(LamaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LamaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(LamaParser.LBRACE, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LamaParser.RBRACE, 0); }
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LamaParser.SEMICOLON, 0); }
		public FunDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterFunDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitFunDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitFunDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefinitionContext funDefinition() throws RecognitionException {
		FunDefinitionContext _localctx = new FunDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(FUN);
			setState(135);
			match(LIDENT);
			setState(136);
			match(LPAREN);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 281372602138627L) != 0)) {
				{
				setState(137);
				patternList();
				}
			}

			setState(140);
			match(RPAREN);
			setState(141);
			match(LBRACE);
			setState(142);
			scopeExpression();
			setState(143);
			match(RBRACE);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(144);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InfixDefinitionContext extends ParserRuleContext {
		public List<BinaryOpContext> binaryOp() {
			return getRuleContexts(BinaryOpContext.class);
		}
		public BinaryOpContext binaryOp(int i) {
			return getRuleContext(BinaryOpContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(LamaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LamaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(LamaParser.LBRACE, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LamaParser.RBRACE, 0); }
		public TerminalNode INFIX() { return getToken(LamaParser.INFIX, 0); }
		public TerminalNode INFIXR() { return getToken(LamaParser.INFIXR, 0); }
		public TerminalNode INFIXL() { return getToken(LamaParser.INFIXL, 0); }
		public TerminalNode AT() { return getToken(LamaParser.AT, 0); }
		public TerminalNode BEFORE() { return getToken(LamaParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(LamaParser.AFTER, 0); }
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LamaParser.SEMICOLON, 0); }
		public InfixDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterInfixDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitInfixDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitInfixDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixDefinitionContext infixDefinition() throws RecognitionException {
		InfixDefinitionContext _localctx = new InfixDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_infixDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			binaryOp();
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
			binaryOp();
			setState(151);
			match(LPAREN);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 281372602138627L) != 0)) {
				{
				setState(152);
				patternList();
				}
			}

			setState(155);
			match(RPAREN);
			setState(156);
			match(LBRACE);
			setState(157);
			scopeExpression();
			setState(158);
			match(RBRACE);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(159);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternListContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public PatternListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterPatternList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitPatternList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitPatternList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternListContext patternList() throws RecognitionException {
		PatternListContext _localctx = new PatternListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			pattern(0);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(163);
				match(COMMA);
				setState(164);
				pattern(0);
				}
				}
				setState(169);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListPatternContext extends PatternContext {
		public TerminalNode LBRACE() { return getToken(LamaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LamaParser.RBRACE, 0); }
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public ListPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterListPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitListPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitListPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenPatternContext extends PatternContext {
		public TerminalNode LPAREN() { return getToken(LamaParser.LPAREN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LamaParser.RPAREN, 0); }
		public ParenPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterParenPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitParenPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitParenPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TruePatternContext extends PatternContext {
		public TerminalNode TRUE() { return getToken(LamaParser.TRUE, 0); }
		public TruePatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterTruePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitTruePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitTruePattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalPatternContext extends PatternContext {
		public TerminalNode DECIMAL() { return getToken(LamaParser.DECIMAL, 0); }
		public DecimalPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterDecimalPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitDecimalPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitDecimalPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SharpStrPatternContext extends PatternContext {
		public TerminalNode SHARP_STR() { return getToken(LamaParser.SHARP_STR, 0); }
		public SharpStrPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSharpStrPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSharpStrPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSharpStrPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SexpPatternNoArgsContext extends PatternContext {
		public TerminalNode UIDENT() { return getToken(LamaParser.UIDENT, 0); }
		public SexpPatternNoArgsContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSexpPatternNoArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSexpPatternNoArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSexpPatternNoArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WildcardPatternContext extends PatternContext {
		public TerminalNode UNDERSCORE() { return getToken(LamaParser.UNDERSCORE, 0); }
		public WildcardPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterWildcardPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitWildcardPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitWildcardPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasPatternContext extends PatternContext {
		public TerminalNode LIDENT() { return getToken(LamaParser.LIDENT, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public AliasPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterAliasPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitAliasPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitAliasPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SharpSexpPatternContext extends PatternContext {
		public TerminalNode SHARP_SEXP() { return getToken(LamaParser.SHARP_SEXP, 0); }
		public SharpSexpPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSharpSexpPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSharpSexpPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSharpSexpPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SharpFunPatternContext extends PatternContext {
		public TerminalNode SHARP_FUN() { return getToken(LamaParser.SHARP_FUN, 0); }
		public SharpFunPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSharpFunPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSharpFunPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSharpFunPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarPatternContext extends PatternContext {
		public TerminalNode LIDENT() { return getToken(LamaParser.LIDENT, 0); }
		public VarPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterVarPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitVarPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitVarPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharPatternContext extends PatternContext {
		public TerminalNode CHAR() { return getToken(LamaParser.CHAR, 0); }
		public CharPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterCharPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitCharPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitCharPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConsPatternContext extends PatternContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TerminalNode COLON() { return getToken(LamaParser.COLON, 0); }
		public ConsPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterConsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitConsPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitConsPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringPatternContext extends PatternContext {
		public TerminalNode STRING() { return getToken(LamaParser.STRING, 0); }
		public StringPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterStringPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitStringPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitStringPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SharpBoxPatternContext extends PatternContext {
		public TerminalNode SHARP_BOX() { return getToken(LamaParser.SHARP_BOX, 0); }
		public SharpBoxPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSharpBoxPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSharpBoxPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSharpBoxPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalsePatternContext extends PatternContext {
		public TerminalNode FALSE() { return getToken(LamaParser.FALSE, 0); }
		public FalsePatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterFalsePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitFalsePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitFalsePattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SharpValPatternContext extends PatternContext {
		public TerminalNode SHARP_VAL() { return getToken(LamaParser.SHARP_VAL, 0); }
		public SharpValPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSharpValPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSharpValPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSharpValPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SharpArrayPatternContext extends PatternContext {
		public TerminalNode SHARP_ARRAY() { return getToken(LamaParser.SHARP_ARRAY, 0); }
		public SharpArrayPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSharpArrayPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSharpArrayPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSharpArrayPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SexpPatternWithArgsContext extends PatternContext {
		public TerminalNode UIDENT() { return getToken(LamaParser.UIDENT, 0); }
		public TerminalNode LPAREN() { return getToken(LamaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LamaParser.RPAREN, 0); }
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public SexpPatternWithArgsContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSexpPatternWithArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSexpPatternWithArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSexpPatternWithArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayPatternContext extends PatternContext {
		public TerminalNode LBRACK() { return getToken(LamaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LamaParser.RBRACK, 0); }
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public ArrayPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterArrayPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitArrayPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitArrayPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_pattern, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new AliasPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				match(LIDENT);
				setState(172);
				match(T__1);
				setState(173);
				pattern(20);
				}
				break;
			case 2:
				{
				_localctx = new SharpValPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(SHARP_VAL);
				}
				break;
			case 3:
				{
				_localctx = new SharpFunPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(SHARP_FUN);
				}
				break;
			case 4:
				{
				_localctx = new SharpStrPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(SHARP_STR);
				}
				break;
			case 5:
				{
				_localctx = new SharpArrayPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(SHARP_ARRAY);
				}
				break;
			case 6:
				{
				_localctx = new SharpSexpPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(SHARP_SEXP);
				}
				break;
			case 7:
				{
				_localctx = new SharpBoxPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(SHARP_BOX);
				}
				break;
			case 8:
				{
				_localctx = new VarPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(LIDENT);
				}
				break;
			case 9:
				{
				_localctx = new SexpPatternWithArgsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(UIDENT);
				setState(182);
				match(LPAREN);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 281372602138627L) != 0)) {
					{
					setState(183);
					patternList();
					}
				}

				setState(186);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new SexpPatternNoArgsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(UIDENT);
				}
				break;
			case 11:
				{
				_localctx = new ArrayPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(LBRACK);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 281372602138627L) != 0)) {
					{
					setState(189);
					patternList();
					}
				}

				setState(192);
				match(RBRACK);
				}
				break;
			case 12:
				{
				_localctx = new ListPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(LBRACE);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 281372602138627L) != 0)) {
					{
					setState(194);
					patternList();
					}
				}

				setState(197);
				match(RBRACE);
				}
				break;
			case 13:
				{
				_localctx = new WildcardPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(UNDERSCORE);
				}
				break;
			case 14:
				{
				_localctx = new DecimalPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(DECIMAL);
				}
				break;
			case 15:
				{
				_localctx = new StringPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(STRING);
				}
				break;
			case 16:
				{
				_localctx = new CharPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(CHAR);
				}
				break;
			case 17:
				{
				_localctx = new TruePatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(TRUE);
				}
				break;
			case 18:
				{
				_localctx = new FalsePatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(FALSE);
				}
				break;
			case 19:
				{
				_localctx = new ParenPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(LPAREN);
				setState(205);
				pattern(0);
				setState(206);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConsPatternContext(new PatternContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(210);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(211);
					match(COLON);
					setState(212);
					pattern(1);
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public SequenceExpressionContext sequenceExpression() {
			return getRuleContext(SequenceExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			sequenceExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SequenceExpressionContext extends ParserRuleContext {
		public List<AssignExpressionContext> assignExpression() {
			return getRuleContexts(AssignExpressionContext.class);
		}
		public AssignExpressionContext assignExpression(int i) {
			return getRuleContext(AssignExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(LamaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LamaParser.SEMICOLON, i);
		}
		public SequenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSequenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSequenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSequenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceExpressionContext sequenceExpression() throws RecognitionException {
		SequenceExpressionContext _localctx = new SequenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sequenceExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			assignExpression();
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					match(SEMICOLON);
					setState(222);
					assignExpression();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpressionContext extends ParserRuleContext {
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LamaParser.ASSIGN, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			binaryExpression();
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(229);
				match(ASSIGN);
				setState(230);
				assignExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ParserRuleContext {
		public List<PrefixExpressionContext> prefixExpression() {
			return getRuleContexts(PrefixExpressionContext.class);
		}
		public PrefixExpressionContext prefixExpression(int i) {
			return getRuleContext(PrefixExpressionContext.class,i);
		}
		public List<BinaryOpContext> binaryOp() {
			return getRuleContexts(BinaryOpContext.class);
		}
		public BinaryOpContext binaryOp(int i) {
			return getRuleContext(BinaryOpContext.class,i);
		}
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			prefixExpression();
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					binaryOp();
					setState(235);
					prefixExpression();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LamaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LamaParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(LamaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LamaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LamaParser.MOD, 0); }
		public TerminalNode EQ() { return getToken(LamaParser.EQ, 0); }
		public TerminalNode NE() { return getToken(LamaParser.NE, 0); }
		public TerminalNode LT() { return getToken(LamaParser.LT, 0); }
		public TerminalNode LE() { return getToken(LamaParser.LE, 0); }
		public TerminalNode GT() { return getToken(LamaParser.GT, 0); }
		public TerminalNode GE() { return getToken(LamaParser.GE, 0); }
		public TerminalNode AND() { return getToken(LamaParser.AND, 0); }
		public TerminalNode OR() { return getToken(LamaParser.OR, 0); }
		public TerminalNode COLON() { return getToken(LamaParser.COLON, 0); }
		public TerminalNode CUSTOM_OP() { return getToken(LamaParser.CUSTOM_OP, 0); }
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitBinaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 324329533324918784L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LamaParser.MINUS, 0); }
		public PrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixExpressionContext prefixExpression() throws RecognitionException {
		PrefixExpressionContext _localctx = new PrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_prefixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(244);
				match(MINUS);
				}
			}

			setState(247);
			postfixExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallSuffixContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LamaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LamaParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallSuffixContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterCallSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitCallSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitCallSuffix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotSuffixContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LamaParser.DOT, 0); }
		public TerminalNode LIDENT() { return getToken(LamaParser.LIDENT, 0); }
		public DotSuffixContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterDotSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitDotSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitDotSuffix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BasePrimaryContext extends PostfixExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public BasePrimaryContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterBasePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitBasePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitBasePrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexSuffixContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LamaParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LamaParser.RBRACK, 0); }
		public IndexSuffixContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterIndexSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitIndexSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitIndexSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BasePrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(250);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(266);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new CallSuffixContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(252);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(253);
						match(LPAREN);
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -576414504093754813L) != 0)) {
							{
							setState(254);
							argumentList();
							}
						}

						setState(257);
						match(RPAREN);
						}
						break;
					case 2:
						{
						_localctx = new IndexSuffixContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(258);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(259);
						match(LBRACK);
						setState(260);
						expression();
						setState(261);
						match(RBRACK);
						}
						break;
					case 3:
						{
						_localctx = new DotSuffixContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(263);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(264);
						match(DOT);
						setState(265);
						match(LIDENT);
						}
						break;
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LitPrimaryContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LitPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterLitPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitLitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitLitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixIdPrimaryContext extends PrimaryContext {
		public TerminalNode INFIX() { return getToken(LamaParser.INFIX, 0); }
		public TerminalNode CUSTOM_OP() { return getToken(LamaParser.CUSTOM_OP, 0); }
		public InfixIdPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterInfixIdPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitInfixIdPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitInfixIdPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayPrimaryContext extends PrimaryContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterArrayPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitArrayPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitArrayPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopPrimaryContext extends PrimaryContext {
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public LoopPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterLoopPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitLoopPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitLoopPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaPrimaryContext extends PrimaryContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public LambdaPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterLambdaPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitLambdaPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitLambdaPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListPrimaryContext extends PrimaryContext {
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public ListPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterListPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitListPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitListPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenPrimaryContext extends PrimaryContext {
		public TerminalNode LPAREN() { return getToken(LamaParser.LPAREN, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LamaParser.RPAREN, 0); }
		public ParenPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterParenPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitParenPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitParenPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EtaPrimaryContext extends PrimaryContext {
		public EtaExpressionContext etaExpression() {
			return getRuleContext(EtaExpressionContext.class,0);
		}
		public EtaPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterEtaPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitEtaPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitEtaPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfPrimaryContext extends PrimaryContext {
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public IfPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterIfPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitIfPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitIfPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipPrimaryContext extends PrimaryContext {
		public TerminalNode SKIP_RULE() { return getToken(LamaParser.SKIP_RULE, 0); }
		public SkipPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSkipPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSkipPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSkipPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SexpPrimaryContext extends PrimaryContext {
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public SexpPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSexpPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSexpPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSexpPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdPrimaryContext extends PrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterIdPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitIdPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitIdPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CasePrimaryContext extends PrimaryContext {
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public CasePrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterCasePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitCasePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitCasePrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetPrimaryContext extends PrimaryContext {
		public LetExpressionContext letExpression() {
			return getRuleContext(LetExpressionContext.class,0);
		}
		public LetPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterLetPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitLetPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitLetPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primary);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new LitPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				literal();
				}
				break;
			case 2:
				_localctx = new SexpPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				sexp();
				}
				break;
			case 3:
				_localctx = new IdPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				identifier();
				}
				break;
			case 4:
				_localctx = new ParenPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(LPAREN);
				setState(275);
				scopeExpression();
				setState(276);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new ArrayPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				arrayLiteral();
				}
				break;
			case 6:
				_localctx = new ListPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				listLiteral();
				}
				break;
			case 7:
				_localctx = new IfPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				ifExpression();
				}
				break;
			case 8:
				_localctx = new LetPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(281);
				letExpression();
				}
				break;
			case 9:
				_localctx = new CasePrimaryContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(282);
				caseExpression();
				}
				break;
			case 10:
				_localctx = new LoopPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(283);
				loopExpression();
				}
				break;
			case 11:
				_localctx = new SkipPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(284);
				match(SKIP_RULE);
				}
				break;
			case 12:
				_localctx = new LambdaPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(285);
				lambdaExpression();
				}
				break;
			case 13:
				_localctx = new EtaPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(286);
				etaExpression();
				}
				break;
			case 14:
				_localctx = new InfixIdPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(287);
				match(INFIX);
				setState(288);
				match(CUSTOM_OP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EtaExpressionContext extends ParserRuleContext {
		public TerminalNode ETA() { return getToken(LamaParser.ETA, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public EtaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterEtaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitEtaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitEtaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtaExpressionContext etaExpression() throws RecognitionException {
		EtaExpressionContext _localctx = new EtaExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_etaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ETA);
			setState(292);
			postfixExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(LamaParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(LamaParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(LamaParser.CHAR, 0); }
		public TerminalNode TRUE() { return getToken(LamaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LamaParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 246290604621827L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode LIDENT() { return getToken(LamaParser.LIDENT, 0); }
		public TerminalNode UIDENT() { return getToken(LamaParser.UIDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==UIDENT || _la==LIDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LamaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LamaParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayLiteral);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(LBRACK);
				setState(299);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(LBRACK);
				setState(301);
				expression();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(302);
					match(COMMA);
					setState(303);
					expression();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
				match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LamaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LamaParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listLiteral);
		int _la;
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(LBRACE);
				setState(314);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(LBRACE);
				setState(316);
				expression();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(317);
					match(COMMA);
					setState(318);
					expression();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SexpContext extends ParserRuleContext {
		public TerminalNode UIDENT() { return getToken(LamaParser.UIDENT, 0); }
		public TerminalNode LPAREN() { return getToken(LamaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LamaParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public SexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterSexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitSexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitSexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexpContext sexp() throws RecognitionException {
		SexpContext _localctx = new SexpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sexp);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(UIDENT);
				setState(329);
				match(LPAREN);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -576414504093754813L) != 0)) {
					{
					setState(330);
					expression();
					}
				}

				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					expression();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(UIDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LamaParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(LamaParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(LamaParser.THEN, i);
		}
		public List<ScopeExpressionContext> scopeExpression() {
			return getRuleContexts(ScopeExpressionContext.class);
		}
		public ScopeExpressionContext scopeExpression(int i) {
			return getRuleContext(ScopeExpressionContext.class,i);
		}
		public TerminalNode FI() { return getToken(LamaParser.FI, 0); }
		public List<TerminalNode> ELIF() { return getTokens(LamaParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(LamaParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(LamaParser.ELSE, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(IF);
			setState(345);
			expression();
			setState(346);
			match(THEN);
			setState(347);
			scopeExpression();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(348);
				match(ELIF);
				setState(349);
				expression();
				setState(350);
				match(THEN);
				setState(351);
				scopeExpression();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(358);
				match(ELSE);
				setState(359);
				scopeExpression();
				}
			}

			setState(362);
			match(FI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetExpressionContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(LamaParser.LET, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(LamaParser.IN, 0); }
		public LetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterLetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitLetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitLetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetExpressionContext letExpression() throws RecognitionException {
		LetExpressionContext _localctx = new LetExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_letExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(LET);
			setState(365);
			pattern(0);
			setState(366);
			match(T__0);
			setState(367);
			expression();
			setState(368);
			match(IN);
			setState(369);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(LamaParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(LamaParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(LamaParser.ESAC, 0); }
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(CASE);
			setState(372);
			expression();
			setState(373);
			match(OF);
			setState(375); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(374);
				caseBranch();
				}
				}
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 281372602138627L) != 0) );
			setState(379);
			match(ESAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseBranchContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> ARROW() { return getTokens(LamaParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(LamaParser.ARROW, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CaseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterCaseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitCaseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitCaseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBranchContext caseBranch() throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caseBranch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			pattern(0);
			setState(382);
			match(ARROW);
			setState(383);
			expression();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(384);
				match(T__2);
				setState(385);
				pattern(0);
				setState(386);
				match(ARROW);
				setState(387);
				expression();
				}
				}
				setState(393);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopExpressionContext extends ParserRuleContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loopExpression);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				whileLoop();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				doWhileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				forLoop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LamaParser.WHILE, 0); }
		public SequenceExpressionContext sequenceExpression() {
			return getRuleContext(SequenceExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(LamaParser.DO, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode OD() { return getToken(LamaParser.OD, 0); }
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(WHILE);
			setState(400);
			sequenceExpression();
			setState(401);
			match(DO);
			setState(402);
			scopeExpression();
			setState(403);
			match(OD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileLoopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(LamaParser.DO, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(LamaParser.WHILE, 0); }
		public SequenceExpressionContext sequenceExpression() {
			return getRuleContext(SequenceExpressionContext.class,0);
		}
		public TerminalNode OD() { return getToken(LamaParser.OD, 0); }
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(DO);
			setState(406);
			scopeExpression();
			setState(407);
			match(WHILE);
			setState(408);
			sequenceExpression();
			setState(409);
			match(OD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LamaParser.FOR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public TerminalNode DO() { return getToken(LamaParser.DO, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode OD() { return getToken(LamaParser.OD, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStepContext forStep() {
			return getRuleContext(ForStepContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(FOR);
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(412);
				forInit();
				}
				break;
			}
			setState(415);
			match(COMMA);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -576414504093754813L) != 0)) {
				{
				setState(416);
				expression();
				}
			}

			setState(419);
			match(COMMA);
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(420);
				forStep();
				}
				break;
			}
			setState(423);
			match(DO);
			setState(424);
			scopeExpression();
			setState(425);
			match(OD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			scopeExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStepContext extends ParserRuleContext {
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public ForStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterForStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitForStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitForStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStepContext forStep() throws RecognitionException {
		ForStepContext _localctx = new ForStepContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			assignExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExpressionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(LamaParser.FUN, 0); }
		public TerminalNode LPAREN() { return getToken(LamaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LamaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(LamaParser.LBRACE, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LamaParser.RBRACE, 0); }
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lambdaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(FUN);
			setState(432);
			match(LPAREN);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 281372602138627L) != 0)) {
				{
				setState(433);
				patternList();
				}
			}

			setState(436);
			match(RPAREN);
			setState(437);
			match(LBRACE);
			setState(438);
			scopeExpression();
			setState(439);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaListener ) ((LamaListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaVisitor ) return ((LamaVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			expression();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(442);
				match(COMMA);
				setState(443);
				expression();
				}
				}
				setState(448);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 17:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u01c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"U\b\u0001\n\u0001\f\u0001X\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002`\b\u0002\n\u0002\f\u0002"+
		"c\t\u0002\u0001\u0002\u0003\u0002f\b\u0002\u0001\u0003\u0005\u0003i\b"+
		"\u0003\n\u0003\f\u0003l\t\u0003\u0001\u0003\u0003\u0003o\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004t\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005z\b\u0005\n\u0005\f\u0005}\t"+
		"\u0005\u0001\u0005\u0003\u0005\u0080\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0085\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u008b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0092\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u009a\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00a1\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00a6\b\t\n\t\f\t"+
		"\u00a9\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b9\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00bf\b\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00c4\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d1\b\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00d6\b\n\n\n\f\n\u00d9\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u00e0\b\f\n\f\f\f\u00e3\t\f\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00e8\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00ee\b\u000e\n\u000e\f\u000e\u00f1\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0003\u0010\u00f6\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0100"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u010b\b\u0011\n"+
		"\u0011\f\u0011\u010e\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0122\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0131\b\u0016\n\u0016\f\u0016\u0134\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0138\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0140\b\u0017\n\u0017\f\u0017\u0143"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0147\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u014c\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0150\b\u0018\n\u0018\f\u0018\u0153\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0157\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0162\b\u0019\n\u0019\f\u0019\u0165\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0169\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u0178\b\u001b\u000b\u001b"+
		"\f\u001b\u0179\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u0186\b\u001c\n\u001c\f\u001c\u0189\t\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u018e\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u019e\b \u0001 \u0001"+
		" \u0003 \u01a2\b \u0001 \u0001 \u0003 \u01a6\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003#\u01b3\b#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u01bd\b$\n$"+
		"\f$\u01c0\t$\u0001$\u0000\u0002\u0014\"%\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFH\u0000\u0005\u0001\u0000\u001a\u001c\u0001\u0000\u001d\u001f\u0003"+
		"\u0000!-77::\u0002\u0000\u0016\u0017CE\u0001\u0000AB\u01e9\u0000M\u0001"+
		"\u0000\u0000\u0000\u0002V\u0001\u0000\u0000\u0000\u0004[\u0001\u0000\u0000"+
		"\u0000\u0006j\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000\u0000\nu\u0001"+
		"\u0000\u0000\u0000\f\u0081\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000"+
		"\u0000\u0000\u0010\u0093\u0001\u0000\u0000\u0000\u0012\u00a2\u0001\u0000"+
		"\u0000\u0000\u0014\u00d0\u0001\u0000\u0000\u0000\u0016\u00da\u0001\u0000"+
		"\u0000\u0000\u0018\u00dc\u0001\u0000\u0000\u0000\u001a\u00e4\u0001\u0000"+
		"\u0000\u0000\u001c\u00e9\u0001\u0000\u0000\u0000\u001e\u00f2\u0001\u0000"+
		"\u0000\u0000 \u00f5\u0001\u0000\u0000\u0000\"\u00f9\u0001\u0000\u0000"+
		"\u0000$\u0121\u0001\u0000\u0000\u0000&\u0123\u0001\u0000\u0000\u0000("+
		"\u0126\u0001\u0000\u0000\u0000*\u0128\u0001\u0000\u0000\u0000,\u0137\u0001"+
		"\u0000\u0000\u0000.\u0146\u0001\u0000\u0000\u00000\u0156\u0001\u0000\u0000"+
		"\u00002\u0158\u0001\u0000\u0000\u00004\u016c\u0001\u0000\u0000\u00006"+
		"\u0173\u0001\u0000\u0000\u00008\u017d\u0001\u0000\u0000\u0000:\u018d\u0001"+
		"\u0000\u0000\u0000<\u018f\u0001\u0000\u0000\u0000>\u0195\u0001\u0000\u0000"+
		"\u0000@\u019b\u0001\u0000\u0000\u0000B\u01ab\u0001\u0000\u0000\u0000D"+
		"\u01ad\u0001\u0000\u0000\u0000F\u01af\u0001\u0000\u0000\u0000H\u01b9\u0001"+
		"\u0000\u0000\u0000JL\u0003\u0004\u0002\u0000KJ\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0003\u0002"+
		"\u0001\u0000QR\u0005\u0000\u0000\u0001R\u0001\u0001\u0000\u0000\u0000"+
		"SU\u0003\b\u0004\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000YZ\u0003\u0016\u000b\u0000Z\u0003\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u0004\u0000\u0000\\a\u0005B\u0000\u0000]^"+
		"\u00055\u0000\u0000^`\u0005B\u0000\u0000_]\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u00056\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0005\u0001\u0000"+
		"\u0000\u0000gi\u0003\b\u0004\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kn\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0003\u0016\u000b\u0000"+
		"nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0007\u0001\u0000"+
		"\u0000\u0000pt\u0003\n\u0005\u0000qt\u0003\u000e\u0007\u0000rt\u0003\u0010"+
		"\b\u0000sp\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000"+
		"\u0000\u0000t\t\u0001\u0000\u0000\u0000uv\u0005\u0005\u0000\u0000v{\u0003"+
		"\f\u0006\u0000wx\u00055\u0000\u0000xz\u0003\f\u0006\u0000yw\u0001\u0000"+
		"\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u0080\u00056\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u000b\u0001\u0000\u0000\u0000\u0081"+
		"\u0084\u0005B\u0000\u0000\u0082\u0083\u0005\u0001\u0000\u0000\u0083\u0085"+
		"\u0003\u001a\r\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\r\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0006"+
		"\u0000\u0000\u0087\u0088\u0005B\u0000\u0000\u0088\u008a\u0005/\u0000\u0000"+
		"\u0089\u008b\u0003\u0012\t\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u00050\u0000\u0000\u008d\u008e\u00053\u0000\u0000\u008e\u008f\u0003"+
		"\u0006\u0003\u0000\u008f\u0091\u00054\u0000\u0000\u0090\u0092\u00056\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u000f\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0000\u0000"+
		"\u0000\u0094\u0095\u0003\u001e\u000f\u0000\u0095\u0096\u0007\u0001\u0000"+
		"\u0000\u0096\u0097\u0003\u001e\u000f\u0000\u0097\u0099\u0005/\u0000\u0000"+
		"\u0098\u009a\u0003\u0012\t\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u00050\u0000\u0000\u009c\u009d\u00053\u0000\u0000\u009d\u009e\u0003"+
		"\u0006\u0003\u0000\u009e\u00a0\u00054\u0000\u0000\u009f\u00a1\u00056\u0000"+
		"\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a7\u0003\u0014\n\u0000"+
		"\u00a3\u00a4\u00055\u0000\u0000\u00a4\u00a6\u0003\u0014\n\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u0013\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0006\n\uffff\uffff\u0000\u00ab\u00ac\u0005B\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0002\u0000\u0000\u00ad\u00d1\u0003\u0014\n\u0014\u00ae\u00d1"+
		"\u0005;\u0000\u0000\u00af\u00d1\u0005<\u0000\u0000\u00b0\u00d1\u0005="+
		"\u0000\u0000\u00b1\u00d1\u0005>\u0000\u0000\u00b2\u00d1\u0005?\u0000\u0000"+
		"\u00b3\u00d1\u0005@\u0000\u0000\u00b4\u00d1\u0005B\u0000\u0000\u00b5\u00b6"+
		"\u0005A\u0000\u0000\u00b6\u00b8\u0005/\u0000\u0000\u00b7\u00b9\u0003\u0012"+
		"\t\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00d1\u00050\u0000\u0000"+
		"\u00bb\u00d1\u0005A\u0000\u0000\u00bc\u00be\u00051\u0000\u0000\u00bd\u00bf"+
		"\u0003\u0012\t\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00d1\u0005"+
		"2\u0000\u0000\u00c1\u00c3\u00053\u0000\u0000\u00c2\u00c4\u0003\u0012\t"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00d1\u00054\u0000\u0000"+
		"\u00c6\u00d1\u00059\u0000\u0000\u00c7\u00d1\u0005C\u0000\u0000\u00c8\u00d1"+
		"\u0005D\u0000\u0000\u00c9\u00d1\u0005E\u0000\u0000\u00ca\u00d1\u0005\u0016"+
		"\u0000\u0000\u00cb\u00d1\u0005\u0017\u0000\u0000\u00cc\u00cd\u0005/\u0000"+
		"\u0000\u00cd\u00ce\u0003\u0014\n\u0000\u00ce\u00cf\u00050\u0000\u0000"+
		"\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00aa\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ae\u0001\u0000\u0000\u0000\u00d0\u00af\u0001\u0000\u0000\u0000"+
		"\u00d0\u00b0\u0001\u0000\u0000\u0000\u00d0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00d0\u00b2\u0001\u0000\u0000\u0000\u00d0\u00b3\u0001\u0000\u0000\u0000"+
		"\u00d0\u00b4\u0001\u0000\u0000\u0000\u00d0\u00b5\u0001\u0000\u0000\u0000"+
		"\u00d0\u00bb\u0001\u0000\u0000\u0000\u00d0\u00bc\u0001\u0000\u0000\u0000"+
		"\u00d0\u00c1\u0001\u0000\u0000\u0000\u00d0\u00c6\u0001\u0000\u0000\u0000"+
		"\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000\u0000\u0000"+
		"\u00d0\u00c9\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d7\u0001\u0000\u0000\u0000\u00d2\u00d3\n\u0001\u0000\u0000\u00d3"+
		"\u00d4\u00057\u0000\u0000\u00d4\u00d6\u0003\u0014\n\u0001\u00d5\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u0015"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0003\u0018\f\u0000\u00db\u0017\u0001\u0000\u0000\u0000\u00dc\u00e1\u0003"+
		"\u001a\r\u0000\u00dd\u00de\u00056\u0000\u0000\u00de\u00e0\u0003\u001a"+
		"\r\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u0019\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e7\u0003\u001c\u000e\u0000\u00e5\u00e6\u0005 \u0000\u0000"+
		"\u00e6\u00e8\u0003\u001a\r\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u001b\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ef\u0003 \u0010\u0000\u00ea\u00eb\u0003\u001e\u000f\u0000\u00eb\u00ec"+
		"\u0003 \u0010\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u001d\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0007"+
		"\u0002\u0000\u0000\u00f3\u001f\u0001\u0000\u0000\u0000\u00f4\u00f6\u0005"+
		"*\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003\"\u0011"+
		"\u0000\u00f8!\u0001\u0000\u0000\u0000\u00f9\u00fa\u0006\u0011\uffff\uffff"+
		"\u0000\u00fa\u00fb\u0003$\u0012\u0000\u00fb\u010c\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\n\u0004\u0000\u0000\u00fd\u00ff\u0005/\u0000\u0000\u00fe"+
		"\u0100\u0003H$\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u010b\u0005"+
		"0\u0000\u0000\u0102\u0103\n\u0003\u0000\u0000\u0103\u0104\u00051\u0000"+
		"\u0000\u0104\u0105\u0003\u0016\u000b\u0000\u0105\u0106\u00052\u0000\u0000"+
		"\u0106\u010b\u0001\u0000\u0000\u0000\u0107\u0108\n\u0002\u0000\u0000\u0108"+
		"\u0109\u0005.\u0000\u0000\u0109\u010b\u0005B\u0000\u0000\u010a\u00fc\u0001"+
		"\u0000\u0000\u0000\u010a\u0102\u0001\u0000\u0000\u0000\u010a\u0107\u0001"+
		"\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d#\u0001\u0000"+
		"\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0122\u0003(\u0014"+
		"\u0000\u0110\u0122\u00030\u0018\u0000\u0111\u0122\u0003*\u0015\u0000\u0112"+
		"\u0113\u0005/\u0000\u0000\u0113\u0114\u0003\u0006\u0003\u0000\u0114\u0115"+
		"\u00050\u0000\u0000\u0115\u0122\u0001\u0000\u0000\u0000\u0116\u0122\u0003"+
		",\u0016\u0000\u0117\u0122\u0003.\u0017\u0000\u0118\u0122\u00032\u0019"+
		"\u0000\u0119\u0122\u00034\u001a\u0000\u011a\u0122\u00036\u001b\u0000\u011b"+
		"\u0122\u0003:\u001d\u0000\u011c\u0122\u0005\u0015\u0000\u0000\u011d\u0122"+
		"\u0003F#\u0000\u011e\u0122\u0003&\u0013\u0000\u011f\u0120\u0005\u001a"+
		"\u0000\u0000\u0120\u0122\u0005:\u0000\u0000\u0121\u010f\u0001\u0000\u0000"+
		"\u0000\u0121\u0110\u0001\u0000\u0000\u0000\u0121\u0111\u0001\u0000\u0000"+
		"\u0000\u0121\u0112\u0001\u0000\u0000\u0000\u0121\u0116\u0001\u0000\u0000"+
		"\u0000\u0121\u0117\u0001\u0000\u0000\u0000\u0121\u0118\u0001\u0000\u0000"+
		"\u0000\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u011a\u0001\u0000\u0000"+
		"\u0000\u0121\u011b\u0001\u0000\u0000\u0000\u0121\u011c\u0001\u0000\u0000"+
		"\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0121\u011e\u0001\u0000\u0000"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122%\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0005\u0019\u0000\u0000\u0124\u0125\u0003\"\u0011\u0000\u0125"+
		"\'\u0001\u0000\u0000\u0000\u0126\u0127\u0007\u0003\u0000\u0000\u0127)"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0007\u0004\u0000\u0000\u0129+\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u00051\u0000\u0000\u012b\u0138\u00052\u0000"+
		"\u0000\u012c\u012d\u00051\u0000\u0000\u012d\u0132\u0003\u0016\u000b\u0000"+
		"\u012e\u012f\u00055\u0000\u0000\u012f\u0131\u0003\u0016\u000b\u0000\u0130"+
		"\u012e\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\u0135\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u00052\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u012a"+
		"\u0001\u0000\u0000\u0000\u0137\u012c\u0001\u0000\u0000\u0000\u0138-\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u00053\u0000\u0000\u013a\u0147\u00054\u0000"+
		"\u0000\u013b\u013c\u00053\u0000\u0000\u013c\u0141\u0003\u0016\u000b\u0000"+
		"\u013d\u013e\u00055\u0000\u0000\u013e\u0140\u0003\u0016\u000b\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141"+
		"\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142"+
		"\u0144\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u00054\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0139"+
		"\u0001\u0000\u0000\u0000\u0146\u013b\u0001\u0000\u0000\u0000\u0147/\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005A\u0000\u0000\u0149\u014b\u0005/\u0000"+
		"\u0000\u014a\u014c\u0003\u0016\u000b\u0000\u014b\u014a\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u0151\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u00055\u0000\u0000\u014e\u0150\u0003\u0016\u000b\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000"+
		"\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000"+
		"\u0154\u0157\u00050\u0000\u0000\u0155\u0157\u0005A\u0000\u0000\u0156\u0148"+
		"\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u01571\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0005\u0007\u0000\u0000\u0159\u015a\u0003"+
		"\u0016\u000b\u0000\u015a\u015b\u0005\b\u0000\u0000\u015b\u0163\u0003\u0006"+
		"\u0003\u0000\u015c\u015d\u0005\u000b\u0000\u0000\u015d\u015e\u0003\u0016"+
		"\u000b\u0000\u015e\u015f\u0005\b\u0000\u0000\u015f\u0160\u0003\u0006\u0003"+
		"\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015c\u0001\u0000\u0000"+
		"\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0168\u0001\u0000\u0000"+
		"\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0167\u0005\t\u0000\u0000"+
		"\u0167\u0169\u0003\u0006\u0003\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0005\n\u0000\u0000\u016b3\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0005\u000f\u0000\u0000\u016d\u016e\u0003\u0014\n\u0000\u016e\u016f"+
		"\u0005\u0001\u0000\u0000\u016f\u0170\u0003\u0016\u000b\u0000\u0170\u0171"+
		"\u0005\u0010\u0000\u0000\u0171\u0172\u0003\u0016\u000b\u0000\u01725\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0005\f\u0000\u0000\u0174\u0175\u0003\u0016"+
		"\u000b\u0000\u0175\u0177\u0005\r\u0000\u0000\u0176\u0178\u00038\u001c"+
		"\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u000e\u0000"+
		"\u0000\u017c7\u0001\u0000\u0000\u0000\u017d\u017e\u0003\u0014\n\u0000"+
		"\u017e\u017f\u00058\u0000\u0000\u017f\u0187\u0003\u0016\u000b\u0000\u0180"+
		"\u0181\u0005\u0003\u0000\u0000\u0181\u0182\u0003\u0014\n\u0000\u0182\u0183"+
		"\u00058\u0000\u0000\u0183\u0184\u0003\u0016\u000b\u0000\u0184\u0186\u0001"+
		"\u0000\u0000\u0000\u0185\u0180\u0001\u0000\u0000\u0000\u0186\u0189\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001"+
		"\u0000\u0000\u0000\u01889\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u018a\u018e\u0003<\u001e\u0000\u018b\u018e\u0003>\u001f\u0000"+
		"\u018c\u018e\u0003@ \u0000\u018d\u018a\u0001\u0000\u0000\u0000\u018d\u018b"+
		"\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e;\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0005\u0011\u0000\u0000\u0190\u0191\u0003"+
		"\u0018\f\u0000\u0191\u0192\u0005\u0012\u0000\u0000\u0192\u0193\u0003\u0006"+
		"\u0003\u0000\u0193\u0194\u0005\u0013\u0000\u0000\u0194=\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0005\u0012\u0000\u0000\u0196\u0197\u0003\u0006\u0003"+
		"\u0000\u0197\u0198\u0005\u0011\u0000\u0000\u0198\u0199\u0003\u0018\f\u0000"+
		"\u0199\u019a\u0005\u0013\u0000\u0000\u019a?\u0001\u0000\u0000\u0000\u019b"+
		"\u019d\u0005\u0014\u0000\u0000\u019c\u019e\u0003B!\u0000\u019d\u019c\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0001"+
		"\u0000\u0000\u0000\u019f\u01a1\u00055\u0000\u0000\u01a0\u01a2\u0003\u0016"+
		"\u000b\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u00055\u0000"+
		"\u0000\u01a4\u01a6\u0003D\"\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0005\u0012\u0000\u0000\u01a8\u01a9\u0003\u0006\u0003\u0000"+
		"\u01a9\u01aa\u0005\u0013\u0000\u0000\u01aaA\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0003\u0006\u0003\u0000\u01acC\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0003\u001a\r\u0000\u01aeE\u0001\u0000\u0000\u0000\u01af\u01b0\u0005"+
		"\u0006\u0000\u0000\u01b0\u01b2\u0005/\u0000\u0000\u01b1\u01b3\u0003\u0012"+
		"\t\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u00050\u0000\u0000"+
		"\u01b5\u01b6\u00053\u0000\u0000\u01b6\u01b7\u0003\u0006\u0003\u0000\u01b7"+
		"\u01b8\u00054\u0000\u0000\u01b8G\u0001\u0000\u0000\u0000\u01b9\u01be\u0003"+
		"\u0016\u000b\u0000\u01ba\u01bb\u00055\u0000\u0000\u01bb\u01bd\u0003\u0016"+
		"\u000b\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000"+
		"\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000"+
		"\u0000\u0000\u01bfI\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000"+
		"\u0000-MVaejns{\u007f\u0084\u008a\u0091\u0099\u00a0\u00a7\u00b8\u00be"+
		"\u00c3\u00d0\u00d7\u00e1\u00e7\u00ef\u00f5\u00ff\u010a\u010c\u0121\u0132"+
		"\u0137\u0141\u0146\u014b\u0151\u0156\u0163\u0168\u0179\u0187\u018d\u019d"+
		"\u01a1\u01a5\u01b2\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}