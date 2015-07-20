package de.uni_paderborn.fujaba.muml.browser.editingdomain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.navigator.SaveablesProvider;

import de.uni_paderborn.fujaba.muml.browser.ModelBrowserPlugin;

public class EditingDomainRegistry {
	public class ModelBrowserSaveablesProvider extends SaveablesProvider implements Listener {
		@Override
		public Saveable[] getSaveables() {
			List<Saveable> saveables = new ArrayList<Saveable>();

			for (MumlEditingDomain domain : map.values()) {
				saveables.add(domain.getSaveable());
			}
			return saveables.toArray(new Saveable[] { });
		}

		@Override
		public Object[] getElements(Saveable saveable) {
			List<Object> elements = new ArrayList<Object>();
			for (MumlEditingDomain domain : getEditingDomains()) {
				if (saveable == domain.getSaveable()) {
					URI uri = domain.getURI();
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
				MumlEditingDomain domain = getEditingDomain(uri, false);
				if (domain != null) {
					return domain.getSaveable();
				}
			}
			return null;
		}
		
		public void dirtyChanged(Saveable saveable) {
			fireSaveablesDirtyChanged(new Saveable[] { saveable });
		}
		public void saveableAdded(Saveable saveable) {
		}

		@Override
		public void editingDomainCreated(MumlEditingDomain domain) {
			fireSaveablesOpened(new Saveable[] { domain.getSaveable() });			
		}
		
	};

	public ModelBrowserSaveablesProvider getSaveablesProvider() {
		return saveablesProvider;
	}

	private ModelBrowserSaveablesProvider saveablesProvider = new ModelBrowserSaveablesProvider();
	
	public interface Listener {
		void editingDomainCreated(MumlEditingDomain domain);
	}
	
	private Map<URI, MumlEditingDomain> map = new HashMap<URI, MumlEditingDomain>();

	private List<Listener> listeners = new ArrayList<Listener>();
	
	public EditingDomainRegistry() {
		addListener(saveablesProvider);
	}
	
	public void addListener(Listener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}
	
	public Collection<MumlEditingDomain> getEditingDomains() {
		return map.values();
	}
	
	public Set<URI> getURIs() {
		return map.keySet();
	}

	public MumlEditingDomain getEditingDomain(URI uri, boolean create) {
		MumlEditingDomain editingDomain = internalGetEditingDomain(uri, create);
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
	
	private MumlEditingDomain internalGetEditingDomain(URI uri, boolean create) {
		if (!ModelBrowserPlugin.canLoad(uri)) {
			return null;
		}
		if (uri != null) {
			synchronized (map) {
				uri = uri.trimFragment();
				if (!map.containsKey(uri)) {
					MumlEditingDomain domain = createDomain(uri);
					map.put(uri, domain);
					fireCreated(domain);
				}
				return map.get(uri);
			}
		}
		return null;
	}
	
	protected void fireCreated(MumlEditingDomain domain) {
		for (Listener listener : listeners) {
			listener.editingDomainCreated(domain);
		}
	}

	protected MumlEditingDomain createDomain(URI uri) {
		return MumlEditingDomain.create(uri);
	}

	public MumlEditingDomain getEditingDomain(Resource resource, boolean create) {
		if (resource != null) {
			return getEditingDomain(resource.getURI(), create);
		}
		return null;
	}
	
	public MumlEditingDomain getEditingDomain(EObject element, boolean create) {
		if (element != null) {
			return getEditingDomain(element.eResource(), create);
		}
		return null;
	}
	
	public MumlEditingDomain getEditingDomainDispatch(Object object, boolean create) {
		if (object instanceof Resource) {
			return getEditingDomain((Resource) object, create);
		}
		if (object instanceof EObject) {
			return getEditingDomain((EObject) object, create);
		}
		return null;
	}
}
