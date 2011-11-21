package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.part;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.notation.Diagram;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlCreationWizard;

/**
 * A CreationWizard for ComponentInstanceConfiguration diagrams. It implements
 * the abstract creation wizard from the de.uni_paderborn.fujaba.newwizard
 * plugin.
 * 
 * @author bingo
 * 
 */
public class CustomComponentinstanceconfigurationDiagramCreationWizard extends
		MumlCreationWizard {

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.instance.category";
	}

	protected boolean isModelElementCategoryDiagramElement() {
		return false;
	}

	protected CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram,
			Collection<EObject> elements) {
		return null;
	}

}
