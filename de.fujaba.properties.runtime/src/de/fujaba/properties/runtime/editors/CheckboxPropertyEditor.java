package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.fujaba.properties.runtime.RuntimePlugin;

public class CheckboxPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	
	private Button checkbox;

	public CheckboxPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {

		// Create one checkbox for a boolean feature, or enumeration with
		// two selectable enumerators
		checkbox = toolkit.createButton(parent,
				RuntimePlugin.makeHumanReadable(feature.getName(), true), SWT.CHECK);
		if (parent.getLayout() instanceof GridLayout) {
			checkbox.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false, 2, 1));
		}
		checkbox.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setValue(checkbox.getSelection());
			}
		});
		// Create two option buttons for a boolean feature, or multiple for
		// a enumeration

	}
	
	@Override
	protected void valueChanged() {
		super.valueChanged();
		if (checkbox != null && !checkbox.isDisposed()) {
			checkbox.setSelection(Boolean.TRUE.equals(value));
		}
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (checkbox != null) {
			checkbox.dispose();
			checkbox = null;
		}
	}

	@Override
	protected void doSetVisible(boolean visible) {
		for (Control control : new Control[] { checkbox }) {
			if (control != null && !control.isDisposed()) {
				control.setVisible(visible);
				if (control.getLayoutData() instanceof GridData) {
					((GridData) control.getLayoutData()).exclude = !visible;
				}
			}
		}
	}

}
