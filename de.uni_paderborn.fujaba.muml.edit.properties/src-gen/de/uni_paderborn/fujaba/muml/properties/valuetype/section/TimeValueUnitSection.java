package de.uni_paderborn.fujaba.muml.properties.valuetype.section;
public class TimeValueUnitSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
				.getTimeValue_Unit();
	}
	@Override
	protected String getLabelText() {
		return "Unit";
	}
	@Override
	protected boolean isMultiLine() {
		return false;
	}
}