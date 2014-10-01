package de.uni_paderborn.fujaba.properties.runtime.wizard;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor;

public class PropertyEditorWizardPage extends WizardPage {
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
		toolkit.setBorderStyle(SWT.BORDER);
		
		//ScrolledForm form = toolkit.createScrolledForm(container);
		ScrolledForm form = new ScrolledForm(container, SWT.V_SCROLL
				| toolkit.getOrientation());
		form.setExpandHorizontal(true);
		form.setExpandVertical(true);
		form.setBackground(toolkit.getColors().getBackground());
		form.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
		form.setFont(JFaceResources.getHeaderFont());
		// toolkit.paintBordersFor(form);
//		toolkit.decorateFormHeading(form.getForm());
//		form.setText("Eclipse Forms API Example");
		form.getBody().setLayout(new FillLayout(SWT.VERTICAL));

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
			getControl().setFocus();
			editor.refresh();
		}
	}

	public void setInput(Object object) {
		if (!editor.isDisposed()) {
			editor.setInput(object);
		}
	}

	public Object getInput() {
		return editor.getInput();
	}

	public AdapterFactory getAdapterFactory() {
		return editor.getAdapterFactory();
	}

	public boolean isDisposed() {
		return editor.isDisposed();
	}

}
