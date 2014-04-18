package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers;

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
	public void init_Device_2001(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.Device instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
									.getDevice(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredResource_2002(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.StructuredResource instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							7,
							de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
									.getStructuredResource(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Bus_2003(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.Bus instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							29,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Link_2004(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.Link instance) {
		try {
			de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate newInstance_0_0 = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							33,
							de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRate(), null).evaluate(
							newInstance_0_0);

			value_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_0).doubleValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CommunicationResource_3001(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
									.getCommunicationResource(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_1_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_1_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0.setLowerBound(newInstance_1_0_0_0);
			Object value_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_0_0_0);

			value_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_1_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_0_0.setValue(((Long) value_1_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_1_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0.setUpperBound(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_0_1_0);

			value_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_1_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_1_0.setValue(((Long) value_1_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Cache_3002(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.Cache instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							8,
							de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
									.getCache(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Processor_3003(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							13,
							de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
									.getProcessor(), null).evaluate(instance);
			instance.setName((String) value_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			instance.setNbCores(newInstance_1_0);
			Object value_1_0_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							14,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_0);

			value_1_0_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_1_0.setValue(((Long) value_1_0_0).longValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProgrammableLogicDevice_3004(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.ProgrammableLogicDevice instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							19,
							de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
									.getProgrammableLogicDevice(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_MemoryResource_3005(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.MemoryResource instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(
							22,
							de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
									.getMemoryResource(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
