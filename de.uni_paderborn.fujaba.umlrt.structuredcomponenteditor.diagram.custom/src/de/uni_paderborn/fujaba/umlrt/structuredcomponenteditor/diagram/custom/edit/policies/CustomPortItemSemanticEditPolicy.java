package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies.PortItemSemanticEditPolicy;

/**
 * A customized PortItemSemanticEditPolicy. We create our customized Delegation
 * and Assembly-CreateCommands here.
 * 
 * @author bingo
 * 
 */
public class CustomPortItemSemanticEditPolicy extends
		PortItemSemanticEditPolicy {

	/**
	 * We delegate all logic that is common between
	 * CustomPortItemSemanticEditPolicy and CustomPort2ItemSemanticEditPolicy.
	 */
	private CustomPortItemSemanticDelegation delegation;

	/**
	 * Activates this EditPolicy. We create the CustomPortItemSemanticDelegation
	 * instance to delegate logic.
	 */
	@Override
	public void activate() {
		super.activate();
		delegation = new CustomPortItemSemanticDelegation();
	}

	/**
	 * Deactivates this EditPolicy.
	 */
	@Override
	public void deactivate() {
		super.deactivate();
		delegation = null;
	}

	/**
	 * Delegates to the CustomPortItemSemanticDelegation.
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (delegation != null) {
			EditElementCommand command = delegation
					.getCreateRelationshipCommand(req, getHost());
			if (command != null) {
				return getGEFWrapper(command);
			}
		}
		return super.getCreateRelationshipCommand(req);
	}

}
