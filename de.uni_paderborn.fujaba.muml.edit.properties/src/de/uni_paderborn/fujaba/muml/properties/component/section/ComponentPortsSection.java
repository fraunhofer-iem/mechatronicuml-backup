package de.uni_paderborn.fujaba.muml.properties.component.section;
public class ComponentPortsSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getComponent_Ports();
	}
	@Override
	protected String getLabelText() {
		return "Ports";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}