package de.uni_paderborn.fujaba.muml.properties.types.section;

public class RangedPrimitiveDataTypeRangeSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
				.getRangedPrimitiveDataType_Range();
	}

	@Override
	protected String getLabelText() {
		return "Range";
	}

}
