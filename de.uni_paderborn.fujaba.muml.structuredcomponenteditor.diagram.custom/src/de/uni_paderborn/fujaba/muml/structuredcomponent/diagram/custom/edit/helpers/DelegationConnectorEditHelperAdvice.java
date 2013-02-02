package de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.DelegationConnector;

public class DelegationConnectorEditHelperAdvice extends
		AbstractEditHelperAdvice {

	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		return new ConfigureElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				DelegationConnector delegationConnector = (DelegationConnector) request
						.getElementToConfigure();

				// Set component part of source port, if exists
				View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy
						.getSourceView(request);
				ComponentPart sourceComponentPart = getComponentPart(sourceView);
				if (sourceComponentPart != null) {
					delegationConnector.setComponentPart(sourceComponentPart);
				}

				// Set component part of target port, if exists
				View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy
						.getTargetView(request);
				ComponentPart targetComponentPart = getComponentPart(targetView);
				if (targetComponentPart != null) {
					delegationConnector.setComponentPart(targetComponentPart);
				}

				return CommandResult.newOKCommandResult(delegationConnector);
			}

			private ComponentPart getComponentPart(View view) {
				View containerView = (View) view.eContainer();
				if (containerView.getElement() instanceof ComponentPart) {
					return (ComponentPart) containerView.getElement();
				}
				return null;
			}

		};
	}

}
