package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers;

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
			Object value_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(0,
							ActivitiesPackage.eINSTANCE.getActivity(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ComponentStoryNode_3001(
			de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryNode instance) {
		try {
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern newInstance_0_0 = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentStoryPattern();
			instance.setComponentStoryPattern(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentStoryPattern(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentVariable();
			newInstance_0_0.setThisVariable(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);
			newInstance_0_0_1_0.setName((String) value_0_0_1_0_0);
			Object value_0_0_1_0_1 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_1 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_1,
							PatternsPackage.eINSTANCE.getBindingState());
			newInstance_0_0_1_0.setBindingState((BindingState) value_0_0_1_0_1);
			Object value_0_0_1_0_2 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							4,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_2 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_2,
							PatternsPackage.eINSTANCE.getBindingSemantics());
			newInstance_0_0_1_0
					.setBindingSemantics((BindingSemantics) value_0_0_1_0_2);
			Object value_0_0_1_0_3 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							5,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);
			newInstance_0_0_1_0
					.setType((de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent) value_0_0_1_0_3);

			Object value_1 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							6,
							de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
									.getComponentStoryNode(), null).evaluate(
							instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InitialNode_3007(InitialNode instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(12,
							ActivitiesPackage.eINSTANCE.getInitialNode(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JunctionNode_3008(JunctionNode instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(13,
							ActivitiesPackage.eINSTANCE.getJunctionNode(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ActivityFinalNode_3010(ActivityFinalNode instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(14,
							ActivitiesPackage.eINSTANCE.getActivityFinalNode(),
							null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ControllerExchangeNode_3021(
			de.uni_paderborn.fujaba.muml.componentstorydiagram.ControllerExchangeNode instance) {
		try {
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern newInstance_0_0 = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentStoryPattern();
			instance.setComponentStoryPattern(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							15,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentStoryPattern(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentVariable();
			newInstance_0_0.setThisVariable(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							16,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);
			newInstance_0_0_1_0.setName((String) value_0_0_1_0_0);
			Object value_0_0_1_0_1 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							17,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_1 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_1,
							PatternsPackage.eINSTANCE.getBindingState());
			newInstance_0_0_1_0.setBindingState((BindingState) value_0_0_1_0_1);
			Object value_0_0_1_0_2 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							18,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_2 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_2,
							PatternsPackage.eINSTANCE.getBindingSemantics());
			newInstance_0_0_1_0
					.setBindingSemantics((BindingSemantics) value_0_0_1_0_2);
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable newInstance_0_0_1_0_3_0 = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentPartVariable();
			newInstance_0_0_1_0.getPartVariables().add(newInstance_0_0_1_0_3_0);
			Object value_0_0_1_0_3_0_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							19,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentPartVariable(), null)
					.evaluate(newInstance_0_0_1_0_3_0);

			value_0_0_1_0_3_0_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_3_0_0,
							PatternsPackage.eINSTANCE.getBindingOperator());
			newInstance_0_0_1_0_3_0
					.setBindingOperator((BindingOperator) value_0_0_1_0_3_0_0);

			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable newInstance_0_0_1_0_3_1 = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentPartVariable();
			newInstance_0_0_1_0.getPartVariables().add(newInstance_0_0_1_0_3_1);
			Object value_0_0_1_0_3_1_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							20,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentPartVariable(), null)
					.evaluate(newInstance_0_0_1_0_3_1);

			value_0_0_1_0_3_1_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression
					.performCast(value_0_0_1_0_3_1_0,
							PatternsPackage.eINSTANCE.getBindingOperator());
			newInstance_0_0_1_0_3_1
					.setBindingOperator((BindingOperator) value_0_0_1_0_3_1_0);

			Object value_0_0_1_0_4 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							21,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);
			newInstance_0_0_1_0
					.setType((de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent) value_0_0_1_0_4);

			Object value_1 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							22,
							de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
									.getControllerExchangeNode(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AssemblyVariable_4004(
			de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							26,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getAssemblyVariable(), null).evaluate(
							instance);
			instance.setType((de.uni_paderborn.fujaba.muml.component.AssemblyConnector) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DelegationVariable_4005(
			de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
					.getExpression(
							29,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getDelegationVariable(), null).evaluate(
							instance);
			instance.setType((de.uni_paderborn.fujaba.muml.component.DelegationConnector) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
