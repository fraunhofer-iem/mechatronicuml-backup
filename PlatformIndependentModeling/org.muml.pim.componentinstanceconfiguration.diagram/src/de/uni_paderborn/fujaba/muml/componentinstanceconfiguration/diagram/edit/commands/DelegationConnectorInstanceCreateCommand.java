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
package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.commands;

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

/**
 * @generated
 */
public class DelegationConnectorInstanceCreateCommand extends EditElementCommand {

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
	private final de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration container;

	/**
	 * @generated
	 */
	public DelegationConnectorInstanceCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration container = null;
		this.source = source;
		this.target = target;
		container = deduceContainer(source, target);

		if (container == null) {
			View sourceView = org.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
					.getSourceView(getRequest());
			View targetView = org.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
					.getTargetView(getRequest());
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
		if (source != null
				&& false == source instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
			return false;
		}
		if (target != null
				&& false == target instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		View sourceView = org.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canCreateDelegationConnectorInstance_4002(getContainer(), getSource(),
						getTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorDelegationConnectorInstance_4002(getContainer(), getSource(),
							getTarget(), sourceView, targetView);
			org.muml.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(targetView != null ? targetView : sourceView, errorMessage);
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

		de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance newElement = de.uni_paderborn.fujaba.muml.instance.InstanceFactory.eINSTANCE
				.createDelegationConnectorInstance();
		getContainer().getPortConnectorInstances().add(newElement);
		newElement.getConnectorEndpointInstances().add(getSource());
		newElement.getConnectorEndpointInstances().add(getTarget());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	 * @generated
	 */
	protected void doConfigure(de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance newElement,
			IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
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
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance getSource() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) source;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance getTarget() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) target;
	}

	/**
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration getContainer() {
		return container;
	}

	/**
	 * Default approach is to traverse ancestors of the source to find instance of container.
	 * Modify with appropriate logic.
	 * @generated
	 */
	private static de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration deduceContainer(EObject source,
			EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration) {
				return (de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration) element;
			}
		}
		return null;
	}

	/**
	 * Traverse the notation view hierarchy.
	 * 
	 * @generated
	 */
	private static de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration deduceContainerUsingViews(
			View sourceView, View targetView) {
		for (View view = sourceView; view != null; view = (View) view.eContainer()) {
			if (view.getElement() instanceof de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration) {
				return (de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration) view.getElement();
			}
		}
		return null;
	}
}
