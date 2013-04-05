package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class TransitionRelativeDeadlineSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getTransition_RelativeDeadline();
	}

	@Override
	protected String getLabelText() {
		return "RelativeDeadline";
	}

	public TransitionRelativeDeadlineSection() {

		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.DeadlineUpperBoundSection());

		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.DeadlineLowerBoundSection());

	}

}
