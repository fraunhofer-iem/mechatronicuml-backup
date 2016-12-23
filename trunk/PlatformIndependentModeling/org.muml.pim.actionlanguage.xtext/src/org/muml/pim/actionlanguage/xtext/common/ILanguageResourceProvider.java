package org.muml.pim.actionlanguage.xtext.common;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.common.xtext.ILanguageResource;

public interface ILanguageResourceProvider {
	public boolean isProviderFor(EObject object);
	public ILanguageResource getLanguageResource();
}
