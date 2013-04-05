package de.uni_paderborn.fujaba.muml.properties.deployment.section;
public class DeploymentQualityOfLinkServicesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage.eINSTANCE
				.getDeployment_QualityOfLinkServices();
	}
	@Override
	protected String getLabelText() {
		return "QualityOfLinkServices";
	}
	public DeploymentQualityOfLinkServicesSection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.deployment.section.LinkQualityOfServicePacketDelayVariationSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.deployment.section.LinkQualityOfServiceLatencySection());
	}
}