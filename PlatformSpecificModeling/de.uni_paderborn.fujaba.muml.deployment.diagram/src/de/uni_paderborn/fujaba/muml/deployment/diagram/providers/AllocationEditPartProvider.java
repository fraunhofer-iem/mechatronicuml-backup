package de.uni_paderborn.fujaba.muml.deployment.diagram.providers;

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
public class AllocationEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public AllocationEditPartProvider() {
		super(
				new de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.AllocationEditPartFactory(),
				de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry.TYPED_INSTANCE,
				de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID);
	}
}
