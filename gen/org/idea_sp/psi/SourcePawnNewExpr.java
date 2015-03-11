// This is a generated file. Not intended for manual editing.
package org.idea_sp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SourcePawnNewExpr extends PsiElement {

  @Nullable
  SourcePawnAssignOp getAssignOp();

  @Nullable
  SourcePawnExpression getExpression();

  @NotNull
  SourcePawnLocalStorageType getLocalStorageType();

  @NotNull
  PsiElement getIdentifier();

}
