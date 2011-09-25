package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.edit.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomMessageinterfaceEditPartFactory extends
		MumlEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlVisualIDRegistry.getVisualID(view)) {
			case MessageInterfaceEditPart.VISUAL_ID:
				return new CustomMessageInterfaceEditPart(view);
			
			case MessageInterfaceDiagramEditPart.VISUAL_ID:
				return new CustomMessageInterfaceDiagramEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
