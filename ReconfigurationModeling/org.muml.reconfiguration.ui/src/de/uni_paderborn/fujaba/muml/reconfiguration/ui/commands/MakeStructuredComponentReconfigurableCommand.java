package de.uni_paderborn.fujaba.muml.reconfiguration.ui.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.common.DiagramEditorUtil;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.core.modelinstance.RootNode;
import org.muml.core.modelinstance.ui.FujabaNewwizardPlugin;
import org.muml.core.modelinstance.ui.diagrams.IDiagramInformation;

import de.uni_paderborn.fujaba.muml.component.StaticStructuredComponent;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent;

public class MakeStructuredComponentReconfigurableCommand extends AbstractHandler {
	
	private ReconfigurableStructuredComponent rsc;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		//get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		//collect all StaticStructureComponents from the selection
		Iterator<?> iter = ((IStructuredSelection) selection).iterator();
		while(iter.hasNext()){
			Object currentObject = iter.next();
			
			//set up variables
			StaticStructuredComponent sc = null;
			EditingDomain editingDomain = null;
			Diagram diagram = null;
			//if command is triggered via the graphical editor, the selection contains an EditPart
			if(currentObject instanceof StaticStructuredComponentEditPart){
			
				StaticStructuredComponentEditPart editPart = (StaticStructuredComponentEditPart) currentObject;
			
				EList<Resource> rs = editPart.getEditingDomain().getResourceSet().getResources();
			
				
				sc = (StaticStructuredComponent) ((View) editPart.getModel()).getElement();
				
				EditPart parent = editPart.getParent();
				
				
				if(parent.getModel() instanceof Diagram)
				diagram = (Diagram)parent.getModel();
				
				editingDomain = editPart.getEditingDomain();
				
				ModelElementCategory category = (ModelElementCategory) sc.eContainer();
				
				editingDomain.getCommandStack().execute(new StaticStructuredComponentTransformationCommand(sc));
			
				ReconfigurableStructuredComponent reconfComponent = rsc;
				IDiagramInformation diagramInformation = getDiagramInformation(reconfComponent); //null
				Collection<EObject> elements = new HashSet<EObject>();
				elements.add(reconfComponent);
				PreferencesHint preferencesHint = new PreferencesHint(diagramInformation.getPreferencesHint());
				
				//create view request
				CreateViewRequest createViewRequest = getCreatePersistedViewsRequest(diagram, elements, diagramInformation, preferencesHint);
				
				//get create view command
				Command cmd = getCreateViewCommand(createViewRequest, diagram);
				
				if (cmd != null && cmd.canExecute()) {
					SetViewMutabilityCommand.makeMutable(new EObjectAdapter(diagram))
							.execute();
					executeCreateViewsCommand(cmd, diagram);
				}

				try {
					Map<?, ?> saveOptions = DiagramEditorUtil.getSaveOptions();
					reconfComponent.eResource().save(saveOptions);
					diagram.eResource().save(saveOptions);
				} catch (IOException e) {
					FujabaNewwizardPlugin.getDefault().logError(
							"Unable to store model and diagramResource resources", e); //$NON-NLS-1$
				}
				
				
				
				
				
			} else if (currentObject instanceof StaticStructuredComponent){
				//if the command is triggered via the tree editor, the selection contains a StaticStructuredComponent
				sc = (StaticStructuredComponent) currentObject;
				
				//obtain the editing domain for the structured component
				editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(sc);
				if(editingDomain == null){
					//create new editing domain because no editing domain exists yet
					ResourceSet rset = sc.eResource().getResourceSet();
					editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rset);
					
					editingDomain.getCommandStack().execute(new StaticStructuredComponentTransformationCommand(sc));
				}
			} else {
				//there is an object within the selection, which is not supported -> ignore
				continue;
			}		
		}
		
		return null;
	}
	
	/**
	 * Helper functions that transforms one StaticStructuredComponent into a ReconfigurableStructuredComponent.
	 * This function calls a QVT-O transformation.
	 * @param sc
	 */
	private void makeStructuredComponentReconfigurable(StaticStructuredComponent sc){
		ModelElementCategory category = (ModelElementCategory) sc.eContainer();
		RootNode rootNode = (RootNode) category.eContainer();
		
		URI transformationURI = URI
				.createPlatformPluginURI(
						"/de.uni_paderborn.fujaba.muml.reconfiguration.ui/transforms/MakeStructuredComponentReconfigurable.qvto",
						true);

		// create executor and execution context
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();

		// create input extend containing the component and the category
		List<StaticStructuredComponent> compList = new ArrayList<StaticStructuredComponent>();
		compList.add(sc);
		List<RootNode> rnList = new ArrayList<RootNode>();
		rnList.add(rootNode);
		ModelExtent inputComponent = new BasicModelExtent(compList);
		ModelExtent inputCategory = new BasicModelExtent(rnList);

		// execute transformation
		ExecutionDiagnostic result = executor.execute(context, inputComponent, inputCategory);
		if (result.getSeverity() != ExecutionDiagnostic.OK) {

			System.out
					.println("A QVT-O ERROR occured while execution the transformation. Message was:");
			System.out.println(result.getMessage());
		}

		//reconfigurable component should be contained in inputComponent ModelExtent
		ReconfigurableStructuredComponent reconfComp = getReconfigurableComponentFromModelExtent(inputComponent);
		
		if(reconfComp != null){
			//add to category
			category.getModelElements().add(reconfComp);
		}
		rsc=reconfComp;
	}
	
	private ReconfigurableStructuredComponent getReconfigurableComponentFromModelExtent(ModelExtent ext){
		
		ReconfigurableStructuredComponent result = null;
		
		//iterate contents of the model extent
		for(Object curObj : ext.getContents()){
			if(curObj instanceof ReconfigurableStructuredComponent){
				result = (ReconfigurableStructuredComponent) curObj;
			}
		}
		
		return result;
	}
	
	/**
	 * Helper class to edit the resource/model.
	 * 
	 * Direct manipulation would lead to a "java.lang.IllegalStateException:
	 * Cannot modify resource set without a write transaction"
	 * 
	 */
	class StaticStructuredComponentTransformationCommand extends ChangeCommand {
		
		private StaticStructuredComponent sc;

		public StaticStructuredComponentTransformationCommand(StaticStructuredComponent comp) {
			super(comp);
			setLabel("Make Structured Component Reconfigurable");
			this.sc = comp;
		}

		@Override
		protected void doExecute() {
			makeStructuredComponentReconfigurable(sc);
		}

	}

	
	
	
	//copied from BatchDiagramCreation
	private boolean isValidDiagramElement(String modelId, EObject diagramElement) {
		IAdaptable adapter = new EObjectAdapter(diagramElement);
		IOperation operation = new CreateDiagramViewOperation(adapter, modelId,
				null);
		
		return ViewService.getInstance().provides(operation);
	}
	
	private IDiagramInformation getDiagramInformation(EObject element) {
		Map<String, IDiagramInformation> diagramInformationMap = FujabaNewwizardPlugin
				.getDefault().getDiagramInformationMap();
		for (IDiagramInformation information : diagramInformationMap.values()) {
			String modelId = information.getModelId();
			boolean useCategory = ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY
					.isSuperTypeOf(information.getDiagramElementClass());
			if (//!useCategory &&
					isValidDiagramElement(modelId, element)) {
				Collection<EObject> contents = Collections.emptyList();
				return information;
			} 
				else if (useCategory
					&& element.eContainer() instanceof ModelElementCategory
					&& isValidTopLevelNodeElement(modelId,
							element.eContainer(), element)) {
				Collection<EObject> contents = Collections
						.singletonList(element);
				return information;
			}
		}
		return null;
	}
	
	
	//copied from CreateDiagramCommand
	private CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram,
			Collection<EObject> elements, IDiagramInformation diagramInformation, PreferencesHint preferencesHint) {
		List<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>();
		Map<String, String> nodes = diagramInformation.getTopLevelNodes();
		for (EObject element : elements) {
			String hint = nodes.get(element.eClass().getName());
			if (hint != null) {
				IAdaptable elementAdapter = new ElementAdapter(element, hint);
				CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
						elementAdapter, Node.class, hint, ViewUtil.APPEND,
						true, preferencesHint);
				viewDescriptors.add(descriptor);
			}
		}
		return new CreateViewRequest(viewDescriptors);
	}
	
	// Copied from CreationEditPolicy.getCreateCommand()
		protected Command getCreateViewCommand(CreateViewRequest request,
				Diagram diagram) {

			TransactionalEditingDomain editingDomain = TransactionUtil
					.getEditingDomain(diagram);
			CompositeTransactionalCommand cc = new CompositeTransactionalCommand(
					editingDomain, DiagramUIMessages.AddCommand_Label);

			Iterator<?> descriptors = request.getViewDescriptors().iterator();

			while (descriptors.hasNext()) {
				CreateViewRequest.ViewDescriptor descriptor = (CreateViewRequest.ViewDescriptor) descriptors
						.next();

				CreateCommand createCommand = new CreateCommand(editingDomain,
						descriptor, diagram);

				cc.compose(createCommand);
			}
			return new ICommandProxy(cc.reduce());
		}
		
		// Copied from CanonicalEditPolicy$CanonicalElementAdapter.
		private class ElementAdapter extends EObjectAdapter {
			private String _hint;

			/**
			 * constructor
			 * 
			 * @param element
			 * @param hint
			 */
			public ElementAdapter(EObject element, String hint) {
				super(element);
				_hint = hint;
			}

			/** Adds <code>String.class</tt> adaptablity. */
			@SuppressWarnings("rawtypes")
			public Object getAdapter(Class adapter) {
				if (adapter.equals(String.class)) {
					return _hint;
				}
				return super.getAdapter(adapter);
			}
		}
		
		
		protected void executeCreateViewsCommand(final Command cmd, Diagram diagram) {
			Map<String, Boolean> options = null;

			// If still activating... set unprotected mode
			options = Collections.singletonMap(Transaction.OPTION_UNPROTECTED,
					Boolean.TRUE);

			AbstractEMFOperation operation = new AbstractEMFOperation(
					TransactionUtil.getEditingDomain(diagram), StringStatics.BLANK,
					options) {

				protected IStatus doExecute(IProgressMonitor monitor,
						IAdaptable info) throws ExecutionException {

					cmd.execute();

					return Status.OK_STATUS;
				}
			};
			try {
				operation.execute(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				FujabaNewwizardPlugin.getDefault().logError(
						"Unable to create initial views.", e); //$NON-NLS-1$
			}
		}
		
		private boolean isValidTopLevelNodeElement(String modelId,
				EObject diagramElement, EObject topLevelNodeElement) {
			Diagram diagram = ViewService.createDiagram(diagramElement, modelId,
					null);
			IAdaptable adapter = new EObjectAdapter(topLevelNodeElement);
			IOperation operation = new CreateNodeViewOperation(adapter, diagram,
					null, 0, false, null);
			return ViewService.getInstance().provides(operation);
		}
		
}
