package de.uni_paderborn.fujaba.muml.valuetype.section;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import de.upb.swt.core.ui.properties.sections.AbstractTextSection;

public class NaturalNumberValueSection extends AbstractTextSection {

	@Override
	protected String getLabelText() {
		return "Value";
	}

	@Override
	public EStructuralFeature getFeature() {
		return ValuetypePackage.Literals.NATURAL_NUMBER__VALUE;
	}

}
