// This code is mainly copied from 
// http://git.eclipse.org/c/gmf-runtime/org.eclipse.gmf-runtime.git/tree/org.eclipse.gmf.examples.runtime.ui.pde/src/org/eclipse/gmf/examples/runtime/ui/pde/internal/wizards/ProjectUnzipperNewWizard.java
// due to its weak extensibility

// Alternative to this, the implementation could be similar to
// org.eclipse.pde.internal.ui.views.plugins.ImportActionGroup
// However, the associated packages have access restrictions. So, we can't use them here directly

package org.muml.core.example.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.gmf.examples.runtime.ui.pde.internal.GmfExamplesPlugin;
import org.eclipse.gmf.examples.runtime.ui.pde.internal.GmfExamplesStatusCodes;
import org.eclipse.gmf.examples.runtime.ui.pde.internal.l10n.ResourceManager;
import org.eclipse.gmf.examples.runtime.ui.pde.internal.wizards.ProjectUnzipperNewWizard;
import org.eclipse.gmf.examples.runtime.ui.pde.util.Log;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.muml.core.example.ui.util.CopyUtil;
import org.muml.core.example.ui.util.UnzipUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class ExampleCreationWizard extends ProjectUnzipperNewWizard {

	/**
	 * Monitor string shown when creating project
	 */
	private static String KEY_CREATING_PROJECT = "monitor.creatingProject"; //$NON-NLS-1$

	/**
	 * Monitor string shown when unzipping the project
	 */
	private static String KEY_UNZIPPING_PROJECT = "monitor.unzippingProject"; //$NON-NLS-1$

	/**
	 * Monitor string shown when copying the project contents
	 */
	private static String COPYING_PROJECT = "Copying project contents"; //$NON-NLS-1$

	/**
	 * The single page provided by this base implementation. It provides all the
	 * functionality required to capture the name and location of the target
	 * project
	 */
	private WizardNewProjectCreationPage wizardNewProjectCreationPage;

	/**
	 * The name of the project creation page
	 */
	private String pageName;

	/**
	 * The title of the project creation page
	 */
	private String pageTitle;

	/**
	 * The description of the project creation page
	 */
	private String pageDescription;

	/**
	 * The name of the project in the project creation page
	 */
	private String pageProjectName;

	/**
	 * The list of files containing the project contents (directory or zip file)
	 */
	private File[] sourceExampleContentsFiles;

	/**
	 * The list of formats to be applied to the user supplied name
	 */
	private String[] nameFormats;

	/**
	 * The configuration element associated with this new project wizard
	 */
	private IConfigurationElement config;

	/**
	 * Constructor
	 */
	public ExampleCreationWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Performs the bulk of the wizard functionality: project creation, the
	 * unzip operation and classpath update
	 * 
	 * @see Wizard#performFinish
	 */
	public boolean performFinish() {

		try {
			IRunnableWithProgress operation = new WorkspaceModifyOperation() {

				public void execute(IProgressMonitor monitor)
						throws InterruptedException {
					try {
						monitor.beginTask(ResourceManager
								.getI18NString(KEY_CREATING_PROJECT), 120);

						/*
						 * Create the project folder
						 */
						IPath projectPath = wizardNewProjectCreationPage
								.getLocationPath();

						for (int i = 0; i < nameFormats.length; i++) {
							String projectName = MessageFormat.format(
									nameFormats[i],
									new Object[] { wizardNewProjectCreationPage
											.getProjectName() });
							String projectFolder = projectPath.toOSString()
									+ File.separator + projectName;
							File projectFolderFile = new File(projectFolder);

							IWorkspace workspace = ResourcesPlugin
									.getWorkspace();
							IProject project = workspace.getRoot().getProject(
									projectName);

							// If the project does not exist, we will create it
							// and populate it.
							if (!project.exists()) {
								projectFolderFile.mkdirs();
								monitor.worked(10);

								/*
								 * Copy plug-in project code
								 */
								createProjectContents(getProjectZipURL()[i],
										projectFolderFile,
										new SubProgressMonitor(monitor, 100));

								if (monitor.isCanceled()) {
									throw new InterruptedException();
								}

								if (projectPath.equals(workspace.getRoot()
										.getLocation())) {
									project.create(monitor);
								} else {
									IProjectDescription desc = workspace
											.newProjectDescription(project
													.getName());
									desc.setLocation(new Path(projectFolder));

									project.create(desc, monitor);
								}
							}

							// Now, we ensure that the project is open.
							project.open(monitor);

							renameProject(project, projectName);

							monitor.worked(10);
							if (monitor.isCanceled()) {
								throw new InterruptedException();
							}
						} // end for

					} catch (IOException e) {
						throw new RuntimeException(e);
					} catch (CoreException e) {
						throw new RuntimeException(e);
					} finally {
						monitor.done();
					}
				}
			};

			getContainer().run(false, true, operation);

			/* Set perspective */
			BasicNewProjectResourceWizard
					.updatePerspective(getConfigurationElement());

		} catch (InterruptedException e) {
			return false;

		} catch (Exception e) {

			Log.error(GmfExamplesPlugin.getDefault(),
					GmfExamplesStatusCodes.EXCEPTION_OCCURED, e.getMessage(), e);
			return false;
		}

		return true;
	}

	/**
	 * @param sourceFile
	 *            The file containing the project contents (directory or zip)
	 * @param targetProjectFolderFile
	 *            The file the project contents is copied to
	 * @param monitor
	 * @throws InterruptedException
	 * @throws IOException
	 */
	private void createProjectContents(File sourceFile,
			File targetProjectFolderFile, IProgressMonitor monitor)
			throws InterruptedException, IOException {
		if (sourceFile.isFile() && sourceFile.getPath().endsWith("zip")) {

			ZipFile zipFile = new ZipFile(sourceFile.getPath());

			try {
				monitor.beginTask(
						ResourceManager.getI18NString(KEY_UNZIPPING_PROJECT),
						zipFile.size());

				UnzipUtil.unzip(zipFile, targetProjectFolderFile, monitor);
			} finally {
				monitor.done();
			}

		}

		else if (sourceFile.isDirectory()) {
			try {
				Long space = sourceFile.getTotalSpace();

				monitor.beginTask(COPYING_PROJECT, space.intValue());

				CopyUtil.copyDirectory(sourceFile, targetProjectFolderFile,
						monitor);

			} finally {
				monitor.done();
			}

		}

		else {
			throw new IllegalArgumentException(
					"Path attribute should specify a path to a .zip file or to a folder containing the contents of the project that is to be created."
					+ "The Path has to be specified relative to its bundle/project");
		}

	}

	/**
	 * Renames the specified project to the specified name
	 * 
	 * @param project
	 *            Project to rename
	 * @param projectName
	 *            New name for the project
	 * @throws CoreException
	 */
	private void renameProject(IProject project, String projectName)
			throws CoreException {
		IProjectDescription description = project.getDescription();
		description.setName(projectName);
		project.move(description, IResource.FORCE | IResource.SHALLOW, null);
	}

	/**
	 * Creates the sole wizard page contributed by this base implementation; the
	 * standard Eclipse WizardNewProjectCreationPage.
	 * 
	 * @see WizardNewProjectCreationPage#WizardNewProjectCreationPage(String)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {

		wizardNewProjectCreationPage = new WizardNewProjectCreationPage(
				getPageName());

		wizardNewProjectCreationPage.setTitle(getPageTitle());

		wizardNewProjectCreationPage.setDescription(getPageDescription());

		wizardNewProjectCreationPage
				.setInitialProjectName(getPageProjectName());

		this.addPage(wizardNewProjectCreationPage);
	}

	/**
	 * Accessor to the pageName field
	 * 
	 * @return The pageName field value
	 */
	private String getPageName() {
		return pageName;
	}

	/**
	 * Accessor to the pageTitle field
	 * 
	 * @return The pageTitle field value
	 */
	private String getPageTitle() {
		return pageTitle;
	}

	/**
	 * Accessor to the pageDescription field
	 * 
	 * @return The pageDescription field value
	 */
	private String getPageDescription() {
		return pageDescription;
	}

	/**
	 * Accessor to the PageProjectName field
	 * 
	 * @return The PageProjectName field value
	 */
	private String getPageProjectName() {
		return pageProjectName;
	}

	/**
	 * Accessor to the ProjectZipURL field
	 * 
	 * @return The projectZipURL field value
	 */
	private File[] getProjectZipURL() {
		return sourceExampleContentsFiles;
	}

	/**
	 * Accessor to the config field
	 * 
	 * @return The config field value
	 */
	private IConfigurationElement getConfigurationElement() {
		return config;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org
	 * .eclipse.core.runtime.IConfigurationElement, java.lang.String,
	 * java.lang.Object)
	 */
	public void setInitializationData(IConfigurationElement configIn,
			String propertyName, Object data) throws CoreException {
		config = configIn;
		pageName = config.getAttribute("name"); //$NON-NLS-1$
		pageTitle = config.getAttribute("projectPageTitle"); //$NON-NLS-1$
		pageDescription = config.getAttribute("projectPageDescription"); //$NON-NLS-1$
		pageProjectName = config.getAttribute("projectName"); //$NON-NLS-1$

		List<String> nameFormatsL = new ArrayList<String>();
		List<File> files = new ArrayList<File>();

		IConfigurationElement[] exampleElements = config.getChildren("source"); //$NON-NLS-1$

		Bundle[] bundles = FrameworkUtil.getBundle(this.getClass())
				.getBundleContext().getBundles();

		for (int i = 0; i < exampleElements.length; i++) {

			String bundleName = exampleElements[i].getAttribute("bundle");//$NON-NLS-1$

			// use empty String as folderPath if the whole bundle/project
			// contents should be copied
			String path = exampleElements[i].getAttribute("path");//$NON-NLS-1$

			Bundle bundle = null;

			if (!bundleName.equals("")) {
				for (Bundle curBundle : bundles) {
					if (curBundle.getSymbolicName().equals(bundleName)) {
						bundle = curBundle;
						break;
					}
				}
			}
			if (bundle != null) {
				if (path != null) {
					URL url = FileLocator.find(bundle, new Path(path), null);//$NON-NLS-1$
					try {
						files.add(new File(FileLocator.resolve(url).getPath()));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}
			if (exampleElements[i].getAttribute("nameFormat") == null) { //$NON-NLS-1$
				nameFormatsL.add("{0}"); //$NON-NLS-1$
			} else {
				nameFormatsL.add(exampleElements[i].getAttribute("nameFormat")); //$NON-NLS-1$
			}
		}

		sourceExampleContentsFiles = new File[files.size()];
		files.toArray(sourceExampleContentsFiles);
		assert sourceExampleContentsFiles.length > 0;
		assert sourceExampleContentsFiles.length == nameFormats.length;

		nameFormats = new String[nameFormatsL.size()];
		nameFormatsL.toArray(nameFormats);
		assert nameFormats.length > 0;

	}

}