package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;

public class AssemblyConnectorEditHelperAdvice extends AbstractEditHelperAdvice {

	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		return new ConfigureElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				AssemblyConnector assemblyConnector = (AssemblyConnector) request
						.getElementToConfigure();

				// Add component part of source port, if exists
				GraphicalEditPart sourceEditPart = (GraphicalEditPart) ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceEditPartFor(request);
				ComponentPart sourceComponentPart = getComponentPart(sourceEditPart);
				if (sourceComponentPart != null) {
					assemblyConnector.getComponentParts().add(sourceComponentPart);
				}
				
				// Add component part of target port, if exists
				GraphicalEditPart targetEditPart = (GraphicalEditPart) ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetEditPartFor(request);
				ComponentPart targetComponentPart = getComponentPart(targetEditPart);
				if (targetComponentPart != null) {
					assemblyConnector.getComponentParts().add(targetComponentPart);					
				}

				return CommandResult.newOKCommandResult(assemblyConnector);
			}
			
			private ComponentPart getComponentPart(GraphicalEditPart portEditPart) {
				View containerView = (View) portEditPart.getNotationView().eContainer();
				if (containerView.getElement() instanceof ComponentPart) {
					return (ComponentPart) containerView.getElement();
				}
				return null;
			}

		};
	}

	

}
