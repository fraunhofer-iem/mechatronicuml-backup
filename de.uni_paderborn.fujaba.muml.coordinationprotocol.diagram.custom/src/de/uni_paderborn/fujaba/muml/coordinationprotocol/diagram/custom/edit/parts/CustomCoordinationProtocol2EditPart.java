package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.geometry.Dimension;
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
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.CoordinationProtocolItemSemanticEditPolicy;

/**
 * A custom EditPart; we replace the NodeFigure here.
 * 
 * @author bingo
 * 
 */
public class CustomCoordinationProtocol2EditPart extends
		CoordinationProtocol2EditPart {

	public CustomCoordinationProtocol2EditPart(View view) {
		super(view);
	}

	/**
	 * Customized the CoordinationProtocol NodeFigure to have an EllipseAnchor.
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			@Override
			public ConnectionAnchor createDefaultAnchor() {
				return new EllipseAnchor(this);
			}
		};
		result.setMinimumSize(new Dimension(0, 0));
		return result;
	}

	@Override
	protected void createDefaultEditPolicies() {
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
