package org.muml.modelica.adapter.ui.export;

import java.io.IOException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.muml.core.export.operation.AbstractFujabaExportOperation;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.AbstractFujabaExportTargetPage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.modelica.adapter.Activator;
import org.muml.modelica.adapter.ui.common.Generator;
import org.muml.pim.instance.ComponentInstanceConfiguration;

public class ModelicaExportWizard extends AbstractFujabaExportWizard {
	
	private AbstractFujabaExportSourcePage sourcePage;
	private AbstractFujabaExportTargetPage targetPage;

	@Override
	public String wizardGetId() {
		return "org.muml.modelica.adapter.ui.export";
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection ssel) {
		super.init(workbench, ssel);
		setWindowTitle("Modelica Export");
	}
	
	@Override
	public void addPages() {
		sourcePage = new AbstractFujabaExportSourcePage("sourcePage", toolkit,
				getResourceSet(), initialSelection) {
			
					{
						setTitle("Component instance configuration selection");
						setDescription("Select a component instance configuration.");
					}

					@Override
					public String wizardPageGetSourceFileExtension() {
						return "muml";
					}

					@Override
					public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
						return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
					}

					@Override
					public boolean wizardPageSupportsSourceModelElement(EObject element) {
						return element instanceof ComponentInstanceConfiguration;
					}
			
		};
		addPage(sourcePage);
		
		targetPage = new AbstractFujabaExportTargetPage("targetPage",
				toolkit) {

					@Override
					public boolean wizardPageSupportsOverwriteOption() {
						return false;
					}

					@Override
					public boolean wizardPageDirectoryDestination() {
						return true;
					}
			
		};
		addPage(targetPage);
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		// XXX: hacky: the resource/resource set is readonly and a qvto
		// transformation (which is called during the modelica codegen)
		// directly modifies elements contained in the resource/resource set
		// (without persisting the changes, of course) => exception during
		// the modification; workaround: load cic using a plain, simple resource set.
		ComponentInstanceConfiguration tmp = (ComponentInstanceConfiguration) sourcePage
				.getSourceElements()[0];
		String fragment = tmp.eResource().getURIFragment(tmp);
		URI resURI = tmp.eResource().getURI();
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(resURI, true);
		final ComponentInstanceConfiguration cic = (ComponentInstanceConfiguration) resource
				.getEObject(fragment);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		final IFolder directory = root.getFolder(new Path(
				targetPage.getDestinationURI().toPlatformString(true)));
		
		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				try {
					Generator.generateCode(cic, directory, progressMonitor);
				} catch (CoreException e) {
					return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							IStatus.ERROR, e.getMessage(), e);
				} catch (IOException e) {
					return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							IStatus.ERROR, e.getMessage(), e);
				}
				return Status.OK_STATUS;
			}
		};
	}

}
