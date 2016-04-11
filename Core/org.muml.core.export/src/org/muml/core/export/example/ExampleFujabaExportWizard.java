package org.muml.core.export.example;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.muml.core.export.operation.AbstractFujabaExportOperation;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.AbstractFujabaExportTargetPage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;

public class ExampleFujabaExportWizard extends AbstractFujabaExportWizard {

	private AbstractFujabaExportSourcePage sourcePage;
	private AbstractFujabaExportTargetPage targetPage;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("Test Transformation Export");
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
			public void activate() {
			}
			
			@Override
			public String wizardPageGetSourceFileExtension() {
				return "muml";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element.getClass().getName().contains("Component");
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

			
		};
		addPage(sourcePage);

		// Target page
		targetPage = new AbstractFujabaExportTargetPage("target", toolkit) {

			@Override
			public void activate() {
			}
			
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
		
		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				return Status.OK_STATUS;
			}
		};
	}

}
