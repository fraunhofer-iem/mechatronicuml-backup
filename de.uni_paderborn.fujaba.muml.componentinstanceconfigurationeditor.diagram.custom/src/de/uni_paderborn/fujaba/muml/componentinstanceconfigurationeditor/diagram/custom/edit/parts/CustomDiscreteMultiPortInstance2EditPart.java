package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.parts.DiscreteMultiPortInstanceBehavior;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.policies.CustomPortGraphicalNodeEditPolicy;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.policies.CustomPortInstanceItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart;

/**
 * A customized PortEditPart. It is responsible for ports around
 * ComponentInstances and ComponentParts.
 * 
 * @author bingo
 * 
 */
public class CustomDiscreteMultiPortInstance2EditPart extends DiscreteMultiPortInstance2EditPart {

	/**
	 * All behavior is delegated, to reduce duplicate code.
	 */
	private DiscreteMultiPortInstanceBehavior delegation;


	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomDiscreteMultiPortInstance2EditPart(View view) {
		super(view);

	}

	/**
	 * Gets the PortBehavior object or lazily creates it. It will never return
	 * null.
	 * 
	 * @return The PortBehavior object.
	 */
	private DiscreteMultiPortInstanceBehavior getDelegation() {
		if (delegation == null) {
			delegation = new DiscreteMultiPortInstanceBehavior(this);
		}
		return delegation;
	}

	/**
	 * Updates the visual representation of this Port according to model
	 * changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		getDelegation().handleNotificationEvent(notification);
		super.handleNotificationEvent(notification);
	}

	/**
	 * Initializes this EditPart, when it is activated.
	 */
	@Override
	public void activate() {
		getDelegation().activate();
		super.activate();
	}

	/**
	 * Cleanup this EditPart.
	 */
	@Override
	public void deactivate() {
		getDelegation().deactivate();
		super.deactivate();
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new CustomPortGraphicalNodeEditPolicy());

		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CustomPortInstanceItemSemanticEditPolicy());

	}

}
