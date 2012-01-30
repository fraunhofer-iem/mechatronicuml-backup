package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.popup.actions;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextReadonlyEditorInput;

import de.uni_paderborn.fujaba.muml.ui.ActionEditorInput;
import de.uni_paderborn.fujaba.muml.ui.ActionStorage;
import de.uni_paderborn.fujaba.muml.ui.CustomResourceForEditorInputFactory;

public class OpenEditorAction implements IObjectActionDelegate {
	
	private EObject model;
	private Shell shell;

	@Override
	public void run(IAction action) {
		if (model == null) {
			throw new IllegalStateException("model is null (setActivePart failed)");
		}
		ActionStorage actionStorage = new ActionStorage(model);
		CustomResourceForEditorInputFactory.setAttributeList(actionStorage.getAttributeList());
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorDescriptor descr = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor("foo.action");
		if (checkOpenEditors(page, actionStorage)) {
			return;
		}
		try {
			page.openEditor(new XtextReadonlyEditorInput(actionStorage), descr.getId());
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * Checks for open action editors. If one is found and its IStorage doesn't correspond
	 * to the actionStorage an error dialog pops up (and true is returned).
	 */
	private boolean checkOpenEditors(IWorkbenchPage page, ActionStorage actionStorage) {
		for (IEditorReference it : page.getEditorReferences()) {
			// FIXME: removed hardcoded string
			if (it.getId().equals("de.uni_paderborn.fujaba.muml.ActionLanguage")) {
				IEditorInput editorInput = null;
				try {
					editorInput = it.getEditorInput();
				} catch (PartInitException e) {
					// we can also silently ignore the exception
					e.printStackTrace();
				}
				if (!(editorInput instanceof XtextReadonlyEditorInput)) {
					continue;
				}
				IStorage storage = null;
				try {
					storage = ((XtextReadonlyEditorInput) editorInput).getStorage();
				} catch (CoreException e) {
					// we can also silently ignore the exception
					e.printStackTrace();
				}
				if (!actionStorage.equals(storage)) {
					MessageDialog.openError(shell, "Error", "Please close existing action editors first");
					return true;
				}
				
			}
		}
		return false;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		ISelection selection = targetPart.getSite().getSelectionProvider().getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object part = structuredSelection.getFirstElement();
			if (part instanceof GraphicalEditPart) {
				model = (EObject) ((GraphicalEditPart) part).getAdapter(EObject.class);
			} else if (part instanceof ConnectionEditPart) {
				model = (EObject) ((ConnectionEditPart) part).getAdapter(EObject.class);
			}
		}
	}

}
