package org.idea_sp;

import com.intellij.psi.tree.TokenSet;

import static org.idea_sp.psi.SourcePawnTypes.*;

public interface SourcePawnTokenTypeSets {
    TokenSet COMMENTS = TokenSet.create(
            LINE_COMMENT,
            BLOCK_COMMENT,
            PREPROCESSOR_COMMENT
    );

    TokenSet KEYWORDS = TokenSet.create(
            ASSERT_KEYWORD,
            BREAK_KEYWORD,
            CASE_KEYWORD,
            CONTINUE_KEYWORD,
            DEFAULT_KEYWORD,
            DO_KEYWORD,
            ELSE_KEYWORD,
            EXIT_KEYWORD,
            FOR_KEYWORD,
            GOTO_KEYWORD,
            IF_KEYWORD,
            RETURN_KEYWORD,
            SLEEP_KEYWORD,
            STATE_KEYWORD,
            SWITCH_KEYWORD,
            WHILE_KEYWORD,
            DEFINED_KEYWORD,
            SIZEOF_KEYWORD,
            STATE_KEYWORD,
            TAGOF_KEYWORD,
            CONST_KEYWORD,
            FORWARD_KEYWORD,
            NATIVE_KEYWORD,
            NEW_KEYWORD,
            OPERATOR_KEYWORD,
            PUBLIC_KEYWORD,
            STATIC_KEYWORD,
            STOCK_KEYWORD,
            DECL_KEYWORD,
            NEW_KEYWORD,
            PUBLIC_KEYWORD
    );
}
