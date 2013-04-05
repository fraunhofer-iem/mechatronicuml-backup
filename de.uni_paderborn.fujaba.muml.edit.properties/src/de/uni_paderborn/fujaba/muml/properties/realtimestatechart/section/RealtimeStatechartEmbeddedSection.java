package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;
public class RealtimeStatechartEmbeddedSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getRealtimeStatechart_Embedded();
	}
	@Override
	protected String getLabelText() {
		return "Embedded";
	}
	@Override
	protected boolean isMultiLine() {
		return false;
	}
}