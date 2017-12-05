package org.muml.core.common.emf.edit.ui.extensions;

import java.util.Collection;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.muml.core.common.emf.edit.ui.ExtensibleCreationDialog;

public class UseParserDialogExtension extends AbstractDialogExtension {

	private Button checkBox;
	private ObjectsListDialogExtension objectsListDialogExtension;
	private SimpleTextualDialogExtension textualDialogExtension;
	private boolean useXtextParser;

	public UseParserDialogExtension(ExtensibleCreationDialog creationDialog) {
		super(creationDialog);
	}

	@Override
	public void createMainArea(Composite parent) {
		super.createMainArea(parent);
		checkBox = new Button(parent, SWT.CHECK);
		checkBox.setText("Use XText parser");
		checkBox.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				hideExtensions();
			}

		});
	}
	
	private void hideExtensions() {
		ExtensibleCreationDialog dialog = getCreationDialog();
		Collection<Object> groups = dialog.getRegisteredGroups();
		for (Object group : groups) {
			boolean isXTextGroup = group == ExtensibleCreationDialog.EXTENSION_GROUP_XTEXT_PARSER;
			for (IDialogExtension extension : dialog.getExtensionsInGroup(group)) {
				boolean visible = group == ExtensibleCreationDialog.EXTENSION_GROUP_ALWAYS_VISIBLE
					|| isXTextGroup == checkBox.getSelection();
				extension.setVisible(visible);
			}
		}
		dialog.layout();	
	}

	@Override
	public void initialize() {
		checkBox.setSelection(false);
		hideExtensions();
	}
	
	@Override
	public void close() {
		useXtextParser = checkBox.getSelection();
	}
	
	public void setTextualDialogExtension(SimpleTextualDialogExtension textualDialogExtension) {
		this.textualDialogExtension = textualDialogExtension;
	}
	
	public void setObjectsListDialogExtension(ObjectsListDialogExtension objectsListDialogExtension) {
		this.objectsListDialogExtension = objectsListDialogExtension;
	}
	
	public Object getResult() {
		if (useXtextParser) {
			return textualDialogExtension.getResult();
		}
		return objectsListDialogExtension.getResult();
	}
}
