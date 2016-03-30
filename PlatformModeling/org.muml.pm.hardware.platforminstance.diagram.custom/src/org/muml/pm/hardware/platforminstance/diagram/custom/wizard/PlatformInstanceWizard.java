package org.muml.pm.hardware.platforminstance.diagram.custom.wizard;

import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.muml.core.common.edit.commands.ExecuteQvtoTransformationCommand;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.platforminstance.diagram.custom.part.Activator;

public class PlatformInstanceWizard extends Wizard implements INewWizard {

	// wizard pages
	private PlatformTypePage platformTypePage;

	// the model
	private WizardModel model;

	// the workbench instance

	private TransactionalEditingDomain editingDomain;

	private IStructuredSelection selection;

	public PlatformInstanceWizard(HWPlatformInstanceConfiguration selectedElement,
			TransactionalEditingDomain editingDomain) {
		this(null, selectedElement, editingDomain);
	}

	public PlatformInstanceWizard(HWPlatformInstance platformInstanceToConfigure,
			HWPlatformInstanceConfiguration selectedElement, TransactionalEditingDomain editingDomain) {
		super();
		model = new WizardModel();
		model.setSelectedHWPlatformInstanceConfiguration(selectedElement);
		model.setPlatformInstanceToConfigure(platformInstanceToConfigure);
		this.editingDomain = editingDomain;
	}

	@Override
	public void addPages() {
		platformTypePage = new PlatformTypePage();
		addPage(platformTypePage);
	}

	public IPath getModelPath() {
		@SuppressWarnings("rawtypes")
		Iterator it = selection.iterator();
		if (it.hasNext()) {
			Object object = it.next();
			IResource selectedResource = null;
			if (object instanceof IResource) {
				selectedResource = (IResource) object;
			} else if (object instanceof IAdaptable) {
				selectedResource = (IResource) ((IAdaptable) object).getAdapter(IResource.class);
			}
			if (selectedResource != null) {
				return selectedResource.getFullPath();

			}
		}
		return null;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public boolean performFinish() {

		for (IWizardPage page : this.getPages()) {
			if (page instanceof PlatformTypePage) {
				((PlatformTypePage) page).saveDataToModel();
			}
		}

		executeTransformation();

		return true;
	}

	public PlatformTypePage getPlatformTypePage() {
		return platformTypePage;
	}

	public WizardModel getModel() {
		return model;
	}

	private void executeTransformation() {
		if (editingDomain != null) {
			HWPlatformInstance hwPlatformInstanceToConfigure = model.getPlatformInstanceToConfigure();
			HWPlatform hwplatform = model.getSelectedHWPlatform();
			ModelExtent input1;
			ModelExtent output = new BasicModelExtent();
			if (hwPlatformInstanceToConfigure != null) {
				hwPlatformInstanceToConfigure.setHwplatformType(hwplatform);
				input1 = new BasicModelExtent(Collections.singletonList(hwPlatformInstanceToConfigure));
			} else {
				input1 = new BasicModelExtent(Collections.singletonList(hwplatform));
			}

			List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] { input1, output });
			// Load QVTO script
			TransformationExecutor transformationExecutor = Activator.getDefault().getTransformationExecutor();

			// Create execution context
			ExecutionContextImpl context = new ExecutionContextImpl();
			
			/**
			 * TODO Test config parameter
			 */
			context.setConfigProperty("initVector", model.getConfiguration());
			Log log = new WriterLog(new OutputStreamWriter(System.out));
			context.setLog(log);
			ExecuteQvtoTransformationCommand cmd = new ExecuteQvtoTransformationCommand(transformationExecutor,
					modelExtents, context);

			editingDomain.getCommandStack().execute(cmd);
			
			IWorkbenchPart work = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.getActivePart();
			if (work instanceof IDiagramWorkbenchPart) {

				EditPart rootEditPart = ((IDiagramWorkbenchPart) work).getDiagramEditPart();
				CanonicalEditPolicy policy = (CanonicalEditPolicy) rootEditPart
						.getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
				policy.refresh();

			}
			
		}
	}

}
