package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.container;

import org.eclipse.gef.Request;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;

public class AutoSizeContainerRequest extends ChangeBoundsRequest {
	
	public AutoSizeContainerRequest(IGraphicalEditPart host){
	super(RequestConstants.REQ_RESIZE);
		setEditParts(host);
	}

}
