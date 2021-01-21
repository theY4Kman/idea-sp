package org.idea_sp.psi

import org.jetbrains.annotations.NonNls
import com.intellij.psi.tree.IElementType
import org.idea_sp.SourcePawnLanguage
import com.intellij.psi.FileViewProvider
import com.intellij.extapi.psi.PsiFileBase
import org.idea_sp.SourcePawnFileType

class SourcePawnTokenType(@NonNls debugName: String) : IElementType(debugName, SourcePawnLanguage) {
    override fun toString(): String = "SourcePawnTokenType." + super.toString()
}