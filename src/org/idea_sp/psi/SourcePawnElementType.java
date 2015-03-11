package org.idea_sp.psi;

import com.intellij.psi.tree.IElementType;
import org.idea_sp.SourcePawnLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SourcePawnElementType extends IElementType {
    public SourcePawnElementType(@NotNull @NonNls String debugName) {
        super(debugName, SourcePawnLanguage.INSTANCE);
    }
}
