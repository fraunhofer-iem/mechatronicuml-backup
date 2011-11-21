package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.part;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlCreationWizard;

public class CustomRealtimeStatechartDiagramCreationWizard extends
		MumlCreationWizard {

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.realtimestatechart.category";
	}

}
