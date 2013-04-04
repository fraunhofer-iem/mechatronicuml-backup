package de.uni_paderborn.fujaba.muml.properties.constraint.section;

public class ConstraintCorrectSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
				.getConstraint_Correct();
	}

	@Override
	protected String getLabelText() {
		return "Correct";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
