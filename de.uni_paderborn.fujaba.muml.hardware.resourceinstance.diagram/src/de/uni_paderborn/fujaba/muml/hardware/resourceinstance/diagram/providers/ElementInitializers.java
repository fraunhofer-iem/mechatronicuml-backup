package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers;

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
	public void init_ProcessingMemoryInstance_3012(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessingMemoryInstance instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataSize();
			instance.setMemorySize(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							18,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataSize(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StorageMemoryInstance_3013(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StorageMemoryInstance instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataSize();
			instance.setMemorySize(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							24,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataSize(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
