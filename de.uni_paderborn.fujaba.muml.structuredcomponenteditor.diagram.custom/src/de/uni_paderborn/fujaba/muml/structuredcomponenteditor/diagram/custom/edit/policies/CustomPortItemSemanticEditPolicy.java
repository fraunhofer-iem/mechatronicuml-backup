package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.policies;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies.DiscretePortItemSemanticEditPolicy;


//TODO: reactivate connectors (muml bug #405)

/**
 * A customized PortItemSemanticEditPolicy. We create our customized Delegation
 * and Assembly-CreateCommands here.
 * 
 * @author bingo
 * 
 */
public class CustomPortItemSemanticEditPolicy extends
		DiscretePortItemSemanticEditPolicy {
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
//		if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4003 == req
//				.getElementType()) {
//			return getGEFWrapper(getDelegationCreateCommand(req));
//		}
//		if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4004 == req
//				.getElementType()) {
//			return getGEFWrapper(getAssemblyCreateCommand(req));
//		}
//		return super.getCreateRelationshipCommand(req);
//	}
//
//	@Override
//	protected Command getReorientRelationshipCommand(
//			ReorientRelationshipRequest req) {
//		switch (getVisualID(req)) {
//		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
//			return getGEFWrapper(getDelegationReorientCommand(req));
//		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
//			return getGEFWrapper(getAssemblyReorientCommand(req));
//		}
//		return super.getReorientRelationshipCommand(req);
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	protected Command getReorientRelationshipSourceCommand(
//			ReconnectRequest request) {
//		request.getExtendedData().put("CONNECTION_EDITPART",
//				request.getConnectionEditPart());
//		return super.getReorientRelationshipSourceCommand(request);
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	protected Command getReorientRelationshipTargetCommand(
//			ReconnectRequest request) {
//		request.getExtendedData().put("CONNECTION_EDITPART",
//				request.getConnectionEditPart());
//		return super.getReorientRelationshipTargetCommand(request);
//	}
//
//	private CustomDelegationCreateCommand getDelegationCreateCommand(
//			CreateRelationshipRequest req) {
//
//		Port sourcePort = null;
//		Port targetPort = null;
//
//		if (req.getSource() instanceof Port) {
//			sourcePort = (Port) req.getSource();
//		}
//
//		if (req.getTarget() instanceof Port) {
//			targetPort = (Port) req.getTarget();
//		}
//		Object sourceEditPart = req.getParameter("SOURCE_PORT_EDITPART");
//		Object targetEditPart = req.getParameter("TARGET_PORT_EDITPART");
//
//		ComponentPart componentPart = null;
//		StructuredComponent structuredComponent = null;
//
//		List<EditPart> editParts = new LinkedList<EditPart>();
//		if (sourceEditPart instanceof EditPart) {
//			editParts.add((EditPart) sourceEditPart);
//		}
//		if (targetEditPart instanceof EditPart) {
//			editParts.add((EditPart) targetEditPart);
//		}
//
//		// Now get the parent elements
//		for (EditPart editPart : editParts) {
//			EObject parentElement = getParentElement(editPart);
//			if (parentElement instanceof StructuredComponent) {
//				structuredComponent = (StructuredComponent) parentElement;
//			} else if (parentElement instanceof ComponentPart) {
//				componentPart = (ComponentPart) parentElement;
//			}
//		}
//
//		return new CustomDelegationCreateCommand(req, sourcePort, targetPort,
//				componentPart, structuredComponent);
//	}
//
//	/**
//	 * Creates a CustomAssemblyCreateCommand.
//	 * 
//	 * @param req
//	 *            The Request, which should also contain parameters
//	 *            "SOURCE_PORT_EDITPART", "TARGET_PORT_EDITPART", if
//	 *            available.
//	 * @return the CustomAssemblyCreateCommand.
//	 */
//	private CustomAssemblyCreateCommand getAssemblyCreateCommand(
//			CreateRelationshipRequest req) {
//		ComponentPart sourceComponentPart = null;
//		ComponentPart targetComponentPart = null;
//		Port sourcePort = null;
//		Port targetPort = null;
//
//		if (req.getSource() instanceof Port) {
//			sourcePort = (Port) req.getSource();
//		}
//		if (req.getTarget() instanceof Port) {
//			targetPort = (Port) req.getTarget();
//		}
//
//		// Now get the parent elements
//		Object sourceEditPart = req.getParameter("SOURCE_PORT_EDITPART");
//		if (sourceEditPart instanceof EditPart) {
//			EObject sourceParentElement = getParentElement((EditPart) sourceEditPart);
//			if (sourceParentElement instanceof ComponentPart) {
//				sourceComponentPart = (ComponentPart) sourceParentElement;
//			}
//		}
//
//		Object targetEditPart = req.getParameter("TARGET_PORT_EDITPART");
//		if (targetEditPart instanceof EditPart) {
//			EObject targetParentElement = getParentElement((EditPart) targetEditPart);
//			if (targetParentElement instanceof ComponentPart) {
//				targetComponentPart = (ComponentPart) targetParentElement;
//			}
//		}
//
//		return new CustomAssemblyCreateCommand(req, sourcePort, targetPort,
//				sourceComponentPart, targetComponentPart);
//	}
//
//	private CustomDelegationReorientCommand getDelegationReorientCommand(
//			ReorientRelationshipRequest req) {
//
//		Object connectionEditPart = req.getParameter("CONNECTION_EDITPART");
//
//		List<EditPart> editParts = new LinkedList<EditPart>();
//
//		if (connectionEditPart instanceof DelegationEditPart) {
//			DelegationEditPart delegationEditPart = (DelegationEditPart) connectionEditPart;
//			EditPart sourceEditPart = delegationEditPart.getSource();
//			EditPart targetEditPart = delegationEditPart.getTarget();
//
//			switch (req.getDirection()) {
//			case ReorientRequest.REORIENT_SOURCE:
//				sourceEditPart = getHost();
//				break;
//			case ReorientRequest.REORIENT_TARGET:
//				targetEditPart = getHost();
//				break;
//			}
//
//			if (sourceEditPart != null) {
//				editParts.add(sourceEditPart);
//			}
//			if (targetEditPart != null) {
//				editParts.add(targetEditPart);
//			}
//		}
//
//		ComponentPart componentPart = null;
//		StructuredComponent structuredComponent = null;
//
//		// Now get the parent elements
//		for (EditPart editPart : editParts) {
//			EObject parentElement = getParentElement(editPart);
//			if (parentElement instanceof StructuredComponent) {
//				structuredComponent = (StructuredComponent) parentElement;
//			} else if (parentElement instanceof ComponentPart) {
//				componentPart = (ComponentPart) parentElement;
//			}
//		}
//		return new CustomDelegationReorientCommand(req, componentPart,
//				structuredComponent);
//	}
//
//	private CustomAssemblyReorientCommand getAssemblyReorientCommand(
//			ReorientRelationshipRequest req) {
//		ComponentPart newComponentPart = null;
//
//		EObject parentElement = getParentElement(getHost());
//		if (parentElement instanceof ComponentPart) {
//			newComponentPart = (ComponentPart) parentElement;
//		}
//
//		Assembly assembly = (Assembly) req.getRelationship();
//		ComponentPart sourceComponentPart = assembly.getFrom();
//		ComponentPart targetComponentPart = assembly.getTo();
//
//		switch (req.getDirection()) {
//		case ReorientRequest.REORIENT_SOURCE:
//			sourceComponentPart = newComponentPart;
//			break;
//		case ReorientRequest.REORIENT_TARGET:
//			targetComponentPart = newComponentPart;
//			break;
//		}
//
//		return new CustomAssemblyReorientCommand(req, sourceComponentPart,
//				targetComponentPart);
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
//		ShapeNodeEditPart parentEditPart = (ShapeNodeEditPart) editPart
//				.getParent();
//		return parentEditPart.getNotationView().getElement();
//	}

}
