package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.helpers;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.ToggleCanonicalModeCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyDependentsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.muml.pim.componentinstanceconfiguration.diagram.custom.part.Activator;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;

public class AssemblyConnectorInstanceEditHelperAdvice extends
		AbstractEditHelperAdvice {
	private ComponentInstanceConfiguration parentCIC = null;

	@Override
	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		ICompositeCommand compositeCommand = new CompositeCommand("Test");
		ICommand command = super.getAfterConfigureCommand(request);
		if (command != null) {
			compositeCommand.add(command);
		}

		ConfigureElementCommand cmd = new ConfigureElementCommand(request) {
			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				AssemblyConnectorInstance connectorInstance = (AssemblyConnectorInstance) request
						.getElementToConfigure();
				EditingDomain editingDomain = getEditingDomain();
				if (editingDomain != null) {
					ComponentInstanceConfiguration cic = (ComponentInstanceConfiguration) connectorInstance
							.eContainer();
					Activator.updateCoordinationProtocolInstance(editingDomain,
							cic);

				}

				return CommandResult.newOKCommandResult(connectorInstance);
			}

		};
		compositeCommand.add(cmd);

		return compositeCommand;
	}

	@Override
	protected ICommand getBeforeDestroyElementCommand(
			final DestroyElementRequest request) {
		AssemblyConnectorInstance connectorInstance = (AssemblyConnectorInstance) request
				.getElementToDestroy();
		parentCIC = (ComponentInstanceConfiguration) connectorInstance
				.eContainer();
		return null;
	}

	@Override
	protected ICommand getAfterDestroyElementCommand(
			final DestroyElementRequest request) {
		return new DestroyElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				AssemblyConnectorInstance connectorInstance = (AssemblyConnectorInstance) request
						.getElementToDestroy();

				EditingDomain editingDomain = getEditingDomain();
				if (editingDomain != null) {
					if (parentCIC != null) {
						Activator.updateCoordinationProtocolInstance(
								editingDomain, parentCIC);
					}

				}

				return CommandResult.newOKCommandResult(connectorInstance);
			}
		};
	}

}
