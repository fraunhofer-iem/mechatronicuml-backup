package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.edit.helper;

import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
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
		if (command != null) {
			compositeCommand.add(command);
		}

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
					INewWizard wizard = new PlatformInstanceWizard(hwplatformInstance,hwplatformInstanceConfig, editingDomain);
					wizard.init(PlatformUI.getWorkbench(), null);
					// Open wizard dialog
					WizardDialog dialog = new WizardDialog(
							PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
					dialog.open();

				}

				return CommandResult.newOKCommandResult(hwplatformInstance);
			}

		};
		compositeCommand.add(cmd);

		return compositeCommand;
	}

}
