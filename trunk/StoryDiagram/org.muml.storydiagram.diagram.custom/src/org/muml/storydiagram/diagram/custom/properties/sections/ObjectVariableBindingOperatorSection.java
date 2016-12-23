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

public class ObjectVariableBindingOperatorSection extends AbstractRadioGroupSection<BindingOperator> {
	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	@Override
	protected String getLabelText() {
		return "Binding Operator";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.OBJECT_VARIABLE__BINDING_OPERATOR;
	}

	@Override
	protected List<BindingOperator> getValues() {
		return BindingOperator.VALUES;
	}

	protected boolean isEnabled(BindingOperator operator) {
		if (getElement() != null) {
			ObjectVariable variable = (ObjectVariable) getElement();
			BindingState state = variable.getBindingState();
			BindingSemantics semantics = variable.getBindingSemantics();

			return ValidationUtil.isValid(state, semantics, operator);
		}
		return true;
	}
}
