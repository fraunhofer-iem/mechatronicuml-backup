package structuredcomponenteditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes;

/**
 * @generated
 */
public class DelegationItemSemanticEditPolicy extends
		StructuredcomponentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DelegationItemSemanticEditPolicy() {
		super(StructuredcomponentElementTypes.Delegation_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
