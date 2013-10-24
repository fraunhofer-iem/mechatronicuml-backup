package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.custom.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure.ResourceType;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart;


/**
 * A customized EditPart for StructuredResources. A customized icon (a 3D-Box) for a StructuredResource will be used.
 * 
 * @author adann
 * 
 */
public class CustomStructuredResourceEditPart extends StructuredResourceEditPart {

	public CustomStructuredResourceEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		primaryShape = new StructuredResourceFigure();
		((StructuredResourceFigure) primaryShape).getFigureCustomStructuredIconFigure().setIcon(ResourceType.STRUCTURED);
		return primaryShape;
	}

	
}

