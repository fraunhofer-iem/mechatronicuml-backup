package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.ModelInstancePlugin;
import de.uni_paderborn.fujaba.modelinstance.ModelinstanceFactory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.modelinstance.categories.ModelElementCategoryRegistry;
import de.uni_paderborn.fujaba.modelinstance.ui.FujabaNewwizardPlugin;
import de.uni_paderborn.fujaba.modelinstance.ui.Messages;
import de.uni_paderborn.fujaba.modelinstance.ui.commands.CreateDiagramCommand;
import de.uni_paderborn.fujaba.modelinstance.ui.diagrams.DiagramEditorUtil;
import de.uni_paderborn.fujaba.modelinstance.ui.diagrams.IDiagramInformation;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.Signature;

/**
 * @generated
 */
public class ComponentStoryDiagramCreationWizard
		extends
		de.uni_paderborn.fujaba.modelinstance.ui.diagrams.AbstractFujabaDiagramNewWizard {

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewComponentstorydiagramWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory();
	}

	//override because we want to initialize a signature upon creation of the diagram
	@Override
	public Resource createDiagram(URI diagramURI, final URI modelURI,
			IProgressMonitor progressMonitor) {

		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor.beginTask(
				Messages.DiagramEditorUtil_CreateDiagramProgressTask, 3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		final String diagramName = diagramURI.lastSegment();
		final Resource modelResource = editingDomain.getResourceSet()
				.getResource(modelURI, true);

		String signatureName = diagramURI.lastSegment().substring(0,
				diagramURI.lastSegment().lastIndexOf("."));
		ComponentStoryRule cSR = null;

		AbstractTransactionalCommand createInitModelElementsCommand = null;
		if (getSelectedElement() == null) {
			cSR = getInitialComponentStoryRule(modelResource, signatureName);
			createInitModelElementsCommand = new AddInitialComponentStoryRuleCommand(
					cSR, editingDomain, "Add initial ComponentStoryRule",
					Collections.EMPTY_LIST, getDiagramInformation()) {

				@Override
				protected CommandResult doExecuteWithResult(
						IProgressMonitor monitor, IAdaptable info)
						throws ExecutionException {

					ModelElementCategory elementCategory = null;
					List<?> rootElements = modelResource.getContents();
					if (!rootElements.isEmpty()) {
						Object rootElement = rootElements.get(0);
						if (rootElement instanceof RootNode) {
							RootNode rootNode = (RootNode) rootElement;
							elementCategory = getModelElementCategory(rootNode,
									diagramInformation
											.getModelElementCategoryKey());

							if (compoStoryRule != null) {
								elementCategory.getModelElements().add(
										(ExtendableElement) compoStoryRule);
							}
						}
					}

					return CommandResult.newOKCommandResult();
				}
			};
		}

		EObject selectedElement = getSelectedElement() == null ? cSR
				: getSelectedElement();

		AbstractTransactionalCommand command = new CreateDiagramCommand(
				editingDomain,
				Messages.DiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST, modelResource, diagramResource,
				selectedElement, getSelectedContents(), diagramName,
				getDiagramInformation());
		try {
			if (createInitModelElementsCommand != null) {
				IStatus status = OperationHistoryFactory.getOperationHistory()
						.execute(createInitModelElementsCommand,
								new SubProgressMonitor(progressMonitor, 1),
								null);
				if (status.isOK()) {
					modelResource.save(DiagramEditorUtil.getSaveOptions());
				}
			}
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create model and diagramResource", e); //$NON-NLS-1$
		} catch (IOException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Save operation failed for: " + diagramURI, e); //$NON-NLS-1$
		}
		DiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(modelResource));
		DiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(diagramResource));
		return diagramResource;
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

	private ComponentStoryRule getInitialComponentStoryRule(
			Resource modelResource, String signatureName) {
		ComponentStoryRule initComponentStoryrule = ComponentstorydiagramFactory.eINSTANCE
				.createComponentStoryRule();

		Signature signature = ReconfigurationFactory.eINSTANCE
				.createSignature();
		signature.setName(signatureName);

		initComponentStoryrule.setSignature(signature);

		return initComponentStoryrule;
	}

	@Override
	public EObject getSelectedElement() {
		EObject selectedElement = null;
		if (diagramElementSelectionPage != null) {
			selectedElement = diagramElementSelectionPage.getSelectedElement();
		}

		return selectedElement;
	}

	abstract class AddInitialComponentStoryRuleCommand extends
			AbstractTransactionalCommand {
		protected ComponentStoryRule compoStoryRule;
		protected IDiagramInformation diagramInformation;

		public AddInitialComponentStoryRuleCommand(
				ComponentStoryRule componentStoryRule,
				TransactionalEditingDomain domain, String label,
				List affectedFiles, IDiagramInformation diagramInformation) {
			super(domain, label, affectedFiles);
			this.compoStoryRule = componentStoryRule;
			this.diagramInformation = diagramInformation;
		}

	}
}
