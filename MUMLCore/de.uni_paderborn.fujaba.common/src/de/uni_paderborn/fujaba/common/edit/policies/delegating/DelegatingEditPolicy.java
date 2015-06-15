package de.uni_paderborn.fujaba.common.edit.policies.delegating;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;

public abstract class DelegatingEditPolicy extends AbstractEditPolicy {

	protected EditPolicy target;

	public void setTarget(EditPolicy target) {
		this.target = target;
	}
	
	public EditPolicy getTarget() {
		return target;
	}
	
	public void activate() {
		target.activate();
	}

	public void deactivate() {
		target.deactivate();
	}

	public void eraseSourceFeedback(Request request) {
		target.eraseSourceFeedback(request);
	}

	public void eraseTargetFeedback(Request request) {
		target.eraseTargetFeedback(request);
	}

	public Command getCommand(Request request) {
		return target.getCommand(request);
	}

	public EditPart getHost() {
		return target.getHost();
	}

	public EditPart getTargetEditPart(Request request) {
		return target.getTargetEditPart(request);
	}

	public void setHost(EditPart editpart) {
		target.setHost(editpart);
	}

	public void showSourceFeedback(Request request) {
		target.showSourceFeedback(request);
	}

	public void showTargetFeedback(Request request) {
		target.showTargetFeedback(request);
	}

	public boolean understandsRequest(Request request) {
		return target.understandsRequest(request);
	}
}
