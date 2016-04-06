package build.execution;

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

public class BuildExecution {

	public static IMarker[] build() throws CoreException {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		root.accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				System.out.println(resource.getName());
				if (resource instanceof IWorkspaceRoot)
					return true;
				return false;
			}
		});

		try {
			workspace.build(IncrementalProjectBuilder.FULL_BUILD, progressMonitor);
		} catch (CoreException e) {
			workspace.build(IncrementalProjectBuilder.CLEAN_BUILD, progressMonitor);
			workspace.build(IncrementalProjectBuilder.FULL_BUILD, progressMonitor);

		}
		System.out.println("Build Progress Successfully!");

		
		IMarker[] markers = null;
		try {
			markers = root.findMarkers(AcceleoMarkerUtils.PROBLEM_MARKER_ID, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		workspace.save(true, progressMonitor);
		
		System.out.println("Save Progress Successfully!");
		
		return markers;
	}

}
