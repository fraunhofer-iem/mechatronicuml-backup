package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart;

/**
 * A customized PortEditPart. It is responsible for ports around
 * StructuredComponents and ComponentParts.
 * 
 * @author braund
 * 
 */
public class CustomTransitionEditPart extends TransitionEditPart {

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomTransitionEditPart(View view) {
		super(view);
	}

}
