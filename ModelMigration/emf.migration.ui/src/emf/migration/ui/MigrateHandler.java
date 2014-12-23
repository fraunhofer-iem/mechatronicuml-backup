package emf.migration.ui;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;

import emf.migration.execute.ExecutePlugin;
import emf.migration.execute.MigrationExecuter;


public class MigrateHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		MigrationExecuter executer = new MigrationExecuter(ExecutePlugin.getMigrators());
		executer.execute(HandlerUtil.getCurrentSelection(event));
		return null;
	}
}
