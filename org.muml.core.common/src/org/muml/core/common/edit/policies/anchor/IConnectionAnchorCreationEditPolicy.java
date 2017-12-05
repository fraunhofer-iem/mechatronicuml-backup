package org.muml.core.common.edit.policies.anchor;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gef.EditPolicy;

public interface IConnectionAnchorCreationEditPolicy extends EditPolicy {
	ConnectionAnchor createDefaultAnchor();
}
