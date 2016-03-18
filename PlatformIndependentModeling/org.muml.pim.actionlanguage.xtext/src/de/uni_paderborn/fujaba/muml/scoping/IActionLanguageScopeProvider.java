package de.uni_paderborn.fujaba.muml.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScopeProvider;

public interface IActionLanguageScopeProvider extends IScopeProvider {
	public void setScopeForEObject(EObject object);
}
