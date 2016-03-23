package org.muml.ape.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
import org.muml.ape.runtime.RuntimePlugin;

public class CheckboxPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	
	protected Button checkbox;

	public CheckboxPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void doCreateControls(Composite parent, FormToolkit toolkit) {

		// Create one checkbox for a boolean feature, or enumeration with
		// two selectable enumerators
		checkbox = toolkit.createButton(parent,
				getLabelText(), SWT.CHECK);
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


	public String getLabelText() {
		return RuntimePlugin.makeHumanReadable(feature.getName(), true);
	}
	
	@Override
	protected void valueChanged() {
		super.valueChanged();
		updateCheckboxValue();
	}
	
	protected void updateCheckboxValue() {
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
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		controls.add(checkbox);
		return controls;
	}
	
	@Override
	public void refresh() {
		super.refresh();
		if (checkbox != null && !checkbox.isDisposed()) {
			checkbox.setSelection(Boolean.TRUE.equals(value));
		}
	}
	
	public void setFocus() {
		if (checkbox != null && !checkbox.isDisposed()) {
			checkbox.setFocus();
		}
	}

}
