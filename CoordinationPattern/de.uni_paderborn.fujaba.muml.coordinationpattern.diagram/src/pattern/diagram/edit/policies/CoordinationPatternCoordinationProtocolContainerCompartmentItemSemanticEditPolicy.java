package pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pattern.diagram.edit.commands.CoordinationPattern2CreateCommand;
import pattern.diagram.edit.commands.RoleCreateCommand;
import pattern.diagram.providers.Pattern2ElementTypes;

/**
 * @generated
 */
public class CoordinationPatternCoordinationProtocolContainerCompartmentItemSemanticEditPolicy
		extends Pattern2BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CoordinationPatternCoordinationProtocolContainerCompartmentItemSemanticEditPolicy() {
		super(Pattern2ElementTypes.CoordinationPattern_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Pattern2ElementTypes.CoordinationPattern_3001 == req
				.getElementType()) {
			return getGEFWrapper(new CoordinationPattern2CreateCommand(req));
		}
		if (Pattern2ElementTypes.Role_3002 == req.getElementType()) {
			return getGEFWrapper(new RoleCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
