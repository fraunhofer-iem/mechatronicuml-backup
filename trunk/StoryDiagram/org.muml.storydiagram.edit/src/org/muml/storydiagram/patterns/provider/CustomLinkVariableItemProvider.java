package org.muml.storydiagram.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.provider.LinkVariableItemProvider;

public class CustomLinkVariableItemProvider extends LinkVariableItemProvider {
	public CustomLinkVariableItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/LinkVariable.png"); //$NON-NLS-1$
	}
}
