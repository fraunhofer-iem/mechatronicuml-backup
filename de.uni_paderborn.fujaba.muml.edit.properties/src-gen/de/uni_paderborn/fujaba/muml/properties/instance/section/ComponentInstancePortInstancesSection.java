package de.uni_paderborn.fujaba.muml.properties.instance.section;

public class ComponentInstancePortInstancesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getComponentInstance_PortInstances();
	}

	@Override
	protected String getLabelText() {
		return "PortInstances";
	}

	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}

}
