package org.muml.storydiagram.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.provider.CollectionVariableItemProvider;

public class CustomCollectionVariableItemProvider extends CollectionVariableItemProvider {
	public CustomCollectionVariableItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/CollectionVariable.png"); //$NON-NLS-1$
	}
}
