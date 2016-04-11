package org.muml.core.browser.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.muml.common.editingdomain.registry.MumlEditingDomainRegistry;

public class EditCommandsFactory implements IPropertyListener {
	
	private class MyValidateAction extends ValidateAction {
		public MyValidateAction(EditingDomain editingDomain) {
			domain = editingDomain;
		}
	}

	public static final EditCommandsFactory INSTANCE = new EditCommandsFactory();
	
	/**
	 * This keeps track of the current workbench part.
	 */
	protected IWorkbenchPart activePart;

	/**
	 * This is the action used to implement delete.
	 */
	protected DeleteAction deleteAction;

	/**
	 * This is the action used to implement cut.
	 */
	protected CutAction cutAction;

	/**
	 * This is the action used to implement copy.
	 */
	protected CopyAction copyAction;

	/**
	 * This is the action used to implement paste.
	 */
	protected PasteAction pasteAction;

	/**
	 * This is the action used to implement undo.
	 */
	protected UndoAction undoAction;

	/**
	 * This is the action used to implement redo.
	 */
	protected RedoAction redoAction;

	/**
	 * This is the action used to load a resource.
	 */
	protected LoadResourceAction loadResourceAction;

	/**
	 * This is the action used to perform validation.
	 */
	protected MyValidateAction validateAction;

	private IStructuredSelection selection = StructuredSelection.EMPTY;

	private EditCommandsFactory() {
		init();
	}

