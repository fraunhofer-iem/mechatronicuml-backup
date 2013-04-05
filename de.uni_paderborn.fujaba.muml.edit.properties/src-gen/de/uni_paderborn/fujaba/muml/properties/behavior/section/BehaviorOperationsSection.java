package de.uni_paderborn.fujaba.muml.properties.behavior.section;

public class BehaviorOperationsSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
				.getBehavior_Operations();
	}

	@Override
	protected String getLabelText() {
		return "Operations";
	}

	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}

}
