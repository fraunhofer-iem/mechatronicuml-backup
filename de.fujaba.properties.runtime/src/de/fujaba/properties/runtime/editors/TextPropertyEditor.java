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
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class TextPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	protected Text text;

	public TextPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
		factory.createLabel(parent, getLabelText());

		text = factory.createText(parent, "");
		if (parent.getLayout() instanceof GridLayout) {
			text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
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
		if (text != null) {
			text.setText(value.toString());
		}
	}
}