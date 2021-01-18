// This is a generated file. Not intended for manual editing.
package org.idea_sp.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.idea_sp.psi.SourcePawnTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SourcePawnParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return root(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // literal | symbol
  public static boolean arg_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARG_INIT, "<arg init>");
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SYMBOL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // "const"? type_expr '&'? symbol old_dims? ('=' arg_init)?
  public static boolean arg_new(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_new")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARG_NEW, "<arg new>");
    result_ = arg_new_0(builder_, level_ + 1);
    result_ = result_ && type_expr(builder_, level_ + 1);
    result_ = result_ && arg_new_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SYMBOL);
    result_ = result_ && arg_new_4(builder_, level_ + 1);
    result_ = result_ && arg_new_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // "const"?
  private static boolean arg_new_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_new_0")) return false;
    consumeToken(builder_, CONST_KEYWORD);
    return true;
  }

  // '&'?
  private static boolean arg_new_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_new_2")) return false;
    consumeToken(builder_, AND);
    return true;
  }

  // old_dims?
  private static boolean arg_new_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_new_4")) return false;
    old_dims(builder_, level_ + 1);
    return true;
  }

  // ('=' arg_init)?
  private static boolean arg_new_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_new_5")) return false;
    arg_new_5_0(builder_, level_ + 1);
    return true;
  }

  // '=' arg_init
  private static boolean arg_new_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_new_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && arg_init(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // "const"? tags? '&'? symbol old_dims? ('=' arg_init)?
  public static boolean arg_old(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_old")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARG_OLD, "<arg old>");
    result_ = arg_old_0(builder_, level_ + 1);
    result_ = result_ && arg_old_1(builder_, level_ + 1);
    result_ = result_ && arg_old_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SYMBOL);
    result_ = result_ && arg_old_4(builder_, level_ + 1);
    result_ = result_ && arg_old_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // "const"?
  private static boolean arg_old_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_old_0")) return false;
    consumeToken(builder_, CONST_KEYWORD);
    return true;
  }

  // tags?
  private static boolean arg_old_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_old_1")) return false;
    tags(builder_, level_ + 1);
    return true;
  }

  // '&'?
  private static boolean arg_old_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_old_2")) return false;
    consumeToken(builder_, AND);
    return true;
  }

  // old_dims?
  private static boolean arg_old_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_old_4")) return false;
    old_dims(builder_, level_ + 1);
    return true;
  }

  // ('=' arg_init)?
  private static boolean arg_old_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_old_5")) return false;
    arg_old_5_0(builder_, level_ + 1);
    return true;
  }

  // '=' arg_init
  private static boolean arg_old_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_old_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && arg_init(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // arg_old | arg_new
  public static boolean argdecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argdecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARGDECL, "<argdecl>");
    result_ = arg_old(builder_, level_ + 1);
    if (!result_) result_ = arg_new(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // "void"
  //                | "int"
  //                | "float"
  //                | "char"
  //                | "bool"
  public static boolean builtin_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BUILTIN_TYPE, "<builtin type>");
    result_ = consumeToken(builder_, "void");
    if (!result_) result_ = consumeToken(builder_, "int");
    if (!result_) result_ = consumeToken(builder_, "float");
    if (!result_) result_ = consumeToken(builder_, "char");
    if (!result_) result_ = consumeToken(builder_, "bool");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // global_old | global_new
  public static boolean global(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GLOBAL, "<global>");
    result_ = global_old(builder_, level_ + 1);
    if (!result_) result_ = global_new(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // global '=' literal
  public static boolean global_assn(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_assn")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GLOBAL_ASSN, "<global assn>");
    result_ = global(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQ);
    result_ = result_ && literal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // storage_class* type_expr symbol old_dims?
  public static boolean global_new(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_new")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GLOBAL_NEW, "<global new>");
    result_ = global_new_0(builder_, level_ + 1);
    result_ = result_ && type_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SYMBOL);
    result_ = result_ && global_new_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // storage_class*
  private static boolean global_new_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_new_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!storage_class(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "global_new_0", pos_)) break;
    }
    return true;
  }

  // old_dims?
  private static boolean global_new_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_new_3")) return false;
    old_dims(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // storage_class* tag? symbol old_dims?
  public static boolean global_old(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_old")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GLOBAL_OLD, "<global old>");
    result_ = global_old_0(builder_, level_ + 1);
    result_ = result_ && global_old_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SYMBOL);
    result_ = result_ && global_old_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // storage_class*
  private static boolean global_old_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_old_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!storage_class(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "global_old_0", pos_)) break;
    }
    return true;
  }

  // tag?
  private static boolean global_old_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_old_1")) return false;
    tag(builder_, level_ + 1);
    return true;
  }

  // old_dims?
  private static boolean global_old_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_old_3")) return false;
    old_dims(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // symbol ':'
  public static boolean label(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label")) return false;
    if (!nextTokenIs(builder_, SYMBOL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SYMBOL, COLON);
    exit_section_(builder_, marker_, LABEL, result_);
    return result_;
  }

  /* ********************************************************** */
  // number | string_literal | character_literal
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL, "<literal>");
    result_ = number(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING_LITERAL);
    if (!result_) result_ = consumeToken(builder_, CHARACTER_LITERAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ('[' ']')*
  public static boolean new_dims(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_dims")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NEW_DIMS, "<new dims>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!new_dims_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "new_dims", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // '[' ']'
  private static boolean new_dims_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_dims_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACKET, RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // integer_literal | hex_literal | float_literal
  public static boolean number(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "number")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NUMBER, "<number>");
    result_ = consumeToken(builder_, INTEGER_LITERAL);
    if (!result_) result_ = consumeToken(builder_, HEX_LITERAL);
    if (!result_) result_ = consumeToken(builder_, FLOAT_LITERAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ('[' expr? ']')+
  public static boolean old_dims(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "old_dims")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = old_dims_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!old_dims_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "old_dims", pos_)) break;
    }
    exit_section_(builder_, marker_, OLD_DIMS, result_);
    return result_;
  }

  // '[' expr? ']'
  private static boolean old_dims_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "old_dims_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && old_dims_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr?
  private static boolean old_dims_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "old_dims_0_1")) return false;
    consumeToken(builder_, EXPR);
    return true;
  }

  /* ********************************************************** */
  // type_expr new_dims?
  public static boolean return_new(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_new")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RETURN_NEW, "<return new>");
    result_ = type_expr(builder_, level_ + 1);
    result_ = result_ && return_new_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // new_dims?
  private static boolean return_new_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_new_1")) return false;
    new_dims(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // old_dims? label?
  public static boolean return_old(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_old")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RETURN_OLD, "<return old>");
    result_ = return_old_0(builder_, level_ + 1);
    result_ = result_ && return_old_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // old_dims?
  private static boolean return_old_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_old_0")) return false;
    old_dims(builder_, level_ + 1);
    return true;
  }

  // label?
  private static boolean return_old_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_old_1")) return false;
    label(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // return_old | return_new
  public static boolean return_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RETURN_TYPE, "<return type>");
    result_ = return_old(builder_, level_ + 1);
    if (!result_) result_ = return_new(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // root_item *
  static boolean root(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!root_item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "root", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // global_assn SEMICOLON
  static boolean root_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = global_assn(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // "public" | "static" | "const" | "stock"
  public static boolean storage_class(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "storage_class")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STORAGE_CLASS, "<storage class>");
    result_ = consumeToken(builder_, PUBLIC_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, STATIC_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, CONST_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, STOCK_KEYWORD);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // label
  public static boolean tag(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tag")) return false;
    if (!nextTokenIs(builder_, SYMBOL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = label(builder_, level_ + 1);
    exit_section_(builder_, marker_, TAG, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' symbol (',' symbol)* '}' ':'
  public static boolean tag_vector(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tag_vector")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACE, SYMBOL);
    result_ = result_ && tag_vector_2(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RBRACE, COLON);
    exit_section_(builder_, marker_, TAG_VECTOR, result_);
    return result_;
  }

  // (',' symbol)*
  private static boolean tag_vector_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tag_vector_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!tag_vector_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "tag_vector_2", pos_)) break;
    }
    return true;
  }

  // ',' symbol
  private static boolean tag_vector_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tag_vector_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, SYMBOL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // tag_vector | tag
  public static boolean tags(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tags")) return false;
    if (!nextTokenIs(builder_, "<tags>", LBRACE, SYMBOL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TAGS, "<tags>");
    result_ = tag_vector(builder_, level_ + 1);
    if (!result_) result_ = tag(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (builtin_type | symbol) new_dims?
  public static boolean type_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_EXPR, "<type expr>");
    result_ = type_expr_0(builder_, level_ + 1);
    result_ = result_ && type_expr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // builtin_type | symbol
  private static boolean type_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_expr_0")) return false;
    boolean result_;
    result_ = builtin_type(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SYMBOL);
    return result_;
  }

  // new_dims?
  private static boolean type_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_expr_1")) return false;
    new_dims(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // var_new_prefix type_expr symbol old_dims?
  public static boolean var_new(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_new")) return false;
    if (!nextTokenIs(builder_, "<var new>", CONST_KEYWORD, STATIC_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VAR_NEW, "<var new>");
    result_ = var_new_prefix(builder_, level_ + 1);
    result_ = result_ && type_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SYMBOL);
    result_ = result_ && var_new_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // old_dims?
  private static boolean var_new_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_new_3")) return false;
    old_dims(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // "static" | "const"
  public static boolean var_new_prefix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_new_prefix")) return false;
    if (!nextTokenIs(builder_, "<var new prefix>", CONST_KEYWORD, STATIC_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VAR_NEW_PREFIX, "<var new prefix>");
    result_ = consumeToken(builder_, STATIC_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, CONST_KEYWORD);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // var_old_prefix tag? symbol old_dims?
  public static boolean var_old(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_old")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VAR_OLD, "<var old>");
    result_ = var_old_prefix(builder_, level_ + 1);
    result_ = result_ && var_old_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SYMBOL);
    result_ = result_ && var_old_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // tag?
  private static boolean var_old_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_old_1")) return false;
    tag(builder_, level_ + 1);
    return true;
  }

  // old_dims?
  private static boolean var_old_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_old_3")) return false;
    old_dims(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // "new" | "decl" | "static" | "const"
  public static boolean var_old_prefix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_old_prefix")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VAR_OLD_PREFIX, "<var old prefix>");
    result_ = consumeToken(builder_, NEW_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, DECL_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, STATIC_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, CONST_KEYWORD);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // var_old | var_new
  public static boolean vardecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vardecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VARDECL, "<vardecl>");
    result_ = var_old(builder_, level_ + 1);
    if (!result_) result_ = var_new(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

}
