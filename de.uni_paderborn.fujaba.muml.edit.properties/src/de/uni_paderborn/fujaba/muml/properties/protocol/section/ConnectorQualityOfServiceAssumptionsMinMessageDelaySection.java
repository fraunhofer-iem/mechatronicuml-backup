package de.uni_paderborn.fujaba.muml.properties.protocol.section;

public class ConnectorQualityOfServiceAssumptionsMinMessageDelaySection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getConnectorQualityOfServiceAssumptions_MinMessageDelay();
	}

	@Override
	protected String getLabelText() {
		return "MinMessageDelay";
	}

	public ConnectorQualityOfServiceAssumptionsMinMessageDelaySection() {

		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueValueSection());

		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueUnitSection());

	}

}
