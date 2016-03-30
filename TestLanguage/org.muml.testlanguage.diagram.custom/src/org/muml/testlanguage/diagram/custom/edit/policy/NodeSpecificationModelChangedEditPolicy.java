package org.muml.testlanguage.diagram.custom.edit.policy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.TopGraphicEditPart;
import org.muml.testlanguage.Node;
import org.muml.testlanguage.diagram.custom.edit.commands.NodeUpdatePortsCommand;
import org.muml.testlanguage.diagram.custom.edit.parts.NodeEditPartOverride;
import org.muml.testlanguage.diagram.custom.providers.NodeSpecificationListenerProvider;
import org.muml.testlanguage.specification.NodeSpecification;

public class NodeSpecificationModelChangedEditPolicy extends AbstractEditPolicy
		implements NotificationListener {

	public static final String MODEL_CHANGED_ROLE = "ModelChangedRole";

	private static final String MY_SEMANTIC_NODE_SPECIFICATION_LISTENER = "MySemanticNodeSpecificationListener";

	private final String editPolicyRole;
	private final EditPolicy defaultPolicy;

	public NodeSpecificationModelChangedEditPolicy(String role,
			EditPolicy originalPolicy) {
		super();
		this.editPolicyRole = role;
		this.defaultPolicy = originalPolicy;
	}

	@Override
	public void activate() {
		super.activate();
		if (defaultPolicy != null) {
			defaultPolicy.activate();
		}

		EditPart hostEP = getHost();
		if (hostEP instanceof NodeSpecificationListenerProvider) {
			NodeSpecificationListenerProvider host = (NodeSpecificationListenerProvider) hostEP;
			NodeSpecification spec = ((Node) host.resolveSemanticElement())
					.getSpecification();
			host.installListenerFilter(MY_SEMANTIC_NODE_SPECIFICATION_LISTENER,
					this, spec);
		}
	}

	@Override
	public void deactivate() {
		EditPart hostEP = getHost();
		if (hostEP instanceof NodeSpecificationListenerProvider) {
			NodeSpecificationListenerProvider host = (NodeSpecificationListenerProvider) hostEP;
			host.uninstallListenerFilter(MY_SEMANTIC_NODE_SPECIFICATION_LISTENER);
		}
		if (defaultPolicy != null) {
			defaultPolicy.deactivate();
		}
		super.deactivate();
	}

	private EditPolicy getParentEditPolicy() {
		EditPart parentEP = getHost().getParent();
		while (parentEP != null) {
			EditPolicy editPolicy = parentEP.getEditPolicy(editPolicyRole);
			if (editPolicy != null
					&& editPolicy instanceof NotificationListener) {
				return editPolicy;
			}
			if (parentEP instanceof TopGraphicEditPart) {
				return null;
			}
			parentEP = parentEP.getParent();
		}
		return null;
	}

	public boolean updatePorts(Notification notification) {
		EditPart host = getHost();
		if (host instanceof NodeSpecificationListenerProvider) {
			return updatePorts(notification,
					(NodeSpecificationListenerProvider) host);
		}
		return false;
	}

	private boolean updatePorts(Notification notification,
			NodeSpecificationListenerProvider host) {

		Node node = (Node) host.resolveSemanticElement();

		// Issue a command to check if the node needs to be updated and do it if
		// necessary.
		TransactionalEditingDomain domain = org.eclipse.emf.transaction.util.TransactionUtil
				.getEditingDomain(node);
		NodeUpdatePortsCommand command = new NodeUpdatePortsCommand(domain);
		command.setNode(node);
		command.setNotification(notification);
		domain.getCommandStack().execute(command);
		
		// Hack to get the EditPart to refresh it's visuals. Otherwise the
		// updated node would look hideous.
		// TODO: Maybe find a nicer way to do it.
		if (command.isUpdated() && host instanceof NodeEditPartOverride) {
			NodeEditPartOverride part = (NodeEditPartOverride) host;
			part.deactivate();
			part.activate();
			part.getFigure().translate(0, 0);
		}
		return true;
	}

	@Override
	public void notifyChanged(Notification notification) {
		if (notification.getEventType() == Notification.SET) {
			updatePorts(notification);
		}

		NotificationListener parentPolicy = (NotificationListener) getParentEditPolicy();
		if (parentPolicy != null) {
			parentPolicy.notifyChanged(notification);
		}
	}
}
