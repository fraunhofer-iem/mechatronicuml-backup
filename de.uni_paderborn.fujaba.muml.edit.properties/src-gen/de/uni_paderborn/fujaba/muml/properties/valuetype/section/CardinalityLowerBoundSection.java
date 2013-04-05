package de.uni_paderborn.fujaba.muml.properties.valuetype.section;
public class CardinalityLowerBoundSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
				.getCardinality_LowerBound();
	}
	@Override
	protected String getLabelText() {
		return "LowerBound";
	}
	public CardinalityLowerBoundSection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.NaturalNumberValueSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.NaturalNumberInfinitySection());
	}
}