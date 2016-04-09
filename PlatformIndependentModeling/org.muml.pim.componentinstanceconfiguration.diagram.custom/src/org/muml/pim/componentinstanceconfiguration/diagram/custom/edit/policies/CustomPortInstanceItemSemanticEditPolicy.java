package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.policies;

import org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.DiscreteSinglePortInstanceItemSemanticEditPolicy;

/**
 * A customized PortInstanceItemSemanticEditPolicy. We create our customized
 * Delegation and Assembly-CreateCommands here.
 * 
 * @author bingo
 * 
 */

//TODO: reactivate


public class CustomPortInstanceItemSemanticEditPolicy extends
		DiscreteSinglePortInstanceItemSemanticEditPolicy {
//
//	
//	
//	// TODO: Can we forbid deleting the view element.
//	/**
//	 * Deleting a PartPort also deletes the Port on Type-Layer. So we forbid
//	 * deleting this model element; instead only the view object will be
//	 * deleted.
//	 */
//	@Override
//	protected Command getDestroyElementCommand(DestroyElementRequest req) {
//		if (getParentElement(getHost()) instanceof ComponentPart) {
//			return UnexecutableCommand.INSTANCE;
//		}
//		return super.getDestroyElementCommand(req);
//	}
//
//	@Override
//	public Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
//
//		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationInstance_4006 == req
//				.getElementType()) {
//			return getGEFWrapper(getDelegationInstanceCreateCommand(req));
//		}
//		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyInstance_4005 == req
//				.getElementType()) {
//			return getGEFWrapper(getAssemblyInstanceCreateCommand(req));
//		}
//		return super.getCreateRelationshipCommand(req);
//	}
//
//	@Override
//	protected Command getReorientRelationshipCommand(
//			ReorientRelationshipRequest req) {
//		switch (getVisualID(req)) {
//		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
//			return getGEFWrapper(getDelegationInstanceReorientCommand(req));
//		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
//			return getGEFWrapper(getAssemblyInstanceReorientCommand(req));
//		}
//		return super.getReorientRelationshipCommand(req);
//	}
//
//	private CustomDelegationInstanceCreateCommand getDelegationInstanceCreateCommand(
//			CreateRelationshipRequest req) {
//
//		PortInstance sourcePortInstance = (PortInstance) req.getSource();
//		PortInstance targetPortInstance = (PortInstance) req.getTarget();
//
//		return new CustomDelegationInstanceCreateCommand(req,
//				sourcePortInstance, targetPortInstance);
//	}
//
//	/**
//	 * Creates a CustomAssemblyCreateCommand.
//	 * 
//	 * @param req
//	 * @return the CustomAssemblyCreateCommand.
//	 */
//	private CustomAssemblyInstanceCreateCommand getAssemblyInstanceCreateCommand(
//			CreateRelationshipRequest req) {
//
//		PortInstance sourcePortInstance = (PortInstance) req.getSource();
//		PortInstance targetPortInstance = (PortInstance) req.getTarget();
//
//		return new CustomAssemblyInstanceCreateCommand(req, sourcePortInstance,
//				targetPortInstance);
//	}
//
//	private CustomDelegationInstanceReorientCommand getDelegationInstanceReorientCommand(
//			ReorientRelationshipRequest req) {
//		return new CustomDelegationInstanceReorientCommand(req);
//	}
//
//	private CustomAssemblyInstanceReorientCommand getAssemblyInstanceReorientCommand(
//			ReorientRelationshipRequest req) {
//
//		return new CustomAssemblyInstanceReorientCommand(req);
//	}
//
//	/**
//	 * Retrieves the model element of the editPart's parent EditPart.
//	 * 
//	 * @param editPart
//	 *            the editPart.
//	 * @return the model element of the parent EditPart.
//	 */
//	private EObject getParentElement(EditPart editPart) {
//		
//		if(editPart.getParent() instanceof DiagramEditPart){
//			DiagramEditPart parentEditPart = (DiagramEditPart) editPart.getParent();
//			return parentEditPart.getNotationView().getElement();
//		}
//		
//		if (editPart.getParent() instanceof ShapeNodeEditPart) {
//			ShapeNodeEditPart parentEditPart = (ShapeNodeEditPart) editPart
//					.getParent();
//			return parentEditPart.getNotationView().getElement();
//		}
//		
//		return null;
//	}
//
}
