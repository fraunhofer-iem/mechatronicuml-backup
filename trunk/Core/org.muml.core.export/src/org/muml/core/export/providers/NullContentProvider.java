package org.muml.core.export.providers;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class NullContentProvider implements ITreeContentProvider {
	
	public static NullContentProvider DEFAULT = new NullContentProvider();

	@Override
	public void dispose() {
		
	}
	@Override
	public void inputChanged(Viewer viewer, Object oldInput,
			Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return new Object[] { };
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		return new Object[] { };
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return false;
	}					
}
