package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers;

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
	public void init_StorageMemoryInstance_3005(
			de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataSize();
			instance.setMemorySize(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							13,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataSize(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProcessingMemoryInstance_3006(
			de.uni_paderborn.fujaba.muml.hardware.platform.ProcessingMemoryInstance instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataSize();
			instance.setMemorySize(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							19,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataSize(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Bus_3009(
			de.uni_paderborn.fujaba.muml.hardware.platform.Bus instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							29,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());
			Object value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							30,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareAbstractExpression
					.performCast(
							value_0_0_1,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRateUnit());
			newInstance_0_0
					.setUnit((de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit) value_0_0_1);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Link_4002(
			de.uni_paderborn.fujaba.muml.hardware.platform.Link instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							43,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());
			Object value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							44,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareAbstractExpression
					.performCast(
							value_0_0_1,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRateUnit());
			newInstance_0_0
					.setUnit((de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit) value_0_0_1);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Link_4005(
			de.uni_paderborn.fujaba.muml.hardware.platform.Link instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							54,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());
			Object value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							55,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareAbstractExpression
					.performCast(
							value_0_0_1,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRateUnit());
			newInstance_0_0
					.setUnit((de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit) value_0_0_1);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
