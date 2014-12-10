// This code is mainly copied from 
// http://git.eclipse.org/c/gmf-runtime/org.eclipse.gmf-runtime.git/tree/org.eclipse.gmf.examples.runtime.ui.pde/src/org/eclipse/gmf/examples/runtime/ui/pde/internal/wizards/ProjectUnzipperNewWizard.java
// due to its weak extensibility

// Alternative to this implementation could be similar to
// org.eclipse.pde.internal.ui.views.plugins.ImportActionGroup
// However, the associated packages have access restrictions. So, we can't use them here directly

package de.uni_paderborn.fujaba.muml.example.ui.wizard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
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
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class ExampleCreationWizard extends ProjectUnzipperNewWizard {

	// /**
	// * Java Nature
	// */
	//	private static final String ORG_ECLIPSE_JDT_CORE_JAVANATURE = "org.eclipse.jdt.core.javanature"; //$NON-NLS-1$
	//
	// /**
	// * PDE Nature
	// */
	//	private static final String ORG_ECLIPSE_PDE_PLUGIN_NATURE = "org.eclipse.pde.PluginNature"; //$NON-NLS-1$

	/**
	 * Monitor string shown when creating project
	 */
	private static String KEY_CREATING_PROJECT = "monitor.creatingProject"; //$NON-NLS-1$

	/**
	 * Monitor string shown when unzipping the project
	 */
	private static String KEY_UNZIPPING_PROJECT = "monitor.unzippingProject"; //$NON-NLS-1$

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
	 * The list of paths pointing to the location of the project archives
	 */
	private URL[] projectZipURL;

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
								extractProject(projectFolderFile,
										getProjectZipURL()[i],
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

							// Add Java and PDE natures
							// XXX no java nature for us
							// IProjectDescription desc = workspace
							// .newProjectDescription(project.getName());
							// desc.setNatureIds(new String[] {
							// ORG_ECLIPSE_PDE_PLUGIN_NATURE,
							// ORG_ECLIPSE_JDT_CORE_JAVANATURE});
							// project.setDescription(desc, monitor);

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
	 * Unzip the project archive to the specified folder
	 * 
	 * @param projectFolderFile
	 *            The folder where to unzip the project archive
	 * @param monitor
	 *            Monitor to display progress and/or cancel operation
	 * @throws IOException
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws FileNotFoundException
	 * 
	 * @throws FileNotFoundException
	 * @throws InterruptedException
	 */
	private void extractProject(File projectFolderFile, URL url,
			IProgressMonitor monitor) throws FileNotFoundException,
			IOException, InterruptedException {

		/*
		 * Get project archive
		 */
		// URL urlZip = PdeUiPlugin.getDefault().find();
		// URL urlZipLocal = Platform.asLocalURL(urlZip);
		URL urlZipLocal = FileLocator.toFileURL(url);

		/*
		 * Walk each element and unzip
		 */
		ZipFile zipFile = new ZipFile(urlZipLocal.getPath());

		try {
			/*
			 * Allow for a hundred work units
			 */
			monitor.beginTask(
					ResourceManager.getI18NString(KEY_UNZIPPING_PROJECT),
					zipFile.size());

			unzip(zipFile, projectFolderFile, monitor);
		} finally {
			zipFile.close();
			monitor.done();
		}
	}

	/**
	 * Unzips the platform formatted zip file to specified folder
	 * 
	 * @param zipFile
	 *            The platform formatted zip file
	 * @param projectFolderFile
	 *            The folder where to unzip the project archive
	 * @param monitor
	 *            Monitor to display progress and/or cancel operation
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws InterruptedException
	 */
	private void unzip(ZipFile zipFile, File projectFolderFile,
			IProgressMonitor monitor) throws IOException,
			FileNotFoundException, InterruptedException {

		Enumeration<? extends ZipEntry> e = zipFile.entries();

		while (e.hasMoreElements()) {
			ZipEntry zipEntry = (ZipEntry) e.nextElement();
			File file = new File(projectFolderFile, zipEntry.getName());

			if (false == zipEntry.isDirectory()) {

				/*
				 * Copy files (and make sure parent directory exist)
				 */
				File parentFile = file.getParentFile();
				if (null != parentFile && false == parentFile.exists()) {
					parentFile.mkdirs();
				}

				Path path = new Path(file.getPath());
				if (path.getFileExtension().equals("java")) { //$NON-NLS-1$
					InputStreamReader is = null;
					OutputStreamWriter os = null;

					try {
						is = new InputStreamReader(
								zipFile.getInputStream(zipEntry), "ISO-8859-1"); //$NON-NLS-1$
						os = new OutputStreamWriter(new FileOutputStream(file),
								ResourcesPlugin.getEncoding());
						char[] buffer = new char[102400];
						while (true) {
							int len = is.read(buffer);
							if (len < 0)
								break;
							os.write(buffer, 0, len);
						}
					} finally {
						if (null != is) {
							is.close();
						}
						if (null != os) {
							os.close();
						}
					}
				} else {
					InputStream is = null;
					OutputStream os = null;

					try {
						is = zipFile.getInputStream(zipEntry);
						os = new FileOutputStream(file);

						byte[] buffer = new byte[102400];
						while (true) {
							int len = is.read(buffer);
							if (len < 0)
								break;
							os.write(buffer, 0, len);
						}
					} finally {
						if (null != is) {
							is.close();
						}
						if (null != os) {
							os.close();
						}
					}
				}
			}

			monitor.worked(1);

			if (monitor.isCanceled()) {
				throw new InterruptedException();
			}
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
	// XXX
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
	private URL[] getProjectZipURL() {
		return projectZipURL;
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
		List<URL> zipURLs = new ArrayList<URL>();

		IConfigurationElement[] projectElements = config.getChildren("project"); //$NON-NLS-1$

		Bundle[] bundles = FrameworkUtil.getBundle(this.getClass())
				.getBundleContext().getBundles();

		for (int i = 0; i < projectElements.length; i++) {

			String bundleName = projectElements[i].getAttribute("bundle");//$NON-NLS-1$
			String zipPath = projectElements[i].getAttribute("zipPath");

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
				URL url = FileLocator
						.find(bundle,
								new Path(zipPath), null);//$NON-NLS-1$
				zipURLs.add(url);
			}
			if (projectElements[i].getAttribute("nameFormat") == null) { //$NON-NLS-1$
				nameFormatsL.add("{0}"); //$NON-NLS-1$
			} else {
				nameFormatsL.add(projectElements[i].getAttribute("nameFormat")); //$NON-NLS-1$
			}
		}

		projectZipURL = new URL[zipURLs.size()];
		zipURLs.toArray(projectZipURL);
		assert projectZipURL.length > 0;
		nameFormats = new String[nameFormatsL.size()];
		nameFormatsL.toArray(nameFormats);
		assert nameFormats.length > 0;
		assert projectZipURL.length == nameFormats.length;

	}

}