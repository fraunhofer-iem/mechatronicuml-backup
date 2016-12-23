package org.muml.pm.hardware.common.edit.policies.hwport;

import org.eclipse.draw2d.PositionConstants;
import org.muml.pim.common.edit.policies.ports.AbstractRotatingBorderItemEditPolicy;
import org.muml.pm.hardware.common.figures.CustomHWPortFigure;
import org.muml.pm.hardware.common.figures.CustomHWPortFigure.VisualPortKind;
import org.muml.pm.hardware.hwresource.CommunicationKind;

/**
 * Base edit policy for all border items that use the CustomHWPortFigure.
 * Provides handling model notifications and updating the hwport figure
 * accordingly. This base implementation does not depend on any semantic
 * classes, but subclasses should override handleNotificationEvent() and call
 * refreshHWPortFigure() method.
 * 
 * @author adann
 * 
 */

public abstract class HWPortBaseEditPolicy extends
		AbstractRotatingBorderItemEditPolicy {

	public void activate() {
		super.activate();
		if (deduceBorderItemEditPart() == null) {
			getHWPortFigure().setPortSide(PositionConstants.WEST);
		}
		refreshHWPortFigure();
	}

	@Override
	protected void sideChanged(int side) {
		getHWPortFigure().setPortSide(side);
		super.sideChanged(side);
	}

	public CustomHWPortFigure getHWPortFigure() {
		return (CustomHWPortFigure) getContentPane();
	}

	/**
	 * Refreshes the CustomHWPortFigure. This methods sets the visualization
	 * whether it is a Bus/Link-Port and whether it is a delegation port or not.
	 */
	public void refreshHWPortFigure() {
		VisualPortKind kind = getVisualPortKind();
		boolean delegation = isDelegationPort();
		boolean isMultiPort = isMultiHWPort();
		boolean isOptional = isOptionalPort();
		getHWPortFigure().setHWPortKind(kind);
		getHWPortFigure().setDelegationPort(delegation);
		getHWPortFigure().setMulti(isMultiPort);
		getHWPortFigure().setOptional(isOptional);
	}

	public VisualPortKind getVisualPortKind() {
		VisualPortKind kind = VisualPortKind.BUS;
		CommunicationKind modelPortKind = getCommunicationKind();
		if (modelPortKind == null) {
			modelPortKind = org.muml.pm.hardware.hwresource.CommunicationKind.BUS;
		}
		switch (modelPortKind.getValue()) {
		case (org.muml.pm.hardware.hwresource.CommunicationKind.BUS_VALUE):
			kind = VisualPortKind.BUS;
			break;
		case (org.muml.pm.hardware.hwresource.CommunicationKind.LINK_VALUE):
			kind = VisualPortKind.LINK;
			break;

		}
		return kind;
	}

	protected abstract boolean isMultiHWPort();

	protected abstract CommunicationKind getCommunicationKind();

	protected abstract boolean isDelegationPort();

	protected abstract boolean isOptionalPort();

}
