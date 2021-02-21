package org.idea_sp

import com.intellij.psi.TokenType
import com.intellij.psi.tree.TokenSet
import org.idea_sp.psi.SourcePawnTypes

interface SourcePawnTokenTypeSets {
    companion object {
        val COMMENTS = TokenSet.create(
            SourcePawnTypes.LINE_COMMENT,
            SourcePawnTypes.BLOCK_COMMENT,
            SourcePawnTypes.DOC_COMMENT,
            SourcePawnTypes.PREPROCESSOR_COMMENT
        )
        val KEYWORDS = TokenSet.create(
            SourcePawnTypes.ASSERT_KEYWORD,
            SourcePawnTypes.BREAK_KEYWORD,
            SourcePawnTypes.CASE_KEYWORD,
            SourcePawnTypes.CONTINUE_KEYWORD,
            SourcePawnTypes.DEFAULT_KEYWORD,
            SourcePawnTypes.DO_KEYWORD,
            SourcePawnTypes.ELSE_KEYWORD,
            SourcePawnTypes.EXIT_KEYWORD,
            SourcePawnTypes.FOR_KEYWORD,
            SourcePawnTypes.GOTO_KEYWORD,
            SourcePawnTypes.IF_KEYWORD,
            SourcePawnTypes.RETURN_KEYWORD,
            SourcePawnTypes.SLEEP_KEYWORD,
            SourcePawnTypes.STATE_KEYWORD,
            SourcePawnTypes.SWITCH_KEYWORD,
            SourcePawnTypes.WHILE_KEYWORD,
            SourcePawnTypes.USING_KEYWORD,
            SourcePawnTypes.DEFINED_KEYWORD,
            SourcePawnTypes.SIZEOF_KEYWORD,
            SourcePawnTypes.TAGOF_KEYWORD,
            SourcePawnTypes.CONST_KEYWORD,
            SourcePawnTypes.FORWARD_KEYWORD,
            SourcePawnTypes.NATIVE_KEYWORD,
            SourcePawnTypes.NEW_KEYWORD,
            SourcePawnTypes.OPERATOR_KEYWORD,
            SourcePawnTypes.PUBLIC_KEYWORD,
            SourcePawnTypes.STATIC_KEYWORD,
            SourcePawnTypes.STOCK_KEYWORD,
            SourcePawnTypes.DECL_KEYWORD,
            SourcePawnTypes.ENUM_KEYWORD,
            SourcePawnTypes.STRUCT_KEYWORD,
            SourcePawnTypes.METHODMAP_KEYWORD,
            SourcePawnTypes.TYPEDEF_KEYWORD,
            SourcePawnTypes.TYPESET_KEYWORD,
            SourcePawnTypes.PROPERTY_KEYWORD,
            SourcePawnTypes.VIEW_AS_KEYWORD
        )
        val OPERATORS = TokenSet.create(
            SourcePawnTypes.EQ,
            SourcePawnTypes.EXCL,
            SourcePawnTypes.TILDE,
            SourcePawnTypes.QUEST,
            SourcePawnTypes.COLON,
            SourcePawnTypes.PLUS,
            SourcePawnTypes.MINUS,
            SourcePawnTypes.ASTERISK,
            SourcePawnTypes.DIV,
            SourcePawnTypes.OR,
            SourcePawnTypes.XOR,
            SourcePawnTypes.PERC,
            SourcePawnTypes.LPAREN,
            SourcePawnTypes.RPAREN,
            SourcePawnTypes.LBRACE,
            SourcePawnTypes.RBRACE,
            SourcePawnTypes.LBRACKET,
            SourcePawnTypes.RBRACKET,
            SourcePawnTypes.EQEQ,
            SourcePawnTypes.NE,
            SourcePawnTypes.OROR,
            SourcePawnTypes.PLUSPLUS,
            SourcePawnTypes.MINUSMINUS,
            SourcePawnTypes.LT,
            SourcePawnTypes.LE,
            SourcePawnTypes.LTLT,
            SourcePawnTypes.GT,
            SourcePawnTypes.AND,
            SourcePawnTypes.ANDAND,
            SourcePawnTypes.PLUSEQ,
            SourcePawnTypes.MINUSEQ,
            SourcePawnTypes.ASTERISKEQ,
            SourcePawnTypes.DIVEQ,
            SourcePawnTypes.ANDEQ,
            SourcePawnTypes.OREQ,
            SourcePawnTypes.XOREQ,
            SourcePawnTypes.PERCEQ,
            SourcePawnTypes.LTLTEQ,
            SourcePawnTypes.GTGTEQ,
        )
        val LITERALS = TokenSet.create(
            SourcePawnTypes.INTEGER_LITERAL,
            SourcePawnTypes.FLOAT_LITERAL,
            SourcePawnTypes.HEX_LITERAL,
            SourcePawnTypes.BINARY_LITERAL,
            SourcePawnTypes.STRING_LITERAL,
            SourcePawnTypes.CHARACTER_LITERAL,
        )
        val STRINGS = TokenSet.create(
            SourcePawnTypes.STRING_LITERAL,
            SourcePawnTypes.CHARACTER_LITERAL,
        )
        val WHITE_SPACES = TokenSet.create(
            TokenType.WHITE_SPACE,
        )
    }
}
