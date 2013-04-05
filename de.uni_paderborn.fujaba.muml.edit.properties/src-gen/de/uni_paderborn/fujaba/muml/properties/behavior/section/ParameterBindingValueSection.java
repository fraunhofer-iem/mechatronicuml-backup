package de.uni_paderborn.fujaba.muml.properties.behavior.section;
public class ParameterBindingValueSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
				.getParameterBinding_Value();
	}
	@Override
	protected String getLabelText() {
		return "Value";
	}
	public ParameterBindingValueSection() {
	}
}