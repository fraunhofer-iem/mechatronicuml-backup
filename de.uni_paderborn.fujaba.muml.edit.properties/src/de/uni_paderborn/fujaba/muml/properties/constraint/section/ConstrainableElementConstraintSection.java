package de.uni_paderborn.fujaba.muml.properties.constraint.section;

public class ConstrainableElementConstraintSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
				.getConstrainableElement_Constraint();
	}

	@Override
	protected String getLabelText() {
		return "Constraint";
	}

	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}

}
