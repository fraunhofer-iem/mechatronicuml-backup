package de.uni_paderborn.fujaba.muml.browser.providers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.WorkbenchContentProvider;

import de.uni_paderborn.fujaba.muml.browser.ModelBrowserPlugin;

public class ModelBrowserContentProvider extends AdapterFactoryContentProvider {

	private WorkbenchContentProvider workbenchContentProvider = new WorkbenchContentProvider();
	
	private TransactionalEditingDomain editingDomain;
	private ResourceSet resourceSet;
	private WorkspaceSynchronizer synchronizer;
	private ResourceSetListener resourceSetListener = new ResourceSetListenerImpl() {
		public void resourceSetChanged(final ResourceSetChangeEvent event) {
			
			if (viewer instanceof StructuredViewer) {
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						((StructuredViewer) viewer).refresh();
					}
				});
			}
		}
	};
	
	public ModelBrowserContentProvider(TransactionalEditingDomain editingDomain) {
		super(((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory());
		synchronizer = new WorkspaceSynchronizer(editingDomain);
		this.editingDomain = editingDomain; 
		resourceSet = editingDomain.getResourceSet();
		editingDomain.addResourceSetListener(resourceSetListener);
	}

	@Override
	public void dispose() {
		super.dispose();
		synchronizer.dispose();
		workbenchContentProvider.dispose();
		editingDomain.removeResourceSetListener(resourceSetListener);
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
