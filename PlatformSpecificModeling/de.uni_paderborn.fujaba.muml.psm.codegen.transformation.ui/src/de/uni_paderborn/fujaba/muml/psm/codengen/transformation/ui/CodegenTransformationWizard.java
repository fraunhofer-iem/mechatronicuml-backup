package de.uni_paderborn.fujaba.muml.psm.codengen.transformation.ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.mum.psm.codengen.transformation.ui.jobs.CodegenFlatHierarchyJob;
import de.uni_paderborn.fujaba.mum.psm.codengen.transformation.ui.jobs.MumlPIM2MumlPSMJob;
import de.uni_paderborn.fujaba.mum.psm.codengen.transformation.ui.jobs.MumlPSM2CodegenJob;
import de.uni_paderborn.fujaba.muml.pm.common.xtext.FujabaResourceServiceProvider;
import de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation;
import de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui.internal.APIMappingLanguageActivator;
import de.uni_paderborn.fujaba.muml.psm.portapimapping.MappingRepository;
import de.uni_paderborn.fujaba.muml.psm.portapimapping.PortapimappingFactory;

public class CodegenTransformationWizard extends Wizard implements INewWizard {

	// Transormations
	public static final String API_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.psm.api.transformation/transforms/apitransformation.qvto";

	public static final String CODEGEN_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.psm.codegentransformation/transforms/CodegenTransformation.qvto";

	public static final String CODEGEN_HIERARCHY_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.psm.codegentransformation/transforms/hierarchy_transformation.qvto";
	// wizard pages
	private MainCodeGenConfigPage mainConifgPage;

	// the workbench instance
	private IWorkbench workbench;

	private IStructuredSelection selection;

	public CodegenTransformationWizard() {
		super();
		setNeedsProgressMonitor(true);
		setDialogSettings(new DialogSettings("WizardSetting"));
	}

	@Override
	public void addPages() {
		mainConifgPage = new MainCodeGenConfigPage(
				"Select A Fujaba and A API-Mapping Model", selection);
		addPage(mainConifgPage);

	}

	@Override
	public String getWindowTitle() {
		return "Export Fujaba-Model to Code-Gen Model";
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}

