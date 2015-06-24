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
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
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
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.common.FujabaCommonPlugin;
import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.modelinstance.ui.batch.BatchDiagramCreationWizard;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.ui.Activator;

public class CopyRolePropertiesToPortHandler extends AbstractHandler {

	public CopyRolePropertiesToPortHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		EditingDomain editingDomain = null;

		ISelection selection = HandlerUtil.getCurrentSelection(event);

		List<DiscretePort> objects = new ArrayList<DiscretePort>();

		org.eclipse.emf.ecore.resource.Resource ecoreResource = null;
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
					&& ComponentPackage.Literals.DISCRETE_PORT
							.isSuperTypeOf(object.eClass())) {
				if (ecoreResource == null) {
					ecoreResource = object.eResource();
				} else if (ecoreResource != object.eResource()) {
					continue;
				}
				objects.add((DiscretePort) object);
			}
		}

		if (!objects.isEmpty() && editingDomain == null) {
			editingDomain = AdapterFactoryEditingDomain
					.getEditingDomainFor(objects.get(0));
			for (DiscretePort port : objects) {
				copyRolePropertiesToPort((DiscretePort) port,
						window.getShell(), editingDomain);
			}
		}

		return null;

	}

	public static void copyRolePropertiesToPort(final DiscretePort port,
			final Shell shell, final EditingDomain editingDomain) {

		boolean shallComponentRTSCbeCreated = false;
		boolean shallPortRTSCbeReplaced = false;
		String finalReportMessage = ""; //$NON-NLS-1$

		Role role = port.getRefinedRole();
		final Resource resource = port.eResource();
		boolean hadReceiverMessageBuffer = !port.getReceiverMessageBuffer()
				.isEmpty();

		// check if parent is an atomic component
		AtomicComponent atomicComponent = null;
		if (ComponentPackage.Literals.ATOMIC_COMPONENT.isSuperTypeOf(port
				.getComponent().eClass())) {
			atomicComponent = (AtomicComponent) port.getComponent();
		}

		// check whether role and all necessary behavior references are set
		if (role == null) {
			MessageDialog
					.openInformation(shell, "Role not specified", //$NON-NLS-1$
							"Refined Role must be set for this Port, to copy the Role properties."); //$NON-NLS-1$
			return;
		} else if (role.getCardinality() != null
				&& role.getCardinality().getUpperBound().getValue() > 1
				&& role.getAdaptationBehavior() == null
				&& role.getSubroleBehavior() == null) {
			MessageDialog
					.openInformation(
							shell,
							"SubroleBehavior or AdaptationBehavior not set", //$NON-NLS-1$
							"The multi role needs to specify a \"SubroleBehavior\" and a \"AdaptationBehavior\"."); //$NON-NLS-1$

			return;
		}

		else if (FujabaCommonPlugin.showValidationResults(
				Collections.singletonList(role),
				"Role validation failed, no role properties were copied.")) { //$NON-NLS-1$
			/**
			 * If the port already has a behavior; ask, if it should be
			 * replaced. If yes, replace it. If no, end the transformation.
			 */
			if (port.getBehavior() != null) {
				String message = "For the port:" + port.getName() //$NON-NLS-1$
						+ " the RTSC:" //$NON-NLS-1$
						+ ((RealtimeStatechart) port.getBehavior()).getName()
						+ " already exists"; //$NON-NLS-1$
				MessageDialog dialog = new MessageDialog(shell,
						"Copy Role Properties to Port", null, message, //$NON-NLS-1$
						MessageDialog.QUESTION, new String[] { "Cancel", //$NON-NLS-1$
								"Replace Existing RTSC" }, 0); //$NON-NLS-1$
				int result = dialog.open();
				// cancel has been pressed
				if (result == 0) {
					return;
				} else {
					shallPortRTSCbeReplaced = true;
				}
			}

			// create component RTSC if we have a port of an atomic component
			// that has no behavior yet
			if (atomicComponent != null
					&& atomicComponent.getBehavior() == null) {

				shallComponentRTSCbeCreated = true;

			}

			if (hadReceiverMessageBuffer) {
				finalReportMessage += "Role properties have been successfully copied to the Port. Existing MessageBuffer specification was overwritten."; //$NON-NLS-1$

			}
			if (shallComponentRTSCbeCreated) {
				finalReportMessage += "\n" //$NON-NLS-1$
						+ "A new RTSC has been created for the Component:" //$NON-NLS-1$
						+ atomicComponent.getName() + "."; //$NON-NLS-1$
			}

			// call the transformation
			updatePort(editingDomain, port, shallPortRTSCbeReplaced,
					shallComponentRTSCbeCreated);
			/**
			 * Create the Component RTSC Diagram
			 */
			if (shallComponentRTSCbeCreated) {
				final Collection<EObject> elements = new ArrayList<EObject>();
				elements.add(atomicComponent.getBehavior());
				ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);

				try {
					dialog.run(true, false, new IRunnableWithProgress() {

						@Override
						public void run(IProgressMonitor monitor)
								throws InvocationTargetException,
								InterruptedException {

							BatchDiagramCreationWizard wizard = new BatchDiagramCreationWizard();
							IFile file = getFile(resource);
							IStructuredSelection selection = new StructuredSelection(
									file);

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

				MessageDialog.openInformation(shell, "Transformation Report", //$NON-NLS-1$
						finalReportMessage);
			}
		}

	}

	private static void updatePort(EditingDomain editingDomain,
			DiscretePort port, final boolean replacePortRTSC,
			final boolean createComponentRTSC) {
		ModelExtent inputExtent = new BasicModelExtent(
				Arrays.asList(new EObject[] { port, getRootNode(port) }));

		final List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { inputExtent });

		// Load QVTO script
		final TransformationExecutor transformationExecutor = Activator
				.getInstance()
				.getTransformationExecutor(
						Messages.CopyRolePropertiesToPortHandler_PathCopyRolePropertiesToPortTransformation,
						false);

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents) {
			@Override
			protected void doExecute() {
				// Create execution context
				ExecutionContextImpl context = new ExecutionContextImpl();
				context.setConfigProperty("replacePortRTSC", replacePortRTSC); //$NON-NLS-1$
				context.setConfigProperty("createComponentRTSC", //$NON-NLS-1$
						createComponentRTSC);

				// Execute transformation
				ExecutionDiagnostic result = null;
				try {
					result = transformationExecutor.execute(context,
							modelExtents.toArray(new ModelExtent[] {}));
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (result != null
						&& result.getSeverity() != ExecutionDiagnostic.OK) {
					System.out
							.println("QVT-O ERROR on rule transformation. Message was:"); //$NON-NLS-1$
					System.out.println(result.getMessage());
				}
			}
		};

		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
	}

	private static RootNode getRootNode(DiscretePort thePort) {
		return (RootNode) thePort.getComponent().eContainer().eContainer();
	}

	private static IFile getFile(Resource resource) {

		if (resource != null) {
			org.eclipse.emf.common.util.URI uri = resource.getURI();
			uri = resource.getResourceSet().getURIConverter().normalize(uri);
			String scheme = uri.scheme();
			if ("platform".equals(scheme) && uri.segmentCount() > 1 //$NON-NLS-1$
					&& "resource".equals(uri.segment(0))) { //$NON-NLS-1$
				StringBuffer platformResourcePath = new StringBuffer();
				for (int j = 1, size = uri.segmentCount(); j < size; ++j) {
					platformResourcePath.append('/');
					platformResourcePath.append(uri.segment(j));
				}
				return ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(platformResourcePath.toString()));
			}
		}
		return null;
	}

}
