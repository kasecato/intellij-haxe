// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaxeLocalFunctionDeclaration extends HaxeNamedComponent {

  @Nullable
  public HaxeBlockStatement getBlockStatement();

  @NotNull
  public HaxeComponentName getComponentName();

  @Nullable
  public HaxeParameterList getParameterList();

  @Nullable
  public HaxeReturnStatementWithoutSemicolon getReturnStatementWithoutSemicolon();

  @Nullable
  public HaxeTypeParam getTypeParam();

  @Nullable
  public HaxeTypeTag getTypeTag();

}
