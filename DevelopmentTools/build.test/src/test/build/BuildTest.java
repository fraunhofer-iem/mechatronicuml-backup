package test.build;

import static org.junit.Assert.fail;

import org.eclipse.acceleo.internal.ide.ui.builders.AcceleoMarkerUtils;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaModelMarker;
import org.junit.Test;

public class BuildTest {

	@Test
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
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			workspace.build(IncrementalProjectBuilder.FULL_BUILD, progressMonitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			fail("build failed!!!!!!!!");
			e.printStackTrace();
		}
		

		
		IMarker[] markers=null;
		try {
			markers=root.findMarkers(AcceleoMarkerUtils.PROBLEM_MARKER_ID,
				            true, IResource.DEPTH_INFINITE);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(markers!=null && markers.length>0){
			fail("compilation problem");

		}
		
		try {
			workspace.save(true, progressMonitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	


	
}
