package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.edit.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard.PatternVerificationWizard;

/**
 * 
 * @author sthiele2
 * PatternVerificationHandler handles the verification of pattern. There are three steps necessary for the execution:
 * 1. select a legal configuration for the pattern. 
 * 2. transform the pattern to a protocol
 * 3. run the uppaal protocol verification on the protocol created in step 2
 *
 */
public class PatternVerificationHandler extends AbstractHandler  {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
		Shell shell = HandlerUtil.getActiveShell(event);
		

		// get and process current selection
		IStructuredSelection selection = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		

	
		
		// Create and initialize wizard
		IWorkbenchWizard wizard = new PatternVerificationWizard();		
		wizard.init(workbenchWindow.getWorkbench(), selection);
		
		// Open dialog
		WizardDialog wizardDialog = new WizardDialog(shell, wizard);
		wizardDialog.open();
		
		
		
		
		
		return null;
	}

}
