package de.uni_paderborn.fujaba.muml.properties.component.section;

public class DirectedTypedPortInPortSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getDirectedTypedPort_InPort();
	}

	@Override
	protected String getLabelText() {
		return "InPort";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
