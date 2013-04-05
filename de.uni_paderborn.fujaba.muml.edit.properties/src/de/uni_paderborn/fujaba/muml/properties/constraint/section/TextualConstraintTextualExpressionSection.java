package de.uni_paderborn.fujaba.muml.properties.constraint.section;
public class TextualConstraintTextualExpressionSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
				.getTextualConstraint_TextualExpression();
	}
	@Override
	protected String getLabelText() {
		return "TextualExpression";
	}
	public TextualConstraintTextualExpressionSection() {
	}
}