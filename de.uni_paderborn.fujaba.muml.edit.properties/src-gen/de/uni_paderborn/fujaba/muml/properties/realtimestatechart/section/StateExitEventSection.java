package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class StateExitEventSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getState_ExitEvent();
	}

	@Override
	protected String getLabelText() {
		return "ExitEvent";
	}

	public StateExitEventSection() {

		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.EntryOrExitEventClockResetsSection());

		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.EntryOrExitEventActionSection());

		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.EventKindSection());

	}

}
