package org.muml.pim.ui.contextmenu.handlers.component;

import java.io.IOException;
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
import org.muml.core.common.FujabaCommonPlugin;
import org.muml.core.common.edit.commands.StoringExecuteQvtoTransformationCommand;
import org.muml.core.modelinstance.ui.batch.BatchDiagramCreationWizard;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.Port;
import org.muml.pim.protocol.Role;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.ui.Activator;

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

	}

	public static void copyRolePropertiesToPort(final AtomicComponent atomicComponent, final DiscretePort port,
			final Shell shell, final EditingDomain editingDomain) {

		boolean createComponentRTSC = false;
		boolean shallPortRTSCbeReplaced = false;
		boolean hadReceiverMessageBuffer = !port.getReceiverMessageBuffer().isEmpty();
		Role role = port.getRefinedRole();

		// check whether role and all necessary behavior references are set
		if (role == null) {
			MessageDialog.openInformation(shell, "Transformation Report",
					"Refined Role must be set for this Port, to copy the Role properties.");
			return;
		} else if (role.getCardinality() != null && role.getCardinality().getUpperBound().getValue() > 1
				&& role.getCoordinatorBehavior() == null && role.getSubroleBehavior() == null) {
			MessageDialog.openInformation(shell, "Transformation Report", //$NON-NLS-1$
					"The multi role needs to specify a \"SubroleBehavior\" and a \"AdaptationBehavior\".");
			return;
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
				createComponentRTSC = true;

			}

			// execute the transformation
			createComponentRTSCDiagram(atomicComponent, shell, editingDomain, port, shallPortRTSCbeReplaced,
					createComponentRTSC, hadReceiverMessageBuffer);
		}

	}

	private static void createComponentRTSCDiagram(final AtomicComponent atomicComponent, final Shell shell,
			final EditingDomain editingDomain, final DiscretePort port, final boolean replacePortRTSC,
			final boolean createComponentRTSC, final boolean hadReceiverMessageBuffer) {
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
					String finalReportMessage = ""; //$NON-NLS-1$
					Diagnostic diagnostic = executeCopyRoleTransformation(editingDomain, atomicComponent, port,
							replacePortRTSC);
					if (diagnostic.getCode() == Diagnostic.OK) {
						if (hadReceiverMessageBuffer) {
							finalReportMessage += "Role properties have been successfully copied to the Port. Existing MessageBuffer specification was overwritten."; //$NON-NLS-1$

						} else {
							finalReportMessage += "Role properties have been successfully copied to the Port.";
						}
						
						//fix for #1407
						try {
							resource.save(Collections.EMPTY_MAP);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						/**
						 * Create the Component RTSC Diagram
						 */

						if (createComponentRTSC) {
							BatchDiagramCreationWizard wizard = new BatchDiagramCreationWizard();
							IStructuredSelection selection = new StructuredSelection(file);

							wizard.init(null, selection);
							wizard.createDiagrams(elements, monitor);
							finalReportMessage += "\n" //$NON-NLS-1$
									+ "A new RTSC has been created for the Component:" //$NON-NLS-1$
									+ atomicComponent.getName() + "."; //$NON-NLS-1$
						}

					} else {
						finalReportMessage += "The QVTo Transformation failed with message \n"
								+ diagnostic.getMessage();
					}

					MessageDialog.openInformation(shell, "Transformation Report", //$NON-NLS-1$
							finalReportMessage);
				}
			});
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private static Diagnostic executeCopyRoleTransformation(EditingDomain editingDomain,
			AtomicComponent atomicComponent, DiscretePort port, final boolean replacePortRTSC) {
		ModelExtent inputExtent;
		if (port != null && atomicComponent != null) {
			inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { atomicComponent, port }));

		} 
		else {
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

		return command.getDiagnostic();
	}

}
