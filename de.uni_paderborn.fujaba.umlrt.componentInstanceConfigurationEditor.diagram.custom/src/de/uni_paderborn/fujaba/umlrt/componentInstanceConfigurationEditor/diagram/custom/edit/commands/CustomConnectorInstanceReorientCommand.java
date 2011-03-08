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
	private ComponentInstance sourceComponentInstance;
	private ComponentInstance targetComponentInstance;

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
		if (sourceComponentInstance == null
				|| targetComponentInstance == null) {
			return false;
		}

		return super.canExecute();
	}
	

	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		getLink().setFromComponentI(sourceComponentInstance);
		getLink().setToComponentI(targetComponentInstance);
		return super.doExecuteWithResult(monitor, info);
	}
}
