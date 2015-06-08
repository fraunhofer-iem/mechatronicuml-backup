package de.uni_paderborn.uppaal.ui.wizard;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

import de.uni_paderborn.fujaba.export.operation.AbstractFujabaExportOperation;
import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.requirements.PropertyRepository;

public class UppaalExportWizard extends AbstractFujabaExportWizard {

	private AbstractFujabaExportSourcePage sourcePage;
	private AbstractFujabaExportSourcePage sourcePage2;
	private UppaalExportTargetPage targetPage;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("Uppaal EMF To Uppaal XML Export");
		setDefaultPageImageDescriptor(IDEWorkbenchPlugin
				.getIDEImageDescriptor("wizban/exportzip_wiz.png"));//$NON-NLS-1$
	}

	@Override
	public String wizardGetId() {
		return "de.uni_paderborn.fujaba.export.ExampleWizard";
	}
	
	@Override
	public void addPages() {

		// Source page
		sourcePage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public void setVisible(boolean visible) {
				super.setVisible(visible);
			}
			
			@Override
			public String wizardPageGetSourceFileExtension() {
				return "uppaal";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				// return element instanceof CoordinationProtocol;
				return element instanceof NTA;
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}
			
		};
		addPage(sourcePage);
		
		// Source page
		sourcePage2 = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public void setVisible(boolean visible) {
				super.setVisible(visible);
			}
			
			@Override
			public String wizardPageGetSourceFileExtension() {
				return "requirements";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element instanceof PropertyRepository;
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}
			
		};
		addPage(sourcePage2);

		// Target page
		targetPage = new UppaalExportTargetPage("target", toolkit);
		addPage(targetPage);
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		final URI destination = targetPage.getDestinationURI();
		
		final NTA nta = getNTA();
		final PropertyRepository propertyRepository = getPropertyRepository();
		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				String fullPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + destination.devicePath().substring(9);
				final IPath path = new Path(fullPath);
				
//				URI targetURI = destination.appendSegment(((NTA) nta).getName()).appendFileExtension("uppaal");
//
//				URI targetURIRequirements = destination.appendSegment(((NTA) nta).getName()).appendFileExtension("requirements");
//				
				//Start the job
				Job job = new UppaalXMLSynthesisJob(nta, propertyRepository, path, true);
				
				job.addJobChangeListener(new ExportJobChangeAdapter());
				job.schedule();
				System.out.println("done");
				return Status.OK_STATUS;
			}
		};
	}
	
	public NTA getNTA() {
		for (EObject element : sourcePage.getSourceElements()) {
			if (element instanceof NTA) {
				return (NTA) element;
			}
		}
		return null;
	}
	
	public PropertyRepository getPropertyRepository() {
		for (EObject element : sourcePage2.getSourceElements()) {
			if (element instanceof PropertyRepository) {
				return (PropertyRepository) element;
			}
		}
		return null;
	}
}
