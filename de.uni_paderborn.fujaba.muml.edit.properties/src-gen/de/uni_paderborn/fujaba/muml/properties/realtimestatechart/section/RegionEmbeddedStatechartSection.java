package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section;
public class RegionEmbeddedStatechartSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getRegion_EmbeddedStatechart();
	}
	@Override
	protected String getLabelText() {
		return "EmbeddedStatechart";
	}
	public RegionEmbeddedStatechartSection() {
		addSection(new de.uni_paderborn.fujaba.muml.properties.behavior.section.BehaviorOperationsSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.behavior.section.BehaviorVariablesSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.RealtimeStatechartTransitionsSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.RealtimeStatechartStatesSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.RealtimeStatechartClocksSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.RealtimeStatechartHistorySection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.RealtimeStatechartFlatSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.RealtimeStatechartAvailableClocksSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.RealtimeStatechartEmbeddedSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.RealtimeStatechartAllAvailableVariablesSection());
		addSection(new de.uni_paderborn.fujaba.muml.properties.realtimestatechart.section.RealtimeStatechartAllAvailableOperationsSection());
	}
}