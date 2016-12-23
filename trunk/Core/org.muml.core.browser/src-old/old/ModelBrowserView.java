package org.muml.core.browser.old;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import org.muml.core.browser.ModelBrowserPlugin;
import org.muml.core.browser.old.decorators.ModifiedElementDecorator;
import org.muml.core.browser.old.providers.IModifiedElementProvider;
import org.muml.core.browser.old.providers.ModelBrowserContentProvider;
import org.muml.core.browser.old.providers.ModelBrowserLabelProvider;

public class ModelBrowserView extends ViewPart implements ISelectionProvider, ITabbedPropertySheetPageContributor {
	
	private TransactionalEditingDomain editingDomain = WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain();

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

		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
	}

	// Tracking of modified elements to display them in italics
	IModifiedElementProvider modifiedElementProvider = new IModifiedElementProvider.Default();
	private ResourceSetListener resourceSetListener = new ResourceSetListenerImpl() {
		public void resourceSetChanged(final ResourceSetChangeEvent event) {
			for (Notification notification : event.getNotifications()) {
				if (notification.getNotifier() instanceof EObject) {
					modifiedElementProvider.addModifiedElement((EObject) notification.getNotifier());
				}
			}
			scheduleRefresh();
		}
	};
	
	// Synchronization with workspace,
	private WorkspaceSynchronizer synchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {

		public boolean handleResourceDeleted(Resource resource) {
			resource.unload();
			synchronized (modifiedElementProvider) {
				modifiedElementProvider.removeModifiedElements(resource);
			}
			scheduleRefresh();
			return true;
		}

		public boolean handleResourceMoved(Resource resource, URI newURI) {
			resource.unload();
			synchronized (modifiedElementProvider) {
				modifiedElementProvider.removeModifiedElements(resource);
			}
			scheduleRefresh();
			return true;
		}

		public boolean handleResourceChanged(Resource resource) {
			resource.unload();
			try {
				resource.load(resource.getResourceSet().getLoadOptions());
			} catch (IOException e) {
				ModelBrowserPlugin.log(e);
			}
			synchronized (modifiedElementProvider) {
				modifiedElementProvider.removeModifiedElements(resource);
			}
			scheduleRefresh();

			return true;
		}
		
		public void dispose() {
		}

	});
	
	/**
	 * The ID of the view as specified by the extension.
	 */


	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action actionSave;
	private String defaultTitle;
	
	public ModelBrowserView() {
		editingDomain.addResourceSetListener(resourceSetListener);
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		defaultTitle = getPartName();
	}
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				setSelection(adaptSelection(event.getSelection()));
			}
		});
		drillDownAdapter = new DrillDownAdapter(viewer);

		ILabelProvider labelProvider = new ModelBrowserLabelProvider(editingDomain, viewer);
//		labelProvider = new DecoratingLabelProvider(labelProvider, PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator());
		labelProvider = new DecoratingLabelProvider(labelProvider, new org.eclipse.emf.edit.ui.provider.DiagnosticDecorator.StyledError(editingDomain.getResourceSet(), viewer));
		labelProvider = new DecoratingLabelProvider(labelProvider, new ModifiedElementDecorator(modifiedElementProvider));
		
		
		viewer.setLabelProvider(labelProvider);
		viewer.setContentProvider(new ModelBrowserContentProvider(editingDomain));
		viewer.setSorter(new ViewerSorter());
		viewer.addFilter(new ViewerFilter() {

			// hide files that start with a dot
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				StructuredViewer structuredViewer = (StructuredViewer) viewer;
				ILabelProvider labelProvider = (ILabelProvider)structuredViewer.getLabelProvider();
				String text = labelProvider.getText(element);
				if (text == null || text.startsWith(".")) {
					return false;
				}
				return true;
			}
			
		});
		getViewSite().setSelectionProvider(this);
		viewer.setInput(ResourcesPlugin.getWorkspace().getRoot());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.muml.core.browser.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	protected ISelection adaptSelection(ISelection sel) {
		List<Object> selection = new ArrayList<Object>();
		if (sel instanceof IStructuredSelection) {
			Iterator<?> it = ((IStructuredSelection) sel).iterator();
			while (it.hasNext()) {
				Object element = it.next();
				if (element instanceof IFile) {
					EObject resourceRoot =ModelBrowserPlugin.getResourceRoot(editingDomain.getResourceSet(), element);
					if (resourceRoot != null) {
						element = resourceRoot;
					}
				}
				if (element instanceof IAdaptable) {
					IAdaptable adaptable = (IAdaptable) element;
					EObject eObject = (EObject) adaptable.getAdapter(EObject.class);
					if (eObject != null) {
						element = eObject;
					}
				}
				if (element != null) {
					selection.add(element);
				}
			}
		}
		
		return new StructuredSelection(selection);
	}
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ModelBrowserView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(actionSave);
		manager.add(new Separator());
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(actionSave);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(actionSave);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		actionSave = new Action() {
			public void run() {
				for (Resource resource : new ArrayList<Resource>(modifiedElementProvider.getModifiedResources())) {
					try {
						resource.save(Collections.emptyMap());
					} catch (IOException e) {
						ModelBrowserPlugin.log(e, "Could not save from Model Browser!");
						if (resource.getResourceSet() != null) {
							resource.getResourceSet().getResources().remove(resource);
						}
					}
					modifiedElementProvider.removeModifiedElements(resource);
				}
				scheduleRefresh();
			}
		};
		actionSave.setText("Save");
		actionSave.setToolTipText("Saves all changes that were performed.");
		actionSave.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT));
		actionSave.setDisabledImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT_DISABLED));
		updateSave();
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = null;
				if (event.getSelection() instanceof IStructuredSelection) {
					selection = (IStructuredSelection) event.getSelection();
				}
				if (selection == null || selection.isEmpty()) {
					return;
				}

				Object element = selection.getFirstElement();
				final ITreeContentProvider provider = (ITreeContentProvider) viewer
						.getContentProvider();

				if (!provider.hasChildren(element)) {
					open(element);
				} else if (viewer.getExpandedState(element)) {
					viewer.collapseToLevel(element, AbstractTreeViewer.ALL_LEVELS);
				} else {
					viewer.expandToLevel(element, 1);
				}
			}
		});
	}

	protected void open(Object selectedElement) {
		System.out.println("OPEN: " + selectedElement);
	}
	
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	
	// Scheduling refresh
	final AtomicBoolean needsRefresh = new AtomicBoolean(false);
	protected void scheduleRefresh() {
		synchronized (needsRefresh) {
			needsRefresh.set(true);
		}
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				synchronized (needsRefresh) {
					if (needsRefresh.get()) {
						if (viewer instanceof StructuredViewer) {
							((StructuredViewer) viewer).refresh();
						}
						updateSave();
						needsRefresh.set(false);
					}
				}
			}
		});		
	}
	
	
	protected void updateSave() {
		boolean modified = !modifiedElementProvider.getModifiedResources().isEmpty();
		actionSave.setEnabled(modified);
		String title = (modified ? "*" : "") + defaultTitle;
		setPartName(title);
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
		return super.getAdapter(key);
	}
	// END Tabbed Properties
	
	@Override
	public void dispose() {
		super.dispose();
		synchronizer.dispose();
		editingDomain.removeResourceSetListener(resourceSetListener);
	}

}