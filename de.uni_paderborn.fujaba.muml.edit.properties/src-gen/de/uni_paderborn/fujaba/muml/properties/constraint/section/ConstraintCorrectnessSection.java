package de.uni_paderborn.fujaba.muml.properties.constraint.section;

public class ConstraintCorrectnessSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection<de.uni_paderborn.fujaba.muml.constraint.Correctness> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
				.getConstraint_Correctness();
	}

	@Override
	protected String getLabelText() {
		return "Correctness";
	}

	@Override
	protected java.util.List<de.uni_paderborn.fujaba.muml.constraint.Correctness> getValues() {
		return de.uni_paderborn.fujaba.muml.constraint.Correctness.VALUES;
	}

	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	protected boolean isEnabled(
			de.uni_paderborn.fujaba.muml.constraint.Correctness state) {
		//		if (getElement() instanceof ObjectVariable) {
		//			ObjectVariable variable = (ObjectVariable) getElement();
		//			BindingSemantics semantics = variable.getBindingSemantics();
		//			BindingOperator operator = variable.getBindingOperator();
		//
		//			return ValidationUtil.isValid(state, semantics, operator);
		//		}

		return true;
	}

}
