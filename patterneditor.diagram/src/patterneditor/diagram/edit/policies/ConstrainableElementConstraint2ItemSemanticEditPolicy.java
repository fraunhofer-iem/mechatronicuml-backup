package patterneditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import patterneditor.diagram.providers.PatternElementTypes;

/**
 * @generated
 */
public class ConstrainableElementConstraint2ItemSemanticEditPolicy extends
		PatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConstrainableElementConstraint2ItemSemanticEditPolicy() {
		super(PatternElementTypes.ConstrainableElementConstraint_4006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
