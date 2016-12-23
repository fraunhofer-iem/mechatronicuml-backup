package org.muml.pim.properties.valuetype.editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
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
import org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.ValuetypePackage;

public class CustomCardinalityPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	protected Label label;
	protected Label dots;
	protected Text lowerBound;
	protected Text upperBound;
	protected String currentLowerBound = "";
	protected String currentUpperBound = "";
	
	public static final int TEXT_WIDTH = 300;

	public CustomCardinalityPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void doCreateControls(Composite parent,
			FormToolkit toolkit) {
		
		label = toolkit.createLabel(parent, getLabelText());
		if (parent.getLayout() instanceof GridLayout) {
			label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		}
		int style = toolkit.getBorderStyle() | SWT.BORDER;
		
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout containerLayout = new GridLayout(3, false);
		containerLayout.marginWidth = containerLayout.marginHeight = 0;
		container.setLayout(containerLayout);		
		if (parent.getLayout() instanceof GridLayout) {
			GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
			container.setLayoutData(gridData);
		}
		
		GridData gridData;
		
		// Lower Bound text field
		lowerBound = toolkit.createText(container, "", style);
		gridData = new GridData(SWT.LEFT, SWT.FILL, false, false);
		gridData.minimumWidth = TEXT_WIDTH;
		lowerBound.setLayoutData(gridData);
		
		lowerBound.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				currentLowerBound = lowerBound.getText();
			}
			
		});
		lowerBound.addKeyListener(new org.eclipse.swt.events.KeyAdapter() {
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				if (e.keyCode == 13 || e.character == '\r') {
					modify();
				}
			}

		});
		lowerBound.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				modify();
			}
		});
		
		// Dots label
		dots = new Label(container, SWT.NONE);
		dots.setText("..");
		
		// Upper Bound text field
		upperBound = toolkit.createText(container, "", style);
		gridData = new GridData(SWT.LEFT, SWT.FILL, false, false);
		gridData.minimumWidth = TEXT_WIDTH;
		upperBound.setLayoutData(gridData);
		upperBound.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				currentUpperBound = upperBound.getText();
			}
			
		});
		upperBound.addKeyListener(new org.eclipse.swt.events.KeyAdapter() {
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				if (e.keyCode == 13 || e.character == '\r') {
					modify();
				}
			}
		});
		upperBound.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				modify();
			}
		});
	
		refresh();
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

	@Override
	public void dispose() {
		modify(); // If dialog was closed before text lost focus
		super.dispose();
	}
	

	@Override
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		controls.add(label);
		controls.add(lowerBound);
		controls.add(upperBound);
		controls.add(dots);
		return controls;
	}
		
	@Override
	public void setFocus() {
		if (lowerBound != null && !lowerBound.isDisposed()) {
			lowerBound.setFocus();
		}
	}

	protected void modify() {
		// Get or create Cardinality
 		Cardinality cardinality;
 		if (value instanceof Cardinality) {
 			cardinality = (Cardinality) value;
 		} else {
 			cardinality = (Cardinality) EcoreUtil.create(ValuetypePackage.Literals.CARDINALITY);
 		}

		// Make sure that the setValue() method always calls doSetValue()
 		value = null;

		setValue(cardinality);
	}

	@Override
	protected void doSetValue(Object newValue) {

		// Set Lower Bound
		IItemPropertyDescriptor lowerBoundDescriptor = getItemPropertyDescriptor(adapterFactory, ValuetypePackage.Literals.CARDINALITY__LOWER_BOUND, newValue);
		lowerBoundDescriptor.setPropertyValue(newValue, currentLowerBound);

		// Set Upper Bound
		IItemPropertyDescriptor upperBoundDescriptor = getItemPropertyDescriptor(adapterFactory, ValuetypePackage.Literals.CARDINALITY__UPPER_BOUND, newValue);
		upperBoundDescriptor.setPropertyValue(newValue, currentUpperBound);

		// Set new Cardinality
		super.doSetValue(newValue);
	}

	protected void setText(Object value) {
		Cardinality cardinality = null;
		if (value instanceof Cardinality) {
			cardinality = (Cardinality) value;
		}

		String lowerBoundText = "null";
		if (cardinality != null &&  cardinality.getLowerBound() != null) {
			lowerBoundText = cardinality.getLowerBound().toString();
		}

		String upperBoundText = "null";
		if (cardinality != null && cardinality.getUpperBound() != null) {
			upperBoundText = cardinality.getUpperBound().toString();
		}

		if (lowerBound != null && !lowerBound.isDisposed() && !lowerBound.getText().equals(lowerBoundText)) {
			lowerBound.setText(lowerBoundText);
		}	
		if (upperBound != null && !upperBound.isDisposed() && !upperBound.getText().equals(upperBoundText)) {
			upperBound.setText(upperBoundText);
		}
	}
}