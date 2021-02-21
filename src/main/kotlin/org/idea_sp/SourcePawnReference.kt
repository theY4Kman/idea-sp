package org.idea_sp

import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.parentOfType
import org.idea_sp.psi.*
import org.jetbrains.annotations.NotNull

class SourcePawnReference(@NotNull element: PsiElement, rangeInElement: TextRange)
    : PsiReferenceBase<PsiElement>(element, rangeInElement), PsiPolyVariantReference
{
    val identifier: String = element.text

    constructor(@NotNull element: PsiElement) : this(element, TextRange(0, element.text.length))

    override fun resolve(): PsiElement? {
        val resolveResults = multiResolve(false)
        return if (resolveResults.size == 1) resolveResults[0].element else null
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val results = ArrayList<SourcePawnNamedElement>()

        val func = element.parentOfType<SourcePawnFunc>()
        if (func != null) {
            results.addAll(
                PsiTreeUtil
                    .findChildrenOfAnyType(
                        func,
                        SourcePawnLocalDeclItem::class.java,
                        SourcePawnParamDecl::class.java,
                    )
                    .filter { it.name == identifier }
            )
        }

        val project = myElement.project
        results.addAll(SourcePawnUtil.findGlobalDecls(project, identifier))

        return results.map { PsiElementResolveResult(it) }.toTypedArray()
    }
}
