package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers;

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
	public void init_State_2020(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.State instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.UmlrtOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_State_2021(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.State instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.UmlrtOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(instance);
			instance.setName((String) value_0);
			Object value_1 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.UmlrtOCLFactory
					.getExpression(
							4,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(instance);
			instance.setInitial(((Boolean) value_1).booleanValue());
			Object value_2 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.UmlrtOCLFactory
					.getExpression(
							5,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(instance);
			instance.setFinal(((Boolean) value_2).booleanValue());
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_State_2022(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.State instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.UmlrtOCLFactory
					.getExpression(
							6,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(instance);
			instance.setName((String) value_0);
			Object value_1 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.UmlrtOCLFactory
					.getExpression(
							7,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(instance);
			instance.setInitial(((Boolean) value_1).booleanValue());
			Object value_2 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.UmlrtOCLFactory
					.getExpression(
							8,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(instance);
			instance.setFinal(((Boolean) value_2).booleanValue());
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HistoryState_2023(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryState instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.UmlrtOCLFactory
					.getExpression(
							9,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getHistoryState(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Clock_2024(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.UmlrtOCLFactory
					.getExpression(
							10,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getClock(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
