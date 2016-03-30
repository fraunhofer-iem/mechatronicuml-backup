package org.muml.storydiagram.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.provider.PathItemProvider;

public class CustomPathItemProvider extends PathItemProvider {
	public CustomPathItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/Path.png"); //$NON-NLS-1$
	}
}
