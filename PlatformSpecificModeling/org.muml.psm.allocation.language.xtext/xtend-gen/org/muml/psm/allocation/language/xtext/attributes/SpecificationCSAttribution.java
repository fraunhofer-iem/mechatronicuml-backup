package org.muml.psm.allocation.language.xtext.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.xtext.completeocl.attributes.CompleteOCLDocumentCSAttribution;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;

@SuppressWarnings("all")
public class SpecificationCSAttribution extends CompleteOCLDocumentCSAttribution {
  @NonNull
  public final static SpecificationCSAttribution INSTANCE = new SpecificationCSAttribution();
  
  @Override
  public ScopeView computeLookup(@NonNull final EObject target, @NonNull final EnvironmentView environmentView, @NonNull final ScopeView scopeView) {
    ScopeView _xblockexpression = null;
    {
      final ScopeView outerScopeView = super.computeLookup(target, environmentView, scopeView);
      final EObject child = scopeView.getChild();
      boolean _and = false;
      boolean _hasFinalResult = environmentView.hasFinalResult();
      boolean _not = (!_hasFinalResult);
      if (!_not) {
        _and = false;
      } else {
        _and = (child instanceof ClassifierContextDeclCS);
      }
      if (_and) {
        environmentView.addRootPackages();
      }
      _xblockexpression = outerScopeView;
    }
    return _xblockexpression;
  }
}
