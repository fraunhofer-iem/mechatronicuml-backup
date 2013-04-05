package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;
public class AsynchronousMessageEventMessageSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getAsynchronousMessageEvent_Message();
	}
	@Override
	protected String getLabelText() {
		return "Message";
	}
	public AsynchronousMessageEventMessageSection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.MessageParameterBindingSection());
	}
}