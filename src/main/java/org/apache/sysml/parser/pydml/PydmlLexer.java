// Generated from org/apache/sysml/parser/pydml/Pydml.g4 by ANTLR 4.5.3
package org.apache.sysml.parser.pydml;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PydmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, ID=40, INT=41, DOUBLE=42, DIGIT=43, ALPHABET=44, COMMANDLINE_NAMED_ID=45, 
		COMMANDLINE_POSITION_ID=46, STRING=47, OPEN_BRACK=48, CLOSE_BRACK=49, 
		OPEN_PAREN=50, CLOSE_PAREN=51, NEWLINE=52, SKIP_WS=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "ID", "INT", "DOUBLE", 
		"DIGIT", "ALPHABET", "EXP", "COMMANDLINE_NAMED_ID", "COMMANDLINE_POSITION_ID", 
		"STRING", "ESC", "OPEN_BRACK", "CLOSE_BRACK", "OPEN_PAREN", "CLOSE_PAREN", 
		"SPACES", "COMMENT", "LINE_JOINING", "NEWLINE", "SKIP_WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'source'", "'as'", "'setwd'", "'='", "'ifdef'", "','", "'if'", 
		"':'", "'else'", "'for'", "'in'", "'parfor'", "'while'", "'elif'", "'def'", 
		"'->'", "'defExternal'", "'implemented'", "'**'", "'-'", "'+'", "'//'", 
		"'%'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'!'", 
		"'&'", "'and'", "'|'", "'or'", "';'", "'True'", "'False'", null, null, 
		null, null, null, null, null, null, "'['", "']'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "INT", "DOUBLE", "DIGIT", "ALPHABET", "COMMANDLINE_NAMED_ID", 
		"COMMANDLINE_POSITION_ID", "STRING", "OPEN_BRACK", "CLOSE_BRACK", "OPEN_PAREN", 
		"CLOSE_PAREN", "NEWLINE", "SKIP_WS"
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


	    private boolean debugIndentRules = false;

	    // Indentation level stack
	    private java.util.Stack<Integer> indents = new java.util.Stack<Integer>();

	    // Extra tokens queue (see the NEWLINE rule).
	    private java.util.Queue<Token> tokens = new java.util.LinkedList<Token>();

	    // Number of opened braces, brackets and parenthesis.
	    private int opened = 0;

	    // This is only used to set the line number for dedent
	    private Token lastToken = null;


	    @Override
	    public void emit(Token t) {
	        if(debugIndentRules)
	            System.out.println("Emitted token:" + t);

	        super.setToken(t);
	        tokens.offer(t);
	    }


	    @Override
	    public Token nextToken() {
	        if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	            if(debugIndentRules)
	                System.out.println("EOF reached and expecting some DEDENTS, so emitting them");

	            tokens.poll();
	            this.emit(commonToken(PydmlParser.NEWLINE, "\n"));

	            // Now emit as much DEDENT tokens as needed.
	            while (!indents.isEmpty()) {
	                if(debugIndentRules)
	                    System.out.println("Emitting (inserted) DEDENTS");

	                this.emit(createDedent());
	                indents.pop();
	            }
	            // Put the EOF back on the token stream.
	            this.emit(commonToken(PydmlParser.EOF, "<EOF>"));
	        }
	        Token next = super.nextToken();
	        if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	            // Keep track of the last token on the default channel.
	            this.lastToken = next;
	        }
	        Token retVal = tokens.isEmpty() ? next : tokens.poll();

	        if(debugIndentRules)
	            System.out.println("Returning nextToken: [" + retVal + "]<<" + tokens.isEmpty());

	        return retVal;
	    }

	    private Token createDedent() {
	        CommonToken dedent = commonToken(PydmlParser.DEDENT, "");
	        dedent.setLine(this.lastToken.getLine());
	        return dedent;
	    }

	    private CommonToken commonToken(int type, String text) {
	        // Nike: Main change: This logic was screwed up and was emitting additional 3 characters, so commenting it for now.
	        // int start = this.getCharIndex();
	        // int stop = start + text.length();
	        // return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	        return new CommonToken(type, text); // Main change
	    }

	    // Calculates the indentation level from the spaces:
	    // "Tabs are replaced (from left to right) by one to eight spaces
	    // such that the total number of characters up to and including
	    // the replacement is a multiple of eight [...]"
	    // https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
	    static int getIndentationCount(String spaces) {
	        int count = 0;
	        for (char ch : spaces.toCharArray()) {
	            switch (ch) {
	                case '\t':
	                    count += 8 - (count % 8);
	                    break;
	                default:
	                    // A normal space char.
	                    count++;
	            }
	        }
	        return count;
	    }


	public PydmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pydml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 49:
			OPEN_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			CLOSE_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			OPEN_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			CLOSE_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void OPEN_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			opened++;
			break;
		}
	}
	private void CLOSE_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			opened--;
			break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			opened++;
			break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			opened--;
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			    String newLine = getText().replaceAll("[^\r\n]+", "");
			    String spaces = getText().replaceAll("[\r\n]+", "");
			    int next = _input.LA(1);
			    if (opened > 0 || next == '\r' || next == '\n' || next == '#') {
			        // If we're inside a list or on a blank line, ignore all indents,
			        // dedents and line breaks.
			        skip();
			        if(debugIndentRules) {
			            if(next == '\r' || next == '\n') {
			                    System.out.println("4.1 Skipping (blank lines)");
			            }
			            else if(next == '#') {
			                System.out.println("4.2 Skipping (comment)");
			            }
			            else {
			                System.out.println("4.2 Skipping something else");
			            }
			        }
			    }
			    else {
			        emit(commonToken(NEWLINE, newLine));

			        int indent = getIndentationCount(spaces);
			        int previous = indents.isEmpty() ? 0 : indents.peek();
			        if (indent == previous) {
			            if(debugIndentRules)
			                System.out.println("3. Skipping identation as of same size:" + next);

			            // skip indents of the same size as the present indent-size
			            skip();
			        }
			        else if (indent > previous) {
			            if(debugIndentRules)
			                System.out.println("1. Indent:" + next);

			            indents.push(indent);
			            emit(commonToken(PydmlParser.INDENT, spaces));
			        }
			        else {
			            // Possibly emit more than 1 DEDENT token.
			            while(!indents.isEmpty() && indents.peek() > indent) {
			                if(debugIndentRules)
			                    System.out.println("2. Dedent:" + next);

			                this.emit(createDedent());
			                indents.pop();
			            }
			        }
			    }

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u01cb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u0112\n)\f)\16)\u0115\13)\3)\3)\5)\u0119"+
		"\n)\3)\3)\3)\3)\7)\u011f\n)\f)\16)\u0122\13)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\5)\u0130\n)\3*\6*\u0133\n*\r*\16*\u0134\3*\5*\u0138\n*\3+\6"+
		"+\u013b\n+\r+\16+\u013c\3+\3+\7+\u0141\n+\f+\16+\u0144\13+\3+\5+\u0147"+
		"\n+\3+\5+\u014a\n+\3+\6+\u014d\n+\r+\16+\u014e\3+\5+\u0152\n+\3+\5+\u0155"+
		"\n+\3+\3+\6+\u0159\n+\r+\16+\u015a\3+\5+\u015e\n+\3+\5+\u0161\n+\5+\u0163"+
		"\n+\3,\3,\3-\3-\3.\3.\5.\u016b\n.\3.\3.\3/\3/\3/\3/\3/\7/\u0174\n/\f/"+
		"\16/\u0177\13/\3\60\3\60\6\60\u017b\n\60\r\60\16\60\u017c\3\61\3\61\3"+
		"\61\7\61\u0182\n\61\f\61\16\61\u0185\13\61\3\61\3\61\3\61\3\61\7\61\u018b"+
		"\n\61\f\61\16\61\u018e\13\61\3\61\5\61\u0191\n\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\6\67\u01a3"+
		"\n\67\r\67\16\67\u01a4\38\38\78\u01a9\n8\f8\168\u01ac\138\39\39\59\u01b0"+
		"\n9\39\59\u01b3\n9\39\39\59\u01b7\n9\3:\5:\u01ba\n:\3:\3:\5:\u01be\n:"+
		"\3:\5:\u01c1\n:\3:\3:\3;\3;\3;\5;\u01c8\n;\3;\3;\4\u0183\u018c\2<\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]/_\60a\61c\2e\62g\63i\64k\65m\2o\2q\2"+
		"s\66u\67\3\2\13\4\2NNnn\4\2C\\c|\4\2GGgg\4\2--//\4\2$$^^\4\2))^^\n\2$"+
		"$))^^ddhhppttvv\4\2\13\13\"\"\4\2\f\f\17\17\u01ef\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3"+
		"\2\2\2\2k\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5~\3\2\2\2\7\u0081"+
		"\3\2\2\2\t\u0087\3\2\2\2\13\u0089\3\2\2\2\r\u008f\3\2\2\2\17\u0091\3\2"+
		"\2\2\21\u0094\3\2\2\2\23\u0096\3\2\2\2\25\u009b\3\2\2\2\27\u009f\3\2\2"+
		"\2\31\u00a2\3\2\2\2\33\u00a9\3\2\2\2\35\u00af\3\2\2\2\37\u00b4\3\2\2\2"+
		"!\u00b8\3\2\2\2#\u00bb\3\2\2\2%\u00c7\3\2\2\2\'\u00d3\3\2\2\2)\u00d6\3"+
		"\2\2\2+\u00d8\3\2\2\2-\u00da\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63"+
		"\u00e1\3\2\2\2\65\u00e3\3\2\2\2\67\u00e5\3\2\2\29\u00e8\3\2\2\2;\u00ea"+
		"\3\2\2\2=\u00ed\3\2\2\2?\u00f0\3\2\2\2A\u00f3\3\2\2\2C\u00f5\3\2\2\2E"+
		"\u00f7\3\2\2\2G\u00fb\3\2\2\2I\u00fd\3\2\2\2K\u0100\3\2\2\2M\u0102\3\2"+
		"\2\2O\u0107\3\2\2\2Q\u012f\3\2\2\2S\u0132\3\2\2\2U\u0162\3\2\2\2W\u0164"+
		"\3\2\2\2Y\u0166\3\2\2\2[\u0168\3\2\2\2]\u016e\3\2\2\2_\u0178\3\2\2\2a"+
		"\u0190\3\2\2\2c\u0192\3\2\2\2e\u0195\3\2\2\2g\u0198\3\2\2\2i\u019b\3\2"+
		"\2\2k\u019e\3\2\2\2m\u01a2\3\2\2\2o\u01a6\3\2\2\2q\u01ad\3\2\2\2s\u01bd"+
		"\3\2\2\2u\u01c7\3\2\2\2wx\7u\2\2xy\7q\2\2yz\7w\2\2z{\7t\2\2{|\7e\2\2|"+
		"}\7g\2\2}\4\3\2\2\2~\177\7c\2\2\177\u0080\7u\2\2\u0080\6\3\2\2\2\u0081"+
		"\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083\u0084\7v\2\2\u0084\u0085\7y\2\2"+
		"\u0085\u0086\7f\2\2\u0086\b\3\2\2\2\u0087\u0088\7?\2\2\u0088\n\3\2\2\2"+
		"\u0089\u008a\7k\2\2\u008a\u008b\7h\2\2\u008b\u008c\7f\2\2\u008c\u008d"+
		"\7g\2\2\u008d\u008e\7h\2\2\u008e\f\3\2\2\2\u008f\u0090\7.\2\2\u0090\16"+
		"\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7h\2\2\u0093\20\3\2\2\2\u0094"+
		"\u0095\7<\2\2\u0095\22\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\24\3\2\2\2\u009b\u009c\7h\2\2\u009c"+
		"\u009d\7q\2\2\u009d\u009e\7t\2\2\u009e\26\3\2\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7t\2\2"+
		"\u00a8\32\3\2\2\2\u00a9\u00aa\7y\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7"+
		"k\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7g\2\2\u00ae\34\3\2\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3"+
		"\36\3\2\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7h\2\2\u00b7"+
		" \3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\7@\2\2\u00ba\"\3\2\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7G\2\2"+
		"\u00bf\u00c0\7z\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3"+
		"\7t\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"$\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca\7r\2\2\u00ca"+
		"\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7o\2\2\u00cd\u00ce\7g\2\2"+
		"\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2"+
		"\7f\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4\u00d5\7,\2\2\u00d5(\3"+
		"\2\2\2\u00d6\u00d7\7/\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9,\3\2"+
		"\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\7\61\2\2\u00dc.\3\2\2\2\u00dd\u00de"+
		"\7\'\2\2\u00de\60\3\2\2\2\u00df\u00e0\7,\2\2\u00e0\62\3\2\2\2\u00e1\u00e2"+
		"\7\61\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4\66\3\2\2\2\u00e5\u00e6"+
		"\7@\2\2\u00e6\u00e7\7?\2\2\u00e78\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9:\3"+
		"\2\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec\7?\2\2\u00ec<\3\2\2\2\u00ed\u00ee"+
		"\7?\2\2\u00ee\u00ef\7?\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7#\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7"+
		"(\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa"+
		"\7f\2\2\u00faF\3\2\2\2\u00fb\u00fc\7~\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7"+
		"q\2\2\u00fe\u00ff\7t\2\2\u00ffJ\3\2\2\2\u0100\u0101\7=\2\2\u0101L\3\2"+
		"\2\2\u0102\u0103\7V\2\2\u0103\u0104\7t\2\2\u0104\u0105\7w\2\2\u0105\u0106"+
		"\7g\2\2\u0106N\3\2\2\2\u0107\u0108\7H\2\2\u0108\u0109\7c\2\2\u0109\u010a"+
		"\7n\2\2\u010a\u010b\7u\2\2\u010b\u010c\7g\2\2\u010cP\3\2\2\2\u010d\u0113"+
		"\5Y-\2\u010e\u0112\5Y-\2\u010f\u0112\5W,\2\u0110\u0112\7a\2\2\u0111\u010e"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\7\60\2\2\u0117\u0119\3\2\2\2\u0118\u010d\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0120\5Y-\2\u011b\u011f\5Y-\2"+
		"\u011c\u011f\5W,\2\u011d\u011f\7a\2\2\u011e\u011b\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0130\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7k"+
		"\2\2\u0124\u0125\7p\2\2\u0125\u0126\7f\2\2\u0126\u0127\7g\2\2\u0127\u0128"+
		"\7z\2\2\u0128\u0129\7\60\2\2\u0129\u012a\7t\2\2\u012a\u012b\7g\2\2\u012b"+
		"\u012c\7v\2\2\u012c\u012d\7w\2\2\u012d\u012e\7t\2\2\u012e\u0130\7p\2\2"+
		"\u012f\u0118\3\2\2\2\u012f\u0123\3\2\2\2\u0130R\3\2\2\2\u0131\u0133\5"+
		"W,\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0138\t\2\2\2\u0137\u0136\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138T\3\2\2\2\u0139\u013b\5W,\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0142\7\60\2\2\u013f\u0141\5W,\2\u0140\u013f\3\2"+
		"\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\5[.\2\u0146\u0145\3\2\2"+
		"\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a\t\2\2\2\u0149\u0148"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0163\3\2\2\2\u014b\u014d\5W,\2\u014c"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0151\3\2\2\2\u0150\u0152\5[.\2\u0151\u0150\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0155\t\2\2\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0163\3\2\2\2\u0156\u0158\7\60\2\2\u0157\u0159\5"+
		"W,\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015e\5[.\2\u015d\u015c\3\2\2"+
		"\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0161\t\2\2\2\u0160\u015f"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u013a\3\2\2\2\u0162"+
		"\u014c\3\2\2\2\u0162\u0156\3\2\2\2\u0163V\3\2\2\2\u0164\u0165\4\62;\2"+
		"\u0165X\3\2\2\2\u0166\u0167\t\3\2\2\u0167Z\3\2\2\2\u0168\u016a\t\4\2\2"+
		"\u0169\u016b\t\5\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016d\5S*\2\u016d\\\3\2\2\2\u016e\u016f\7&\2\2\u016f\u0175"+
		"\5Y-\2\u0170\u0174\5Y-\2\u0171\u0174\5W,\2\u0172\u0174\7a\2\2\u0173\u0170"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176^\3\2\2\2\u0177\u0175\3\2\2\2"+
		"\u0178\u017a\7&\2\2\u0179\u017b\5W,\2\u017a\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d`\3\2\2\2\u017e"+
		"\u0183\7$\2\2\u017f\u0182\5c\62\2\u0180\u0182\n\6\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0184\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0191\7$"+
		"\2\2\u0187\u018c\7)\2\2\u0188\u018b\5c\62\2\u0189\u018b\n\7\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f"+
		"\u0191\7)\2\2\u0190\u017e\3\2\2\2\u0190\u0187\3\2\2\2\u0191b\3\2\2\2\u0192"+
		"\u0193\7^\2\2\u0193\u0194\t\b\2\2\u0194d\3\2\2\2\u0195\u0196\7]\2\2\u0196"+
		"\u0197\b\63\2\2\u0197f\3\2\2\2\u0198\u0199\7_\2\2\u0199\u019a\b\64\3\2"+
		"\u019ah\3\2\2\2\u019b\u019c\7*\2\2\u019c\u019d\b\65\4\2\u019dj\3\2\2\2"+
		"\u019e\u019f\7+\2\2\u019f\u01a0\b\66\5\2\u01a0l\3\2\2\2\u01a1\u01a3\t"+
		"\t\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5n\3\2\2\2\u01a6\u01aa\7%\2\2\u01a7\u01a9\n\n\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01abp\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\7^\2\2\u01ae\u01b0"+
		"\5m\67\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b6\3\2\2\2\u01b1"+
		"\u01b3\7\17\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3"+
		"\2\2\2\u01b4\u01b7\7\f\2\2\u01b5\u01b7\7\17\2\2\u01b6\u01b2\3\2\2\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7r\3\2\2\2\u01b8\u01ba\7\17\2\2\u01b9\u01b8\3\2\2\2"+
		"\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\7\f\2\2\u01bc\u01be"+
		"\7\17\2\2\u01bd\u01b9\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c0\3\2\2\2"+
		"\u01bf\u01c1\5m\67\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c3\b:\6\2\u01c3t\3\2\2\2\u01c4\u01c8\5m\67\2\u01c5\u01c8"+
		"\5o8\2\u01c6\u01c8\5q9\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\b;\7\2\u01cav\3\2\2\2("+
		"\2\u0111\u0113\u0118\u011e\u0120\u012f\u0134\u0137\u013c\u0142\u0146\u0149"+
		"\u014e\u0151\u0154\u015a\u015d\u0160\u0162\u016a\u0173\u0175\u017c\u0181"+
		"\u0183\u018a\u018c\u0190\u01a4\u01aa\u01af\u01b2\u01b6\u01b9\u01bd\u01c0"+
		"\u01c7\b\3\63\2\3\64\3\3\65\4\3\66\5\3:\6\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}