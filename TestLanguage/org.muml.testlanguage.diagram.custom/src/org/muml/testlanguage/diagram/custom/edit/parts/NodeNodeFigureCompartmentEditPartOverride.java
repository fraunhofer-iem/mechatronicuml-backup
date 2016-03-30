package org.muml.testlanguage.diagram.custom.edit.parts;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.testlanguage.diagram.custom.NodeCompartmentFigureListener;
import org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart;

public class NodeNodeFigureCompartmentEditPartOverride extends
		NodeNodeFigureCompartmentEditPart {

	public NodeNodeFigureCompartmentEditPartOverride(View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setForegroundColor(ColorConstants.black);
		result.setLineWidth(0);
		result.setBorder(null);
		result.setOpaque(false);

		// Setup for a XYLayout.
		IFigure contentPane = result.getContentPane();
		contentPane.setLayoutManager(new XYLayout());
		contentPane.setOpaque(false);

		// Create a new border that only draws one line to separate the node's
		// label and the port compartment.
		LineBorder border = new LineBorder() {
			public void paint(IFigure figure,
					org.eclipse.draw2d.Graphics graphics, Insets insets) {
				tempRect.setBounds(AbstractBorder.getPaintRectangle(figure,
						insets));
				if (this.getWidth() % 2 == 1) {
					tempRect.width--;
					tempRect.height--;
				}
				tempRect.shrink(this.getWidth() / 2, this.getWidth() / 2);
				graphics.setLineWidth(this.getWidth());
				graphics.setLineStyle(this.getStyle());
				if (this.getColor() != null)
					graphics.setForegroundColor(this.getColor());
				graphics.drawLine(tempRect.getTopLeft(), tempRect.getTopRight());
			};

			public Insets getInsets(IFigure figure) {
				return new Insets(this.getWidth(), 0, 0, 0);
			}
		};
		border.setWidth(2);
		contentPane.setBorder(border);

		// Delete content pane insets
		Insets is = contentPane.getInsets();
		is.top = 0;
		is.bottom = 0;
		is.left = 0;
		is.right = 0;

		// Add the resize events listener
		NodeCompartmentFigureListener listener = new NodeCompartmentFigureListener(
				this);
		result.addFigureListener(listener);

		return result;
	}

	@Override
	public boolean isSelectable() {
		return false;
	}

}
