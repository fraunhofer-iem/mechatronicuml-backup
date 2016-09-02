package org.muml.pim.common.refactoring;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

public class XMIProxyChange extends CompositeChange {

	public XMIProxyChange(final ResourceSet resourceSet, final IFile source,
			final IFile target, Resource resource) {
		super("Update Proxies");
		
		final Set<String> extensions = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet();

		try {
			source.getProject().accept(new IResourceVisitor() {

				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IFile && extensions.contains(resource.getFileExtension())) {
						loadResource(resourceSet, (IFile) resource);
						return false;
					}
					return true;
				}
			});
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		EcoreUtil.resolveAll(resourceSet);
		
		resource.setURI(URI.createPlatformResourceURI(target.getFullPath().toString(), true));
		
		Set<Resource> saveResources = new LinkedHashSet<Resource>();
		for (Resource currentResource : resourceSet.getResources()) {
			if (currentResource == resource) {
				saveResources.add(resource);
				continue;
			}
			TreeIterator<EObject> it = EcoreUtil.getAllContents(currentResource, true);
			while (it.hasNext()) {
				EObject element = it.next();
				for (EReference reference : element.eClass().getEAllReferences()) {
					Collection<?> values = null;
					if (reference.isChangeable() && !reference.isDerived()) {
						Object value = element.eGet(reference);
						if (reference.isMany()) {
							values = (Collection<?>) value;
						} else if (value != null) {
							values = Collections.singletonList(value);
						}
					}
					if (values != null) {
						for (Object value : values) {
							EObject referencedEObject = (EObject) value;
							if (referencedEObject.eResource() == resource) {
								saveResources.add(currentResource);
							}
						}
					}
				}
			}
		}
		
		
		
		for (final Resource saveResource : saveResources) {
			URI uri = saveResource.getURI();
			final IFile iFile = source.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))); 
			add(new Change() {

				@Override
				public String getName() {
					return "Updating " + saveResource.getURI().lastSegment();
				}

				@Override
				public void initializeValidationData(IProgressMonitor pm) {
				}

				@Override
				public RefactoringStatus isValid(IProgressMonitor pm)
						throws CoreException, OperationCanceledException {
					return new RefactoringStatus();
				}

				@Override
				public Change perform(IProgressMonitor pm) throws CoreException {
					try {
						Map<Object, Object> saveOptions = new HashMap<Object, Object>();
						saveOptions.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
						saveResource.save(saveOptions);
					} catch (IOException e) {
			    		throw new CoreException(new Status(Status.ERROR, "", e.getMessage()));
					}
					target.getParent().refreshLocal(IResource.DEPTH_ONE, pm);
					return null;
				}

				@Override
				public Object getModifiedElement() {
					return iFile;
				}
				
			});
		}

	}


	public static Resource loadResource(ResourceSet resourceSet, IFile element) {
		Resource resource = null;
		try {
			URI uri = URI.createPlatformResourceURI(element.getFullPath().toString(), true);
			resource = resourceSet.getResource(uri, false);
			if (resource == null) {
				resource = resourceSet.createResource(uri);
			}
			if (resource != null && !resource.isLoaded()) {
				resource.load(Collections.emptyMap());
			}
		} catch (IOException e) {
			// do nothing
		}
		if (resource != null && resource.getContents().isEmpty()) {
			resourceSet.getResources().remove(resource);
			resource =  null;
		}
		return resource;
	}

}
