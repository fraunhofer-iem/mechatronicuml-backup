package org.muml.core.export.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.IPageChangeProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.ide.IDE;
import org.muml.core.export.ExportPlugin;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportTargetPage;
import org.muml.core.export.pages.IActivatableWizardPage;

public abstract class AbstractFujabaExportWizard extends Wizard implements IExportWizard, org.eclipse.jface.dialogs.IPageChangedListener {
    protected FormToolkit toolkit = new FormToolkit(Display.getDefault());
	protected EditingDomain editingDomain;
	protected IStructuredSelection initialSelection;
	protected IActivatableWizardPage activePage;
    /**
     * Creates a wizard for exporting workspace resources to a zip file.
     */
    public AbstractFujabaExportWizard() {
    	String wizardId = wizardGetId();
        IDialogSettings workbenchSettings = ExportPlugin.getDefault().getDialogSettings();
        IDialogSettings section = workbenchSettings.getSection(wizardId);
        if (section == null) {
			section = workbenchSettings.addNewSection(wizardId);
		}
        setDialogSettings(section);
    }	
    

	@Override
	public void dispose() {
		super.dispose();
		setContainer(null); // make sure we unregister from IPageChangeProvider.
	}

	@Override
	public void setContainer(IWizardContainer wizardContainer) {
		if (this.getContainer() != wizardContainer) {
			if (this.getContainer() instanceof IPageChangeProvider) {
				((IPageChangeProvider) this.getContainer()).removePageChangedListener(this);
			}
			super.setContainer(wizardContainer);
			if (this.getContainer() instanceof IPageChangeProvider) {
				((IPageChangeProvider) this.getContainer()).addPageChangedListener(this);
			}
		}
	}

	/* (non-Javadoc)
     * Method declared on IWorkbenchWizard.
     */
    public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
    	initialSelection = currentSelection;
        List<?> selectedResources = IDE.computeSelectedResources(currentSelection);
        if (!selectedResources.isEmpty()) {
            initialSelection = new StructuredSelection(selectedResources);
        }
        setNeedsProgressMonitor(true);
        
        // try to infer editing domain from initial selection
        for (Object element : initialSelection.toArray()) {
        	EObject eObject = null;
        	if (element instanceof EObject) {
        		eObject = (EObject) element;
        	}
        	if (element instanceof IAdaptable) {
        		IAdaptable adaptable = (IAdaptable) element;
        		eObject = adaptable.getAdapter(EObject.class);
        	}
        	if (eObject != null) {
        		editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
        		if (editingDomain != null) {
        			break;
        		}
        	}
        }
        
        // create default editing domain, if none was found
        if (editingDomain == null) {
        	editingDomain = WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain();
        }
    }
    
    

//    private static IStructuredSelection getSelectedResources(IStructuredSelection selection) {
//    	List<IResource> resources = new ArrayList<IResource>();
//    	for (Object element : selection.toArray()) {
//    		IResource resource = getResourceFor(element);
//    		if (resource != null) {
//    			boolean duplicate = false;
//    			for (IResource existingResource : resources) {
//    				if (existingResource.equals(resource)) {
//    					duplicate = true;
//    					break;
//    				}
//    			}
//    			if (!duplicate) {
//    				resources.add(resource);
//    			}
//    		}
//    	}
//    	return new StructuredSelection(resources);
//	}
//
//	private static IResource getResourceFor(Object object) {
//		if (object instanceof IResource) {
//			return (IResource) object;
//		}
//		
//		// Try adapting to EObject and its EResource
//		if (object instanceof IAdaptable) {
//			IAdaptable adaptable = (IAdaptable) object;
//			EObject eObject = (EObject) adaptable.getAdapter(EObject.class);
//			if (eObject != null && eObject.eResource() != null) {
//				URI eUri = eObject.eResource().getURI();
//				if (eUri.isPlatformResource()) {
//					String platformString = eUri.toPlatformString(true);
//					return ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
//				}
//			}
//		}
//		return null;
//	}
    

	public boolean performFinish() {
        //Save dirty editors if possible but do not stop if not all are saved
        saveDirtyEditors();
        
        saveWidgetValues();

        IFujabaExportOperation operation = wizardCreateExportOperation();
        Assert.isNotNull(operation, "Please implement 'wizardCreateExportOperation()' to provide a non-null export operation.");
        return executeExportOperation(operation);
    }
	

	protected void saveWidgetValues() {
		 // Save dialog settings for pages with options 
        for (IWizardPage page : getPages()) {
        	if (page instanceof AbstractFujabaExportTargetPage) {
        		AbstractFujabaExportTargetPage targetPage = (AbstractFujabaExportTargetPage) page;
        		targetPage.saveWidgetValues();
        	}
        }		
	}


	protected boolean saveDirtyEditors() {
        return PlatformUI.getWorkbench().saveAllEditors(true);
    }
	
    /**
     *  Set up and execute the passed Operation.  Answer a boolean indicating success.
     *
     *  @return boolean
     */
    protected boolean executeExportOperation(IFujabaExportOperation op) {

        try {
            getContainer().run(true, true, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            displayErrorDialog(e.getTargetException());
            return false;
        }

        IStatus status = op.getStatus();
        if (!status.isOK()) {
            ErrorDialog.openError(getContainer().getShell(),
                    "Export Problems",
                    null, // no special message
                    status);
            return false;
        }

        return true;
    }

    protected void displayErrorDialog(String message) {
        MessageDialog.open(MessageDialog.ERROR, getContainer().getShell(),
                "Internal error", message, SWT.SHEET);
    }

    /**
     * Display an error dislog with the information from the
     * supplied exception.
     * @param exception Throwable
     */
    protected void displayErrorDialog(Throwable exception) {
        String message = exception.getMessage();
        //Some system exceptions have no message
        if (message == null) {
			message = NLS.bind("Unknown error:", exception);
		}
        displayErrorDialog(message);
    }

	public ResourceSet getResourceSet() {
		return editingDomain.getResourceSet();
	}
	
    public abstract String wizardGetId();
    public abstract IFujabaExportOperation wizardCreateExportOperation();
	
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}
	
	public AdapterFactory getAdapterFactory() {
		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain instanceof AdapterFactoryEditingDomain) {
			return ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
		}
		return null;
	}

	@Override
	public void pageChanged(PageChangedEvent event) {
		// deactivate old page
		if (this.activePage != null) {
			this.activePage.deactivate();
		}
		
		// set new page
		this.activePage = null;
		if (event.getSelectedPage() instanceof IActivatableWizardPage) {
			this.activePage = (IActivatableWizardPage) event.getSelectedPage();
		}
		
		// activate new page
		if (this.activePage != null) {
			this.activePage.activate();
		}
	}

}


