package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;

public class HardwarePortBehavior extends AbstractPortTypeBehavior {

	public HardwarePortBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}
	
	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.HARDWARE;
	}

	@Override
	public CustomPortFigure.PortType getPortType() {
		return CustomPortFigure.PortType.NONE;
	}
}
