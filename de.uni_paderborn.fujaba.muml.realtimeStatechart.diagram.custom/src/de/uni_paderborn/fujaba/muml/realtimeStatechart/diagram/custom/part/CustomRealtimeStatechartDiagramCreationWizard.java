package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.part;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.notation.Diagram;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlCreationWizard;

public class CustomRealtimeStatechartDiagramCreationWizard extends
		MumlCreationWizard {

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.realtimestatechart.category";
	}

	protected boolean isModelElementCategoryDiagramElement() {
		return false;
	}

	protected CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram,
			Collection<EObject> elements) {
		return null;
	}

}
