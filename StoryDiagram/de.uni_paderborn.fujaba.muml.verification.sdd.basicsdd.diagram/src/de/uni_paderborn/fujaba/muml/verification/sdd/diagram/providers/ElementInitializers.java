package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers;

import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.StoryPattern;

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
	public void init_StoryPatternNode_2003(
			de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryPatternNode instance) {
		try {
			instance.setName("PatternNode");
			StoryPattern newInstance_1_0 = PatternsFactory.eINSTANCE
					.createStoryPattern();
			instance.setPattern(newInstance_1_0);
			newInstance_1_0.setComment("");

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
