package de.uni_paderborn.fujaba.muml.properties.component.section;
public class StructuredComponentAllStructuredComponentsSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getStructuredComponent_AllStructuredComponents();
	}
	@Override
	protected String getLabelText() {
		return "AllStructuredComponents";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}