package org.muml.core.common.edit.policies.compartment;

import org.eclipse.draw2d.Border;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;

public class BorderlessCompartmentEditPolicy extends GraphicalEditPolicy {
	
	private Border border;
	
	@Override
	public void activate() {
		super.activate();
		border = getHostFigure().getBorder();
		getHostFigure().setBorder(null);
	}
	
	@Override
	public void deactivate() {
		getHostFigure().setBorder(border);
		border = null;
		super.deactivate();
	}

}
