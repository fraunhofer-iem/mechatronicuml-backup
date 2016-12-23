package org.muml.core.browser.old.providers;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import org.muml.core.browser.ModelBrowserPlugin;


public class ModelBrowserLabelProvider extends AdapterFactoryLabelProvider.StyledLabelProvider {

	private WorkbenchLabelProvider workbenchLabelProvider = new WorkbenchLabelProvider();
	
	private ResourceSet resourceSet;
	
	public ModelBrowserLabelProvider(TransactionalEditingDomain editingDomain, Viewer viewer) {
		super(((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory(), viewer);
		resourceSet = editingDomain.getResourceSet();
	}
	
	@Override
	public void addListener(ILabelProviderListener listener) {
		super.addListener(listener);
		workbenchLabelProvider.addListener(listener);
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		super.removeListener(listener);
		workbenchLabelProvider.removeListener(listener);
	}

	@Override
	public void dispose() {
		super.dispose();
		workbenchLabelProvider.dispose();
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		if (element instanceof Notifier) {
			return super.isLabelProperty(element, property);
		}
		return workbenchLabelProvider.isLabelProperty(element, property);
	}


	@Override
	public String getText(Object element) {
		EObject rootElement = ModelBrowserPlugin.getResourceRoot(resourceSet, element);
		if (rootElement != null) {
			return super.getText(rootElement);
		}
		
		if (element instanceof Notifier) {
			return super.getText(element);
		}
		return workbenchLabelProvider.getText(element);
	}


	@Override
	public StyledString getStyledText(Object element) {
		EObject rootElement = ModelBrowserPlugin.getResourceRoot(resourceSet, element);
		if (rootElement != null) {
			return super.getStyledText(rootElement);
		}
		
		if (element instanceof Notifier) {
			return super.getStyledText(element);
		}
		return workbenchLabelProvider.getStyledText(element);
	}

	@Override
	public Image getImage(Object element) {
		// We use the image of the file
//		EObject rootElement = ModelBrowserPlugin.getResourceRoot(resourceSet, element);
//		if (rootElement != null) {
//			return super.getImage(rootElement);
//		}
		
		if (element instanceof Notifier) {
			return super.getImage(element);
		}
		return workbenchLabelProvider.getImage(element);
	}

	@Override
	public Font getFont(Object element) {
		EObject rootElement = ModelBrowserPlugin.getResourceRoot(resourceSet, element);
		if (rootElement != null) {
			return super.getFont(rootElement);
		}
		
		if (element instanceof Notifier) {
			return super.getFont(element);
		}
		return workbenchLabelProvider.getFont(element);
	}

	@Override
	public Color getForeground(Object element) {
		EObject rootElement = ModelBrowserPlugin.getResourceRoot(resourceSet, element);
		if (rootElement != null) {
			return super.getForeground(rootElement);
		}
		
		if (element instanceof Notifier) {
			return super.getForeground(element);
		}
		return workbenchLabelProvider.getForeground(element);
	}

	@Override
	public Color getBackground(Object element) {
		EObject rootElement = ModelBrowserPlugin.getResourceRoot(resourceSet, element);
		if (rootElement != null) {
			return super.getBackground(rootElement);
		}
		
		if (element instanceof Notifier) {
			return super.getBackground(element);
		}
		return workbenchLabelProvider.getBackground(element);
	}


}