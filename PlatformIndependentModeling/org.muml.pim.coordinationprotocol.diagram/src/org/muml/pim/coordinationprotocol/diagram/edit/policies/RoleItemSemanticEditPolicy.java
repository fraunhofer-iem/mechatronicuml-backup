/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.coordinationprotocol.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.coordinationprotocol.diagram.edit.commands.AbstractCoordinationSpecificationRolesCreateCommand;
import org.muml.pim.coordinationprotocol.diagram.edit.commands.AbstractCoordinationSpecificationRolesReorientCommand;
import org.muml.pim.coordinationprotocol.diagram.edit.commands.DiscreteInteractionEndpointReceiverMessageBufferCreateCommand;
import org.muml.pim.coordinationprotocol.diagram.edit.commands.DiscreteInteractionEndpointReceiverMessageBufferReorientCommand;
import org.muml.pim.coordinationprotocol.diagram.edit.commands.RoleConnectorCreateCommand;
import org.muml.pim.coordinationprotocol.diagram.edit.commands.RoleConnectorReorientCommand;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart;
import org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class RoleItemSemanticEditPolicy extends MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoleItemSemanticEditPolicy() {
		super(MumlElementTypes.Role_3006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (MumlVisualIDRegistry
					.getVisualID(incomingLink) == AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MumlVisualIDRegistry.getVisualID(incomingLink) == RoleConnectorEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MumlVisualIDRegistry.getVisualID(outgoingLink) == RoleConnectorEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MumlVisualIDRegistry
					.getVisualID(outgoingLink) == DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MumlElementTypes.AbstractCoordinationSpecificationRoles_4007 == req.getElementType()) {
			return null;
		}
		if (MumlElementTypes.RoleConnector_4006 == req.getElementType()) {
			return getGEFWrapper(new RoleConnectorCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4008 == req.getElementType()) {
			return getGEFWrapper(new DiscreteInteractionEndpointReceiverMessageBufferCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MumlElementTypes.AbstractCoordinationSpecificationRoles_4007 == req.getElementType()) {
			return getGEFWrapper(
					new AbstractCoordinationSpecificationRolesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MumlElementTypes.RoleConnector_4006 == req.getElementType()) {
			return getGEFWrapper(new RoleConnectorCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4008 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RoleConnectorEditPart.VISUAL_ID:
			return getGEFWrapper(new RoleConnectorReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
			return getGEFWrapper(new AbstractCoordinationSpecificationRolesReorientCommand(req));
		case DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
			return getGEFWrapper(new DiscreteInteractionEndpointReceiverMessageBufferReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
