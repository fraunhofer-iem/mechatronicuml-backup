package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.commands.ConnectorInstanceCreateCommand;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

/**
 * A customized ConnectorInstanceCreateCommand. We make sure, an assembly may be
 * created between both ports. The created element is then configured to get
 * references for both ComponentInstances and the StructuredComponent.
 * 
 * @author bingo
 * 
 */
public class CustomConnectorInstanceCreateCommand extends
		ConnectorInstanceCreateCommand {

	/**
	 * The ComponentInstance of the source port.
	 */
	private ComponentInstance sourceComponentInstance;

	/**
	 * The ComponentInstance of the target port.
	 */
	private ComponentInstance targetComponentInstance;

	/**
	 * Constructs this CustomConnectorInstanceCreateCommand.
	 * 
	 * @param request
	 *            The CreateRelationshipRequest.
	 * @param source
	 *            The source port element.
	 * @param target
	 *            The target port element.
	 * @param sourceComponentInstance
	 *            The ComponentInstance of the source Port.
	 * @param targetComponentInstance
	 *            The ComponentInstance of the target Port.
	 */
	public CustomConnectorInstanceCreateCommand(
			CreateRelationshipRequest request, Port source, Port target,
			ComponentInstance sourceComponentInstance,
			ComponentInstance targetComponentInstance) {
		super(request, source, target);
		this.sourceComponentInstance = sourceComponentInstance;
		this.targetComponentInstance = targetComponentInstance;
	}

	/**
	 * Checks if this ConnectorInstance is allowed to be created.
	 */
	@Override
	public boolean canExecute() {
		// We add checks that are only performed, when both source and target
		// are set.
		if (getSource() != null && getTarget() != null) {
			// Make sure, both sourceComponentInstance and
			// targetComponentInstance are set.
			if (sourceComponentInstance == null
					|| targetComponentInstance == null) {
				return false;
			}
		}

		return super.canExecute();
	}

	/**
	 * Configure the newly created ConnectorInstance to additionally have
	 * references to both ComponentInstances.
	 */
	protected void doConfigure(
			de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		// Set both ComponentInstances.
		newElement.setFromComponentI(sourceComponentInstance);
		newElement.setToComponentI(targetComponentInstance);
		
		// Call super implementation, which sets both Ports.
		super.doConfigure(newElement, monitor, info);
	}

	@Override
	protected de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration deduceContainer() {
		if (sourceComponentInstance != null
				&& sourceComponentInstance.eContainer() instanceof ComponentInstanceConfiguration) {
			return (ComponentInstanceConfiguration) sourceComponentInstance
					.eContainer();
		}
		return null;
	}

}
