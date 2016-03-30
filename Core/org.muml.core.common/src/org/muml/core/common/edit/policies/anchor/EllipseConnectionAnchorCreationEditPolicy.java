package org.muml.core.common.edit.policies.anchor;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;

public class EllipseConnectionAnchorCreationEditPolicy extends AbstractEditPolicy implements IConnectionAnchorCreationEditPolicy {

	@Override
	public ConnectionAnchor createDefaultAnchor() {
		return new EllipseAnchor(((GraphicalEditPart) getHost()).getFigure());
	}

}
