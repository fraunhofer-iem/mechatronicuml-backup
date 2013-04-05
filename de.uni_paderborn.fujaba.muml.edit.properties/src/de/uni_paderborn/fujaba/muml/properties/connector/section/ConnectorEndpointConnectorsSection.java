package de.uni_paderborn.fujaba.muml.properties.connector.section;
public class ConnectorEndpointConnectorsSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getConnectorEndpoint_Connectors();
	}
	@Override
	protected String getLabelText() {
		return "Connectors";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}