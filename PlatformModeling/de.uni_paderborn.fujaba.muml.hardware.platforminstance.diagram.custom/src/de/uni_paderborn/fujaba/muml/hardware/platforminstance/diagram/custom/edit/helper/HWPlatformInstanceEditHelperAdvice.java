package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.edit.helper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.PlatformUI;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard.PlatformInstanceWizard;

public class HWPlatformInstanceEditHelperAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		ICompositeCommand compositeCommand = new CompositeCommand("Test");
		ICommand command = super.getAfterConfigureCommand(request);
		
		ConfigureElementCommand cmd = new ConfigureElementCommand(request) {
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				
				
				
				HWPlatformInstance hwplatformInstance = (HWPlatformInstance) request.getElementToConfigure();
				TransactionalEditingDomain editingDomain = getEditingDomain();
				if (editingDomain != null) {
				
					HWPlatformInstanceConfiguration hwplatformInstanceConfig = (HWPlatformInstanceConfiguration) hwplatformInstance
							.getParentHPIC();

					// Create wizard
					INewWizard wizard = new PlatformInstanceWizard(hwplatformInstance, hwplatformInstanceConfig,
							editingDomain);
					wizard.init(PlatformUI.getWorkbench(), null);
					// Open wizard dialog
					WizardDialog dialog = new WizardDialog(
							PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
					if (dialog.open() == Window.CANCEL) {

						return CommandResult.newCancelledCommandResult();
					}

				}
				return CommandResult.newOKCommandResult(hwplatformInstance);
			}

		};
		compositeCommand.add(cmd);
		if (command != null) {
			compositeCommand.add(command);
		}

		return compositeCommand;
	}

}
