package org.muml.core.tests;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class TestUtilities {
	private TestUtilities() {
	}
	
	public static Resource loadResource(ResourceSet resourceSet, String path) throws IOException {
		return loadResource(resourceSet, URI.createPlatformPluginURI(path, true));
	}

	public static Resource loadResource(ResourceSet resourceSet, URI uri) throws IOException {
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(Collections.emptyMap());
		EcoreUtil.resolveAll(resourceSet);
		return resource;
	}
}
