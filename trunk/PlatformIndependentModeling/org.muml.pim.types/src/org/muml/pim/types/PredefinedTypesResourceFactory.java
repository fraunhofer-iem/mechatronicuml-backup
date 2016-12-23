package org.muml.pim.types;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * This ResourceFactory ensures that the PredefinedTypes resource is only
 * created once (as singleton).
 * 
 * This is considered harmful, we should load the Predefined Types Resource in
 * every ResourceSet. See bug #1379 for details.
 * 
 * @author bingo
 * @deprecated Do not use this anymore, but instead make sure that Predefined Types are loaded in every ResourceSet (see #1379).
 *
 */
@Deprecated
public class PredefinedTypesResourceFactory implements Resource.Factory {

	public PredefinedTypesResourceFactory() {

	}

	/**
	 * @deprecated Please use TypesBlackbox.PREDEFINED_TYPES_URI
	 */
	@Deprecated
	public static URI PREDEFINED_TYPES_URI = URI
			.createURI("platform:/plugin/org.muml.pim.types/model/predefined.mumltypes");

	private static Resource PREDEFINED_TYPES_RESOURCE = null;

	public static Resource getResource() {
		if (PREDEFINED_TYPES_RESOURCE == null) {
			PREDEFINED_TYPES_RESOURCE = new XMIResourceImpl(PREDEFINED_TYPES_URI);
			try {
				PREDEFINED_TYPES_RESOURCE.load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return PREDEFINED_TYPES_RESOURCE;
	}

	public Resource createResource(URI uri) {
		if (PREDEFINED_TYPES_URI.equals(uri)) {
			return getResource();
		}
		return null;
	}

}
