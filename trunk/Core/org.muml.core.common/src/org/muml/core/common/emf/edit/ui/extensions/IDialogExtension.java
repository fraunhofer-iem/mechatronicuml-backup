package org.muml.core.common.emf.edit.ui.extensions;

import org.eclipse.swt.widgets.Composite;

public interface IDialogExtension {
	void initialize();
	void createMainArea(Composite parent);
	void createButtonArea(Composite parent);
	void close();
	void dispose();
	void setVisible(boolean visible);
}
