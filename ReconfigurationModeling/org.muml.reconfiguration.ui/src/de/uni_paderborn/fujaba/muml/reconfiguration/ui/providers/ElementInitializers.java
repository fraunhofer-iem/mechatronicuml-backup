package de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers;


/**
 * @generated
 */
public class ElementInitializers extends org.muml.pim.component.diagram.providers.ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	

	/**
	 * @generated
	 */
	public void init_ReconfigurationMessagePort_3076(
			de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort instance) {
		try {
			org.muml.pim.valuetype.Cardinality newInstance_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			

			
			newInstance_0_0_0_0.setValue(1);

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
		
			newInstance_0_0_1_0.setValue(1);
			instance.setName("reconfMsg");
		} catch (RuntimeException e) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	

	public void init_ReconfigurationExecutionPort_3077(
			de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort instance) {
		try {
			org.muml.pim.valuetype.Cardinality newInstance_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			

			
			newInstance_0_0_0_0.setValue(1);

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
		
			newInstance_0_0_1_0.setValue(1);
			instance.setName("reconfExec");
		} catch (RuntimeException e) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}
	
	public void init_BroadcastPort_3078(
			de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort instance) {
		try {
			org.muml.pim.valuetype.Cardinality newInstance_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			

			
			newInstance_0_0_0_0.setValue(1);

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
		
			newInstance_0_0_1_0.setValue(1);
			instance.setName("broadcast");
		} catch (RuntimeException e) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}


	public static org.muml.pim.component.diagram.providers.ElementInitializers getInstance() {
		org.muml.pim.component.diagram.providers.ElementInitializers cached = org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin
				.getInstance().getElementInitializers();
		//set the cached element initializer to this one
		if (cached == null || !(cached instanceof de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ElementInitializers)) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ElementInitializers());
		}
		return (de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ElementInitializers)cached;
	}
}
