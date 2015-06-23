package de.uni_paderborn.fujaba.muml.browser.editingdomain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;

import de.uni_paderborn.fujaba.muml.browser.ModelBrowserPlugin;

public class EditingDomainRegistry {
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
