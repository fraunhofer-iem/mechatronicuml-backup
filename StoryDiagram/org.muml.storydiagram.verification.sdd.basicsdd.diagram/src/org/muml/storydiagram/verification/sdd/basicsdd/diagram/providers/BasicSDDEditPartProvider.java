package org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.BasicSDDEditPartFactory;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry;

/**
 * @generated
 */
public class BasicSDDEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public BasicSDDEditPartProvider() {
		super(new BasicSDDEditPartFactory(), BasicSDDVisualIDRegistry.TYPED_INSTANCE,
				StoryDecisionDiagramEditPart.MODEL_ID);
	}

}
