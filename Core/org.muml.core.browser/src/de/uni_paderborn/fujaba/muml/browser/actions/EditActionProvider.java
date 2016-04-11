package org.muml.core.browser.actions;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonViewerSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;

public class EditActionProvider extends CommonActionProvider {

	public EditActionProvider() {
	}

	public void init(ICommonActionExtensionSite aSite) {
		ICommonViewerSite viewSite = aSite.getViewSite();
		if (viewSite instanceof ICommonViewerWorkbenchSite) {
			ICommonViewerWorkbenchSite workbenchSite = (ICommonViewerWorkbenchSite) viewSite;
			EditCommandsFactory.INSTANCE.setActivePart(workbenchSite.getPart());
		}
	}

	public void fillActionBars(IActionBars actionBars) {
		EditCommandsFactory.INSTANCE.shareGlobalActions(actionBars, false);
	}

	public void fillContextMenu(IMenuManager menu) {
		EditCommandsFactory.INSTANCE.fillContextMenu(menu);

	}

}
