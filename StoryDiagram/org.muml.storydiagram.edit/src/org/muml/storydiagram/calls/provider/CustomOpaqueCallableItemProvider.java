package org.muml.storydiagram.calls.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.calls.provider.OpaqueCallableItemProvider;

public class CustomOpaqueCallableItemProvider extends OpaqueCallableItemProvider {
	public CustomOpaqueCallableItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("calls/OpaqueCallable.png"); //$NON-NLS-1$
	}
}
