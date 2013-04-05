package de.uni_paderborn.fujaba.muml.properties.valuetype.section;
public class NaturalNumberInfinitySection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
				.getNaturalNumber_Infinity();
	}
	@Override
	protected String getLabelText() {
		return "Infinity";
	}
	@Override
	protected boolean isMultiLine() {
		return false;
	}
}