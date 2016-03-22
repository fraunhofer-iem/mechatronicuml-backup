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
	public void test()  {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject("org.muml.graphviz");
//		try {
//			project.close(progressMonitor);
//	
//		project = root.getProject("org.muml.graphviz.edit");
//		project.close(progressMonitor);
//
//		project = root.getProject("org.muml.graphviz.dot.xtext");
//		project.close(progressMonitor);
//
//		project = root.getProject("org.muml.graphviz.dot.xtext.ui");
//		project.close(progressMonitor);
//
//		project = root.getProject("org.muml.graphviz.plain.xtext");
//		project.close(progressMonitor);
//
//		project = root.getProject("org.muml.graphviz.plain.xtext.ui");
//		project.close(progressMonitor);
//
//		project = root.getProject("org.muml.graphviz.plain.xtext.tests");
//		project.close(progressMonitor);
//
//		project = root.getProject("org.muml.graphviz.dot.xtext.tests");
//		project.close(progressMonitor);
//
//		project = root.getProject("org.muml.graphviz.blackbox");
//		project.close(progressMonitor);

//		
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.err.println("Failed to close Project");
//		}
		
		try {
			root.accept(new IResourceVisitor() {

				@Override
				public boolean visit(IResource resource) throws CoreException {
					System.out.println(resource.getName());
					if (resource instanceof WorkspaceRoot)
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
		}

//		try {
//			root.accept(new IResourceVisitor() {
//
//				@Override
//				public boolean visit(IResource resource) throws CoreException {
//					if (resource instanceof WorkspaceRoot)
//						return true;
//					else if (resource instanceof IProject) {
//						((IProject) resource).open(progressMonitor);
//					}
//					return false;
//				}
//			});
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.err.println("Failed to Open");
//		}

		try {
			workspace.save(true, progressMonitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Failed to Save");
		}
	}

}
