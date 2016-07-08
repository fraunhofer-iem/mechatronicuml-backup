package build.execution;

import java.lang.reflect.InvocationTargetException;

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
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.GlobalBuildAction;

public class BuildExecution {

	public static IMarker[] build() throws CoreException, InvocationTargetException, InterruptedException {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		root.refreshLocal(IWorkspaceRoot.DEPTH_INFINITE, progressMonitor);
		root.accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				System.out.println(resource.getName());
				if (resource instanceof IWorkspaceRoot)
					return true;
				return false;
			}
		});

		
		GlobalBuildAction build = new GlobalBuildAction(PlatformUI.getWorkbench().getActiveWorkbenchWindow(),
				IncrementalProjectBuilder.FULL_BUILD);
        build.doBuild();
//		try {
//			workspace.build(IncrementalProjectBuilder.FULL_BUILD, progressMonitor);
//		} catch (CoreException e) {
//			workspace.build(IncrementalProjectBuilder.CLEAN_BUILD, progressMonitor);
//			workspace.build(IncrementalProjectBuilder.FULL_BUILD, progressMonitor);
//			e.printStackTrace(System.out);
//		}
		System.out.println("Build Progress Successfully!");

		IMarker[] markers = null;
		try {
			markers = root.findMarkers(AcceleoMarkerUtils.PROBLEM_MARKER_ID, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		SaveJob job = new SaveJob("Save Workspace");

		IStatus stat = job.run(progressMonitor);
		job.join();
		if (stat.isOK()) {
			System.out.println("Save Progress Successfully!");
		} else {
			System.err.println("Saving Workspace Failed with" + stat.getMessage());
		}
		return markers;
	}

	public static class SaveJob extends Job {

		public SaveJob(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			monitor.beginTask("Save Workspace", 1);
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IStatus status = null;
			try {
				status = workspace.save(true, monitor);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			monitor.worked(1);
			monitor.done();
			return status;
		}

	}

}
