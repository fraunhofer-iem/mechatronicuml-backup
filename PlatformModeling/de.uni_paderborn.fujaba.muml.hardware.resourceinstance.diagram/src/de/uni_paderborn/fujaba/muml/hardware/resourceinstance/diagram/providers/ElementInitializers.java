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
	public void init_SensorInstance_2004(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.SensorInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							32,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getSensorInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ActuatorInstance_2005(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							33,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getActuatorInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredResourceInstance_2006(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							34,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getStructuredResourceInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CommunicationResource_3014(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							35,
							de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
									.getCommunicationResource(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CacheInstance_3009(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							36,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getCacheInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProgrammableLogicDeviceInstance_3010(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							37,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getProgrammableLogicDeviceInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProcessorInstance_3011(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							38,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getProcessorInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
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

			Object value_1 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							39,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getProcessingMemoryInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
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

			Object value_1 = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							40,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getStorageMemoryInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
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
