package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.provider.JunctionNodeItemProvider;

public class CustomJunctionNodeItemProvider extends JunctionNodeItemProvider {
	public CustomJunctionNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/JunctionNode.png"); //$NON-NLS-1$
	}
}
