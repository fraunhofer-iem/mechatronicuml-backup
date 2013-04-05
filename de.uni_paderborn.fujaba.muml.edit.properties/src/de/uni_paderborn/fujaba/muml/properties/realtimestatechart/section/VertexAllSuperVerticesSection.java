package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;
public class VertexAllSuperVerticesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getVertex_AllSuperVertices();
	}
	@Override
	protected String getLabelText() {
		return "AllSuperVertices";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}