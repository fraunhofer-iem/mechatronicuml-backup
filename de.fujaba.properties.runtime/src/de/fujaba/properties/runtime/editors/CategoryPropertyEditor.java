package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class CategoryPropertyEditor extends AbstractPropertyEditor {

	private String title;

	protected List<IPropertyEditor> propertyEditors = new ArrayList<IPropertyEditor>();

	public CategoryPropertyEditor(String title) {
		this.title = title;
	}
	
	public void addPropertyEditor(IPropertyEditor editor) {
		propertyEditors.add(editor);
	}

	public void removePropertyEditor(IPropertyEditor editor) {
		propertyEditors.remove(editor);
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
		for (IPropertyEditor editor : propertyEditors) {
			editor.createControls(parent, factory);
		}
	}

	@Override
	public void dispose() {
		for (IPropertyEditor editor : propertyEditors) {
			editor.dispose();
		}
	}

	

}
