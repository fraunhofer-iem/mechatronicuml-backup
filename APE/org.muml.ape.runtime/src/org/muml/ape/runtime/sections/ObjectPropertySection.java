package org.muml.ape.runtime.sections;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.muml.ape.runtime.RuntimePlugin;
import org.muml.ape.runtime.editors.ObjectPropertyEditor;

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
		
		ScrolledComposite ss = null;
		{
			Control c = parent;
			while (c.getParent() != null && !(c instanceof ScrolledComposite)) {
				c = c.getParent();
			}
			if (c instanceof ScrolledComposite) {
				ss = (ScrolledComposite) c;
			}
		}
		final ScrolledComposite fss = ss;
		
		parent = new Composite(parent, SWT.NO_FOCUS) {
			@Override
			public boolean setFocus() {
				return false;
			}
			@Override
			public Point computeSize(int wHint, int hHint, boolean changed) {
				Point size = super.computeSize(wHint, hHint, changed);
				size.x = fss.getClientArea().width;			
				return size;
			}
		};
		
		parent.setLayout(new FillLayout());
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
		boolean changed = getSelection() != selection;
		super.setInput(part, selection);
		if (changed) {
			final Object input = RuntimePlugin.resolveSemanticObject(selection);
			if (editor != null && !editor.isDisposed()) {
				editor.setInput(input);
			}
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
