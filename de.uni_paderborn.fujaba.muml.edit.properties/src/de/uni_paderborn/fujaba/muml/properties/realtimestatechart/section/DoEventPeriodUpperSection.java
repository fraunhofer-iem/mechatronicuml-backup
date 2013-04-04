package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class DoEventPeriodUpperSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getDoEvent_PeriodUpper();
	}

	@Override
	protected String getLabelText() {
		return "PeriodUpper";
	}

}
