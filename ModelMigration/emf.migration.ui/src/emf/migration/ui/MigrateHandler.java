package emf.migration.ui;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.handlers.HandlerUtil;

import emf.migration.execute.ExecutePlugin;
import emf.migration.execute.MigrationExecuter;


public class MigrateHandler extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		Job job = new Job("Migrate") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				MigrationExecuter executer = new MigrationExecuter(ExecutePlugin.getMigrators(), monitor);
				executer.execute(HandlerUtil.getCurrentSelection(event));
				monitor.done();
				return Status.OK_STATUS;
			}
		};

		// Start the Job
		job.schedule();
		
		return null;
	}
}
