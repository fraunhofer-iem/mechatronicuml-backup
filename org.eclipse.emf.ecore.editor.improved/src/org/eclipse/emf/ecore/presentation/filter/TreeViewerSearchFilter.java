package org.eclipse.emf.ecore.presentation.filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class TreeViewerSearchFilter extends ViewerFilter {
	
	protected Map<Object, Boolean> cache = new HashMap<Object, Boolean>();
	protected String filterTextLowercase = "";
	protected Map<Object, Boolean> directCache = new HashMap<Object, Boolean>();


	public TreeViewerSearchFilter() {
	}
	
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return selectElement(viewer, element);
	}
	
	public boolean selectElement(Viewer viewer, Object element) {
		ITreeContentProvider contentProvider = (ITreeContentProvider) ((ContentViewer) viewer).getContentProvider();
		ILabelProvider labelProvider = (ILabelProvider) ((ContentViewer) viewer).getLabelProvider();

		return selectElement(contentProvider, labelProvider, element, new ArrayList<Object>());
	}

	public boolean selectElement(ITreeContentProvider contentProvider, ILabelProvider labelProvider, Object element, List<Object> visited) {
		if (filterTextLowercase.isEmpty()) {
			return true;
		}

		if (visited.contains(element)) {
			return false;
		}
		if (cache.containsKey(element)) {
			return cache.get(element);
		}
		boolean selected = directSelect(element, labelProvider);
		
		if (selected == false) {
			for (Object child : contentProvider.getChildren(element)) {
				if (selectElement(contentProvider, labelProvider, child, visited)) {
					selected = true;
					break;
				}
			}
		}
		cache.put(element, selected);
		return selected;
	}
	
	public boolean directSelect(Object element) {
		return directSelect(element, null); // just read cache
	}

	private boolean directSelect(Object element, ILabelProvider labelProvider) {
		if (filterTextLowercase.isEmpty()) {
			return true;
		}
		if (directCache.containsKey(element)) {
			return directCache.get(element);
		}
		if (labelProvider == null) {
			return false;
		}
		boolean selected = false;
		String label = labelProvider.getText(element);
		if (label == null) {
			label = "";
		}
		if (label.toLowerCase().contains(filterTextLowercase)) {
			selected = true;
		}
		directCache.put(element, selected);
		return selected;
	}

	public void setFilterText(String filterText) {
		this.filterTextLowercase = filterText.toLowerCase();
		cache.clear();
		directCache.clear();
	}
}