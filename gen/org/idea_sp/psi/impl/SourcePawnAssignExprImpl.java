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

public class SourcePawnAssignExprImpl extends ASTWrapperPsiElement implements SourcePawnAssignExpr {

  public SourcePawnAssignExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitAssignExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SourcePawnAnyAssignOp getAnyAssignOp() {
    return findNotNullChildByClass(SourcePawnAnyAssignOp.class);
  }

  @Override
  @NotNull
  public SourcePawnExpression getExpression() {
    return findNotNullChildByClass(SourcePawnExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
