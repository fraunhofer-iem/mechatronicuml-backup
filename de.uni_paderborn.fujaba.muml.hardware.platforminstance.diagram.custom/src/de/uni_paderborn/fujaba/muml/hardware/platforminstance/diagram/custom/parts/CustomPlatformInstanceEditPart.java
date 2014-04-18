package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart;

/**
 * A customized EditPart for {@link HWPlatformInstance}. A customized Figure
 * will be used, which underlines the text.
 * 
 * @author adann
 * 
 */
public class CustomPlatformInstanceEditPart extends HWPlatformInstanceEditPart {

	public CustomPlatformInstanceEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		primaryShape =  new HWPlatform();
		((HWPlatform) primaryShape).getFigureHWPlatformNameLabel().setTextUnderline(true);
		return primaryShape;
	}

	@Override
	public void activate() {
		super.activate();
	}
	
	

}
