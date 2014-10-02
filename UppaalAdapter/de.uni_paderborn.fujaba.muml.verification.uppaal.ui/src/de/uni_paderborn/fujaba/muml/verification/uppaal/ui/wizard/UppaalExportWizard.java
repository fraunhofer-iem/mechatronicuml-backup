package de.uni_paderborn.fujaba.muml.verification.uppaal.ui.wizard;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.export.operation.AbstractFujabaExportOperation;
import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.ExportUppaalModelJob;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationOptionsProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;
import de.uni_paderborn.fujaba.muml.verification.uppaal.ui.ExportJobChangeAdapter;

public class UppaalExportWizard extends AbstractFujabaExportWizard {

	private AbstractFujabaExportSourcePage sourcePage;
	private UppaalExportTargetPage targetPage;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("Test Transformation Export");
		setDefaultPageImageDescriptor(IDEWorkbenchPlugin
				.getIDEImageDescriptor("wizban/exportzip_wiz.png"));//$NON-NLS-1$
	}

	@Override
	public String wizardGetId() {
		return "de.uni_paderborn.fujaba.export.ExampleWizard";
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
				return "fujaba";
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
		targetPage = new UppaalExportTargetPage("target", toolkit);
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
				Job job = new ExportUppaalModelJob(verifiableElement, targetURI, targetURIRequirements, new VerificationOptionsProvider() {
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
