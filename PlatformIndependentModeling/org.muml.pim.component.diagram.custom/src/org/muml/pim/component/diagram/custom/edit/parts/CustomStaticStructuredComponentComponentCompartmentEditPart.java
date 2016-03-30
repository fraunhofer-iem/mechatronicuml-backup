package org.muml.pim.component.diagram.custom.edit.parts;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart;
import org.muml.pim.component.diagram.edit.policies.StaticStructuredComponentComponentCompartmentItemSemanticEditPolicy;

/**
 * A custom CompartmentEditPart for a StructuredComponent. It prevents deletion
 * of the whole Compartment area.
 * 
 * @author bingo
 * 
 */
public class CustomStaticStructuredComponentComponentCompartmentEditPart extends
		StaticStructuredComponentComponentCompartmentEditPart {

	public CustomStaticStructuredComponentComponentCompartmentEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new StaticStructuredComponentComponentCompartmentItemSemanticEditPolicy() {
					protected Command getSemanticCommand(
							IEditCommandRequest request) {
						if (request instanceof DestroyRequest) {
							return null;
						}
						return super.getSemanticCommand(request);
					}

				});

	}
}
