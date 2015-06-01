package de.uni_paderborn.fujaba.muml.browser.providers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.Viewer;

import de.uni_paderborn.fujaba.muml.browser.items.ProgressNavigatorItem;

public class ModelBrowserContentProvider extends org.eclipse.ui.model.WorkbenchContentProvider {
	private Viewer viewer;
	private Map<IFile, ProgressNavigatorItem> loadingFiles = new HashMap<IFile, ProgressNavigatorItem>();
	
	public ModelBrowserContentProvider() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public Object getParent(Object element) {
		if (element instanceof ProgressNavigatorItem) {
			return ((ProgressNavigatorItem) element).getParent();
		}
		return super.getParent(element);
	}
	
	@Override
	public Object[] getChildren(Object element) {
		if (element instanceof IFile) {
			return new Object[] { getProgressItem((IFile) element)};
		} else {
			return super.getChildren(element);
		}
	}
	
	private Object getProgressItem(IFile element) {
		if (!loadingFiles.containsKey(element)) {
			ProgressNavigatorItem progressItem = new ProgressNavigatorItem(element);
			progressItem.setViewer(viewer);
			IFile file = (IFile) element;
			loadingFiles.put(file, progressItem);
		}
		return loadingFiles.get(element);
	}


	@Override
	public void dispose() {
		super.dispose();
		setViewer(null);
		for (ProgressNavigatorItem item : loadingFiles.values()) {
			item.dispose();
		}
		loadingFiles.clear();
	}

	/*
	 * (non-Javadoc) Method declared on IContentProvider.
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		super.inputChanged(viewer, oldInput, newInput);
		setViewer(viewer);
	}
	
	void setViewer(Viewer viewer) {
		if (this.viewer != viewer) {
			this.viewer = viewer;
			for (ProgressNavigatorItem item : loadingFiles.values()) {
				item.setViewer(viewer);
			}
		}
	}
}