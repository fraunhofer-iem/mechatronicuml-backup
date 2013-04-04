package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class RegionNameSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getRegion_Name();
	}

	@Override
	protected String getLabelText() {
		return "Name";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
