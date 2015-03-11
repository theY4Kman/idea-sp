package org.idea_sp;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class SourcePawnLexerAdapter extends FlexAdapter {
    public SourcePawnLexerAdapter() {
        super(new _SourcePawnLexer((Reader) null));
    }
}
