package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class StateFinalSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getState_Final();
	}

	@Override
	protected String getLabelText() {
		return "Final";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
