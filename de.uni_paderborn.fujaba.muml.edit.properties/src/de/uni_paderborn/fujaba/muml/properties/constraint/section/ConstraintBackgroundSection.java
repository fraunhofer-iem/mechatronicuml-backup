package de.uni_paderborn.fujaba.muml.properties.constraint.section;

public class ConstraintBackgroundSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
				.getConstraint_Background();
	}

	@Override
	protected String getLabelText() {
		return "Background";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
