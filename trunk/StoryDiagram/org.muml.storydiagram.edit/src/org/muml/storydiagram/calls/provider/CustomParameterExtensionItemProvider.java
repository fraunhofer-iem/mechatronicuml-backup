package org.muml.storydiagram.calls.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.calls.provider.ParameterExtensionItemProvider;

public class CustomParameterExtensionItemProvider extends ParameterExtensionItemProvider {
	public CustomParameterExtensionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("calls/ParameterExtension.png"); //$NON-NLS-1$
	}
}
