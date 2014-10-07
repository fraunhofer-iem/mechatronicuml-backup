package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ObjectVariableObjectVariableAttributeAssignmentsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ObjectVariableObjectVariableAttributeAssignmentsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.AttributeAssignment_3007 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.commands.AttributeAssignmentCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
