package de.uni_paderborn.fujaba.muml.properties.protocol.section;

public class AbstractCoordinationSpecificationRoleConnectorSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getAbstractCoordinationSpecification_RoleConnector();
	}

	@Override
	protected String getLabelText() {
		return "RoleConnector";
	}

	public AbstractCoordinationSpecificationRoleConnectorSection() {

		addSection(new de.uni_paderborn.fujaba.muml.properties.protocol.section.RoleConnectorConnectorQualityOfServiceAssumptionsSection());

		addSection(new de.uni_paderborn.fujaba.muml.properties.connector.section.ConnectorConnectorEndpointsSection());

	}

}
