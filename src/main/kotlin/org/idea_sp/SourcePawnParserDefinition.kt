package org.idea_sp

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.ParserDefinition.SpaceRequirements
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.idea_sp.parser.SourcePawnParser
import org.idea_sp.psi.SourcePawnFile
import org.idea_sp.psi.SourcePawnTypes
import java.io.Reader

class SourcePawnParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return FlexAdapter(_SourcePawnLexer(null as Reader?))
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }

    override fun getCommentTokens(): TokenSet {
        return SourcePawnTokenTypeSets.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return SourcePawnTokenTypeSets.STRINGS
    }

    override fun createParser(project: Project): PsiParser {
        return SourcePawnParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return SourcePawnFile(viewProvider)
    }

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): SpaceRequirements {
        return SpaceRequirements.MAY
    }

    override fun createElement(node: ASTNode): PsiElement {
        return SourcePawnTypes.Factory.createElement(node)
    }

    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val FILE = IFileElementType(SourcePawnLanguage)
    }
}
