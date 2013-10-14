package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

public class CategoryPropertyEditor extends AbstractPropertyEditor  {
	protected boolean childrenCreated = false;
	
	protected boolean initiallyExpanded = false;
	
	public Color colorInactiveText = new Color(null, 200, 200, 255);
	public Color colorInactiveBackground = new Color(null, 100, 100, 100);
	public Color colorActiveText = null;
	public Color colorActiveBackground = null;
	
	protected Section section;
	protected Composite childrenComposite;
	private String title;
	private int orientation = SWT.VERTICAL;
	protected FormToolkit toolkit;
	private List<IPropertyEditor> propertyEditors = new ArrayList<IPropertyEditor>();
	protected Map<String, IPropertyEditor> keys = new HashMap<String, IPropertyEditor>();

	/**
	 * Constructs this CategoryPropertyEditor without title support.
	 * 
	 */
	public CategoryPropertyEditor(AdapterFactory adapterFactory) {
		this(adapterFactory, SWT.VERTICAL, null, false, false);
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
	public CategoryPropertyEditor(AdapterFactory adapterFactory, int orientation, String title, boolean initiallyExpanded, final boolean hideIfEmpty) {
		super(adapterFactory);
		this.orientation = orientation;
		this.title = title;
		this.initiallyExpanded = initiallyExpanded;
		
		addVisibilityFilter(new IFilter() {

			@Override
			public boolean select(Object toTest) {
				return !propertyEditors.isEmpty() || !hideIfEmpty;
			}
			
		});
	}

	public void addPropertyEditor(IPropertyEditor editor) {
		addPropertyEditor(editor, false);
	}

	public void addPropertyEditor(IPropertyEditor editor, boolean front) {
		addPropertyEditor(null, editor, front);
	}
	
	public void sortEditors(Comparator<IPropertyEditor> comparator) {
		java.util.Collections.sort(propertyEditors, comparator);
		
	}

	public void addPropertyEditor(String key, IPropertyEditor editor,
			boolean front) {
		if (!propertyEditors.contains(editor) && !keys.containsKey(key)) {
			if (childrenCreated) {
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

			childrenChanged();
		}
		
	}

	public void removePropertyEditor(IPropertyEditor editor) {
		if (propertyEditors.contains(editor)) {
			editor.dispose();
			propertyEditors.remove(editor);
			String key = getEditorKey(editor);
			if (key != null) {
				keys.remove(key);
			}
			childrenChanged();
		}
	}
	
	

	private void childrenChanged() {
		updateHeaderColors();
		updateVisibility(true);
		layout();
	}
	
	private void updateHeaderColors() {
		if (section != null) {
			if (propertyEditors.isEmpty()) {
				section.setToggleColor(colorInactiveText);
				section.setTitleBarForeground(colorInactiveText);
				section.setTitleBarGradientBackground(colorInactiveBackground);

			} else {
				section.setToggleColor(colorActiveText);
				section.setTitleBarForeground(colorActiveText);
				section.setTitleBarGradientBackground(colorActiveBackground);
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
			if (!editor.isDisposed()) {
				editor.dispose();
			}
		}
		keys.clear();
		propertyEditors.clear();
		childrenChanged();
	}
	
	@Override
	protected void inputChanged() {
		super.inputChanged();
		if (section != null && section.isExpanded()) {
			createChildren();
		}
		updateHeaderColors();
	}

	@Override
	public void createControls(Composite parent,
			FormToolkit toolkit) {
		super.createControls(parent, toolkit);
		this.toolkit = toolkit;
		Object layoutData = createLayoutData(parent);

		if (title != null) {
			section = createSection(parent, toolkit);
			
			colorActiveText = new Color(null, 0, 85, 239);
			colorActiveBackground = section.getTitleBarGradientBackground();
			childrenComposite = toolkit.createComposite(section);
			childrenComposite.setLayoutData(layoutData);
			section.setClient(childrenComposite);
			section.setLayoutData(layoutData);
			section.addExpansionListener(new IExpansionListener() {

				@Override
				public void expansionStateChanging(ExpansionEvent e) {
					
				}

				@Override
				public void expansionStateChanged(ExpansionEvent e) {
					if (e.getState() == true) {
						createChildren(); // ### on demand creation of children
					}
					
				}
			});
			
			
		} else {
			childrenComposite = toolkit.createComposite(parent);
			childrenComposite.setLayoutData(layoutData);
		}
		Layout layout = createLayout();
		if (layout != null) {
			childrenComposite.setLayout(layout);
		}

		if (title == null || initiallyExpanded) {
			createChildren();
		}
		
		if (section != null) {
			section.setExpanded(initiallyExpanded);
		}

		updateHeaderColors();
		updateVisibility(true);
	}
	
	protected void createChildren() {
		if (!childrenCreated) {
			// Create initial editor controls that could not yet be created
			for (IPropertyEditor editor : propertyEditors) {
				editor.createControls(childrenComposite, toolkit);
				editor.refresh();
			}
			childrenCreated = true;
			childrenChanged();
		}
	}

	protected Layout createLayout() {
		if (orientation == SWT.VERTICAL) {
			GridLayout layout = new GridLayout(2, false);
			layout.marginWidth = layout.marginRight = 0;
			return layout;
		} else if (orientation == SWT.HORIZONTAL) {
			RowLayout layout = new RowLayout(orientation);
			layout.marginHeight = 10;
			layout.spacing = 20;
			layout.fill = true;
			layout.pack = true;
			layout.wrap = true;
			return layout;
		}
		return null;
	}

	protected Object createLayoutData(Composite parent) {
		Layout layout = parent.getLayout();
		if (layout instanceof GridLayout) {
			return new GridData(SWT.FILL, SWT.NONE, true, false, 2, 1);
		}
		return null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		if (section != null && !section.isDisposed()) {
			section.setText(title);
		}
	}

	protected Section createSection(Composite parent, FormToolkit factory) {
		Section section = toolkit.createSection(parent, Section.TITLE_BAR
				| Section.TWISTIE | Section.EXPANDED | Section.CLIENT_INDENT);
		section.setText(title);
		return section;
	}

	@Override
	public void setInput(Object object) {
		super.setInput(object);
		for (IPropertyEditor editor : propertyEditors) {
			if (!editor.isDisposed()) {
				editor.setInput(object);
			}
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		if (childrenComposite != null) {
			childrenComposite.dispose();
		}
		if (section != null) {
			section.dispose();
		}
		childrenComposite = null;
		section = null;
		toolkit = null;

		for (IPropertyEditor editor : propertyEditors) {
			if (!editor.isDisposed()) {
				editor.dispose();
			}
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

	@Override
	protected void doSetVisible(boolean visible) {
		for (Control control : new Control[] { section }) {
			if (control != null && !control.isDisposed()) {
				control.setVisible(visible);
				if (control.getLayoutData() instanceof GridData) {
					((GridData) control.getLayoutData()).exclude = !visible;
				}
			}
		}
	}
	
}

