package org.idea_sp.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolService
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.idea_sp.psi.SourcePawnNamedElement
import org.idea_sp.psi.SourcePawnTypes
import org.jetbrains.annotations.NotNull


abstract class SourcePawnNamedElementImpl(@NotNull node: ASTNode) : ASTWrapperPsiElement(node), SourcePawnNamedElement {
    override fun getNameIdentifier(): PsiElement?
        = node.findChildByType(SourcePawnTypes.IDENTIFIER)?.psi

    override fun getName(): String? = nameIdentifier?.text

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getTextOffset(): Int = nameIdentifier?.textOffset ?: super.getTextOffset()

    @Suppress("UnstableApiUsage")
    override fun getDeclaringElement(): PsiElement = nameIdentifier ?: this

    @Suppress("UnstableApiUsage")
    override fun getDeclarationRange(): TextRange
        = nameIdentifier?.textRangeInParent ?: TextRange.create(0, textLength)

    @Suppress("UnstableApiUsage")
    override fun getSymbol(): Symbol = PsiSymbolService.getInstance().asSymbol(this)
}
