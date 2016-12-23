package org.muml.pm.hardware.resourceinstance.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;
import org.muml.pm.hardware.hwresourceinstance.ActuatorInstance;
import org.muml.pm.hardware.hwresourceinstance.CacheInstance;
import org.muml.pm.hardware.hwresourceinstance.HWPort;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.ProcessingMemoryInstance;
import org.muml.pm.hardware.hwresourceinstance.ProcessorInstance;
import org.muml.pm.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance;
import org.muml.pm.hardware.hwresourceinstance.SensorInstance;
import org.muml.pm.hardware.hwresourceinstance.StorageMemoryInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.pm.hardware.hwvaluetype.DataSize;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypeFactory;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;
import org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression;
import org.muml.pm.hardware.resourceinstance.diagram.expressions.HardwareOCLFactory;
import org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin;

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
	public void init_SensorInstance_2007(SensorInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(32, HwresourceinstancePackage.eINSTANCE.getSensorInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ActuatorInstance_2008(ActuatorInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(33, HwresourceinstancePackage.eINSTANCE.getActuatorInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_StructuredResourceInstance_2009(StructuredResourceInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(34, HwresourceinstancePackage.eINSTANCE.getStructuredResourceInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_HWPort_3017(HWPort instance) {
		try {
			Object value_0 = HardwareOCLFactory.getExpression(35, HwresourceinstancePackage.eINSTANCE.getHWPort(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_CacheInstance_3018(CacheInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(36, HwresourceinstancePackage.eINSTANCE.getCacheInstance(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ProgrammableLogicDeviceInstance_3019(ProgrammableLogicDeviceInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(37, HwresourceinstancePackage.eINSTANCE.getProgrammableLogicDeviceInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ProcessorInstance_3020(ProcessorInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(38, HwresourceinstancePackage.eINSTANCE.getProcessorInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ProcessingMemoryInstance_3021(ProcessingMemoryInstance instance) {
		try {
			DataSize newInstance_0_0 = HwvaluetypeFactory.eINSTANCE.createDataSize();
			instance.setMemorySize(newInstance_0_0);
			Object value_0_0_0 = HardwareOCLFactory.getExpression(18, HwvaluetypePackage.eINSTANCE.getDataSize(), null)
					.evaluate(newInstance_0_0);

			value_0_0_0 = HardwareAbstractExpression.performCast(value_0_0_0, EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

			Object value_1 = HardwareOCLFactory
					.getExpression(39, HwresourceinstancePackage.eINSTANCE.getProcessingMemoryInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_StorageMemoryInstance_3022(StorageMemoryInstance instance) {
		try {
			DataSize newInstance_0_0 = HwvaluetypeFactory.eINSTANCE.createDataSize();
			instance.setMemorySize(newInstance_0_0);
			Object value_0_0_0 = HardwareOCLFactory.getExpression(24, HwvaluetypePackage.eINSTANCE.getDataSize(), null)
					.evaluate(newInstance_0_0);

			value_0_0_0 = HardwareAbstractExpression.performCast(value_0_0_0, EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

			Object value_1 = HardwareOCLFactory
					.getExpression(40, HwresourceinstancePackage.eINSTANCE.getStorageMemoryInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ResourceInstanceDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ResourceInstanceDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
