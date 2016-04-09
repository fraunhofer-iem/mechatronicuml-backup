package org.muml.storydiagram.diagram.providers;

import org.muml.storydiagram.activities.MatchingStoryNode;
import org.muml.storydiagram.activities.ModifyingStoryNode;
import org.muml.storydiagram.diagram.part.StorydiagramsDiagramEditorPlugin;
import org.muml.storydiagram.patterns.MatchingPattern;
import org.muml.storydiagram.patterns.PatternsFactory;
import org.muml.storydiagram.patterns.StoryPattern;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_ModifyingStoryNode_2003(ModifyingStoryNode instance) {
		try {
			StoryPattern newInstance_0_0 = PatternsFactory.eINSTANCE.createStoryPattern();
			instance.setOwnedRule(newInstance_0_0);
			newInstance_0_0.setComment("");

		} catch (RuntimeException e) {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_MatchingStoryNode_2004(MatchingStoryNode instance) {
		try {
			MatchingPattern newInstance_0_0 = PatternsFactory.eINSTANCE.createMatchingPattern();
			instance.setOwnedPattern(newInstance_0_0);
			newInstance_0_0.setComment("");

		} catch (RuntimeException e) {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = StorydiagramsDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			StorydiagramsDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
