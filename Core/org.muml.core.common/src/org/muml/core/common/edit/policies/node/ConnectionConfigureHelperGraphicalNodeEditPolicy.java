package org.muml.core.common.edit.policies.node;

import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This GraphicalNodeEditPolicy helps configuring ConnectionRequests by setting
 * the view for its source and target. See Muml Bug #455 for detailed
 * explanations.
 * 
 * @author bingo
 * 
 */
public class ConnectionConfigureHelperGraphicalNodeEditPolicy extends
		GraphicalNodeEditPolicy {

	public static String SOURCE_VIEW_ID = "SOURCE_VIEW";
	public static String TARGET_VIEW_ID = "TARGET_VIEW";

	@Override
	protected Command getConnectionAndRelationshipCreateCommand(
			CreateConnectionViewAndElementRequest request) {
		@SuppressWarnings("unchecked")
		Map<Object, Object> data = (Map<Object, Object>) request
				.getExtendedData();
		if (data != null) {
			data.put(SOURCE_VIEW_ID, getHost().getModel());
			data.put(TARGET_VIEW_ID, null);
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
			data.put(TARGET_VIEW_ID, getHost().getModel());
		}
		return super.getConnectionAndRelationshipCompleteCommand(request);
	}
	
	/**
	 * Convenience method for getting the source view stored in a gef request.
	 */
	public static View getSourceView(Request request) {
		@SuppressWarnings("rawtypes")
		Map data =  request.getExtendedData();
		if (data != null) {
			return getSourceView(data);
		}
		return null;
	}

	/**
	 * Convenience method for getting the target view stored in a gef request.
	 */
	public static View getTargetView(Request request) {
		@SuppressWarnings("rawtypes")
		Map data =  request.getExtendedData();
		if (data != null) {
			return getTargetView(data);
		}
		return null;
	}

	/**
	 * Convenience method for getting the source view stored in a map.
	 */
	public static View getSourceView(Map<?,?> data) {
		return (View) data.get(SOURCE_VIEW_ID);
	}

	/**
	 * Convenience method for getting the target view stored in a map.
	 */
	public static View getTargetView(Map<?,?> data) {
		return (View) data.get(TARGET_VIEW_ID);
	}

	/**
	 * Convenience method for getting the source view stored in a gmf request.
	 */
	public static View getSourceView(IEditCommandRequest request) {
		return (View) request.getParameter(SOURCE_VIEW_ID);
	}
	
	/**
	 * Convenience method for getting the target view stored in a gmf request.
	 */
	public static View getTargetView(IEditCommandRequest request) {
		return (View) request.getParameter(TARGET_VIEW_ID);
	}
}
