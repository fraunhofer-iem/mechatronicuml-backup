package org.muml.psm.transformation.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.muml.core.export.operation.AbstractFujabaExportOperation;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.AbstractFujabaExportTargetPage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.pm.common.xtext.FujabaResourceServiceProvider;
import org.muml.psm.allocation.SystemAllocation;
import org.muml.psm.api.apimappinglanguage.xtext.ui.internal.APIMappingLanguageActivator;
import org.muml.psm.portapimapping.MappingRepository;
import org.muml.psm.transformation.ui.jobs.SystemAllocation2CodegenJob;

import com.google.inject.Injector;

public class CodegenWizard extends AbstractFujabaExportWizard {
	private AbstractFujabaExportSourcePage sourcePage;

	private AbstractFujabaExportSourcePage apiMappingPage;

	private AbstractFujabaExportTargetPage targetPage;

	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub
		return "org.muml.psm.codegen.CodegenWizard";
	}

	@Override
	public void addPages() {
		// Source page
		sourcePage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "muml";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element.getClass().getName().contains("SystemAllocation");
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

		};
		addPage(sourcePage);

		apiMappingPage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "apimapping";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element.getClass().getName().contains("MappingRepository");
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

		};
		apiMappingPage.setTitle("Select an API-Mapping file");
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

		
		final EObject[] appiMappingElements = apiMappingPage.getSourceElements();
		final URI apiMappingFileURI = apiMappingPage.getURI();
		final URI destinationURI = targetPage.getDestinationURI();

		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {

				Injector injector = APIMappingLanguageActivator.getInstance().getInjector(
						APIMappingLanguageActivator.ORG_MUML_PSM_API_APIMAPPINGLANGUAGE_XTEXT_APIMAPPINGLANGUAGE);
				FujabaResourceServiceProvider serviceProvider = new FujabaResourceServiceProvider();

				injector.injectMembers(serviceProvider);
				injector.getInstance(FujabaResourceServiceProvider.class);

				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

				Resource allocation = resourceSet.getResource(sourceURI, true);
				Resource apiMapping = resourceSet.getResource(apiMappingFileURI, true);

				EcoreUtil.resolveAll(resourceSet);
				EcoreUtil2.resolveLazyCrossReferences(apiMapping, CancelIndicator.NullImpl);

				SystemAllocation systemAllocation = (SystemAllocation) sourceElements[0];
				MappingRepository mappingRepo = (MappingRepository) appiMappingElements[0];

				String transformationPath = "/org.muml.psm.transformation/transforms/systemAllocation2Codegen/SystemAllocation2CodegenTransformation.qvto";

				SystemAllocation2CodegenJob psmJob = new SystemAllocation2CodegenJob(systemAllocation, mappingRepo,
						destinationURI, transformationPath);
				// SystemAllocation2CodegenJob.setProgressGroup(progressMonitor,
				// 10);
				psmJob.setUser(true);
				psmJob.schedule();

				//
				// MumlPIM2MumlPSMJob psmJob = new MumlPIM2MumlPSMJob(
				// rootNode, apiMapping,
				// Messages.CodegenTransformationWizard_2);
				// psmJob.setProgressGroup(progressMonitor, 10);
				// psmJob.setUser(true);
				//
				// MumlPSM2CodegenJob codeGenJob = new MumlPSM2CodegenJob(
				// (SystemAllocation) ((Allocation)
				// allocationPage.getSourceElements()[0]) , destinationURI,
				// Messages.CodegenTransformationWizard_0);
				// codeGenJob.setUser(true);
				// codeGenJob.setProgressGroup(progressMonitor, 10);
				//
				// CodegenFlatHierarchyJob hierarchyJob = new
				// CodegenFlatHierarchyJob(
				// codgenModelPath,
				// Messages.CodegenTransformationWizard_1);
				// hierarchyJob.setUser(true);
				// hierarchyJob.setProgressGroup(progressMonitor, 10);
				//
				// psmJob.schedule();
				// psmJob.join();
				// monitor.worked(32);
				// codeGenJob.schedule();
				// codeGenJob.join();
				// monitor.worked(33);
				// hierarchyJob.schedule();

				return Status.OK_STATUS;
			}
		};
	}

}
