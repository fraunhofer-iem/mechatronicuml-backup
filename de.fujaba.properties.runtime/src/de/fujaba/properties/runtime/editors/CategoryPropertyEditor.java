package de.fujaba.properties.runtime.editors;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class CategoryPropertyEditor extends AbstractPropertyEditor {
	protected Section section;

	protected Composite childrenComposite;

	private boolean hasTitle;

	private String title;

	private int orientation = SWT.VERTICAL;

	protected TabbedPropertySheetWidgetFactory toolkit;

	protected Map<IPropertyEditor, Composite> propertyEditors = new HashMap<IPropertyEditor, Composite>();

	/**
	 * Constructs this CategoryPropertyEditor.
	 * 
	 * @param hasTitle
	 *            Whether to construct with a title.
	 */
	public CategoryPropertyEditor() {
		this(false, SWT.VERTICAL);
	}

	/**
	 * Constructs this CategoryPropertyEditor.
	 * 
	 * @param title
	 *            The title to display.
	 * @param orientation
	 *            The orientation, can be SWT.HORIZONTAL or SWT.VERTICAL.
	 */
	public CategoryPropertyEditor(boolean hasTitle, int orientation) {
		this.hasTitle = hasTitle;
		this.orientation = orientation;
	}

	public void addPropertyEditor(IPropertyEditor editor) {
		if (propertyEditors.containsKey(editor)) {
			return;
		}
		// Add to UI only if possible
		Composite composite = addToUI(editor);

		// Add to map
		propertyEditors.put(editor, composite);

		childrenChanged();
	}

	private Composite addToUI(IPropertyEditor editor) {
		if (isUIReady()) {
			Composite composite = toolkit.createComposite(childrenComposite);
			composite.setLayout(new FillLayout());
			editor.createControls(composite, toolkit);
			return composite;
		}
		return null;
	}

	public void removePropertyEditor(IPropertyEditor editor) {
		// Remove from UI only if possible
		if (isUIReady()) {
			Composite composite = propertyEditors.get(editor);
			if (composite != null) {
				composite.dispose();
			}
		}
		if (editor != null) {
			editor.dispose();
		}

		// Remove from map
		propertyEditors.remove(editor);

		childrenChanged();
	}

	private void childrenChanged() {
		if (section != null) {
			section.setExpanded(!propertyEditors.isEmpty());
		}
	}

	public void clearPropertyEditors() {
		// copy to get rid of ConcurrentModificationException when deleting
		// inside loop
		Set<IPropertyEditor> editors = new HashSet<IPropertyEditor>();
		editors.addAll(propertyEditors.keySet());
		for (IPropertyEditor editor : editors) {
			removePropertyEditor(editor);
		}
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory toolkit) {
		this.toolkit = toolkit;

		if (hasTitle) {
			section = createSection(parent, toolkit);
			childrenComposite = toolkit.createComposite(section);
			section.setClient(childrenComposite);
		} else {
			childrenComposite = toolkit.createComposite(parent);
		}
		FillLayout layout = new FillLayout(orientation);
		layout.marginHeight = 10;
		childrenComposite.setLayout(layout);

		// Create initial editor controls that could not yet be created
		Assert.isTrue(isUIReady());
		for (IPropertyEditor editor : propertyEditors.keySet()) {
			propertyEditors.put(editor, addToUI(editor));
		}

		childrenChanged();

	}

	public boolean isUIReady() {
		return childrenComposite != null && toolkit != null
				&& !childrenComposite.isDisposed();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		if (section != null) {
			section.setText(title);
		}
	}

	protected Section createSection(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
		// int expansionStyle = 0;
		// * TREE_NODE, TWISTIE,
		// * CLIENT_INDENT, COMPACT, FOCUS_TITLE,
		// * LEFT_TEXT_CLIENT_ALIGNMENT, NO_TITLE

		// ExpandableComposite expandableComposite =
		// factory.createExpandableComposite(
		// parent, expansionStyle);
		// expandableComposite.setLayout(new FillLayout());

		// ExpandableComposite expandableComposite =
		// factory.createExpandableComposite(
		// parent,
		// ExpandableComposite.TWISTIE | ExpandableComposite.EXPANDED |
		// ExpandableComposite.CLIENT_INDENT | ExpandableComposite.COMPACT);
		// expandableComposite.setText(title);

		Section section = factory.createSection(parent, Section.TITLE_BAR
				| Section.TWISTIE | ExpandableComposite.EXPANDED
				| Section.CLIENT_INDENT);
		section.setText(title);

		section.setSeparatorControl(factory.createCompositeSeparator(section));
		// Hyperlink hprlnkNewHyperlink = factory.createHyperlink(section,
		// "this is desctiption control", SWT.NONE);
		// factory.paintBordersFor(hprlnkNewHyperlink);
		// section.setDescriptionControl(hprlnkNewHyperlink);

		// section.setDescription("TEST");

		// Menu menu = new Menu(section);
		// MenuItem item = new MenuItem(menu, SWT.NONE);
		// item.setText("test");
		// section.setMenu(menu);

		return section;
	}

	@Override
	public void setInput(Object object) {
		super.setInput(object);
		for (IPropertyEditor editor : propertyEditors.keySet()) {
			editor.setInput(object);
		}
	}

	@Override
	public void dispose() {

		for (IPropertyEditor editor : propertyEditors.keySet()) {
			editor.dispose();
		}
		title = "";
	}

	public void setEnabled(boolean enabled) {
		if (enabled) {
			section.setTitleBarBackground(null);
		} else {
			section.setTitleBarBackground(new Color(null, 230, 230, 230));
		}
	}

	public Section getSection() {
		return section;
	}

}
