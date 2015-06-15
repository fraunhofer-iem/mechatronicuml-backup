package de.uni_paderborn.fujaba.common.edit.policies.node;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

public interface INodePlateCreationEditPolicy extends EditPolicy {
	NodeFigure createNodePlate();
}
