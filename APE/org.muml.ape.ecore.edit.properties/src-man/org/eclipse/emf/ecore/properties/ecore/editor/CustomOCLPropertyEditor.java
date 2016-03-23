package org.eclipse.emf.ecore.properties.ecore.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.ape.runtime.editors.OCLPropertyEditor;

public class CustomOCLPropertyEditor extends OCLPropertyEditor {

	public CustomOCLPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	// Find EClass object by running up the containment hierarchy and use it as context element
	protected void updateContext() {
		EObject object = element;
		
		while (object != null && false == object instanceof EClass) {
			object = object.eContainer();
		}
		if (object != null) {
			EClass eClass = (EClass) object;
			updateContext(eClass);
		}
	}

}
