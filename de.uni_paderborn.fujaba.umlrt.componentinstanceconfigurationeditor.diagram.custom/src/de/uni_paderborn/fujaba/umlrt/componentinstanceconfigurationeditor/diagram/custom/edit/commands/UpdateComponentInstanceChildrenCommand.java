package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.commands;

import java.util.LinkedList;

import org.eclipse.emf.common.command.AbstractCommand;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.InstanceFactory;

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
		componentInstance.getEmbeddedInstances().clear();

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
					ComponentInstance newInstance = InstanceFactory.eINSTANCE
							.createComponentInstance();
					newInstance.setComponentPart(part);
					newInstance.setComponentType(part.getComponentType());
					newInstance.setName(part.getName());
					instances.add(newInstance);
					currentInstance.getEmbeddedInstances().add(newInstance);
				}
			}
		} while (!instances.isEmpty());
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
