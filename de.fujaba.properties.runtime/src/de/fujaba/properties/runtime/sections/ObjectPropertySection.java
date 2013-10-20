package de.fujaba.properties.runtime.sections;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
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

	protected ObjectPropertyEditor editor = null;


	protected ObjectPropertyEditor createObjectPropertyEditor(String tabId) {
		return new ObjectPropertyEditor(tabId, null, "null", true);
	}

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		FormToolkit toolkit = getWidgetFactory();
		toolkit.setBorderStyle(SWT.NONE);
		
		super.createControls(parent, aTabbedPropertySheetPage);

		String tabId = aTabbedPropertySheetPage.getSelectedTab().getId();
		editor = createObjectPropertyEditor(tabId);

		
		editor.createControls(parent, toolkit);
		editor.getSection().setSeparatorControl(toolkit.createCompositeSeparator(editor.getSection()));
		
	}
	
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object input = RuntimePlugin.resolveSemanticObject(selection);
		if (editor != null && !editor.isDisposed()) {
			editor.setInput(input);
		}
	}

	public void refresh() {
		super.refresh();
		if (editor != null && !editor.isDisposed()) {
			editor.refresh();
		}
	}
	
	public void dispose() {
		if (editor != null && !editor.isDisposed()) {
			editor.dispose();
		}
		super.dispose();
	}

}
