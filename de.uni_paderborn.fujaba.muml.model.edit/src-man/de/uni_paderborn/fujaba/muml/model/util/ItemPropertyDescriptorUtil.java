package de.uni_paderborn.fujaba.muml.model.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class ItemPropertyDescriptorUtil {
	private ItemPropertyDescriptorUtil() {
		
	}

	public static EObject deduceContainer(EObject object, EClass type) {
		if (type == null || object == null) {
			return null;
		}

		// Make sure we do not return the same object
		object = object.eContainer();
		
		// Walk up the containment hierarchy
		while (object != null) {
			if (type.isSuperTypeOf(object.eClass())) {
				return object;
			}
			object = object.eContainer();
		}
		return null;
	}
}
