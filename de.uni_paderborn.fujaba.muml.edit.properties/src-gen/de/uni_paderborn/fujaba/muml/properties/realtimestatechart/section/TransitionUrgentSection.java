package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class TransitionUrgentSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractCheckboxSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getTransition_Urgent();
	}

	@Override
	protected String getLabelText() {
		return "Urgent";
	}

}
