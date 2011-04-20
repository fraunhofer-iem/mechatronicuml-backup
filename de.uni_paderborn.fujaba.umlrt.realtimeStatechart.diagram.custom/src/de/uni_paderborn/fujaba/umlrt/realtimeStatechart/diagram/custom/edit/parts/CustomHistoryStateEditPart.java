package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart;

/**
 * A customized PortEditPart. It is responsible for ports around
 * StructuredComponents and ComponentParts.
 * 
 * @author braund
 * 
 */
public class CustomHistoryStateEditPart extends HistoryStateEditPart {

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomHistoryStateEditPart(View view) {
		super(view);

	}
	
}
