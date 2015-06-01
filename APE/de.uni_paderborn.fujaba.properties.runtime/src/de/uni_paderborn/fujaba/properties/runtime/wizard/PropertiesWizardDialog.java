package de.uni_paderborn.fujaba.properties.runtime.wizard;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;

public class PropertiesWizardDialog extends WizardDialog implements CommandStackListener {

	// Minimum dialog width (in dialog units)
	private static final int MIN_DIALOG_WIDTH = 350;

	// Minimum dialog height (in dialog units)
	private static final int MIN_DIALOG_HEIGHT = 400;
	
	private EditingDomain editingDomain;
	private List<org.eclipse.emf.common.command.Command> commands = new ArrayList<org.eclipse.emf.common.command.Command>();

	public PropertiesWizardDialog(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
	}
	@Override
	public boolean close() {

		if (editingDomain != null) {
			editingDomain.getCommandStack().removeCommandStackListener(this);
			if (getReturnCode() == CANCEL) {
				org.eclipse.emf.common.command.Command undoCommand = editingDomain.getCommandStack().getUndoCommand();
				while (editingDomain.getCommandStack().canUndo() && commands.contains(undoCommand)) {
					editingDomain.getCommandStack().undo();
					if (undoCommand == editingDomain.getCommandStack().getUndoCommand()) {
						break;
					}
					undoCommand = editingDomain.getCommandStack().getUndoCommand();
				}
			}
			commands.clear();
			editingDomain = null;
		}
		return super.close();
	}

	public void openWithUndo(EditingDomain editingDomain, Notifier notifier) {
		commands.clear();
		this.editingDomain = editingDomain;
		editingDomain.getCommandStack().addCommandStackListener(this);
		setBlockOnOpen(false);
		open();
	}
	
	@Override
	public void commandStackChanged(EventObject event) {
		commands.add(editingDomain.getCommandStack().getUndoCommand());
	}
	
	@Override
	protected Point getInitialSize() {
		Point shellSize = super.getInitialSize();
		return new Point(Math.max(
				convertHorizontalDLUsToPixels(MIN_DIALOG_WIDTH), shellSize.x),
				Math.max(convertVerticalDLUsToPixels(MIN_DIALOG_HEIGHT),
						shellSize.y));
	}
}
