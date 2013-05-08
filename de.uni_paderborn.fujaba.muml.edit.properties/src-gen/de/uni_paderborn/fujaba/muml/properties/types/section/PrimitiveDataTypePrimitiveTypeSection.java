package de.uni_paderborn.fujaba.muml.properties.types.section;

public class PrimitiveDataTypePrimitiveTypeSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection<de.uni_paderborn.fujaba.muml.types.PrimitiveTypes> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
				.getPrimitiveDataType_PrimitiveType();
	}

	@Override
	protected String getLabelText() {
		return "PrimitiveType";
	}

	@Override
	protected java.util.List<de.uni_paderborn.fujaba.muml.types.PrimitiveTypes> getValues() {
		return de.uni_paderborn.fujaba.muml.types.PrimitiveTypes.VALUES;
	}

	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	protected boolean isEnabled(
			de.uni_paderborn.fujaba.muml.types.PrimitiveTypes state) {
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
