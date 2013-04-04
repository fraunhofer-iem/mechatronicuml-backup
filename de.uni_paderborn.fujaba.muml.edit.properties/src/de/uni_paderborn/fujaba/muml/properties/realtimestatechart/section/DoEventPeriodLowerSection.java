package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class DoEventPeriodLowerSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getDoEvent_PeriodLower();
	}

	@Override
	protected String getLabelText() {
		return "PeriodLower";
	}

}
