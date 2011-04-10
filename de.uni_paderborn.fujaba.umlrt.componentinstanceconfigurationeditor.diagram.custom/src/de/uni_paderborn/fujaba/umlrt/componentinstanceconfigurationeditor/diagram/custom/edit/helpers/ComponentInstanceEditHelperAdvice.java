package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.helpers;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.InstanceFactory;

/**
 * An EditHelperAdvice for the ComponentPart.
 * 
 * @author bingo
 * 
 */
public class ComponentInstanceEditHelperAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterSetCommand(SetRequest request) {
		// TODO Auto-generated method stub
		return super.getAfterSetCommand(request);
	}

	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {

		return new ConfigureElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				ComponentInstance instanceToConfigure = (ComponentInstance) request
						.getElementToConfigure();

				LinkedList<ComponentInstance> instances = new LinkedList<ComponentInstance>();
				instances.add(instanceToConfigure);

				while (!instances.isEmpty()) {
					ComponentInstance componentInstance = instances.pop();
					componentInstance.getPartInstances().clear();

					Component componentType = componentInstance
							.getComponentType();

					if (componentType instanceof StructuredComponent) {
						List<ComponentPart> componentParts = ((StructuredComponent) componentType)
								.getEmbeddedParts();

						for (ComponentPart componentPart : componentParts) {
							ComponentInstance partInstance = InstanceFactory.eINSTANCE.createComponentInstance();
							partInstance.setComponentType(componentPart.getComponentType());
							componentInstance.getPartInstances().add(partInstance);
							instances.add(partInstance);
						}
					}
				}

				return CommandResult.newOKCommandResult(instanceToConfigure);
			}

		};

	}
}
