package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
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
		Composite composite = factory.createComposite(parent);
		composite.setLayout(new RowLayout());
		// Create one checkbox for a boolean feature, or enumeration with
		// two selectable enumerators
		final Button checkbox = factory.createButton(composite,
				RuntimePlugin.makeHumanReadable(feature.getName(), true), SWT.CHECK);
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
