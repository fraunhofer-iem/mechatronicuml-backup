package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.policies.ComponentInstanceComponentCompartmentItemSemanticEditPolicy;

/**
 * @generated
 */
public class CustomComponentInstanceComponentCompartmentItemSemanticEditPolicy
		extends
		ComponentInstanceComponentCompartmentItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_3003 == req
				.getElementType()) {
			return UnexecutableCommand.INSTANCE;
		}
		return super.getCreateCommand(req);
	}
	
	protected Command getSemanticCommand(
			IEditCommandRequest request) {
		if (request instanceof DestroyRequest) {
			return null;
		}
		return super.getSemanticCommand(request);
	}


}
