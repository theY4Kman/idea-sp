// This is a generated file. Not intended for manual editing.
package org.idea_sp.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.idea_sp.psi.impl.*;

public interface SourcePawnTypes {

  IElementType ANY_ASSIGN_OP = new SourcePawnElementType("ANY_ASSIGN_OP");
  IElementType ARGDEF = new SourcePawnElementType("ARGDEF");
  IElementType ARGDEF_DEFAULT = new SourcePawnElementType("ARGDEF_DEFAULT");
  IElementType ARRAY_DIMS = new SourcePawnElementType("ARRAY_DIMS");
  IElementType ASSIGN_EXPR = new SourcePawnElementType("ASSIGN_EXPR");
  IElementType ASSIGN_OP = new SourcePawnElementType("ASSIGN_OP");
  IElementType AUGMENTED_ASSIGN_OP = new SourcePawnElementType("AUGMENTED_ASSIGN_OP");
  IElementType BLOCK_STATEMENT = new SourcePawnElementType("BLOCK_STATEMENT");
  IElementType COMPLEX_EXPRESSION = new SourcePawnElementType("COMPLEX_EXPRESSION");
  IElementType DECL_EXPR = new SourcePawnElementType("DECL_EXPR");
  IElementType ENUM_DECLARATION = new SourcePawnElementType("ENUM_DECLARATION");
  IElementType ENUM_DECLARATION_LIST = new SourcePawnElementType("ENUM_DECLARATION_LIST");
  IElementType ENUM_DECLARATION_LIST_ITEM = new SourcePawnElementType("ENUM_DECLARATION_LIST_ITEM");
  IElementType EXPRESSION = new SourcePawnElementType("EXPRESSION");
  IElementType FORWARD_DECLARATION = new SourcePawnElementType("FORWARD_DECLARATION");
  IElementType FUNC_PROTO = new SourcePawnElementType("FUNC_PROTO");
  IElementType GLOBAL_DECLARATION = new SourcePawnElementType("GLOBAL_DECLARATION");
  IElementType GLOBAL_STORAGE_TYPE = new SourcePawnElementType("GLOBAL_STORAGE_TYPE");
  IElementType INITIALIZER = new SourcePawnElementType("INITIALIZER");
  IElementType LITERAL = new SourcePawnElementType("LITERAL");
  IElementType LOCAL_STORAGE_TYPE = new SourcePawnElementType("LOCAL_STORAGE_TYPE");
  IElementType NATIVE_DECLARATION = new SourcePawnElementType("NATIVE_DECLARATION");
  IElementType NEW_EXPR = new SourcePawnElementType("NEW_EXPR");
  IElementType NUMBER = new SourcePawnElementType("NUMBER");
  IElementType SIMPLE_EXPRESSION = new SourcePawnElementType("SIMPLE_EXPRESSION");
  IElementType SINGLE_STATEMENT = new SourcePawnElementType("SINGLE_STATEMENT");
  IElementType STATEMENT = new SourcePawnElementType("STATEMENT");
  IElementType STRUCT_INITIALIZER = new SourcePawnElementType("STRUCT_INITIALIZER");
  IElementType STRUCT_INITIALIZER_ITEM = new SourcePawnElementType("STRUCT_INITIALIZER_ITEM");
  IElementType TAG = new SourcePawnElementType("TAG");
  IElementType TAGGED_IDENTIFIER = new SourcePawnElementType("TAGGED_IDENTIFIER");
  IElementType TOP_LEVEL_STATEMENT = new SourcePawnElementType("TOP_LEVEL_STATEMENT");
  IElementType TOP_LEVEL_STATEMENT_ITEM = new SourcePawnElementType("TOP_LEVEL_STATEMENT_ITEM");

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
  IElementType FLOAT_LITERAL = new SourcePawnTokenType("float_literal");
  IElementType FORWARD_KEYWORD = new SourcePawnTokenType("forward");
  IElementType FOR_KEYWORD = new SourcePawnTokenType("for");
  IElementType GOTO_KEYWORD = new SourcePawnTokenType("goto");
  IElementType GT = new SourcePawnTokenType(">");
  IElementType GTGTEQ = new SourcePawnTokenType(">>=");
  IElementType HEX_LITERAL = new SourcePawnTokenType("hex_literal");
  IElementType IDENTIFIER = new SourcePawnTokenType("identifier");
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
  IElementType TAGOF_KEYWORD = new SourcePawnTokenType("tagof");
  IElementType TILDE = new SourcePawnTokenType("~");
  IElementType WHILE_KEYWORD = new SourcePawnTokenType("while");
  IElementType XOR = new SourcePawnTokenType("^");
  IElementType XOREQ = new SourcePawnTokenType("^=");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ANY_ASSIGN_OP) {
        return new SourcePawnAnyAssignOpImpl(node);
      }
      else if (type == ARGDEF) {
        return new SourcePawnArgdefImpl(node);
      }
      else if (type == ARGDEF_DEFAULT) {
        return new SourcePawnArgdefDefaultImpl(node);
      }
      else if (type == ARRAY_DIMS) {
        return new SourcePawnArrayDimsImpl(node);
      }
      else if (type == ASSIGN_EXPR) {
        return new SourcePawnAssignExprImpl(node);
      }
      else if (type == ASSIGN_OP) {
        return new SourcePawnAssignOpImpl(node);
      }
      else if (type == AUGMENTED_ASSIGN_OP) {
        return new SourcePawnAugmentedAssignOpImpl(node);
      }
      else if (type == BLOCK_STATEMENT) {
        return new SourcePawnBlockStatementImpl(node);
      }
      else if (type == COMPLEX_EXPRESSION) {
        return new SourcePawnComplexExpressionImpl(node);
      }
      else if (type == DECL_EXPR) {
        return new SourcePawnDeclExprImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new SourcePawnEnumDeclarationImpl(node);
      }
      else if (type == ENUM_DECLARATION_LIST) {
        return new SourcePawnEnumDeclarationListImpl(node);
      }
      else if (type == ENUM_DECLARATION_LIST_ITEM) {
        return new SourcePawnEnumDeclarationListItemImpl(node);
      }
      else if (type == EXPRESSION) {
        return new SourcePawnExpressionImpl(node);
      }
      else if (type == FORWARD_DECLARATION) {
        return new SourcePawnForwardDeclarationImpl(node);
      }
      else if (type == FUNC_PROTO) {
        return new SourcePawnFuncProtoImpl(node);
      }
      else if (type == GLOBAL_DECLARATION) {
        return new SourcePawnGlobalDeclarationImpl(node);
      }
      else if (type == GLOBAL_STORAGE_TYPE) {
        return new SourcePawnGlobalStorageTypeImpl(node);
      }
      else if (type == INITIALIZER) {
        return new SourcePawnInitializerImpl(node);
      }
      else if (type == LITERAL) {
        return new SourcePawnLiteralImpl(node);
      }
      else if (type == LOCAL_STORAGE_TYPE) {
        return new SourcePawnLocalStorageTypeImpl(node);
      }
      else if (type == NATIVE_DECLARATION) {
        return new SourcePawnNativeDeclarationImpl(node);
      }
      else if (type == NEW_EXPR) {
        return new SourcePawnNewExprImpl(node);
      }
      else if (type == NUMBER) {
        return new SourcePawnNumberImpl(node);
      }
      else if (type == SIMPLE_EXPRESSION) {
        return new SourcePawnSimpleExpressionImpl(node);
      }
      else if (type == SINGLE_STATEMENT) {
        return new SourcePawnSingleStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new SourcePawnStatementImpl(node);
      }
      else if (type == STRUCT_INITIALIZER) {
        return new SourcePawnStructInitializerImpl(node);
      }
      else if (type == STRUCT_INITIALIZER_ITEM) {
        return new SourcePawnStructInitializerItemImpl(node);
      }
      else if (type == TAG) {
        return new SourcePawnTagImpl(node);
      }
      else if (type == TAGGED_IDENTIFIER) {
        return new SourcePawnTaggedIdentifierImpl(node);
      }
      else if (type == TOP_LEVEL_STATEMENT) {
        return new SourcePawnTopLevelStatementImpl(node);
      }
      else if (type == TOP_LEVEL_STATEMENT_ITEM) {
        return new SourcePawnTopLevelStatementItemImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
