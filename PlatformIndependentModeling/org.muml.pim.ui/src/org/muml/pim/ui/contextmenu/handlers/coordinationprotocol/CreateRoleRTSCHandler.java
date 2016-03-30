package org.muml.pim.ui.contextmenu.handlers.coordinationprotocol;

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
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.common.edit.commands.StoringExecuteQvtoTransformationCommand;
import org.muml.core.modelinstance.ui.batch.BatchDiagramCreationWizard;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.Role;
import org.muml.pim.ui.Activator;

public class CreateRoleRTSCHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		EditingDomain editingDomain;
		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		List<Role> objects = new ArrayList<Role>();

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
			if (object != null && ProtocolPackage.Literals.ROLE.isSuperTypeOf(object.eClass())) {
				if (ecoreResource == null) {
					ecoreResource = object.eResource();
				} else if (ecoreResource != object.eResource()) {
					continue;
				}
				objects.add((Role) object);
			}
		}

		if (!objects.isEmpty()) {
			editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(objects.get(0));
			for (Role role : objects) {

				createRoleRTSC(role, window.getShell(), editingDomain);
			}
		}

		return null;
	}

	public static void createRoleRTSC(final Role role, final Shell shell, final EditingDomain editingDomain) {

		final Resource resource = role.eResource();
		if (role.getBehavior() != null) {
			MessageDialog.openInformation(shell, "RTSC already defined!", //$NON-NLS-1$
					"The selected Role: " + role.getName() //$NON-NLS-1$
							+ " already has a RTSC."); //$NON-NLS-1$
			return;
		}

		/**
		 * Create the Role RTSC Diagram
		 */
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);

		try {
			dialog.run(false, false, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					/**
					 * Run the Transformation
					 */
					String finalReportMessage = "Created the Role's RTSC \n Created the RTSC Diagram: " //$NON-NLS-1$
							+ role.getName();
					Diagnostic diagnostic = createRoleRTSCTransformation(editingDomain, role);
					if (diagnostic.getCode() == Diagnostic.OK) {
						//fix for #1407
						try {
							resource.save(Collections.EMPTY_MAP);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Collection<EObject> elements = new ArrayList<EObject>();
						elements.add(role.getBehavior());
						BatchDiagramCreationWizard wizard = new BatchDiagramCreationWizard();
						IFile file = getFile(resource);
						IStructuredSelection selection = new StructuredSelection(file);

						wizard.init(null, selection);
						wizard.createDiagrams(elements, monitor);
					} else {
						finalReportMessage = "The QVTo Transformation failed with: \n" + diagnostic.getMessage();
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

	private static Diagnostic createRoleRTSCTransformation(EditingDomain editingDomain, Role role) {
		ModelExtent inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { role }));
		ModelExtent outputExtent = new BasicModelExtent();

		// Load QVTO script
		final TransformationExecutor transformationExecutor = Activator.getInstance()
				.getTransformationExecutor(Messages.CreateRoleRTSCHandler_PathCreateRoleRTSCTransformation, false);

		StoringExecuteQvtoTransformationCommand command = new StoringExecuteQvtoTransformationCommand(
				transformationExecutor, inputExtent, outputExtent);

		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}
		return command.getDiagnostic();

	}

	private static IFile getFile(Resource resource) {

		if (resource != null) {
			org.eclipse.emf.common.util.URI uri = resource.getURI();
			uri = resource.getResourceSet().getURIConverter().normalize(uri);
			String scheme = uri.scheme();
			if ("platform".equals(scheme) && uri.segmentCount() > 1 //$NON-NLS-1$
					&& "resource".equals(uri.segment(0))) { //$NON-NLS-1$
				StringBuilder platformResourcePath = new StringBuilder();
				for (int j = 1, size = uri.segmentCount(); j < size; ++j) {
					platformResourcePath.append('/');
					platformResourcePath.append(uri.segment(j));
				}
				return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformResourcePath.toString()));
			}
		}
		return null;
	}

}
