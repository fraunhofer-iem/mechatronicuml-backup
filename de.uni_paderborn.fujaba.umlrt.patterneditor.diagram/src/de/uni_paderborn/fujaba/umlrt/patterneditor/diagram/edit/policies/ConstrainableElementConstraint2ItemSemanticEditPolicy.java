package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ConstrainableElementConstraint2ItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.policies.PatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConstrainableElementConstraint2ItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
