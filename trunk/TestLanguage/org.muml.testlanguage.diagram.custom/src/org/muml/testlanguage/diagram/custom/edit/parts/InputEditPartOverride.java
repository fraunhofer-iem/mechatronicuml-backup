package org.muml.testlanguage.diagram.custom.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.testlanguage.Input;
import org.muml.testlanguage.diagram.custom.FixedConnectionAnchor;
import org.muml.testlanguage.diagram.edit.parts.InputEditPart;

public class InputEditPartOverride extends InputEditPart {

	public InputEditPartOverride(View view) {
		super(view);
	}

	@Override
	public boolean isSelectable() {
		return false;
	}

	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			private FixedConnectionAnchor anchor = new FixedConnectionAnchor(
					this, new PrecisionPoint(0.d, .5d));

			@Override
			public ConnectionAnchor getSourceConnectionAnchorAt(Point p) {
				return anchor;
			}

			@Override
			public ConnectionAnchor getTargetConnectionAnchorAt(Point p) {
				return anchor;
			}

			@Override
			public ConnectionAnchor getConnectionAnchor(String terminal) {
				return anchor;
			}

			@Override
			public String getConnectionAnchorTerminal(ConnectionAnchor c) {
				return "anchor";
			}
		};
		return result;
	}

	@Override
	protected IFigure createNodeShape() {
		this.primaryShape = new ExtendedInputFigure();
		this.primaryShape.setOpaque(false);
		return primaryShape;
	}

	public class ExtendedInputFigure extends InputEditPart.InputFigure {

		private int[] polys = null;

		public ExtendedInputFigure() {
			super();
		}

		private void computePolygon() {
			if (this.polys != null) {
				return;
			}

			this.polys = new int[] { 0,
					-NodeEditPartOverride.HALF_ARROW_HEIGHT,
					NodeEditPartOverride.ARROW_WIDTH, 0, 0,
					NodeEditPartOverride.HALF_ARROW_HEIGHT };
		}

		@Override
		public Insets getInsets() {
			return new Insets(0, 4, 0, 0);
		}

		@Override
		public void paintFigure(Graphics graphics) {
			// super.paintFigure(graphics);
			graphics.setBackgroundColor(ColorConstants.black);
			graphics.setForegroundColor(ColorConstants.black);
			graphics.setLineWidthFloat(1.5f);
			Rectangle r = this.getBounds();

			this.computePolygon();
			graphics.pushState();
			graphics.translate(
					(float) (r.x + NodeEditPartOverride.ARROW_INDENT),
					(float) (r.y + r.height / 2.));

			EObject element = InputEditPartOverride.this
					.resolveSemanticElement();
			if (element != null && element instanceof Input) {
				if (((Input) element).isOptional()) {
					graphics.translate(-.5f, 0f);
					graphics.drawPolygon(this.polys);
				} else {
					graphics.fillPolygon(this.polys);
				}
			} else {
				graphics.fillPolygon(this.polys);
			}
			graphics.popState();
		};

	}

}
