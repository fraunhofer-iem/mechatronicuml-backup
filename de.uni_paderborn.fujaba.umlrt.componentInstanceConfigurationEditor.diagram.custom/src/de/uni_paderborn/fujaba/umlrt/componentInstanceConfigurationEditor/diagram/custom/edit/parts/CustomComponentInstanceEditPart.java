package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceEditPart;

public class CustomComponentInstanceEditPart extends ComponentInstanceEditPart {

	public CustomComponentInstanceEditPart(View view) {
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
