package de.uni_paderborn.fujaba.muml.tests;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class TestUtilities {

	private TestUtilities() {
		// prevent instantiation
	}
	

	public static Resource loadResource(ResourceSet resourceSet,
			String projectName, String resourcePath) {
		Resource resource = null;
		URI uri = URI.createPlatformResourceURI(projectName + resourcePath,
				true);
		if (uri == null) {
			throw new NullPointerException("URI could not be created");
		}

		registerWorkspaceProject(projectName);
		
		// Load resource
		resource = resourceSet.getResource(uri, true);
		if (resource == null) {
			throw new NullPointerException("Resource could not be loaded");
		}

		// Resolve all referenced models
		EcoreUtil.resolveAll(resourceSet);

		return resource;
	}


	public static void registerWorkspaceProject(String projectName) {
		// Find out absolute path of project
		StringBuffer absoluteProjectPath = new StringBuffer();
		absoluteProjectPath.append(new File("").getAbsoluteFile()
				.getParentFile());
		absoluteProjectPath.append('/');
		absoluteProjectPath.append(projectName);
		// no idea why, but this is necessary two times :)
		absoluteProjectPath.append('/');
		absoluteProjectPath.append(projectName);

		// Register platform mapping for project
		EcorePlugin.getPlatformResourceMap().put(projectName,
				URI.createFileURI(absoluteProjectPath.toString()));		
	}
}
