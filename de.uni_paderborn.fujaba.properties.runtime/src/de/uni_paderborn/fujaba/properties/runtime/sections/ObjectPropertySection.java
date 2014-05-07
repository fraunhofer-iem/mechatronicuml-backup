package de.uni_paderborn.fujaba.properties.runtime.sections;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;
import de.uni_paderborn.fujaba.properties.runtime.editors.ObjectPropertyEditor;

/**
 * A PropertySection which contains exactly one ObjectPropertyEditor.
 * 
 * @author bingo
 * 
 */
public class ObjectPropertySection extends AbstractPropertySection {

	protected ObjectPropertyEditor editor = null;
	
	private Composite parent;


	protected ObjectPropertyEditor createObjectPropertyEditor(String tabId) {
		return new ObjectPropertyEditor(tabId, null, null, true);
	}

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		this.parent = parent;

		FormToolkit toolkit = getWidgetFactory();
		toolkit.setBorderStyle(SWT.NONE);

		String tabId = aTabbedPropertySheetPage.getSelectedTab().getId();
		editor = createObjectPropertyEditor(tabId);

		editor.createControls(parent, toolkit);
		//editor.getSection().setSeparatorControl(toolkit.createCompositeSeparator(editor.getSection()));
		editor.setFocus();
	}
	
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		final Object input = RuntimePlugin.resolveSemanticObject(selection);
		if (editor != null && !editor.isDisposed()) {
			editor.setInput(input);
		}

	}

	public void refresh() {
		super.refresh();
		if (editor != null && !editor.isDisposed()) {
			editor.refresh();
		}
		if (parent != null && !parent.isDisposed()) {
			RuntimePlugin.revalidateLayout(parent);
		}
	}
	
	public void dispose() {
		if (editor != null && !editor.isDisposed()) {
			editor.dispose();
		}
		super.dispose();
	}

}
