package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class TextPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	protected Label label;
	protected Text text;
	protected boolean multiLine;
	protected String currentValue = "";
	
	public TextPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature, boolean multiLine) {
		super(adapterFactory, feature);
		this.multiLine = multiLine;
	}

	@Override
	public void createControls(Composite parent,
			FormToolkit toolkit) {
		super.createControls(parent, toolkit);
		label = toolkit.createLabel(parent, getLabelText());
		if (parent.getLayout() instanceof GridLayout) {
			label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		}
		int style = toolkit.getBorderStyle();
		if (multiLine) {
			style |= SWT.MULTI | SWT.V_SCROLL;
		}
		text = toolkit.createText(parent, "", style);
		if (parent.getLayout() instanceof GridLayout) {
			GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
			if (multiLine) {
				gridData.minimumHeight = 80;
				gridData.heightHint = 80;
			}
			text.setLayoutData(gridData);
		}
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				currentValue = text.getText();
			}
			
		});
		
		if (!multiLine) {
			text.addKeyListener(new org.eclipse.swt.events.KeyAdapter() {
				public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
					if (e.keyCode == 13 || e.character == '\r') {
						modify();
					}
				}
			});
		}
		text.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				modify();
			}
		});

		refresh();

	}

	protected void modify() {
		// Do not read from text field, as it could have been disposed, see comment in dispose()
		//String newValue = text.getText();
		Object newValue = currentValue; 
		if (text != null &&  (value == null && newValue != null || value != null && !newValue.equals(value.toString()))) {
			if (EcorePackage.Literals.EDOUBLE.equals(feature.getEType())) {
				newValue = Double.parseDouble(currentValue);
			} else if (EcorePackage.Literals.EINT.equals(feature.getEType())) {
				newValue = Integer.parseInt(currentValue);
			} else if (EcorePackage.Literals.ELONG.equals(feature.getEType())) {
				newValue = Long.parseLong(currentValue);
			} else if (EcorePackage.Literals.EFLOAT.equals(feature.getEType())) {
				newValue = Float.parseFloat(currentValue);
			} else if (EcorePackage.Literals.ESTRING.equals(feature.getEType())) {
				if (currentValue.isEmpty() && value == null) {
					newValue = null;
				}
			}
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
		setText(value);
	}
	
	protected void setText(Object value) {
		String val = "";
		if (value != null) {
			val = value.toString();
		}

		if (text != null && !text.isDisposed() && !text.getText().equals(val)) {
			text.setText(val);
		}		
	}

	@Override
	public void dispose() {
		modify(); // If dialog was closed before text lost focus
		super.dispose();
	}

	@Override
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		controls.add(label);
		controls.add(text);
		return controls;
	}
	
	
	@Override
	public void setFocus() {
		if (text != null && !text.isDisposed()) {
			text.setFocus();
		}
	}
}