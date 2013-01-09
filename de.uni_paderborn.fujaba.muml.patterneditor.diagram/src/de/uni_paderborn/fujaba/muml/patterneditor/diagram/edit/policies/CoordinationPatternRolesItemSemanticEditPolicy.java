package de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class CoordinationPatternRolesItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CoordinationPatternRolesItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.RoleConnector_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
