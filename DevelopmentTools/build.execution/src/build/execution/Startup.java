package build.execution;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import java.lang.reflect.InvocationTargetException;

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

				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Done: Build in Eclipse");
				if (markers != null && markers.length > 0) {
					exitCode = 1;
				}
				if(exitCode==0){
					System.out.println("Build Progress Successfully!");

				}
				else{
					System.out.println("Build Progress Failed!");

				}
				workbench.close();
				System.exit(exitCode);

			}
		});
	}

}
