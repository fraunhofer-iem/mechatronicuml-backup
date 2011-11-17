package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.part;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlCreationWizard;

public class CustomMessageinterfaceDiagramCreationWizard extends
		MumlCreationWizard {

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.messageinterface.category";
	}

}
