package org.muml.core.siriusbrowser.actions;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;

// Code mostly copied from EcoreActionBarContributor, which is used by generated Ecore Tree-Editor
public class MumlSiriusBrowserActionProvider extends CommonActionProvider {

	private boolean contribute;

	protected Collection<IAction> createChildActions;

	protected IMenuManager createChildMenuManager;

	private DeleteAction deleteAction;

	public MumlSiriusBrowserActionProvider() {

	}

	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		if (aSite.getViewSite() instanceof ICommonViewerWorkbenchSite) {
			contribute = true;
			deleteAction = new DeleteAction(true);

		} else {
			contribute = false;
		}
	}

	public void fillActionBars(IActionBars actionBars) {
		if (!contribute) {
			return;
		}
		actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deleteAction);
	}

	public void fillContextMenu(IMenuManager menuManager) {
		if (!contribute) {
			return;
		}
		IStructuredSelection selection = (IStructuredSelection) getContext().getSelection();

		// Remove any menu items for old selection.
		//
		if (createChildMenuManager != null) {
			depopulateManager(createChildMenuManager, createChildActions);
		}

		// Query the new selection for appropriate new child/sibling descriptors
		//
		Collection<?> newChildDescriptors = null;
		EditingDomain editingDomain = null;

		if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
			Object object = ((IStructuredSelection) selection).getFirstElement();

			editingDomain = TransactionUtil.getEditingDomain((EObject) object);

			newChildDescriptors = editingDomain.getNewChildDescriptors(object, null);
		}
		deleteAction.setEditingDomain(editingDomain);
		deleteAction.updateSelection(selection);


		// Generate actions for selection; populate and redraw the menus.
		//
		createChildActions = generateCreateChildActions(editingDomain, newChildDescriptors, selection);

		if (createChildMenuManager != null) {
			populateManager(createChildMenuManager, createChildActions, null);
			createChildMenuManager.update(true);
		}

		MenuManager submenuManager = null;

		submenuManager = new MenuManager("Create Children");
		populateManager(submenuManager, createChildActions, null);
		
		if (menuManager.getItems().length == 0) {
			menuManager.add(submenuManager);
			menuManager.add(new ActionContributionItem(deleteAction));
		} else {
			String firstID = menuManager.getItems()[0].getId();
			menuManager.insertBefore(firstID, submenuManager);
			menuManager.insertBefore(firstID, new ActionContributionItem(deleteAction));
		}
		
		menuManager.add(submenuManager);


	}

	protected void populateManager(IContributionManager manager, Collection<? extends IAction> actions,
			String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				} else {
					manager.add(action);
				}
			}
		}
	}

	protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem) contributionItem).getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem) contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	protected Collection<IAction> generateCreateChildActions(EditingDomain editingDomain, Collection<?> descriptors,
			ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateChildAction(editingDomain, selection, descriptor));
			}
		}
		return actions;
	}

}
