package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class OptionPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {

	public OptionPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
		Composite composite = factory.createComposite(parent);
		composite.setLayout(new RowLayout());
		// Create two option buttons for a boolean feature, or multiple for
		// a enumeration

	}

}
