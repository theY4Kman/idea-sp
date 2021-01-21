package org.idea_sp

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.idea_sp.SourcePawnTokenTypeSets.Companion.COMMENTS
import org.idea_sp.SourcePawnTokenTypeSets.Companion.KEYWORDS
import org.idea_sp.psi.SourcePawnTypes

class SourcePawnSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val OPERATOR = TextAttributesKey.createTextAttributesKey(
            "SOURCE_PAWN_ASSIGN",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        val LITERAL =
            TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_CONSTANT", DefaultLanguageHighlighterColors.CONSTANT)
        val RESERVED =
            TextAttributesKey.createTextAttributesKey("SOURCE_PAWN_RESERVED", DefaultLanguageHighlighterColors.KEYWORD)
        val COMMENT = TextAttributesKey.createTextAttributesKey(
            "SOURCE_PAWN_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
        )

        private val ATTRIBUTES: Map<IElementType, TextAttributesKey> = hashMapOf(
            SourcePawnTypes.EQ to OPERATOR,
            SourcePawnTypes.LITERAL to LITERAL,
        )

        init {
            fillMap(ATTRIBUTES, KEYWORDS, RESERVED);
            fillMap(ATTRIBUTES, COMMENTS, COMMENT);
        }
    }

    override fun getHighlightingLexer(): Lexer = FlexAdapter(_SourcePawnLexer(null))

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> = pack(ATTRIBUTES[tokenType])
}