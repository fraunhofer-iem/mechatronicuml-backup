package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.GroupRequestViaKeyboard;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.CoordinationProtocolItemSemanticEditPolicy;

public class CustomConnectorQualityOfServiceAssumptionsEditPart extends
		ConnectorQualityOfServiceAssumptionsEditPart {

	public CustomConnectorQualityOfServiceAssumptionsEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		// TODO Auto-generated method stub
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicy.COMPONENT_ROLE);
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy() {
			@Override
			public Command getCommand(Request request) {
				// If the user presses the delete key, don't delete
				boolean keyboardDelete = request instanceof GroupRequestViaKeyboard
						&& RequestConstants.REQ_DELETE.equals(request.getType());
				if (request.getType() == RequestConstants.REQ_DELETE
						|| keyboardDelete) {					
					return UnexecutableCommand.INSTANCE;
				}

				return super.getCommand(request);
			}
		});
		removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CoordinationProtocolItemSemanticEditPolicy() {

			@Override
			protected Command getSemanticCommand(IEditCommandRequest request) {
				if (request instanceof DestroyRequest) {
					return null;
				}
				return super.getSemanticCommand(request);
			}
			
		});
	}

}
