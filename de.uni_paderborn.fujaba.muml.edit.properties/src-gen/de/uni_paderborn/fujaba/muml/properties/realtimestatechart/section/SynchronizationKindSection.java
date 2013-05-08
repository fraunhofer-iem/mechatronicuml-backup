package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class SynchronizationKindSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection<de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getSynchronization_Kind();
	}

	@Override
	protected String getLabelText() {
		return "Kind";
	}

	@Override
	protected java.util.List<de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind> getValues() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind.VALUES;
	}

	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	protected boolean isEnabled(
			de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind state) {
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
