package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class TransitionSynchronizationSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getTransition_Synchronization();
	}

	@Override
	protected String getLabelText() {
		return "Synchronization";
	}

}
