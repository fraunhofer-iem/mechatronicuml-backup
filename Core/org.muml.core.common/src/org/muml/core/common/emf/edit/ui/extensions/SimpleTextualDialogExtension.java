package org.muml.core.common.emf.edit.ui.extensions;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.muml.core.common.emf.edit.ui.ExtensibleCreationDialog;

public class SimpleTextualDialogExtension extends AbstractDialogExtension {
	private Text textfield;
	private String initialString = "";
	private String resultString = "";
	private ITextParser parser;

	public SimpleTextualDialogExtension(ExtensibleCreationDialog creationDialog, String initialString, ITextParser parser) {
		super(creationDialog);
		this.initialString = initialString;
		this.parser = parser;
	}

	@Override
	public void initialize() {
	}

	@Override
	public void createMainArea(Composite parent) {
		super.createMainArea(parent);
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		textfield = new Text(parent, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
		textfield.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		textfield.setText(initialString);
	}

	@Override
	public void close() {
		//XtextResource res = new XtextResource();
		//System.out.println(getContainerObject());
		resultString = textfield.getText();
	}
	
	public Object getResult() {
		return parser.parse(resultString);
	}
	
	public interface ITextParser {
		Object parse(String text);
	}

}
