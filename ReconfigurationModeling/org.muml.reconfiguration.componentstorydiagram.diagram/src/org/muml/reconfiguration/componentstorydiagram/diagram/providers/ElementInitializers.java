package org.muml.reconfiguration.componentstorydiagram.diagram.providers;

import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

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
			Object value_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(0,
							ActivitiesPackage.eINSTANCE.getActivity(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ComponentStoryNode_3001(
			org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode instance) {
		try {
			org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern newInstance_0_0 = org.muml.reconfiguration.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentStoryPattern();
			instance.setComponentStoryPattern(newInstance_0_0);
			Object value_0_0_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							1,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentStoryPattern(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			org.muml.reconfiguration.componentstorypattern.ComponentVariable newInstance_0_0_1_0 = org.muml.reconfiguration.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentVariable();
			newInstance_0_0.setThisVariable(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							2,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);
			newInstance_0_0_1_0.setName((String) value_0_0_1_0_0);
			Object value_0_0_1_0_1 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							3,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_1 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_1,
							PatternsPackage.eINSTANCE.getBindingState());
			newInstance_0_0_1_0.setBindingState((BindingState) value_0_0_1_0_1);
			Object value_0_0_1_0_2 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							4,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_2 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_2,
							PatternsPackage.eINSTANCE.getBindingSemantics());
			newInstance_0_0_1_0
					.setBindingSemantics((BindingSemantics) value_0_0_1_0_2);
			Object value_0_0_1_0_3 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							5,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);
			newInstance_0_0_1_0
					.setType((org.muml.reconfiguration.ReconfigurableComponent) value_0_0_1_0_3);

			Object value_1 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							6,
							org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
									.getComponentStoryNode(), null).evaluate(
							instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InitialNode_3007(InitialNode instance) {
		try {
			Object value_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(12,
							ActivitiesPackage.eINSTANCE.getInitialNode(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JunctionNode_3008(JunctionNode instance) {
		try {
			Object value_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(13,
							ActivitiesPackage.eINSTANCE.getJunctionNode(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ActivityFinalNode_3010(ActivityFinalNode instance) {
		try {
			Object value_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(14,
							ActivitiesPackage.eINSTANCE.getActivityFinalNode(),
							null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ControllerExchangeNode_3021(
			org.muml.reconfiguration.componentstorydiagram.ControllerExchangeNode instance) {
		try {
			org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern newInstance_0_0 = org.muml.reconfiguration.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentStoryPattern();
			instance.setComponentStoryPattern(newInstance_0_0);
			Object value_0_0_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							15,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentStoryPattern(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			org.muml.reconfiguration.componentstorypattern.ComponentVariable newInstance_0_0_1_0 = org.muml.reconfiguration.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentVariable();
			newInstance_0_0.setThisVariable(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							16,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);
			newInstance_0_0_1_0.setName((String) value_0_0_1_0_0);
			Object value_0_0_1_0_1 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							17,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_1 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_1,
							PatternsPackage.eINSTANCE.getBindingState());
			newInstance_0_0_1_0.setBindingState((BindingState) value_0_0_1_0_1);
			Object value_0_0_1_0_2 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							18,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_2 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_2,
							PatternsPackage.eINSTANCE.getBindingSemantics());
			newInstance_0_0_1_0
					.setBindingSemantics((BindingSemantics) value_0_0_1_0_2);
			org.muml.reconfiguration.componentstorypattern.ComponentPartVariable newInstance_0_0_1_0_3_0 = org.muml.reconfiguration.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentPartVariable();
			newInstance_0_0_1_0.getPartVariables().add(newInstance_0_0_1_0_3_0);
			Object value_0_0_1_0_3_0_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							19,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentPartVariable(), null)
					.evaluate(newInstance_0_0_1_0_3_0);

			value_0_0_1_0_3_0_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_3_0_0,
							PatternsPackage.eINSTANCE.getBindingOperator());
			newInstance_0_0_1_0_3_0
					.setBindingOperator((BindingOperator) value_0_0_1_0_3_0_0);

			org.muml.reconfiguration.componentstorypattern.ComponentPartVariable newInstance_0_0_1_0_3_1 = org.muml.reconfiguration.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentPartVariable();
			newInstance_0_0_1_0.getPartVariables().add(newInstance_0_0_1_0_3_1);
			Object value_0_0_1_0_3_1_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							20,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentPartVariable(), null)
					.evaluate(newInstance_0_0_1_0_3_1);

			value_0_0_1_0_3_1_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_3_1_0,
							PatternsPackage.eINSTANCE.getBindingOperator());
			newInstance_0_0_1_0_3_1
					.setBindingOperator((BindingOperator) value_0_0_1_0_3_1_0);

			Object value_0_0_1_0_4 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							21,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);
			newInstance_0_0_1_0
					.setType((org.muml.reconfiguration.ReconfigurableComponent) value_0_0_1_0_4);

			Object value_1 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							22,
							org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
									.getControllerExchangeNode(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AssemblyVariable_4004(
			org.muml.reconfiguration.componentstorypattern.AssemblyVariable instance) {
		try {
			Object value_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							26,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getAssemblyVariable(), null).evaluate(
							instance);
			instance.setType((org.muml.pim.component.AssemblyConnector) value_0);
		} catch (RuntimeException e) {
			org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DelegationVariable_4005(
			org.muml.reconfiguration.componentstorypattern.DelegationVariable instance) {
		try {
			Object value_0 = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							29,
							org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getDelegationVariable(), null).evaluate(
							instance);
			instance.setType((org.muml.pim.component.DelegationConnector) value_0);
		} catch (RuntimeException e) {
			org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
