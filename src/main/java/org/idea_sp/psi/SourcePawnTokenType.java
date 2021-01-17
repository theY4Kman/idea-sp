package org.idea_sp.psi;

import com.intellij.psi.tree.IElementType;
import org.idea_sp.SourcePawnLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SourcePawnTokenType extends IElementType {
    public SourcePawnTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SourcePawnLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SourcePawnTokenType." + super.toString();
    }
}
