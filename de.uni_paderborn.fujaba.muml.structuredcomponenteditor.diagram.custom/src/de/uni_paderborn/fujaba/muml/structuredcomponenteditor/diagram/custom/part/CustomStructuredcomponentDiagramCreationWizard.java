package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.part;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.notation.Diagram;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlCreationWizard;

/**
 * A CreationWizard for StructuredComponent diagrams. It implements the abstract
 * creation wizard from the de.uni_paderborn.fujaba.newwizard plugin.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredcomponentDiagramCreationWizard extends
		MumlCreationWizard {

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.components.category";
	}

	protected boolean isModelElementCategoryDiagramElement() {
		return false;
	}

	protected CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram,
			Collection<EObject> elements) {
		return null;
	}

}
