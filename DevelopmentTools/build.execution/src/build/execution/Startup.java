package build.execution;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.core.resources.IMarker;

public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		final IWorkbench workbench = PlatformUI.getWorkbench();
		workbench.getDisplay().asyncExec(new Runnable() {
			public void run() {
				int exitCode = 0;
				IMarker[] markers = null;
				try {
					markers = BuildExecution.build();
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					exitCode = 1;

				}
				if (markers != null && markers.length > 0) {
					exitCode = 1;
				}
				workbench.close();
				System.exit(exitCode);

			}
		});
	}

}
