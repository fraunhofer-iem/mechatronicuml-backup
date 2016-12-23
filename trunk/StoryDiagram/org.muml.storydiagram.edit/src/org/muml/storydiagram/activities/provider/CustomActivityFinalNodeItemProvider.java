package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.provider.ActivityFinalNodeItemProvider;

public class CustomActivityFinalNodeItemProvider extends ActivityFinalNodeItemProvider {
	public CustomActivityFinalNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/ActivityFinalNode.png"); //$NON-NLS-1$
	}
}
