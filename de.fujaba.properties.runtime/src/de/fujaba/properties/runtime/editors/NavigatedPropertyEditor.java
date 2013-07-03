package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class NavigatedPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {

	protected IPropertyEditor navigatedEditor;

	public NavigatedPropertyEditor(EStructuralFeature feature,
			IPropertyEditor navigatedEditor) {
		super(feature);
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
		navigatedEditor.createControls(parent, factory);
	}

	public void refresh() {
		super.refresh();
		navigatedEditor.refresh();
	}

	public void dispose() {
		navigatedEditor.dispose();
		super.dispose();
	}

}
