package de.uni_paderborn.fujaba.muml.utilities.modelrefresh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class Refresher {

	@SuppressWarnings("rawtypes")
	private Map loadOptions;

	@SuppressWarnings("rawtypes")
	private Map saveOptions;

	private Collection<IFilter> filters = new ArrayList<IFilter>();

	private ResourceSet resourceSet = new ResourceSetImpl();

	@SuppressWarnings("rawtypes")
	public Refresher(Map loadOptions, Map saveOptions) {
		this.loadOptions = loadOptions;
		this.saveOptions = saveOptions;
		addFilter(new IFilter() {
			@Override
			public boolean select(IResource resource) {
				if (resource.getName().startsWith(".")) {
					return false;
				}
				return true;
			}
		});
	}

	public void run(Collection<IResource> resources) {
		load(resources);
		saveAll();
	}

	private void saveAll() {
		EcoreUtil.resolveAll(resourceSet);
		for (Resource res : resourceSet.getResources()) {
			try {
				res.save(saveOptions);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void load(Collection<IResource> resources) {
		for (IResource resource : resources) {
			try {
				resource.accept(new IResourceVisitor() {
					@Override
					public boolean visit(IResource resource)
							throws CoreException {
						if (!Refresher.this.shouldAccept(resource)) {
							return false;
						}
						if (resource instanceof IFile) {
							IPath path = resource.getFullPath();

							URI uri = URI.createPlatformResourceURI(
									path.toOSString(), true);

							if (uri != null) {
								load(uri);
							}

						}
						return true;
					}
				});
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean shouldAccept(IResource resource) {
		for (IFilter filter : filters) {
			if (!filter.select(resource)) {
				return false;
			}
		}
		return true;
	}

	private void load(URI uri) {
		Resource resource = resourceSet.createResource(uri,
				ContentHandler.UNSPECIFIED_CONTENT_TYPE);

		if (resource != null) {
			try {
				resource.load(loadOptions);
			} catch (IOException e) {
				resource = null;
			}
		}
		if (resource == null) {
			System.err.println("Could not load " + uri);
		}
	}

	public void addFilter(IFilter filter) {
		filters.add(filter);
	}

	public void removeFilter(IFilter filter) {
		filters.remove(filter);
	}

	// A subtractive filter
	public interface IFilter {
		boolean select(IResource file);
	}

}
