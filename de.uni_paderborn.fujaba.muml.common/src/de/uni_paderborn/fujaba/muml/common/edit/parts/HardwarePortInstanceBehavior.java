package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;

public class HardwarePortInstanceBehavior extends AbstractPortInstanceBehavior {

	public HardwarePortInstanceBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}

	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.HARDWARE;
	}

	@Override
	public CustomPortFigure.PortType getPortType() {
		return CustomPortFigure.PortType.INOUT_PORT;
	}

}
