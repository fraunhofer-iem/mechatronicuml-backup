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
package org.muml.pim.realtimestatechart.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class StateItemSemanticEditPolicy
		extends org.muml.pim.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateItemSemanticEditPolicy() {
		super(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.State_3032);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.EntryPoint_3040 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.realtimestatechart.diagram.edit.commands.EntryPointCreateCommand(
							req));
		}
		if (org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ExitPoint_3041 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.realtimestatechart.diagram.edit.commands.ExitPointCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
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
			if (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(
					incomingLink) == org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(
					outgoingLink) == org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getVisualID(node)) {
			case org.muml.pim.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(
							incomingLink) == org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(
							outgoingLink) == org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}

				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false)));
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));

				break;
			case org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(
							incomingLink) == org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(
							outgoingLink) == org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}

				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false)));
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));

				break;
			case org.muml.pim.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
							.getVisualID(cnode)) {
					case org.muml.pim.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:

						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false)));
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));

						break;
					case org.muml.pim.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:

						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false)));
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));

						break;
					case org.muml.pim.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:

						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false)));
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));

						break;
					}
				}
				break;
			case org.muml.pim.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
							.getVisualID(cnode)) {
					case org.muml.pim.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:

						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false)));
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));

						break;
					}
				}
				break;
			case org.muml.pim.realtimestatechart.diagram.edit.parts.StateChannelCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
							.getVisualID(cnode)) {
					case org.muml.pim.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:

						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false)));
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));

						break;
					}
				}
				break;
			case org.muml.pim.realtimestatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
							.getVisualID(cnode)) {
					case org.muml.pim.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:

						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false)));
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));

						break;
					}
				}
				break;
			}
		}
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
		if (org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.realtimestatechart.diagram.edit.commands.TransitionCreateCommand(
							req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.realtimestatechart.diagram.edit.commands.TransitionCreateCommand(
							req, req.getSource(), req.getTarget()));
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
		case org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getGEFWrapper(
					new org.muml.pim.realtimestatechart.diagram.edit.commands.TransitionReorientCommand(
							req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
