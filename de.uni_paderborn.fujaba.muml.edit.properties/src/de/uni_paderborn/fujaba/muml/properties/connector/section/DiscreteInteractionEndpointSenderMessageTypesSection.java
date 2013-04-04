package de.uni_paderborn.fujaba.muml.properties.connector.section;

public class DiscreteInteractionEndpointSenderMessageTypesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getDiscreteInteractionEndpoint_SenderMessageTypes();
	}

	@Override
	protected String getLabelText() {
		return "SenderMessageTypes";
	}

	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}

}
