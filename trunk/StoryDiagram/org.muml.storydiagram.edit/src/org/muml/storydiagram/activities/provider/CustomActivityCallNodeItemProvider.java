package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.provider.ActivityCallNodeItemProvider;

public class CustomActivityCallNodeItemProvider extends ActivityCallNodeItemProvider {
	public CustomActivityCallNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/ActivityCallNode.png"); //$NON-NLS-1$
	}
}
