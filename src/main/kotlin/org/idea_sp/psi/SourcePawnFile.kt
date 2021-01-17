package org.idea_sp.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.idea_sp.SourcePawnFileType;
import org.idea_sp.SourcePawnLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SourcePawnFile extends PsiFileBase {
    public SourcePawnFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SourcePawnLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SourcePawnFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "SourcePawn File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
