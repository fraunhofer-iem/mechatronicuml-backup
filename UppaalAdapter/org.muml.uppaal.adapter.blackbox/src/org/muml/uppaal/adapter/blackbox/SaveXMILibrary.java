package org.muml.uppaal.adapter.blackbox;

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

// This is only used to save intermediate models from within QVTO
public class SaveXMILibrary {

	private static final String PROJECT_NAME = "Intermediate Models";

	public SaveXMILibrary() {}

	public void save(Collection<Object> objects, String filename) {
		if (ResourcesPlugin.getWorkspace() != null && ResourcesPlugin.getWorkspace().getRoot() != null) {
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(PROJECT_NAME);
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
		Resource resource = resourceSet.createResource(URI.createURI("platform:/resource/" + PROJECT_NAME + "/" + filename));
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
		}
	}

}
