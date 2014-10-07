package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class LinkPartReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public LinkPartReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint && newEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint)) {
			return false;
		}
		if (getLink().getConnectorEndpoints().size() != 1) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint target = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) getLink()
				.getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform container = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistLinkPart_4029(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint && newEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint)) {
			return false;
		}
		if (getLink().getConnectorEndpoints().size() != 1) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint source = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) getLink()
				.getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform container = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistLinkPart_4029(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getConnectorEndpoints().remove(getOldSource());
		getLink().getConnectorEndpoints().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getConnectorEndpoints().remove(getOldTarget());
		getLink().getConnectorEndpoints().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart getLink() {
		return (de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint getOldSource() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint getNewSource() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) newEnd;
	}
}
