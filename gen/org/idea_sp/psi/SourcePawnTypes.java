// This is a generated file. Not intended for manual editing.
package org.idea_sp.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.idea_sp.psi.impl.*;

public interface SourcePawnTypes {

  IElementType ARGDECL = new SourcePawnElementType("ARGDECL");
  IElementType ARG_INIT = new SourcePawnElementType("ARG_INIT");
  IElementType ARG_NEW = new SourcePawnElementType("ARG_NEW");
  IElementType ARG_OLD = new SourcePawnElementType("ARG_OLD");
  IElementType BUILTIN_TYPE = new SourcePawnElementType("BUILTIN_TYPE");
  IElementType GLOBAL = new SourcePawnElementType("GLOBAL");
  IElementType GLOBAL_ASSN = new SourcePawnElementType("GLOBAL_ASSN");
  IElementType GLOBAL_NEW = new SourcePawnElementType("GLOBAL_NEW");
  IElementType GLOBAL_OLD = new SourcePawnElementType("GLOBAL_OLD");
  IElementType LABEL = new SourcePawnElementType("LABEL");
  IElementType LITERAL = new SourcePawnElementType("LITERAL");
  IElementType NEW_DIMS = new SourcePawnElementType("NEW_DIMS");
  IElementType NUMBER = new SourcePawnElementType("NUMBER");
  IElementType OLD_DIMS = new SourcePawnElementType("OLD_DIMS");
  IElementType RETURN_NEW = new SourcePawnElementType("RETURN_NEW");
  IElementType RETURN_OLD = new SourcePawnElementType("RETURN_OLD");
  IElementType RETURN_TYPE = new SourcePawnElementType("RETURN_TYPE");
  IElementType STORAGE_CLASS = new SourcePawnElementType("STORAGE_CLASS");
  IElementType TAG = new SourcePawnElementType("TAG");
  IElementType TAGS = new SourcePawnElementType("TAGS");
  IElementType TAG_VECTOR = new SourcePawnElementType("TAG_VECTOR");
  IElementType TYPE_EXPR = new SourcePawnElementType("TYPE_EXPR");
  IElementType VARDECL = new SourcePawnElementType("VARDECL");
  IElementType VAR_NEW = new SourcePawnElementType("VAR_NEW");
  IElementType VAR_NEW_PREFIX = new SourcePawnElementType("VAR_NEW_PREFIX");
  IElementType VAR_OLD = new SourcePawnElementType("VAR_OLD");
  IElementType VAR_OLD_PREFIX = new SourcePawnElementType("VAR_OLD_PREFIX");

