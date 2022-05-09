package org.idea_sp.psi

import com.intellij.psi.tree.IElementType
import org.idea_sp.SourcePawnLanguage
import org.jetbrains.annotations.NonNls

class SourcePawnTokenType(@NonNls debugName: String) : IElementType(debugName, SourcePawnLanguage) {
    override fun toString(): String = "SP(${super.toString()})"
}
