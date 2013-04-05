package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class DeadlineLowerBoundSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getDeadline_LowerBound();
	}

	@Override
	protected String getLabelText() {
		return "LowerBound";
	}

	public DeadlineLowerBoundSection() {

		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueValueSection());

		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueUnitSection());

	}

}
