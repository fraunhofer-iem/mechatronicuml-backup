package de.uni_paderborn.fujaba.muml.allocationalgorithm.ui.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS;
import de.uni_paderborn.fujaba.muml.allocation.language.ui.internal.AllocationSpecificationLanguageActivator;
import de.uni_paderborn.fujaba.muml.allocationalgorithm.ui.jobs.AllocationAlgorithmJob;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

public class AllocationAlgorithmWizard extends Wizard implements INewWizard {
	public static final String ALLOCATION_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/AlgorithmMain.qvto";

	// wizard pages
	private MainAllocationAlgorithmPage mainConifgPage;

	// the workbench instance
	private IWorkbench workbench;

	private IStructuredSelection selection;

	public AllocationAlgorithmWizard() {
		super();
		setNeedsProgressMonitor(true);
		setDialogSettings(new DialogSettings("WizardSetting"));
	}

	@Override
	public void addPages() {
		mainConifgPage = new MainAllocationAlgorithmPage(
				"Select A Fujaba and A Allocation Specification File",
				selection);
		addPage(mainConifgPage);

	}

	@Override
	public String getWindowTitle() {
		return "Run the Allocation Algorithm";
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
					monitor.beginTask("Run Allocation Algorithm", 10);
					monitor.subTask("Load Models");
					IPath pathFujabaFile = new Path(mainConifgPage
							.getFujabaFilePath());

					IPath pathAllocationSpecificationFile = new Path(
							mainConifgPage.getAllocationSpecificationFilePath());

					Injector injector = AllocationSpecificationLanguageActivator
							.getInstance()
							.getInjector(
									AllocationSpecificationLanguageActivator.DE_UNI_PADERBORN_FUJABA_MUML_ALLOCATION_LANGUAGE_ALLOCATIONSPECIFICATIONLANGUAGE);

					XtextResourceSet resourceSet = injector
							.getInstance(XtextResourceSet.class);
					resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
							Boolean.TRUE);

					Resource fujabaResource = resourceSet.getResource(
							URI.createURI(pathFujabaFile.toString()), true);

					ComponentInstanceConfiguration cic = (ComponentInstanceConfiguration) fujabaResource
							.getEObject(mainConifgPage.getURIFragmentOfCIC());
					HWPlatformInstanceConfiguration hwpic = (HWPlatformInstanceConfiguration) fujabaResource
							.getEObject(mainConifgPage.getURIFragmentOfHWPIC());
					Resource allocationSpecficationResource = resourceSet
							.getResource(URI
									.createURI(pathAllocationSpecificationFile
											.toString()), true);
					SpecificationCS allocationSpecification = (SpecificationCS) allocationSpecficationResource
							.getContents().get(0);

					monitor.worked(4);

					AllocationAlgorithmJob allocationJob = new AllocationAlgorithmJob(
							allocationSpecification, cic, hwpic,
							ALLOCATION_TRANSFORMATION);
					allocationJob.setUser(true);
					allocationJob.setProgressGroup(monitor, 100);

					monitor.worked(5);
					allocationJob.schedule();
					try {
						allocationJob.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						monitor.done();
					}

				}

			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
