package de.uni_paderborn.fujaba.common.edit.policies.anchor;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gef.EditPolicy;

public interface IConnectionAnchorCreationEditPolicy extends EditPolicy {
	ConnectionAnchor createDefaultAnchor();
}