  IElementType AND = new SourcePawnTokenType("&");
  IElementType ANDAND = new SourcePawnTokenType("&&");
  IElementType ANDEQ = new SourcePawnTokenType("&=");
  IElementType ASSERT_KEYWORD = new SourcePawnTokenType("assert");
  IElementType ASTERISK = new SourcePawnTokenType("*");
  IElementType ASTERISKEQ = new SourcePawnTokenType("*=");
  IElementType BINARY_LITERAL = new SourcePawnTokenType("binary_literal");
  IElementType BLOCK_COMMENT = new SourcePawnTokenType("block_comment");
  IElementType BREAK_KEYWORD = new SourcePawnTokenType("break");
  IElementType CASE_KEYWORD = new SourcePawnTokenType("case");
  IElementType CHARACTER_LITERAL = new SourcePawnTokenType("character_literal");
  IElementType COLON = new SourcePawnTokenType(":");
  IElementType COMMA = new SourcePawnTokenType(",");
  IElementType CONST_KEYWORD = new SourcePawnTokenType("const");
  IElementType CONTINUE_KEYWORD = new SourcePawnTokenType("continue");
  IElementType DECL_KEYWORD = new SourcePawnTokenType("decl");
  IElementType DEFAULT_KEYWORD = new SourcePawnTokenType("default");
  IElementType DEFINED_KEYWORD = new SourcePawnTokenType("defined");
  IElementType DIV = new SourcePawnTokenType("/");
  IElementType DIVEQ = new SourcePawnTokenType("/=");
  IElementType DOT = new SourcePawnTokenType(".");
  IElementType DO_KEYWORD = new SourcePawnTokenType("do");
  IElementType ELLIPSIS = new SourcePawnTokenType("...");
  IElementType ELSE_KEYWORD = new SourcePawnTokenType("else");
  IElementType ENUM_KEYWORD = new SourcePawnTokenType("enum");
  IElementType EQ = new SourcePawnTokenType("=");
  IElementType EQEQ = new SourcePawnTokenType("==");
  IElementType EXCL = new SourcePawnTokenType("!");
  IElementType EXIT_KEYWORD = new SourcePawnTokenType("exit");
  IElementType EXPR = new SourcePawnTokenType("expr");
  IElementType FLOAT_LITERAL = new SourcePawnTokenType("float_literal");
  IElementType FORWARD_KEYWORD = new SourcePawnTokenType("forward");
  IElementType FOR_KEYWORD = new SourcePawnTokenType("for");
  IElementType GOTO_KEYWORD = new SourcePawnTokenType("goto");
  IElementType GT = new SourcePawnTokenType(">");
  IElementType GTGTEQ = new SourcePawnTokenType(">>=");
  IElementType HEX_LITERAL = new SourcePawnTokenType("hex_literal");
  IElementType IF_KEYWORD = new SourcePawnTokenType("if");
  IElementType INTEGER_LITERAL = new SourcePawnTokenType("integer_literal");
  IElementType LBRACE = new SourcePawnTokenType("{");
  IElementType LBRACKET = new SourcePawnTokenType("[");
  IElementType LE = new SourcePawnTokenType("<=");
  IElementType LINE_COMMENT = new SourcePawnTokenType("line_comment");
  IElementType LPAREN = new SourcePawnTokenType("(");
  IElementType LT = new SourcePawnTokenType("<");
  IElementType LTLT = new SourcePawnTokenType("<<");
  IElementType LTLTEQ = new SourcePawnTokenType("<<=");
  IElementType MINUS = new SourcePawnTokenType("-");
  IElementType MINUSEQ = new SourcePawnTokenType("-=");
  IElementType MINUSMINUS = new SourcePawnTokenType("--");
  IElementType NATIVE_KEYWORD = new SourcePawnTokenType("native");
  IElementType NE = new SourcePawnTokenType("!=");
  IElementType NEW_KEYWORD = new SourcePawnTokenType("new");
  IElementType OPERATOR_KEYWORD = new SourcePawnTokenType("operator");
  IElementType OR = new SourcePawnTokenType("|");
  IElementType OREQ = new SourcePawnTokenType("|=");
  IElementType OROR = new SourcePawnTokenType("||");
  IElementType PERC = new SourcePawnTokenType("%");
  IElementType PERCEQ = new SourcePawnTokenType("%=");
  IElementType PLUS = new SourcePawnTokenType("+");
  IElementType PLUSEQ = new SourcePawnTokenType("+=");
  IElementType PLUSPLUS = new SourcePawnTokenType("++");
  IElementType PREPROCESSOR_COMMENT = new SourcePawnTokenType("preprocessor_comment");
  IElementType PUBLIC_KEYWORD = new SourcePawnTokenType("public");
  IElementType QUEST = new SourcePawnTokenType("?");
  IElementType RBRACE = new SourcePawnTokenType("}");
  IElementType RBRACKET = new SourcePawnTokenType("]");
  IElementType RETURN_KEYWORD = new SourcePawnTokenType("return");
  IElementType RPAREN = new SourcePawnTokenType(")");
  IElementType SEMICOLON = new SourcePawnTokenType(";");
  IElementType SIZEOF_KEYWORD = new SourcePawnTokenType("sizeof");
  IElementType SLEEP_KEYWORD = new SourcePawnTokenType("sleep");
  IElementType STATE_KEYWORD = new SourcePawnTokenType("state");
  IElementType STATIC_KEYWORD = new SourcePawnTokenType("static");
  IElementType STOCK_KEYWORD = new SourcePawnTokenType("stock");
  IElementType STRING_LITERAL = new SourcePawnTokenType("string_literal");
  IElementType STRUCT_KEYWORD = new SourcePawnTokenType("struct");
  IElementType SWITCH_KEYWORD = new SourcePawnTokenType("switch");
  IElementType SYMBOL = new SourcePawnTokenType("symbol");
  IElementType TAGOF_KEYWORD = new SourcePawnTokenType("tagof");
  IElementType TILDE = new SourcePawnTokenType("~");
  IElementType WHILE_KEYWORD = new SourcePawnTokenType("while");
  IElementType XOR = new SourcePawnTokenType("^");
  IElementType XOREQ = new SourcePawnTokenType("^=");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARGDECL) {
        return new SourcePawnArgdeclImpl(node);
      }
      else if (type == ARG_INIT) {
        return new SourcePawnArgInitImpl(node);
      }
      else if (type == ARG_NEW) {
        return new SourcePawnArgNewImpl(node);
      }
      else if (type == ARG_OLD) {
        return new SourcePawnArgOldImpl(node);
      }
      else if (type == BUILTIN_TYPE) {
        return new SourcePawnBuiltinTypeImpl(node);
      }
      else if (type == GLOBAL) {
        return new SourcePawnGlobalImpl(node);
      }
      else if (type == GLOBAL_ASSN) {
        return new SourcePawnGlobalAssnImpl(node);
      }
      else if (type == GLOBAL_NEW) {
        return new SourcePawnGlobalNewImpl(node);
      }
      else if (type == GLOBAL_OLD) {
        return new SourcePawnGlobalOldImpl(node);
      }
      else if (type == LABEL) {
        return new SourcePawnLabelImpl(node);
      }
      else if (type == LITERAL) {
        return new SourcePawnLiteralImpl(node);
      }
      else if (type == NEW_DIMS) {
        return new SourcePawnNewDimsImpl(node);
      }
      else if (type == NUMBER) {
        return new SourcePawnNumberImpl(node);
      }
      else if (type == OLD_DIMS) {
        return new SourcePawnOldDimsImpl(node);
      }
      else if (type == RETURN_NEW) {
        return new SourcePawnReturnNewImpl(node);
      }
      else if (type == RETURN_OLD) {
        return new SourcePawnReturnOldImpl(node);
      }
      else if (type == RETURN_TYPE) {
        return new SourcePawnReturnTypeImpl(node);
      }
      else if (type == STORAGE_CLASS) {
        return new SourcePawnStorageClassImpl(node);
      }
      else if (type == TAG) {
        return new SourcePawnTagImpl(node);
      }
      else if (type == TAGS) {
        return new SourcePawnTagsImpl(node);
      }
      else if (type == TAG_VECTOR) {
        return new SourcePawnTagVectorImpl(node);
      }
      else if (type == TYPE_EXPR) {
        return new SourcePawnTypeExprImpl(node);
      }
      else if (type == VARDECL) {
        return new SourcePawnVardeclImpl(node);
      }
      else if (type == VAR_NEW) {
        return new SourcePawnVarNewImpl(node);
      }
      else if (type == VAR_NEW_PREFIX) {
        return new SourcePawnVarNewPrefixImpl(node);
      }
      else if (type == VAR_OLD) {
        return new SourcePawnVarOldImpl(node);
      }
      else if (type == VAR_OLD_PREFIX) {
        return new SourcePawnVarOldPrefixImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
