package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.Collection;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;

public class UseParserDialogExtension extends AbstractDialogExtension {

	private Button checkBox;

	public UseParserDialogExtension(ExtensibleCreationDialog creationDialog) {
		super(creationDialog);
	}

	@Override
	public void createMainArea(Composite parent) {
		checkBox = new Button(parent, SWT.CHECK);
		checkBox.setText("Use XText parser");
		checkBox.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				ExtensibleCreationDialog dialog = UseParserDialogExtension.this
						.getCreationDialog();
				Collection<Object> groups = dialog.getRegisteredGroups();
				for (Object group : groups) {
					boolean isXTextGroup = group == ExtensibleCreationDialog.EXTENSION_GROUP_XTEXT_PARSER;
					for (IDialogExtension extension : dialog
							.getExtensionsInGroup(group)) {
						boolean visible = group == ExtensibleCreationDialog.EXTENSION_GROUP_ALWAYS_VISIBLE
								|| isXTextGroup == checkBox.getSelection();
						extension.setVisible(visible);
					}
				}
			}

		});
	}

	@Override
	public void initialize() {
		checkBox.setSelection(true);
	}

}
