package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstance2EditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstance2EditPart.ComponentFigure;



/**
 * A customized EditPart for ComponentParts. A customized Figure will be used,
 * which underlines the text.
 * 
 * @author bingo
 * 
 */
public class CustomComponentInstance2EditPart extends ComponentInstance2EditPart {

	public CustomComponentInstance2EditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new CustomComponentFigure();
	}

	public class CustomComponentFigure extends ComponentFigure {
		public CustomComponentFigure() {
			super();
			this.getFigureComponentNameFigure().setTextUnderline(true);
		}
	}

}
