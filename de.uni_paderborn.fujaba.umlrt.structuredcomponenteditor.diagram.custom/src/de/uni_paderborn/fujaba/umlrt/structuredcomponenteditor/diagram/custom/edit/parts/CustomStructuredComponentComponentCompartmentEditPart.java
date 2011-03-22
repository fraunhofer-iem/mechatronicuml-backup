package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies.StructuredComponentComponentCompartmentItemSemanticEditPolicy;

/**
 * A custom CompartmentEditPart for a StructuredComponent. It prevents deletion
 * of the whole Compartment area.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredComponentComponentCompartmentEditPart extends
		StructuredComponentComponentCompartmentEditPart {

	public CustomStructuredComponentComponentCompartmentEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new StructuredComponentComponentCompartmentItemSemanticEditPolicy() {
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
