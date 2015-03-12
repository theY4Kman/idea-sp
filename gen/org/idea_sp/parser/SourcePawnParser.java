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

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SourcePawnParser implements PsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ARG_INIT) {
      r = arg_init(b, 0);
    }
    else if (t == ARG_NEW) {
      r = arg_new(b, 0);
    }
    else if (t == ARG_OLD) {
      r = arg_old(b, 0);
    }
    else if (t == ARGDECL) {
      r = argdecl(b, 0);
    }
    else if (t == BUILTIN_TYPE) {
      r = builtin_type(b, 0);
    }
    else if (t == GLOBAL) {
      r = global(b, 0);
    }
    else if (t == GLOBAL_ASSN) {
      r = global_assn(b, 0);
    }
    else if (t == GLOBAL_NEW) {
      r = global_new(b, 0);
    }
    else if (t == GLOBAL_OLD) {
      r = global_old(b, 0);
    }
    else if (t == LABEL) {
      r = label(b, 0);
    }
    else if (t == LITERAL) {
      r = literal(b, 0);
    }
    else if (t == NEW_DIMS) {
      r = new_dims(b, 0);
    }
    else if (t == NUMBER) {
      r = number(b, 0);
    }
    else if (t == OLD_DIMS) {
      r = old_dims(b, 0);
    }
    else if (t == RETURN_NEW) {
      r = return_new(b, 0);
    }
    else if (t == RETURN_OLD) {
      r = return_old(b, 0);
    }
    else if (t == RETURN_TYPE) {
      r = return_type(b, 0);
    }
    else if (t == STORAGE_CLASS) {
      r = storage_class(b, 0);
    }
    else if (t == TAG) {
      r = tag(b, 0);
    }
    else if (t == TAG_VECTOR) {
      r = tag_vector(b, 0);
    }
    else if (t == TAGS) {
      r = tags(b, 0);
    }
    else if (t == TYPE_EXPR) {
      r = type_expr(b, 0);
    }
    else if (t == VAR_NEW) {
      r = var_new(b, 0);
    }
    else if (t == VAR_NEW_PREFIX) {
      r = var_new_prefix(b, 0);
    }
    else if (t == VAR_OLD) {
      r = var_old(b, 0);
    }
    else if (t == VAR_OLD_PREFIX) {
      r = var_old_prefix(b, 0);
    }
    else if (t == VARDECL) {
      r = vardecl(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // literal | symbol
  public static boolean arg_init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_init")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<arg init>");
    r = literal(b, l + 1);
    if (!r) r = consumeToken(b, SYMBOL);
    exit_section_(b, l, m, ARG_INIT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "const"? type_expr '&'? symbol old_dims? ('=' arg_init)?
  public static boolean arg_new(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_new")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<arg new>");
    r = arg_new_0(b, l + 1);
    r = r && type_expr(b, l + 1);
    r = r && arg_new_2(b, l + 1);
    r = r && consumeToken(b, SYMBOL);
    r = r && arg_new_4(b, l + 1);
    r = r && arg_new_5(b, l + 1);
    exit_section_(b, l, m, ARG_NEW, r, false, null);
    return r;
  }

  // "const"?
  private static boolean arg_new_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_new_0")) return false;
    consumeToken(b, CONST_KEYWORD);
    return true;
  }

  // '&'?
  private static boolean arg_new_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_new_2")) return false;
    consumeToken(b, AND);
    return true;
  }

  // old_dims?
  private static boolean arg_new_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_new_4")) return false;
    old_dims(b, l + 1);
    return true;
  }

  // ('=' arg_init)?
  private static boolean arg_new_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_new_5")) return false;
    arg_new_5_0(b, l + 1);
    return true;
  }

  // '=' arg_init
  private static boolean arg_new_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_new_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && arg_init(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "const"? tags? '&'? symbol old_dims? ('=' arg_init)?
  public static boolean arg_old(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_old")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<arg old>");
    r = arg_old_0(b, l + 1);
    r = r && arg_old_1(b, l + 1);
    r = r && arg_old_2(b, l + 1);
    r = r && consumeToken(b, SYMBOL);
    r = r && arg_old_4(b, l + 1);
    r = r && arg_old_5(b, l + 1);
    exit_section_(b, l, m, ARG_OLD, r, false, null);
    return r;
  }

  // "const"?
  private static boolean arg_old_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_old_0")) return false;
    consumeToken(b, CONST_KEYWORD);
    return true;
  }

  // tags?
  private static boolean arg_old_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_old_1")) return false;
    tags(b, l + 1);
    return true;
  }

  // '&'?
  private static boolean arg_old_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_old_2")) return false;
    consumeToken(b, AND);
    return true;
  }

  // old_dims?
  private static boolean arg_old_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_old_4")) return false;
    old_dims(b, l + 1);
    return true;
  }

  // ('=' arg_init)?
  private static boolean arg_old_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_old_5")) return false;
    arg_old_5_0(b, l + 1);
    return true;
  }

  // '=' arg_init
  private static boolean arg_old_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_old_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && arg_init(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // arg_old | arg_new
  public static boolean argdecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argdecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<argdecl>");
    r = arg_old(b, l + 1);
    if (!r) r = arg_new(b, l + 1);
    exit_section_(b, l, m, ARGDECL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "void"
  //                | "int"
  //                | "float"
  //                | "char"
  //                | "bool"
  public static boolean builtin_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtin_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<builtin type>");
    r = consumeToken(b, "void");
    if (!r) r = consumeToken(b, "int");
    if (!r) r = consumeToken(b, "float");
    if (!r) r = consumeToken(b, "char");
    if (!r) r = consumeToken(b, "bool");
    exit_section_(b, l, m, BUILTIN_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // global_old | global_new
  public static boolean global(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global>");
    r = global_old(b, l + 1);
    if (!r) r = global_new(b, l + 1);
    exit_section_(b, l, m, GLOBAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // global '=' literal
  public static boolean global_assn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_assn")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global assn>");
    r = global(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && literal(b, l + 1);
    exit_section_(b, l, m, GLOBAL_ASSN, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // storage_class* type_expr symbol old_dims?
  public static boolean global_new(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_new")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global new>");
    r = global_new_0(b, l + 1);
    r = r && type_expr(b, l + 1);
    r = r && consumeToken(b, SYMBOL);
    r = r && global_new_3(b, l + 1);
    exit_section_(b, l, m, GLOBAL_NEW, r, false, null);
    return r;
  }

  // storage_class*
  private static boolean global_new_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_new_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!storage_class(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_new_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // old_dims?
  private static boolean global_new_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_new_3")) return false;
    old_dims(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // storage_class* tag? symbol old_dims?
  public static boolean global_old(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_old")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global old>");
    r = global_old_0(b, l + 1);
    r = r && global_old_1(b, l + 1);
    r = r && consumeToken(b, SYMBOL);
    r = r && global_old_3(b, l + 1);
    exit_section_(b, l, m, GLOBAL_OLD, r, false, null);
    return r;
  }

  // storage_class*
  private static boolean global_old_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_old_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!storage_class(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_old_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // tag?
  private static boolean global_old_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_old_1")) return false;
    tag(b, l + 1);
    return true;
  }

  // old_dims?
  private static boolean global_old_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_old_3")) return false;
    old_dims(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // symbol ':'
  public static boolean label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // number | string_literal | character_literal
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal>");
    r = number(b, l + 1);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    exit_section_(b, l, m, LITERAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('[' ']')*
  public static boolean new_dims(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_dims")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<new dims>");
    int c = current_position_(b);
    while (true) {
      if (!new_dims_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "new_dims", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, NEW_DIMS, true, false, null);
    return true;
  }

  // '[' ']'
  private static boolean new_dims_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_dims_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // integer_literal | hex_literal | float_literal
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<number>");
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, HEX_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    exit_section_(b, l, m, NUMBER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('[' expr? ']')+
  public static boolean old_dims(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "old_dims")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = old_dims_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!old_dims_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "old_dims", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, OLD_DIMS, r);
    return r;
  }

  // '[' expr? ']'
  private static boolean old_dims_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "old_dims_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && old_dims_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr?
  private static boolean old_dims_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "old_dims_0_1")) return false;
    consumeToken(b, EXPR);
    return true;
  }

  /* ********************************************************** */
  // type_expr new_dims?
  public static boolean return_new(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_new")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return new>");
    r = type_expr(b, l + 1);
    r = r && return_new_1(b, l + 1);
    exit_section_(b, l, m, RETURN_NEW, r, false, null);
    return r;
  }

  // new_dims?
  private static boolean return_new_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_new_1")) return false;
    new_dims(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // old_dims? label?
  public static boolean return_old(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_old")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return old>");
    r = return_old_0(b, l + 1);
    r = r && return_old_1(b, l + 1);
    exit_section_(b, l, m, RETURN_OLD, r, false, null);
    return r;
  }

  // old_dims?
  private static boolean return_old_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_old_0")) return false;
    old_dims(b, l + 1);
    return true;
  }

  // label?
  private static boolean return_old_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_old_1")) return false;
    label(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // return_old | return_new
  public static boolean return_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return type>");
    r = return_old(b, l + 1);
    if (!r) r = return_new(b, l + 1);
    exit_section_(b, l, m, RETURN_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // root_item *
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    int c = current_position_(b);
    while (true) {
      if (!root_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // global_assn SEMICOLON
  static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_assn(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "public" | "static" | "const" | "stock"
  public static boolean storage_class(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "storage_class")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<storage class>");
    r = consumeToken(b, PUBLIC_KEYWORD);
    if (!r) r = consumeToken(b, STATIC_KEYWORD);
    if (!r) r = consumeToken(b, CONST_KEYWORD);
    if (!r) r = consumeToken(b, STOCK_KEYWORD);
    exit_section_(b, l, m, STORAGE_CLASS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, TAG, r);
    return r;
  }

  /* ********************************************************** */
  // '{' symbol (',' symbol)* '}' ':'
  public static boolean tag_vector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_vector")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && consumeToken(b, SYMBOL);
    r = r && tag_vector_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, TAG_VECTOR, r);
    return r;
  }

  // (',' symbol)*
  private static boolean tag_vector_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_vector_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!tag_vector_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tag_vector_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' symbol
  private static boolean tag_vector_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_vector_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && consumeToken(b, SYMBOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tag_vector | tag
  public static boolean tags(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tags")) return false;
    if (!nextTokenIs(b, "<tags>", LBRACE, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<tags>");
    r = tag_vector(b, l + 1);
    if (!r) r = tag(b, l + 1);
    exit_section_(b, l, m, TAGS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (builtin_type | symbol) new_dims?
  public static boolean type_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type expr>");
    r = type_expr_0(b, l + 1);
    r = r && type_expr_1(b, l + 1);
    exit_section_(b, l, m, TYPE_EXPR, r, false, null);
    return r;
  }

  // builtin_type | symbol
  private static boolean type_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = builtin_type(b, l + 1);
    if (!r) r = consumeToken(b, SYMBOL);
    exit_section_(b, m, null, r);
    return r;
  }

  // new_dims?
  private static boolean type_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expr_1")) return false;
    new_dims(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // var_new_prefix type_expr symbol old_dims?
  public static boolean var_new(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_new")) return false;
    if (!nextTokenIs(b, "<var new>", CONST_KEYWORD, STATIC_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<var new>");
    r = var_new_prefix(b, l + 1);
    r = r && type_expr(b, l + 1);
    r = r && consumeToken(b, SYMBOL);
    r = r && var_new_3(b, l + 1);
    exit_section_(b, l, m, VAR_NEW, r, false, null);
    return r;
  }

  // old_dims?
  private static boolean var_new_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_new_3")) return false;
    old_dims(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "static" | "const"
  public static boolean var_new_prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_new_prefix")) return false;
    if (!nextTokenIs(b, "<var new prefix>", CONST_KEYWORD, STATIC_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<var new prefix>");
    r = consumeToken(b, STATIC_KEYWORD);
    if (!r) r = consumeToken(b, CONST_KEYWORD);
    exit_section_(b, l, m, VAR_NEW_PREFIX, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // var_old_prefix tag? symbol old_dims?
  public static boolean var_old(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_old")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<var old>");
    r = var_old_prefix(b, l + 1);
    r = r && var_old_1(b, l + 1);
    r = r && consumeToken(b, SYMBOL);
    r = r && var_old_3(b, l + 1);
    exit_section_(b, l, m, VAR_OLD, r, false, null);
    return r;
  }

  // tag?
  private static boolean var_old_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_old_1")) return false;
    tag(b, l + 1);
    return true;
  }

  // old_dims?
  private static boolean var_old_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_old_3")) return false;
    old_dims(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "new" | "decl" | "static" | "const"
  public static boolean var_old_prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_old_prefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<var old prefix>");
    r = consumeToken(b, NEW_KEYWORD);
    if (!r) r = consumeToken(b, DECL_KEYWORD);
    if (!r) r = consumeToken(b, STATIC_KEYWORD);
    if (!r) r = consumeToken(b, CONST_KEYWORD);
    exit_section_(b, l, m, VAR_OLD_PREFIX, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // var_old | var_new
  public static boolean vardecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vardecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<vardecl>");
    r = var_old(b, l + 1);
    if (!r) r = var_new(b, l + 1);
    exit_section_(b, l, m, VARDECL, r, false, null);
    return r;
  }

}
