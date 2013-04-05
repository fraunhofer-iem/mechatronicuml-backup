package de.uni_paderborn.fujaba.muml.properties.connector.section;

public class DiscreteInteractionEndpointCardinalitySection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getDiscreteInteractionEndpoint_Cardinality();
	}

	@Override
	protected String getLabelText() {
		return "Cardinality";
	}

	public DiscreteInteractionEndpointCardinalitySection() {

		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.CardinalityLowerBoundSection());

		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.CardinalityUpperBoundSection());

	}

}
