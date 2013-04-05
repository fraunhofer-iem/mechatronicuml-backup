package de.uni_paderborn.fujaba.muml.properties.connector.section;

public class ConnectorInstanceConnectorEndpointInstancesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getConnectorInstance_ConnectorEndpointInstances();
	}

	@Override
	protected String getLabelText() {
		return "ConnectorEndpointInstances";
	}

	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}

}
