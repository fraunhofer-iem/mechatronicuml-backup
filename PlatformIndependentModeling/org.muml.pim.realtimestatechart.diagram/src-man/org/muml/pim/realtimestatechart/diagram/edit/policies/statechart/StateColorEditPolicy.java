package org.muml.pim.realtimestatechart.diagram.edit.policies.statechart;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.swt.graphics.Color;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.Port;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.pattern.CoordinationPatternVariant;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart;

public class StateColorEditPolicy extends NotifyingGraphicalEditPolicy {

	private static final Color COLOR_PROTOCOL_ROLE = new Color(null, 173, 216, 230);
	private static final Color COLOR_PATTERN_ROLE = new Color(null, 251, 215, 187);
	private static final Color COLOR_PORT = new Color(null, 214, 226, 190);
	private static final Color COLOR_COMPONENT = new Color(null, 214, 226, 190);

	@Override
	public void activate() {
		super.activate();
		updateStateColor();
		updateRegionsCompartment();
	}
	
	@Override
	protected void addListeners() {
		super.addListeners();
		EObject element = getSemanticElement();
		if (element instanceof State) {
			State state = (State) element;
			RealtimeStatechart statechart = state.getParentStatechart();
			while (statechart != null) {
				addNotificationListener(statechart);
				if (statechart.getBehavioralElement() != null) {
					addNotificationListener(statechart.getBehavioralElement());
					break;
				}
				
				RealtimeStatechart parentStatechart = null;
				if (statechart.getParentRegion() != null && statechart.getParentRegion().getParentState() != null) {
					parentStatechart = statechart.getParentRegion().getParentState().getParentStatechart();
				}
				statechart = parentStatechart;
			}
		}
	}
	
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == RealtimestatechartPackage.Literals.STATE__PARENT_STATECHART ||
				notification.getFeature() == BehaviorPackage.Literals.BEHAVIOR__BEHAVIORAL_ELEMENT) {
			updateListeners();
			updateStateColor();
		}
		
		if (notification.getFeature() == RealtimestatechartPackage.Literals.STATE__EMBEDDED_REGIONS) {
			updateRegionsCompartment();
		}
	}
	
	private void updateRegionsCompartment() {
		boolean fill = false;
		EObject element = getSemanticElement();
		if (element instanceof State) {
			State state = (State) element;
			fill = !state.getEmbeddedRegions().isEmpty();
		}
		

		IFigure figure = ((GraphicalEditPart)getHost()).getContentPane();
		if (figure instanceof StateEditPart.StateFigure) {
			StateEditPart.StateFigure stateFigure = (StateEditPart.StateFigure) figure;
			stateFigure.getFigureRegionsCompartment().setFill(fill);
		}
	}
	
	private void updateStateColor() {
		Color color = ColorConstants.white;
		EObject element = getSemanticElement();
		if (element instanceof State) {
			State state = (State) element;
			RealtimeStatechart statechart = state.getParentStatechart();
			while (statechart != null) {
				if (statechart.getBehavioralElement() != null) {
					if (statechart.getBehavioralElement() instanceof Port) {
						color = COLOR_PORT;
					} else if (statechart.getBehavioralElement() instanceof Role) {
						Role role = (Role) statechart.getBehavioralElement();
						if (role.getCoordinationProtocol() instanceof CoordinationProtocol) {
							color = COLOR_PROTOCOL_ROLE;
						} else if (role.getCoordinationProtocol() instanceof CoordinationPattern || role.getCoordinationProtocol() instanceof CoordinationPatternVariant) {
							color = COLOR_PATTERN_ROLE;
						}
					} else if (statechart.getBehavioralElement() instanceof AtomicComponent) {
						color = COLOR_COMPONENT;
					}
					break;
				}

				RealtimeStatechart parentStatechart = null;
				if (statechart.getParentRegion() != null && statechart.getParentRegion().getParentState() != null) {
					parentStatechart = statechart.getParentRegion().getParentState().getParentStatechart();
				}
				statechart = parentStatechart;
			}
		}

		IFigure figure = ((GraphicalEditPart)getHost()).getContentPane();
		if (figure instanceof StateEditPart.StateFigure) {
			StateEditPart.StateFigure stateFigure = (StateEditPart.StateFigure) figure;
			stateFigure.setBackgroundColor(color);
		}
	}
}
