package org.idea_sp

import com.intellij.lexer.FlexAdapter
import org.idea_sp._SourcePawnLexer
import java.io.Reader

class SourcePawnLexerAdapter : FlexAdapter(_SourcePawnLexer(null))