package org.idea_sp;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.idea_sp.psi.SourcePawnTypes.*;

%%

%public
%class _SourcePawnLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode
%line
%column

%{
  public _SourcePawnLexer() {
    this((java.io.Reader)null);
  }

  int yyline;
  int yycolumn;
  int commentStart;
%}

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

SPACE=[\ \n\r\t\f]
LINE_COMMENT="//"[^\r\n]*
BLOCK_COMMENT=[\s\S]
BLOCK_COMMENT_START="/*"
BLOCK_COMMENT_END="*/"
PREPROCESSOR_COMMENT=#(assert|define|else|elseif|endif|endinput|error|file|if|include|line|pragma|section|tryinclude|undef)[^\r\n]*
INTEGER_LITERAL=[-+]?[0-9][_\d]*
FLOAT_LITERAL=[-+]?[0-9][_\d]*\.[0-9][_\d]*(e[-+]?[0-9]+)?
HEX_LITERAL=[-+]?0x[a-fA-F0-9_]+
BINARY_LITERAL=[-+]?0b[01_]+
STRING_LITERAL=\"(\\.|[^\"])*\"
CHARACTER_LITERAL='(\\.|[^\"])'
SYMBOL=([@_a-zA-Z][@_a-zA-Z0-9]+|[a-zA-Z][@_a-zA-Z0-9]*)

%state COMMENT

%%
<COMMENT> {
  {BLOCK_COMMENT_END}         { yybegin(YYINITIAL);
                                zzStartRead = commentStart;
                                return BLOCK_COMMENT; }
  [\s\S\n]                    { }
}

<YYINITIAL> {
  {BLOCK_COMMENT_START}       { commentStart = zzStartRead;
                                yybegin(COMMENT); }

  // TODO: separate newlines into separate token. some parsing requires knowledge of newlines (e.g. struct decls).
  {WHITE_SPACE}               { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "="                         { return EQ; }
  "!"                         { return EXCL; }
  "~"                         { return TILDE; }
  "?"                         { return QUEST; }
  ":"                         { return COLON; }
  "+"                         { return PLUS; }
  "-"                         { return MINUS; }
  "*"                         { return ASTERISK; }
  "/"                         { return DIV; }
  "|"                         { return OR; }
  "^"                         { return XOR; }
  "%"                         { return PERC; }
  "("                         { return LPAREN; }
  ")"                         { return RPAREN; }
  "{"                         { return LBRACE; }
  "}"                         { return RBRACE; }
  "["                         { return LBRACKET; }
  "]"                         { return RBRACKET; }
  ";"                         { return SEMICOLON; }
  ","                         { return COMMA; }
  "..."                       { return ELLIPSIS; }
  "."                         { return DOT; }
  "=="                        { return EQEQ; }
  "!="                        { return NE; }
  "||"                        { return OROR; }
  "++"                        { return PLUSPLUS; }
  "--"                        { return MINUSMINUS; }
  "<"                         { return LT; }
  "<="                        { return LE; }
  "<<"                        { return LTLT; }
  ">"                         { return GT; }
  "&"                         { return AND; }
  "&&"                        { return ANDAND; }
  "+="                        { return PLUSEQ; }
  "-="                        { return MINUSEQ; }
  "*="                        { return ASTERISKEQ; }
  "/="                        { return DIVEQ; }
  "&="                        { return ANDEQ; }
  "|="                        { return OREQ; }
  "^="                        { return XOREQ; }
  "%="                        { return PERCEQ; }
  "<<="                       { return LTLTEQ; }
  ">>="                       { return GTGTEQ; }
  "assert"                    { return ASSERT_KEYWORD; }
  "break"                     { return BREAK_KEYWORD; }
  "case"                      { return CASE_KEYWORD; }
  "continue"                  { return CONTINUE_KEYWORD; }
  "default"                   { return DEFAULT_KEYWORD; }
  "do"                        { return DO_KEYWORD; }
  "else"                      { return ELSE_KEYWORD; }
  "exit"                      { return EXIT_KEYWORD; }
  "for"                       { return FOR_KEYWORD; }
  "goto"                      { return GOTO_KEYWORD; }
  "if"                        { return IF_KEYWORD; }
  "return"                    { return RETURN_KEYWORD; }
  "sleep"                     { return SLEEP_KEYWORD; }
  "state"                     { return STATE_KEYWORD; }
  "switch"                    { return SWITCH_KEYWORD; }
  "while"                     { return WHILE_KEYWORD; }
  "using"                     { return USING_KEYWORD; }
  "defined"                   { return DEFINED_KEYWORD; }
  "sizeof"                    { return SIZEOF_KEYWORD; }
  "tagof"                     { return TAGOF_KEYWORD; }
  "const"                     { return CONST_KEYWORD; }
  "forward"                   { return FORWARD_KEYWORD; }
  "native"                    { return NATIVE_KEYWORD; }
  "new"                       { return NEW_KEYWORD; }
  "operator"                  { return OPERATOR_KEYWORD; }
  "public"                    { return PUBLIC_KEYWORD; }
  "static"                    { return STATIC_KEYWORD; }
  "stock"                     { return STOCK_KEYWORD; }
  "decl"                      { return DECL_KEYWORD; }
  "enum"                      { return ENUM_KEYWORD; }
  "struct"                    { return STRUCT_KEYWORD; }
  "methodmap"                 { return METHODMAP_KEYWORD; }
  "property"                  { return PROPERTY_KEYWORD; }
  "view_as"                   { return VIEW_AS_KEYWORD; }
  "void"                      { return VOID_TYPE; }
  "int"                       { return INT_TYPE; }
  "float"                     { return FLOAT_TYPE; }
  "char"                      { return CHAR_TYPE; }
  "bool"                      { return BOOL_TYPE; }
  "expr"                      { return EXPR; }

  {SPACE}                     { return SPACE; }
  {LINE_COMMENT}              { return LINE_COMMENT; }
  {PREPROCESSOR_COMMENT}      { return PREPROCESSOR_COMMENT; }
  {INTEGER_LITERAL}           { return INTEGER_LITERAL; }
  {FLOAT_LITERAL}             { return FLOAT_LITERAL; }
  {HEX_LITERAL}               { return HEX_LITERAL; }
  {BINARY_LITERAL}            { return BINARY_LITERAL; }
  {STRING_LITERAL}            { return STRING_LITERAL; }
  {CHARACTER_LITERAL}         { return CHARACTER_LITERAL; }
  {SYMBOL}                    { return SYMBOL; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
