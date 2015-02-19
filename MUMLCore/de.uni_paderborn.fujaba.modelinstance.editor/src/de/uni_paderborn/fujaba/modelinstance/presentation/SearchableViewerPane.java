package de.uni_paderborn.fujaba.modelinstance.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;

public abstract class SearchableViewerPane extends ViewerPane {

	public static String EMPTY_PATTERN_TEXT = "Search...";
	protected List<Object> searchResult = new ArrayList<Object>();
	protected Text searchText;
	protected String searchPattern = "";
	protected Color colorInactive;
	protected Color colorActive;
	protected Runnable timer;
	
	protected ModifyListener modifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			setSearchPattern(searchText.getText());
		}
	};

	public SearchableViewerPane(IWorkbenchPage page, IWorkbenchPart part) {
		super(page, part);
		Display display = Display.getCurrent();
		colorInactive = display.getSystemColor(SWT.COLOR_GRAY);
		colorActive = display.getSystemColor(SWT.COLOR_BLACK);
	}

	protected void createTitleBar() {
		searchText = new Text((Composite) getControl(), SWT.NONE);
		searchText.addModifyListener(modifyListener);
		searchText.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				SearchableViewerPane.this.focusGained();
			}

			@Override
			public void focusLost(FocusEvent e) {
				SearchableViewerPane.this.focusLost();
			}
	
		});
		focusLost();
		recalculateSearchResults();
		((ViewForm) getControl()).setTopLeft(searchText);
	};
	
	protected void focusGained() {
		if (searchPattern.isEmpty()) {
			searchText.setText("");
		}
		searchText.setForeground(colorActive);
	}
	protected void focusLost() {
		if (searchText.getText().isEmpty()) {
			searchText.removeModifyListener(modifyListener);
			searchText.setText(EMPTY_PATTERN_TEXT);
			searchText.addModifyListener(modifyListener);
			searchText.setForeground(colorInactive);
		}
	}

	public void setSearchPattern(String searchPattern) {
		if (!this.searchPattern.equals(searchPattern)) {
			this.searchPattern = searchPattern;
	
			// Stop already running timer
			if (this.timer != null) {
			    Display.getCurrent().timerExec(-1, timer);
			}
		    this.timer = new Runnable() {
				public void run() {
					recalculateSearchResults();
				}
		    };
		    Display.getCurrent().timerExec(150, timer);
		}
	}

	protected void recalculateSearchResults() {
		if (getViewer() == null) {
			return;
		}

		Object selectedElement = null;
		if (getViewer().getSelection() instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) getViewer().getSelection();
			if (!selection.isEmpty()) {
				selectedElement = selection.getFirstElement();
			}
		}
		
		searchResult.clear();
		
		Object input = getViewer().getInput();
		StructuredViewer structuredViewer = (StructuredViewer) getViewer();
		ITreeContentProvider contentProvider = (ITreeContentProvider) structuredViewer.getContentProvider();
		List<Object> children = new ArrayList<Object>();
		List<Object> visited = new ArrayList<Object>();
		children.add(input);
		while (!children.isEmpty()) {
			List<Object> newChildren = new ArrayList<Object>();
			for (Object child : children) {
				for (Object newObject : contentProvider.getChildren(child)) {
					if (visited.contains(newObject)) {
						continue;
					}
					visited.add(newObject);
					if (selectObject(newObject)) {
						Object parent = newObject;
						while (parent != null && parent != input) {
							if (!searchResult.contains(parent)) {
								searchResult.add(parent);
							}
							parent = contentProvider.getParent(parent);
						}
					}
					newChildren.add(newObject);
				}
			}
			children = newChildren;
		}
		
		
		getViewer().refresh();
		if (getViewer() instanceof AbstractTreeViewer) {
			AbstractTreeViewer treeViewer = (AbstractTreeViewer) getViewer();
			if (!searchPattern.isEmpty() && !searchResult.isEmpty() && !searchResult.contains(selectedElement)) {
				treeViewer.expandAll();
				selectedElement = searchResult.get(0);
			}
			if (selectedElement != null) {
				treeViewer.setSelection(new StructuredSelection(selectedElement));
			}
		}
	}

	protected boolean selectObject(Object object) {
		if (object == null) {
			return false;
		}
		if (searchPattern.isEmpty()) {
			return true;
		}
		if (object instanceof EObject) {
			EObject element = (EObject) object;
			return selectEObject(element) || selectEObject(element.eClass());
		}
		return false;
	}

	protected boolean selectEObject(EObject element) {
		if (element == null) {
			return false;
		}
		for (EAttribute attribute : element.eClass().getEAllAttributes()) {
			Object value = element.eGet(attribute);
			if (value != null && value.toString().toUpperCase().contains(searchPattern.toUpperCase())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		((StructuredViewer) getViewer()).addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return searchResult.contains(element) || searchPattern == null || searchPattern.isEmpty();
			}
		});
		getViewer().getControl().setFocus();
	}

	@Override
	public void setTitle(Object object) {
		// do nothing
	}

}