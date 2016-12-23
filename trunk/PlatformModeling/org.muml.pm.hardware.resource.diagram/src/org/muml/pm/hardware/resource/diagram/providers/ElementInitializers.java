package org.muml.pm.hardware.resource.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.ValuetypeFactory;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pm.hardware.hwresource.BusProtocol;
import org.muml.pm.hardware.hwresource.Cache;
import org.muml.pm.hardware.hwresource.CommunicationProtocolRepository;
import org.muml.pm.hardware.hwresource.CommunicationResource;
import org.muml.pm.hardware.hwresource.Device;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.LinkProtocol;
import org.muml.pm.hardware.hwresource.MemoryResource;
import org.muml.pm.hardware.hwresource.Processor;
import org.muml.pm.hardware.hwresource.ProgrammableLogicDevice;
import org.muml.pm.hardware.hwresource.StructuredResource;
import org.muml.pm.hardware.hwvaluetype.DataRate;
import org.muml.pm.hardware.hwvaluetype.DataRateUnit;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypeFactory;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;
import org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression;
import org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory;
import org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin;

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
	public void init_Device_2006(Device instance) {
		try {
			Object value_0 = HardwareOCLFactory.getExpression(33, HwresourcePackage.eINSTANCE.getDevice(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_StructuredResource_2007(StructuredResource instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(34, HwresourcePackage.eINSTANCE.getStructuredResource(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_CommunicationProtocolRepository_2008(CommunicationProtocolRepository instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(35, HwresourcePackage.eINSTANCE.getCommunicationProtocolRepository(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_CommunicationResource_3011(CommunicationResource instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(0, HwresourcePackage.eINSTANCE.getCommunicationResource(), null).evaluate(instance);
			instance.setName((String) value_0);
			Cardinality newInstance_1_0 = ValuetypeFactory.eINSTANCE.createCardinality();
			instance.setCardinality(newInstance_1_0);
			NaturalNumber newInstance_1_0_0_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_1_0.setLowerBound(newInstance_1_0_0_0);
			Object value_1_0_0_0_0 = HardwareOCLFactory
					.getExpression(1, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_1_0_0_0);

			value_1_0_0_0_0 = HardwareAbstractExpression.performCast(value_1_0_0_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_0_0.setValue(((Long) value_1_0_0_0_0).longValue());

			NaturalNumber newInstance_1_0_1_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_1_0.setUpperBound(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = HardwareOCLFactory
					.getExpression(2, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_1_0_1_0);

			value_1_0_1_0_0 = HardwareAbstractExpression.performCast(value_1_0_1_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_1_0.setValue(((Long) value_1_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_CommunicationResource_3012(CommunicationResource instance) {
		try {
			Cardinality newInstance_0_0 = ValuetypeFactory.eINSTANCE.createCardinality();
			instance.setCardinality(newInstance_0_0);
			NaturalNumber newInstance_0_0_0_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = HardwareOCLFactory
					.getExpression(6, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = HardwareAbstractExpression.performCast(value_0_0_0_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			NaturalNumber newInstance_0_0_1_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = HardwareOCLFactory
					.getExpression(7, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = HardwareAbstractExpression.performCast(value_0_0_1_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = HardwareOCLFactory
					.getExpression(36, HwresourcePackage.eINSTANCE.getCommunicationResource(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Cache_3013(Cache instance) {
		try {
			Object value_0 = HardwareOCLFactory.getExpression(37, HwresourcePackage.eINSTANCE.getCache(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Processor_3014(Processor instance) {
		try {
			NaturalNumber newInstance_0_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			instance.setNbCores(newInstance_0_0);
			Object value_0_0_0 = HardwareOCLFactory
					.getExpression(14, ValuetypePackage.eINSTANCE.getNaturalNumber(), null).evaluate(newInstance_0_0);

			value_0_0_0 = HardwareAbstractExpression.performCast(value_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0.setValue(((Long) value_0_0_0).longValue());

			Object value_1 = HardwareOCLFactory.getExpression(38, HwresourcePackage.eINSTANCE.getProcessor(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ProgrammableLogicDevice_3015(ProgrammableLogicDevice instance) {
		try {
			Object value_0 = HardwareOCLFactory
					.getExpression(39, HwresourcePackage.eINSTANCE.getProgrammableLogicDevice(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_MemoryResource_3016(MemoryResource instance) {
		try {
			Object value_0 = HardwareOCLFactory.getExpression(40, HwresourcePackage.eINSTANCE.getMemoryResource(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_BusProtocol_3017(BusProtocol instance) {
		try {
			DataRate newInstance_0_0 = HwvaluetypeFactory.eINSTANCE.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = HardwareOCLFactory.getExpression(27, HwvaluetypePackage.eINSTANCE.getDataRate(), null)
					.evaluate(newInstance_0_0);

			value_0_0_0 = HardwareAbstractExpression.performCast(value_0_0_0,
					HwvaluetypePackage.eINSTANCE.getDataRateUnit());
			newInstance_0_0.setUnit((DataRateUnit) value_0_0_0);
			Object value_0_0_1 = HardwareOCLFactory.getExpression(28, HwvaluetypePackage.eINSTANCE.getDataRate(), null)
					.evaluate(newInstance_0_0);

			value_0_0_1 = HardwareAbstractExpression.performCast(value_0_0_1, EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_1).doubleValue());

			Object value_1 = HardwareOCLFactory.getExpression(41, HwresourcePackage.eINSTANCE.getBusProtocol(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_LinkProtocol_3018(LinkProtocol instance) {
		try {
			DataRate newInstance_0_0 = HwvaluetypeFactory.eINSTANCE.createDataRate();
			instance.setBandwidth(newInstance_0_0);
			Object value_0_0_0 = HardwareOCLFactory.getExpression(29, HwvaluetypePackage.eINSTANCE.getDataRate(), null)
					.evaluate(newInstance_0_0);

			value_0_0_0 = HardwareAbstractExpression.performCast(value_0_0_0,
					HwvaluetypePackage.eINSTANCE.getDataRateUnit());
			newInstance_0_0.setUnit((DataRateUnit) value_0_0_0);
			Object value_0_0_1 = HardwareOCLFactory.getExpression(30, HwvaluetypePackage.eINSTANCE.getDataRate(), null)
					.evaluate(newInstance_0_0);

			value_0_0_1 = HardwareAbstractExpression.performCast(value_0_0_1, EcorePackage.eINSTANCE.getEDouble());
			newInstance_0_0.setValue(((Double) value_0_0_1).doubleValue());

			Object value_1 = HardwareOCLFactory.getExpression(42, HwresourcePackage.eINSTANCE.getLinkProtocol(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			HardwareDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = HardwareDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			HardwareDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
