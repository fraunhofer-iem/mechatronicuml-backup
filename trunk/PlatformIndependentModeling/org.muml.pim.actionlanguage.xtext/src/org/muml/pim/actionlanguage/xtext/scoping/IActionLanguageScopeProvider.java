package org.muml.pim.actionlanguage.xtext.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScopeProvider;

public interface IActionLanguageScopeProvider extends IScopeProvider {
	public void setScopeForEObject(EObject object);
}
