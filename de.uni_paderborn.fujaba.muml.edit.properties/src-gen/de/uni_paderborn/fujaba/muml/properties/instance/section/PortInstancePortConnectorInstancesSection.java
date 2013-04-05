package de.uni_paderborn.fujaba.muml.properties.instance.section;
public class PortInstancePortConnectorInstancesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getPortInstance_PortConnectorInstances();
	}
	@Override
	protected String getLabelText() {
		return "PortConnectorInstances";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}