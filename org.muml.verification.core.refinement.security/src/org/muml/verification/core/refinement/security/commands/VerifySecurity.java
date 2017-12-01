package org.muml.verification.core.refinement.security.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.verification.core.refinement.testautomata.Verification;
import org.muml.verification.core.refinement.testautomata.commands.VerifyRefinement;

public class VerifySecurity extends AbstractHandler {
	
	private static final String
	txtCorrect = "The Graph is secure",
	msgCorrect = "The Graph has no security issues. \nDo you want to export the reachabilitygraph to your workspace?",
	txtIncorrect = "The Graph is not secure",
	msgIncorrect = "The Graph has security issues. \nDo you want to export the reachabilitygraph to your workspace?";
	

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		
		Iterator<?> selectionIterator = ((StructuredSelection) selection)
				.iterator();
		while (selectionIterator.hasNext()) {
			Object curObj = selectionIterator.next();
			if (curObj instanceof GraphicalEditPart) {
				EditPartViewer viewer = ((GraphicalEditPart) curObj).getViewer();
			}
			EObject element = getSemanticElement(curObj);
			
			if (element instanceof RealtimeStatechart) {
				RealtimeStatechart realtimeStatechart = (RealtimeStatechart) element;

				//obtain port from selection
				Verification veri = new Verification();
				boolean secure = veri.checkSecurityRefinement(realtimeStatechart);
				generateMessage(secure, veri);
				Diagnostician.INSTANCE.validate(realtimeStatechart);
			}
		}
		return null;
	}

	private EObject getSemanticElement(Object object) {
		EObject element = null;
		
		// Get EditPart.getModel() in a generic way
		
		// TreeEditor
		if (object instanceof EObject) {
			element = (EObject) object;
			
		// GMF
		} else if (object instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable)object;
			if (adaptable.getAdapter(EObject.class) != null) {
				element = (EObject)adaptable.getAdapter(EObject.class);
			}
		}
		
		// Sirius
		if (element != null && element.eClass() != null) {
			EClass eClass = element.eClass();
			EPackage ePackage = eClass.getEPackage();
			if (ePackage != null && ePackage.getNsURI() != null && ePackage.getNsURI().startsWith("http://www.eclipse.org/sirius")) {
				element = (EObject) element.eGet(eClass.getEStructuralFeature("target"));
			}
		}
		return element;
	}

	private void generateMessage(boolean correct, Verification veri) {
		String text, message;
		int icon;
		if (correct) {
			text = txtCorrect;
			message = msgCorrect;
			icon = SWT.ICON_WORKING;
		} else {
			text = txtIncorrect;
			message = msgIncorrect;
			icon = SWT.ICON_ERROR;
		}
		MessageBox dialog = new MessageBox(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell(), icon
				| SWT.YES | SWT.NO);
		dialog.setText(text);
		dialog.setMessage(message);
		Object result = dialog.open();
		if (result.equals(SWT.YES)) {
			VerifyRefinement.exportReachabilityGraph(veri);
		}
	}
	
//	private ArrayList<DiscretePort> getPorts(EditPart part){
//		
//		EditPart parent = part;
//		while (parent.getParent() != null) {
//			parent = parent.getParent();
//		}
//		
//		ArrayList<DiscretePort> ports = searchChildren(parent);
//		
//		if (ports.size()==0) {
//			System.out.println("No children found.");
//		}
//		return ports;
//	}
//	
//	private ArrayList<DiscretePort> searchChildren(EditPart part){
//		
//		ArrayList<GraphicalEditPart> parts = new ArrayList<GraphicalEditPart>();
//		ArrayList<DiscretePort> childrenList = new ArrayList<DiscretePort>();
//		
//		parts.addAll(part.getChildren());
//		int i = 0;
//		GraphicalEditPart child;
//		while (i < parts.size()){
//			child = parts.get(i);
//			parts.addAll(child.getChildren());
//			if (child instanceof DiscretePortEditPart || child instanceof DiscretePort) {
//				childrenList.add(VerifyRefinement.checkPort(child));
//			}
//			i++;
//		}
//		
//		return childrenList;
//	}

}
