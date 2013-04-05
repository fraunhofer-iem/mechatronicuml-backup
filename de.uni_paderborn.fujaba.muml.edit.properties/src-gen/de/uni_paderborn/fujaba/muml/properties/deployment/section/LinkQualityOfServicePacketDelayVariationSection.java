package de.uni_paderborn.fujaba.muml.properties.deployment.section;
public class LinkQualityOfServicePacketDelayVariationSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage.eINSTANCE
				.getLinkQualityOfService_PacketDelayVariation();
	}
	@Override
	protected String getLabelText() {
		return "PacketDelayVariation";
	}
	public LinkQualityOfServicePacketDelayVariationSection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueValueSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.TimeValueUnitSection());
	}
}