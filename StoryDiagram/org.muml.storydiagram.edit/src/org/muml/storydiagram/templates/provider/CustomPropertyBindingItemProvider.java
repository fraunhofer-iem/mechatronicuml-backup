package org.muml.storydiagram.templates.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.templates.provider.PropertyBindingItemProvider;

public class CustomPropertyBindingItemProvider extends PropertyBindingItemProvider {
	public CustomPropertyBindingItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("templates/PropertyBinding.png"); //$NON-NLS-1$
	}
}
