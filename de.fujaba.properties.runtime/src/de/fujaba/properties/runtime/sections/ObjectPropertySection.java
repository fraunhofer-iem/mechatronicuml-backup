package de.fujaba.properties.runtime.sections;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.fujaba.properties.runtime.RuntimePlugin;
import de.fujaba.properties.runtime.editors.ObjectPropertyEditor;

/**
 * A PropertySection which contains exactly one ObjectPropertyEditor.
 * 
 * @author bingo
 * 
 */
public class ObjectPropertySection extends AbstractPropertySection {

	protected ObjectPropertyEditor editor;

	public ObjectPropertySection() {
		editor = createObjectPropertyEditor();
	}

	protected ObjectPropertyEditor createObjectPropertyEditor() {
		return new ObjectPropertyEditor(null, "null", true);
	}

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		FormToolkit toolkit = getWidgetFactory();
		editor.createControls(parent, toolkit);
		editor.getSection().setSeparatorControl(toolkit.createCompositeSeparator(editor.getSection()));
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object input = RuntimePlugin.resolveSemanticObject(selection);
		if (!editor.isDisposed()) {
			editor.setInput(input);
		}
	}

	public void refresh() {
		super.refresh();
		if (!editor.isDisposed()) {
			editor.refresh();
		}
	}
	
	public void dispose() {
		if (!editor.isDisposed()) {
			editor.dispose();
		}
		super.dispose();
	}

}
