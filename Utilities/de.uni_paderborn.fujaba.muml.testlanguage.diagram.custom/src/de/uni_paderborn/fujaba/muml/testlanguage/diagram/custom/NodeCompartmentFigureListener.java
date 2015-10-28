package de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;

import de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom.edit.parts.NodeEditPartOverride;
import de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.InputEditPart;
import de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputEditPart;

public class NodeCompartmentFigureListener implements FigureListener {

	private ListCompartmentEditPart compartmentEditPart = null;

	public static final double R = 50; // The base length
	public static final double REF_W = R * 2; // Reference width
	public static final double REF_H = R; // Reference height

	public NodeCompartmentFigureListener(
			ListCompartmentEditPart compartmentEditPart) {
		this.compartmentEditPart = compartmentEditPart;
	}

	public static void updateFigure(IFigure f, ListCompartmentEditPart editPart) {
		ResizableCompartmentFigure figure = (ResizableCompartmentFigure) f;

		if (figure.getSize().width != 0) {
			IFigure contentPane = figure.getContentPane();
			Insets is = figure.getInsets();

			// Determine the scale to apply
			double xScale = ((double) figure.getSize().width - is.left - is.right)
					/ REF_W;

			List<AbstractEditPart> children = new LinkedList<AbstractEditPart>();
			for (Object obj : editPart.getChildren()) {
				children.add((AbstractEditPart) obj);
			}

			// Count input and output nodes.
			double inputCount = 0;
			double outputCount = 0;
			for (AbstractEditPart child : children) {
				if (child instanceof AbstractGraphicalEditPart) {
					AbstractGraphicalEditPart gEditPart = (AbstractGraphicalEditPart) child;
					if (gEditPart instanceof OutputEditPart) {
						outputCount++;
					} else if (gEditPart instanceof InputEditPart) {
						inputCount++;
					}
				}
			}

			double inputOffset = 0;
			double outputOffset = 0;
			double portHeight = NodeEditPartOverride.PORT_HEIGHT;

			if (inputCount > outputCount) {
				outputOffset = (int) Math.round((inputCount - outputCount)
						* portHeight / 2.);
			} else if (outputCount > 0) {
				inputOffset = (int) Math.round((outputCount - inputCount)
						* portHeight / 2.);
			}
			
			double extension = (inputCount == 0 || outputCount == 0) ? R : 0;

			// Set the constraints for the input and output nodes
			double inputCur = 0;
			double outputCur = 0;
			Rectangle constraint;
			for (AbstractEditPart child : children) {
				if (child instanceof AbstractGraphicalEditPart) {
					AbstractGraphicalEditPart gEditPart = (AbstractGraphicalEditPart) child;

					// Operator output?
					if (gEditPart instanceof OutputEditPart) {
						constraint = new Rectangle((int) ((R-extension) * xScale),
								(int) (portHeight * outputCur + outputOffset),
								(int) ((R+extension) * xScale), (int) portHeight);
						contentPane.setConstraint(gEditPart.getFigure(),
								constraint);
						outputCur++;
					}

					// Operator input?
					else if (gEditPart instanceof InputEditPart) {
						constraint = new Rectangle(0, (int) (portHeight
								* inputCur + inputOffset), (int) ((R+extension) * xScale),
								(int) portHeight);
						contentPane.setConstraint(gEditPart.getFigure(),
								constraint);
						inputCur++;
					}
				}
			}
		}
	}

	@Override
	public void figureMoved(IFigure f) {
		NodeCompartmentFigureListener.updateFigure(f, this.compartmentEditPart);
	}

}
