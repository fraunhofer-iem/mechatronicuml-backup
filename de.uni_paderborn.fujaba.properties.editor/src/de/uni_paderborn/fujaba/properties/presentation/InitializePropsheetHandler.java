package de.uni_paderborn.fujaba.properties.presentation;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class InitializePropsheetHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		PropertiesModelWizard wizard = new PropertiesModelWizard();
		
		ISelection sel = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection ssel = new StructuredSelection();
		if (sel instanceof IStructuredSelection) {
			ssel = (IStructuredSelection) sel;
		}
		
		wizard.init(PlatformUI.getWorkbench(), ssel);
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.create();
		if (wizard.canFinish()) {
			wizard.performFinish();
		} else {
			dialog.open();
		}
		return null;
	}

}

