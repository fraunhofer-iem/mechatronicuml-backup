package de.uni_paderborn.fujaba.muml.ui.contextmenu.handlers.component;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.common.FujabaCommonPlugin;
import de.uni_paderborn.fujaba.common.edit.commands.StoringExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.modelinstance.ui.batch.BatchDiagramCreationWizard;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.ui.Activator;

public class CopyRolePropertiesToPortHandler extends AbstractHandler {

	public CopyRolePropertiesToPortHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		EditingDomain editingDomain = null;

		ISelection selection = HandlerUtil.getCurrentSelection(event);

		List<DiscretePort> objects = new ArrayList<DiscretePort>();

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
			if (object != null && ComponentPackage.Literals.DISCRETE_PORT.isSuperTypeOf(object.eClass())
					&& ComponentPackage.Literals.ATOMIC_COMPONENT
							.isSuperTypeOf(((DiscretePort) object).getComponent().eClass())) {
				if (ecoreResource == null) {
					ecoreResource = object.eResource();
				} else if (ecoreResource != object.eResource()) {
					continue;
				}
				objects.add((DiscretePort) object);
			}
		}

		if (!objects.isEmpty() && editingDomain == null) {
			editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(objects.get(0));
			for (DiscretePort port : objects) {
				copyRolePropertiesToPort((AtomicComponent) port.getComponent(), (DiscretePort) port, window.getShell(),
						editingDomain);
			}
		}

		return null;

	}

	public static void copyRolePropertiesToPort(final AtomicComponent atomicComponent, final Shell shell,
			final EditingDomain editingDomain) {
		for (Port port : atomicComponent.getPorts()) {
			if (ComponentPackage.Literals.DISCRETE_PORT.isSuperTypeOf(port.eClass())) {
				CopyRolePropertiesToPortHandler.copyRolePropertiesToPort(atomicComponent, (DiscretePort) port, shell,
						editingDomain);
			}
		}
		// if no RTSC for the Component have been created call the
		// transformation to create the ComponentRTSC
		// call the transformation
		executeCopyRoleTransformation(editingDomain, atomicComponent, null, false);
		/**
		 * Create the Component RTSC Diagram
		 */

		createComponentRTSCDiagram(atomicComponent, shell);
		String finalReportMessage = "A new RTSC has been created for the Component:" //$NON-NLS-1$
				+ atomicComponent.getName() + "."; //$NON-NLS-1$

		MessageDialog.openInformation(shell, "Transformation Report", //$NON-NLS-1$
				finalReportMessage);

	}

	public static void copyRolePropertiesToPort(final AtomicComponent atomicComponent, final DiscretePort port,
			final Shell shell, final EditingDomain editingDomain) {

		boolean isComponentRTSCCreated = false;
		boolean shallPortRTSCbeReplaced = false;
		String finalReportMessage = ""; //$NON-NLS-1$

		boolean hadReceiverMessageBuffer = !port.getReceiverMessageBuffer().isEmpty();
		Role role = port.getRefinedRole();

		// check whether role and all necessary behavior references are set
		if (role == null) {
			finalReportMessage = "Refined Role must be set for this Port, to copy the Role properties."; //$NON-NLS-1$
		} else if (role.getCardinality() != null && role.getCardinality().getUpperBound().getValue() > 1
				&& role.getCoordinatorBehavior() == null && role.getSubroleBehavior() == null) {
			finalReportMessage = "The multi role needs to specify a \"SubroleBehavior\" and a \"AdaptationBehavior\"."; //$NON-NLS-1$
		}

		else if (FujabaCommonPlugin.showValidationResults(Collections.singletonList(role),
				"Role validation failed, no role properties were copied.")) { //$NON-NLS-1$
			/**
			 * If the port already has a behavior; ask, if it should be
			 * replaced. If yes, replace it. If no, end the transformation.
			 */
			if (port.getBehavior() != null) {
				String message = "For the port:" + port.getName() //$NON-NLS-1$
						+ " the RTSC:" //$NON-NLS-1$
						+ ((RealtimeStatechart) port.getBehavior()).getName() + " already exists"; //$NON-NLS-1$
				MessageDialog dialog = new MessageDialog(shell, "Copy Role Properties to Port", null, message, //$NON-NLS-1$
						MessageDialog.QUESTION,
						new String[] { "Cancel", //$NON-NLS-1$
								"Replace Existing RTSC" }, //$NON-NLS-1$
						0);
				int result = dialog.open();
				// cancel has been pressed
				if (result != 0) {
					shallPortRTSCbeReplaced = true;
				} else {
					return;
				}
			}

			// create component RTSC if we have a port of an atomic component
			// that has no behavior yet
			if (atomicComponent != null && atomicComponent.getBehavior() == null) {
				isComponentRTSCCreated = true;

			}

			// call the transformation
			Diagnostic diagnostic = executeCopyRoleTransformation(editingDomain, atomicComponent, port,
					shallPortRTSCbeReplaced);
			if (diagnostic.getCode() == Diagnostic.OK) {
				if (hadReceiverMessageBuffer) {
					finalReportMessage += "Role properties have been successfully copied to the Port. Existing MessageBuffer specification was overwritten."; //$NON-NLS-1$

				} else {
					finalReportMessage += "Role properties have been successfully copied to the Port.";
				}

				/**
				 * Create the Component RTSC Diagram
				 */
				if (isComponentRTSCCreated) {
					createComponentRTSCDiagram(atomicComponent, shell);
					finalReportMessage += "\n" //$NON-NLS-1$
							+ "A new RTSC has been created for the Component:" //$NON-NLS-1$
							+ atomicComponent.getName() + "."; //$NON-NLS-1$

				}
			} else {
				finalReportMessage += "The QVTo Transformation failed with message \n" + diagnostic.getMessage();
			}

		}
		MessageDialog.openInformation(shell, "Transformation Report", //$NON-NLS-1$
				finalReportMessage);

	}

	private static Diagnostic executeCopyRoleTransformation(EditingDomain editingDomain,
			AtomicComponent atomicComponent, DiscretePort port, final boolean replacePortRTSC) {
		ModelExtent inputExtent;
		if (port != null && atomicComponent != null) {
			inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { atomicComponent, port }));

		} else {
			inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { atomicComponent }));

		}
		ModelExtent outputExtent = new BasicModelExtent();

		// Load QVTO script
		final TransformationExecutor transformationExecutor = Activator.getInstance().getTransformationExecutor(
				Messages.CopyRolePropertiesToPortHandler_PathCopyRolePropertiesToPortTransformation, false);

		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("replacePortRTSC", replacePortRTSC); //$NON-NLS-1$
		StoringExecuteQvtoTransformationCommand command = new StoringExecuteQvtoTransformationCommand(
				transformationExecutor, inputExtent, outputExtent, context);

		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
		return command.getDiagnostic();
	}

	private static void createComponentRTSCDiagram(AtomicComponent atomicComponent, Shell shell) {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		final Resource resource = atomicComponent.eResource();
		final IFile file = workspaceRoot.getFile(new Path(resource.getURI().toPlatformString(true)));
		final Collection<EObject> elements = new ArrayList<EObject>();
		elements.add(atomicComponent.getBehavior());
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
		try {
			dialog.run(true, false, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

					BatchDiagramCreationWizard wizard = new BatchDiagramCreationWizard();
					IStructuredSelection selection = new StructuredSelection(file);

					wizard.init(null, selection);
					wizard.createDiagrams(elements, monitor);

				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
