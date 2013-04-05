package de.uni_paderborn.fujaba.muml.properties.valuetype.section;
public class CardinalityUpperBoundSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
				.getCardinality_UpperBound();
	}
	@Override
	protected String getLabelText() {
		return "UpperBound";
	}
	public CardinalityUpperBoundSection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.NaturalNumberValueSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.NaturalNumberInfinitySection());
	}
}