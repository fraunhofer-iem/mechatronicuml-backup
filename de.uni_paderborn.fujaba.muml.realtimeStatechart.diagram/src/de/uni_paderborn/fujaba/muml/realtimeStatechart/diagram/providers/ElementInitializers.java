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
	public void init_State_3010(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.State instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlOCLFactory
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
	public void init_DoEvent_3002(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent instance) {
		try {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action newInstance_0_0 = de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory.eINSTANCE
					.createAction();
			instance.setAction(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getAction(), null).evaluate(
							newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_SynchronizationChannel_3005(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							6,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getSynchronizationChannel(), null)
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
	public void init_Region_3006(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							8,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getRegion(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StateEntryPoint_3014(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							10,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getStateEntryPoint(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StateExitPoint_3015(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							11,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getStateExitPoint(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_EntryPoint_3012(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							12,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getEntryPoint(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ExitPoint_3013(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlOCLFactory
					.getExpression(
							13,
							de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getExitPoint(), null).evaluate(instance);
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
