package org.idea_sp

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.idea_sp.psi.SourcePawnTypes

class SourcePawnSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
        val LINE_COMMENT = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val DOC_COMMENT = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT)
        val TYPE = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_TYPE", DefaultLanguageHighlighterColors.CLASS_REFERENCE)
        val IDENTIFIER = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
        val NUMBER = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val KEYWORD = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val STRING = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_STRING", DefaultLanguageHighlighterColors.STRING)
        val OPERATOR = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val BRACES = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_BRACES", DefaultLanguageHighlighterColors.BRACES)
        val DOT = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_DOT", DefaultLanguageHighlighterColors.DOT)
        val SEMICOLON = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
        val COMMA = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_COMMA", DefaultLanguageHighlighterColors.COMMA)
        val PARENTHESES = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
        val BRACKETS = TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)

        private val ATTRIBUTES: Map<IElementType, TextAttributesKey> = hashMapOf(
            SourcePawnTypes.BLOCK_COMMENT to BLOCK_COMMENT,
            SourcePawnTypes.DOC_COMMENT to DOC_COMMENT,
            SourcePawnTypes.LINE_COMMENT to LINE_COMMENT,
            SourcePawnTypes.PREPROCESSOR_COMMENT to LINE_COMMENT,

            SourcePawnTypes.LBRACE to BRACES,
            SourcePawnTypes.RBRACE to BRACES,
            SourcePawnTypes.DOT to DOT,
            SourcePawnTypes.SEMICOLON to SEMICOLON,
            SourcePawnTypes.COMMA to COMMA,
            SourcePawnTypes.LPAREN to PARENTHESES,
            SourcePawnTypes.RPAREN to PARENTHESES,
            SourcePawnTypes.LBRACKET to BRACKETS,
            SourcePawnTypes.RBRACKET to BRACKETS,

            SourcePawnTypes.SYMBOL to IDENTIFIER,

            SourcePawnTypes.TYPE_EXPRESSION to TYPE,

            SourcePawnTypes.NUMBER to NUMBER,
            SourcePawnTypes.RATIONAL to NUMBER,
            SourcePawnTypes.INTEGER to NUMBER,
        )

        init {
            fillMap(ATTRIBUTES, SourcePawnTokenTypeSets.KEYWORDS, KEYWORD);
            fillMap(ATTRIBUTES, SourcePawnTokenTypeSets.OPERATORS, OPERATOR);
            fillMap(ATTRIBUTES, SourcePawnTokenTypeSets.STRINGS, STRING);
        }
    }

    override fun getHighlightingLexer(): Lexer = FlexAdapter(_SourcePawnLexer(null))

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> =
        pack(ATTRIBUTES[tokenType])
}
