package de.uni_paderborn.fujaba.muml.properties.component.section;

public class DirectedTypedPortKindSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection<de.uni_paderborn.fujaba.muml.component.PortDirectionKind> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getDirectedTypedPort_Kind();
	}

	@Override
	protected String getLabelText() {
		return "Kind";
	}

	@Override
	protected java.util.List<de.uni_paderborn.fujaba.muml.component.PortDirectionKind> getValues() {
		return de.uni_paderborn.fujaba.muml.component.PortDirectionKind.VALUES;
	}

	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	protected boolean isEnabled(
			de.uni_paderborn.fujaba.muml.component.PortDirectionKind state) {
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
