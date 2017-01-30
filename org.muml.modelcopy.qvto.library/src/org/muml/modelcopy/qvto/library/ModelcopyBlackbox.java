package org.muml.modelcopy.qvto.library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;


public class ModelcopyBlackbox {
	
	public ModelcopyBlackbox() {
		super();
	}

	@SuppressWarnings("unchecked")
	public static void setValues(EObject element, EStructuralFeature feature, List<Object> values) {
		if (feature.isMany()) {
			if (isBidirectional(feature)) {
				InternalEList<Object> target = ((InternalEList<Object>) element.eGet(feature));
				int index = 0;
				for (Object value : values) {
					int position = target.indexOf(value);
					if (position == -1) {
						target.addUnique(index, value);
					} else if (index != position) {
						target.move(index, value);
					}
					index++;
				}
			} else {
				element.eSet(feature, values);
			}
		} else if (values.isEmpty()) {
			element.eSet(feature, null);
		} else {
			element.eSet(feature, values.get(0));
		}
	}
	
	private static boolean isBidirectional(EStructuralFeature feature) {
		if (feature instanceof EReference) {
			return ((EReference) feature).getEOpposite() != null;
		}
		return false;
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



