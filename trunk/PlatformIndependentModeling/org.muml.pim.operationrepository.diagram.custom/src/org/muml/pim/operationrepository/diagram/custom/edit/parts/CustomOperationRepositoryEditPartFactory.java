package org.muml.pim.operationrepository.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.operationrepository.diagram.edit.parts.MumlEditPartFactory;

public class CustomOperationRepositoryEditPartFactory extends MumlEditPartFactory{

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case org.muml.pim.operationrepository.diagram.edit.parts.OperationParametersCompartmentEditPart.VISUAL_ID:
				return new CustomOperationParametersCompartmentEditPart(view);

			}
		}
		return super.createEditPart(context, model);
	}

}
