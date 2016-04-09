package org.muml.pim.pattern.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.pattern.diagram.edit.policies.DiscreteInteractionEndpointReceiverMessageBufferItemSemanticEditPolicy;

/**
 * @generated
 */
public class DiscreteInteractionEndpointReceiverMessageBufferEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4003;

	/**
	 * MUML FIX, see code comments.
	 *
	 * @generated
	 */
	@Override
	protected Collection<?> disableCanonicalFor(Request request) {

		@SuppressWarnings("unchecked")
		Collection<Object> hosts = super.disableCanonicalFor(request);

		// MUML FIX: Make sure that commands disable ALL canonical editpolicies,
		// because GMF supports adding additional commands using Edit Helpers concept,
		// which could trigger refresh of any canonical edit policy.
		// So it should be the cleanest solution to disable all canonical edit policies. 
		EditPart part = this;
		while (part != null) {
			hosts.add(part);
			part = part.getParent();
		}
		return hosts;
	}

	/**
	* @generated
	*/
	public DiscreteInteractionEndpointReceiverMessageBufferEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DiscreteInteractionEndpointReceiverMessageBufferItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new RoleMessageBufferConnectionFigureDescriptor();
	}

	/**
	* @generated
	*/
	public RoleMessageBufferConnectionFigureDescriptor getPrimaryShape() {
		return (RoleMessageBufferConnectionFigureDescriptor) getFigure();
	}

	/**
	 * @generated
	 */
	public class RoleMessageBufferConnectionFigureDescriptor extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RoleMessageBufferConnectionFigureDescriptor() {
			this.setLineStyle(Graphics.LINE_DOT);

		}

	}

}
