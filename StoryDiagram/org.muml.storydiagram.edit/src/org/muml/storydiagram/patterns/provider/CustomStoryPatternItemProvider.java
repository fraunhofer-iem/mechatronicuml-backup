package org.muml.storydiagram.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.provider.StoryPatternItemProvider;

public class CustomStoryPatternItemProvider extends StoryPatternItemProvider {
	public CustomStoryPatternItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/StoryPattern.png"); //$NON-NLS-1$
	}
}
