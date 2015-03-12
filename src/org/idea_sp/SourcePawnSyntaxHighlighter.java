package org.idea_sp;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.idea_sp.psi.SourcePawnTypes;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
import static org.idea_sp.SourcePawnTokenTypeSets.*;

public class SourcePawnSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("SOURCE_PAWN_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey LITERAL = createTextAttributesKey("SOURCE_PAWN_CONSTANT", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey RESERVED = createTextAttributesKey("SOURCE_PAWN_RESERVED", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("SOURCE_PAWN_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();

    static {
        ATTRIBUTES.put(SourcePawnTypes.EQ, OPERATOR);
        ATTRIBUTES.put(SourcePawnTypes.LITERAL, LITERAL);

        fillMap(ATTRIBUTES, KEYWORDS, RESERVED);
        fillMap(ATTRIBUTES, COMMENTS, COMMENT);
    }


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(new _SourcePawnLexer((Reader) null));
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        // I'm not sure what tokenType is supposed to be, because it doesn't
        // seem to match STORAGE_CLASS or LITERAL

        return pack(ATTRIBUTES.get(tokenType));
    }
}
