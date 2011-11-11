package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands.instantiation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.muml.model.component.Assembly;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.Delegation;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.HybridPort;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstanceFactory;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

public class SetComponentTypeCommand extends AbstractCommand {

	private ComponentInstance componentInstance;
	private Component newComponentType;
	private int counter = 1;

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

	private ComponentInstance createComponentInstance(Component component) {

		ComponentInstance newInstance = InstanceFactory.eINSTANCE
				.createComponentInstance();
		newInstance.setName(componentInstance.getName() + counter++);
		newInstance.setComponentType(component);

		configureComponentInstance(newInstance, component);
		return newInstance;
	}

	private void configureComponentInstance(ComponentInstance newInstance,
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

				// create component instance configuration for the embedded
				// parts of the new instance
				newInstance.setEmbeddedCIC(InstanceFactory.eINSTANCE
						.createComponentInstanceConfiguration());

				for (ComponentPart componentPart : structuredComponent
						.getEmbeddedParts()) {
					createComponentPartInstance(newInstance, componentPart);
				}

				// instantiate the connector types
				for (ConnectorType connectorType : structuredComponent
						.getConnectors()) {
					// this list is needed for identifying later on which
					// concrete port instances needed to be connected
					// with the new generated connector instance
					List<PortInstance> portInstances = getAllDirectContainedPortInstances(newInstance);
					// have to be added because of possible delegation
					// connectors
					portInstances.addAll(newInstance.getPortInstances());

					createConnectorInstance(connectorType, portInstances,
							getLowestCardinality(connectorType));
				}
			}
		}
	}

	// computes the lowest cardinality. But the lowest cardinality of the port
	// or part should be online considered
	// if the port or port can appear multiple times.
	// if non of them is appearing multiple times we know we have to instantiate
	// the connector instance online once
	private long getLowestCardinality(ConnectorType connectorType) {

		long cardinality = -1;

		if (connectorType.getFromPort().getCardinality().getUpperBound()
				.getValue() > 1) {
			if (cardinality == -1
					|| cardinality > connectorType.getFromPort()
							.getCardinality().getLowerBound().getValue()) {
				cardinality = connectorType.getFromPort().getCardinality()
						.getLowerBound().getValue();
			}
		}

		if (connectorType.getToPort().getCardinality().getUpperBound()
				.getValue() > 1) {
			if (cardinality == -1
					|| cardinality > connectorType.getToPort().getCardinality()
							.getLowerBound().getValue()) {
				cardinality = connectorType.getToPort().getCardinality()
						.getLowerBound().getValue();
			}
		}

		ComponentPart part = getAccordingPart(
				connectorType.getParentComponent(), connectorType.getFromPort());
		if (part != null
				&& connectorType.getFromPort().getCardinality().getUpperBound()
						.getValue() <= 1) {
			if (cardinality == -1
					|| cardinality > part.getCardinality().getLowerBound()
							.getValue()) {
				cardinality = part.getCardinality().getLowerBound().getValue();
			}

		}

		part = getAccordingPart(connectorType.getParentComponent(),
				connectorType.getToPort());
		if (part != null
				&& connectorType.getToPort().getCardinality().getUpperBound()
						.getValue() <= 1) {
			if (cardinality == -1
					|| cardinality > part.getCardinality().getLowerBound()
							.getValue()) {
				cardinality = part.getCardinality().getLowerBound().getValue();
			}
		}
		if (cardinality != -1) {
			return cardinality;
		} else {
			return 1;
		}
	}

	// computes with the help of the parent component (comp) the part of the
	// port's component
	// is needed to get the cardinality of the part, to know how often the
	// connector instance needs to be instantiated
	private ComponentPart getAccordingPart(Component comp, Port port) {

		List<ComponentPart> parts = port.getComponent()
				.getReferencingComponentParts();

		for (ComponentPart part : parts) {
			if (part.getParentComponent().equals(comp)) {
				return part;
			}
		}

		return null;
	}

	// computes all ports of the embedded component instances, here is no
	// recursive call needed
	private List<PortInstance> getAllDirectContainedPortInstances(
			ComponentInstance compInstance) {
		ArrayList<PortInstance> portInstanceList = new ArrayList<PortInstance>();

		for (ComponentInstance tmpCompInstance : compInstance.getEmbeddedCIC()
				.getComponentInstances()) {
			for (PortInstance tmpPortInstance : tmpCompInstance
					.getPortInstances()) {
				portInstanceList.add(tmpPortInstance);
			}
		}

		return portInstanceList;
	}

	// for cleaning up the model
	private void destroyContents(ComponentInstance newInstance,
			CompoundCommand compoundCommand) {

		for (PortInstance portInstance : newInstance.getPortInstances()) {
			for (ConnectorInstance connectorInstance : portInstance
					.getIncomingConnectorInstances()) {
				compoundCommand.add(new ICommandProxy(
						new DestroyElementCommand(new DestroyElementRequest(
								connectorInstance, false))));
			}
			for (ConnectorInstance connectorInstance : portInstance
					.getOutgoingConnectorInstances()) {
				compoundCommand.add(new ICommandProxy(
						new DestroyElementCommand(new DestroyElementRequest(
								connectorInstance, false))));
			}
			compoundCommand.add(new ICommandProxy(new DestroyElementCommand(
					new DestroyElementRequest(portInstance, false))));
		}

		if (newInstance.getEmbeddedCIC() != null) {
			// Destroy all embedded instances...
			for (ComponentInstance componentInstance : newInstance
					.getEmbeddedCIC().getComponentInstances()) {
				destroyContents(componentInstance, compoundCommand);

				compoundCommand.add(new ICommandProxy(
						new DestroyElementCommand(new DestroyElementRequest(
								componentInstance, false))));
			}
		}
	}

	private void createComponentPartInstance(ComponentInstance parentInstance,
			ComponentPart componentPart) {

		// Find out the lowerBound of the component part's cardinality.
		long lowerBound = 0;
		Cardinality cardinality = componentPart.getCardinality();
		if (cardinality != null) {
			NaturalNumber lowerBoundNumber = cardinality.getLowerBound();
			if (lowerBoundNumber != null) {
				lowerBound = lowerBoundNumber.getValue();
			}
		}

		// Create as many component instances as the lowerBound demand.
		for (long i = 0; i < lowerBound; i++) {
			ComponentInstance newInstance = createComponentInstance(componentPart
					.getComponentType());
			parentInstance.getEmbeddedCIC().getComponentInstances()
					.add(newInstance);
		}
	}

	private List<PortInstance> createPortInstances(Port port,
			ComponentInstance componentInstance) {
		List<PortInstance> newInstances = new ArrayList<PortInstance>();

		// determine the lowerBound of the Port's Cardinality.
		long lowerBound = 0;
		Cardinality cardinality = port.getCardinality();
		if (cardinality != null) {
			NaturalNumber lowerBoundNumber = cardinality.getLowerBound();
			if (lowerBoundNumber != null) {
				lowerBound = lowerBoundNumber.getValue();
			}
		}

		// determine the upperBound of the Port's Cardinality.
		long upperBound = 0;
		if (cardinality != null) {
			NaturalNumber upperBoundNumber = cardinality.getUpperBound();
			if (upperBoundNumber != null) {
				if (upperBoundNumber.isInfinity()) {
					upperBound = 2;
				} else {
					upperBound = upperBoundNumber.getValue();
				}
			}
		}

		// Create a multi port instance in case one is needed
		DiscreteMultiPortInstance multiPortInstance = null;
		if (upperBound > 1) {
			multiPortInstance = InstanceFactory.eINSTANCE
					.createDiscreteMultiPortInstance();

			multiPortInstance.setPortType(port);
			multiPortInstance.setName(port.getName());
			multiPortInstance.setComponentInstance(componentInstance);
		}

		// Create as many PortInstances as the Port's lowerBound requires.
		for (long i = 0; i < lowerBound; i++) {
			PortInstance portInstance = createSinglePortInstance(port);
			portInstance.setPortType(port);
			portInstance.setName(port.getName() + (i + 1));
			portInstance.setComponentInstance(componentInstance);

			if (multiPortInstance != null) {
				multiPortInstance.getSubPortInstances().add(
						(DiscreteSinglePortInstance) portInstance);
			}

		}
		return newInstances;
	}

	private void createConnectorInstance(ConnectorType connectorType,
			List<PortInstance> portInstanceList, long cardinality) {

		for (int i = 0; i < cardinality; i++) {
			createConnectorInstance(connectorType, portInstanceList);
		}
	}

	private void createConnectorInstance(ConnectorType connectorType,
			List<PortInstance> portInstanceList) {
		PortInstance toPortInstance = null;
		PortInstance fromPortInstance = null;

		Port toPort = connectorType.getToPort();
		Port fromPort = connectorType.getFromPort();

		for (PortInstance portInstance : portInstanceList) {

			if (toPortInstance != null && fromPortInstance != null) {
				break;
			} else if (portInstance.getPortType() == toPort) {
				if (!isConnectorInstanceAlreadyInstanciated(connectorType,
						portInstance) && !(portInstance instanceof DiscreteMultiPortInstance)) {
					
					toPortInstance = portInstance;
				}
			} else if (portInstance.getPortType() == fromPort) {
				if (!isConnectorInstanceAlreadyInstanciated(connectorType,
						portInstance)) {
					fromPortInstance = portInstance;
				}
			}
		}

		if (toPortInstance != null && fromPortInstance != null) {
			ConnectorInstance newInstance = createConnectorInstance(connectorType);

			newInstance.setSource(fromPortInstance);
			newInstance.setTarget(toPortInstance);
			
			componentInstance.getEmbeddedCIC().getConnectorInstances().add(newInstance);
		}

	}

	// in case connector instances of the same type have to be instantiated
	// several times because of occurring cardinality
	// we need to know whether given the port instance is already connected to a
	// connector instance of the given connector type
	private boolean isConnectorInstanceAlreadyInstanciated(
			ConnectorType connectorType, PortInstance portInstance) {

		for (ConnectorInstance connectorInstance : portInstance
				.getOutgoingConnectorInstances()) {
			if (connectorInstance.getConnectorType().equals(connectorType)) {
				return true;
			}
		}

		for (ConnectorInstance connectorInstance : portInstance
				.getIncomingConnectorInstances()) {
			if (connectorInstance.getConnectorType().equals(connectorType)) {
				return true;
			}
		}

		return false;
	}

	private ConnectorInstance createConnectorInstance(
			ConnectorType connectorType) {
		ConnectorInstance connectorInstance = null;
		if (connectorType instanceof Assembly) {
			connectorInstance = InstanceFactory.eINSTANCE
					.createAssemblyInstance();
		} else if (connectorType instanceof Delegation) {
			connectorInstance = InstanceFactory.eINSTANCE
					.createDelegationInstance();
		}

		connectorInstance.setConnectorType(connectorType);

		return connectorInstance;
	}

	private PortInstance createSinglePortInstance(Port port) {
		if (port instanceof DiscretePort && !(port instanceof ContinuousPort)) {
			return InstanceFactory.eINSTANCE.createDiscreteSinglePortInstance();
		} else if (port instanceof ContinuousPort && !(port instanceof DiscretePort)) {
			return InstanceFactory.eINSTANCE.createContinuousPortInstance();
		} else if (port instanceof HybridPort) {
			return InstanceFactory.eINSTANCE.createHybridPortInstance();
		}
		return null;
	}
}
