package org.muml.uppaal.adapter.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.muml.core.NamedElement;
import org.muml.core.export.operation.AbstractFujabaExportOperation;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.uppaal.adapter.job.Muml2UppaalModelJob;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.options.Options;
import org.muml.uppaal.adapter.ui.ExportJobChangeAdapter;

public class MUML2UppaalExportWizard extends AbstractFujabaExportWizard {

	private AbstractFujabaExportSourcePage sourcePage;
	private MUML2UppaalExportTargetPage targetPage;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("MUML 2 Uppaal Export (Not Working Yet)");
		setDefaultPageImageDescriptor(IDEWorkbenchPlugin
				.getIDEImageDescriptor("wizban/exportzip_wiz.png"));//$NON-NLS-1$
	}

	@Override
	public String wizardGetId() {
		return "org.muml.core.export.ExampleWizard";
	}
	
	public void addPages() {

		// Source page
		sourcePage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public void setVisible(boolean visible) {
				// TODO Auto-generated method stub
				super.setVisible(visible);
			}
			
			@Override
			public String wizardPageGetSourceFileExtension() {
				return "muml";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element instanceof CoordinationProtocol;
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}
			
		};
		addPage(sourcePage);

		// Target page
		targetPage = new MUML2UppaalExportTargetPage("target", toolkit);
		addPage(targetPage);
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		final boolean exportAsXml = targetPage.isExportAsXml();
		final Options uppaalOptions = targetPage.getUppaalOptions();
		final URI destination = targetPage.getDestinationURI();
		final VerifiableElement verifiableElement = getVerifiableElement();
		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {

				URI targetURI = destination.appendSegment(((NamedElement) verifiableElement).getName()).appendFileExtension("uppaal");
				URI targetURIRequirements = destination.appendSegment(((NamedElement) verifiableElement).getName()).appendFileExtension("requirements");

				//Start the job
				Job job = new Muml2UppaalModelJob(verifiableElement, targetURI, targetURIRequirements, new VerificationOptionsProvider() {
					@Override
					public boolean prepareOptionsProvider(VerifiableElement element) {
						return true;
					}
					
					@Override
					public Options getOptions() {
						return uppaalOptions;
					}
				});
				job.addJobChangeListener(new ExportJobChangeAdapter());
				job.schedule();
				return Status.OK_STATUS;
			}
		};
	}

	public VerifiableElement getVerifiableElement() {
		for (EObject element : sourcePage.getSourceElements()) {
			if (element instanceof VerifiableElement) {
				return (VerifiableElement) element;
			}
		}
		return null;
	}

}
