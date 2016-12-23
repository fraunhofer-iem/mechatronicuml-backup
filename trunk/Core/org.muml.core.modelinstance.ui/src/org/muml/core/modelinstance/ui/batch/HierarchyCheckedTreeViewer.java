package org.muml.core.modelinstance.ui.batch;

import java.util.ArrayList;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;

// Copied from ContainerCheckedTreeViewer and modified

/**
 * CheckboxTreeViewer with special behaviour of the checked / gray state on
 * container (non-leaf) nodes: The grayed state is used to visualize the checked
 * state of its children. Containers are checked and non-gray if all contained
 * leafs are checked. The container is grayed if some but not all leafs are
 * checked.
 * 
 * @since 3.1
 */
public class HierarchyCheckedTreeViewer extends CheckboxTreeViewer {

	private boolean useHierarchy;

	public HierarchyCheckedTreeViewer(Composite parent, int style) {
		super(parent, style);
		initViewer();
	}
	
	public void setUseHierarchy(boolean useHierarchy) {
		this.useHierarchy = useHierarchy;
		for (TreeItem item : getTree().getItems()) {
			updateChildrenItems(item);
		}
	}
	
	private void initViewer() {
		setUseHashlookup(true);
		addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				doCheckStateChanged(event.getElement());
			}
		});
		addTreeListener(new ITreeViewerListener() {
			public void treeCollapsed(TreeExpansionEvent event) {
			}

			public void treeExpanded(TreeExpansionEvent event) {
				if (useHierarchy) {
					Widget item = findItem(event.getElement());
					if (item instanceof TreeItem) {
						initializeItem((TreeItem) item);
					}
				}
			}
		});
	}

	/**
	 * Update element after a checkstate change.
	 * 
	 * @param element
	 */
	protected void doCheckStateChanged(Object element) {
		Widget item = findItem(element);
		if (item instanceof TreeItem) {
			TreeItem treeItem = (TreeItem) item;
			treeItem.setGrayed(false);
			if (useHierarchy) {
				updateChildrenItems(treeItem);
				updateParentItems(treeItem.getParentItem());
			}
		}
	}

	/**
	 * The item has expanded. Updates the checked state of its children.
	 */
	private void initializeItem(TreeItem item) {
		if (item.getChecked() && !item.getGrayed()) {
			updateChildrenItems(item);
		}
	}

	/**
	 * Updates the check state of all created children
	 */
	private void updateChildrenItems(TreeItem parent) {
		Item[] children = getChildren(parent);
		boolean state = parent.getChecked();
		for (int i = 0; i < children.length; i++) {
			TreeItem curr = (TreeItem) children[i];
			if (curr.getData() != null
					&& ((curr.getChecked() != state) || curr.getGrayed())) {
				curr.setChecked(state);
				curr.setGrayed(false);
				updateChildrenItems(curr);
			}
		}

	}

	/**
	 * Updates the check / gray state of all parent items
	 */
	private void updateParentItems(TreeItem item) {
		if (item != null) {
			Item[] children = getChildren(item);
			boolean containsChecked = false;
			boolean containsUnchecked = false;
			for (int i = 0; i < children.length; i++) {
				TreeItem curr = (TreeItem) children[i];
				containsChecked |= curr.getChecked();
				containsUnchecked |= (!curr.getChecked() || curr.getGrayed());
			}
			item.setChecked(containsChecked);
			item.setGrayed(containsChecked && containsUnchecked);
			updateParentItems(item.getParentItem());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ICheckable#setChecked(java.lang.Object,
	 * boolean)
	 */
	public boolean setChecked(Object element, boolean state) {
		if (super.setChecked(element, state)) {
			doCheckStateChanged(element);
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.CheckboxTreeViewer#setCheckedElements(java.
	 * lang.Object[])
	 */
	public void setCheckedElements(Object[] elements) {
		super.setCheckedElements(elements);
		for (int i = 0; i < elements.length; i++) {
			doCheckStateChanged(elements[i]);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.AbstractTreeViewer#setExpanded(org.eclipse.
	 * swt.widgets.Item, boolean)
	 */
	protected void setExpanded(Item item, boolean expand) {
		super.setExpanded(item, expand);
		if (useHierarchy) {
			if (expand && item instanceof TreeItem) {
				initializeItem((TreeItem) item);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.CheckboxTreeViewer#getCheckedElements()
	 */
	public Object[] getCheckedElements() {
		Object[] checked = super.getCheckedElements();
		
		if (!useHierarchy) {
			return checked;
		}
		
		// add all items that are children of a checked node but not created yet
		ArrayList result = new ArrayList();
		for (int i = 0; i < checked.length; i++) {
			Object curr = checked[i];
			result.add(curr);
			Widget item = findItem(curr);
			if (item != null) {
				Item[] children = getChildren(item);
				// check if contains the dummy node
				if (children.length == 1 && children[0].getData() == null) {
					// not yet created
					collectChildren(curr, result);
				}
			}
		}
		return result.toArray();
	}

	/**
	 * Recursively add the filtered children of element to the result.
	 * 
	 * @param element
	 * @param result
	 */
	private void collectChildren(Object element, ArrayList result) {
		Object[] filteredChildren = getFilteredChildren(element);
		for (int i = 0; i < filteredChildren.length; i++) {
			Object curr = filteredChildren[i];
			result.add(curr);
			collectChildren(curr, result);
		}
	}

}
