package de.fujaba.properties.runtime.wizard;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.fujaba.properties.runtime.editors.IPropertyEditor;

public class PropertyEditorWizardPage extends WizardPage {
	private IPropertyEditor editor;

	public PropertyEditorWizardPage(IPropertyEditor editor) {
		super("Edit Element");
		this.editor = editor;
	}

	@Override
	public void createControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new FillLayout(SWT.VERTICAL));

		FormToolkit toolkit = new FormToolkit(container.getDisplay());

		ScrolledForm form = toolkit.createScrolledForm(container);
		toolkit.decorateFormHeading(form.getForm());
		form.getBody().setLayout(new FillLayout(SWT.VERTICAL));

		form.setText("Eclipse Forms API Example");

		editor.createControls(form.getBody(), toolkit);

		setControl(container);
	}

	@Override
	public void dispose() {
		editor.dispose();
		super.dispose();
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);

		if (visible) {
			// set focus
		}
	}

}
