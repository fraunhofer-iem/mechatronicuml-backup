package de.uni_paderborn.fujaba.muml.operationrepository.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.MumlEditPartFactory;

public class CustomOperationRepositoryEditPartFactory extends MumlEditPartFactory{

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationParametersCompartmentEditPart.VISUAL_ID:
				return new CustomOperationParametersCompartmentEditPart(view);

			}
		}
		return super.createEditPart(context, model);
	}

}
