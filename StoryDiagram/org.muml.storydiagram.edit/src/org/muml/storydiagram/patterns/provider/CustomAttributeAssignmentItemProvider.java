package org.muml.storydiagram.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.provider.AttributeAssignmentItemProvider;

public class CustomAttributeAssignmentItemProvider extends AttributeAssignmentItemProvider {
	public CustomAttributeAssignmentItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/AttributeAssignment.png"); //$NON-NLS-1$
	}
}
