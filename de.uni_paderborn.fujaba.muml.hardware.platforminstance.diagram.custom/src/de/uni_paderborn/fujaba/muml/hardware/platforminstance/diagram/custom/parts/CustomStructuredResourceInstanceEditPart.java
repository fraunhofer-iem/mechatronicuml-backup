package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure.ResourceType;
import de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart;

/**
 * A customized EditPart for {@link StructuredResourceInstance}. 
 * A customized Figure will be used, which underlines the text.
 * 
 * @author adann
 * 
 */
public class CustomStructuredResourceInstanceEditPart extends
		StructuredResourceInstanceEditPart {

	public CustomStructuredResourceInstanceEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure createNodeShape() {
		 primaryShape = new StructuredResourceFigure();
		 ((StructuredResourceFigure) primaryShape).getFigureStructuredResourceNameFigure().setTextUnderline(true);
		 ((StructuredResourceFigure) primaryShape).getFigureStructuredResourceKindFigure().setTextUnderline(true);
		 ((StructuredResourceFigure) primaryShape).getFigureCustomStructuredIconFigure().setIcon(ResourceType.STRUCTURED);
		return primaryShape;
	} 
	
	@Override
	public void activate() {
		super.activate();
		}
	
	
}
