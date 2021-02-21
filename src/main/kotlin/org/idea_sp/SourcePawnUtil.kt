package org.idea_sp

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import org.idea_sp.psi.SourcePawnFile
import org.idea_sp.psi.SourcePawnNamedElement


class SourcePawnUtil {
    companion object {
        fun findGlobalDecls(project: Project, name: String): List<SourcePawnNamedElement> {
            val psiManager = PsiManager.getInstance(project)
            return (
                FileTypeIndex
                    .getFiles(SourcePawnFileType, GlobalSearchScope.allScope(project))
                    .mapNotNull { psiManager.findFile(it) as SourcePawnFile? }
                    .flatMap { it.globalDecls.filter { decl -> decl.name == name } }
            )
        }
    }
}
