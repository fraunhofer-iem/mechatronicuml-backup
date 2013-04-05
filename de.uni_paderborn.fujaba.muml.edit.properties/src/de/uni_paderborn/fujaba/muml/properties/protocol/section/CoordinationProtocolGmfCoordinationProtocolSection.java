package de.uni_paderborn.fujaba.muml.properties.protocol.section;
public class CoordinationProtocolGmfCoordinationProtocolSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getCoordinationProtocol_GmfCoordinationProtocol();
	}
	@Override
	protected String getLabelText() {
		return "GmfCoordinationProtocol";
	}
	public CoordinationProtocolGmfCoordinationProtocolSection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.protocol.section.CoordinationProtocolRolesSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.protocol.section.CoordinationProtocolRoleConnectorSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.protocol.section.CoordinationProtocolGmfCoordinationProtocolSection());
	}
}