package build.execution;

import org.eclipse.ui.IStartup;

public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		// TODO Auto-generated method stub
		BuildExecution build = new BuildExecution();
		build.test();
	}

}
