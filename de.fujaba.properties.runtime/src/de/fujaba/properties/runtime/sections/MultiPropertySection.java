package de.fujaba.properties.runtime.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.fujaba.properties.runtime.editors.IPropertyEditor;

/**
 * A PropertySection which is subdivided into multiple categories.
 * 
 * @author bingo
 * 
 */
public class MultiPropertySection extends AbstractPropertySection {

	private List<IPropertyEditor> propertyEditors = new ArrayList<IPropertyEditor>();
	
	public void addPropertyEditor(IPropertyEditor editor) {
		propertyEditors.add(editor);
	}

	public void removePropertyEditor(IPropertyEditor editor) {
		propertyEditors.remove(editor);
	}


	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		for (IPropertyEditor editor : propertyEditors) {
			editor.createControls(composite, factory);
		}
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Assert.isTrue(selection instanceof IStructuredSelection);
		Object input = ((IStructuredSelection) selection).getFirstElement();
		for (IPropertyEditor editor : propertyEditors) {
			editor.setInput(input);
		}
	}

	public void refresh() {
		super.refresh();
		for (IPropertyEditor editor : propertyEditors) {
			editor.refresh();
		}
	}
	
	public void dispose() {
		for (IPropertyEditor editor : propertyEditors) {
			editor.dispose();
		}
		super.dispose();
	}

}
