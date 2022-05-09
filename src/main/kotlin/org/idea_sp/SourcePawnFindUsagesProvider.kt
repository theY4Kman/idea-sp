package org.idea_sp

import com.intellij.lang.cacheBuilder.DefaultWordsScanner
import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.TokenSet
import com.intellij.psi.util.parentOfType
import org.idea_sp.psi.*

class SourcePawnFindUsagesProvider : FindUsagesProvider {
    override fun getWordsScanner(): WordsScanner
        = DefaultWordsScanner(
            SourcePawnLexerAdapter(),
            TokenSet.create(SourcePawnTypes.SYMBOL),
            SourcePawnTokenTypeSets.COMMENTS,
            SourcePawnTokenTypeSets.LITERALS,
        )

    override fun canFindUsagesFor(psiElement: PsiElement): Boolean
        = psiElement is SourcePawnNamedElement

    override fun getHelpId(psiElement: PsiElement): String? = null

    override fun getType(element: PsiElement): String {
        return when (element) {
            is SourcePawnLocalDeclItem -> "local variable"
            is SourcePawnGlobalVarDecl -> "global variable"
            is SourcePawnEnumItem -> "enum value"
            is SourcePawnEnumDecl -> "enum type"
            is SourcePawnParamDecl,
            is SourcePawnTypedefParamDecl -> "parameter"
            is SourcePawnFunc,
            is SourcePawnFuncDecl -> "function"
            is SourcePawnStructField -> "struct field"
            is SourcePawnStructDecl -> "struct type"
            is SourcePawnTypeset -> "typeset"
            is SourcePawnTypedef -> "typedef"
            is SourcePawnMethodmap -> "methodmap"
            is SourcePawnMethodmapMethod -> "methodmap function"
            is SourcePawnMethodmapProp -> "methodmap prop"
            else -> ""  // XXX: use something generic rather than empty string?
        }
    }

    override fun getDescriptiveName(element: PsiElement): String {
        if (element is SourcePawnNamedElement && element.name != null) {
            return element.name!!
        }
        return ""
    }

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String {
        if (element is SourcePawnLocalDeclItem) {
            val decl = element.parentOfType<SourcePawnLocalDecl>()!!
            val prefix =
                decl.typeExpression?.let { type -> "${type.text} " }
                    ?: decl.tags?.text
            return "${prefix}${element.identifier.text}"
        }
        return element.text
    }
}
