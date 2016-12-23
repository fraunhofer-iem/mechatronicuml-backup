package org.muml.core.browser.old.providers;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

public interface IModifiedElementProvider {
	void addModifiedElement(EObject notifier);
	void removeModifiedElements(Resource resource);
	boolean isModifiedElement(Object element);
	Collection<Resource> getModifiedResources();
	
	public static class Default implements IModifiedElementProvider {

		private Map<IFile, Resource> fileToResource = new HashMap<IFile, Resource>();
		private Map<Resource, IFile> resourceToFile = new HashMap<Resource, IFile>();
		private Map<Resource, Set<EObject>> modifiedElements = new HashMap<Resource, Set<EObject>>();
		
		public void addModifiedElement(EObject element) {
			synchronized (modifiedElements) {
				if (element == null || element.eResource() == null) {
					return;
				}
				Resource resource = element.eResource();
				getModifiedElements(resource).add(element);
			}
		}
		@Override
		public boolean isModifiedElement(Object object) {
			if (object instanceof EObject) {
				EObject element = (EObject) object;
				Resource resource = element.eResource();
				if (resource != null && modifiedElements.containsKey(resource)) {
					return modifiedElements.get(resource).contains(element);
				}
			} else if (object instanceof Resource) {
				return modifiedElements.containsKey(object);
			} else if (object instanceof IFile) {
				if (fileToResource.containsKey(object)) {
					Resource resource = fileToResource.get(object);
					return modifiedElements.containsKey(resource);
				}
			}
			return false;
		}
		public void removeModifiedElement(EObject element) {
			if (element == null || element.eResource() == null) {
				return;
			}
			Resource resource = element.eResource();
			if (modifiedElements.containsKey(resource)) {
				modifiedElements.get(resource).remove(element);
			}
		}
		public void removeModifiedElements(Resource resource) {
			if (resource != null) {
				modifiedElements.remove(resource);
				IFile file = null;
				if (resourceToFile.containsKey(resource)) {
					file= resourceToFile.get(resource);
					resourceToFile.remove(resource);
				}
				if (file != null && fileToResource.containsKey(file)) {
					fileToResource.remove(file);
				}
			}
		}

		public Set<EObject> getModifiedElements(Resource resource) {
			if (!modifiedElements.containsKey(resource)) {
				modifiedElements.put(resource, new HashSet<EObject>());
				
				IFile file = WorkspaceSynchronizer.getFile(resource);
				if (file != null) {
					fileToResource.put(file, resource);
					resourceToFile.put(resource, file);
				}
			}
			return modifiedElements.get(resource);
		}
		@Override
		public Collection<Resource> getModifiedResources() {
			return modifiedElements.keySet();
		}
		
	}




}
