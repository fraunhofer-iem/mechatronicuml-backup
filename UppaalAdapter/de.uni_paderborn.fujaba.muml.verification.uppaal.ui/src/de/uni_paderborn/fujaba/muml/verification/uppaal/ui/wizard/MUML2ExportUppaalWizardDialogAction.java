package de.uni_paderborn.fujaba.muml.verification.uppaal.ui.wizard;

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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.ExportUppaalModelJob;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationOptionsProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;
import de.uni_paderborn.fujaba.muml.verification.uppaal.ui.ExportJobChangeAdapter;
import de.uni_paderborn.fujaba.muml.verification.uppaal.ui.OptionsWizardPage;

public class MUML2ExportUppaalWizardDialogAction extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get shell and workbench window
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
		Shell shell = HandlerUtil.getActiveShell(event);
		
		// Get selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection structuredSelection = null;
		if (selection instanceof IStructuredSelection) {
			structuredSelection = (IStructuredSelection) selection;
		}
		
		// Create and initialize wizard
		IWorkbenchWizard wizard = new MUML2UppaalExportWizard();
		wizard.init(workbenchWindow.getWorkbench(), structuredSelection);
		
		// Open dialog
		WizardDialog wizardDialog = new WizardDialog(shell, wizard);
		wizardDialog.open();
		
		
		return null;
		
//
//		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
//		ISelection selection = HandlerUtil.getCurrentSelection(event);
//		GraphicalEditPart editPart = ((GraphicalEditPart) ((IStructuredSelection) selection).getFirstElement());
//		final VerifiableElement verifiableElement = (VerifiableElement) ((View) editPart.getModel()).getElement();
//	
//		ContainerSelectionDialog dialog = new ContainerSelectionDialog(shell, null, true, "Select the container for the UPPAAL NTA model file.");
//		dialog.open();
//		Object[] result = dialog.getResult();
//		if (dialog.getReturnCode() == Window.CANCEL) {
//			return CommandResult.newCancelledCommandResult();
//		}
//		
//		IPath targetPath = (IPath) result[0];
//		URI targetURI = URI.createPlatformResourceURI(targetPath.append(((NamedElement) verifiableElement).getName()).addFileExtension("uppaal").toPortableString(), true);
//		URI targetURIRequirements = URI.createPlatformResourceURI(targetPath.append(((NamedElement) verifiableElement).getName()).addFileExtension("requirements").toPortableString(), true);
//
//		//Start the job
//		Job job = new ExportUppaalModelJob(verifiableElement, targetURI, targetURIRequirements, new VerificationOptionsProvider() {
//			OptionsWizardPage optionsPage = null;
//			WizardDialog dialog = null;
//			@Override
//			public boolean prepareOptionsProvider(VerifiableElement element) {
//				optionsPage = new OptionsWizardPage(verifiableElement);
//				
//				//Open dialog with simple wizard for the property choice page
//				Display.getDefault().syncExec(new Runnable() {
//					@Override
//					public void run() {
//						dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new Wizard() {
//							@Override
//							public boolean performFinish() {
//								return true;
//							}
//							@Override
//							public void addPages() {
//								addPage(optionsPage);
//							}
//						});
//						dialog.open();
//					}
//				});
//				
//				return dialog.getReturnCode() != Window.CANCEL;
//			}
//			
//			@Override
//			public Options getOptions() {
//				return optionsPage.getOptions();
//			}
//		});
//		job.addJobChangeListener(new ExportJobChangeAdapter());
//		job.schedule();
//												
//		return CommandResult.newOKCommandResult();
//
		
	}

}
