package org.muml.reconfiguration.componentstorydiagram.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryDiagramEditPartFactory;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry;

/**
 * @generated
 */
public class ComponentStoryDiagramEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ComponentStoryDiagramEditPartProvider() {
		super(new ComponentStoryDiagramEditPartFactory(), ComponentStoryDiagramVisualIDRegistry.TYPED_INSTANCE,
				ComponentStoryRuleEditPart.MODEL_ID);
	}
}
