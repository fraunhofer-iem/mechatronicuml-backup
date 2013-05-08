package de.uni_paderborn.fujaba.muml.properties.deployment.section;

public class HardwareNodeHardwareNodeKindSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection<de.uni_paderborn.fujaba.muml.deployment.HardwareNodeKind> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage.eINSTANCE
				.getHardwareNode_HardwareNodeKind();
	}

	@Override
	protected String getLabelText() {
		return "HardwareNodeKind";
	}

	@Override
	protected java.util.List<de.uni_paderborn.fujaba.muml.deployment.HardwareNodeKind> getValues() {
		return de.uni_paderborn.fujaba.muml.deployment.HardwareNodeKind.VALUES;
	}

	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	protected boolean isEnabled(
			de.uni_paderborn.fujaba.muml.deployment.HardwareNodeKind state) {
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
