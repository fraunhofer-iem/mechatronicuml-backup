package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class AssemblyInstanceItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AssemblyInstanceItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers.MumlinstanceElementTypes.AssemblyInstance_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
