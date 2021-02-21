package org.idea_sp.psi

import org.jetbrains.annotations.NonNls
import com.intellij.psi.tree.IElementType
import org.idea_sp.SourcePawnLanguage

class SourcePawnElementType(@NonNls debugName: String) : IElementType(debugName, SourcePawnLanguage)
