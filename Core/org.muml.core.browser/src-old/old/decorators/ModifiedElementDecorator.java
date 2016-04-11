package org.muml.core.browser.old.decorators;

import org.eclipse.emf.common.ui.viewer.IStyledLabelDecorator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;

import org.muml.core.browser.old.providers.IModifiedElementProvider;

public class ModifiedElementDecorator implements IStyledLabelDecorator {
	
	private IModifiedElementProvider provider;

	public ModifiedElementDecorator(IModifiedElementProvider provider) {
		this.provider = provider;
	}

	@Override
	public Image decorateImage(Image image, Object element) {
		return null;
	}

	@Override
	public String decorateText(String text, Object element) {
		if (provider.isModifiedElement(element)) {
			return text + " [modified]";
		}
		return null;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		
	}

	@Override
	public void dispose() {		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	@Override
	public StyledString decorateStyledText(StyledString styledString,
			Object element) {
		return null;
	}

}
