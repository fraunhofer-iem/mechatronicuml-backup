package org.muml.container.transformation.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.muml.container.transformation.job.ContainerGenerationJob;
import org.muml.container.transformation.job.DDSContainerGenerationJob;
import org.muml.core.export.operation.AbstractFujabaExportOperation;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.AbstractFujabaExportTargetPage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.psm.allocation.SystemAllocation;
import org.muml.psm.muml_container.DeploymentConfiguration;

public class ContainerWizard extends AbstractFujabaExportWizard {
	private AbstractFujabaExportSourcePage sourcePage;

	private AbstractFujabaExportTargetPage targetPage;

	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub
		return "org.muml.container.transformation.ContainerWizard";
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
				return element instanceof SystemAllocation;
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

		};
		addPage(sourcePage);

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

		final URI destinationURI = targetPage.getDestinationURI();

		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {

				final SystemAllocation systemAllocation = (SystemAllocation) sourceElements[0];
				AdapterFactoryEditingDomain.getEditingDomainFor(systemAllocation);

				Job containerJob = new ContainerGenerationJob(systemAllocation, destinationURI, editingDomain);
				containerJob.schedule();

				try {
					containerJob.join();
					URI newContinaerFile = ((ContainerGenerationJob) containerJob).getCreatedFile();
					ResourceSet resSet = new ResourceSetImpl();
					Resource res = resSet.getResource(newContinaerFile, true);

					final DeploymentConfiguration systemConfig = (DeploymentConfiguration) res.getContents().get(0);

					EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(systemConfig);
					if (editingDomain == null) {
						editingDomain = WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain();
					}
					Job ddsJob = new DDSContainerGenerationJob(systemConfig, destinationURI, editingDomain);
					ddsJob.schedule();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return Status.OK_STATUS;
			}
		};
	}

}
