package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class RealtimeStatechartStatesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getRealtimeStatechart_States();
	}

	@Override
	protected String getLabelText() {
		return "States";
	}

	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}

}
