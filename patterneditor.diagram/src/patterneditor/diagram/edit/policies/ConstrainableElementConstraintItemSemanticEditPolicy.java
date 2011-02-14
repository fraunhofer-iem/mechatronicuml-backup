package patterneditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import patterneditor.diagram.providers.PatternElementTypes;

/**
 * @generated
 */
public class ConstrainableElementConstraintItemSemanticEditPolicy extends
		PatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConstrainableElementConstraintItemSemanticEditPolicy() {
		super(PatternElementTypes.ConstrainableElementConstraint_4103);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
