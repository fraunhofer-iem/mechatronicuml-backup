package de.uni_paderborn.fujaba.muml.properties.component.section;

public class HybridPortSamplingIntervalSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getHybridPort_SamplingInterval();
	}

	@Override
	protected String getLabelText() {
		return "SamplingInterval";
	}

}
