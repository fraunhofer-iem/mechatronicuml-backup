package de.uni_paderborn.fujaba.muml.properties.valuetype.section;
public class RangeLowerBoundSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
				.getRange_LowerBound();
	}
	@Override
	protected String getLabelText() {
		return "LowerBound";
	}
	@Override
	protected boolean isMultiLine() {
		return false;
	}
}