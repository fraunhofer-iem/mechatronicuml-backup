package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.commands.ConnectorInstanceReorientCommand;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

public class CustomConnectorInstanceReorientCommand extends
		ConnectorInstanceReorientCommand {
	/**
	 * The ComponentInstance of the source Port.
	 */
	private ComponentInstance sourceComponentInstance;

	/**
	 * The ComponentInstance of the target Port.
	 */
	private ComponentInstance targetComponentInstance;

	/**
	 * Constructs this CustomConnectorInstanceReorientCommand.
	 * 
	 * @param request
	 *            The ReorientRelationshipRequest.
	 * @param sourceComponentInstance
	 *            The ComponentInstance of the source Port.
	 * @param targetComponentInstance
	 *            The ComponentInstance of the target Port.
	 */
	public CustomConnectorInstanceReorientCommand(
			ReorientRelationshipRequest request,
			ComponentInstance sourceComponentInstance,
			ComponentInstance targetComponentInstance) {
		super(request);
		this.sourceComponentInstance = sourceComponentInstance;
		this.targetComponentInstance = targetComponentInstance;
	}

	/**
	 * Checks if this ConnectorInstance is allowed to be reoriented.
	 */
	@Override
	public boolean canExecute() {

		if (getNewSource() == null || getNewTarget() == null) {
			return false;
		}

		// Make sure, both sourceComponentInstance and
		// targetComponentInstance are set.
		if (sourceComponentInstance == null || targetComponentInstance == null) {
			return false;
		}

		return super.canExecute();
	}

	/**
	 * Customized to additionally set the new references to ComponentInstances.
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		// Set the new references to ComponentInstances.
		getLink().setFromComponentI(sourceComponentInstance);
		getLink().setToComponentI(targetComponentInstance);
		
		// Call super implementation, which sets the new Port to use.
		return super.doExecuteWithResult(monitor, info);
	}
}
