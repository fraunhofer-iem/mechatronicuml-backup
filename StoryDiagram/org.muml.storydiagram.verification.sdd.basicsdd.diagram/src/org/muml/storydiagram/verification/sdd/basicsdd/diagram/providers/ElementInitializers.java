package org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers;

import org.muml.storydiagram.patterns.PatternsFactory;
import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.verification.sdd.basicsdd.StoryPatternNode;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin;

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
	public void init_StoryPatternNode_2003(StoryPatternNode instance) {
		try {
			instance.setName("PatternNode");
			StoryPattern newInstance_1_0 = PatternsFactory.eINSTANCE.createStoryPattern();
			instance.setPattern(newInstance_1_0);
			newInstance_1_0.setComment("");

		} catch (RuntimeException e) {
			BasicSDDDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = BasicSDDDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			BasicSDDDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
