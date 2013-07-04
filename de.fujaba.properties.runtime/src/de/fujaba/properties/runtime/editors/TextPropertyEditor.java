package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class TextPropertyEditor extends AbstractStructuralFeaturePropertyEditor {

	public TextPropertyEditor(EStructuralFeature feature) {
		super(feature);
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {

		Composite composite = factory.createComposite(parent);
		composite.setLayout(new RowLayout());
		factory.createText(composite, "");
	}

}
