package org.muml.pim.ui.contextmenu.handlers.discreteInteractionEndpoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.common.edit.commands.ExecuteQvtoTransformationCommand;
import org.muml.core.common.edit.commands.StoringExecuteQvtoTransformationCommand;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.ui.Activator;

public class CreateMessageBufferForEveryReceiverMessageTypeHandler extends AbstractHandler{

	public static final String CreateMessageBufferForEveryReceiverMessageTypPATH = "";	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		EditingDomain editingDomain;
		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		List<DiscreteInteractionEndpoint> objects = new ArrayList<DiscreteInteractionEndpoint>();

		org.eclipse.emf.ecore.resource.Resource ecoreResource = null;
		for (Object selectedElement : ((IStructuredSelection) selection).toArray()) {
			EObject object = null;
			if (selectedElement instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) selectedElement;
				selectedElement = adaptable.getAdapter(EObject.class);
			}
			if (selectedElement instanceof EObject) {
				object = (EObject) selectedElement;
			}
			if (object != null && ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT.isSuperTypeOf(object.eClass())) {
				if (ecoreResource == null) {
					ecoreResource = object.eResource();
				} else if (ecoreResource != object.eResource()) {
					continue;
				}
				objects.add((DiscreteInteractionEndpoint) object);
			}
		}

		if (!objects.isEmpty()) {
			editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(objects.get(0));
			for (DiscreteInteractionEndpoint endpoint : objects) {
				executeQVTO(endpoint, editingDomain);
				
			}
		}
		return null;
	}

	public  static Diagnostic executeQVTO(DiscreteInteractionEndpoint endpoint, EditingDomain editingDomain ) {
		ModelExtent me = new BasicModelExtent(Arrays.asList(new EObject[] { endpoint }));
		
		TransformationExecutor executor = Activator.getInstance().getTransformationExecutor(Messages.createMessageBufferForEveryMessageType, true);
		
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(executor, Arrays.asList(me));
		
		if(command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}
		
		return command.getDiagnostic(); 
	}
	
}
