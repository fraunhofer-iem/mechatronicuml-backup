package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.PartInitException;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.ModelInstancePlugin;
import de.uni_paderborn.fujaba.modelinstance.ModelinstanceFactory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.modelinstance.categories.ModelElementCategoryRegistry;
import de.uni_paderborn.fujaba.modelinstance.ui.FujabaNewwizardPlugin;
import de.uni_paderborn.fujaba.modelinstance.ui.Messages;
import de.uni_paderborn.fujaba.modelinstance.ui.commands.CreateDiagramCommand;
import de.uni_paderborn.fujaba.modelinstance.ui.commands.CreateEmptyDiagramCommand;
import de.uni_paderborn.fujaba.modelinstance.ui.diagrams.DiagramEditorUtil;
import de.uni_paderborn.fujaba.modelinstance.ui.diagrams.IDiagramInformation;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.Signature;

/**
 * @generated
 */
public class ComponentStoryDiagramInitDiagramFileAction
		extends
		de.uni_paderborn.fujaba.modelinstance.ui.ui.commands.AbstractCreateDiagramFileCommand {

	/**
	 * @generated
	 */
	@Override
	public void setCharset(IFile diagramFile) {
		de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorUtil
				.setCharset(diagramFile);
	}

	/**
	 * @generated
	 */
	@Override
	public String getUniqueFilename(String hint, String extension,
			IPath filePath) {
		return de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorUtil
				.getUniqueFileName(filePath, hint, extension);
	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditor.ID;

	}

	// override because we want to initialize the component story rule
	// with a signature
	@Override
	protected void createDiagram(IFile diagramFile, final EObject diagramRoot,
			TransactionalEditingDomain myEditingDomain) {
		IDiagramInformation diagramInformation = FujabaNewwizardPlugin
				.getDefault().getDiagramInformation(getEditorId());
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString(), true);
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet
				.createResource(diagramModelURI);

		ComponentStoryRule cSR = getInitialComponentStoryRule(diagramRoot
				.eResource());

		class blah extends AbstractTransactionalCommand {
			protected ComponentStoryRule compoStoryRule;
			protected IDiagramInformation diagramInformation;

			public blah(ComponentStoryRule componentStoryRule,
					TransactionalEditingDomain domain, String label,
					List affectedFiles, IDiagramInformation diagramInformation) {
				super(domain, label, affectedFiles);
				this.compoStoryRule = componentStoryRule;
				this.diagramInformation = diagramInformation;
			}

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				// TODO Auto-generated method stub
				return null;
			}

		}
		AbstractTransactionalCommand createInitModelElementsCommand = new blah(
				cSR, myEditingDomain, "Add initial ComponentStoryRule",
				affectedFiles, diagramInformation) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				ModelElementCategory elementCategory = null;
				List<?> rootElements = diagramRoot.eResource().getContents();
				if (!rootElements.isEmpty()) {
					Object rootElement = rootElements.get(0);
					if (rootElement instanceof RootNode) {
						RootNode rootNode = (RootNode) rootElement;
						elementCategory = getModelElementCategory(rootNode,
								diagramInformation.getModelElementCategoryKey());

						if (compoStoryRule != null) {
							elementCategory.getModelElements().add(
									(ExtendableElement) compoStoryRule);
						}
					}
				}

				return CommandResult.newOKCommandResult();
			}
		};

		AbstractTransactionalCommand command = new CreateDiagramCommand(
				myEditingDomain, "Initializing diagram contents",
				affectedFiles, diagramRoot.eResource(), diagramResource, cSR,
				new ArrayList<EObject>(), diagramModelURI.lastSegment(),
				diagramInformation);

		try {
			IStatus status = OperationHistoryFactory.getOperationHistory()
					.execute(createInitModelElementsCommand,
							new NullProgressMonitor(), null);
			if (status.isOK()) {
				diagramRoot.eResource()
						.save(DiagramEditorUtil.getSaveOptions());
			}
			IStatus status2 = OperationHistoryFactory.getOperationHistory()
					.execute(command, new NullProgressMonitor(), null);
			if (status2.isOK()) {
				diagramResource.save(DiagramEditorUtil.getSaveOptions());
				Resource modelResource = diagramRoot.eResource();
				modelResource.save(DiagramEditorUtil.getSaveOptions());
				DiagramEditorUtil.openDiagram(diagramResource, getEditorId());
			}

		} catch (ExecutionException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			ErrorDialog.openError(getShell(),
					Messages.CreationWizardOpenEditorError, null,
					ex.getStatus());
		}
	}

	private ComponentStoryRule getInitialComponentStoryRule(
			Resource modelResource) {
		ComponentStoryRule initComponentStoryrule = ComponentstorydiagramFactory.eINSTANCE
				.createComponentStoryRule();

		Signature signature = ReconfigurationFactory.eINSTANCE
				.createSignature();
		signature.setName("componentStoryRule");

		initComponentStoryrule.setSignature(signature);

		return initComponentStoryrule;
	}

	protected ModelElementCategory getModelElementCategory(RootNode rootNode,
			String categoryKey) {
		ModelElementCategory result = null;
		for (ModelElementCategory category : rootNode.getCategories()) {
			if (category.getKey().equals(categoryKey)
			/*
			 * && category .isValidElement(diagramElement)
			 */) {
				result = category;
				break;
			}
		}

		if (result == null) {
			result = ModelinstanceFactory.eINSTANCE
					.createModelElementCategory();
			String categoryName = null;
			ModelElementCategoryRegistry registry = ModelInstancePlugin
					.getInstance().getModelElementCategoryRegistry();
			if (registry != null) {
				categoryName = registry.getCategoryName(categoryKey);
			}
			result.setName(categoryName);
			result.setKey(categoryKey);
			rootNode.getCategories().add(result);
		}
		return result;
	}
}
