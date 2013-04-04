package de.uni_paderborn.fujaba.muml.properties.protocol.section;

public class CoordinationProtocolRoleConnectorSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getCoordinationProtocol_RoleConnector();
	}

	@Override
	protected String getLabelText() {
		return "RoleConnector";
	}

}
