package org.muml.verification.core.reachanalysis.rtsc.actions;

import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.verification.core.reachanalysis.rtsc.RTSCReachabilityComputation;
import org.muml.verification.core.reachanalysis.rtsc.export.RTSCExporter;



public class ZoneGraphAction implements IObjectActionDelegate {
	
	private ISelection selection;
	
	State state;
	
	
	/***********************************************/
	/***    Debugging stuff     ********************/
	private boolean debugGuards = false; 
	private double attributeValue = 5;
	private String attributeName = "x";
	/***********************************************/
	
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}
	
	/**
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		
		
		for (Iterator<?> selectionIterator = ((StructuredSelection)selection).iterator(); selectionIterator.hasNext();) {
			GraphicalEditPart graphicalEditPart = (GraphicalEditPart) selectionIterator.next();
			Object modelElement = ((org.eclipse.gmf.runtime.notation.Node)graphicalEditPart.getModel()).getElement();
			if (modelElement != null &&  modelElement instanceof State){
				this.state = (State) modelElement;
			}
		}

		if (state != null) 
		{
			System.out.println("Generating Zone Graph");
			HashSet<RealtimeStatechart> rtscs = new HashSet<RealtimeStatechart>();
			for (Region region : state.getEmbeddedRegions())
			{
				rtscs.add(region.getEmbeddedStatechart());
			}
			
			if (debugGuards)
				rtscs = modifyStatecharts(rtscs);
			
			RTSCReachabilityComputation rtscReach = new RTSCReachabilityComputation(rtscs);
			rtscReach.computeReachabilityGraph();
			
			
		    RTSCExporter gvExport = new RTSCExporter();
		    gvExport.export(rtscReach.getReachabilityGraph());
			System.out.println("finished");
		}
		else
			System.out.println("ERROR: state == null");
	}

	private HashSet<RealtimeStatechart> modifyStatecharts(
			HashSet<RealtimeStatechart> rtscs) {
		HashSet<RealtimeStatechart> modifiedRtscs = new HashSet<RealtimeStatechart>();
		EcoreFactory ecoreFactory = new EcoreFactoryImpl();
		System.out.println("modifying statecharts: ");
		for (RealtimeStatechart rtsc : rtscs)
		{	
			System.out.println(rtsc.getName());
			EClass rtscEClass = ecoreFactory.createEClass();
			EAttribute att = ecoreFactory.createEAttribute();
			EDataType type = ecoreFactory.createEDataType();

			type.setInstanceClass(Double.TYPE);
			EPackage pack = ecoreFactory.createEPackage();
			pack.getEClassifiers().add(type);
			att.setEType(type);
			att.setName(attributeName);
			att.setDefaultValue(new Double(attributeValue));
			rtscEClass.getEStructuralFeatures().add(att);
			((EObjectImpl)rtsc.getBehavioralElement()).eSetClass(rtscEClass); 
			
			for (EAttribute attribute : rtsc.getBehavioralElement().eClass().getEAllAttributes())
			{
				System.out.println("added attribute " + attribute.getName() + " default value " + attribute.getDefaultValue() + " of type " + attribute.getEType());
			}
			modifiedRtscs.add(rtsc);
			
		}
		
		return modifiedRtscs;
	}

	
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}


}
