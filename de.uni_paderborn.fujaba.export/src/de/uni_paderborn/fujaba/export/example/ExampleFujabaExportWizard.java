package de.uni_paderborn.fujaba.export.example;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

import de.uni_paderborn.fujaba.common.ui.ResourceLocationProvider;
import de.uni_paderborn.fujaba.export.operation.AbstractFujabaExportOperation;
import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.pages.FujabaExportTargetPage;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;

public class ExampleFujabaExportWizard extends AbstractFujabaExportWizard {

	private ExampleFujabaExportSourcePage sourcePage;
	private FujabaExportTargetPage targetPage;

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

		// Create pages
		sourcePage = new ExampleFujabaExportSourcePage("source", getToolkit(),
				new ResourceLocationProvider(getSelection()),
				editingDomain.getResourceSet());

		targetPage = new FujabaExportTargetPage("target", getToolkit());

		// Add pages
		addPage(sourcePage);
		addPage(targetPage);
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		final Object[] sourceElements = sourcePage.getSourceElements();
		
		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				return Status.OK_STATUS;
			}
		};
	}

}
