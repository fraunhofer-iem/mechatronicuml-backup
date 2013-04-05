package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;
public class StateEntryEventSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getState_EntryEvent();
	}
	@Override
	protected String getLabelText() {
		return "EntryEvent";
	}
	public StateEntryEventSection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.EntryOrExitEventClockResetsSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.EntryOrExitEventActionSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.EventKindSection());
	}
}