package org.muml.storydiagram.diagram.custom.providers;

import org.muml.storydiagram.diagram.custom.edit.parts.CustomStorydiagramsEditPartFactory;
import org.muml.storydiagram.diagram.providers.StorydiagramsEditPartProvider;

public class CustomStorydiagramsEditPartProvider extends StorydiagramsEditPartProvider {
	public CustomStorydiagramsEditPartProvider() {
		super();
		setFactory(new CustomStorydiagramsEditPartFactory());
	}
}
