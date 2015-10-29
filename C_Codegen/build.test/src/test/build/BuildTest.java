package test.build;

import static org.junit.Assert.fail;

import org.eclipse.core.internal.resources.WorkspaceRoot;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Test;

public class BuildTest {

	@Test
	public void test() throws CoreException {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		root.accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				System.out.println(resource.getName());
				if(resource instanceof WorkspaceRoot)
				return true;
			return false;
			}
		});
		workspace.build(IncrementalProjectBuilder.FULL_BUILD, progressMonitor);
		workspace.save(true, progressMonitor);
		// IProject project =
		// root.getProject("de.uni_paderborn.fujaba.muml.codegen.c");
		// project.create(progressMonitor);
		// try {
		// project.open(progressMonitor);
		// // project.build(IncrementalProjectBuilder.CLEAN_BUILD,
		// progressMonitor);
		// workspace.build(IncrementalProjectBuilder.FULL_BUILD,
		// progressMonitor);
		// IFolder folder = project.getFolder("bin");
		// folder.accept();
		// workspace.save(true, progressMonitor);
		// } catch (CoreException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

}
