package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;

public class CustomPortGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	@SuppressWarnings("unchecked")
	@Override
	protected Command getConnectionAndRelationshipCreateCommand(
			CreateConnectionViewAndElementRequest request) {
		request.getExtendedData().put("SOURCE_PORT_EDITPART", getHost());
		request.getExtendedData().put("TARGET_PORT_EDITPART", null);
		return super.getConnectionAndRelationshipCreateCommand(request);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Command getConnectionAndRelationshipCompleteCommand(
			CreateConnectionViewAndElementRequest request) {
		request.getExtendedData().put("TARGET_PORT_EDITPART", getHost());
		return super.getConnectionAndRelationshipCompleteCommand(request);
	}
}
