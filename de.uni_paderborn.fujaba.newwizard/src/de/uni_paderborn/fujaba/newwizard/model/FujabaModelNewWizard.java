package de.uni_paderborn.fujaba.newwizard.model;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.modelinstance.ModelinstanceFactory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.newwizard.FujabaNewwizardPlugin;
import de.uni_paderborn.fujaba.newwizard.Messages;
import de.uni_paderborn.fujaba.newwizard.diagrams.DiagramEditorUtil;
import de.uni_paderborn.fujaba.newwizard.diagrams.pages.NewExtendedFileCreationPage;

public class FujabaModelNewWizard extends Wizard implements INewWizard{

	protected NewExtendedFileCreationPage domainModelFilePage;
	
	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}
	
	private TransactionalEditingDomain editingDomain;

	public FujabaModelNewWizard() {
		editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
	}


	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;

		setNeedsProgressMonitor(true);
	}
	

	@Override
	public void addPages() {
		domainModelFilePage = new NewExtendedFileCreationPage(
				"DiagramModelFile", getSelection(), FujabaNewwizardPlugin.FUJABA_MODEL_EXTENSION); //$NON-NLS-1$

		domainModelFilePage
				.setTitle(Messages.NewDiagramFileWizard_CreationPageTitle);
		domainModelFilePage
				.setDescription(Messages.NewDiagramFileWizard_CreationPageDescription);

		addPage(domainModelFilePage);
	}

	@Override
	public boolean performFinish() {

		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		IFile domainModelFile = domainModelFilePage.createNewFile();
		DiagramEditorUtil.setCharset(domainModelFile);
		affectedFiles.add(domainModelFile);
		URI diagramModelURI = URI.createPlatformResourceURI(domainModelFile
				.getFullPath().toString(), true);
		ResourceSet resourceSet = editingDomain.getResourceSet();
		final Resource domainModelResource = resourceSet
				.createResource(diagramModelURI);
		
		final RootNode rootNode = ModelinstanceFactory.eINSTANCE.createRootNode();

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain, "InitDiagramCommand", affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				
				domainModelResource.getContents().add(rootNode);
				return CommandResult.newOKCommandResult();
			}
		};

		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			domainModelResource.save(DiagramEditorUtil.getSaveOptions());

		} catch (ExecutionException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		}
		return true;
	}

}
