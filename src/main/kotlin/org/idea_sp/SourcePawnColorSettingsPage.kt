package org.idea_sp

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class SourcePawnColorSettingsPage : ColorSettingsPage {
    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor(
                "Operator", TextAttributesKey.createTextAttributesKey(
                    "SOURCE_PAWN_OPERATOR",
                    DefaultLanguageHighlighterColors.OPERATION_SIGN
                )
            ),
            AttributesDescriptor(
                "Literal", TextAttributesKey.createTextAttributesKey(
                    "SOURCE_PAWN_CONSTANT",
                    DefaultLanguageHighlighterColors.CONSTANT
                )
            ),
            AttributesDescriptor(
                "Reserved", TextAttributesKey.createTextAttributesKey(
                    "SOURCE_PAWN_RESERVED",
                    DefaultLanguageHighlighterColors.KEYWORD
                )
            ),
            AttributesDescriptor(
                "Comment", TextAttributesKey.createTextAttributesKey(
                    "SOURCE_PAWN_COMMENT",
                    DefaultLanguageHighlighterColors.LINE_COMMENT
                )
            ),
        );
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String = "SourcePawn";

    override fun getIcon(): Icon? = SourcePawnIcons.FILE;

    override fun getHighlighter(): SyntaxHighlighter = SourcePawnSyntaxHighlighter()

    override fun getDemoText(): String = """
        // Here's a comment!
        static a = 4;
        public static const char s[] = "test";
        """.trimIndent()

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? = null
}
