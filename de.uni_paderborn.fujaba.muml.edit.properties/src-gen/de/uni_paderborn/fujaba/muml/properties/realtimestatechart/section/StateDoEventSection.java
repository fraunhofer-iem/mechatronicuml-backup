package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;
public class StateDoEventSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getState_DoEvent();
	}
	@Override
	protected String getLabelText() {
		return "DoEvent";
	}
	public StateDoEventSection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.DoEventActionSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.DoEventPeriodLowerSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.DoEventPeriodUpperSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.EventKindSection());
	}
}