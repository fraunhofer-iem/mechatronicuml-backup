package de.uni_paderborn.fujaba.muml.ui.properties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.ape.runtime.editors.AbstractSingleFeatureXtextPropertyEditor;
import org.muml.core.common.xtext.ILoadResult;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.ui.internal.ActionLanguageActivator;

public class XtextPropertyEditor extends
		AbstractSingleFeatureXtextPropertyEditor { 
	
	private static final String languageName = "de.uni_paderborn.fujaba.muml.ActionLanguage";
	
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
