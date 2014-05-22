package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.handlers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.storydriven.storydiagrams.activities.Activity;

import de.uni_paderborn.fujaba.common.FujabaCommonPlugin;
import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart;

public class ComputePossibleConfigurationsHandler extends AbstractHandler {

	public ComputePossibleConfigurationsHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		// collect all StaticStructureComponents from the selection
		Iterator iter = ((IStructuredSelection) selection).iterator();
		while (iter.hasNext()) {
			GraphicalEditPart editPart = (GraphicalEditPart) iter.next();

			// add ReconfigurableStructuredComponent to list
			if (editPart instanceof ReconfigurableStructuredComponentEditPart) {
				ReconfigurableStructuredComponent reconfComponent = (ReconfigurableStructuredComponent) ((View) editPart.getModel())
						.getElement();

				ModelExtent sds = csd2sd(editPart.getEditingDomain(), reconfComponent);
			}

		}

		return null;
	}
	
	public static ModelExtent csd2sd(EditingDomain editingDomain, ReconfigurableStructuredComponent reconfComp) {
		
		List<Activity> inputActivities = new BasicEList<Activity>();
		for(ManagerSpecificationEntry mSE : reconfComp.getManager().getSpecificationEntries()){
			if(mSE.getReconfigurationRule() instanceof ComponentStoryRule){
				Activity activity = ((ComponentStoryRule) mSE.getReconfigurationRule()).getActivity();
				inputActivities.add(activity);
			}
		}
		
		ModelExtent inputExtent = new BasicModelExtent(inputActivities);
		ModelExtent outputExtent = new BasicModelExtent();
		
		List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] { inputExtent, outputExtent });
		

		// Load QVTO script
		TransformationExecutor transformationExecutor = Activator.getInstance()
				.getTransformationExecutor("/de.uni_paderborn.fujaba.muml.componentstorydiagram.sdm.transforms/transforms/CSD2SDTransform.qvto", false);		
		
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor,
				modelExtents);

		if (command.canExecute()){
			editingDomain.getCommandStack().execute(command);
		}
		
		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
		return outputExtent;
	}

//	private static RootNode getRootNode(DiscretePort thePort) {
//		return (RootNode) thePort.getComponent().eContainer().eContainer();
//	}

}
