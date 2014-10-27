package pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pattern.diagram.edit.commands.CoordinationPattern2CreateCommand;
import pattern.diagram.providers.Pattern2ElementTypes;

/**
 * @generated
 */
public class CoordinationPatternPatternCompartment2ItemSemanticEditPolicy
		extends Pattern2BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CoordinationPatternPatternCompartment2ItemSemanticEditPolicy() {
		super(Pattern2ElementTypes.CoordinationPattern_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Pattern2ElementTypes.CoordinationPattern_3001 == req
				.getElementType()) {
			return getGEFWrapper(new CoordinationPattern2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
