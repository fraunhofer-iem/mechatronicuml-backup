package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;

public class SimpleTextualDialogExtension extends AbstractDialogExtension {
	private Text textfield;
	private String initialString = "";
	private String result = "";

	public SimpleTextualDialogExtension(ExtensibleCreationDialog creationDialog, String initialString) {
		super(creationDialog);
		this.initialString = initialString;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void createMainArea(Composite parent) {
		// TODO Auto-generated method stub
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		/*Label lblParameters = new Label(parent, SWT.NONE);
		GridData gdLblParameters = new GridData(SWT.LEFT, SWT.CENTER,
				false, false, 1, 1);
		gdLblParameters.verticalIndent = 5;
		lblParameters.setLayoutData(gdLblParameters);
		lblParameters.setText("&Textual representation:");*/
		textfield = new Text(parent, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
		//textfield.setText("");
		textfield.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		textfield.setText(initialString);
		//textfield.setBounds(0, 0, 2550, 250);
	}

	@Override
	public void createButtonArea(Composite parent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void okPressed() {
		// TODO Auto-generated method stub
		//XtextResource res = new XtextResource();
		System.out.println(getContainerObject());
		result = textfield.getText();
		System.out.println("pressed");
	}
	
	public String getResult() {
		return result;
	}

}
