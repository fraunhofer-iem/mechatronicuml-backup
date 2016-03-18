package de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom.FixedConnectionAnchor;
import de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputEditPart;

public class OutputEditPartOverride extends OutputEditPart {

	public OutputEditPartOverride(View view) {
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
					this, new PrecisionPoint(1.d, .5d));

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
		this.primaryShape = new ExtendedOutputFigure();
		this.primaryShape.setOpaque(false);
		return primaryShape;
	}

	public class ExtendedOutputFigure extends OutputEditPart.OutputFigure {

		private int[] polys = null;

		private void computePolygon() {
			if (this.polys != null) {
				return;
			}
			this.polys = new int[] { -NodeEditPartOverride.ARROW_INDENT,
					-NodeEditPartOverride.HALF_ARROW_HEIGHT, 0,
					-NodeEditPartOverride.HALF_ARROW_HEIGHT,
					NodeEditPartOverride.ARROW_WIDTH, 0, 0,
					NodeEditPartOverride.HALF_ARROW_HEIGHT,
					-NodeEditPartOverride.ARROW_INDENT,
					NodeEditPartOverride.HALF_ARROW_HEIGHT };
		}
		
		@Override
		public Insets getInsets() {
			return new Insets(0, 0, 0, 4);
		}

		@Override
		public void paintFigure(Graphics graphics) {
			// super.paintFigure(graphics);
			Rectangle r = this.getBounds();

			this.computePolygon();
			graphics.pushState();
			graphics.translate(
					(float) (r.x + r.width - NodeEditPartOverride.ARROW_INDENT - NodeEditPartOverride.ARROW_WIDTH),
					(float) (r.y + r.height / 2.));

			graphics.setBackgroundColor(ColorConstants.white);
			graphics.fillPolygon(this.polys);
			graphics.popState();
		};

	}

}
