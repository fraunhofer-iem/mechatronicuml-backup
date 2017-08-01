package org.muml.core.common.emf.edit.ui.extensions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.muml.core.common.emf.edit.ui.ExtensibleCreationDialog;

public abstract class AbstractDialogExtension implements IDialogExtension {

	private ExtensibleCreationDialog creationDialog;
	private Composite mainArea;
	private Composite buttonArea;
	
	public AbstractDialogExtension(ExtensibleCreationDialog creationDialog) {
		this.creationDialog = creationDialog;
	}

	public ExtensibleCreationDialog getCreationDialog() {
		return creationDialog;
	}
	
	public EStructuralFeature getStructuralFeature() {
		return creationDialog.getStructuralFeature();
	}

	@Override
	public void initialize() {
		// do nothing by default
	}

	@Override
	public void createMainArea(Composite parent) {
		mainArea = parent;
	}

	@Override
	public void createButtonArea(Composite parent) {
		buttonArea = parent;
	}

	@Override
	public void close() {
		// do nothing by default
	}

	@Override
	public void setVisible(boolean visible) {
		mainArea.setVisible(visible);
		((GridData) mainArea.getLayoutData()).exclude = !visible;
		buttonArea.setVisible(visible);
		((GridData) buttonArea.getLayoutData()).exclude = !visible;
	}

	public EObject getContainerObject() {
		return creationDialog.getContainerObject();
	}
	
	public void dispose() {
		// do nothing by default
	}

}
