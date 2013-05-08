package de.uni_paderborn.fujaba.muml.properties.component.section;

public class ComponentComponentTypeSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection<de.uni_paderborn.fujaba.muml.component.ComponentKind> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getComponent_ComponentType();
	}

	@Override
	protected String getLabelText() {
		return "ComponentType";
	}

	@Override
	protected java.util.List<de.uni_paderborn.fujaba.muml.component.ComponentKind> getValues() {
		return de.uni_paderborn.fujaba.muml.component.ComponentKind.VALUES;
	}

	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	protected boolean isEnabled(
			de.uni_paderborn.fujaba.muml.component.ComponentKind state) {
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
