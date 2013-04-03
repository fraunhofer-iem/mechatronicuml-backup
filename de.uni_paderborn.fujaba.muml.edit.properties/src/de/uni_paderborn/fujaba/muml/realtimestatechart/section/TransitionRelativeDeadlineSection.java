package de.uni_paderborn.fujaba.muml.realtimestatechart.section;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.upb.swt.core.ui.properties.sections.AbstractGroupSection;

public class TransitionRelativeDeadlineSection extends AbstractGroupSection {
	public TransitionRelativeDeadlineSection() {
		addSection(new DeadlineLowerBoundSection());
		addSection(new DeadlineUpperBoundSection());
	}

	@Override
	public EStructuralFeature getFeature() {
		return RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE;
	}

	@Override
	protected String getLabelText() {
		return "Relative Deadline";
	}
}
