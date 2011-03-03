package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.policies;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;

public class CustomPortGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	public static final String SOURCE_PORT_EDITPART_KEY = "SOURCE_PORT_EDITPART";
	public static final String TARGET_PORT_EDITPART_KEY = "TARGET_PORT_EDITPART";
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Command getConnectionAndRelationshipCreateCommand(
			CreateConnectionViewAndElementRequest request) {

		Map extendedData = new HashMap();
		extendedData.put(SOURCE_PORT_EDITPART_KEY, getHost());
		request.setExtendedData(extendedData);
		return super.getConnectionAndRelationshipCreateCommand(request);
	}

	@SuppressWarnings("unchecked")
	protected Command getConnectionAndRelationshipCompleteCommand(
			CreateConnectionViewAndElementRequest request) {
		request.getExtendedData().put(TARGET_PORT_EDITPART_KEY, getHost());
		return super.getConnectionAndRelationshipCompleteCommand(request);
	}

}
