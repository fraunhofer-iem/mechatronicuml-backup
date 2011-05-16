package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.commands.instantiation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;

public class SetComponentTypeCommand extends AbstractCommand {

	private ComponentInstance componentInstance;
	private Component newComponentType;

	public SetComponentTypeCommand(ComponentInstance componentInstance,
			Component newComponentType) {
		this.componentInstance = componentInstance;
		this.newComponentType = newComponentType;
	}

	@Override
	public boolean prepare() {
		return true;
	}

	@Override
	public void execute() {
		configureComponentInstance(componentInstance, newComponentType);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub

	}

	public ComponentInstance createComponentInstance(Component component) {
		ComponentInstance newInstance = component.createInstance();
		configureComponentInstance(newInstance, component);
		return newInstance;
	}

	public void configureComponentInstance(ComponentInstance newInstance,
			Component component) {
		
		CompoundCommand compoundCommand = new CompoundCommand();
		destroyContents(newInstance, compoundCommand);
		compoundCommand.execute();

		newInstance.setComponentType(component);

		if (component != null) {

			// instantiate new port instances
			for (Port port : component.getPorts()) {
				newInstance.getPortInstances().addAll(
						createPortInstances(port, newInstance));
			}

			// instantiate component parts
			if (component instanceof StructuredComponent) {
				StructuredComponent structuredComponent = (StructuredComponent) component;
				for (ComponentPart componentPart : structuredComponent
						.getEmbeddedParts()) {
					ComponentInstance partInstance = createComponentPartInstance(componentPart);
					newInstance.getEmbeddedInstances().add(partInstance);
				}
			}
		}
	}

	private void destroyContents(ComponentInstance newInstance, CompoundCommand compoundCommand) {
		
		for (PortInstance portInstance : newInstance.getPortInstances()) {
			for (ConnectorInstance connectorInstance : portInstance.getIncomingConnectorInstances()) {
				compoundCommand.add(new ICommandProxy(new DestroyElementCommand(
						new DestroyElementRequest(connectorInstance, false))));
			}
			for (ConnectorInstance connectorInstance : portInstance.getOutgoingConnectorInstances()) {
				compoundCommand.add(new ICommandProxy(new DestroyElementCommand(
						new DestroyElementRequest(connectorInstance, false))));
			}
			compoundCommand.add(new ICommandProxy(new DestroyElementCommand(
					new DestroyElementRequest(portInstance, false))));
		}
			
//		for (ConnectorInstance connectorInstance : newInstance.getConnectorInstances()) {
//			compoundCommand.add(new ICommandProxy(new DestroyElementCommand(
//					new DestroyElementRequest(connectorInstance, false))));
//		}

		// Destroy all embedded instances...
		for (ComponentInstance componentInstance : newInstance
				.getEmbeddedInstances()) {
			destroyContents(componentInstance, compoundCommand);
			 
			compoundCommand.add(new ICommandProxy(new DestroyElementCommand(
					new DestroyElementRequest(componentInstance, false))));
		}
	
	
	}

	public ComponentInstance createComponentPartInstance(
			ComponentPart componentPart) {
		ComponentInstance newInstance = createComponentInstance(componentPart
				.getComponentType());
		newInstance.setComponentPart(componentPart);
		return newInstance;
	}

	public List<PortInstance> createPortInstances(Port port,
			ComponentInstance componentInstance) {
		List<PortInstance> newInstances = new ArrayList<PortInstance>();
		long lowerBound = 0;
		Cardinality cardinality = port.getCardinality();
		if (cardinality != null) {
			NaturalNumber lowerBoundNumber = cardinality.getLowerBound();
			if (lowerBoundNumber != null) {
				lowerBound = lowerBoundNumber.getValue();
			}
		}

		for (long i = 0; i < lowerBound; i++) {
			PortInstance newPortInstance = port.createInstance();
			newPortInstance.setComponentInstance(componentInstance);
			for (ConnectorType connectorType : port.getIncomingConnectors()) {
				Port fromPort = connectorType.getFromPort();
				for (PortInstance fromInstance : fromPort.getPortInstances()) {
					if (fromInstance.getComponentInstance() == componentInstance) {
						ConnectorInstance newInstance = connectorType
								.createInstance();
						newInstance.setSource(fromInstance);
						newInstance.setTarget(newPortInstance);
						newInstance
								.setParentComponentInstance(componentInstance);
					}
				}
			}
			for (ConnectorType connectorType : port.getOutgoingConnectors()) {
				Port toPort = connectorType.getToPort();
				for (PortInstance toInstance : toPort.getPortInstances()) {
					if (toInstance.getComponentInstance() == componentInstance) {
						ConnectorInstance newInstance = connectorType
								.createInstance();
						newInstance.setSource(newPortInstance);
						newInstance.setTarget(toInstance);
						newInstance
								.setParentComponentInstance(componentInstance);
					}
				}
			}
		}
		return newInstances;
	}
}
