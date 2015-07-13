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
import org.eclipse.core.runtime.IAdaptable;
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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.navigator.SaveablesProvider;

import de.uni_paderborn.fujaba.muml.browser.ModelBrowserPlugin;
import de.uni_paderborn.fujaba.muml.browser.items.ProgressNavigatorItem;

// XXX Open Diagram Resources in Editing Domain of Semantic Element.
// -> The "Open Diagram" Action that is registered on any EObject
//    can check if there is a Diagram file open in the ResourceSet!
// -> Use generated XXXNavigatorActionProvider

public class ModelBrowserContentProvider extends org.eclipse.ui.model.WorkbenchContentProvider implements de.uni_paderborn.fujaba.muml.browser.editingdomain.EditingDomainRegistry.Listener, IAdaptable {
	
	private Viewer viewer;
	private Map<IFile, ProgressNavigatorItem> loadingFiles = new HashMap<IFile, ProgressNavigatorItem>();
	
	private Map<URI, URI> relocatedParents = new HashMap<URI, URI>();
	private Map<URI, Set<URI>> relocatedChildren = new HashMap<URI, Set<URI>>();
	private Map<TransactionalEditingDomain, AdapterFactoryContentProvider> adapterFactoryContentProviders = new HashMap<TransactionalEditingDomain, AdapterFactoryContentProvider>();
	private Map<URI, Saveable> saveables = new HashMap<URI, Saveable>();
	
	private boolean refreshActive = true;

