package de.uni_paderborn.fujaba.muml.properties.deployment.section;

public class LinkQualityOfServiceLatencySection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage.eINSTANCE
				.getLinkQualityOfService_Latency();
	}

	@Override
	protected String getLabelText() {
		return "Latency";
	}

}
