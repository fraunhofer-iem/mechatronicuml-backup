package org.muml.pim.messagetype.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart;
import org.muml.pim.messagetype.diagram.edit.parts.MumlEditPartFactory;
import org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class MumlEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public MumlEditPartProvider() {
		super(new MumlEditPartFactory(), MumlVisualIDRegistry.TYPED_INSTANCE, MessageInterfaceDiagramEditPart.MODEL_ID);
	}
}
