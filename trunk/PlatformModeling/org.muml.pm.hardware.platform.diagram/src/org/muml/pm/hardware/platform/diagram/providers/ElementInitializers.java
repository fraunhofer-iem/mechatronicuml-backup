package org.muml.pm.hardware.platform.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.ValuetypeFactory;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pm.hardware.hwplatform.DelegationHWPort;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HWPlatformPart;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.ResourcePart;
import org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression;
import org.muml.pm.hardware.platform.diagram.expressions.HardwareOCLFactory;
import org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin;

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
	public void init_HWPlatform_2009(HWPlatform instance) {
		try {
			Object value_0 = HardwareOCLFactory.getExpression(16, HwplatformPackage.eINSTANCE.getHWPlatform(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_HWPlatformPart_3027(HWPlatformPart instance) {
		try {
			Cardinality newInstance_0_0 = ValuetypeFactory.eINSTANCE.createCardinality();
			instance.setCardinality(newInstance_0_0);
			NaturalNumber newInstance_0_0_0_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = HardwareOCLFactory
					.getExpression(3, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = HardwareAbstractExpression.performCast(value_0_0_0_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			NaturalNumber newInstance_0_0_1_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = HardwareOCLFactory
					.getExpression(4, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = HardwareAbstractExpression.performCast(value_0_0_1_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = HardwareOCLFactory.getExpression(17, HwplatformPackage.eINSTANCE.getHWPlatformPart(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			PlatformDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_DelegationHWPort_3029(DelegationHWPort instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(18, HwplatformPackage.eINSTANCE.getDelegationHWPort(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			PlatformDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ResourcePart_3030(ResourcePart instance) {
		try {
			Cardinality newInstance_0_0 = ValuetypeFactory.eINSTANCE.createCardinality();
			instance.setCardinality(newInstance_0_0);
			NaturalNumber newInstance_0_0_0_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = HardwareOCLFactory
					.getExpression(9, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = HardwareAbstractExpression.performCast(value_0_0_0_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			NaturalNumber newInstance_0_0_1_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = HardwareOCLFactory
					.getExpression(10, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = HardwareAbstractExpression.performCast(value_0_0_1_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = HardwareOCLFactory.getExpression(19, HwplatformPackage.eINSTANCE.getResourcePart(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			PlatformDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = PlatformDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			PlatformDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
