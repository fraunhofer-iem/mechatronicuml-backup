package org.muml.ImplicitCopy.qvto.library;

import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ImplicitCopyBlackbox {

	public ImplicitCopyBlackbox() {
		super();
	}

	@SuppressWarnings("unchecked")
	public static void setValues(EObject element, EStructuralFeature feature, List<Object> values) {
		if (feature.isMany()) {
			EList<Object> listToSet = (EList<Object>) element.eGet(feature);
			ECollections.setEList(listToSet, values);
		} else if (values.isEmpty()) {
			element.eSet(feature, null);
		} else {
			element.eSet(feature, values.get(0));
		}
	}
}
