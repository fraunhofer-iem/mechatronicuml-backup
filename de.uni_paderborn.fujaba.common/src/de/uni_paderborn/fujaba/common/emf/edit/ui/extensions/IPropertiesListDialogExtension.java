package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import org.eclipse.jface.viewers.ISelection;


public interface IPropertiesListDialogExtension extends IDialogExtension {

	void setInput(ISelection selection);	
}
