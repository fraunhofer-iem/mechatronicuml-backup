package de.uni_paderborn.fujaba.muml.valuetype.section;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import de.upb.swt.core.ui.properties.sections.AbstractGroupSection;

public class TimeValueValueSection extends AbstractGroupSection {

	public TimeValueValueSection() {
		addSection(new NaturalNumberValueSection());
	}
	
	@Override
	protected String getLabelText() {
		return "Value";
	}

	@Override
	public EStructuralFeature getFeature() {
		return ValuetypePackage.Literals.TIME_VALUE__VALUE;
	}

}
