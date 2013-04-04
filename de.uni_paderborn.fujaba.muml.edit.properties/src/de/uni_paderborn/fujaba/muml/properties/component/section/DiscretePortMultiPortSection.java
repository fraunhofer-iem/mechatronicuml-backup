package de.uni_paderborn.fujaba.muml.properties.component.section;

public class DiscretePortMultiPortSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getDiscretePort_MultiPort();
	}

	@Override
	protected String getLabelText() {
		return "MultiPort";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
