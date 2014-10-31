package pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import pattern.diagram.providers.Pattern2ElementTypes;

/**
 * @generated
 */
public class RoleConnectorItemSemanticEditPolicy extends
		Pattern2BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoleConnectorItemSemanticEditPolicy() {
		super(Pattern2ElementTypes.RoleConnector_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
