package org.muml.core.modelinstance.ui.model;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.muml.core.common.Messages;
import org.muml.core.modelinstance.ui.ModelinstanceUiPlugin;
import org.muml.core.modelinstance.ui.diagrams.pages.NewExtendedFileCreationPage;

/**
 * A New Wizard for the Fujaba Model.
 * 
 * @author bingo
 * 
 */
public class FujabaModelNewWizard extends Wizard implements INewWizard {

	/**
	 * The Wizard Page for selecting a file name.
	 */
	protected NewExtendedFileCreationPage domainModelFilePage;

	/**
	 * The Editing Domain for all changes.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * Constructs this NewWizard.
	 */
	public FujabaModelNewWizard() {
		editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
	}

	/**
	 * Initializes this creation wizard.
	 * 
	 * @param workbench
	 *            The workbench
	 * @param selection
	 *            The selection that existed before this wizard was opened.
	 * 
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setNeedsProgressMonitor(true);

		domainModelFilePage = new NewExtendedFileCreationPage(
				"DiagramModelFile", selection, ModelinstanceUiPlugin.FUJABA_MODEL_EXTENSION); //$NON-NLS-1$

		domainModelFilePage
				.setTitle(Messages.NewDiagramFileWizard_CreationPageTitle);
		domainModelFilePage
				.setDescription(Messages.NewDiagramFileWizard_CreationPageDescription);

		addPage(domainModelFilePage);
	}

	/**
	 * Creates the specified domain model.
	 */
	@Override
	public boolean performFinish() {
		IFile domainModelFile = domainModelFilePage.createNewFile();
		ModelinstanceUiPlugin.getDefault().createModel(domainModelFile,
				editingDomain);
		return true;
	}

}
