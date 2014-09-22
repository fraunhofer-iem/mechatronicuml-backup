package de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers;

import org.eclipse.emf.ecore.EcorePackage;

/**
 * @generated
 */
public class ElementInitializers extends de.uni_paderborn.fujaba.muml.component.diagram.providers.ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	

	/**
	 * @generated
	 */
	public void init_ReconfigurationMessagePort_3076(
			de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort instance) {
		try {
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			

			
			newInstance_0_0_0_0.setValue(1);

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
		
			newInstance_0_0_1_0.setValue(1);
			instance.setName("reconfMsg");
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	

	public void init_ReconfigurationExecutionPort_3077(
			de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort instance) {
		try {
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			

			
			newInstance_0_0_0_0.setValue(1);

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
		
			newInstance_0_0_1_0.setValue(1);
			instance.setName("reconfExec");
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}
	
	public void init_BroadcastPort_3078(
			de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort instance) {
		try {
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			

			
			newInstance_0_0_0_0.setValue(1);

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
		
			newInstance_0_0_1_0.setValue(1);
			instance.setName("broadcast");
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}


	public static de.uni_paderborn.fujaba.muml.component.diagram.providers.ElementInitializers getInstance() {
		de.uni_paderborn.fujaba.muml.component.diagram.providers.ElementInitializers cached = de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.getInstance().getElementInitializers();
		//set the cached element initializer to this one
		if (cached == null || !(cached instanceof de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ElementInitializers)) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ElementInitializers());
		}
		return (de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ElementInitializers)cached;
	}
}
