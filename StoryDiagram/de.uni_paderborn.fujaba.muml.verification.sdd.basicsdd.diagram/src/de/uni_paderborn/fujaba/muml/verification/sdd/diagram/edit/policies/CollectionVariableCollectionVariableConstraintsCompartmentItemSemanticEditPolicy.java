package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CollectionVariableCollectionVariableConstraintsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CollectionVariableCollectionVariableConstraintsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Constraint_3008 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.commands.ConstraintCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
