package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class TransitionBlockableSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getTransition_Blockable();
	}

	@Override
	protected String getLabelText() {
		return "Blockable";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
