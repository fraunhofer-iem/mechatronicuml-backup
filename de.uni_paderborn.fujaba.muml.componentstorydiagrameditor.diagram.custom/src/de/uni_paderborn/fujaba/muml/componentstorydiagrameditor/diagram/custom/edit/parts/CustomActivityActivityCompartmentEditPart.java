package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityActivityCompartmentEditPart;

public class CustomActivityActivityCompartmentEditPart extends
		ActivityActivityCompartmentEditPart {

	public CustomActivityActivityCompartmentEditPart(View view) {
		super(view);
	}
	
	@Override
	public IFigure createFigure(){
		IFigure result = super.createFigure();
		
		result.setBorder(null);
		
		return result;
	}
	

}
