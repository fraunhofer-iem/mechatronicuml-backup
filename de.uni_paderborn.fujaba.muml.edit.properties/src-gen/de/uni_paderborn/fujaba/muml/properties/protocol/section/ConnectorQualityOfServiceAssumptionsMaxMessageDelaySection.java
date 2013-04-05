package de.uni_paderborn.fujaba.muml.properties.protocol.section;
public class ConnectorQualityOfServiceAssumptionsMaxMessageDelaySection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getConnectorQualityOfServiceAssumptions_MaxMessageDelay();
	}
	@Override
	protected String getLabelText() {
		return "MaxMessageDelay";
	}
	public ConnectorQualityOfServiceAssumptionsMaxMessageDelaySection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueValueSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueUnitSection());
	}
}