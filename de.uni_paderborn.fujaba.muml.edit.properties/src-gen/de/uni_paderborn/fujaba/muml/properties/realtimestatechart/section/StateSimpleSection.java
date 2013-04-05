package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;
public class StateSimpleSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getState_Simple();
	}
	@Override
	protected String getLabelText() {
		return "Simple";
	}
	@Override
	protected boolean isMultiLine() {
		return false;
	}
}