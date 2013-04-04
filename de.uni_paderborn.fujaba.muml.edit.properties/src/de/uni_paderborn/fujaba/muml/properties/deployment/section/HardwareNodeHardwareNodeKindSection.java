package de.uni_paderborn.fujaba.muml.properties.deployment.section;

public class HardwareNodeHardwareNodeKindSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage.eINSTANCE
				.getHardwareNode_HardwareNodeKind();
	}

	@Override
	protected String getLabelText() {
		return "HardwareNodeKind";
	}

	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}

}
