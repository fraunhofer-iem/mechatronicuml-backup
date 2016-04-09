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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands.AssemblyVariableCreateCommand;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands.AssemblyVariableReorientCommand;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands.DelegationVariableCreateCommand;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands.DelegationVariableReorientCommand;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands.MultiPortOrderConstraintCreateCommand;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands.MultiPortOrderConstraintReorientCommand;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes;

/**
 * @generated
 */
public class SinglePortVariableItemSemanticEditPolicy extends ComponentSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SinglePortVariableItemSemanticEditPolicy() {
		super(ComponentSDDElementTypes.SinglePortVariable_3005);
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
			if (ComponentSDDVisualIDRegistry.getVisualID(incomingLink) == AssemblyVariableEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ComponentSDDVisualIDRegistry.getVisualID(incomingLink) == DelegationVariableEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ComponentSDDVisualIDRegistry.getVisualID(incomingLink) == MultiPortOrderConstraintEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ComponentSDDVisualIDRegistry.getVisualID(outgoingLink) == AssemblyVariableEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ComponentSDDVisualIDRegistry.getVisualID(outgoingLink) == DelegationVariableEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ComponentSDDVisualIDRegistry.getVisualID(outgoingLink) == MultiPortOrderConstraintEditPart.VISUAL_ID) {
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
		if (ComponentSDDElementTypes.AssemblyVariable_4002 == req.getElementType()) {
			return getGEFWrapper(new AssemblyVariableCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentSDDElementTypes.DelegationVariable_4003 == req.getElementType()) {
			return getGEFWrapper(new DelegationVariableCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentSDDElementTypes.MultiPortOrderConstraint_4004 == req.getElementType()) {
			return getGEFWrapper(new MultiPortOrderConstraintCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ComponentSDDElementTypes.AssemblyVariable_4002 == req.getElementType()) {
			return getGEFWrapper(new AssemblyVariableCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentSDDElementTypes.DelegationVariable_4003 == req.getElementType()) {
			return getGEFWrapper(new DelegationVariableCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentSDDElementTypes.MultiPortOrderConstraint_4004 == req.getElementType()) {
			return getGEFWrapper(new MultiPortOrderConstraintCreateCommand(req, req.getSource(), req.getTarget()));
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
		case AssemblyVariableEditPart.VISUAL_ID:
			return getGEFWrapper(new AssemblyVariableReorientCommand(req));
		case DelegationVariableEditPart.VISUAL_ID:
			return getGEFWrapper(new DelegationVariableReorientCommand(req));
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getGEFWrapper(new MultiPortOrderConstraintReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
