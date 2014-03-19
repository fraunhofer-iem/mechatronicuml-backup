package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies;

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

/**
 * @generated
 */
public class HWPortPartItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPortPartItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortPart_3015);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(outgoingLink) == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(outgoingLink) == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortPartConnectedMediaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
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
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.Delegation_4001 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.DelegationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortPartConnectedMedia_4007 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.HWPortPartConnectedMediaCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.Delegation_4001 == req
				.getElementType()) {
			return null;
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortPartConnectedMedia_4007 == req
				.getElementType()) {
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
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.DelegationReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortPartConnectedMediaEditPart.VISUAL_ID:
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.HWPortPartConnectedMediaReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
