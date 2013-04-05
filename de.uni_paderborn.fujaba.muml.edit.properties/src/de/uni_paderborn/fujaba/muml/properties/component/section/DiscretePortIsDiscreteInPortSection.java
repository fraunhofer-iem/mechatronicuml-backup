package de.uni_paderborn.fujaba.muml.properties.component.section;
public class DiscretePortIsDiscreteInPortSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getDiscretePort_IsDiscreteInPort();
	}
	@Override
	protected String getLabelText() {
		return "IsDiscreteInPort";
	}
	@Override
	protected boolean isMultiLine() {
		return false;
	}
}