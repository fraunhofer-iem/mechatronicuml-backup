package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class DoEventPeriodSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getDoEvent_Period();
	}

	@Override
	protected String getLabelText() {
		return "Period";
	}

	public DoEventPeriodSection() {

		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueValueSection());

		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueUnitSection());

	}

}
