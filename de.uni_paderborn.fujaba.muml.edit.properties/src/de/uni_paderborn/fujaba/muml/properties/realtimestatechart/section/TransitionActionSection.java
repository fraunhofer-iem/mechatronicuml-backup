package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class TransitionActionSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getTransition_Action();
	}

	@Override
	protected String getLabelText() {
		return "Action";
	}

	public TransitionActionSection() {

		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.ActionExpressionsSection());

	}

}
