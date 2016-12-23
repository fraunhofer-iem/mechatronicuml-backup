package org.muml.storydiagram.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.provider.LinkConstraintItemProvider;

public class CustomLinkConstraintItemProvider extends LinkConstraintItemProvider {
	public CustomLinkConstraintItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/LinkConstraint.png"); //$NON-NLS-1$
	}
}
