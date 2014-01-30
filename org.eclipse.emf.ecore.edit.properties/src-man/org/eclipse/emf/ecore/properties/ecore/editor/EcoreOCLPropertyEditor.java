package org.eclipse.emf.ecore.properties.ecore.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor;
import de.uni_paderborn.fujaba.properties.runtime.editors.OCLPropertyEditor;

public class EcoreOCLPropertyEditor extends OCLPropertyEditor {

	public EcoreOCLPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

}
