package de.uni_paderborn.fujaba.muml.browser.editingdomain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.navigator.SaveablesProvider;

import de.uni_paderborn.fujaba.muml.browser.ModelBrowserPlugin;
import de.uni_paderborn.fujaba.muml.browser.providers.ModelBrowserContentProvider;

public class EditingDomainRegistry {
	
	private Map<URI, Saveable> saveables = new HashMap<URI, Saveable>();

	public Saveable getSaveable(URI uri) {
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
			return new EditingDomainSaveable(domain);
		}
		return null;
	}
	
	public SaveablesProvider getSaveablesProvider() {
		return saveablesProvider;
	}

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
				return EditingDomainRegistry.this.getSaveable(uri);
			}
			return null;
		}
	};
	public interface Listener {
		void editingDomainCreated(TransactionalEditingDomain domain);
	}
	
	private Map<URI, TransactionalEditingDomain> map = new HashMap<URI, TransactionalEditingDomain>();

	private List<Listener> listeners = new ArrayList<Listener>();
	
	public void addListener(Listener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}
	
	public Collection<TransactionalEditingDomain> getEditingDomains() {
		return map.values();
	}
	
	public Set<URI> getURIs() {
		return map.keySet();
	}

	public TransactionalEditingDomain getEditingDomain(URI uri, boolean create) {
		TransactionalEditingDomain editingDomain = internalGetEditingDomain(uri, create);
		if (editingDomain != null) {
			Resource resource;
			try {
				resource = editingDomain.getResourceSet().getResource(uri, true);
			} catch (Exception e) {
				return null;
			}
			if (resource.getContents().size() == 1) {
				EObject root = resource.getContents().get(0);
				if (root instanceof Diagram) {
					Diagram diagram = (Diagram) root;
					EObject element = diagram.getElement();
					if (element != null && element.eResource() != null && element.eResource() != resource) {
						URI semanticURI = diagram.getElement().eResource().getURI();
						return internalGetEditingDomain(semanticURI, create);
					}
				}
			}
		}
		return editingDomain;
	}
	
	private TransactionalEditingDomain internalGetEditingDomain(URI uri, boolean create) {
		if (!ModelBrowserPlugin.canLoad(uri)) {
			return null;
		}
		if (uri != null) {
			synchronized (map) {
				uri = uri.trimFragment();
				if (!map.containsKey(uri)) {
					TransactionalEditingDomain domain = createDomain();
					map.put(uri, domain);
					fireCreated(domain);
				}
				return map.get(uri);
			}
		}
		return null;
	}
	
	protected void fireCreated(TransactionalEditingDomain domain) {
		for (Listener listener : listeners) {
			listener.editingDomainCreated(domain);
		}
	}

	protected TransactionalEditingDomain createDomain() {
		TransactionalEditingDomain domain = WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain();
		return domain;
	}

	public TransactionalEditingDomain getEditingDomain(Resource resource, boolean create) {
		if (resource != null) {
			return getEditingDomain(resource.getURI(), create);
		}
		return null;
	}
	
	public TransactionalEditingDomain getEditingDomain(EObject element, boolean create) {
		if (element != null) {
			return getEditingDomain(element.eResource(), create);
		}
		return null;
	}
	
	public TransactionalEditingDomain getEditingDomainDispatch(Object object, boolean create) {
		if (object instanceof Resource) {
			return getEditingDomain((Resource) object, create);
		}
		if (object instanceof EObject) {
			return getEditingDomain((EObject) object, create);
		}
		return null;
	}
}
