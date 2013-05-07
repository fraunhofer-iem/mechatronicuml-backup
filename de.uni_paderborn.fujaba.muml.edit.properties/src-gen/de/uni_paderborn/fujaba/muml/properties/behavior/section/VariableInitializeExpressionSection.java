package de.uni_paderborn.fujaba.muml.properties.behavior.section;

public class VariableInitializeExpressionSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
				.getVariable_InitializeExpression();
	}

	@Override
	protected String getLabelText() {
		return "InitializeExpression";
	}

	public VariableInitializeExpressionSection() {

	}

}
