package de.uni_paderborn.fujaba.muml.reconfiguration.ui.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.component.StaticStructuredComponent;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart;

public class MakeStructuredComponentReconfigurableCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		//get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		//collect all StaticStructureComponents from the selection
		Iterator iter = ((IStructuredSelection) selection).iterator();
		while(iter.hasNext()){
			GraphicalEditPart editPart = (GraphicalEditPart) iter.next();
			
			//add StaticStructuredComponent to list
			if(editPart instanceof StaticStructuredComponentEditPart){
				StaticStructuredComponent sc = (StaticStructuredComponent) ((View) editPart.getModel()).getElement();

				ICommandProxy cmd = new ICommandProxy(
						new StaticStructuredComponentTransformationCommand(editPart
								.getEditingDomain(), sc));
				cmd.execute();
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
		
		
	}
	
	/**
	 * Helper class to edit the resource/model.
	 * 
	 * Direct manipulation would lead to a "java.lang.IllegalStateException:
	 * Cannot modify resource set without a write transaction"
	 * 
	 */
	class StaticStructuredComponentTransformationCommand extends AbstractTransactionalCommand {
		
		private StaticStructuredComponent sc;

		public StaticStructuredComponentTransformationCommand(
				TransactionalEditingDomain editingDomain, StaticStructuredComponent comp) {
			super(editingDomain, "Make Structured Component Reconfigurable", null);
			this.sc = comp;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {

			
			makeStructuredComponentReconfigurable(sc);

			return CommandResult.newOKCommandResult();
		}
	}

}
