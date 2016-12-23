package org.muml.reconfiguration.componentstorydiagram.diagram.providers;

import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.component.DelegationConnector;
import org.muml.reconfiguration.ReconfigurableComponent;
import org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode;
import org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage;
import org.muml.reconfiguration.componentstorydiagram.ControllerExchangeNode;
import org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression;
import org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory;
import org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin;
import org.muml.reconfiguration.componentstorypattern.AssemblyVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentPartVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern;
import org.muml.reconfiguration.componentstorypattern.ComponentVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternFactory;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.DelegationVariable;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityFinalNode;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.activities.JunctionNode;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.BindingState;
import org.muml.storydiagram.patterns.PatternsPackage;

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
			Object value_0 = ComponentStoryDiagramOCLFactory
					.getExpression(0, ActivitiesPackage.eINSTANCE.getActivity(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentStoryDiagramDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ComponentStoryNode_3001(ComponentStoryNode instance) {
		try {
			ComponentStoryPattern newInstance_0_0 = ComponentstorypatternFactory.eINSTANCE
					.createComponentStoryPattern();
			instance.setComponentStoryPattern(newInstance_0_0);
			Object value_0_0_0 = ComponentStoryDiagramOCLFactory
					.getExpression(1, ComponentstorypatternPackage.eINSTANCE.getComponentStoryPattern(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			ComponentVariable newInstance_0_0_1_0 = ComponentstorypatternFactory.eINSTANCE.createComponentVariable();
			newInstance_0_0.setThisVariable(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = ComponentStoryDiagramOCLFactory
					.getExpression(2, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);
			newInstance_0_0_1_0.setName((String) value_0_0_1_0_0);
			Object value_0_0_1_0_1 = ComponentStoryDiagramOCLFactory
					.getExpression(3, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_1 = ComponentStoryDiagramAbstractExpression.performCast(value_0_0_1_0_1,
					PatternsPackage.eINSTANCE.getBindingState());
			newInstance_0_0_1_0.setBindingState((BindingState) value_0_0_1_0_1);
			Object value_0_0_1_0_2 = ComponentStoryDiagramOCLFactory
					.getExpression(4, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_2 = ComponentStoryDiagramAbstractExpression.performCast(value_0_0_1_0_2,
					PatternsPackage.eINSTANCE.getBindingSemantics());
			newInstance_0_0_1_0.setBindingSemantics((BindingSemantics) value_0_0_1_0_2);
			Object value_0_0_1_0_3 = ComponentStoryDiagramOCLFactory
					.getExpression(5, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);
			newInstance_0_0_1_0.setType((ReconfigurableComponent) value_0_0_1_0_3);

			Object value_1 = ComponentStoryDiagramOCLFactory
					.getExpression(6, ComponentstorydiagramPackage.eINSTANCE.getComponentStoryNode(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			ComponentStoryDiagramDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InitialNode_3007(InitialNode instance) {
		try {
			Object value_0 = ComponentStoryDiagramOCLFactory
					.getExpression(12, ActivitiesPackage.eINSTANCE.getInitialNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentStoryDiagramDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JunctionNode_3008(JunctionNode instance) {
		try {
			Object value_0 = ComponentStoryDiagramOCLFactory
					.getExpression(13, ActivitiesPackage.eINSTANCE.getJunctionNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentStoryDiagramDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ActivityFinalNode_3010(ActivityFinalNode instance) {
		try {
			Object value_0 = ComponentStoryDiagramOCLFactory
					.getExpression(14, ActivitiesPackage.eINSTANCE.getActivityFinalNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentStoryDiagramDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ControllerExchangeNode_3021(ControllerExchangeNode instance) {
		try {
			ComponentStoryPattern newInstance_0_0 = ComponentstorypatternFactory.eINSTANCE
					.createComponentStoryPattern();
			instance.setComponentStoryPattern(newInstance_0_0);
			Object value_0_0_0 = ComponentStoryDiagramOCLFactory
					.getExpression(15, ComponentstorypatternPackage.eINSTANCE.getComponentStoryPattern(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			ComponentVariable newInstance_0_0_1_0 = ComponentstorypatternFactory.eINSTANCE.createComponentVariable();
			newInstance_0_0.setThisVariable(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = ComponentStoryDiagramOCLFactory
					.getExpression(16, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);
			newInstance_0_0_1_0.setName((String) value_0_0_1_0_0);
			Object value_0_0_1_0_1 = ComponentStoryDiagramOCLFactory
					.getExpression(17, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_1 = ComponentStoryDiagramAbstractExpression.performCast(value_0_0_1_0_1,
					PatternsPackage.eINSTANCE.getBindingState());
			newInstance_0_0_1_0.setBindingState((BindingState) value_0_0_1_0_1);
			Object value_0_0_1_0_2 = ComponentStoryDiagramOCLFactory
					.getExpression(18, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_2 = ComponentStoryDiagramAbstractExpression.performCast(value_0_0_1_0_2,
					PatternsPackage.eINSTANCE.getBindingSemantics());
			newInstance_0_0_1_0.setBindingSemantics((BindingSemantics) value_0_0_1_0_2);
			ComponentPartVariable newInstance_0_0_1_0_3_0 = ComponentstorypatternFactory.eINSTANCE
					.createComponentPartVariable();
			newInstance_0_0_1_0.getPartVariables().add(newInstance_0_0_1_0_3_0);
			Object value_0_0_1_0_3_0_0 = ComponentStoryDiagramOCLFactory
					.getExpression(19, ComponentstorypatternPackage.eINSTANCE.getComponentPartVariable(), null)
					.evaluate(newInstance_0_0_1_0_3_0);

			value_0_0_1_0_3_0_0 = ComponentStoryDiagramAbstractExpression.performCast(value_0_0_1_0_3_0_0,
					PatternsPackage.eINSTANCE.getBindingOperator());
			newInstance_0_0_1_0_3_0.setBindingOperator((BindingOperator) value_0_0_1_0_3_0_0);

			ComponentPartVariable newInstance_0_0_1_0_3_1 = ComponentstorypatternFactory.eINSTANCE
					.createComponentPartVariable();
			newInstance_0_0_1_0.getPartVariables().add(newInstance_0_0_1_0_3_1);
			Object value_0_0_1_0_3_1_0 = ComponentStoryDiagramOCLFactory
					.getExpression(20, ComponentstorypatternPackage.eINSTANCE.getComponentPartVariable(), null)
					.evaluate(newInstance_0_0_1_0_3_1);

			value_0_0_1_0_3_1_0 = ComponentStoryDiagramAbstractExpression.performCast(value_0_0_1_0_3_1_0,
					PatternsPackage.eINSTANCE.getBindingOperator());
			newInstance_0_0_1_0_3_1.setBindingOperator((BindingOperator) value_0_0_1_0_3_1_0);

			Object value_0_0_1_0_4 = ComponentStoryDiagramOCLFactory
					.getExpression(21, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);
			newInstance_0_0_1_0.setType((ReconfigurableComponent) value_0_0_1_0_4);

			Object value_1 = ComponentStoryDiagramOCLFactory
					.getExpression(22, ComponentstorydiagramPackage.eINSTANCE.getControllerExchangeNode(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			ComponentStoryDiagramDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_AssemblyVariable_4004(AssemblyVariable instance) {
		try {
			Object value_0 = ComponentStoryDiagramOCLFactory
					.getExpression(26, ComponentstorypatternPackage.eINSTANCE.getAssemblyVariable(), null)
					.evaluate(instance);
			instance.setType((AssemblyConnector) value_0);
		} catch (RuntimeException e) {
			ComponentStoryDiagramDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_DelegationVariable_4005(DelegationVariable instance) {
		try {
			Object value_0 = ComponentStoryDiagramOCLFactory
					.getExpression(29, ComponentstorypatternPackage.eINSTANCE.getDelegationVariable(), null)
					.evaluate(instance);
			instance.setType((DelegationConnector) value_0);
		} catch (RuntimeException e) {
			ComponentStoryDiagramDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ComponentStoryDiagramDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ComponentStoryDiagramDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
