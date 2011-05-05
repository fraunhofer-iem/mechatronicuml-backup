package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.commands;

import java.util.LinkedList;

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
		// Clear embeddedInstances
		CompoundCommand c = new CompoundCommand();
		for (ComponentInstance embeddedInstance : componentInstance
				.getEmbeddedInstances()) {
			c.add(new ICommandProxy(new DestroyElementCommand(
					new DestroyElementRequest(embeddedInstance, false))));
		}
		c.execute();

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
					ComponentInstance newInstance = createNewComponentInstance(part);
					instances.add(newInstance);
					currentInstance.getEmbeddedInstances().add(newInstance);
				}
			}
		} while (!instances.isEmpty());
	}

	private static ComponentInstance createNewComponentInstance(
			ComponentPart part) {
		// Create a new ComponentInstance
		ComponentInstance newComponentInstance = InstanceFactory.eINSTANCE
				.createComponentInstance();

		// Copy properties from ComponentPart
		newComponentInstance.setComponentPart(part);
		newComponentInstance.setComponentType(part.getComponentType());
		newComponentInstance.setName(part.getName());

		// Instantiate all Ports
		for (Port port : part.getPortsDerived()) {
			for (long i = 0; i < getPortLowerBound(port); i++) {
				PortInstance newPortInstance = InstanceFactory.eINSTANCE
						.createPortInstance();
				newPortInstance.setPortType(port);
				newPortInstance.setComponentInstance(newComponentInstance);
			}
		}

		return newComponentInstance;
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
