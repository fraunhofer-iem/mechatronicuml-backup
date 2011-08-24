package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers;

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
	public void init_DiscreteSinglePortInstance_2005(
			de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							5,
							de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
									.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HardwarePortInstance_3013(
			de.uni_paderborn.fujaba.muml.model.instance.HardwarePortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
									.getHardwarePortInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DiscreteSinglePortInstance_3010(
			de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
									.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ContinuousPortInstance_3011(
			de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
									.getContinuousPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HybridPortInstance_3012(
			de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
									.getHybridPortInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
