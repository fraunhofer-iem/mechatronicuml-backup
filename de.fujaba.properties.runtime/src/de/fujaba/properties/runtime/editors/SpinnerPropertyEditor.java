package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class SpinnerPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	protected Spinner spinner;
	protected int digits;

	public SpinnerPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature, int digits) {
		super(adapterFactory, feature);
		this.digits = digits;
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
		factory.createLabel(parent, getLabelText());

		spinner = new Spinner(parent, SWT.NONE);
		if (parent.getLayout() instanceof GridLayout) {
			spinner.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		}
		spinner.addKeyListener(new org.eclipse.swt.events.KeyAdapter() {
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				if (e.keyCode == 13) {
					modify();
				}
			}

		});
		spinner.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				modify();
			}
		});

		spinner.setMinimum(Integer.MIN_VALUE);
		spinner.setMaximum(Integer.MAX_VALUE);
		spinner.setIncrement(1);
		spinner.setPageIncrement(10);

		refresh();

	}

	protected void modify() {
		String newValue = spinner.getText();
		if (!newValue.equals(value)) {
			setValue(newValue);
		}
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();

		if (spinner != null) {
			double factor = Math.pow(10, digits);
			int newValue = (int) (Double.parseDouble(value.toString()) * factor);

			if (spinner.getSelection() != newValue) {
				spinner.setSelection(newValue);
			}
		}
	}
}