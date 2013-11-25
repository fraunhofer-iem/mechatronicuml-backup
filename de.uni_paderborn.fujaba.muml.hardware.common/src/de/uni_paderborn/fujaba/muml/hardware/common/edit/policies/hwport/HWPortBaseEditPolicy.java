package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.draw2d.PositionConstants;

import de.uni_paderborn.fujaba.muml.common.edit.policies.ports.AbstractRotatingBorderItemEditPolicy;
import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure;
import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure.HWPortKind;

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
		HWPortKind kind = getHWPortKind();
		boolean delegation = isDelegationPort();
		boolean isMultiPort = isMultiHWPort();
		getHWPortFigure().setHWPortKind(kind);
		getHWPortFigure().setDelegationPort(delegation);
		getHWPortFigure().setMulti(isMultiPort);
	}

	
	
	protected abstract boolean isMultiHWPort();

	protected abstract HWPortKind getHWPortKind();

	protected abstract boolean isDelegationPort();

}
