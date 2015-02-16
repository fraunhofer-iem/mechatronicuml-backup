package de.uni_paderborn.fujaba.muml.allocation.language.ui.view

import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.wizard.WizardDialog
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.handlers.HandlerUtil

class OpenEvaluationContextWizardHandler extends BaseHandler {
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event)
				.workbench
		val Shell shell = HandlerUtil.getActiveShell(event)
		val wizard = new EvaluationContextWizard()
		wizard.init(workbench, StructuredSelection.EMPTY)
		val WizardDialog wizardDialog = new WizardDialog(shell, wizard)
		wizardDialog.open
		val view = HandlerUtil.getActiveWorkbenchWindow(event).activePage.showView(viewID)
			 as AllocationSpecificationLanguageEvaluationView
		view.cic = wizard.componentInstanceConfiguration
		view.hpic = wizard.HWPlatformInstanceConfiguration
		null
	}
	
}