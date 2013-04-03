package de.uni_paderborn.fujaba.muml.realtimestatechart.section;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.valuetype.section.TimeValueUnitSection;
import de.uni_paderborn.fujaba.muml.valuetype.section.TimeValueValueSection;
import de.upb.swt.core.ui.properties.sections.AbstractGroupSection;

public class DeadlineUpperBoundSection extends AbstractGroupSection {

	public DeadlineUpperBoundSection() {
		addSection(new TimeValueValueSection());
		addSection(new TimeValueUnitSection());
	}
	@Override
	protected String getLabelText() {
		return "Upper Bound";
	}

	@Override
	public EStructuralFeature getFeature() {
		return RealtimestatechartPackage.Literals.DEADLINE__UPPER_BOUND;
	}

}
