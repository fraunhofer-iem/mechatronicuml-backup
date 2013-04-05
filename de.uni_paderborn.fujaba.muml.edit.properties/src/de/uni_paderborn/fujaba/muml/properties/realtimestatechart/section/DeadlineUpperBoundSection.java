package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;
public class DeadlineUpperBoundSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getDeadline_UpperBound();
	}
	@Override
	protected String getLabelText() {
		return "UpperBound";
	}
	public DeadlineUpperBoundSection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueValueSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueUnitSection());
	}
}