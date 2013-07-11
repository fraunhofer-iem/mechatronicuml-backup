package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class TextPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	protected Text text;
	protected boolean multiLine;

	public TextPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature, boolean multiLine) {
		super(adapterFactory, feature);
		this.multiLine = multiLine;
	}

	@Override
	public void createControls(Composite parent,
			FormToolkit factory) {
		factory.createLabel(parent, getLabelText()).setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		int style = 0;
		if (multiLine) {
			style |= SWT.MULTI | SWT.V_SCROLL;
		}
		text = factory.createText(parent, "", style);
		if (parent.getLayout() instanceof GridLayout) {
			GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
			if (multiLine) {
				gridData.minimumHeight = 80;
				gridData.heightHint = 80;
			}
			text.setLayoutData(gridData);
		}
		text.addKeyListener(new org.eclipse.swt.events.KeyAdapter() {
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				if (e.keyCode == 13) {
					modify();
				}
			}

		});
		text.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				modify();
			}
		});

		refresh();

	}

	protected void modify() {
		String newValue = text.getText();
		if (!newValue.equals(value)) {
			setValue(newValue);
		}
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		refresh();
	}
	
	@Override
	public void refresh() {
		super.refresh();

		String val = "";
		if (value != null) {
			val = value.toString();
		}

		if (text != null && !text.getText().equals(val)) {
			text.setText(val);
		}
	}
}