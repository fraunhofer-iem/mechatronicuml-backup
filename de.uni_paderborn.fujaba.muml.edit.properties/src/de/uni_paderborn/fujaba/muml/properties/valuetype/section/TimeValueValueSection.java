package de.uni_paderborn.fujaba.muml.properties.valuetype.section;

public class TimeValueValueSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
				.getTimeValue_Value();
	}

	@Override
	protected String getLabelText() {
		return "Value";
	}

}
