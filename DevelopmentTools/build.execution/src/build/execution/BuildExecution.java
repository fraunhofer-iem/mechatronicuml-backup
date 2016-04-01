package build.execution;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

public class BuildExecution {

	public void test() {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		try {
			root.accept(new IResourceVisitor() {

				@Override
				public boolean visit(IResource resource) throws CoreException {
					System.out.println(resource.getName());
					if (resource instanceof IWorkspaceRoot)
						return true;
					return false;
				}
			});
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workspace.build(IncrementalProjectBuilder.FULL_BUILD, progressMonitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Failed to Build");
			throw new RuntimeException("Acceleo Build / Xtend Build Failed!!!!!");
		}

		try {
			workspace.save(true, progressMonitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Failed to Save");
		}
	}

}
