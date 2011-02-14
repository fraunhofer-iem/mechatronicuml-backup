package patterneditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import patterneditor.diagram.providers.PatternElementTypes;

/**
 * @generated
 */
public class RoleConnectorItemSemanticEditPolicy extends
		PatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoleConnectorItemSemanticEditPolicy() {
		super(PatternElementTypes.RoleConnector_4101);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
