package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart;

/**
 * @generated
 */
public class CustomStructuredComponentInstanceComponentInstanceContentsCompartmentEditPart
		extends StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart {

	public CustomStructuredComponentInstanceComponentInstanceContentsCompartmentEditPart(
			View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
			
		// Begin: Fix for Mechatronic-UML Bug #116
		result.setBorder(null);
		// End Fix

		return result;
	}
}
