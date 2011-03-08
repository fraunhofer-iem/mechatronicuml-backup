package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;

public class CustomPortGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Command getConnectionAndRelationshipCreateCommand(
			CreateConnectionViewAndElementRequest request) {

		Map extendedData = new HashMap();
		extendedData.put("SOURCE_PORT_EDITPART", getHost());
		request.setExtendedData(extendedData);
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
