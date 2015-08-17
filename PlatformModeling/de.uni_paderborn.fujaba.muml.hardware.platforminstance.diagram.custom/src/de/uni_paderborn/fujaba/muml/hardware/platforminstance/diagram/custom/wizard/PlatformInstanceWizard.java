package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.part.Activator;

public class PlatformInstanceWizard extends Wizard implements INewWizard {

	// wizard pages
	private PlatformTypePage platformTypePage;

	// the model
	private WizardModel model;

	// the workbench instance
	private IWorkbench workbench;


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
		this.setForcePreviousAndNextButtons(true);
	}

	@Override
	public void addPages() {
		platformTypePage = new PlatformTypePage(null, true);
		addPage(platformTypePage);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		// TODO Auto-generated method stub
		if (page instanceof PlatformTypePage && ((PlatformTypePage) page).neddFurtherPage()) {
			IWizardPage nextPage = new PlatformTypePage(((PlatformTypePage) page).getFollowUpPlatforms(), false);
			addPage(nextPage);
			// nextPage.setVisible(true);

		}
		return super.getNextPage(page);
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

	/*
	 * public Resource getModelResource() { URI modelURI =
	 * URI.createPlatformResourceURI(getModelPath() .toOSString(), true); return
	 * editingDomain.getResourceSet().getResource(modelURI, true);
	 * 
	 * }
	 */

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}

	@Override
	public boolean performFinish() {

		for (IWizardPage page : this.getPages()) {
			if (page instanceof PlatformTypePage) {
				((PlatformTypePage) page).saveDataToModel();
			}
		}

		// platformTypePage.saveDataToModel();

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

			List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] { input1 ,output });
			// Load QVTO script
			TransformationExecutor transformationExecutor = Activator.getDefault().getTransformationExecutor();

			// Create execution context
			ExecutionContextImpl context = new ExecutionContextImpl();

			/**
			 * TODO Test config parameter
			 */
			context.setConfigProperty("initVector", model.getConfiguration());

			ExecuteQvtoTransformationCommand cmd = new ExecuteQvtoTransformationCommand(transformationExecutor,
					modelExtents, context);

			/*
			 * CreateInstancesCommand command = new CreateInstancesCommand( ,
			 * model.getSelectedHWPlatform(), model.getConfiguration());
			 */
			editingDomain.getCommandStack().execute(cmd);
		}
	}

}
