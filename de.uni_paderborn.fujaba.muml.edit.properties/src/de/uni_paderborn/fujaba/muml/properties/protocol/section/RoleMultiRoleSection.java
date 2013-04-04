package de.uni_paderborn.fujaba.muml.properties.protocol.section;

public class RoleMultiRoleSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getRole_MultiRole();
	}

	@Override
	protected String getLabelText() {
		return "MultiRole";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
