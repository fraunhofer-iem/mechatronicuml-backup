package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class CategoryPropertyEditor extends AbstractPropertyEditor {
	protected Section section;

	protected Composite childrenComposite;

	private String title;

	private int orientation = SWT.VERTICAL;

	protected TabbedPropertySheetWidgetFactory toolkit;

	protected List<IPropertyEditor> propertyEditors = new ArrayList<IPropertyEditor>();

	protected Map<String, IPropertyEditor> keys = new HashMap<String, IPropertyEditor>();

	/**
	 * Constructs this CategoryPropertyEditor without title support.
	 * 
	 */
	public CategoryPropertyEditor() {
		this(SWT.VERTICAL, null);
	}

	/**
	 * Constructs this CategoryPropertyEditor.
	 * 
	 * @param title
	 *            The title to display, if null the Category is constructed
	 *            without title support. Please use "" to be able to set the
	 *            title afterwards.
	 * @param orientation
	 *            The orientation, can be SWT.HORIZONTAL or SWT.VERTICAL.
	 */
	public CategoryPropertyEditor(int orientation, String title) {
		this.orientation = orientation;
		this.title = title;
		initialize();
	}

	protected void initialize() {
	}

	public void addPropertyEditor(IPropertyEditor editor) {
		addPropertyEditor(editor, false);
	}

	public void addPropertyEditor(IPropertyEditor editor, boolean front) {
		addPropertyEditor(null, editor, front);
	}

	public void addPropertyEditor(String key, IPropertyEditor editor,
			boolean front) {
		if (!propertyEditors.contains(editor) && !keys.containsKey(key)) {
			if (isUIReady()) {
				editor.createControls(childrenComposite, toolkit);
				childrenComposite.layout();
			}
			// Adding to front only works before createControls() is invoked.
			if (front) {
				propertyEditors.add(0, editor);
			} else {
				propertyEditors.add(editor);
			}
			if (key != null) {
				keys.put(key, editor);
			}
		}
	}

	public void removePropertyEditor(IPropertyEditor editor) {
		if (propertyEditors.contains(editor)) {
			if (!isUIReady()) {
				editor.dispose();
			}
			propertyEditors.remove(editor);
			String key = getEditorKey(editor);
			if (key != null) {
				keys.remove(key);
			}
		}
	}

	/**
	 * Gets the editor by using a key.
	 * 
	 * @param key
	 *            The key to use to access the editor.
	 * @return the editor; never null.
	 */
	public IPropertyEditor getEditor(String key) {
		return keys.get(key);
	}

	/**
	 * Gets the key that was used to add the editor.
	 * 
	 * @param editor
	 *            The editor to search a key for.
	 * 
	 * @return The key or null, if the editor was added without a key.
	 */
	public String getEditorKey(IPropertyEditor editor) {
		for (String key : keys.keySet()) {
			if (keys.get(key) == editor) {
				return key;
			}
		}
		return null;
	}

	public void clearPropertyEditors() {
		for (IPropertyEditor editor : propertyEditors) {
			editor.dispose();
		}
		propertyEditors.clear();
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory toolkit) {
		this.toolkit = toolkit;
		Object layoutData = createLayoutData(parent);

		if (title != null) {
			section = createSection(parent, toolkit);
			childrenComposite = toolkit.createComposite(section);
			section.setClient(childrenComposite);
			section.setLayoutData(layoutData);
		} else {
			childrenComposite = toolkit.createComposite(parent);
			childrenComposite.setLayoutData(layoutData);
		}
		Layout layout = createLayout();
		if (layout != null) {
			childrenComposite.setLayout(layout);
		}

		// Create initial editor controls that could not yet be created
		Assert.isTrue(isUIReady());
		for (IPropertyEditor editor : propertyEditors) {
			editor.createControls(childrenComposite, toolkit);
		}

		if (section != null) {
			section.setExpanded(!propertyEditors.isEmpty());
		}

	}

	protected Layout createLayout() {
		if (orientation == SWT.VERTICAL) {
			GridLayout layout = new GridLayout(2, false);
			return layout;
		} else if (orientation == SWT.HORIZONTAL) {
			RowLayout layout = new RowLayout(orientation);
			layout.marginHeight = 10;
			layout.spacing = 40;
			return layout;
		}
		return null;
	}

	protected Object createLayoutData(Composite parent) {
		Layout layout = parent.getLayout();
		if (layout instanceof GridLayout) {
			return new GridData(SWT.FILL, SWT.NONE, false, false, 2, 1);
		}
		return null;
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
		for (IPropertyEditor editor : propertyEditors) {
			editor.setInput(object);
		}
	}

	@Override
	public void dispose() {
		if (childrenComposite != null) {
			childrenComposite.dispose();
		}
		if (section != null) {
			section.dispose();
		}
		childrenComposite = null;
		toolkit = null;

		for (IPropertyEditor editor : propertyEditors) {
			editor.dispose();
		}
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
