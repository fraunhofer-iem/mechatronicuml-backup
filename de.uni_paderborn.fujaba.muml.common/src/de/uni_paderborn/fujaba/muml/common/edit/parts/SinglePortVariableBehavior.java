package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortType;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

public class SinglePortVariableBehavior extends AbstractPortBehavior {
	
	private PortVariable portVariable;

	public SinglePortVariableBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		if (ComponentstorypatternPackage.Literals.PORT_VARIABLE__TYPE.equals(notification.getFeature())) {
			updatePortType();
		}
	}

	@Override
	public PortKind getPortKind() {
		Port port = getPortVariable().getType();
		if (port instanceof DiscretePort) {
			return CustomPortFigure.PortKind.DISCRETE;
		} else if (port instanceof ContinuousPort) {
			return CustomPortFigure.PortKind.CONTINUOUS;
		}
		return CustomPortFigure.PortKind.HYBRID;
		
	}

	@Override
	public PortType getPortType() {
	
		Port port = portVariable.getType();
		
		CustomPortFigure.PortType type = CustomPortFigure.PortType.NONE;
		
		if (port instanceof DiscretePort) {
			// Access the message interfaces...
			DiscretePort discretePort = (DiscretePort) port;

			// Find out the PortType depending on the MessageInterfaces set.
			if (discretePort.isIsDiscreteInOutPort()) {
				type = CustomPortFigure.PortType.INOUT_PORT;
			} else if (discretePort.isIsDiscreteInPort()) {
				type = CustomPortFigure.PortType.IN_PORT;
			} else if (discretePort.isIsDiscreteOutPort()) {
				type = CustomPortFigure.PortType.OUT_PORT;
			}
		} else if (port instanceof ContinuousPort) {
			ContinuousPortDirectionKind direction = null;
			direction = (ContinuousPortDirectionKind) port.eGet(ComponentPackage.Literals.DIRECTED_TYPED_PORT__KIND);
			switch (direction) {
			case IN:
				type = CustomPortFigure.PortType.IN_PORT;
				break;
			case OUT:
				type = CustomPortFigure.PortType.OUT_PORT;
				break;
			default:
				type = CustomPortFigure.PortType.NONE;
				break;
			}
			return type;
		}
		// TODO: What about HybridPort?
		
		return type;
	}


	@Override
	public void activate() {
		EObject element = editPart.getNotationView().getElement();
		if (element instanceof PortVariable) {
			portVariable = (PortVariable) editPart.getNotationView()
					.getElement();
		}

		IFigure portContainerFigure = getPortContainerFigure();
		if (portContainerFigure != null) {
			addLayoutListener(portContainerFigure);
		}

		super.activate();
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	@Override
	public void deactivate() {
		portVariable = null;

		IFigure portContainerFigure = getPortContainerFigure();
		if (portContainerFigure != null) {
			removeLayoutListener(portContainerFigure);
		}

		super.deactivate();
	}

	@Override
	public boolean isMulti() {
		return false;
	}

	@Override
	public boolean isMandatory() {
		return true;
	}

	public PortVariable getPortVariable() {
		return portVariable;
	}
	
}
