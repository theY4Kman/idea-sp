package org.idea_sp

import com.intellij.psi.tree.TokenSet
import org.idea_sp.psi.SourcePawnTypes

interface SourcePawnTokenTypeSets {
    companion object {
        val COMMENTS = TokenSet.create(
            SourcePawnTypes.LINE_COMMENT,
            SourcePawnTypes.BLOCK_COMMENT,
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
            SourcePawnTypes.DEFINED_KEYWORD,
            SourcePawnTypes.SIZEOF_KEYWORD,
            SourcePawnTypes.STATE_KEYWORD,
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
            SourcePawnTypes.NEW_KEYWORD,
            SourcePawnTypes.PUBLIC_KEYWORD
        )
    }
}