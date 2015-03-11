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
    if (t == ASSIGN_OP) {
      r = ASSIGN_OP(b, 0);
    }
    else if (t == AUGMENTED_ASSIGN_OP) {
      r = AUGMENTED_ASSIGN_OP(b, 0);
    }
    else if (t == ANY_ASSIGN_OP) {
      r = any_assign_op(b, 0);
    }
    else if (t == ARGDEF) {
      r = argdef(b, 0);
    }
    else if (t == ARGDEF_DEFAULT) {
      r = argdef_default(b, 0);
    }
    else if (t == ARRAY_DIMS) {
      r = array_dims(b, 0);
    }
    else if (t == ASSIGN_EXPR) {
      r = assign_expr(b, 0);
    }
    else if (t == BLOCK_STATEMENT) {
      r = block_statement(b, 0);
    }
    else if (t == COMPLEX_EXPRESSION) {
      r = complex_expression(b, 0);
    }
    else if (t == DECL_EXPR) {
      r = decl_expr(b, 0);
    }
    else if (t == ENUM_DECLARATION) {
      r = enum_declaration(b, 0);
    }
    else if (t == ENUM_DECLARATION_LIST) {
      r = enum_declaration_list(b, 0);
    }
    else if (t == ENUM_DECLARATION_LIST_ITEM) {
      r = enum_declaration_list_item(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == FORWARD_DECLARATION) {
      r = forward_declaration(b, 0);
    }
    else if (t == FUNC_PROTO) {
      r = func_proto(b, 0);
    }
    else if (t == GLOBAL_DECLARATION) {
      r = global_declaration(b, 0);
    }
    else if (t == GLOBAL_STORAGE_TYPE) {
      r = global_storage_type(b, 0);
    }
    else if (t == INITIALIZER) {
      r = initializer(b, 0);
    }
    else if (t == LITERAL) {
      r = literal(b, 0);
    }
    else if (t == LOCAL_STORAGE_TYPE) {
      r = local_storage_type(b, 0);
    }
    else if (t == NATIVE_DECLARATION) {
      r = native_declaration(b, 0);
    }
    else if (t == NEW_EXPR) {
      r = new_expr(b, 0);
    }
    else if (t == NUMBER) {
      r = number(b, 0);
    }
    else if (t == SIMPLE_EXPRESSION) {
      r = simple_expression(b, 0);
    }
    else if (t == SINGLE_STATEMENT) {
      r = single_statement(b, 0);
    }
    else if (t == STATEMENT) {
      r = statement(b, 0);
    }
    else if (t == STRUCT_INITIALIZER) {
      r = struct_initializer(b, 0);
    }
    else if (t == STRUCT_INITIALIZER_ITEM) {
      r = struct_initializer_item(b, 0);
    }
    else if (t == TAG) {
      r = tag(b, 0);
    }
    else if (t == TAGGED_IDENTIFIER) {
      r = tagged_identifier(b, 0);
    }
    else if (t == TOP_LEVEL_STATEMENT) {
      r = top_level_statement(b, 0);
    }
    else if (t == TOP_LEVEL_STATEMENT_ITEM) {
      r = top_level_statement_item(b, 0);
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
  // EQ
  public static boolean ASSIGN_OP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ASSIGN_OP")) return false;
    if (!nextTokenIs(b, EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    exit_section_(b, m, ASSIGN_OP, r);
    return r;
  }

  /* ********************************************************** */
  // PLUSEQ
  //   | MINUSEQ
  //   | ASTERISKEQ
  //   | DIVEQ
  //   | ANDEQ
  public static boolean AUGMENTED_ASSIGN_OP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AUGMENTED_ASSIGN_OP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<augmented assign op>");
    r = consumeToken(b, PLUSEQ);
    if (!r) r = consumeToken(b, MINUSEQ);
    if (!r) r = consumeToken(b, ASTERISKEQ);
    if (!r) r = consumeToken(b, DIVEQ);
    if (!r) r = consumeToken(b, ANDEQ);
    exit_section_(b, l, m, AUGMENTED_ASSIGN_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ASSIGN_OP | AUGMENTED_ASSIGN_OP
  public static boolean any_assign_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_assign_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<any assign op>");
    r = ASSIGN_OP(b, l + 1);
    if (!r) r = AUGMENTED_ASSIGN_OP(b, l + 1);
    exit_section_(b, l, m, ANY_ASSIGN_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (CONST_KEYWORD | AND)? tagged_identifier array_dims? argdef_default?
  public static boolean argdef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argdef")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<argdef>");
    r = argdef_0(b, l + 1);
    r = r && tagged_identifier(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, argdef_2(b, l + 1));
    r = p && argdef_3(b, l + 1) && r;
    exit_section_(b, l, m, ARGDEF, r, p, null);
    return r || p;
  }

  // (CONST_KEYWORD | AND)?
  private static boolean argdef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argdef_0")) return false;
    argdef_0_0(b, l + 1);
    return true;
  }

  // CONST_KEYWORD | AND
  private static boolean argdef_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argdef_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_KEYWORD);
    if (!r) r = consumeToken(b, AND);
    exit_section_(b, m, null, r);
    return r;
  }

  // array_dims?
  private static boolean argdef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argdef_2")) return false;
    array_dims(b, l + 1);
    return true;
  }

  // argdef_default?
  private static boolean argdef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argdef_3")) return false;
    argdef_default(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ASSIGN_OP simple_expression
  public static boolean argdef_default(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argdef_default")) return false;
    if (!nextTokenIs(b, EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ASSIGN_OP(b, l + 1);
    r = r && simple_expression(b, l + 1);
    exit_section_(b, m, ARGDEF_DEFAULT, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET number? RBRACKET
  public static boolean array_dims(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_dims")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && array_dims_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, ARRAY_DIMS, r);
    return r;
  }

  // number?
  private static boolean array_dims_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_dims_1")) return false;
    number(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier any_assign_op expression
  public static boolean assign_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_expr")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && any_assign_op(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, ASSIGN_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE statement* RBRACE
  public static boolean block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && block_statement_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BLOCK_STATEMENT, r);
    return r;
  }

  // statement*
  private static boolean block_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_statement_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // simple_expression
  //   | assign_expr
  public static boolean complex_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<complex expression>");
    r = simple_expression(b, l + 1);
    if (!r) r = assign_expr(b, l + 1);
    exit_section_(b, l, m, COMPLEX_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DECL_KEYWORD identifier
  public static boolean decl_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_expr")) return false;
    if (!nextTokenIs(b, DECL_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DECL_KEYWORD, IDENTIFIER);
    exit_section_(b, m, DECL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // ENUM_KEYWORD identifier COLON? enum_declaration_list
  public static boolean enum_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration")) return false;
    if (!nextTokenIs(b, ENUM_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENUM_KEYWORD, IDENTIFIER);
    r = r && enum_declaration_2(b, l + 1);
    r = r && enum_declaration_list(b, l + 1);
    exit_section_(b, m, ENUM_DECLARATION, r);
    return r;
  }

  // COLON?
  private static boolean enum_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2")) return false;
    consumeToken(b, COLON);
    return true;
  }

  /* ********************************************************** */
  // LBRACE enum_declaration_list_item (COMMA (enum_declaration_list_item | &RBRACE))* RBRACE
  public static boolean enum_declaration_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_list")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, enum_declaration_list_item(b, l + 1));
    r = p && report_error_(b, enum_declaration_list_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, ENUM_DECLARATION_LIST, r, p, null);
    return r || p;
  }

  // (COMMA (enum_declaration_list_item | &RBRACE))*
  private static boolean enum_declaration_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_list_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!enum_declaration_list_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_list_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA (enum_declaration_list_item | &RBRACE)
  private static boolean enum_declaration_list_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_list_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && enum_declaration_list_2_0_1(b, l + 1);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // enum_declaration_list_item | &RBRACE
  private static boolean enum_declaration_list_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_list_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_declaration_list_item(b, l + 1);
    if (!r) r = enum_declaration_list_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACE
  private static boolean enum_declaration_list_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_list_2_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_, null);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tagged_identifier (ASSIGN_OP literal)?
  public static boolean enum_declaration_list_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_list_item")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = tagged_identifier(b, l + 1);
    p = r; // pin = 1
    r = r && enum_declaration_list_item_1(b, l + 1);
    exit_section_(b, l, m, ENUM_DECLARATION_LIST_ITEM, r, p, null);
    return r || p;
  }

  // (ASSIGN_OP literal)?
  private static boolean enum_declaration_list_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_list_item_1")) return false;
    enum_declaration_list_item_1_0(b, l + 1);
    return true;
  }

  // ASSIGN_OP literal
  private static boolean enum_declaration_list_item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_list_item_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ASSIGN_OP(b, l + 1);
    r = r && literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decl_expr
  //   | new_expr
  //   | complex_expression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = decl_expr(b, l + 1);
    if (!r) r = new_expr(b, l + 1);
    if (!r) r = complex_expression(b, l + 1);
    exit_section_(b, l, m, EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FORWARD_KEYWORD tagged_identifier func_proto
  public static boolean forward_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forward_declaration")) return false;
    if (!nextTokenIs(b, FORWARD_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FORWARD_KEYWORD);
    r = r && tagged_identifier(b, l + 1);
    r = r && func_proto(b, l + 1);
    exit_section_(b, m, FORWARD_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN argdef (COMMA (argdef | &RPAREN))* RPAREN
  public static boolean func_proto(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_proto")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, argdef(b, l + 1));
    r = p && report_error_(b, func_proto_2(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, FUNC_PROTO, r, p, null);
    return r || p;
  }

  // (COMMA (argdef | &RPAREN))*
  private static boolean func_proto_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_proto_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!func_proto_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_proto_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA (argdef | &RPAREN)
  private static boolean func_proto_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_proto_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && func_proto_2_0_1(b, l + 1);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // argdef | &RPAREN
  private static boolean func_proto_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_proto_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argdef(b, l + 1);
    if (!r) r = func_proto_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RPAREN
  private static boolean func_proto_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_proto_2_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_, null);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // global_storage_type CONST_KEYWORD? tagged_identifier (ASSIGN_OP initializer)?
  public static boolean global_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global declaration>");
    r = global_storage_type(b, l + 1);
    r = r && global_declaration_1(b, l + 1);
    r = r && tagged_identifier(b, l + 1);
    r = r && global_declaration_3(b, l + 1);
    exit_section_(b, l, m, GLOBAL_DECLARATION, r, false, null);
    return r;
  }

  // CONST_KEYWORD?
  private static boolean global_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_declaration_1")) return false;
    consumeToken(b, CONST_KEYWORD);
    return true;
  }

  // (ASSIGN_OP initializer)?
  private static boolean global_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_declaration_3")) return false;
    global_declaration_3_0(b, l + 1);
    return true;
  }

  // ASSIGN_OP initializer
  private static boolean global_declaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_declaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ASSIGN_OP(b, l + 1);
    r = r && initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PUBLIC_KEYWORD
  //   | STOCK_KEYWORD
  //   | NEW_KEYWORD
  //   | STATIC_KEYWORD
  public static boolean global_storage_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_storage_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global storage type>");
    r = consumeToken(b, PUBLIC_KEYWORD);
    if (!r) r = consumeToken(b, STOCK_KEYWORD);
    if (!r) r = consumeToken(b, NEW_KEYWORD);
    if (!r) r = consumeToken(b, STATIC_KEYWORD);
    exit_section_(b, l, m, GLOBAL_STORAGE_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // struct_initializer
  //   | simple_expression
  public static boolean initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<initializer>");
    r = struct_initializer(b, l + 1);
    if (!r) r = simple_expression(b, l + 1);
    exit_section_(b, l, m, INITIALIZER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // string_literal
  //   | character_literal
  //   | number
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal>");
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    if (!r) r = number(b, l + 1);
    exit_section_(b, l, m, LITERAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NEW_KEYWORD
  //   | STATIC_KEYWORD
  public static boolean local_storage_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_storage_type")) return false;
    if (!nextTokenIs(b, "<local storage type>", NEW_KEYWORD, STATIC_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<local storage type>");
    r = consumeToken(b, NEW_KEYWORD);
    if (!r) r = consumeToken(b, STATIC_KEYWORD);
    exit_section_(b, l, m, LOCAL_STORAGE_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NATIVE_KEYWORD tagged_identifier func_proto
  public static boolean native_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "native_declaration")) return false;
    if (!nextTokenIs(b, NATIVE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NATIVE_KEYWORD);
    r = r && tagged_identifier(b, l + 1);
    r = r && func_proto(b, l + 1);
    exit_section_(b, m, NATIVE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // local_storage_type identifier (ASSIGN_OP expression)?
  public static boolean new_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_expr")) return false;
    if (!nextTokenIs(b, "<new expr>", NEW_KEYWORD, STATIC_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<new expr>");
    r = local_storage_type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && new_expr_2(b, l + 1);
    exit_section_(b, l, m, NEW_EXPR, r, false, null);
    return r;
  }

  // (ASSIGN_OP expression)?
  private static boolean new_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_expr_2")) return false;
    new_expr_2_0(b, l + 1);
    return true;
  }

  // ASSIGN_OP expression
  private static boolean new_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_expr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ASSIGN_OP(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // integer_literal
  //   | float_literal
  //   | hex_literal
  //   | binary_literal
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<number>");
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, HEX_LITERAL);
    if (!r) r = consumeToken(b, BINARY_LITERAL);
    exit_section_(b, l, m, NUMBER, r, false, null);
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
  // top_level_statement
  static boolean root_item(PsiBuilder b, int l) {
    return top_level_statement(b, l + 1);
  }

  /* ********************************************************** */
  // literal
  //   | tagged_identifier
  public static boolean simple_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<simple expression>");
    r = literal(b, l + 1);
    if (!r) r = tagged_identifier(b, l + 1);
    exit_section_(b, l, m, SIMPLE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression SEMICOLON
  public static boolean single_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<single statement>");
    r = expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, SINGLE_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block_statement
  //   | single_statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<statement>");
    r = block_statement(b, l + 1);
    if (!r) r = single_statement(b, l + 1);
    exit_section_(b, l, m, STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACE struct_initializer_item (COMMA (struct_initializer_item | &RBRACE))* RBRACE
  public static boolean struct_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_initializer")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, struct_initializer_item(b, l + 1));
    r = p && report_error_(b, struct_initializer_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, STRUCT_INITIALIZER, r, p, null);
    return r || p;
  }

  // (COMMA (struct_initializer_item | &RBRACE))*
  private static boolean struct_initializer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_initializer_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!struct_initializer_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_initializer_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA (struct_initializer_item | &RBRACE)
  private static boolean struct_initializer_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_initializer_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && struct_initializer_2_0_1(b, l + 1);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // struct_initializer_item | &RBRACE
  private static boolean struct_initializer_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_initializer_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_initializer_item(b, l + 1);
    if (!r) r = struct_initializer_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACE
  private static boolean struct_initializer_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_initializer_2_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_, null);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier ASSIGN_OP initializer
  public static boolean struct_initializer_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_initializer_item")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && ASSIGN_OP(b, l + 1);
    r = r && initializer(b, l + 1);
    exit_section_(b, m, STRUCT_INITIALIZER_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, TAG, r);
    return r;
  }

  /* ********************************************************** */
  // (tag COLON)? identifier
  public static boolean tagged_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagged_identifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tagged_identifier_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, TAGGED_IDENTIFIER, r);
    return r;
  }

  // (tag COLON)?
  private static boolean tagged_identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagged_identifier_0")) return false;
    tagged_identifier_0_0(b, l + 1);
    return true;
  }

  // tag COLON
  private static boolean tagged_identifier_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagged_identifier_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tag(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // top_level_statement_item SEMICOLON
  public static boolean top_level_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<top level statement>");
    r = top_level_statement_item(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, TOP_LEVEL_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // enum_declaration
  //   | global_declaration
  //   | forward_declaration
  //   | native_declaration
  public static boolean top_level_statement_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_statement_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<top level statement item>");
    r = enum_declaration(b, l + 1);
    if (!r) r = global_declaration(b, l + 1);
    if (!r) r = forward_declaration(b, l + 1);
    if (!r) r = native_declaration(b, l + 1);
    exit_section_(b, l, m, TOP_LEVEL_STATEMENT_ITEM, r, false, null);
    return r;
  }

}
