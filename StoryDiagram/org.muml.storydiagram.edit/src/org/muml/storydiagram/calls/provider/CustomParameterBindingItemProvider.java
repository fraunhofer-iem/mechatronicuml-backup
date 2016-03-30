package org.muml.storydiagram.calls.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.calls.provider.ParameterBindingItemProvider;

public class CustomParameterBindingItemProvider extends ParameterBindingItemProvider {
	public CustomParameterBindingItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("calls/ParameterBinding.png"); //$NON-NLS-1$
	}
}
