package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.MatchingStoryNode;
import org.muml.storydiagram.activities.provider.MatchingStoryNodeItemProvider;

public class CustomMatchingStoryNodeItemProvider extends MatchingStoryNodeItemProvider {
	public CustomMatchingStoryNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		if (((MatchingStoryNode) object).isForEach()) {
			return getImage("activities/MatchingStoryNode_loop.png"); //$NON-NLS-1$
		}
		return getImage("activities/MatchingStoryNode.png"); //$NON-NLS-1$
	}
}
