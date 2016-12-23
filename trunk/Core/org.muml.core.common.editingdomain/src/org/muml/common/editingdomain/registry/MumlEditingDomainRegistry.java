package org.muml.common.editingdomain.registry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.swt.widgets.Display;

public class MumlEditingDomainRegistry {
	
	public static MumlEditingDomainRegistry INSTANCE = new MumlEditingDomainRegistry();

	public static interface Listener {
		void editingDomainCreated(MumlEditingDomain domain);
	}
	
	private Map<URI, MumlEditingDomain> map = new HashMap<URI, MumlEditingDomain>();

	private List<Listener> listeners = new ArrayList<Listener>();
	
	public MumlEditingDomainRegistry() {
	}
	
	public void addListener(Listener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}
	
	public Collection<MumlEditingDomain> getEditingDomains() {
		synchronized (map) {
			return new ArrayList<MumlEditingDomain>(map.values());
		}
	}

	public Set<URI> getURIs() {
		synchronized (map) {
			return new HashSet<URI>(map.keySet());
		}
	}

	public MumlEditingDomain getEditingDomain(URI uri, boolean create) {
		MumlEditingDomain editingDomain = internalGetEditingDomain(uri, create);
		if (editingDomain != null) {
			Resource resource;
			try {
				resource = editingDomain.getResourceSet().getResource(uri, create);
			} catch (Exception e) {
				return null;
			}
			if (resource != null && resource.getContents().size() == 1) {
				EObject root = resource.getContents().get(0);
				if (root instanceof Diagram) {
					Diagram diagram = (Diagram) root;
					EObject diagramElement = (EObject) diagram.eGet(NotationPackage.Literals.VIEW__ELEMENT, false); // non resolving
					if (diagramElement != null && diagramElement.eResource() != null && diagramElement.eResource() != resource) {
						URI semanticURI = diagramElement.eResource().getURI();
						MumlEditingDomain domain = internalGetEditingDomain(semanticURI, create);
						synchronized (map) {
							map.put(uri, domain); // set uri of diagram to semantic element.
						}
						return domain;
					} 
				}
			}
		}
		return editingDomain;
	}

	public static boolean canLoad(URI uri) {
		return canLoad(uri.fileExtension());
	}
	
	public static boolean canLoad(String fileExtension) {
		if ("muml".equals(fileExtension) || "fujaba".equals(fileExtension)) {
			return true;
		}
		final Set<String> extensions = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet();
		return extensions.contains(fileExtension); // Check if suffix is registered as EMF file
	}
	
	private MumlEditingDomain internalGetEditingDomain(URI uri, boolean create) {
		if (!canLoad(uri)) {
			return null;
		}
		if (uri != null) {
			boolean created = false;
			MumlEditingDomain domain = null;
			synchronized (map) {
				uri = uri.trimFragment();
				if (!map.containsKey(uri)) {
					domain = createDomain(uri);
					map.put(uri, domain);
					created = true;
				} else {
					domain = map.get(uri);
				}
			}
			if (created) {
				fireCreated(domain);
			}
			return domain;
		}
		return null;
	}
	
	protected void fireCreated(final MumlEditingDomain domain) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				for (Listener listener : listeners) {
					listener.editingDomainCreated(domain);
				}				
			}
		});
	}

	protected MumlEditingDomain createDomain(URI uri) {
		return MumlEditingDomainFactory.INSTANCE.createMumlEditingDomain(uri);
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
