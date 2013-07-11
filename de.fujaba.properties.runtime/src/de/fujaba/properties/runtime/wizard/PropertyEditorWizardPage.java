package de.fujaba.properties.runtime.wizard;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.fujaba.properties.runtime.editors.IPropertyEditor;

public class PropertyEditorWizardPage extends WizardPage implements IPropertyEditor {
	private IPropertyEditor editor;

	public PropertyEditorWizardPage(IPropertyEditor editor) {
		super("Edit element properties");
		this.editor = editor;
		setTitle("Edit element properties");
	}

	@Override
	public void createControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NULL);	
		container.setLayout(new FillLayout(SWT.VERTICAL));
		FormToolkit toolkit = new FormToolkit(container.getDisplay());
		
		createControls(container, toolkit);

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
			getControl().setFocus();
			editor.refresh();
		}
	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
		ScrolledForm form = toolkit.createScrolledForm(parent);
		// toolkit.paintBordersFor(form);
//		toolkit.decorateFormHeading(form.getForm());
//		form.setText("Eclipse Forms API Example");
		form.getBody().setLayout(new FillLayout(SWT.VERTICAL));

		editor.createControls(form.getBody(), toolkit);
	}

	@Override
	public void setInput(Object object) {
		if (!editor.isDisposed()) {
			editor.setInput(object);
		}
	}

	@Override
	public Object getInput() {
		return editor.getInput();
	}

	@Override
	public void refresh() {
		if (!editor.isDisposed()) {
			editor.refresh();
		}
	}

	@Override
	public AdapterFactory getAdapterFactory() {
		return editor.getAdapterFactory();
	}

	@Override
	public boolean isDisposed() {
		return editor.isDisposed();
	}

}
