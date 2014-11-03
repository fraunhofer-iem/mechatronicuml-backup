package pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import pattern.diagram.providers.Pattern2ElementTypes;

/**
 * @generated
 */
public class RoleCoordinationProtocolItemSemanticEditPolicy extends
		Pattern2BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoleCoordinationProtocolItemSemanticEditPolicy() {
		super(Pattern2ElementTypes.RoleCoordinationProtocol_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
