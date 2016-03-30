package org.muml.pm.hardware.resourceinstance.diagram.providers;

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
	public void init_SensorInstance_2007(
			org.muml.pm.hardware.hwresourceinstance.SensorInstance instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(32,
							org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getSensorInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ActuatorInstance_2008(
			org.muml.pm.hardware.hwresourceinstance.ActuatorInstance instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(33,
							org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getActuatorInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredResourceInstance_2009(
			org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(34,
							org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getStructuredResourceInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HWPort_3017(org.muml.pm.hardware.hwresourceinstance.HWPort instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(35,
							org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getHWPort(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CacheInstance_3018(
			org.muml.pm.hardware.hwresourceinstance.CacheInstance instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(36,
							org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getCacheInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProgrammableLogicDeviceInstance_3019(
			org.muml.pm.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(37,
							org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getProgrammableLogicDeviceInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProcessorInstance_3020(
			org.muml.pm.hardware.hwresourceinstance.ProcessorInstance instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(38,
							org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getProcessorInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProcessingMemoryInstance_3021(
			org.muml.pm.hardware.hwresourceinstance.ProcessingMemoryInstance instance) {
		try {
			org.muml.pm.hardware.hwvaluetype.DataSize newInstance_0_0 = org.muml.pm.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataSize();
			instance.setMemorySize(newInstance_0_0);
			Object value_0_0_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(18, org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
							.getDataSize(), null)
					.evaluate(newInstance_0_0);

			value_0_0_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0, EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

			Object value_1 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(39,
							org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getProcessingMemoryInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StorageMemoryInstance_3022(
			org.muml.pm.hardware.hwresourceinstance.StorageMemoryInstance instance) {
		try {
			org.muml.pm.hardware.hwvaluetype.DataSize newInstance_0_0 = org.muml.pm.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataSize();
			instance.setMemorySize(newInstance_0_0);
			Object value_0_0_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(24, org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
							.getDataSize(), null)
					.evaluate(newInstance_0_0);

			value_0_0_0 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0, EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

			Object value_1 = org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory
					.getExpression(40,
							org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getStorageMemoryInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
