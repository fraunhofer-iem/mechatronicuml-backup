package org.eclipse.emf.ecore.presentation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.presentation.filter.TreeViewerSearchFilter;
import org.eclipse.emf.ecore.presentation.inheritance.DefaultLabelProvider;
import org.eclipse.emf.ecore.presentation.inheritance.InheritanceContentProvider;
import org.eclipse.emf.ecore.presentation.inheritance.InheritanceMode;
import org.eclipse.emf.ecore.presentation.inheritance.InheritanceNode;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * This is an improved Ecore model editor.
 */
public class ImprovedEcoreEditor extends
		org.eclipse.emf.ecore.presentation.EcoreEditor implements ITabbedPropertySheetPageContributor {

	// BEGIN Tabbed Properties
	public static final String PROPERTIES_CONTRIBUTOR = "org.eclipse.emf.ecore.editor.improved.contributor";

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
	// END Tabbed Properties	
	
	
	
	protected static final String DEFAULT_SEARCH_TEXT = "<Enter search term here>";
	public static final long FILTER_TIMEOUT = 350;
	protected TreeViewerSearchFilter searchViewerFilter;
	protected ViewerFilter annotationFilter = new ViewerFilter() {
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof EAnnotation) {
				return false;
			}
			return true;
		};
	};

	protected ViewerComparator sorter = new ViewerComparator() {
		public int compare(Viewer viewer, Object e1, Object e2) {
			// Do not sort resources
			if (e1 instanceof Resource && e2 instanceof Resource) {
				return 0;
			}
			if (e1 instanceof EObject && e2 instanceof EObject) {
				EClass eClass1 = ((EObject) e1).eClass();
				EClass eClass2 = ((EObject) e2).eClass();
				if (eClass1 != eClass2) {
					return (getEClassNumber(eClass1) - getEClassNumber(eClass2)) * 10 + eClass1.getName().compareTo(eClass2.getName());
				}
			}
			
			// Default sorter is alphabetically; so just perfect for us!
			return super.compare(viewer, e1, e2);
		}

		private int getEClassNumber(EClass eClass) {
			EClass array[] = {
					EcorePackage.Literals.EGENERIC_TYPE,
					EcorePackage.Literals.EANNOTATION,
					EcorePackage.Literals.ESTRUCTURAL_FEATURE };

			int counter = 0;
			for (EClass compare : array) {
				counter++;
				if (compare.isSuperTypeOf(eClass)) {
					break;
				}
			}
			return counter;
		}
	};

	// label provider
	protected ILabelProvider labelProvider;

	// Content providers
	protected InheritanceContentProvider inheritanceContentProvider;

	// actions
	protected Action actionMarkAbstract;
	protected Action actionShowAnnotations;
	protected Action actionSort;
	protected Action actionMarkDerived;
	protected Action actionInheritanceNone;
	protected Action actionInheritanceFeatures;
	protected Action actionInheritanceHierarchy;
	protected Action actionExpandAll;

	private ToolBarManager toolBarManager;

	public ImprovedEcoreEditor() {
		inheritanceContentProvider = new InheritanceContentProvider(
				adapterFactory);
		searchViewerFilter = new TreeViewerSearchFilter();

		EcoreEditorPlugin.getPlugin().getDialogSettings()
				.put("showGenericsAction", Boolean.TRUE);
	}

	protected void handleChangedResources() {
		super.handleChangedResources();
	}

	@Override
	public void createPages() {

		super.createPages();

		// Resolve all dependent resources
		EcoreUtil.resolveAll(editingDomain.getResourceSet());
		selectionViewer.setInput(editingDomain.getResourceSet());
		selectionViewer.setExpandPreCheckFilters(true);
		selectionViewer.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(DoubleClickEvent event) {
				ISelection sel = getSelectionViewer().getSelection();
				if (sel instanceof IStructuredSelection) {
					IStructuredSelection ssel = (IStructuredSelection) sel;
					if (!ssel.isEmpty()) {
						Object object = ssel.iterator().next();
						doubleClicked(object);
					}
				}
			}

		});

		initializeToolBarManager(toolBarManager);

		// create label provider for viewer
		labelProvider = new ImprovedLabelProvider(adapterFactory,
				selectionViewer);
		if (selectionViewer != null) {
			selectionViewer.setLabelProvider(labelProvider);
			selectionViewer.setContentProvider(inheritanceContentProvider);
			selectionViewer.addFilter(searchViewerFilter);
			selectionViewer.addSelectionChangedListener(new ISelectionChangedListener() {

				public void selectionChanged(SelectionChangedEvent event) {
//					ISelection sel = event.getSelection();
//					if (sel instanceof IStructuredSelection) {
//						IStructuredSelection ssel = (IStructuredSelection) sel;
//						Iterator<?> it = ssel.iterator();
//						List<Object> validObjects = new ArrayList<Object>();
//						boolean changed = false;
//						while (it.hasNext()) {
//							Object element = it.next();
//							if (searchViewerFilter.directSelect(element)) {
//								validObjects.add(element);
//							} else {
//								changed = true;
//							}
//						}
//						if (changed) {
//							getSelectionViewer().setSelection(new StructuredSelection(validObjects));
//						}
//					}
				    					
				}

			});

		}
		

	}

	protected void doubleClicked(Object object) {
		if (object instanceof EGenericType) {
			EGenericType type = (EGenericType) object;
			object = type.getEClassifier();
			selectionViewer.setSelection(new StructuredSelection(object));
		} else if (object instanceof InheritanceNode) {
			InheritanceNode node = (InheritanceNode) object;
			object = node.object;
			selectionViewer.setSelection(new StructuredSelection(object));
		}
		selectionViewer.setExpandedState(object,
				!selectionViewer.getExpandedState(object));
	}

	protected Composite createPageContainer(final Composite parent) {
		GridLayout layout = new GridLayout(3, false);
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		parent.setLayout(layout);

		// Create toolbar
		final Text searchbox = new Text(parent, 0);
		searchbox.setText(DEFAULT_SEARCH_TEXT);
		searchbox.setForeground(parent.getDisplay().getSystemColor(
				SWT.COLOR_GRAY));
		final ModifyListener modifyListener = new ModifyListener() {
			class TimeThread extends Thread {
				public TimeThread(String text) {
					this.text = text;
				}

				private String text;
				private boolean cancel = false;

				public void run() {
					try {
						Thread.sleep(FILTER_TIMEOUT);
					} catch (InterruptedException e) {
					}
					if (!cancel) {
						searchbox.getDisplay().syncExec(new Runnable() {
							public void run() {
								setFilterText(text);
							}
						});
					}
				}

				public void setCancel(boolean cancel) {
					this.cancel = cancel;
				}
			}

			private TimeThread thread;

			public void modifyText(ModifyEvent e) {
				if (thread != null) {
					thread.setCancel(true);
				}
				thread = new TimeThread(searchbox.getText());
				thread.start();
			}

		};
		searchbox.addFocusListener(new FocusListener() {

			public void focusGained(FocusEvent e) {
				if (DEFAULT_SEARCH_TEXT.equals(searchbox.getText())) {
					searchbox.removeModifyListener(modifyListener);
					searchbox.setText("");
					searchbox.addModifyListener(modifyListener);
				}
				searchbox.setForeground(parent.getDisplay().getSystemColor(
						SWT.COLOR_BLACK));
			}

			public void focusLost(FocusEvent e) {
				if (searchbox.getText().isEmpty()) {
					searchbox.removeModifyListener(modifyListener);
					searchbox.setText(DEFAULT_SEARCH_TEXT);
					searchbox.addModifyListener(modifyListener);
				}
				searchbox.setForeground(parent.getDisplay().getSystemColor(
						SWT.COLOR_GRAY));
			}

		});
		searchbox
				.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		searchbox.addModifyListener(modifyListener);
		
		final Label clear = new Label(parent, 0);
		clear.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		clear.setLayoutData(new GridData(SWT.END, SWT.CENTER, false, false));
		ImageDescriptor clearImageDescriptor = ImprovedEcoreEditorPlugin.getImageDescriptor("icons/clear.gif");
		clear.setImage(clearImageDescriptor.createImage());
		clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				searchbox.setText("");
				searchbox.setFocus();
			}
		});
		
		toolBarManager = new ToolBarManager(SWT.FLAT);
		ToolBar toolBar = toolBarManager.createControl(parent);
		toolBar.setLayoutData(new GridData(SWT.END, SWT.FILL, false, false));

		// Create container for the page (we need it, because super class will
		// set a FillLayout)
		Composite pageContainer = new Composite(parent, 0);
		pageContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 3, 1));
		return pageContainer;
	}

	protected synchronized void setFilterText(String filterText) {
		actionInheritanceNone.setEnabled(filterText.isEmpty());
		actionInheritanceFeatures.setEnabled(filterText.isEmpty());
		actionInheritanceHierarchy.setEnabled(filterText.isEmpty());

		if (!filterText.isEmpty()) {
			inheritanceContentProvider.setInheritanceMode(InheritanceMode.NONE);
			actionExpandAll.setEnabled(true);
		} else {
			InheritanceMode mode = InheritanceMode.NONE;
			if (actionInheritanceNone.isChecked()) {
				mode = InheritanceMode.NONE;
			} else if (actionInheritanceFeatures.isChecked()) {
				mode = InheritanceMode.FEATURES;
			} else if (actionInheritanceHierarchy.isChecked()) {
				mode = InheritanceMode.HIERARCHY;
			}
			inheritanceContentProvider.setInheritanceMode(mode);
			actionExpandAll.setEnabled(mode != InheritanceMode.HIERARCHY);
		}		
		
		searchViewerFilter.setFilterText(filterText);
		selectionViewer.refresh();
		if (!filterText.isEmpty()) {
			selectionViewer.expandAll();
		}
	}

	protected void initializeToolBarManager(ToolBarManager toolBarManager) {
		// Mark abstract classes
		actionMarkAbstract = new Action("Mark abstract classes (italics font)", Action.AS_CHECK_BOX) {
			@Override
			public void run() {
				setMarkAbstractClasses(isChecked());
			}
		};
		actionMarkAbstract.setImageDescriptor(ImprovedEcoreEditorPlugin
				.getImageDescriptor("icons/abstract.gif"));
		
		// Show Annotations
		actionShowAnnotations = new Action("Show Annotations", Action.AS_CHECK_BOX) {
			@Override
			public void run() {
				setShowAnnotations(isChecked());
			}
		};
		actionShowAnnotations.setImageDescriptor(ImprovedEcoreEditorPlugin
				.getImageDescriptor("icons/annotation.gif"));

		
		// Sort
		actionSort = new Action("Sort", Action.AS_CHECK_BOX) {
			@Override
			public void run() {
				activateSorter(isChecked());

			}
		};
		actionSort.setImageDescriptor(ImprovedEcoreEditorPlugin
				.getImageDescriptor("icons/alphab_sort_co.gif"));

		// Mark derived
		actionMarkDerived = new Action("Mark derived features",
				Action.AS_CHECK_BOX) {
			@Override
			public void run() {
				setMarkDerived(isChecked());
			}
		};
		actionMarkDerived.setImageDescriptor(ImprovedEcoreEditorPlugin
				.getImageDescriptor("icons/derived.gif"));

		// Inheritance: NONE
		actionInheritanceNone = new Action("No additional inheritance information",
				Action.AS_RADIO_BUTTON) {
			@Override
			public void run() {
				if (isChecked()) {
					setInheritanceMode(InheritanceMode.NONE);
				}
			}
		};
		actionInheritanceNone.setImageDescriptor(ImprovedEcoreEditorPlugin
				.getImageDescriptor("icons/none.gif"));

		// Inheritance: FEATURES
		actionInheritanceFeatures = new Action("Show inherited features",
				Action.AS_RADIO_BUTTON) {
			@Override
			public void run() {
				if (isChecked()) {
					setInheritanceMode(InheritanceMode.FEATURES);
				}
			}
		};
		actionInheritanceFeatures.setImageDescriptor(ImprovedEcoreEditorPlugin
				.getImageDescriptor("icons/features.gif"));

		// Inheritance: HIERARCHY
		actionInheritanceHierarchy = new Action("Show supertype hierarchy",
				Action.AS_RADIO_BUTTON) {
			@Override
			public void run() {
				if (isChecked()) {
					setInheritanceMode(InheritanceMode.HIERARCHY);
				}
			}
		};
		actionInheritanceHierarchy.setImageDescriptor(ImprovedEcoreEditorPlugin
				.getImageDescriptor("icons/hierarchy.gif"));

		// Expand all
		actionExpandAll = new Action("Expand All",
				ImprovedEcoreEditorPlugin
						.getImageDescriptor("icons/expandall.gif")) {
			@Override
			public void run() {
				getSelectionViewer().expandAll();
			}
		};

		// Collapse all
		Action actionCollapseAll = new Action("Collapse All",
				ImprovedEcoreEditorPlugin
						.getImageDescriptor("icons/collapseall.gif")) {
			@Override
			public void run() {
				getSelectionViewer().collapseAll();
			}
		};

		// add to toolbar manager
		toolBarManager.add(actionExpandAll);
		toolBarManager.add(actionCollapseAll);
		toolBarManager.add(new Separator());
		toolBarManager.add(actionShowAnnotations);
		toolBarManager.add(new Separator());
		toolBarManager.add(actionInheritanceNone);
		toolBarManager.add(actionInheritanceFeatures);
		toolBarManager.add(actionInheritanceHierarchy);
		toolBarManager.add(new Separator());
		toolBarManager.add(actionMarkDerived);
		toolBarManager.add(actionMarkAbstract);
		toolBarManager.add(actionSort);


		// Read preferences
		setShowAnnotations(Boolean.parseBoolean(ImprovedEcoreEditorPlugin
				.getPreferencesValue("showAnnotations", Boolean.TRUE.toString())));
		activateSorter(Boolean.parseBoolean(ImprovedEcoreEditorPlugin
				.getPreferencesValue("sort", Boolean.TRUE.toString())));
		setMarkDerived(Boolean.parseBoolean(ImprovedEcoreEditorPlugin
				.getPreferencesValue("markDerived", Boolean.TRUE.toString())));
		setInheritanceMode(InheritanceMode.valueOf(ImprovedEcoreEditorPlugin
				.getPreferencesValue("inheritanceMode",
						InheritanceMode.NONE.toString())));
		setMarkAbstractClasses(Boolean.parseBoolean(ImprovedEcoreEditorPlugin
				.getPreferencesValue("markAbstractClasses", Boolean.FALSE.toString())));
		
		
		toolBarManager.update(true);

	}


	public class ImprovedLabelProvider extends DefaultLabelProvider {

		protected Font fontItalic;

		protected Color colorInherited;
		
		protected Color colorDisabled;

		protected Image imageSuperType;

		public ImprovedLabelProvider(AdapterFactory adapterFactory,
				Viewer viewer) {
			super(adapterFactory, viewer);

			// Create italics font (get a copy of font datas, which we may
			// modify).
			FontData[] fontDatas = defaultFont.getFontData();
			for (FontData fontData : fontDatas) {
				int style = fontData.getStyle();
				style |= SWT.ITALIC;
				fontData.setStyle(style);
			}
			fontItalic = new Font(defaultFont.getDevice(), fontDatas);

			// Create color for inherited elements
			colorInherited = defaultFont.getDevice().getSystemColor(
					SWT.COLOR_DARK_GRAY);
			
			colorDisabled = defaultFont.getDevice().getSystemColor(
					SWT.COLOR_GRAY);

			ImageDescriptor descriptor = ImprovedEcoreEditorPlugin
					.getImageDescriptor("icons/supertype.gif");
			if (descriptor != null) {
				imageSuperType = descriptor.createImage();

			}
		}

		public Font getFont(Object object) {
			if (object instanceof EClass) {
				EClass eClass = (EClass) object;
				if (eClass.isAbstract() && actionMarkAbstract != null && actionMarkAbstract.isChecked()) {
					return fontItalic;
				}
			}
			return super.getFont(object);
		}

		public Color getForeground(Object object) {
			if (object instanceof InheritanceNode) {
				return colorInherited;
			}
			if (searchViewerFilter != null && !searchViewerFilter.directSelect(object)) {
				return colorDisabled;
			}
			return super.getForeground(object);
		}

		public String getText(Object element) {
			String text = super.getText(element);
			boolean markDerived = false;
			if (actionMarkDerived != null) {
				markDerived = actionMarkDerived.isChecked();
			}
			if (markDerived && element instanceof EStructuralFeature) {
				EStructuralFeature feature = (EStructuralFeature) element;
				if (feature.isDerived()) {
					return "/" + text;
				}
			}
			if (element instanceof InheritanceNode) {
				InheritanceNode node = (InheritanceNode) element;
				if (node.object instanceof EStructuralFeature
						&& node.mode == InheritanceMode.FEATURES) {
					EStructuralFeature feature = (EStructuralFeature) node.object;
					return feature.getEContainingClass().getName() + "." + text;
				}
			}
			return text;
		}

		@Override
		public Image getImage(Object object) {
			if (object instanceof InheritanceNode) {
				InheritanceNode node = (InheritanceNode) object;
				if (node.object instanceof EClass
						&& node.mode == InheritanceMode.HIERARCHY) {
					return imageSuperType;
				}

			}
			return super.getImage(object);
		}

		@Override
		protected Object getObject(Object object) {
			if (object instanceof InheritanceNode) {
				return ((InheritanceNode) object).object;
			}
			return super.getObject(object);
		}

		@Override
		public void dispose() {
			super.dispose();
			if (fontItalic != null) {
				fontItalic.dispose();
			}
			if (imageSuperType != null) {
				imageSuperType.dispose();
			}
		}
	}

	public TreeViewer getSelectionViewer() {
		return selectionViewer;
	}

	public void setMarkDerived(boolean markDerived) {
		if (actionMarkDerived.isChecked() != markDerived) {
			actionMarkDerived.setChecked(markDerived);
		}
		getSelectionViewer().refresh();

		ImprovedEcoreEditorPlugin.setPreferencesValue("markDerived", Boolean
				.valueOf(markDerived).toString());
	}

	public void setSorter(ViewerComparator sorter) {
		ISelection selection = selectionViewer.getSelection();
		selectionViewer.setComparator(sorter);
		selectionViewer.setSelection(selection);
	}

	public void activateSorter(boolean active) {
		if (actionSort.isChecked() != active) {
			actionSort.setChecked(active);
		}

		if (active) {
			setSorter(sorter);
		} else {
			setSorter(null);
		}

		// Set preference
		ImprovedEcoreEditorPlugin.setPreferencesValue("sort",
				Boolean.valueOf(active).toString());
	}

	protected void setMarkAbstractClasses(boolean show) {
		if (actionMarkAbstract.isChecked() != show) {
			actionMarkAbstract.setChecked(show);
		}

		selectionViewer.refresh();

		// Set preference
		ImprovedEcoreEditorPlugin.setPreferencesValue("markAbstractClasses",
				Boolean.valueOf(show).toString());
	}
	
	
	protected void setShowAnnotations(boolean show) {
		if (actionShowAnnotations.isChecked() != show) {
			actionShowAnnotations.setChecked(show);
		}

		if (!show) {
			searchViewerFilter.addSubFilter(annotationFilter);
		} else {
			searchViewerFilter.removeSubFilter(annotationFilter);
		}

		selectionViewer.refresh();
		if (!searchViewerFilter.isEmptyFilterText()) {
			selectionViewer.expandAll();
		}

		// Set preference
		ImprovedEcoreEditorPlugin.setPreferencesValue("showAnnotations",
				Boolean.valueOf(show).toString());
	}

	private void setInheritanceMode(InheritanceMode mode) {
		switch (mode) {
		case NONE:
			actionInheritanceNone.setChecked(true);
			break;
		case FEATURES:
			actionInheritanceFeatures.setChecked(true);
			break;
		case HIERARCHY:
			actionInheritanceHierarchy.setChecked(true);
			break;
		}
		
		actionExpandAll.setEnabled(mode != InheritanceMode.HIERARCHY);

		inheritanceContentProvider.setInheritanceMode(mode);
		selectionViewer.refresh();

		ImprovedEcoreEditorPlugin.setPreferencesValue("inheritanceMode",
				mode.toString());
	}

}
