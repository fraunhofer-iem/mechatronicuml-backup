package de.uni_paderborn.fujaba.muml.common.properties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor;
import de.fujaba.properties.runtime.editors.TextPropertyEditor;
import de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

public class NaturalNumberTextEditor extends AbstractStructuralFeaturePropertyEditor {

	private TextPropertyEditor valueEditor;
	
	public NaturalNumberTextEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
		valueEditor = new TextPropertyEditor(adapterFactory, ValuetypePackage.Literals.NATURAL_NUMBER__VALUE, false) {
			
			protected void doSetValue(Object newValue) {
				NaturalNumber naturalNumber = ((NaturalNumber) input);
				try {
					if (newValue.equals("-1")) {
						naturalNumber.setInfinity(true);
					} else {
						naturalNumber.setValue(newValue.toString());
					}
				} catch (NumberFormatException nfe) {
					Shell shell = PlatformUI.getWorkbench().
			                getActiveWorkbenchWindow().getShell();
					MessageBox messageBox = new MessageBox(shell, SWT.ICON_INFORMATION);
					messageBox.setText("Change NaturalNumber");
					messageBox.setMessage(nfe.getLocalizedMessage());
					messageBox.open();
				}

				// If the value could not be applied, refresh editor!
				if (value == null && newValue != null || !value.equals(newValue)) {
					valueChanged();
				}
			}
			@Override
			public void refresh() {
				NaturalNumber naturalNumber = (NaturalNumber) element;
				if (naturalNumber == null) {
					setText("");
				} else if (naturalNumber.isInfinity()) {
					setText("*");
				} else {
					setText(naturalNumber.getValue());
				}
			}
			
			@Override
			public String getLabelText() {
				return NaturalNumberTextEditor.this.getLabelText();
			}
		};
	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
		valueEditor.createControls(parent, toolkit);		
	}
	
	@Override
	protected void valueChanged() {
		super.valueChanged();
		valueEditor.setInput(value);
	}
	
	@Override
	public void dispose() {
		valueEditor.dispose();
		super.dispose();
	}
	
	@Override
	public void refresh() {
		super.refresh();
		if (!valueEditor.isDisposed()) {
			valueEditor.refresh();
		}
	}

}
