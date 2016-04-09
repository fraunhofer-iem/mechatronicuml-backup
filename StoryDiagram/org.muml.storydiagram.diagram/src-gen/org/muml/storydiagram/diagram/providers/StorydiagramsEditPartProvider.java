package org.muml.storydiagram.diagram.providers;

import java.lang.ref.WeakReference;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.storydiagram.diagram.edit.parts.ActivityEditPart;
import org.muml.storydiagram.diagram.edit.parts.StorydiagramsEditPartFactory;
import org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry;

/**
 * @generated
 */
public class StorydiagramsEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public StorydiagramsEditPartProvider() {
		super(new StorydiagramsEditPartFactory(), StorydiagramsVisualIDRegistry.TYPED_INSTANCE,
				ActivityEditPart.MODEL_ID);
	}
}
