package org.idea_sp;


import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.idea_sp.parser.SourcePawnParser;
import org.idea_sp.psi.SourcePawnFile;
import org.idea_sp.psi.SourcePawnTypes;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

public class SourcePawnParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(SourcePawnTypes.LINE_COMMENT, SourcePawnTypes.BLOCK_COMMENT, SourcePawnTypes.PREPROCESSOR_COMMENT);
    public static final TokenSet STRING_LITERALS = TokenSet.create(SourcePawnTypes.STRING_LITERAL, SourcePawnTypes.CHARACTER_LITERAL);

    public static final IFileElementType FILE = new IFileElementType(Language.<SourcePawnLanguage>findInstance(SourcePawnLanguage.class));
 
    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new FlexAdapter(new _SourcePawnLexer((Reader) null));
    }
 
    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }
 
    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }
 
    @NotNull
    public TokenSet getStringLiteralElements() {
        return STRING_LITERALS;
    }
 
    @NotNull
    public PsiParser createParser(final Project project) {
        return new SourcePawnParser();
    }
 
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }
 
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new SourcePawnFile(viewProvider);
    }
 
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
 
    @NotNull
    public PsiElement createElement(ASTNode node) {
        return SourcePawnTypes.Factory.createElement(node);
    }
}
