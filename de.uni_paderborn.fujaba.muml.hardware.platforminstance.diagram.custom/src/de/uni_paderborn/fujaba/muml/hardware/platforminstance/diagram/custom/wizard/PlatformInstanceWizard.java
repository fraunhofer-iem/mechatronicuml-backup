package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard;

import java.util.Iterator;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.commands.CreateInstancesCommand;

public class PlatformInstanceWizard extends Wizard implements INewWizard {

	// wizard pages
	private ConfigurePage configPage;
	private PlatformTypePage platformTypePage;

	// the model
	private WizardModel model;

	// the workbench instance
	private IWorkbench workbench;

//	private TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
	//		.createEditingDomain();
	
	private TransactionalEditingDomain editingDomain;

	private IStructuredSelection selection;

	public PlatformInstanceWizard(
			HWPlatformInstanceConfiguration selectedElement, TransactionalEditingDomain editingDomain) {
		super();
		model = new WizardModel();
		model.setSelectedHWPlatformInstanceConfiguration(selectedElement);
		this.editingDomain=editingDomain;
	}

	@Override
	public void addPages() {
		platformTypePage = new PlatformTypePage();
		addPage(platformTypePage);
		configPage = new ConfigurePage();
		addPage(configPage);
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
				selectedResource = (IResource) ((IAdaptable) object)
						.getAdapter(IResource.class);
			}
			if (selectedResource != null) {
				return selectedResource.getFullPath();

			}
		}
		return null;
	}

/*	public Resource getModelResource() {
		URI modelURI = URI.createPlatformResourceURI(getModelPath()
				.toOSString(), true);
		return editingDomain.getResourceSet().getResource(modelURI, true);

	} */

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}

	@Override
	public boolean performFinish() {
		if(configPage.active){
			configPage.saveDataToModel();

		}
		executeTransformation();

		return true;
	}

	public ConfigurePage getConfigPage() {
		return configPage;
	}

	public PlatformTypePage getPlatformTypePage() {
		return platformTypePage;
	}

	public WizardModel getModel() {
		return model;
	}

	private void executeTransformation() {
		if (editingDomain != null) {
			CreateInstancesCommand command = new CreateInstancesCommand(
					model.getSelectedHWPlatformInstanceConfiguration(),model.getSelectedHWPlatform(),model.getConfiguration());
			editingDomain.getCommandStack().execute(command);
		}
	}

}
