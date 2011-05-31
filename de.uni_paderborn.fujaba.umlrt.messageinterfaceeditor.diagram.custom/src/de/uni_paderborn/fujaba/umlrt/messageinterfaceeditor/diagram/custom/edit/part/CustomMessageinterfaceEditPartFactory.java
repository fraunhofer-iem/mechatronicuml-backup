package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom.edit.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MumlinstanceEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MumlinstanceVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomMessageinterfaceEditPartFactory extends
		MumlinstanceEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlinstanceVisualIDRegistry.getVisualID(view)) {
			
			case MessageInterfaceDiagramEditPart.VISUAL_ID:
				return new CustomMessageInterfaceDiagramEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
