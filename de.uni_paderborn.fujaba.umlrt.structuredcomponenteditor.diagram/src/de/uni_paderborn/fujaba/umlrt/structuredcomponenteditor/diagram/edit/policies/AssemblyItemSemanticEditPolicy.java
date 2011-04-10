package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class AssemblyItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies.StructuredcomponentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AssemblyItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.Assembly_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
