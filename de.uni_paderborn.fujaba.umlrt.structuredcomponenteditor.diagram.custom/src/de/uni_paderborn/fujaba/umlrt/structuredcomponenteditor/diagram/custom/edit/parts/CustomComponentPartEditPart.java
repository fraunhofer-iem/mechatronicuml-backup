package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;

public class CustomComponentPartEditPart extends ComponentPartEditPart {

	public CustomComponentPartEditPart(View view) {
		super(view);
	}

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
