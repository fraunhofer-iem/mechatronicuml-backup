package de.upb.modelcopy.library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ModelcopyBlackbox {
	
	public ModelcopyBlackbox() {
		super();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void setValues(EObject element, EStructuralFeature feature, List<Object> newValues) {
		if (feature.isMany()) {
			// This keeps the ordering right for bidirectional references
			EList currentValues = (EList) element.eGet(feature);
			ECollections.setEList(currentValues, newValues);
		} else if (newValues.isEmpty()) {
			element.eSet(feature, null);
		} else {
			element.eSet(feature, newValues.get(0));
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<Object> getValues(EObject element, EStructuralFeature feature) {
		Object value = element.eGet(feature);
		if (feature.isMany()) {
			return new ArrayList<Object>((Collection) value);
		} else if (value != null) {
			return Collections.singletonList(value);
		}
		return Collections.emptyList();
	}
}



