package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;

public class PrioritizedElementPrioritySection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getPrioritizedElement_Priority();
	}

	@Override
	protected String getLabelText() {
		return "Priority";
	}

	@Override
	protected boolean isMultiLine() {
		return false;
	}

}
