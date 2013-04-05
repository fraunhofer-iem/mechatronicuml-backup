package de.uni_paderborn.fujaba.muml.properties.valuetype.section;

public class NaturalNumberValueSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
				.getNaturalNumber_Value();
	}

	@Override
	protected String getLabelText() {
		return "Value";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
