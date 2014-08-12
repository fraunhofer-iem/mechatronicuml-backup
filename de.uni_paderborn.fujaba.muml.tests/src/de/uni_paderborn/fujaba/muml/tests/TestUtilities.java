package de.uni_paderborn.fujaba.muml.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
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
			String projectName, String resourcePath) throws Exception {

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
		
		// XXX: new File("") yields the working directory of the running JVM
		// the lines below assume that this working directory is always a project folder (de.uni_paderborn.fujaba.muml.tests) under the workspace root
		// however, the working directory can be changed in the JUnit launch configuration and might differ from this project folder
		String workspaceRoot = new File("").getAbsoluteFile().getParentFile().getAbsolutePath();
	
		IPath projectPath = new Path(workspaceRoot).append(projectName);
		
		List<IPath> triedPaths = new ArrayList<IPath>();
		triedPaths.add(projectPath);

		// insert "sdm" path to match workspace structure on continuous integration server (old)
		if (!new File(projectPath.toOSString()).exists()) {
			projectPath = new Path(workspaceRoot).append("sdm").append(projectName);
			triedPaths.add(projectPath);
		}
		
		// adapt path to match workspace structure on continuous integration server (new)
		if (!new File(projectPath.toOSString()).exists()) {
			projectPath = new Path(workspaceRoot + "../../").append("FujabaCore").append("workspace").append("plugins").append(projectName);
			triedPaths.add(projectPath);
		}
		
		// If file could not be found ultimately, display error message!
		if (!new File(projectPath.toOSString()).exists()) {
			StringBuffer message = new StringBuffer();
			message.append("registerWorkspaceProject() could not find project ");
			message.append(projectName);
			message.append(". Tried paths:");
			for (IPath path : triedPaths) {
				message.append("\n\t*");
				message.append(path.toOSString());
			}
			Assert.isTrue(false, message.toString());
		}

		// add a trailing separator to avoid cutting off the project name in URI$Hierarchical.mergePath
		URI uri = URI.createFileURI(projectPath.addTrailingSeparator().toPortableString());
				
		// Register platform mapping for project
		EcorePlugin.getPlatformResourceMap().put(projectName,uri);
	}
}
