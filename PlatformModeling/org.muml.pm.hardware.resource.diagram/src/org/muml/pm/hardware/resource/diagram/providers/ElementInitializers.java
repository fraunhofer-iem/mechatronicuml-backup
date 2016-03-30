package org.muml.pm.hardware.resource.diagram.providers;

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
	public void init_Device_2006(org.muml.pm.hardware.hwresource.Device instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(33,
							org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getDevice(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredResource_2007(
			org.muml.pm.hardware.hwresource.StructuredResource instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(34, org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getStructuredResource(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CommunicationProtocolRepository_2008(
			org.muml.pm.hardware.hwresource.CommunicationProtocolRepository instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(35, org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getCommunicationProtocolRepository(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CommunicationResource_3011(
			org.muml.pm.hardware.hwresource.CommunicationResource instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(0, org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getCommunicationResource(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
			org.muml.pim.valuetype.Cardinality newInstance_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_1_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_1_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0.setLowerBound(newInstance_1_0_0_0);
			Object value_1_0_0_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(1,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_1_0_0_0);

			value_1_0_0_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_1_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_0_0.setValue(((Long) value_1_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_1_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0.setUpperBound(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(2,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_1_0_1_0);

			value_1_0_1_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_1_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_1_0.setValue(((Long) value_1_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CommunicationResource_3012(
			org.muml.pm.hardware.hwresource.CommunicationResource instance) {
		try {
			org.muml.pim.valuetype.Cardinality newInstance_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(6,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(7,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(36, org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getCommunicationResource(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Cache_3013(org.muml.pm.hardware.hwresource.Cache instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(37,
							org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getCache(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Processor_3014(org.muml.pm.hardware.hwresource.Processor instance) {
		try {
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			instance.setNbCores(newInstance_0_0);
			Object value_0_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(14,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0);

			value_0_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0.setValue(((Long) value_0_0_0).longValue());

			Object value_1 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(38,
							org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getProcessor(),
							null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ProgrammableLogicDevice_3015(
			org.muml.pm.hardware.hwresource.ProgrammableLogicDevice instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(39, org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getProgrammableLogicDevice(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_MemoryResource_3016(org.muml.pm.hardware.hwresource.MemoryResource instance) {
		try {
			Object value_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(40, org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getMemoryResource(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_BusProtocol_3017(org.muml.pm.hardware.hwresource.BusProtocol instance) {
		try {
			org.muml.pm.hardware.hwvaluetype.DataRate newInstance_0_0 = org.muml.pm.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(27, org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
							.getDataRate(), null)
					.evaluate(newInstance_0_0);

			value_0_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRateUnit());
			newInstance_0_0.setUnit((org.muml.pm.hardware.hwvaluetype.DataRateUnit) value_0_0_0);
			Object value_0_0_1 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(28, org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
							.getDataRate(), null)
					.evaluate(newInstance_0_0);

			value_0_0_1 = org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_1, EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_1).doubleValue());

			Object value_1 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(41, org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getBusProtocol(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_LinkProtocol_3018(org.muml.pm.hardware.hwresource.LinkProtocol instance) {
		try {
			org.muml.pm.hardware.hwvaluetype.DataRate newInstance_0_0 = org.muml.pm.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(29, org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
							.getDataRate(), null)
					.evaluate(newInstance_0_0);

			value_0_0_0 = org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_0,
							org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
									.getDataRateUnit());
			newInstance_0_0.setUnit((org.muml.pm.hardware.hwvaluetype.DataRateUnit) value_0_0_0);
			Object value_0_0_1 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(30, org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
							.getDataRate(), null)
					.evaluate(newInstance_0_0);

			value_0_0_1 = org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression
					.performCast(value_0_0_1, EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_1).doubleValue());

			Object value_1 = org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory
					.getExpression(42, org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getLinkProtocol(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
