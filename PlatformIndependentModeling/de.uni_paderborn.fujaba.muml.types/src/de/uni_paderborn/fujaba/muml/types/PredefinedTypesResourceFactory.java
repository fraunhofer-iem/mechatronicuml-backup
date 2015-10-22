package de.uni_paderborn.fujaba.muml.types;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class PredefinedTypesResourceFactory implements Resource.Factory {

	public static URI PREDEFINED_TYPES_URI = URI.createURI("platform:/plugin/de.uni_paderborn.fujaba.muml.types/model/predefined.mumltypes");

	private static Resource PREDEFINED_TYPES_RESOURCE = null;

	public static Resource getResource() {
		if (PREDEFINED_TYPES_RESOURCE == null) {
			PREDEFINED_TYPES_RESOURCE = new XMIResourceImpl(PREDEFINED_TYPES_URI);
			try {
				PREDEFINED_TYPES_RESOURCE.load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
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
