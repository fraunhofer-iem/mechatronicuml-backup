package de.uni_paderborn.fujaba.muml.properties.component.section;

public class DirectedTypedPortOptionalSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractCheckboxSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getDirectedTypedPort_Optional();
	}

	@Override
	protected String getLabelText() {
		return "Optional";
	}

}
