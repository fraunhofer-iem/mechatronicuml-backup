package de.uni_paderborn.fujaba.muml.properties.types.section;

public class PrimitiveDataTypePrimitiveTypeSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
				.getPrimitiveDataType_PrimitiveType();
	}

	@Override
	protected String getLabelText() {
		return "PrimitiveType";
	}

	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}

}
