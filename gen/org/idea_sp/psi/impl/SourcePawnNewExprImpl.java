// This is a generated file. Not intended for manual editing.
package org.idea_sp.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.idea_sp.psi.SourcePawnTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.idea_sp.psi.*;

public class SourcePawnNewExprImpl extends ASTWrapperPsiElement implements SourcePawnNewExpr {

  public SourcePawnNewExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitNewExpr(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SourcePawnAssignOp getAssignOp() {
    return findChildByClass(SourcePawnAssignOp.class);
  }

  @Override
  @Nullable
  public SourcePawnExpression getExpression() {
    return findChildByClass(SourcePawnExpression.class);
  }

  @Override
  @NotNull
  public SourcePawnLocalStorageType getLocalStorageType() {
    return findNotNullChildByClass(SourcePawnLocalStorageType.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
