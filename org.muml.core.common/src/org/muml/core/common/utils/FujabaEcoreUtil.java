package org.muml.core.common.utils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class FujabaEcoreUtil {
	private FujabaEcoreUtil() {
		// This class should not be instantiated; its methods should be used in
		// a static way.
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
