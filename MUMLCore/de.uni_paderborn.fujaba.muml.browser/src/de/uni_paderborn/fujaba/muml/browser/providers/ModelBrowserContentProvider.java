package de.uni_paderborn.fujaba.muml.browser.providers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;

import de.uni_paderborn.fujaba.muml.browser.ModelBrowserPlugin;
import de.uni_paderborn.fujaba.muml.browser.items.ProgressNavigatorItem;

public class ModelBrowserContentProvider extends org.eclipse.ui.model.WorkbenchContentProvider {
	private AdapterFactoryContentProvider adapterFactoryContentProvider;
	private Viewer viewer;
	private TransactionalEditingDomain editingDomain = ModelBrowserPlugin.EDITING_DOMAIN;	
	private Map<IFile, ProgressNavigatorItem> loadingFiles = new HashMap<IFile, ProgressNavigatorItem>();

	public ModelBrowserContentProvider() throws CoreException {
		AdapterFactory adapterFactory = ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
		adapterFactoryContentProvider = new AdapterFactoryContentProvider(adapterFactory);
		runUpdate(Collections.singletonList((IResource) ResourcesPlugin.getWorkspace().getRoot()));
	}
	
	private void runUpdate(final List<IResource> resources) {
		Job job = new Job("Update MechatronicUML Browser Contents") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// set total number of work units
				final List<IFile> files = new ArrayList<IFile>();
				for (IResource resource : resources) {
					try {
						resource.accept(new IResourceVisitor() {
							@Override
							public boolean visit(IResource resource) throws CoreException {
								if (resource instanceof IFile) {
									IFile iFile = (IFile) resource;
									files.add(iFile);
								}
								return true;
							}
						});
					} catch (CoreException e) {
						ModelBrowserPlugin.log(e);
					}
				}
				monitor.beginTask("Reloading changes", files.size());
				
				for (IFile file : files) {
					if (canLoad(file)) {
						reload(file);
					}
					monitor.worked(1);
				}
				
				return Status.OK_STATUS;
			}
		};
		job.schedule(); 

	}

	protected void reload(final IFile iFile) {
		
		synchronized (editingDomain) {
			System.out.println("Reloading " + iFile);
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			Resource resource = editingDomain.getResourceSet().getResource(uri, true);
			if (resource != null) {
				try {
					resource.unload();
					resource.load(Collections.emptyMap());
				} catch (IOException e) {
					ModelBrowserPlugin.log(e);
				}
			}
		}
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {				
				((StructuredViewer) viewer).refresh(); //((StructuredViewer) viewer).update(iFile, null);
			}
		});
	}

	protected boolean canLoad(IFile file) {
		final Set<String> extensions = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet();
		return extensions.contains(file.getFileExtension()); // Check if suffix is registered as EMF file
	}

	protected void processDelta(IResourceDelta delta) {		
		super.processDelta(delta);
		try {
			final List<IResource> changedFiles = new ArrayList<IResource>();
			delta.accept(new IResourceDeltaVisitor() {
				@Override
				public boolean visit(IResourceDelta delta) throws CoreException {
					if ((delta.getFlags() & IResourceDelta.CONTENT) != 0) {
						changedFiles.add(delta.getResource());
					}
					return true;
				}
			});
			if (!changedFiles.isEmpty()) {
				runUpdate(changedFiles);
			}
		} catch (CoreException e) {
			ModelBrowserPlugin.log(e);
		}
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof Notifier) {
			if (element instanceof EObject) {
				EObject eObject = (EObject) element;
				Resource resource = eObject.eResource();
				EObject eContainer = eObject.eContainer();
				if (resource != null && eContainer != null && resource.getContents().contains(eContainer)) {
					// null means we cannot compute the parent currently, which makes it easier for us here.
					return null;
				}
			}
			return adapterFactoryContentProvider.getParent(element);
		}
		if (element instanceof ProgressNavigatorItem) {
			return ((ProgressNavigatorItem) element).getParent();
		}
		return super.getParent(element);
	}

	@Override
	public Object[] getChildren(Object element) {
		if (element instanceof Notifier) {
			return adapterFactoryContentProvider.getChildren(element);
		}
		if (element instanceof IFile) {
			IFile iFile = (IFile) element;
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			synchronized (editingDomain) {
				Resource resource = editingDomain.getResourceSet().getResource(uri, false);
				if (resource != null) {
					if (resource.getContents().size() == 1) {
						return resource.getContents().get(0).eContents().toArray();
					} else {
						return resource.getContents().toArray();
					}
				}
			}
			return new Object[] { getProgressItem((IFile) element)};
			
		} else {
			return super.getChildren(element);
		}
	}
//	
//	private Resource getResource(IFile iFile) {
//		URI uri = getURI(iFile);
//		return editingDomain.getResourceSet().getResource(uri, false);
//	}


	private Object getProgressItem(IFile element) {
		if (!loadingFiles.containsKey(element)) {
			ProgressNavigatorItem progressItem = new ProgressNavigatorItem(element);
			progressItem.setViewer(viewer);
			IFile file = (IFile) element;
			loadingFiles.put(file, progressItem);
		}
		return loadingFiles.get(element);
	}


	@Override
	public void dispose() {
		super.dispose();
		setViewer(null);
		for (ProgressNavigatorItem item : loadingFiles.values()) {
			item.dispose();
		}
		loadingFiles.clear();
	}

	/*
	 * (non-Javadoc) Method declared on IContentProvider.
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		super.inputChanged(viewer, oldInput, newInput);
		setViewer(viewer);
	}
	
	void setViewer(Viewer viewer) {
		if (this.viewer != viewer) {
			this.viewer = viewer;
			for (ProgressNavigatorItem item : loadingFiles.values()) {
				item.setViewer(viewer);
			}
		}
	}
}