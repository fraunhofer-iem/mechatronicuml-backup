package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers;

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

/**
 * @generated
 */
public class ComponentStoryDiagramEditPartProvider extends
		DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ComponentStoryDiagramEditPartProvider() {
		super(
				new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryDiagramEditPartFactory(),
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry.TYPED_INSTANCE,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.MODEL_ID);
	}
}
