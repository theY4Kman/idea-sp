package org.idea_sp.psi

import org.jetbrains.annotations.NonNls
import com.intellij.psi.tree.IElementType
import org.idea_sp.SourcePawnLanguage
import com.intellij.psi.FileViewProvider
import com.intellij.extapi.psi.PsiFileBase
import org.idea_sp.SourcePawnFileType

class SourcePawnElementType(@NonNls debugName: String) : IElementType(debugName, SourcePawnLanguage)