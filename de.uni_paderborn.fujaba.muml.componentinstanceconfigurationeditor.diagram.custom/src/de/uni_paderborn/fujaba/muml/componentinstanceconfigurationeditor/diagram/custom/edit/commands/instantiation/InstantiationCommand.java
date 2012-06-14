package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands.instantiation;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

public class InstantiationCommand extends AbstractCommand {

	private ComponentInstance componentInstance;


	public InstantiationCommand(ComponentInstance componentInstance) {
		this.componentInstance = componentInstance;
	}

	@Override
	public boolean prepare() {
		return true;
	}

	@Override
	public void execute() {
		instantiate(componentInstance);	
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub

	}

	private void instantiate(EObject object) {
	}
}
