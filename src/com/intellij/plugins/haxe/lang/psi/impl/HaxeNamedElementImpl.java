package com.intellij.plugins.haxe.lang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.plugins.haxe.lang.psi.HaxeComponentName;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author: Fedor.Korotkov
 */
public abstract class HaxeNamedElementImpl extends HaxePsiCompositeElementImpl implements HaxeComponentName {
  public HaxeNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
    return this;
  }

  @Override
  public String getName() {
    return getIdentifier().getText();
  }
}
