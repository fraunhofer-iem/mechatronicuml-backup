package de.uni_paderborn.fujaba.modelcopy.qvto.library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


public class ModelcopyBlackbox {
	
	public ModelcopyBlackbox() {
		super();
	}

	public static void setValues(EObject element, EStructuralFeature feature, List<Object> values) {
		if (feature.isMany()) {
			element.eSet(feature, values);
		} else if (values.isEmpty()) {
			element.eSet(feature, null);
		} else {
			element.eSet(feature, values.get(0));
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
	
	
//	@Operation(contextual=true)
//	public static boolean before(Date self, Date when) {
//		return self.before(when);
//	}
//	
}



