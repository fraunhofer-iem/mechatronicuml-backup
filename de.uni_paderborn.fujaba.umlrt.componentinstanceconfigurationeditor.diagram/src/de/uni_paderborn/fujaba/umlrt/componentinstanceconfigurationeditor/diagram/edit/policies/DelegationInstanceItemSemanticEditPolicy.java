package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class DelegationInstanceItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DelegationInstanceItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers.MumlinstanceElementTypes.DelegationInstance_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
