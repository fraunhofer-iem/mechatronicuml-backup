package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceEditPart;

/**
 * A custom EditPart for ComponentInstances. It uses a custom figure.
 * 
 * @author bingo
 * 
 */
public class CustomComponentInstanceEditPart extends ComponentInstanceEditPart {

	public CustomComponentInstanceEditPart(View view) {
		super(view);
	}

	/**
	 * Create our customized figure.
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new CustomComponentFigure();
	}

	/**
	 * A customized figure, which has an underlined label.
	 * 
	 * @author bingo
	 *
	 */
	public class CustomComponentFigure extends ComponentFigure {
		public CustomComponentFigure() {
			super();
			this.getFigureComponentNameFigure().setTextUnderline(true);
		}
	}
}
