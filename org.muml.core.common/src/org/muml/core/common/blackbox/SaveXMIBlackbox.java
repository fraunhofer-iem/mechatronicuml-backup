package org.muml.core.common.blackbox;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * 
 * This can be used for debugging purposes to save intermediate models etc.
 * 
 * For configuration options, see class SaveXMIConfiguration which can be
 * accessed and configured by java code.
 * 
 * @author ingo
 *
 */
public class SaveXMIBlackbox {
	
	public SaveXMIBlackbox() {}

	public void save(Collection<Object> objects, String projectName, String filename) {
		if (ResourcesPlugin.getWorkspace() != null && ResourcesPlugin.getWorkspace().getRoot() != null) {
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			try {
				if (!project.exists()) {
					project.create(new NullProgressMonitor());
				}
				if (!project.isOpen()) {
					project.open(new NullProgressMonitor());
				}
			} catch (CoreException e) {
			}
		}
		
		// Get options
		SaveXMIConfiguration.Options options = SaveXMIConfiguration.getCurrentOptions();
		ResourceSet resourceSet = null;
		boolean saveDirectly = true;
		if (options != null) {
			resourceSet = options.resourceSet;
			saveDirectly = options.saveDirectly;
		}
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		
		// Create resource
		Resource resource = resourceSet.createResource(URI.createURI("platform:/resource/" + projectName + "/" + filename));
		if (resource != null) {
			for (Object object : objects) {
				if (object instanceof EObject) {
					EObject element = (EObject) object;
					if (element.eResource() != null && element.eResource().getURI().isPlatformResource()) {
						continue;
					}
					if (element.eContainer() != null) {
						continue;
					}
					resource.getContents().add(element);
				}
			}
			
			// Save directly if requested
			if (saveDirectly) {
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
