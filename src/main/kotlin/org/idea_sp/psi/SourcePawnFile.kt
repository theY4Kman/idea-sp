package org.idea_sp.psi

import org.idea_sp.SourcePawnLanguage
import com.intellij.psi.FileViewProvider
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.util.PsiTreeUtil
import org.idea_sp.SourcePawnFileType

class SourcePawnFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, SourcePawnLanguage) {
    override fun getFileType(): FileType = SourcePawnFileType

    override fun toString(): String = "SourcePawn File"

    val globalDecls: Collection<SourcePawnNamedElement>
        get() = PsiTreeUtil
                    .findChildrenOfAnyType(this,
                        // TODO: filter out non-public functions/decls
                        SourcePawnFunc::class.java,
                        SourcePawnGlobalVarDecl::class.java,
                        SourcePawnFuncDecl::class.java,
                        SourcePawnMethodmap::class.java,
                        SourcePawnEnumItem::class.java,
                    )

    val includedFiles: Collection<SourcePawnFile>
        get() {
            TODO("#include is yet to be parsed")
        }
}
