package org.muml.pim.component.diagram.custom.edit.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart;

public class CustomModelElementCategoryEditPart extends
		ModelElementCategoryEditPart {

	public CustomModelElementCategoryEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DiagramDragDropEditPolicy() {

					protected Command getDropCommand(ChangeBoundsRequest request) {
						for (Object editPart : request.getEditParts()) {
							View view = ((GraphicalEditPart) editPart)
									.getNotationView();
							if (view != null && view.getElement() != null) {
								EObject element = view.getElement();
								if (ComponentPackage.Literals.COMPONENT_PART
										.isSuperTypeOf(element.eClass())) {
									return null;
								}
							}
						}

						ChangeBoundsRequest req = new ChangeBoundsRequest(
								REQ_ADD);
						req.setEditParts(request.getEditParts());
						req.setMoveDelta(request.getMoveDelta());
						req.setSizeDelta(request.getSizeDelta());
						req.setLocation(request.getLocation());
						req.setResizeDirection(request.getResizeDirection());
						Command cmd = getHost().getCommand(req);
						if (cmd == null || !cmd.canExecute()) {
							return getDropObjectsCommand(castToDropObjectsRequest(request));
						}

						return cmd;
					}
				});
	}
}
