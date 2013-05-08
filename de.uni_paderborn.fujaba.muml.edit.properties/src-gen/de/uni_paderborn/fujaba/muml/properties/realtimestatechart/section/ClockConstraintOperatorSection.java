package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class ClockConstraintOperatorSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection<org.storydriven.core.expressions.common.ComparingOperator> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getClockConstraint_Operator();
	}

	@Override
	protected String getLabelText() {
		return "Operator";
	}

	@Override
	protected java.util.List<org.storydriven.core.expressions.common.ComparingOperator> getValues() {
		return org.storydriven.core.expressions.common.ComparingOperator.VALUES;
	}

	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	protected boolean isEnabled(
			org.storydriven.core.expressions.common.ComparingOperator state) {
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
