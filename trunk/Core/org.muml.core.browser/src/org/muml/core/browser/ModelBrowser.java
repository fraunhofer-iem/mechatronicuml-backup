package org.muml.core.browser;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.common.CommandException;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IAggregateWorkingSet;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.INavigatorContentService;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import org.muml.core.browser.providers.ModelBrowserContentProvider;

/**
 * 
 * @see CommonNavigator
 * @see INavigatorContentService
 * @since 3.2
 * 
 */
public final class ModelBrowser extends CommonNavigator implements 
	ISelectionProvider, // Adapt selection of CommonViewer Selection Provider; context menu still uses CommonViewer.
	ITabbedPropertySheetPageContributor // APE Integration
{

	// Selection Provider members
	private ISelection selection;
	private List<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();

	// Selection Provider interface
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}
	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}
	@Override
	public ISelection getSelection() {
		return selection;
	}
	@Override
	public void setSelection(ISelection selection) {
		this.selection = selection;

		for (ISelectionChangedListener listener : new ArrayList<ISelectionChangedListener>(selectionChangedListeners)) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
	}



	private int rootMode;

	/**
	 * Used only in the case of top level = PROJECTS and only when some
	 * working sets are selected. 
	 */
	private String workingSetLabel;

	@Override
	public void createPartControl(Composite aParent) {
		super.createPartControl(aParent);
		this.getCommonViewer().addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				
				setSelection(ModelBrowserContentProvider.getAdaptedSelection(event.getSelection()));
			}
		});
		
		// Note:
		// Super implementation uses Common Viewer object as Content Provider.
		// This has the problem that resources are not adapted as semantic elements, as the label provider suggests to the user.
		// We could do that for the Common Viewer, but then the context menus do not work anymore, as they should on files.
		// So we implement ISelectionProvider ourselves and listen to changes in CommonViewer.
		getViewSite().setSelectionProvider(this);

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
	
	protected CommonViewer createCommonViewerObject(Composite aParent) {
		return new CommonViewer(getViewSite().getId(), aParent,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL) {
			protected void handleOpen(SelectionEvent event) {
				super.handleOpen(event);
			}
		};
	}

	// BEGIN Tabbed Properties
 	public static final String PROPERTIES_CONTRIBUTOR = "org.muml.ape.contributor";

 	protected TabbedPropertySheetPage propertySheetPage;

 	public IPropertySheetPage getPropertySheetPage() {
 		if (propertySheetPage == null
 				|| propertySheetPage.getControl().isDisposed()) {
 			propertySheetPage = new TabbedPropertySheetPage(this);
 		}
 		return propertySheetPage;
 	}

 	public String getContributorId() {
 		return PROPERTIES_CONTRIBUTOR;
 	}
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		if (key.equals(IUndoContext.class)) {
			
		}
		return super.getAdapter(key);
	}
	// END Tabbed Properties

}
