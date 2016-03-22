package test.build;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.eclipse.core.internal.resources.WorkspaceRoot;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class BuildTest {
	
	
	
	private static File findWorkspaceLocation() {
		return new File("."); // This requires that the launch configuration
								// sets ${workspace_loc} as working directory!
	}

	@Test
	public void test() throws CoreException {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		// close the metamodel for building acceleo project
	//	IProject project = root.getProject("org.muml.modelica.adapter.m2t.transform");
		
		
		for (File directory : findWorkspaceLocation().listFiles()) {
			if (directory.isDirectory()) {
				if (Platform.getBundle(directory.getName()) != null) {
					System.out.println(directory.getAbsolutePath());
				}
			}
		}
	////	IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(  new Path(findWorkspaceLocation().getAbsolutePath()+"org.muml.modelica.adapter.m2t"+"/.project"));
	// project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
	//	project.create(description, null);
	//	project.open(null);
	//	assertTrue(project.exists());
		//project.close(progressMonitor);
		// project.close(progressMonitor);
		// project.close(progressMonitor);
		// root.getProject("org.muml.modelica.adapter.m2t.transform.edit");
		// project.close(progressMonitor);
		root.accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				System.out.println(resource.getName());
				if (resource instanceof WorkspaceRoot)
					return true;
				return false;
			}
		});

		workspace.build(IncrementalProjectBuilder.FULL_BUILD, progressMonitor);
		workspace.save(true, progressMonitor);
	}

}
