package org.muml.pm.hardware.platforminstance.diagram.providers;

import org.muml.pm.hardware.hwplatforminstance.BusInstance;
import org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance;
import org.muml.pm.hardware.hwresourceinstance.ActuatorInstance;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.SensorInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.pm.hardware.platforminstance.diagram.expressions.HardwareOCLFactory;
import org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin;

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
	public void init_HWPlatformInstance_2005(HWPlatformInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(13, HwplatforminstancePackage.eINSTANCE.getHWPlatformInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_HWPlatformInstance_3040(HWPlatformInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(14, HwplatforminstancePackage.eINSTANCE.getHWPlatformInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_DelegationHWPortInstance_3041(DelegationHWPortInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(15, HwplatforminstancePackage.eINSTANCE.getDelegationHWPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_StructuredResourceInstance_3042(StructuredResourceInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(16, HwresourceinstancePackage.eINSTANCE.getStructuredResourceInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_HWPortInstance_3043(HWPortInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(17, HwplatforminstancePackage.eINSTANCE.getHWPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ActuatorInstance_3044(ActuatorInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(18, HwresourceinstancePackage.eINSTANCE.getActuatorInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_SensorInstance_3045(SensorInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(19, HwresourceinstancePackage.eINSTANCE.getSensorInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_BusInstance_3046(BusInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(20, HwplatforminstancePackage.eINSTANCE.getBusInstance(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_NetworkBridgeInstance_3047(NetworkBridgeInstance instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(21, HwplatforminstancePackage.eINSTANCE.getNetworkBridgeInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = PlatformInstanceDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			PlatformInstanceDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
