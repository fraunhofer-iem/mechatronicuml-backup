package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;
public class TransitionAbsoluteDeadlinesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getTransition_AbsoluteDeadlines();
	}
	@Override
	protected String getLabelText() {
		return "AbsoluteDeadlines";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}