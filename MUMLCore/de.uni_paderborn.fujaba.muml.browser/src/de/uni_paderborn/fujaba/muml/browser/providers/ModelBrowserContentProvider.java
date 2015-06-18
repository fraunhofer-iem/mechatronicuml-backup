package de.uni_paderborn.fujaba.muml.browser.providers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;

import de.uni_paderborn.fujaba.muml.browser.ModelBrowserPlugin;
import de.uni_paderborn.fujaba.muml.browser.items.ProgressNavigatorItem;

public class ModelBrowserContentProvider extends org.eclipse.ui.model.WorkbenchContentProvider {
	private Viewer viewer;
	private Map<IFile, ProgressNavigatorItem> loadingFiles = new HashMap<IFile, ProgressNavigatorItem>();
	
	private Map<URI, URI> relocatedParents = new HashMap<URI, URI>();
	private Map<URI, Set<URI>> relocatedChildren = new HashMap<URI, Set<URI>>();

	private Map<TransactionalEditingDomain, AdapterFactoryContentProvider> adapterFactoryContentProviders = new HashMap<TransactionalEditingDomain, AdapterFactoryContentProvider>();
	
	private ResourceSetListener resourceSetListener = new ResourceSetListenerImpl() {
		public void resourceSetChanged(final ResourceSetChangeEvent event) {
			for (Notification notification : event.getNotifications()) {
				Object notifier = notification.getNotifier();
				Resource resource = null;
				if (notifier instanceof EObject) {
					resource = ((EObject) notifier).eResource();
				}
				if (notifier instanceof Resource) {
					resource = (Resource) notifier;
				}
				if (resource != null) {
					URI uri = resource.getURI();
					final IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))); 
					Display.getCurrent().syncExec(new Runnable() {
						@Override
						public void run() {
							((StructuredViewer)viewer).refresh(iFile, true);
						}
					});
				}
			}
		}
	};
	
	public AdapterFactoryContentProvider getAdapterFactoryContentProvder(TransactionalEditingDomain editingDomain) {
		if (editingDomain != null) {
			if (!adapterFactoryContentProviders.containsKey(editingDomain)) {
				AdapterFactory adapterFactory = ((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory();
				adapterFactoryContentProviders.put(editingDomain, new AdapterFactoryContentProvider(adapterFactory));
				editingDomain.addResourceSetListener(resourceSetListener);
			}
			return adapterFactoryContentProviders.get(editingDomain);
		}
		return null;
	}
	
	
	
	public ModelBrowserContentProvider() throws CoreException {
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
		URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
		TransactionalEditingDomain editingDomain = ModelBrowserPlugin.getEditingDomain(uri);
		synchronized (editingDomain) {
			System.out.println("Reloading " + iFile);
			Resource resource = editingDomain.getResourceSet().getResource(uri, true);
			if (resource != null) {
				try {
					resource.unload();
					resource.load(Collections.emptyMap());
					for (EObject element : resource.getContents()) {
						if (element instanceof Diagram) {
							Diagram diagram = (Diagram) element;
							if (diagram.getElement() != null) {
								Resource targetResource = diagram.getElement().eResource();
								if (targetResource != null) {
									URI targetUri = targetResource.getURI();
									if (!targetResource.getContents().contains(diagram.getElement())) {
										String fragment = targetResource.getURIFragment(diagram.getElement());
										if (fragment != null) {
											targetUri = targetUri.appendFragment(fragment);
										}
									}
									addRelocation(uri, targetUri);	
								}
							}
						}
					}
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

	private void addRelocation(URI child, URI parent) {
		// Put into relocatedChildren
		Set<URI> children = relocatedChildren.get(parent);
		if (children == null) {
			children = new HashSet<URI>();
			relocatedChildren.put(parent, children);
		}
		children.add(child);
		
		// Put into relocatedParents
		relocatedParents.put(child, parent);
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
		if (relocatedParents.containsKey(element)) {
			return relocatedParents.get(element);
		}
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
			AdapterFactoryContentProvider contentProvider = getAdapterFactoryContentProvder(ModelBrowserPlugin.getEditingDomain(element));
			if (contentProvider != null) {
				return contentProvider.getParent(element);
			}
		}
		if (element instanceof ProgressNavigatorItem) {
			return ((ProgressNavigatorItem) element).getParent();
		}
		return super.getParent(element);
	}

	@Override
	public Object[] getChildren(Object element) {
		List<Object> children = new ArrayList<Object>();
		for (Object child : getDirectChildren(element)) {
			URI uri = getUri(child);
			if (!relocatedParents.containsKey(uri)) {
				children.add(child);
			}
		}
		URI parentUri = getUri(element);
		Set<URI> relocated = this.relocatedChildren.get(parentUri);
		if (relocated != null) {
			for (URI targetUri : relocated) {
				EditingDomain editingDomain = ModelBrowserPlugin.getEditingDomain(element);
				Resource resource = editingDomain.getResourceSet().getResource(targetUri, false);
				if (targetUri.fragment() != null) {
					EObject child = resource.getEObject(targetUri.fragment());
					if (child != null) {
						children.add(child);
					}
				} else {
					children.add(ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(targetUri.toPlatformString(true)))); 
				}
			}
		}
		return children.toArray();
	}

	private URI getUri(Object object) {
		if (object instanceof EObject) {
			EObject element = (EObject) object;
			Resource resource = element.eResource();
			URI uri = resource.getURI();
			String fragment = resource.getURIFragment(element);
			if (fragment != null) {
				uri = uri.appendFragment(fragment);
			}
			return uri;
		}
		if (object instanceof Resource) {
			return ((Resource) object).getURI();
		}
		if (object instanceof IResource) {
			IResource iResource = (IResource) object;
			return URI.createPlatformResourceURI(iResource.getFullPath().toString(), true);
		}
		return null;
	}

	private Collection<Object> getDirectChildren(Object element) {
		if (element instanceof Notifier) {
			AdapterFactoryContentProvider contentProvider = getAdapterFactoryContentProvder(ModelBrowserPlugin.getEditingDomain(element));
			if (contentProvider != null) {
				return Arrays.asList(contentProvider.getChildren(element));
			}
		}
		if (element instanceof IFile) {
			IFile iFile = (IFile) element;
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			TransactionalEditingDomain editingDomain = ModelBrowserPlugin.getEditingDomain(uri);
			synchronized (editingDomain) {
				Resource resource = editingDomain.getResourceSet().getResource(uri, false);
				if (resource != null) {
					if (resource.getContents().size() == 1) {
						EObject root = resource.getContents().get(0);
						if (root instanceof Diagram) {
							return Collections.emptyList();
						} else {
							return new ArrayList<Object>(root.eContents());
						}
					}
					return new ArrayList<Object>(resource.getContents());
				}
			}
			return Collections.singletonList(getProgressItem((IFile) element));
			
		} else {
			return Arrays.asList(super.getChildren(element));
		}
		
	}

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



	public static ISelection getAdaptedSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			List<Object> newElements = new ArrayList<Object>();
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Iterator<?> it = ssel.iterator();
			while (it.hasNext()) {
				Object element = it.next();
				if (element instanceof IFile) {
					IFile iFile = (IFile) element;
					URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
					TransactionalEditingDomain editingDomain = ModelBrowserPlugin.getEditingDomain(uri);
					synchronized (editingDomain) {
						Resource resource = editingDomain.getResourceSet().getResource(uri, false);
						if (resource != null) {
							if (resource.getContents().size() == 1) {
								newElements.add(resource.getContents().get(0));
								continue;
							}
						}
					}
				}
				newElements.add(element);
			}
			return new StructuredSelection(newElements);
		}
		return selection;
	}
}