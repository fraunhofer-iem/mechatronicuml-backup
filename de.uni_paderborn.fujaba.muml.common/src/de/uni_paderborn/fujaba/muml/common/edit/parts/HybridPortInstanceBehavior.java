package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;

public class HybridPortInstanceBehavior extends ContinuousPortInstanceBehavior {

	public HybridPortInstanceBehavior(GraphicalEditPart graphicalEditPart) {
		super(graphicalEditPart);
	}
	
	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.HYBRID;
	}

}
