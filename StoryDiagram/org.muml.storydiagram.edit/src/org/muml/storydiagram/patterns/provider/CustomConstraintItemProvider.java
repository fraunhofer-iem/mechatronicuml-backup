package org.muml.storydiagram.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.provider.ConstraintItemProvider;

public class CustomConstraintItemProvider extends ConstraintItemProvider {
	public CustomConstraintItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/Constraint.png"); //$NON-NLS-1$
	}
}
