package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.part;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.notation.Diagram;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlCreationWizard;

public class CustomMessageinterfaceDiagramCreationWizard extends
		MumlCreationWizard {

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.messageinterface.category";
	}

	protected boolean isModelElementCategoryDiagramElement() {
		return false;
	}

	protected CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram,
			Collection<EObject> elements) {
		return null;
	}

}
