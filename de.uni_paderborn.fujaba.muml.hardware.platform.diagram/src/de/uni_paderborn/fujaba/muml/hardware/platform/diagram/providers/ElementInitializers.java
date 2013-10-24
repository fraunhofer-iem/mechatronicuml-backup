package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers;

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
	public void init_Bus_3008(
			de.uni_paderborn.fujaba.muml.hardware.platform.Bus instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());
			Object value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(
							value_0_0_1,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRateUnit());
			newInstance_0_0
					.setUnit((de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit) value_0_0_1);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HWPlatformPart_3010(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart instance) {
		try {
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							6,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							7,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							8,
							de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
									.getHWPlatformPart(), null).evaluate(
							instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ResourceInstancePart_3012(
			de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart instance) {
		try {
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							14,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							15,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							16,
							de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
									.getResourceInstancePart(), null).evaluate(
							instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
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
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							27,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());
			Object value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							28,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(
							value_0_0_1,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRateUnit());
			newInstance_0_0
					.setUnit((de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit) value_0_0_1);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Link_4011(
			de.uni_paderborn.fujaba.muml.hardware.platform.Link instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							38,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());
			Object value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareOCLFactory
					.getExpression(
							39,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_1 = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression
					.performCast(
							value_0_0_1,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRateUnit());
			newInstance_0_0
					.setUnit((de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit) value_0_0_1);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
