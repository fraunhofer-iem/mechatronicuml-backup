package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers;

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
	public void init_State_2008(
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.expressions.RealtimeStatechartOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InitialState_2009(
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.expressions.RealtimeStatechartOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getInitialState(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_FinalState_2010(
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.expressions.RealtimeStatechartOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getFinalState(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HistoryState_2011(
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.expressions.RealtimeStatechartOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getHistoryState(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Clock_2012(
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.expressions.RealtimeStatechartOCLFactory
					.getExpression(
							4,
							de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getClock(), null).evaluate(instance);
			instance.setName((String) value_0);
			Object value_1 = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.expressions.RealtimeStatechartOCLFactory
					.getExpression(
							5,
							de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getClock(), null).evaluate(instance);
			instance.setId((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
