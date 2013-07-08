package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
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
		
		Text text = factory.createText(parent, "[default value]");
		if (parent.getLayout() instanceof GridLayout) {
			text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		}
	}

}
