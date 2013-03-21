package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

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
	public void init_State_3032(
			de.uni_paderborn.fujaba.muml.realtimestatechart.State instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DoEvent_3034(
			de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent instance) {
		try {
			de.uni_paderborn.fujaba.muml.realtimestatechart.Action newInstance_0_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory.eINSTANCE
					.createAction();
			instance.setAction(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getAction(), null).evaluate(
							newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_SynchronizationChannel_3037(
			de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							6,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getSynchronizationChannel(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Region_3042(
			de.uni_paderborn.fujaba.muml.realtimestatechart.Region instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							8,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getRegion(), null).evaluate(instance);

			value_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlAbstractExpression
					.performCast(value_0, EcorePackage.eINSTANCE.getEInt());
			instance.setPriority(((Integer) value_0).intValue());
			de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart newInstance_1_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory.eINSTANCE
					.createRealtimeStatechart();
			instance.setEmbeddedStatechart(newInstance_1_0);
			Object value_1_0_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							9,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getRealtimeStatechart(), null).evaluate(
							newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);
			de.uni_paderborn.fujaba.muml.realtimestatechart.State newInstance_1_0_1_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory.eINSTANCE
					.createState();
			newInstance_1_0.getStates().add(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							10,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(
							newInstance_1_0_1_0);
			newInstance_1_0_1_0.setName((String) value_1_0_1_0_0);
			Object value_1_0_1_0_1 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							11,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(
							newInstance_1_0_1_0);
			newInstance_1_0_1_0.setInitial(((Boolean) value_1_0_1_0_1)
					.booleanValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_RealtimeStatechart_3043(
			de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart instance) {
		try {
			de.uni_paderborn.fujaba.muml.realtimestatechart.State newInstance_0_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory.eINSTANCE
					.createState();
			instance.getStates().add(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							12,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			Object value_0_0_1 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							13,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setInitial(((Boolean) value_0_0_1).booleanValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_EntryPoint_3040(
			de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							15,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getEntryPoint(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ExitPoint_3041(
			de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							16,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getExitPoint(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Transition_4003(
			de.uni_paderborn.fujaba.muml.realtimestatechart.Transition instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							18,
							de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getTransition(), null).evaluate(instance);

			value_0 = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlAbstractExpression
					.performCast(value_0, EcorePackage.eINSTANCE.getEInt());
			instance.setPriority(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
