package org.muml.core.browser.old.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.model.WorkbenchContentProvider;

import org.muml.core.browser.ModelBrowserPlugin;

public class ModelBrowserContentProvider extends AdapterFactoryContentProvider {

	private WorkbenchContentProvider workbenchContentProvider = new WorkbenchContentProvider();
	private ResourceSet resourceSet;

	public ModelBrowserContentProvider(TransactionalEditingDomain editingDomain) {
		super(((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory());
		resourceSet = editingDomain.getResourceSet();
	}

	@Override
	public void dispose() {
		super.dispose();
		workbenchContentProvider.dispose();
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		super.inputChanged(viewer, oldInput, newInput);
		workbenchContentProvider.inputChanged(viewer, oldInput, newInput);
	}

	@Override
	public Object[] getElements(Object inputElement) {
		Object[] elements = super.getElements(inputElement);
		if (elements == null | elements.length == 0) {
			elements = workbenchContentProvider.getChildren(inputElement);
		}
		return elements;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		EObject resourceRoot = ModelBrowserPlugin.getResourceRoot(resourceSet, parentElement);
		if (resourceRoot != null) {
			return resourceRoot.eContents().toArray();
		}
		
		Object[] children = super.getChildren(parentElement);
		if (children == null || children.length == 0) {
			children = workbenchContentProvider.getChildren(parentElement);
		}
		return children;
	}


	@Override
	public Object getParent(Object element) {
		Object parent = super.getParent(element);
		if (parent == null) {
			parent = workbenchContentProvider.getParent(element);
		}
		return parent;
	}

	@Override
	public boolean hasChildren(Object element) {
		return super.hasChildren(element) || workbenchContentProvider.hasChildren(element) || isXmiFile(element);
	}

	private boolean isXmiFile(Object element) {
		Resource resource = ModelBrowserPlugin.getResource(resourceSet, element);
		if (resource != null) {
			return !resource.getContents().isEmpty();
		}
		return false;
	}

	
}
