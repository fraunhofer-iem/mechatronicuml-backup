package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.commands;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.InstanceFactory;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;

public class UpdateComponentInstanceChildrenCommand extends AbstractCommand {

	private ComponentInstance componentInstance;
	private Component newComponentType;

	public UpdateComponentInstanceChildrenCommand(
			ComponentInstance componentInstance, Component newComponentType) {
		this.componentInstance = componentInstance;
		this.newComponentType = newComponentType;
	}

	@Override
	public boolean prepare() {
		return true;
	}

	@Override
	public void execute() {
		CompoundCommand c;
		
		// Destroy all embeddedInstances
		c = new CompoundCommand();
		for (ComponentInstance embeddedInstance : componentInstance
				.getEmbeddedInstances()) {
			c.add(new ICommandProxy(new DestroyElementCommand(
					new DestroyElementRequest(embeddedInstance, false))));
		}
		c.execute();
		
		// Destroy all PortInstances
		c = new CompoundCommand();
		for (PortInstance portInstances : componentInstance.getPortInstances()) {
			for (ConnectorInstance connectorInstance : portInstances.getIncomingConnectorInstances()) {
				c.add(new ICommandProxy(new DestroyElementCommand(
						new DestroyElementRequest(connectorInstance, false))));
			}
			for (ConnectorInstance connectorInstance : portInstances.getOutgoingConnectorInstances()) {
				c.add(new ICommandProxy(new DestroyElementCommand(
						new DestroyElementRequest(connectorInstance, false))));
			}
			c.add(new ICommandProxy(new DestroyElementCommand(
					new DestroyElementRequest(portInstances, false))));
		}
		c.execute();

		// Initialize top level component instance.
		componentInstance.setName(componentInstance.getComponentNameDerived());
		if (componentInstance.getComponentType() != null) {
			instantiatePorts(componentInstance, componentInstance.getComponentType().getPorts());
		}

		// Add new embeddedInstances
		LinkedList<ComponentInstance> instances = new LinkedList<ComponentInstance>();
		ComponentInstance currentInstance = componentInstance;
		Component component;
		boolean first = true;
		do {
			if (first) {
				currentInstance = componentInstance;
				component = newComponentType;
				first = false;
			} else {
				currentInstance = instances.pop();
				component = currentInstance.getComponentType();
			}
			if (component instanceof StructuredComponent) {
				StructuredComponent structured = (StructuredComponent) component;
				for (ComponentPart part : structured.getEmbeddedParts()) {
					// Create a new ComponentInstance
					ComponentInstance newInstance= InstanceFactory.eINSTANCE
							.createComponentInstance();

					// Copy properties from ComponentPart
					newInstance.setComponentPart(part);
					newInstance.setComponentType(part.getComponentType());
					newInstance.setName(part.getName());
					instantiatePorts(newInstance, part.getPortsDerived());
					
					// Add to embeddedInstances
					currentInstance.getEmbeddedInstances().add(newInstance);
					
					// Put it into the queue of instances.
					instances.add(newInstance);
				}
			}
		} while (!instances.isEmpty());
	}
	
	private static void instantiatePorts(ComponentInstance instance, List<Port> ports) {

		for (Port port : ports) {
			for (long i = 0; i < getPortLowerBound(port); i++) {
				PortInstance newPortInstance = InstanceFactory.eINSTANCE
						.createPortInstance();
				newPortInstance.setPortType(port);
				newPortInstance.setComponentInstance(instance);
				

			}
			//FIXME
			// instantiate connectorInstances for each PortType
			// (but there can be multiple PortInstances per PortType!!)
		}
	}

	private static long getPortLowerBound(Port port) {
		Cardinality cardinality = port.getCardinality();
		if (cardinality != null) {
			NaturalNumber lowerBoundNumber = cardinality.getLowerBound();
			if (lowerBoundNumber != null) {
				return lowerBoundNumber.getValue();
			}
		}
		return 0;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub

	}

}
