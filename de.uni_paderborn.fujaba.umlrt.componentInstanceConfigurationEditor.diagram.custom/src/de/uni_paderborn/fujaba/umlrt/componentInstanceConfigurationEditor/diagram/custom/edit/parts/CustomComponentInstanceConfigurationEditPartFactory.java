package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.PortEditPart;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomComponentInstanceConfigurationEditPartFactory extends
		ComponentInstanceConfigurationEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (ComponentInstanceConfigurationVisualIDRegistry.getVisualID(view)) {
			case PortEditPart.VISUAL_ID:
				return new CustomPortEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
