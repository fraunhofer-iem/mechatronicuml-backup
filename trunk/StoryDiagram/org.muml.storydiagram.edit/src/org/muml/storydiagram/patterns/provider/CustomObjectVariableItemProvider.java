package org.muml.storydiagram.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.provider.ObjectVariableItemProvider;

public class CustomObjectVariableItemProvider extends ObjectVariableItemProvider {
	public CustomObjectVariableItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/ObjectVariable.png"); //$NON-NLS-1$
	}
}
