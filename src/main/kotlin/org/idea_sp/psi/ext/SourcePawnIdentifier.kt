package org.idea_sp.psi.ext

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiReference
import org.idea_sp.SourcePawnReference
import org.idea_sp.psi.SourcePawnIdentifier
import org.idea_sp.psi.SourcePawnNamedElement

abstract class SourcePawnIdentifierMixin(node: ASTNode) : ASTWrapperPsiElement(node), SourcePawnIdentifier {
    override fun getReference(): PsiReference?
        = when (parent) {
            is SourcePawnNamedElement -> null
            else -> SourcePawnReference(this)
        }
}
