package de.uni_paderborn.fujaba.muml.psm.transformation.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.export.operation.AbstractFujabaExportOperation;
import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportTargetPage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.mum.psm.transformation.ui.jobs.CodegenFlatHierarchyJob;
import de.uni_paderborn.fujaba.mum.psm.transformation.ui.jobs.MumlPIM2MumlPSMJob;
import de.uni_paderborn.fujaba.mum.psm.transformation.ui.jobs.MumlPSM2CodegenJob;
import de.uni_paderborn.fujaba.muml.pm.common.xtext.FujabaResourceServiceProvider;
import de.uni_paderborn.fujaba.muml.psm.allocation.Allocation;
import de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation;
import de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui.internal.APIMappingLanguageActivator;


public class CodegenWizard extends AbstractFujabaExportWizard {
	private AbstractFujabaExportSourcePage sourcePage;
	private AbstractFujabaExportSourcePage allocationPage;

	private AbstractFujabaExportSourcePage apiMappingPage;

	private AbstractFujabaExportTargetPage targetPage;

	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub
		return "de.uni_paderborn.fujaba.muml.psm.codegen.CodegenWizard";
	}

	@Override
	public void addPages() {
		// Source page
		sourcePage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element.getClass().getName().contains("ComponentInstanceConfiguration");
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

		};
		addPage(sourcePage);
		
		allocationPage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element.getClass().getName().contains("Allocation");
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

		};
		addPage(allocationPage);

		apiMappingPage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "apimapping";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return true;
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_NONE;
			}

		};
		apiMappingPage.setTitle("Select a API-Mapping file");
		addPage(apiMappingPage);

		targetPage = new AbstractFujabaExportTargetPage("target", toolkit) {

			@Override
			public boolean wizardPageSupportsOverwriteOption() {
				return true;
			}

			@Override
			public boolean wizardPageDirectoryDestination() {
				return true;
			}

		};
		addPage(targetPage);

	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		final EObject[] sourceElements = sourcePage.getSourceElements();
		final URI sourceURI = sourcePage.getURI();
		final URI allocationURI = allocationPage.getURI();


		final URI apiMappingFileURI = apiMappingPage.getURI();
		final URI destinationURI = targetPage.getDestinationURI();

		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				
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
				
				Resource cic =resourceSet.getResource(sourceURI, true);
				Resource allocation = resourceSet.getResource(allocationURI, true);
				Resource apiMapping = resourceSet.getResource(apiMappingFileURI, true);
				
				EcoreUtil.resolveAll(resourceSet);
				EcoreUtil2.resolveLazyCrossReferences(apiMapping, CancelIndicator.NullImpl);
				apiMapping.getContents();
//				
//				MumlPIM2MumlPSMJob psmJob = new MumlPIM2MumlPSMJob(
//						rootNode, apiMapping, Messages.CodegenTransformationWizard_2);
//				psmJob.setProgressGroup(progressMonitor, 10);
//				psmJob.setUser(true);
//
//				MumlPSM2CodegenJob codeGenJob = new MumlPSM2CodegenJob(
//						(SystemAllocation) ((Allocation) allocationPage.getSourceElements()[0]) , destinationURI,
//						Messages.CodegenTransformationWizard_0);
//				codeGenJob.setUser(true);
//				codeGenJob.setProgressGroup(progressMonitor, 10);
//
//				CodegenFlatHierarchyJob hierarchyJob = new CodegenFlatHierarchyJob(
//						codgenModelPath,
//						Messages.CodegenTransformationWizard_1);
//				hierarchyJob.setUser(true);
//				hierarchyJob.setProgressGroup(progressMonitor, 10);
//
//				psmJob.schedule();
//				psmJob.join();
//				monitor.worked(32);
//				codeGenJob.schedule();
//				codeGenJob.join();
//				monitor.worked(33);
//				hierarchyJob.schedule();
				
				return Status.OK_STATUS;
			}
		};
	}

}
