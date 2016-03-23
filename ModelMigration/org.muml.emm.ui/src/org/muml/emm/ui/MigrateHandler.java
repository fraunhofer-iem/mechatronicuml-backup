package org.muml.emm.ui;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.emm.execute.ExecutePlugin;
import org.muml.emm.execute.MigrationExecuter;
import org.muml.emm.release.Release;
import org.muml.emm.release.ReleaseSet;


public class MigrateHandler extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		Job job = new Job("Migrate") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				MigrationExecuter executer = new MigrationExecuter(ExecutePlugin.getMigrators(), monitor);
				
				final List<Release> migratedReleases = executer.execute(HandlerUtil.getCurrentSelection(event));
				final Shell shell = HandlerUtil.getActiveShell(event);

				shell.getDisplay().asyncExec(new Runnable() {
					public void run() {
						showMessage(shell, migratedReleases);
					}
				});
				
				monitor.done();
				
				return Status.OK_STATUS;
			}

			private void showMessage(Shell shell, List<Release> migratedReleases) {
				String message = "Selected model(s) are already up-to-date.";
				if (!migratedReleases.isEmpty()) {
					StringBuffer buf = new StringBuffer();
					buf.append("Migration successful. The following migrations have been applied:\n");
					for (Release release : migratedReleases) {
						buf.append(" * ");
						buf.append(MigrationExecuter.getReleaseLabel(release));
					}
					message = buf.toString();
				}
				MessageDialog.openInformation(shell, "Migration results", message);
			}
		};

		// Start the Job
  		job.setUser(true);
		job.schedule();
		
		return null;
	}
}
