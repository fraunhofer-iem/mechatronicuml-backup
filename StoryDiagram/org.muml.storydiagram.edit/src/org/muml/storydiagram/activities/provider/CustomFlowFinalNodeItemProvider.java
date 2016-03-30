package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.provider.FlowFinalNodeItemProvider;

public class CustomFlowFinalNodeItemProvider extends FlowFinalNodeItemProvider {
	public CustomFlowFinalNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/FlowFinalNode.png"); //$NON-NLS-1$
	}
}
