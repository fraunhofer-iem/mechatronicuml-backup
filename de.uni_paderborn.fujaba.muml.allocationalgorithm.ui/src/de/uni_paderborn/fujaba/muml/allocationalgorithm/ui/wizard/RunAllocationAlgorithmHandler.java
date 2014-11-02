package de.uni_paderborn.fujaba.muml.allocationalgorithm.ui.wizard;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.wizards.IWizardDescriptor;

public class RunAllocationAlgorithmHandler extends AbstractHandler {
	public static final String ALLOCATION_ALGORITHM_WIZARD_ID = "de.uni_paderborn.fujaba.muml.allocationalgorithm.ui.AllocationAlgorithmWizard";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		IStructuredSelection structuredSelection = ((IStructuredSelection) selection);
		// collect all StaticStructureComponents from the selection

		IWizardDescriptor descriptor = PlatformUI.getWorkbench()
				.getNewWizardRegistry().findWizard(ALLOCATION_ALGORITHM_WIZARD_ID);
		// Or maybe an export wizard
		if (descriptor == null) {
			descriptor = PlatformUI.getWorkbench().getExportWizardRegistry()
					.findWizard(ALLOCATION_ALGORITHM_WIZARD_ID);
		}
		try {
			// Then if we have a wizard, open it.
			if (descriptor != null) {
				IWizard wizard = descriptor.createWizard();
				if (wizard instanceof AllocationAlgorithmWizard) {
					((AllocationAlgorithmWizard) wizard).init(null,
							structuredSelection);
				}
				WizardDialog wd = new WizardDialog(
						HandlerUtil.getActiveShell(event), wizard);
				wd.setTitle(wizard.getWindowTitle());
				wd.open();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return null;
	}

}
