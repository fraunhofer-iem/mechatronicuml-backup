package org.muml.testlanguage.diagram.custom.edit.commands;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.muml.testlanguage.Node;

public class NodeUpdatePortsCommand extends RecordingCommand {

	private Node node = null;

	private Notification notification = null;
	
	private boolean updated = false;

	public NodeUpdatePortsCommand(TransactionalEditingDomain domain) {
		super(domain, "Update Ports");
	}

	@Override
	protected void doExecute() {		
		if (notification == null)
		{
			return;
		}
		
		if (node.getSpecification().notifyChanged(notification)) {
			node.setupFromSpecification();
			this.updated = true;
		}
	}
	
	public boolean isUpdated()
	{
		return this.updated;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

}