	@Override
	public boolean performFinish() {
		mainConifgPage.saveSettings();

		try {
			getContainer().run(true, true, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {

					try {
						monitor.beginTask("Create Code-Gen Model", 35);
						monitor.subTask("Copy Files to model-gen");
						URI fujabaURI = URI.createURI(mainConifgPage.getFujabaFilePath());
						IResource fujabaFile = ResourcesPlugin.getWorkspace()
								.getRoot().findMember(fujabaURI.toPlatformString(true));
						final IFolder newFolder = ResourcesPlugin
								.getWorkspace()
								.getRoot()
								.getFolder(
										fujabaFile.getFullPath()
												.removeLastSegments(1)
												.append("model-gen"));
						;

						// take the orginal file name and store the copy in the
						// model-gen
						// folder
						final IPath newFujabaFilePath = newFolder.getFullPath()
								.append(fujabaFile.getName());

						// path fopr the codegenModel
						final IPath codgenModelPath = newFolder.getFullPath()
								.append("CodeGenModel.codegen");
						IFile newFujabaFile = null;
						MappingRepository apiMapping = null;

						Injector injector = APIMappingLanguageActivator
								.getInstance()
								.getInjector(
										APIMappingLanguageActivator.DE_UNI_PADERBORN_FUJABA_MUML_PSM_API_APIMAPPINGLANGUAGE_APIMAPPINGLANGUAGE);
						FujabaResourceServiceProvider serviceProvider = new FujabaResourceServiceProvider();

						injector.injectMembers(serviceProvider);
						injector.getInstance(FujabaResourceServiceProvider.class);

						XtextResourceSet resourceSet = injector
								.getInstance(XtextResourceSet.class);
						resourceSet.addLoadOption(
								XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

						if (newFolder.exists()) {
							newFolder.delete(true, monitor);
							monitor.worked(1);
						}
						try {
							newFolder.create(IResource.FORCE, true, monitor);
							fujabaFile.copy(newFujabaFilePath, true, monitor);
							newFujabaFile = ResourcesPlugin.getWorkspace()
									.getRoot().getFile(newFujabaFilePath);
							apiMapping = handleOptionalAPIMappingFile(
									newFolder, newFujabaFile, resourceSet,
									monitor);
							newFolder
									.refreshLocal(IResource.DEPTH_ONE, monitor);

							monitor.worked(2);
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						Resource copiedFujabaResource = resourceSet
								.getResource(URI.createPlatformResourceURI(newFujabaFile.getFullPath()
										.toString(),true), true);
						SystemAllocation allocation = (SystemAllocation) copiedFujabaResource
								.getEObject(mainConifgPage
										.getURIFragmentOfSelectedElement());
						EcoreUtil.resolveAll(allocation);
						RootNode rootNode = (RootNode) copiedFujabaResource
								.getContents().get(0);

						EcoreUtil2.resolveLazyCrossReferences(
								copiedFujabaResource, CancelIndicator.NullImpl);

						if (allocation == null || apiMapping == null) {
							monitor.setCanceled(true);
							return;
						}
						MumlPIM2MumlPSMJob psmJob = new MumlPIM2MumlPSMJob(
								rootNode, apiMapping, API_TRANSFORMATION);
						psmJob.setProgressGroup(monitor, 10);
						psmJob.setUser(true);

						MumlPSM2CodegenJob codeGenJob = new MumlPSM2CodegenJob(
								allocation, codgenModelPath,
								CODEGEN_TRANSFORMATION);
						codeGenJob.setUser(true);
						codeGenJob.setProgressGroup(monitor, 10);

						CodegenFlatHierarchyJob hierarchyJob = new CodegenFlatHierarchyJob(
								codgenModelPath,
								CODEGEN_HIERARCHY_TRANSFORMATION);
						hierarchyJob.setUser(true);
						hierarchyJob.setProgressGroup(monitor, 10);

						psmJob.schedule();
						psmJob.join();
						monitor.worked(32);
						codeGenJob.schedule();
						codeGenJob.join();
						monitor.worked(33);
						hierarchyJob.schedule();
						// if(apiMapping !=null){
						// final IPath newAPIMappingFilePath =
						// newFolder.getFullPath()
						// .append(apiMapping.eResource().getURI().toString());
						// IFile newAPIMappingFile =
						// ResourcesPlugin.getWorkspace()
						// .getRoot().getFile(newAPIMappingFilePath);
						// if (newAPIMappingFile!=null){
						// newAPIMappingFile.delete(true, monitor);
						// }
						// }
						monitor.worked(35);

					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						monitor.done();
					}
				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * 
	 * @param targetFolder
	 * @param newFujabaFile
	 * @param resourceSet
	 * @param monitor
	 * @throws CoreException
	 * @throws IOException
	 */
	private MappingRepository handleOptionalAPIMappingFile(
			IFolder targetFolder, IFile newFujabaFile, ResourceSet resourceSet,
			IProgressMonitor monitor) throws CoreException, IOException {
		MappingRepository apiMapping = null;
		monitor.subTask("Adjusting Path in the API-Mapping Model");
		String apiMappingFilePath = mainConifgPage.getAPIMappingFilePath();
		if (apiMappingFilePath.isEmpty()) {
			apiMapping = PortapimappingFactory.eINSTANCE
					.createMappingRepository();
			apiMapping.setName("Dummy");
			monitor.worked(1);
			return apiMapping;
		}
		URI apiMappingURI = URI.createURI(mainConifgPage.getAPIMappingFilePath());
		IResource apiMappingFile = ResourcesPlugin.getWorkspace()
				.getRoot().findMember(apiMappingURI.toPlatformString(true));
		final IPath newAPIMappingFilePath = targetFolder.getFullPath().append(
				apiMappingFile.getName());
		
		apiMappingFile.copy(newAPIMappingFilePath, true, monitor);
		IFile newAPIMappingFile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(newAPIMappingFilePath);
		adjustReferencesInAPIMappingModel(apiMappingFile, newAPIMappingFile,
				newFujabaFile);
		monitor.worked(5);
		Resource resource = resourceSet.getResource(URI.createPlatformResourceURI(
				newAPIMappingFile.getFullPath().toString(),true), true);
		EcoreUtil2.resolveLazyCrossReferences(resource,
				CancelIndicator.NullImpl);
		apiMapping = (MappingRepository) resource.getContents().get(0);
		EcoreUtil.resolveAll(apiMapping);
		monitor.worked(10);
		return apiMapping;

	}

	/**
	 * 
	 * Don't know why but Xtext wants absolute path platform:/resource/....
	 * 
	 * @param orgAPIMappingFile
	 * @param newAPIMappingFile
	 * @param newFujabaFile
	 * @throws IOException
	 */
	private void adjustReferencesInAPIMappingModel(IResource orgAPIMappingFile,
			IFile newAPIMappingFile, IFile newFujabaFile) throws IOException {
		FileInputStream fstream = new FileInputStream(orgAPIMappingFile
				.getLocation().toString());
		// Get the object of DataInputStream
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		FileWriter fstreamError = new FileWriter(newAPIMappingFile
				.getLocation().toString());
		BufferedWriter output = new BufferedWriter(fstreamError);
		String regexeFujabaImport = "\\s*import\\s*\"(.*\\.fujaba)\"";
		String replacementFujabaImport = "import \"platform:/resource"
				+ newFujabaFile.getFullPath().removeLastSegments(1) + "/";
		String regexeOSImport = "\\s*import\\s*\"(.*\\.osdsl)\"";
		String replacementOSImport = "import \"platform:/resource"
				+ orgAPIMappingFile.getFullPath().removeLastSegments(1) + "/";
		Pattern fujabaImportPattern = Pattern.compile(regexeFujabaImport);
		Pattern osImportPattern = Pattern.compile(regexeOSImport);

		String line;
		Matcher matcher;
		while ((line = br.readLine()) != null) {
			matcher = fujabaImportPattern.matcher(line);
			if (matcher.matches()) {
				output.write(matcher.replaceFirst(replacementFujabaImport
						+ matcher.group(1) + "\"\n")
						+ "\n");
			} else {
				matcher = osImportPattern.matcher(line);
				if (matcher.matches()) {
					output.write(matcher.replaceFirst(replacementOSImport
							+ matcher.group(1) + "\"\n")
							+ "\n");
				} else {
					output.write(line + '\n');

				}
			}
		}
		br.close();
		output.flush();
		output.close();

	}
}
