package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.FadingFunctionEditPart;

public class CustomFadingFunctionEditPart extends FadingFunctionEditPart {

	public CustomFadingFunctionEditPart(View view) {
		super(view);
	}
	
	@Override
	public void activate() {
		super.activate();
		getPrimaryShape().getFigureFadingFunctionLabel().setAlignment(PositionConstants.RIGHT);
		getPrimaryShape().getFigureFadingFunctionLabel().setTextJustification(PositionConstants.RIGHT);
	}

}
