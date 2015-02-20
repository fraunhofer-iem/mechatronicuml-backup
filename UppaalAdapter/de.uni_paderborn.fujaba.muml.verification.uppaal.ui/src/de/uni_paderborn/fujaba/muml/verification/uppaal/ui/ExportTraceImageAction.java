package de.uni_paderborn.fujaba.muml.verification.uppaal.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.ExportTraceImageJob;

public class ExportTraceImageAction extends AbstractHandler {

	private VerifiableElement verifiableElement;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		GraphicalEditPart editPart = ((GraphicalEditPart) ((IStructuredSelection) selection).getFirstElement());
		
		verifiableElement = (VerifiableElement) ((View) editPart.getModel()).getElement();
		ContainerSelectionDialog containerDialog = new ContainerSelectionDialog(shell, null, true, "Select the container for the trace image file.");
		containerDialog.open();
		
		Object[] result = containerDialog.getResult();
		if (containerDialog.getReturnCode() == Window.CANCEL) {
			return CommandResult.newCancelledCommandResult();
		}
		
		UppaalVerifyForTraceProvider provider = new UppaalVerifyForTraceProvider();
		
		IPath targetPath = (IPath) result[0];
		IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(targetPath);
		Job job = new ExportTraceImageJob(verifiableElement, resource, provider, provider);
		job.addJobChangeListener(new ExportJobChangeAdapter());
		job.schedule();
												
		return CommandResult.newOKCommandResult();
	}

}
