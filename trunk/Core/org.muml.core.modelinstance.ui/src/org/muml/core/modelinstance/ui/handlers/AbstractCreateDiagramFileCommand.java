package org.muml.core.modelinstance.ui.handlers;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.PartInitException;
import org.muml.core.common.DiagramEditorUtil;
import org.muml.core.common.Messages;
import org.muml.core.modelinstance.ModelInstancePlugin;
import org.muml.core.modelinstance.categories.ModelElementCategoryRegistry;
import org.muml.core.modelinstance.ui.ModelinstanceUiPlugin;
import org.muml.core.modelinstance.ui.commands.CreateEmptyDiagramCommand;
import org.muml.core.modelinstance.ui.diagrams.IDiagramInformation;

public abstract class AbstractCreateDiagramFileCommand extends
		AbstractCreateFileCommand {

	protected abstract String getEditorId();

	private IDiagramInformation diagramInformation;

	public AbstractCreateDiagramFileCommand() {
		diagramInformation = ModelinstanceUiPlugin.getDefault()
				.getDiagramInformation(getEditorId());
	}

	@Override
	protected void createContents(URI selectedURI, IFile newFile) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.getResource(selectedURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			ModelinstanceUiPlugin.getDefault().logError(
					"Unable to load resource: " + selectedURI, ex); //$NON-NLS-1$
		}

		createDiagram(newFile, diagramRoot, editingDomain);
	}

	// Copied from generated *NewDiagramFileWizard.performFinish()
	protected void createDiagram(IFile diagramFile, final EObject diagramRoot,
			TransactionalEditingDomain myEditingDomain) {
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString(), true);
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet
				.createResource(diagramModelURI);

		AbstractTransactionalCommand command = new CreateEmptyDiagramCommand(
				myEditingDomain, "Initializing diagram contents",
				affectedFiles, diagramResource, diagramRoot,
				diagramInformation.getDiagramElementClass(),
				new PreferencesHint(diagramInformation.getPreferencesHint()),
				diagramInformation.getModelElementCategoryKey(),
				diagramInformation.getModelId());

		try {
			IStatus status = OperationHistoryFactory.getOperationHistory()
					.execute(command, new NullProgressMonitor(), null);
			if (status.isOK()) {
				diagramResource.save(DiagramEditorUtil.getSaveOptions());
				Resource modelResource = diagramRoot.eResource();
				modelResource.save(DiagramEditorUtil.getSaveOptions());
				DiagramEditorUtil.openDiagram(diagramResource, getEditorId());
			}

		} catch (ExecutionException e) {
			ModelinstanceUiPlugin.getDefault().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			ModelinstanceUiPlugin.getDefault().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			ErrorDialog.openError(getShell(),
					Messages.CreationWizardOpenEditorError, null,
					ex.getStatus());
		}
	}
	
	@Override
	protected IPath getSubFolder(IPath filePath) {
		String key = diagramInformation.getModelElementCategoryKey();
		ModelElementCategoryRegistry registry = ModelInstancePlugin.getInstance().getModelElementCategoryRegistry();
		String categoryName = registry.getCategoryName(key);
		filePath = filePath.append(categoryName);
		return filePath;
	}

	@Override
	protected String getExtension() {
		IDiagramInformation diagramInformation = ModelinstanceUiPlugin
				.getDefault().getDiagramInformation(getEditorId());
		if (diagramInformation != null) {
			return diagramInformation.getFileExtension();
		}
		return null;
	}

	@Override
	protected void setCharset(IFile file) {
		DiagramEditorUtil.setCharset(file);
	}

}
