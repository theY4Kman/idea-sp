package org.idea_sp;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SourcePawnFileType extends LanguageFileType {
    public static final SourcePawnFileType INSTANCE = new SourcePawnFileType();
 
    private SourcePawnFileType() {
        super(SourcePawnLanguage.INSTANCE);
    }
 
    @NotNull
    @Override
    public String getName() {
        return "SourcePawn file";
    }
 
    @NotNull
    @Override
    public String getDescription() {
        return "SourcePawn language file";
    }
 
    @NotNull
    @Override
    public String getDefaultExtension() {
        return "sp";
    }
 
    @Nullable
    @Override
    public Icon getIcon() {
        return SourcePawnIcons.FILE;
    }
}
