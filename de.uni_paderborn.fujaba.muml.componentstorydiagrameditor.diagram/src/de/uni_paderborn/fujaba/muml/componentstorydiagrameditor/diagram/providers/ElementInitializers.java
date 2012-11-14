package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers;

import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;

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
	public void init_Activity_2003(Activity instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(0,
							ActivitiesPackage.eINSTANCE.getActivity(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ComponentStoryNode_3001(
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode instance) {
		try {
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern newInstance_0_0 = de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentStoryPattern();
			instance.setComponentStoryPattern(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentStoryPattern(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

			Object value_1 = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage.eINSTANCE
									.getComponentStoryNode(), null).evaluate(
							instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
