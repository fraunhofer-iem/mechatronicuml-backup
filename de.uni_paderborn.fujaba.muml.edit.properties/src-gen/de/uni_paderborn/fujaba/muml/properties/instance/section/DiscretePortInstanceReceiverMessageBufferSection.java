package de.uni_paderborn.fujaba.muml.properties.instance.section;
public class DiscretePortInstanceReceiverMessageBufferSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getDiscretePortInstance_ReceiverMessageBuffer();
	}
	@Override
	protected String getLabelText() {
		return "ReceiverMessageBuffer";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}