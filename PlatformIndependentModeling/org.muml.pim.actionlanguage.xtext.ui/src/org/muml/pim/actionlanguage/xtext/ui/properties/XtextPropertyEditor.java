package org.muml.pim.actionlanguage.xtext.ui.properties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.ape.runtime.editors.AbstractSingleFeatureXtextPropertyEditor;
import org.muml.core.common.xtext.ILoadResult;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.actionlanguage.xtext.ui.internal.ActionLanguageActivator;

public class XtextPropertyEditor extends
		AbstractSingleFeatureXtextPropertyEditor { 
	
	private static final String languageName = "org.muml.pim.actionlanguage.xtext.ActionLanguage";
	
	public XtextPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature, ActionLanguageActivator.getInstance()
				.getInjector(languageName));
	}

	@Override
	protected EObject parse(String text) {
		ILoadResult loadResult = LanguageResource.loadFromString(text, element);
		return loadResult.getEObject();
	}


	@Override
	protected String serializeEObject(EObject object) {
		return LanguageResource.serializeEObjectSafe(object, element);
	}

	
}
