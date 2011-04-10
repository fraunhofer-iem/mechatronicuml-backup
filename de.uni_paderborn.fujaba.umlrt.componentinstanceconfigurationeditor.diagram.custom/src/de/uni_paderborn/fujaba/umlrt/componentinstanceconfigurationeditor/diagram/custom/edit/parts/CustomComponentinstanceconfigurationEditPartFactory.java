package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceComponentCompartment2EditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceEditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentinstanceconfigurationEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.PortInstanceEditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry;

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
				
			case ComponentInstanceEditPart.VISUAL_ID:
				return new CustomComponentInstanceEditPart(view);
		
			case ComponentInstanceComponentCompartmentEditPart.VISUAL_ID:
				return new CustomComponentInstanceComponentCompartmentEditPart(
						view);
				
			case ComponentInstanceComponentCompartment2EditPart.VISUAL_ID:
				break;
			}
		}
		return super.createEditPart(context, model);
	}

}
