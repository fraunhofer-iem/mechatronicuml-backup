package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import org.eclipse.swt.widgets.Composite;

public interface IDialogExtension {
	void initialize();
	void createMainArea(Composite parent);
	void createButtonArea(Composite parent);
	void okPressed();
	void dispose();
	void setVisible(boolean visible);
}
