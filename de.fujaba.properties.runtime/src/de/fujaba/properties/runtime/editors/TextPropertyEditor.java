package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.fujaba.properties.runtime.RuntimePlugin;

public class TextPropertyEditor extends AbstractStructuralFeaturePropertyEditor {

	public TextPropertyEditor(EStructuralFeature feature) {
		super(feature);
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
		factory.createLabel(parent,  RuntimePlugin.makeHumanReadable(feature.getName(), true) + ":");
		factory.createText(parent, "[default value]");
	}

}
