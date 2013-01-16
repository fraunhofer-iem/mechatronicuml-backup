package de.uni_paderborn.fujaba.muml.common.edit.policies;

import java.util.Map;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.AbstractEditCommandRequest;

/**
 * This GraphicalNodeEditPolicy helps configuring ConnectionRequests by setting
 * the editpart for its source and target. See Muml Bug #455 for detailed
 * explanations.
 * 
 * @author bingo
 * 
 */
public class ConnectionConfigureHelperGraphicalNodeEditPolicy extends
		GraphicalNodeEditPolicy {

	public static String SOURCE_EDITPART_ID = "SOURCE_EDITPART";
	public static String TARGET_EDITPART_ID = "TARGET_EDITPART";

	@Override
	protected Command getConnectionAndRelationshipCreateCommand(
			CreateConnectionViewAndElementRequest request) {
		@SuppressWarnings("unchecked")
		Map<Object, Object> data = (Map<Object, Object>) request
				.getExtendedData();
		if (data != null) {
			data.put(SOURCE_EDITPART_ID, getHost());
			data.put(TARGET_EDITPART_ID, null);
		}
		return super.getConnectionAndRelationshipCreateCommand(request);
	}

	@Override
	protected Command getConnectionAndRelationshipCompleteCommand(
			CreateConnectionViewAndElementRequest request) {
		@SuppressWarnings("unchecked")
		Map<Object, Object> data = (Map<Object, Object>) request
				.getExtendedData();
		if (data != null) {
			data.put(TARGET_EDITPART_ID, getHost());
		}
		return super.getConnectionAndRelationshipCompleteCommand(request);
	}
	
	/**
	 * Convenience method for getting the source edit part stored in a gef request.
	 */
	public static EditPart getSourceEditPartFor(Request request) {
		@SuppressWarnings("rawtypes")
		Map data =  request.getExtendedData();
		if (data != null) {
			return getSourceEditPartFor(data);
		}
		return null;
	}

	/**
	 * Convenience method for getting the target edit part stored in a gef request.
	 */
	public static EditPart getTargetEditPartFor(Request request) {
		@SuppressWarnings("rawtypes")
		Map data =  request.getExtendedData();
		if (data != null) {
			return getTargetEditPartFor(data);
		}
		return null;
	}

	/**
	 * Convenience method for getting the source edit part stored in a map.
	 */
	public static EditPart getSourceEditPartFor(Map<?,?> data) {
		return (EditPart) data.get(SOURCE_EDITPART_ID);
	}

	/**
	 * Convenience method for getting the target edit part stored in a map.
	 */
	public static EditPart getTargetEditPartFor(Map<?,?> data) {
		return (EditPart) data.get(TARGET_EDITPART_ID);
	}
	
	/**
	 * Convenience method for getting the source edit part stored in a gmf request.
	 */
	public static EditPart getSourceEditPartFor(AbstractEditCommandRequest request) {
		return (EditPart) request.getParameter(SOURCE_EDITPART_ID);
	}
	
	/**
	 * Convenience method for getting the target edit part stored in a gmf request.
	 */
	public static EditPart getTargetEditPartFor(AbstractEditCommandRequest request) {
		return (EditPart) request.getParameter(TARGET_EDITPART_ID);
	}
}
