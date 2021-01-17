package org.idea_sp;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
 
import javax.swing.*;
import java.util.Map;
 
public class SourcePawnColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Operator", SourcePawnSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Literal", SourcePawnSyntaxHighlighter.LITERAL),
            new AttributesDescriptor("Reserved", SourcePawnSyntaxHighlighter.RESERVED),
            new AttributesDescriptor("Comment", SourcePawnSyntaxHighlighter.COMMENT),
    };
 
    @Nullable
    @Override
    public Icon getIcon() {
        return SourcePawnIcons.FILE;
    }
 
    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new SourcePawnSyntaxHighlighter();
    }
 
    @NotNull
    @Override
    public String getDemoText() {
        return "// Here's a comment!\n" +
                "static a = 4;\n" +
                "public static const char s[] = \"test\";";
    }
 
    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }
 
    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }
 
    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }
 
    @NotNull
    @Override
    public String getDisplayName() {
        return "SourcePawn";
    }
}
