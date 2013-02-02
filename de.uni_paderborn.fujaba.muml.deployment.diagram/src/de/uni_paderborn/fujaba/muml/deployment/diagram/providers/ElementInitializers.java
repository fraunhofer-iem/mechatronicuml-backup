package de.uni_paderborn.fujaba.muml.deployment.diagram.providers;

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
	public void init_HardwareNode_2001(
			de.uni_paderborn.fujaba.muml.deployment.HardwareNode instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.deployment.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage.eINSTANCE
									.getHardwareNode(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HardwarePort_3001(
			de.uni_paderborn.fujaba.muml.deployment.HardwarePort instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.deployment.diagram.expressions.MumlOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage.eINSTANCE
									.getHardwarePort(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
