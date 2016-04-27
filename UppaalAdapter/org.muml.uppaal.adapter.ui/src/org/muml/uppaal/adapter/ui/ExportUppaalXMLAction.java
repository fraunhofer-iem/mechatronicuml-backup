package org.muml.uppaal.adapter.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;
import org.muml.uppaal.adapter.job.Muml2UppaalXMLJob;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.options.Options;

public class ExportUppaalXMLAction extends AbstractUppaalAction {

	@Override
	public Object executeJobSpecific(ExecutionEvent event, Shell shell, ISelection selection,
			EditingDomain editingDomain) {
		if(verifiableElement instanceof AbstractCoordinationPattern)
			verifiableElement = convertAbstractCoordinationPatternToCoordinationProtocol(event);
		
		
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(shell, null, true,
				"Select the container for the UPPAAL XML file.");
		dialog.open();
		Object[] result = dialog.getResult();
		if (dialog.getReturnCode() == Window.CANCEL) {
			return CommandResult.newCancelledCommandResult();
		}

		IPath targetPath = (IPath) result[0];
		IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(targetPath);

		// Start the job
		Job job = new Muml2UppaalXMLJob(verifiableElement, resource, new VerificationOptionsProvider() {
			OptionsWizardPage optionsPage = null;
			WizardDialog dialog = null;

			@Override
			public boolean prepareOptionsProvider(VerifiableElement element) {
				List<String> hideOptions = new ArrayList<String>();
				if (verifiableElement instanceof CoordinationProtocol) {
					boolean isMulti = false;
					for (Role role : ((CoordinationProtocol) verifiableElement).getRoles())
						isMulti |= role.isMulti();
					if (!isMulti)
						hideOptions.add("roleMultiplicity");
				}
				hideOptions.add("hashTableSize");
				hideOptions.add("stateSpaceReduction");
				hideOptions.add("traceOptions");
				optionsPage = new OptionsWizardPage(verifiableElement, hideOptions);

				// Open dialog with simple wizard for the property choice page
				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
								new Wizard() {
							@Override
							public boolean performFinish() {
								return true;
							}

							@Override
							public void addPages() {
								addPage(optionsPage);
							}
						});
						dialog.open();
					}
				});

				return dialog.getReturnCode() != Window.CANCEL;
			}

			@Override
			public Options getOptions() {
				return optionsPage.getOptions();
			}
		});
		job.addJobChangeListener(new ExportJobChangeAdapter());
		job.schedule();

		return CommandResult.newOKCommandResult();
	}

}
