package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.helpers;

import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;

public class AssemblyConnectorEditHelperAdvice extends AbstractEditHelperAdvice {

// TODO: Deactivated because of ingeration of part layer into metamodel
	
//	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
//		return new ConfigureElementCommand(request) {
//
//			@Override
//			protected CommandResult doExecuteWithResult(
//					IProgressMonitor monitor, IAdaptable info)
//					throws ExecutionException {
//				AssemblyConnector assemblyConnector = (AssemblyConnector) request
//						.getElementToConfigure();
//
//				// Add component part of source port, if exists
//				View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(request);
//				ComponentPart sourceComponentPart = getComponentPart(sourceView);
//				if (sourceComponentPart != null) {
//					assemblyConnector.getComponentParts().add(sourceComponentPart);
//				}
//				
//				// Add component part of target port, if exists
//				View targetView = (View) ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(request);
//				ComponentPart targetComponentPart = getComponentPart(targetView);
//				if (targetComponentPart != null) {
//					assemblyConnector.getComponentParts().add(targetComponentPart);					
//				}
//
//				return CommandResult.newOKCommandResult(assemblyConnector);
//			}
//			
//			private ComponentPart getComponentPart(View view) {
//				View containerView = (View) view.eContainer();
//				if (containerView.getElement() instanceof ComponentPart) {
//					return (ComponentPart) containerView.getElement();
//				}
//				return null;
//			}
//
//		};
//	}

	

}
