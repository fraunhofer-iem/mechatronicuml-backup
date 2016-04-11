package org.muml.reconfiguration.ui.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;
import org.muml.reconfiguration.ReconfigurableStructuredComponent;
import org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart;

public class GenerateManagerAndExecutorImplementationCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		//get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		//collect all ReconfigurableStructureComponents from the selection
		Iterator<?> iter = ((IStructuredSelection) selection).iterator();
		while(iter.hasNext()){
			Object currentObject = iter.next();
			
			//set up variables
			ReconfigurableStructuredComponent sc = null;
			EditingDomain editingDomain = null;
			
			//if command is triggered via the graphical editor, the selection contains an EditPart
			if(currentObject instanceof ReconfigurableStructuredComponentEditPart){
			
				ReconfigurableStructuredComponentEditPart editPart = (ReconfigurableStructuredComponentEditPart) currentObject;
			
				sc = (ReconfigurableStructuredComponent) ((View) editPart.getModel()).getElement();
				editingDomain = editPart.getEditingDomain();		
			} else if (currentObject instanceof ReconfigurableStructuredComponent){
				//if the command is triggered via the tree editor, the selection contains a ReconfigurableStructuredComponent
				sc = (ReconfigurableStructuredComponent) currentObject;
				
				//obtain the editing domain for the resource set
				editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(sc);
				if(editingDomain == null){
					//create new editing domain because no editing domain exists yet
					ResourceSet rset = sc.eResource().getResourceSet();
					editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rset);
				}
			} else {
				//there is an object within the selection, which is not supported -> ignore
				continue;
			}
			
			editingDomain.getCommandStack().execute(new GenerateManagerAndExecutorImplementationTransformationCommand(sc));
			
		}
		
		return null;
	}
	
	/**
	 * This function calls the model transformations that actually generate the implementations
	 * for the manager and the executor of the given ReconfigurableStructuredComponent.
	 * Before generating the implementations, this function deletes any existing implementations.
	 * @param sc
	 */
	private void generateManagerAndExecutorImplementations(ReconfigurableStructuredComponent sc){
		generateManagerImplementation(sc);
		generateExecutorImplementation(sc);
	}
	
	/**
	 * This function calls the model transformation that actually generates the implementation
	 * for the manager of the given ReconfigurableStructuredComponent.
	 * Before generating the implementation, this function deletes any existing implementation.
	 * @param sc
	 */
	private void generateManagerImplementation(ReconfigurableStructuredComponent sc){
		//obtain manager and executor and, if present, completely delete the behavior
		if (sc.getManager().getBehavior() != null){
			EcoreUtil.delete(sc.getManager().getBehavior(), true);
		}

		//generate new behavior specifications 
		ModelElementCategory category = (ModelElementCategory) sc.eContainer();
		RootNode rootNode = (RootNode) category.eContainer();

		URI transformationURI = URI
				.createPlatformPluginURI(
						"/org.muml.reconfiguration.ui/transforms/GenerateManagerImplementation.qvto",
						true);

		// create executor and execution context
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();

		// create input extend containing the component and the category
		List<ReconfigurableStructuredComponent> compList = new ArrayList<ReconfigurableStructuredComponent>();
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
	}
	
	
	/**
	 * This function calls the model transformation that actually generates the implementation
	 * for the manager of the given ReconfigurableStructuredComponent.
	 * Before generating the implementation, this function deletes any existing implementation.
	 * @param sc
	 */
	private void generateExecutorImplementation(ReconfigurableStructuredComponent sc){
		//obtain manager and executor and, if present, completely delete the behavior
		if (sc.getExecutor().getBehavior() != null){
			EcoreUtil.delete(sc.getExecutor().getBehavior(), true);
		}

		//generate new behavior specifications 
		ModelElementCategory category = (ModelElementCategory) sc.eContainer();
		RootNode rootNode = (RootNode) category.eContainer();

		URI transformationURI = URI
				.createPlatformPluginURI(
						"/org.muml.reconfiguration.ui/transforms/GenerateExecutorImplementation.qvto",
						true);

		// create executor and execution context
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();

		// create input extend containing the component and the category
		List<ReconfigurableStructuredComponent> compList = new ArrayList<ReconfigurableStructuredComponent>();
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
	}
	
	/**
	 * Helper class to edit the resource/model.
	 * 
	 * Direct manipulation would lead to a "java.lang.IllegalStateException:
	 * Cannot modify resource set without a write transaction"
	 * 
	 */
	class GenerateManagerAndExecutorImplementationTransformationCommand extends ChangeCommand {
		
		private ReconfigurableStructuredComponent sc;

		public GenerateManagerAndExecutorImplementationTransformationCommand(ReconfigurableStructuredComponent comp) {
			super(comp);
			setLabel("Generate Manager and Executor Implementation");
			this.sc = comp;
		}

		@Override
		protected void doExecute() {

			generateManagerAndExecutorImplementations(sc);
			
		}
	}
	
}
