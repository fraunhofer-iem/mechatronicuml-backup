package de.uni_paderborn.fujaba.muml.browser;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.common.CommandException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IAggregateWorkingSet;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.internal.navigator.resources.ResourceToItemsMapper;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.INavigatorContentService;

/**
 * 
 * @see CommonNavigator
 * @see INavigatorContentService
 * @since 3.2
 * 
 */
public final class ModelBrowser extends CommonNavigator {

	/**
	 * Provides a constant for the standard instance of the Common Navigator.
	 * 
	 * @see PlatformUI#getWorkbench()
	 * @see IWorkbench#getActiveWorkbenchWindow()
	 * @see IWorkbenchWindow#getActivePage()
	 * 
	 * @see IWorkbenchPage#findView(String)
	 * @see IWorkbenchPage#findViewReference(String)
	 */
	public static final String VIEW_ID = IPageLayout.ID_PROJECT_EXPLORER;

	/**
	 * @since 3.4
	 */
	public static final int WORKING_SETS = 0;

	/**
	 * @since 3.4
	 */
	public static final int PROJECTS = 1;

	private int rootMode;

	/**
	 * Used only in the case of top level = PROJECTS and only when some
	 * working sets are selected. 
	 */
	private String workingSetLabel;

	@Override
	public void createPartControl(Composite aParent) {
		super.createPartControl(aParent);
		
		if (!false)
			getCommonViewer().setMapper(new ResourceToItemsMapper(getCommonViewer()));
	}	
	
	/**
	 * The superclass does not deal with the content description, handle it
	 * here.
	 * 
	 * @noreference This method is not intended to be referenced by clients.
	 */
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

	

	/**
	 * @param mode
	 * @noreference This method is not intended to be referenced by clients.
	 * @since 3.4
	 */
	@Override
	public void setRootMode(int mode) {
		rootMode = mode;
	}

	/**
	 * @return the root mode
	 * @noreference This method is not intended to be referenced by clients.
	 * @since 3.4
	 */
	@Override
	public int getRootMode() {
		return rootMode;
	}

	/**
	 * @param label
	 * @noreference This method is not intended to be referenced by clients.
	 * @since 3.4
	 */
	@Override
	public void setWorkingSetLabel(String label) {
		workingSetLabel = label;
	}

	/**
	 * @return the working set label
	 * @noreference This method is not intended to be referenced by clients.
	 * @since 3.4
	 */
	@Override
	public String getWorkingSetLabel() {
		return workingSetLabel;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.navigator.CommonNavigator#handleDoubleClick(org.eclipse.jface.viewers.DoubleClickEvent)
	 * @since 4.3
	 */
	@Override
	protected void handleDoubleClick(DoubleClickEvent anEvent) {
		ICommandService commandService = (ICommandService) getViewSite().getService(ICommandService.class);
		Command openProjectCommand = commandService.getCommand(IWorkbenchCommandConstants.PROJECT_OPEN_PROJECT);
		if (openProjectCommand != null && openProjectCommand.isHandled()) {
			IStructuredSelection selection = (IStructuredSelection) anEvent
					.getSelection();
			Object element = selection.getFirstElement();
			if (element instanceof IProject && !((IProject) element).isOpen()) {
				try {
					openProjectCommand.executeWithChecks(new ExecutionEvent());
				} catch (CommandException ex) {
					IStatus status = new Status(IStatus.ERROR, ModelBrowserPlugin.PLUGIN_ID, 0, "'Open Project' failed", ex); //$NON-NLS-1$
					ModelBrowserPlugin.getDefault().getLog().log(status);
				}
				return;
			}
		}
		super.handleDoubleClick(anEvent);
	}

}