	private SaveablesProvider saveablesProvider = new SaveablesProvider() { 
		@Override
		public Saveable[] getSaveables() {
			List<Saveable> saveables = new ArrayList<Saveable>();

			for (URI uri : new HashSet<URI>(ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.getURIs())) {
				IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))); 
				Saveable saveable = getSaveable(iFile);
				if (saveable != null) {
					saveables.add(saveable);
				}
			}
			return saveables.toArray(new Saveable[] { });
		}

		@Override
		public Object[] getElements(Saveable saveable) {
			List<Object> elements = new ArrayList<Object>();
			for (URI uri : saveables.keySet()) {
				if (saveable == saveables.get(uri)) {
					final IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))); 
					if (iFile != null) {
						elements.add(iFile);
					}
				}
			}
			return elements.toArray();
		}

		@Override
		public Saveable getSaveable(Object element) {
			URI uri = null;
			if (element instanceof EObject) {
				uri = ((EObject) element).eResource().getURI();
			}
			if (element instanceof Resource) {
				uri = ((Resource) element).getURI();
			}
			if (element instanceof IFile) {
				IFile iFile = (IFile) element;
				uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			}
			if (uri != null) {
				return ModelBrowserContentProvider.this.getSaveable(uri);
			}
			return null;
		}
	};
	private ResourceSetListener resourceSetListener = new ResourceSetListenerImpl() {
		public void resourceSetChanged(final ResourceSetChangeEvent event) {
			final Set<IFile> refreshes = new HashSet<IFile>();
			final Set<Object> notifiers = new HashSet<Object>(); 
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
					refreshes.add(iFile);
					if (notifier instanceof EObject && !resource.getContents().contains(notifier)) {
						notifiers.add(notifier);
					} else {
						notifiers.add(iFile);
					}
				}
			}
			if (refreshActive) {
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						
						if (viewer instanceof StructuredViewer) { // is also null check
							((StructuredViewer)viewer).refresh();
							for (Object notifier : notifiers) {
								((AbstractTreeViewer)viewer).expandToLevel(notifier, 1);
							}
//							for (IFile iFile : refreshes) {
//								((StructuredViewer)viewer).refresh(iFile, true);
//							}
						}
					}
				});
			}
		}
	};
	
	public AdapterFactoryContentProvider getAdapterFactoryContentProvder(TransactionalEditingDomain editingDomain) {
		if (editingDomain != null) {
			if (!adapterFactoryContentProviders.containsKey(editingDomain)) {
				AdapterFactory adapterFactory = ((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory();
				adapterFactoryContentProviders.put(editingDomain, new AdapterFactoryContentProvider(adapterFactory));
			}
			return adapterFactoryContentProviders.get(editingDomain);
		}
		return null;
	}

	private Saveable getSaveable(URI uri) {
		if (!saveables.containsKey(uri)) {
			Saveable saveable = createSaveable(uri);
			if (saveable != null) {
				saveables.put(uri, saveable);
			}
		}
		return saveables.get(uri);
	}

	private Saveable createSaveable(URI uri) {
		TransactionalEditingDomain domain = ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.getEditingDomain(uri, true);
		if (domain != null) {
			return new ModelBrowserSaveable(domain);
		}
		return null;
	}

	public ModelBrowserContentProvider() throws CoreException {
		ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.addListener(this);
		for (TransactionalEditingDomain domain : ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.getEditingDomains()) {
			domain.addResourceSetListener(resourceSetListener);
		}
		runUpdate(Collections.singletonList((IResource) ResourcesPlugin.getWorkspace().getRoot()));
	}

	@Override
	public void editingDomainCreated(TransactionalEditingDomain editingDomain) {
		editingDomain.addResourceSetListener(resourceSetListener);
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
					if (ModelBrowserPlugin.canLoad(file.getFileExtension())) {
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
		refreshActive = false;
		try {
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			TransactionalEditingDomain editingDomain = ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.getEditingDomain(uri, true);
			if (editingDomain == null) {
				return;
			}
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
		} finally {
			refreshActive = true;
		}
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

	protected void processDelta(IResourceDelta delta) {		
		super.processDelta(delta);
		try {
			final List<IResource> changedFiles = new ArrayList<IResource>();
			delta.accept(new IResourceDeltaVisitor() {
				@Override
				public boolean visit(IResourceDelta delta) throws CoreException {
					if ((delta.getFlags() & IResourceDelta.CONTENT) != 0 || delta.getKind() == IResourceDelta.ADDED) {
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
			AdapterFactoryContentProvider contentProvider = getAdapterFactoryContentProvder(ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.getEditingDomainDispatch(element, true));
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
				EditingDomain editingDomain = ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.getEditingDomain(targetUri, true);
				if (editingDomain != null) {
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
			AdapterFactoryContentProvider contentProvider = getAdapterFactoryContentProvder(ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.getEditingDomainDispatch(element, true));
			if (contentProvider != null) {
				return Arrays.asList(contentProvider.getChildren(element));
			}
		}
		if (element instanceof IFile) {
			IFile iFile = (IFile) element;
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			TransactionalEditingDomain editingDomain = ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.getEditingDomain(uri, true);
			if (editingDomain != null) {
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
		for (TransactionalEditingDomain domain : ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.getEditingDomains()) {
			domain.removeResourceSetListener(resourceSetListener);
		}
		ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.removeListener(this);
		
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
					TransactionalEditingDomain editingDomain = ModelBrowserPlugin.EDITING_DOMAIN_REGISTRY.getEditingDomain(uri, true);
					if (editingDomain != null) {
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
				}
				newElements.add(element);
			}
			return new StructuredSelection(newElements);
		}
		return selection;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		if (adapter == SaveablesProvider.class) {
			return (T) saveablesProvider;
		}
		return null;
	}
	
	public class ModelBrowserSaveable extends Saveable {
		
		private TransactionalEditingDomain domain;

		public ModelBrowserSaveable(TransactionalEditingDomain domain) {
			this.domain = domain;
		}
		
		@Override
		public String getName() {
			return "name";
		}

		@Override
		public String getToolTipText() {
			return "tooltip text";
		}

		@Override
		public ImageDescriptor getImageDescriptor() {
			return null;
		}

		@Override
		public void doSave(IProgressMonitor monitor) throws CoreException {
		}

		@Override
		public boolean isDirty() {
			return true;
		}

		@Override
		public boolean equals(Object object) {
			return object == this;
		}

		@Override
		public int hashCode() {
			return domain.hashCode();
		}
		
	}

}