package org.muml.pm.hardware.platform.diagram.providers;

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
	public void init_HWPlatform_2009(org.muml.pm.hardware.hwplatform.HWPlatform instance) {
		try {
			Object value_0 = org.muml.pm.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(16, org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getHWPlatform(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HWPlatformPart_3027(org.muml.pm.hardware.hwplatform.HWPlatformPart instance) {
		try {
			org.muml.pim.valuetype.Cardinality newInstance_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = org.muml.pm.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(3,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = org.muml.pm.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(4,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = org.muml.pm.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(17, org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getHWPlatformPart(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_DelegationHWPort_3029(org.muml.pm.hardware.hwplatform.DelegationHWPort instance) {
		try {
			Object value_0 = org.muml.pm.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(18, org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getDelegationHWPort(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ResourcePart_3030(org.muml.pm.hardware.hwplatform.ResourcePart instance) {
		try {
			org.muml.pim.valuetype.Cardinality newInstance_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = org.muml.pm.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(9,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = org.muml.pm.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(10,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = org.muml.pm.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(19, org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getResourcePart(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
