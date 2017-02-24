package org.muml.ImplicitCopy.qvto.library;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;


public class ImplicitCopyBlackbox {
	
	public ImplicitCopyBlackbox() {
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

}



