package org.muml.storydiagram.templates.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.templates.provider.TemplateBindingItemProvider;

public class CustomTemplateBindingItemProvider extends TemplateBindingItemProvider {
	public CustomTemplateBindingItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("templates/TemplateBinding.png"); //$NON-NLS-1$
	}
}
