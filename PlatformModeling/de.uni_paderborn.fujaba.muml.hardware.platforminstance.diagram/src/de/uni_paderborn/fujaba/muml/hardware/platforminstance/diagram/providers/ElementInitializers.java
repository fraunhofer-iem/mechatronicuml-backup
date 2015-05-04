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
	public void init_HWPlatformInstance_2004(
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							37,
							de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
									.getHWPlatformInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HWPlatformInstance_3031(
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							38,
							de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
									.getHWPlatformInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DelegationHWPortInstance_3028(
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							39,
							de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
									.getDelegationHWPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredResourceInstance_3033(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							40,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getStructuredResourceInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CacheInstance_3017(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							41,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getCacheInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProgrammableLogicDeviceInstance_3018(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							42,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getProgrammableLogicDeviceInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProcessorInstance_3019(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							43,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getProcessorInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProcessingMemoryInstance_3020(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessingMemoryInstance instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataSize();
			instance.setMemorySize(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							15,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataSize(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

			Object value_1 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							44,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getProcessingMemoryInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StorageMemoryInstance_3021(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StorageMemoryInstance instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataSize();
			instance.setMemorySize(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							21,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataSize(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

			Object value_1 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							45,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getStorageMemoryInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HWPortInstance_3030(
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							46,
							de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
									.getHWPortInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ActuatorInstance_3034(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							47,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getActuatorInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_SensorInstance_3035(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.SensorInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							48,
							de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
									.getSensorInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_BusInstance_3036(
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							49,
							de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
									.getBusInstance(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_NetworkBridgeInstance_3038(
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkBridgeInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.expressions.HardwareOCLFactory
					.getExpression(
							50,
							de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
									.getNetworkBridgeInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
