package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class RegionEmbedsHistoryStatechartSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getRegion_EmbedsHistoryStatechart();
	}

	@Override
	protected String getLabelText() {
		return "EmbedsHistoryStatechart";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
