package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

public class ContinuousPortInstanceBehavior extends AbstractPortInstanceBehavior {

	public ContinuousPortInstanceBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}

	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.CONTINUOUS;
	}

	@Override
	public CustomPortFigure.PortType getPortType() {
		ContinuousPortDirectionKind kind = null;
		
		PortInstance portInstance = getPortInstance();
		if (portInstance != null) {
			Port port = portInstance.getPortType();
			if (port instanceof ContinuousPort) {
				kind = ((ContinuousPort) port).getKind();
			}
		}

		switch (kind) {
		case IN:
			return CustomPortFigure.PortType.IN_PORT;

		case OUT:
			return CustomPortFigure.PortType.OUT_PORT;

		default:
			return CustomPortFigure.PortType.NONE;
		}
	}

}
