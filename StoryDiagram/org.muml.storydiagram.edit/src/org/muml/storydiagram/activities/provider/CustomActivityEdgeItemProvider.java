package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.provider.ActivityEdgeItemProvider;

public class CustomActivityEdgeItemProvider extends ActivityEdgeItemProvider {
	public CustomActivityEdgeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/ActivityEdge.png"); //$NON-NLS-1$
	}
}
