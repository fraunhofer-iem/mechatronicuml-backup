package org.muml.pm.hardware.platform.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HwplatformFactory;
import org.muml.pm.hardware.hwplatform.NetworkConnector;
import org.muml.pm.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class NetworkConnectorCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	private final HWPlatform container;

	/**
	 * @generated
	 */
	public NetworkConnectorCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		HWPlatform container = null;
		this.source = source;
		this.target = target;
		container = deduceContainer(source, target);

		if (container == null) {
			View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
			View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
			container = deduceContainerUsingViews(sourceView, targetView);
		}
		this.container = container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof ConnectorEndpoint) {
			return false;
		}
		if (target != null && false == target instanceof ConnectorEndpoint) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!HardwareBaseItemSemanticEditPolicy.getLinkConstraints().canCreateNetworkConnector_4032(getContainer(),
				getSource(), getTarget(), sourceView, targetView)) {
			String errorMessage = HardwareBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorNetworkConnector_4032(getContainer(), getSource(), getTarget(), sourceView, targetView);
			ErrorFeedbackEditPolicy.showMessage(targetView != null ? targetView : sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		NetworkConnector newElement = HwplatformFactory.eINSTANCE.createNetworkConnector();
		getContainer().getNetworkConnectors().add(newElement);
		newElement.getConnectorEndpoints().add(getSource());
		newElement.getConnectorEndpoints().add(getTarget());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	* @generated
	*/
	protected void doConfigure(NetworkConnector newElement, IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected ConnectorEndpoint getSource() {
		return (ConnectorEndpoint) source;
	}

	/**
	 * @generated
	 */
	protected ConnectorEndpoint getTarget() {
		return (ConnectorEndpoint) target;
	}

	/**
	 * @generated
	 */
	public HWPlatform getContainer() {
		return container;
	}

	/**
	 * Default approach is to traverse ancestors of the source to find instance of container.
	 * Modify with appropriate logic.
	 * @generated
	 */
	private static HWPlatform deduceContainer(EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof HWPlatform) {
				return (HWPlatform) element;
			}
		}
		return null;
	}

	/**
	 * Traverse the notation view hierarchy.
	 * 
	 * @generated
	 */
	private static HWPlatform deduceContainerUsingViews(View sourceView, View targetView) {
		for (View view = sourceView; view != null; view = (View) view.eContainer()) {
			if (view.getElement() instanceof HWPlatform) {
				return (HWPlatform) view.getElement();
			}
		}
		return null;
	}
}
