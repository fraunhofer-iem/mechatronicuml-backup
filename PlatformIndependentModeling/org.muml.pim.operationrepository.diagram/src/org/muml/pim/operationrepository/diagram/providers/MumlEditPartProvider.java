package org.muml.pim.operationrepository.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.pim.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.MumlEditPartFactory;
import org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class MumlEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public MumlEditPartProvider() {
		super(new MumlEditPartFactory(), MumlVisualIDRegistry.TYPED_INSTANCE, ModelElementCategoryEditPart.MODEL_ID);
	}

}
