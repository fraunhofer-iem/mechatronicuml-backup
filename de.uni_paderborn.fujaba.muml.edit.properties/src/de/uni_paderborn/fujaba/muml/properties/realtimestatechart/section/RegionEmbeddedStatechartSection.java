package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class RegionEmbeddedStatechartSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getRegion_EmbeddedStatechart();
	}

	@Override
	protected String getLabelText() {
		return "EmbeddedStatechart";
	}

}
