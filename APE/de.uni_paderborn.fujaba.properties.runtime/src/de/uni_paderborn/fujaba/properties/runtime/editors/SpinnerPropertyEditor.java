package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class SpinnerPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	private int selection;
	protected Label label;
	protected Spinner spinner;
	protected int digits;

	public SpinnerPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature, int digits) {
		super(adapterFactory, feature);
		this.digits = digits;
	}

	@Override
	public void doCreateControls(Composite parent, FormToolkit toolkit) {

		label = toolkit.createLabel(parent, getLabelText());

		spinner = new Spinner(parent, SWT.BORDER | toolkit.getOrientation());
		toolkit.paintBordersFor(spinner);
		toolkit.adapt(spinner);
		// if (parent.getLayout() instanceof GridLayout) {
		// spinner.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		// }
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

		spinner.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				selection = spinner.getSelection();
				// If we do not have the focus, the focusLost event will not be
				// fired.
				// Probably the spinbuttons were used, so we must call modify().
				if (!spinner.isFocusControl()) {
					modify();
				}
			}
		});

		spinner.setMinimum(Integer.MIN_VALUE);
		spinner.setMaximum(Integer.MAX_VALUE);
		spinner.setIncrement(1);
		spinner.setPageIncrement(10);

		refresh();

	}

	protected void modify() {
		double doubleValue = selection / Math.pow(10, digits);
		Object newValue = null;
		EDataType dataType = ((EAttribute) feature).getEAttributeType();
		if (dataType.getName() == "EInt") {
			newValue = (int) doubleValue;
		} else if (dataType.getName() == "EFloat") {
			newValue = (float) doubleValue;
		} else if (dataType.getName() == "EDouble") {
			newValue = doubleValue;
		}
		if (newValue != null && !newValue.equals(value)) {
			setValue(newValue);
		}
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		applyValue();
	}

	private void applyValue() {

		if (spinner != null && !spinner.isDisposed() && value != null) {
			double factor = Math.pow(10, digits);
			int newValue = (int) (Double.parseDouble(value.toString()) * factor);

			if (spinner.getSelection() != newValue) {
				spinner.setSelection(newValue);
			}
		}
	}

	@Override
	public void refresh() {
		super.refresh();
		applyValue();
	}

	@Override
	public void dispose() {
		super.dispose();
		modify();
	}


	@Override
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		controls.add(label);
		controls.add(spinner);
		return controls;
	}
	
	@Override
	public void setFocus() {
		if (spinner != null && !spinner.isDisposed()) {
			spinner.setFocus();
		}
	}
}