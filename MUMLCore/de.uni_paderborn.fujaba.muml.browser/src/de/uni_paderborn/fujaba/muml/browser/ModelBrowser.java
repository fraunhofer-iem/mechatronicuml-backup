package de.uni_paderborn.fujaba.muml.browser;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IAggregateWorkingSet;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.INavigatorContentService;

/**
 * 
 * @see CommonNavigator
 * @see INavigatorContentService
 * @since 3.2
 * 
 */
public final class ModelBrowser extends CommonNavigator {

	public static final String VIEW_ID = "de.uni_paderborn.fujaba.muml.browser.views.ModelBrowser";

	private int rootMode;

	/**
	 * Used only in the case of top level = PROJECTS and only when some
	 * working sets are selected. 
	 */
	private String workingSetLabel;

	@Override
	public void createPartControl(Composite aParent) {
		super.createPartControl(aParent);
		
		//if (!false)
		//	getCommonViewer().setMapper(new ResourceToItemsMapper(getCommonViewer()));
	}	
	
	@Override
	public void updateTitle() {
		super.updateTitle();
		Object input = getCommonViewer().getInput();

		if (input == null || input instanceof IAggregateWorkingSet) {
			setContentDescription(""); //$NON-NLS-1$
			return;
		}

		if (!(input instanceof IResource)) {
			String label = ((ILabelProvider) getCommonViewer().getLabelProvider()).getText(input);
			if (label != null) {
				setContentDescription(label);
				return;
			}
			if (input instanceof IAdaptable) {
				IWorkbenchAdapter wbadapter = (IWorkbenchAdapter) ((IAdaptable) input)
						.getAdapter(IWorkbenchAdapter.class);
				if (wbadapter != null) {
					setContentDescription(wbadapter.getLabel(input));
					return;
				}
			}
			setContentDescription(input.toString());
			return;
		}

		IResource res = (IResource) input;
		setContentDescription(res.getName());
	}

	@Override
	public void setRootMode(int mode) {
		rootMode = mode;
	}

	@Override
	public int getRootMode() {
		return rootMode;
	}

	@Override
	public void setWorkingSetLabel(String label) {
		workingSetLabel = label;
	}

	@Override
	public String getWorkingSetLabel() {
		return workingSetLabel;
	}

	@Override
	protected void handleDoubleClick(DoubleClickEvent anEvent) {
//		ICommandService commandService = (ICommandService) getViewSite().getService(ICommandService.class);
//		Command openProjectCommand = commandService.getCommand(IWorkbenchCommandConstants.PROJECT_OPEN_PROJECT);
//		if (openProjectCommand != null && openProjectCommand.isHandled()) {
//			IStructuredSelection selection = (IStructuredSelection) anEvent
//					.getSelection();
//			Object element = selection.getFirstElement();
//			if (element instanceof IProject && !((IProject) element).isOpen()) {
//				try {
//					openProjectCommand.executeWithChecks(new ExecutionEvent());
//				} catch (CommandException ex) {
//					IStatus status = new Status(IStatus.ERROR, ModelBrowserPlugin.PLUGIN_ID, 0, "'Open Project' failed", ex); //$NON-NLS-1$
//					ModelBrowserPlugin.getDefault().getLog().log(status);
//				}
//				return;
//			}
//		}
//		super.handleDoubleClick(anEvent);
	}
	
	protected CommonViewer createCommonViewerObject(Composite aParent) {
		return new CommonViewer(getViewSite().getId(), aParent,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL) {
			protected void handleOpen(SelectionEvent event) {
				// XXX Open the diagram instead
//				IStructuredSelection sel = (IStructuredSelection) getSelection();
//				if (!sel.isEmpty() && getContentProvider() instanceof ITreeContentProvider) {
//					ITreeContentProvider treeContentProvider = (ITreeContentProvider) getContentProvider();
//					for (Object child : treeContentProvider.getChildren(sel.getFirstElement())) {
//						if (child instanceof IFile) {
//							
//						}
//					}
//				}
				super.handleOpen(event);
			}
		};
	}
}
