package de.uni_paderborn.fujaba.properties.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.properties.runtime.editors.OCLPropertyEditor;

public class CustomOCLPropertyEditor extends OCLPropertyEditor {

	public CustomOCLPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	// Find Class object by running up the containment hierarchy and use it as context element
	protected void updateContext() {
		EObject object = element;
		
		while (object != null && false == object instanceof de.uni_paderborn.fujaba.properties.Class) {
			object = object.eContainer();
		}
		if (object != null) {
			de.uni_paderborn.fujaba.properties.Class clazz = (de.uni_paderborn.fujaba.properties.Class) object;
			updateContext(clazz.getGenClass().getEcoreClassifier());
		}
	}

}
