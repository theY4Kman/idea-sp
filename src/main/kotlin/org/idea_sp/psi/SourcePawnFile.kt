package org.idea_sp.psi

import org.idea_sp.SourcePawnLanguage
import com.intellij.psi.FileViewProvider
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import org.idea_sp.SourcePawnFileType

class SourcePawnFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, SourcePawnLanguage) {
    override fun getFileType(): FileType = SourcePawnFileType

    override fun toString(): String = "SourcePawn File"
}