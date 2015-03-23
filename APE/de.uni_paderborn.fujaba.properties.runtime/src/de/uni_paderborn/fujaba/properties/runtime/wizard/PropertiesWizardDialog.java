package de.uni_paderborn.fujaba.properties.runtime.wizard;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

public class PropertiesWizardDialog extends WizardDialog {
	private EditingDomain editingDomain;
	private ChangeCommand changeCommand;

	public PropertiesWizardDialog(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
	}
	@Override
	public boolean close() {
		if (getReturnCode() == CANCEL) {
			//editingDomain.getCommandStack().undo();
			changeCommand.undo();
		}
		editingDomain = null;
		return super.close();
	}
	@Override
	public int open() {
		return super.open();
	}

	public void openWithUndo(EditingDomain editingDomain, Notifier notifier) {
		this.editingDomain = editingDomain;
		changeCommand = new ChangeCommand(notifier) {
			@Override
			protected void doExecute() {
				// MUML #734
				// Disable block on open, so that Eclipse can process UI events (necessary for starting jobs)
				setBlockOnOpen(false);

				// Open the wizard
				open();
			}
		};
		changeCommand.setLabel("Modify Properties");
		editingDomain.getCommandStack().execute(changeCommand);
	}
}
