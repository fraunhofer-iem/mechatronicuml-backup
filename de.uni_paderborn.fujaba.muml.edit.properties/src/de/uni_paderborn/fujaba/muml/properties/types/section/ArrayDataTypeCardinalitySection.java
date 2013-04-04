package de.uni_paderborn.fujaba.muml.properties.types.section;

public class ArrayDataTypeCardinalitySection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
				.getArrayDataType_Cardinality();
	}

	@Override
	protected String getLabelText() {
		return "Cardinality";
	}

}
