package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.common.edit.commands.ExecuteQvtoTransformationCommand;
import org.storydriven.storydiagrams.activities.Activity;

import de.uni_paderborn.fujaba.muml.component.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.reachanalysis.sdm.SDMReachabilityComputation;
import de.uni_paderborn.fujaba.muml.reachanalysis.sdm.export.SDMReachabilityGraphExporter;
import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent;
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

				List<Activity> activities = csd2sd(editPart.getEditingDomain(), reconfComponent);

				HashSet<EObject> initialGraphObjects = new HashSet<EObject>();
				//check whether explicit initial configuration has been set
				if(reconfComponent.getInitialConfiguration() != null){
					initialGraphObjects.add(reconfComponent.getInitialConfiguration());
					initialGraphObjects.add(reconfComponent);
				} else { // if not, built default initial configuration
					initialGraphObjects.add(reconfComponent);
					initialGraphObjects.add(buildDefaultInitialCIC(reconfComponent));
				}

				SDMReachabilityComputation reachComp = new SDMReachabilityComputation(initialGraphObjects, activities);
				reachComp.setMaxPathLength(5);
				reachComp.computeReachabilityGraph();
				
				SDMReachabilityGraphExporter exporter = new SDMReachabilityGraphExporter();
				exporter.export(reachComp.getReachabilityGraph());
			}



		}

		return null;
	}
	
	public static List<Activity> csd2sd(EditingDomain editingDomain, ReconfigurableStructuredComponent reconfComp) {
		
		List<EObject> inputActivities = new BasicEList<EObject>();
		for(ExecutorSpecificationEntry mSE : reconfComp.getExecutor().getSpecificationEntries()){
			if(mSE.getReconfigurationRule() instanceof ComponentStoryRule){
				Activity activity = ((ComponentStoryRule) mSE.getReconfigurationRule()).getActivity();
				inputActivities.add(activity);
			}
		}
		
		ModelExtent inputExtent = new BasicModelExtent(inputActivities);
		ModelExtent outputExtent = new BasicModelExtent();
		
		List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] { inputExtent, outputExtent });
		//List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] { inputExtent });

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
		
		
		List<Activity> activities = new ArrayList<Activity>();
		for(EObject obj : outputExtent.getContents()){
			if (obj instanceof Activity){
				activities.add((Activity)obj);
			}
		}
		
		return activities;
	}
	
	private ComponentInstanceConfiguration buildDefaultInitialCIC(ReconfigurableComponent comp){
		
		//TODO: implement
		
		return null;
	}


}
