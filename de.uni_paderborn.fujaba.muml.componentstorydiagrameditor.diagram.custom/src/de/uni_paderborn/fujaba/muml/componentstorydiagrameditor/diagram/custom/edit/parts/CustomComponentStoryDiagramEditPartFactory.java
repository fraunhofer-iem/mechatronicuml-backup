package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeGuardEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryDiagramEditPartFactory;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariable2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableEditPart;

public class CustomComponentStoryDiagramEditPartFactory extends ComponentStoryDiagramEditPartFactory {

	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(view)) {

			case PartVariableEditPart.VISUAL_ID:
				return new CustomPartVariableEditPart(view);
			case PortVariableEditPart.VISUAL_ID:
				return new CustomPortVariableEditPart(view);
			case PortVariable2EditPart.VISUAL_ID:
				return new CustomPortVariable2EditPart(view);
			case ActivityEdgeGuardEditPart.VISUAL_ID:
				return new CustomActivityEdgeGuardEditPart(view);
			case ComponentVariableNameEditPart.VISUAL_ID:
				return new CustomComponentVariableNameEditPart(view);
			case ComponentVariableEditPart.VISUAL_ID:
				return new CustomComponentVariableEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	
	}
}
