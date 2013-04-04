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

}
