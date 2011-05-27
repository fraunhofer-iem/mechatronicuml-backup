package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstance2EditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceEditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentinstanceconfigurationEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomComponentinstanceconfigurationEditPartFactory extends
		ComponentinstanceconfigurationEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (ComponentinstanceconfigurationVisualIDRegistry.getVisualID(view)) {
			case PortInstanceEditPart.VISUAL_ID:
				return new CustomPortInstanceEditPart(view);
				
			case PortInstance2EditPart.VISUAL_ID:
				return new CustomPortInstance2EditPart(view);
				
			case ComponentInstanceEditPart.VISUAL_ID:
				return new CustomComponentInstanceEditPart(view);
				
			case ComponentInstance2EditPart.VISUAL_ID:
				return new CustomComponentInstance2EditPart(view);
		
			case ComponentInstanceComponentCompartmentEditPart.VISUAL_ID:
				return new CustomComponentInstanceComponentCompartmentEditPart(
						view);
			}
		}
		return super.createEditPart(context, model);
	}

}
