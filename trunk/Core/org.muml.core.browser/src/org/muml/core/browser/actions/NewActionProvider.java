package org.muml.core.browser.actions;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.NewExampleAction;
import org.eclipse.ui.actions.NewProjectAction;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;
import org.eclipse.ui.wizards.IWizardCategory;
import org.eclipse.ui.wizards.IWizardRegistry;
import org.muml.common.editingdomain.registry.MumlEditingDomainRegistry;

public class NewActionProvider extends CommonActionProvider {
	private static final String FULL_EXAMPLES_WIZARD_CATEGORY = "org.eclipse.ui.Examples"; //$NON-NLS-1$

	private static final String NEW_MENU_NAME = "org.muml.core.browser.new.menu";//$NON-NLS-1$

	private ActionFactory.IWorkbenchAction showDlgAction;

	private IAction newProjectAction;

	private IAction newExampleAction;

//	private WizardActionGroup newWizardActionGroup;

	private boolean contribute = false;
	
	private IContainer iContainer;
	private IFile iFile;
	private EObject element; 

	@Override
	public void init(ICommonActionExtensionSite anExtensionSite) {

		if (anExtensionSite.getViewSite() instanceof ICommonViewerWorkbenchSite) {
			IWorkbenchWindow window = ((ICommonViewerWorkbenchSite) anExtensionSite.getViewSite()).getWorkbenchWindow();
			showDlgAction = ActionFactory.NEW.create(window);
			newProjectAction = new NewProjectAction(window);
			newExampleAction = new NewExampleAction(window);

//			newWizardActionGroup = new WizardActionGroup(window, PlatformUI.getWorkbench().getNewWizardRegistry(), WizardActionGroup.TYPE_NEW, anExtensionSite.getContentService());

			contribute = true;
		}
	}
	
	public void fillActionBars(IActionBars actionBars) {
		iContainer = null;
		element = null;
		iFile = null;
		
		IStructuredSelection selection = (IStructuredSelection) getContext()
				.getSelection();
		Iterator<?> it = selection.iterator();
		while(it.hasNext()) {
			Object object = it.next();
			if (object instanceof IContainer) {
				iContainer = (IContainer) object;
			} else if (object instanceof EObject) {
				element = (EObject) object;
			} else if (object instanceof IFile) {
				iFile = (IFile) object; 
			}
		}
		
	}

	/**
	 * Adds a submenu to the given menu with the name "group.new" see
	 * {@link ICommonMenuConstants#GROUP_NEW}). The submenu contains the following structure:
	 * 
	 * <ul>
	 * <li>a new generic project wizard shortcut action, </li>
	 * <li>a separator, </li>
	 * <li>a set of context senstive wizard shortcuts (as defined by
	 * <b>org.eclipse.ui.navigator.commonWizard</b>), </li>
	 * <li>another separator, </li>
	 * <li>a generic examples wizard shortcut action, and finally </li>
	 * <li>a generic "Other" new wizard shortcut action</li>
	 * </ul>
	 */
	@Override
	public void fillContextMenu(IMenuManager menu) {
		IMenuManager submenu = new MenuManager("&New", NEW_MENU_NAME);
		if(!contribute) {
			return;
		}


		if (iContainer instanceof IWorkspaceRoot) {
			// Add new project wizard shortcut
			submenu.add(newProjectAction);
			submenu.add(new Separator());
		}
		
		if (iFile != null) {
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			TransactionalEditingDomain editingDomain = MumlEditingDomainRegistry.INSTANCE.getEditingDomain(uri, false);
			if (editingDomain != null) {
				Resource resource = editingDomain.getResourceSet().getResource(uri, false);
				if (resource != null) {
					for (EObject contents : resource.getContents()) {
						fillCreateChildren(submenu, contents);
						break;
					}
				}
			}
		} else if (element != null) {
			fillCreateChildren(submenu, element);
		}
		
//		if (iContainer != null) {
//			// fill the menu from the commonWizard contributions
//			newWizardActionGroup.setContext(getContext());
//			newWizardActionGroup.fillContextMenu(submenu);
//		}
		submenu.add(new Separator(ICommonMenuConstants.GROUP_ADDITIONS));

		// if there are examples, then add them to the end of the menu
		if (iContainer instanceof IWorkspaceRoot) {
			if (hasExamples()) {
				submenu.add(new Separator());
				submenu.add(newExampleAction);
			}
		}
	
		if (iContainer != null) {
			// Add other ..
			submenu.add(new Separator());
			submenu.add(showDlgAction);
		}
		
		// append the submenu after the GROUP_NEW group.
		menu.insertAfter(ICommonMenuConstants.GROUP_NEW, submenu);
	}

	/**
	 * Copied from generated emf-editor XXXActionBarContributor
	 */
	private void fillCreateChildren(IMenuManager menu, EObject element) {
		if (element instanceof Diagram) {
			return;
		}
		ISelection selection = new StructuredSelection(element);

		// Query the editing domain for appropriate new child descriptors
		//
		Collection<?> newChildDescriptors = null;

		EditingDomain domain = MumlEditingDomainRegistry.INSTANCE.getEditingDomain(element, false);
		if (domain != null) {
			newChildDescriptors = domain.getNewChildDescriptors(element, null);
		}

		// Generate actions for selection; populate and redraw the menus.
		//
		if (newChildDescriptors != null) {
			for (Object descriptor : newChildDescriptors) {
				IAction action = new CreateChildAction(domain, selection, descriptor);
				menu.add(action);
			}
		}
	}

	/**
	 * Return whether or not any examples are in the current install.
	 * 
	 * @return True if there exists a full examples wizard category.
	 */
	private boolean hasExamples() {
		IWizardRegistry newRegistry = PlatformUI.getWorkbench().getNewWizardRegistry();
		IWizardCategory category = newRegistry.findCategory(FULL_EXAMPLES_WIZARD_CATEGORY);
		return category != null;

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.actions.ActionGroup#dispose()
	 */
	@Override
	public void dispose() {
		if (showDlgAction!=null) {
			showDlgAction.dispose();
			showDlgAction = null;
		}
		super.dispose();
	}
}
