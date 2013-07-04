package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.fujaba.properties.runtime.RuntimePlugin;

public class CheckboxPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {

	public CheckboxPropertyEditor(EStructuralFeature feature) {
		super(feature);
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
	
		// Create one checkbox for a boolean feature, or enumeration with
		// two selectable enumerators
		final Button checkbox = factory.createButton(parent,
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

}
