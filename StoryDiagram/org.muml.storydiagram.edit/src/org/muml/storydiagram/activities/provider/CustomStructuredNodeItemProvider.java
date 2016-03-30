package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.provider.StructuredNodeItemProvider;

public class CustomStructuredNodeItemProvider extends StructuredNodeItemProvider {
	public CustomStructuredNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/StructuredNode.png"); //$NON-NLS-1$
	}
}
