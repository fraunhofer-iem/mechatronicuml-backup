package org.muml.core.siriusbrowser.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.MultiRule;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.modelingproject.AbstractRepresentationsFileJob;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.ViewpointSelector;
import org.eclipse.sirius.common.tools.api.util.EqualityHelper;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class CreateModelFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		EObject modelElement = null;

		// get package uri
		EPackage ePackage = null;
		EFactory eFactory = null;
		{
			String packageUri = event.getParameter("org.muml.core.siriusbrowser.actions.parameters.epackage");
			if (packageUri != null) {
				ePackage = EPackage.Registry.INSTANCE.getEPackage(packageUri);
				if (ePackage != null) {
					eFactory = ePackage.getEFactoryInstance();
				}
			}

		}

		// get eclass name
		EClass eClass = null;
		{
			String eClassName = event.getParameter("org.muml.core.siriusbrowser.actions.parameters.eclass");
			if (eClassName != null) {
				if (ePackage != null) {
					EClassifier eClassifier = ePackage.getEClassifier(eClassName);
					if (eClassifier instanceof EClass) {
						eClass = (EClass) eClassifier;
					}
				}
			}
		}

		// Create model element
		if (eFactory != null && eClass != null) {
			modelElement = eFactory.create(eClass);
		}

		// Make sure model element has been created
		if (modelElement == null) {
			throw new UnsupportedOperationException("Creating Model Element failed!");
		}

		// Get filename hint
		String filenameHint = "muml.xmi";
		{
			String paramFilenameHint = event.getParameter("org.muml.core.siriusbrowser.actions.parameters.filename");
			if (paramFilenameHint != null && !paramFilenameHint.isEmpty()) {
				filenameHint = paramFilenameHint;
			}
		}

		// Extract filename base and extension
		String filenameBase = "", filenameExtension = filenameHint;
		int filenameSplit = filenameHint.lastIndexOf('.');
		if (filenameSplit > 0) {
			filenameBase = filenameHint.substring(0, filenameSplit);
			filenameExtension = filenameHint.substring(filenameSplit);
		}

		// Create file in the selected folder or project
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			Object object = ((IStructuredSelection) selection).getFirstElement();
			if (object instanceof IContainer) {
				IContainer container = (IContainer) object;
				
				// Find unique filename
				IFile file = null;
				{
					int id = 1;
					do {
						file = container.getFile(new Path(filenameBase + id + filenameExtension));
						id++;
					} while (file.exists());
				}

				// Create resource that contains modelElement and save it
				ResourceSet resourceSet = new ResourceSetImpl();
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				Resource resource = resourceSet.createResource(uri, "xmi");
				resource.getContents().add(modelElement);
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				// Refresh Workspace to make sure the file is shown
				try {
					file.refreshLocal(1, new NullProgressMonitor());

				} catch (CoreException e) {
					e.printStackTrace();
				}

				// Activate viewpoints for this filename extension
				{
					String extension = "";
					if (filenameExtension.startsWith(".")) {
						extension = filenameExtension.substring(1);
					}
	
					IProject project = container.getProject();
					activateViewpoints(project, extension);
				}
			}
		}

		return null;
	}

	private void activateViewpoints(IProject project, String fileExtension) {

		Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
		if (modelingProject.some()) {

			// Load session in background job
			{
				Session existingSession = modelingProject.get().getSession();
				if (existingSession == null) {

					Option<URI> optionalMainSessionFileURI = Options.newNone();
					optionalMainSessionFileURI = modelingProject.get()
							.getMainRepresentationsFileURI(new NullProgressMonitor(), false, false);
					if (optionalMainSessionFileURI.some()) {
						ModelingProjectManager.INSTANCE
								.loadAndOpenRepresentationsFile(optionalMainSessionFileURI.get());
					}

				}
			}

			// Activate Viewpoints in background job, this one is of the same job family as
			// the previous one, so it will wait (this is good, because activating
			// viewpoints is only possible when session is already loaded).
			{
				Job job = new ActivateViewpointsJob(modelingProject.get(), fileExtension);
				job.setUser(false);
				job.setPriority(Job.SHORT);
				job.schedule();
				IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				if (activeWorkbenchWindow != null) {
					PlatformUI.getWorkbench().getProgressService().showInDialog(activeWorkbenchWindow.getShell(), job);
				}
			}

		}

	}

	/**
	 * This job activates viewpoints in a Modeling Project.
	 * 
	 * The reason that we need to do it in a job (besides that the user gets better
	 * UI feedback), is that we must wait for the ModelingProject session being
	 * loaded, which also happens asynchronously inside another job.
	 * 
	 * To make sure that the session is loaded before the viewpoints are activated,
	 * we must defer activating viewpoints until the other job is finished.
	 * 
	 * The ActivateViewpointsJob job does exactly that by being in the same job
	 * family as the session loading job (AbstractRepresentationsFileJob.FAMILY).
	 * 
	 * This way the ActivateViewpointsJob is scheduled after the session loading
	 * job.
	 * 
	 * @author ingo
	 *
	 */
	class ActivateViewpointsJob extends AbstractRepresentationsFileJob {

		public static final String JOB_LABEL = "Activating Viewpoints";

		private ModelingProject modelingProject;
		private String fileExtension;

		public ActivateViewpointsJob(ModelingProject modelingProject, String fileExtension) {
			super(JOB_LABEL);
			this.modelingProject = modelingProject;
			this.fileExtension = fileExtension;
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			setRule(MultiRule.combine(getRule(), workspace.getRuleFactory().createRule(workspace.getRoot())));
		}

		@Override
		public IStatus runInWorkspace(IProgressMonitor monitor) {
			final Session session = getSession(modelingProject);
			if (session != null) {
				session.getSemanticCrossReferencer();

				final List<Viewpoint> missingViewpoints = getMissingViewpoints(session, fileExtension);
				if (!missingViewpoints.isEmpty()) {
					TransactionalEditingDomain domain = session.getTransactionalEditingDomain();

					Command command = new ChangeCommand(domain.getResourceSet()) {
						@Override
						protected void doExecute() {
							ViewpointSelector selector = new ViewpointSelector(session);
							for (Viewpoint viewpoint : missingViewpoints) {
								selector.selectViewpoint(viewpoint, false, monitor);
							}
						}
					};
					domain.getCommandStack().execute(command);
				}
			}
			monitor.done();
			return Status.OK_STATUS;
		}

		private Session getSession(ModelingProject modelingProject2) {
			Session session = modelingProject.getSession();
			if (session != null) {
				URI sessionURI = session.getSessionResource().getURI();
				session = SessionManager.INSTANCE.getExistingSession(sessionURI);
			}
			return session;
		}

		/**
		 * Check if other jobs of this kind are running. This method must be called from
		 * UI Thread.
		 *
		 * @return true if other jobs of this kind are running.
		 */
		public boolean shouldWaitOtherJobs() {
			Job[] jobs = Job.getJobManager().find(AbstractRepresentationsFileJob.FAMILY);
			return jobs != null && jobs.length > 0;
		}

		protected List<Viewpoint> getMissingViewpoints(Session session, String fileExtension) {
			List<Viewpoint> missingViewpoints = new ArrayList<Viewpoint>();

			Collection<Viewpoint> selectedViewpoints = session.getSelectedViewpoints(false);

			for (final Viewpoint viewpoint : ViewpointSelection.getViewpoints(fileExtension)) {
				boolean selected = false;

				for (Viewpoint selectedViewpoint : selectedViewpoints) {
					if (EqualityHelper.areEquals(selectedViewpoint, viewpoint)) {
						selected = true;
						break;
					}
				}
				if (!selected) {
					missingViewpoints.add(viewpoint);
				}
			}
			return missingViewpoints;
		}

	}

}