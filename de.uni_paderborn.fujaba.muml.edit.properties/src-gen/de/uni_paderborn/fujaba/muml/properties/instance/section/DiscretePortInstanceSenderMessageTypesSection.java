package de.uni_paderborn.fujaba.muml.properties.instance.section;
public class DiscretePortInstanceSenderMessageTypesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getDiscretePortInstance_SenderMessageTypes();
	}
	@Override
	protected String getLabelText() {
		return "SenderMessageTypes";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}