	protected void init() {
		TransactionalEditingDomain editingDomain = null;
		
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();

		deleteAction = new DeleteAction(editingDomain, true) {
			public boolean updateSelection(IStructuredSelection selection) {
				selection = unwrap(selection);
				domain = findEditingDomain(selection);
				if (domain != null) {
					return super.updateSelection(selection);
				}
				return false;
			}
		};
		deleteAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));

		cutAction = new CutAction(editingDomain) {
			public boolean updateSelection(IStructuredSelection selection) {
				selection = unwrap(selection);
				domain = findEditingDomain(selection);
				if (domain != null) {
					return super.updateSelection(selection);
				}
				return false;
			}
		};
		cutAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));

		copyAction = new CopyAction(editingDomain) {
			public boolean updateSelection(IStructuredSelection selection) {
				selection = unwrap(selection);
				domain = findEditingDomain(selection);
				if (domain == null) {
					selection = new StructuredSelection();
				}
				return super.updateSelection(selection);
			}
		};
		copyAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));

		pasteAction = new PasteAction(editingDomain) {
			public boolean updateSelection(IStructuredSelection selection) {
				selection = unwrap(selection);
				domain = findEditingDomain(selection);
				if (domain == null) {
					selection = StructuredSelection.EMPTY;
				}
				return super.updateSelection(selection);
			}
		};
		pasteAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));

		undoAction = new UndoAction() {
			@Override
			public void update() {
				domain = findEditingDomain(selection);
				if (domain != null) {
					setEnabled(true);
					super.update();
				} else {
					setEnabled(false);
				}
			}
			
		};
		undoAction.setEditingDomain(editingDomain);
		undoAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));

		redoAction = new RedoAction() {
			@Override
			public void update() {
				domain = findEditingDomain(selection);
				if (domain != null) {
					setEnabled(true);
					super.update();
				} else {
					setEnabled(false);
				}
			}
		};
		redoAction.setEditingDomain(editingDomain);
		redoAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));

		validateAction = new MyValidateAction(editingDomain) {
			public boolean updateSelection(IStructuredSelection selection) {
				selection = unwrap(selection);
				domain = findEditingDomain(selection);
				if (domain == null) {
					selection = new StructuredSelection();
				}
				return super.updateSelection(selection);
			}
		};
		//validateAction.setImageDescriptor(Activator.findImageDescriptor("icons/validate.gif"));

	}
	
	protected TransactionalEditingDomain findEditingDomain(IStructuredSelection selection) {
		TransactionalEditingDomain domain = null;
		for (Iterator<?> iterator = selection.iterator(); iterator.hasNext();) {
			Object item = iterator.next();
			TransactionalEditingDomain currentDomain = MumlEditingDomainRegistry.INSTANCE.getEditingDomainDispatch(item,  true);
			if (domain != null && currentDomain != null && currentDomain != domain) {
				return null; // we do not support elements from multiple domains.
			}
			domain = currentDomain;
		}
		return domain;
	}

	private IStructuredSelection unwrap(IStructuredSelection selection) {
		List<Object> unwrapped = new ArrayList<Object>();
		for (Iterator<?> iterator = selection.iterator(); iterator.hasNext();) {
			Object item = iterator.next();
	        if (item instanceof IAdaptable)
	        	item = ((IAdaptable)item).getAdapter(EObject.class);
			
	        unwrapped.add(item);
		}
		return new StructuredSelection(unwrapped);
	}


	public void dispose() {
		deactivate();
	}

	public void shareGlobalActions(IActionBars actionBars, boolean isPropertyPage) {
		if (!isPropertyPage) {
			actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
					deleteAction);
			actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(),
					cutAction);
			actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(),
					copyAction);
			actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(),
					pasteAction);
		}
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(),
				undoAction);
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(),
				redoAction);
	}
	
	public void fillContextMenu(IMenuManager menu) {
		if(cutAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, cutAction);
		if(copyAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, copyAction);
		if(pasteAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, pasteAction);
		if(deleteAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, deleteAction);
		if(undoAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, undoAction);
		if(redoAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, redoAction);
		if(validateAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_BUILD, validateAction);
	}

	public IWorkbenchPart getActivePart() {
		return activePart;
	}

	public void setActivePart(IWorkbenchPart part) {
		if (part != activePart) {
			if (activePart != null) {
				deactivate();
				activePart = null;
			}

			activePart = part;
			activate();
		}
	}

	public void deactivate() {
		activePart.removePropertyListener(this);

		deleteAction.setActiveWorkbenchPart(null);
		cutAction.setActiveWorkbenchPart(null);
		copyAction.setActiveWorkbenchPart(null);
		pasteAction.setActiveWorkbenchPart(null);
		undoAction.setActiveWorkbenchPart(null);
		redoAction.setActiveWorkbenchPart(null);

		if (loadResourceAction != null) {
			loadResourceAction.setActiveWorkbenchPart(null);
		}

		if (validateAction != null) {
			validateAction.setActiveWorkbenchPart(null);
		}

		ISelectionProvider selectionProvider = activePart instanceof ISelectionProvider ? (ISelectionProvider) activePart
				: activePart.getSite().getSelectionProvider();

		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(deleteAction);
			selectionProvider.removeSelectionChangedListener(cutAction);
			selectionProvider.removeSelectionChangedListener(copyAction);
			selectionProvider.removeSelectionChangedListener(pasteAction);

			if (validateAction != null) {
				selectionProvider.removeSelectionChangedListener(validateAction);
			}
		}
	}
	
	public void activate() {
		activePart.addPropertyListener(this);

		deleteAction.setActiveWorkbenchPart(activePart);
		cutAction.setActiveWorkbenchPart(activePart);
		copyAction.setActiveWorkbenchPart(activePart);
		pasteAction.setActiveWorkbenchPart(activePart);
		undoAction.setActiveWorkbenchPart(activePart);
		redoAction.setActiveWorkbenchPart(activePart);

		if (loadResourceAction != null) {
			loadResourceAction.setActiveWorkbenchPart(activePart);
		}

		if (validateAction != null) {
			validateAction.setActiveWorkbenchPart(activePart);
		}

		ISelectionProvider selectionProvider = activePart instanceof ISelectionProvider ? (ISelectionProvider) activePart
				: activePart.getSite().getSelectionProvider();

		if (selectionProvider != null) {
			selectionProvider.addSelectionChangedListener(deleteAction);
			selectionProvider.addSelectionChangedListener(cutAction);
			selectionProvider.addSelectionChangedListener(copyAction);
			selectionProvider.addSelectionChangedListener(pasteAction);

			if (validateAction != null) {
				selectionProvider.addSelectionChangedListener(validateAction);
			}
		}

		update();
	}

	public void update() {
		ISelectionProvider selectionProvider = activePart instanceof ISelectionProvider ? (ISelectionProvider) activePart
				: activePart.getSite().getSelectionProvider();

		if (selectionProvider != null) {
			ISelection selection = selectionProvider.getSelection();
			IStructuredSelection structuredSelection = selection instanceof IStructuredSelection ? (IStructuredSelection) selection
					: StructuredSelection.EMPTY;

			deleteAction.updateSelection(structuredSelection);
			cutAction.updateSelection(structuredSelection);
			copyAction.updateSelection(structuredSelection);
			pasteAction.updateSelection(structuredSelection);

			if (validateAction != null) {
				validateAction.updateSelection(structuredSelection);
			}
			
			this.selection = structuredSelection;
		}

		undoAction.update();
		redoAction.update();

		if (loadResourceAction != null) {
			loadResourceAction.update();
		}
	}

	public void propertyChanged(Object source, int id) {
		update();
	}

}
