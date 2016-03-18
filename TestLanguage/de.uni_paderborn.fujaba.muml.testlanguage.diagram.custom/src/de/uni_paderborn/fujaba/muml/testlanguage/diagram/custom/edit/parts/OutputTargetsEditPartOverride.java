package de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart;

public class OutputTargetsEditPartOverride extends OutputTargetsEditPart {

	public OutputTargetsEditPartOverride(View view) {
		super(view);
	}

	@Override
	protected Connection createConnectionFigure() {
		return new ExtendedOutputTargetsFigure();
	}

	public class ExtendedOutputTargetsFigure extends
			OutputTargetsEditPart.OutputTargetsFigure {

		/**
		 * @generated
		 */
		public ExtendedOutputTargetsFigure() {
			super();
			this.setRoutingStyles(false, true);
		}

		@Override
		protected void outlineShape(Graphics g) {
			g.setForegroundColor(ColorConstants.black);
			super.outlineShape(g);
		}

	}

}
