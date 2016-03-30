package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.provider.ActivityItemProvider;

public class CustomActivityItemProvider extends ActivityItemProvider {
	public CustomActivityItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/Activity.png"); //$NON-NLS-1$
	}
}
