package test.build;

import org.eclipse.core.internal.resources.WorkspaceRoot;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Test;

public class BuildTest {

	@Test
	public void test() throws CoreException {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject("org.muml.graphviz");
		project.close(progressMonitor);
		project = root.getProject("org.muml.graphviz.edit");
		project.close(progressMonitor);
		
		project = root.getProject("org.muml.graphviz.dot.xtext");
		project.close(progressMonitor);
		
		project = root.getProject("org.muml.graphviz.dot.xtext.ui");
		project.close(progressMonitor);
		
		
		project = root.getProject("org.muml.graphviz.plain.xtext");
		project.close(progressMonitor);
		
		
		project = root.getProject("org.muml.graphviz.plain.xtext.ui");
		project.close(progressMonitor);
		
		
		project = root.getProject("org.muml.graphviz.plain.xtext.tests");
		project.close(progressMonitor);
		
		project = root.getProject("org.muml.graphviz.dot.xtext.tests");
		project.close(progressMonitor);
		

		project = root.getProject("org.muml.graphviz.blackbox");
		project.close(progressMonitor);
		
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
		root.refreshLocal(IResource.DEPTH_INFINITE, progressMonitor);
		workspace.save(true, progressMonitor);
	}

}
