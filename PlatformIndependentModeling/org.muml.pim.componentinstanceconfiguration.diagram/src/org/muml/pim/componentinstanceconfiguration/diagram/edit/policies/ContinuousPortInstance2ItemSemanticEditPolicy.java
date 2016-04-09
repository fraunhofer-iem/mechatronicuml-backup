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
package org.muml.pim.componentinstanceconfiguration.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
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
import org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.AssemblyConnectorInstanceCreateCommand;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.AssemblyConnectorInstanceReorientCommand;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.CoordinationProtocolInstancePortInstancesCreateCommand;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.CoordinationProtocolInstancePortInstancesReorientCommand;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.DelegationConnectorInstanceCreateCommand;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.DelegationConnectorInstanceReorientCommand;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class ContinuousPortInstance2ItemSemanticEditPolicy extends MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContinuousPortInstance2ItemSemanticEditPolicy() {
		super(MumlElementTypes.ContinuousPortInstance_3034);
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
			if (MumlVisualIDRegistry.getVisualID(incomingLink) == AssemblyConnectorInstanceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MumlVisualIDRegistry.getVisualID(incomingLink) == DelegationConnectorInstanceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MumlVisualIDRegistry
					.getVisualID(incomingLink) == CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MumlVisualIDRegistry.getVisualID(outgoingLink) == AssemblyConnectorInstanceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MumlVisualIDRegistry.getVisualID(outgoingLink) == DelegationConnectorInstanceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
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
		if (MumlElementTypes.AssemblyConnectorInstance_4001 == req.getElementType()) {
			return getGEFWrapper(new AssemblyConnectorInstanceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MumlElementTypes.DelegationConnectorInstance_4002 == req.getElementType()) {
			return getGEFWrapper(new DelegationConnectorInstanceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MumlElementTypes.CoordinationProtocolInstancePortInstances_4003 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MumlElementTypes.AssemblyConnectorInstance_4001 == req.getElementType()) {
			return getGEFWrapper(new AssemblyConnectorInstanceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MumlElementTypes.DelegationConnectorInstance_4002 == req.getElementType()) {
			return getGEFWrapper(new DelegationConnectorInstanceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MumlElementTypes.CoordinationProtocolInstancePortInstances_4003 == req.getElementType()) {
			return getGEFWrapper(
					new CoordinationProtocolInstancePortInstancesCreateCommand(req, req.getSource(), req.getTarget()));
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
		case AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getGEFWrapper(new AssemblyConnectorInstanceReorientCommand(req));
		case DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getGEFWrapper(new DelegationConnectorInstanceReorientCommand(req));
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
		case CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID:
			return getGEFWrapper(new CoordinationProtocolInstancePortInstancesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
