package de.uni_paderborn.fujaba.muml.common;

import org.eclipse.emf.ecore.EObject;
import org.muml.common.xtext.ILanguageResource;

public interface ILanguageResourceProvider {
	public boolean isProviderFor(EObject object);
	public ILanguageResource getLanguageResource();
}
