package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom.edit.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.UmlrtEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomMessageinterfaceEditPartFactory extends
		UmlrtEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (UmlrtVisualIDRegistry.getVisualID(view)) {
			
			case MessageInterfaceDiagramEditPart.VISUAL_ID:
				return new CustomMessageInterfaceDiagramEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
