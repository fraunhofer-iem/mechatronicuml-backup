package org.muml.uppaal.adapter.ui;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.uppaal.adapter.job.Muml2TraceImageJob;
import org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin;

public class ExportTraceImageAction extends AbstractUppaalAction {

	@Override
	public Object executeJobSpecific(ExecutionEvent event, Shell shell, ISelection selection,
			EditingDomain editingDomain) {
		if (verifiableElement instanceof AbstractCoordinationPattern)
			verifiableElement = convertAbstractCoordinationPatternToCoordinationProtocol(event);

		IResource resource = null;
		if (!UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation()) {
			ContainerSelectionDialog containerDialog = new ContainerSelectionDialog(shell, null, true,
					"Select the container for the trace image file.");
			Object[] result = containerDialog.getResult();
			if (containerDialog.getReturnCode() == Window.CANCEL) {
				return CommandResult.newCancelledCommandResult();
			}

			IPath targetPath = (IPath) result[0];
			resource = ResourcesPlugin.getWorkspace().getRoot().findMember(targetPath);
			containerDialog.open();
		}

		UppaalVerifyForTraceProvider provider = new UppaalVerifyForTraceProvider();

		Job job = new Muml2TraceImageJob(verifiableElement, resource, provider, provider);
		job.addJobChangeListener(new ExportJobChangeAdapter());
		job.schedule();

		return CommandResult.newOKCommandResult();
	}

}
