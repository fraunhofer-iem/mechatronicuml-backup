package de.uni_paderborn.fujaba.muml.properties.protocol.section;

public class RoleConnectorConnectorQualityOfServiceAssumptionsSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getRoleConnector_ConnectorQualityOfServiceAssumptions();
	}

	@Override
	protected String getLabelText() {
		return "ConnectorQualityOfServiceAssumptions";
	}

}
