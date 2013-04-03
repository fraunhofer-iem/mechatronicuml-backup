package de.uni_paderborn.fujaba.muml.realtimestatechart.section;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.valuetype.section.TimeValueUnitSection;
import de.uni_paderborn.fujaba.muml.valuetype.section.TimeValueValueSection;
import de.upb.swt.core.ui.properties.sections.AbstractGroupSection;

public class DeadlineLowerBoundSection extends AbstractGroupSection {

	public DeadlineLowerBoundSection() {
		addSection(new TimeValueValueSection());
		addSection(new TimeValueUnitSection());
	}
	@Override
	protected String getLabelText() {
		return "Lower Bound";
	}

	@Override
	public EStructuralFeature getFeature() {
		return RealtimestatechartPackage.Literals.DEADLINE__LOWER_BOUND;
	}

}
