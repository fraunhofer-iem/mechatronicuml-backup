package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;

public abstract class AbstractDialogExtension implements IDialogExtension {
	private ExtensibleCreationDialog creationDialog;
	
	public AbstractDialogExtension(ExtensibleCreationDialog creationDialog) {
		this.creationDialog = creationDialog;
	}

	public ExtensibleCreationDialog getCreationDialog() {
		return creationDialog;
	}
	
	public EStructuralFeature getStructuralFeature() {
		return creationDialog.getStructuralFeature();
	}
	
	
}
