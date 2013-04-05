package de.uni_paderborn.fujaba.muml.properties.instance.section;

public class StructuredComponentInstanceEmbeddedCICSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getStructuredComponentInstance_EmbeddedCIC();
	}

	@Override
	protected String getLabelText() {
		return "EmbeddedCIC";
	}

	public StructuredComponentInstanceEmbeddedCICSection() {

		addSection(new de.uni_paderborn.fujaba.muml.properties.instance.section.ComponentInstanceConfigurationComponentInstancesSection());

		addSection(new de.uni_paderborn.fujaba.muml.properties.instance.section.ComponentInstanceConfigurationPortConnectorInstancesSection());

	}

}
