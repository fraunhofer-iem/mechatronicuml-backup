package de.uni_paderborn.fujaba.muml.verification.uppaal.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.ExportUppaalModelJob;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationOptionsProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;

public class ExportUppaalModelAction extends AbstractHandler {

	private VerifiableElement verifiableElement;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		GraphicalEditPart editPart = ((GraphicalEditPart) ((IStructuredSelection) selection).getFirstElement());
		verifiableElement = (VerifiableElement) ((View) editPart.getModel()).getElement();
	
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(shell, null, true, "Select the container for the UPPAAL NTA model file.");
		dialog.open();
		Object[] result = dialog.getResult();
		if (dialog.getReturnCode() == Window.CANCEL) {
			return CommandResult.newCancelledCommandResult();
		}
		
		IPath targetPath = (IPath) result[0];
		URI targetURI = URI.createPlatformResourceURI(targetPath.append(((NamedElement) verifiableElement).getName()).addFileExtension("uppaal").toPortableString(), true);
		URI targetURIRequirements = URI.createPlatformResourceURI(targetPath.append(((NamedElement) verifiableElement).getName()).addFileExtension("requirements").toPortableString(), true);

		//Start the job
		Job job = new ExportUppaalModelJob(verifiableElement, targetURI, targetURIRequirements, new VerificationOptionsProvider() {
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
				
				//Open dialog with simple wizard for the property choice page
				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new Wizard() {
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
