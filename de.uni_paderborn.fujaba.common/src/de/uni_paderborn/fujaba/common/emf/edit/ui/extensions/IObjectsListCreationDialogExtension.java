package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;

public interface IObjectsListCreationDialogExtension extends
		ICreationDialogExtension {
	EObject getListSelection();

	List<Object> getCurrentListItems();

	void setListSelection(ISelection parameterSelection);
	
	void addListItem(EObject newObject);

	TableViewer getTableViewer();

}
