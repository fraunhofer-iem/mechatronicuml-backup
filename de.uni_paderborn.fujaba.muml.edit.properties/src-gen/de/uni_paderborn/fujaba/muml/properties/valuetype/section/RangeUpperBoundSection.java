package de.uni_paderborn.fujaba.muml.properties.valuetype.section;

public class RangeUpperBoundSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
				.getRange_UpperBound();
	}

	@Override
	protected String getLabelText() {
		return "UpperBound";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
