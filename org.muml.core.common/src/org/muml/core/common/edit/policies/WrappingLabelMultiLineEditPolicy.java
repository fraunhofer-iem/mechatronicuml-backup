package org.muml.core.common.edit.policies;

import org.eclipse.core.runtime.Assert;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * This EditPolicy can be registered within a WrappingLabel Edit Part to make its label multi line.
 * @author ingo
 *
 */
public class WrappingLabelMultiLineEditPolicy extends GraphicalEditPolicy {

	@Override
	public void activate() {
		super.activate();
		Assert.isLegal(getHost() instanceof GraphicalEditPart, "Please only register for GraphicalEditParts.");
		Assert.isLegal(((GraphicalEditPart) getHost()).getFigure() instanceof WrappingLabel, "Please only register for edit parts that use WrappingLabel figures.");
		setTextWrap(true);
	}

	@Override
	public void deactivate() {
		setTextWrap(false);
		super.deactivate();
	}

	private void setTextWrap(boolean textWrap) {
		((WrappingLabel) ((GraphicalEditPart) getHost()).getFigure()).setTextWrap(textWrap);
	}
}
