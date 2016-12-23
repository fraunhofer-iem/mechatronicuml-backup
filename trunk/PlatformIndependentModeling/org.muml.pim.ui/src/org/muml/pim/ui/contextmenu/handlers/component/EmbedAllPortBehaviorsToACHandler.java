package org.muml.pim.ui.contextmenu.handlers.component;

import java.util.Arrays;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.common.edit.commands.StoringExecuteQvtoTransformationCommand;
import org.muml.pim.behavior.Behavior;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.StaticAtomicComponent;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.ui.Activator;

public class EmbedAllPortBehaviorsToACHandler extends AbstractHandler {

	public EmbedAllPortBehaviorsToACHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		EditingDomain editingDomain;

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		for (Object selectedElement : ((IStructuredSelection) selection)
				.toArray()) {
			EObject object = null;
			if (selectedElement instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) selectedElement;
				selectedElement = adaptable.getAdapter(EObject.class);
			}
			if (selectedElement instanceof EObject) {
				object = (EObject) selectedElement;
			}
			if (object != null
					&& ComponentPackage.Literals.ATOMIC_COMPONENT
							.isSuperTypeOf(object.eClass())) {
				editingDomain = AdapterFactoryEditingDomain
						.getEditingDomainFor(object);
				AtomicComponent atomicComponent = (StaticAtomicComponent) object;

				Behavior behavior = atomicComponent.getBehavior();
				if (behavior == null
						|| !RealtimestatechartPackage.Literals.REALTIME_STATECHART
								.isSuperTypeOf(behavior.eClass())) {
					MessageDialog
							.openInformation(window.getShell(),
									"Behavior not specified", //$NON-NLS-1$
									"A Real-Time Statechart must be set as behavior for the atomic component."); //$NON-NLS-1$
				} else {
					embedPortBehavopr(editingDomain, atomicComponent);
				}

			}
		}

		return null;
	}

	private static void embedPortBehavopr(EditingDomain editingDomain,
			AtomicComponent atomicComponent) {
		ModelExtent inputExtent = new BasicModelExtent(
				Arrays.asList(new EObject[] { atomicComponent }));

		ModelExtent outputExtent = new BasicModelExtent();

		// Load QVTO script
		final TransformationExecutor transformationExecutor = Activator
				.getInstance()
				.getTransformationExecutor(
						Messages.EmbedAllPortBehaviorsToACHandler_PathEmbedAllPortBehaviorInACTransformation,
						false);
		StoringExecuteQvtoTransformationCommand command = new StoringExecuteQvtoTransformationCommand(
				transformationExecutor, inputExtent, outputExtent);

		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
	}

}
