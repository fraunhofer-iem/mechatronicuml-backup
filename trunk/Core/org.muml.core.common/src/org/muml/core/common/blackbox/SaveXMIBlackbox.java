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

// This can be used for debugging purposes to save intermediate models etc.
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
		ResourceSet resourceSet = new ResourceSetImpl();
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
			try {
				resource.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			// Use this code to prevent cross references between intermediate models.
			//resource.getContents().clear();
		}
	}

}
