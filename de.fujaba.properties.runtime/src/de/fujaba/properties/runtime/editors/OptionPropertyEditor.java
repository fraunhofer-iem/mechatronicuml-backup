package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class OptionPropertyEditor extends AbstractStructuralFeaturePropertyEditor {

	protected boolean checkbox;
	
	public OptionPropertyEditor(EStructuralFeature feature, boolean checkbox) {
		super(feature);
		this.checkbox = checkbox;
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
		Composite composite = factory.createComposite(parent);
		composite.setLayout(new RowLayout());
		if (checkbox) {
			// Create one checkbox for a boolean feature, or enumeration with two selectable enumerators
			final Button checkbox2 = factory.createButton(composite, feature.getName(), SWT.CHECK);
			checkbox2.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (checkbox2.getSelection()) {
						
					}
				}
			});
		} else {
			// Create two option buttons for a boolean feature, or multiple for a enumeration
		}
	}

}
