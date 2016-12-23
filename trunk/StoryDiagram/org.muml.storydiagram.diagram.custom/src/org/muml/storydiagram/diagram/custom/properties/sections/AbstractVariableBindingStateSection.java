package org.muml.storydiagram.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.storydiagram.diagram.custom.util.ValidationUtil;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.BindingState;
import org.muml.storydiagram.patterns.ObjectVariable;
import org.muml.storydiagram.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection;

public class AbstractVariableBindingStateSection extends AbstractRadioGroupSection<BindingState> {
	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	@Override
	protected String getLabelText() {
		return "Binding State";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_STATE;
	}

	@Override
	protected List<BindingState> getValues() {
		return BindingState.VALUES;
	}

	protected boolean isEnabled(BindingState state) {
		if (getElement() instanceof ObjectVariable) {
			ObjectVariable variable = (ObjectVariable) getElement();
			BindingSemantics semantics = variable.getBindingSemantics();
			BindingOperator operator = variable.getBindingOperator();

			return ValidationUtil.isValid(state, semantics, operator);
		}

		return true;
	}
}
