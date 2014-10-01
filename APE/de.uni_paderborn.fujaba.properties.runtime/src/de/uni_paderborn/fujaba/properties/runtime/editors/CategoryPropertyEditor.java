package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

public class CategoryPropertyEditor extends AbstractPropertyEditor  {
	protected boolean childrenCreated = false;
	
	protected boolean initiallyExpanded = false;
	
	public Color colorInactiveText = new Color(null, 200, 200, 255);
	public Color colorInactiveBackground = new Color(null, 100, 100, 100);
	public Color colorActiveText = null;
	public Color colorActiveBackground = null;
	
	protected ExpandableComposite section;
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
		if (editor == null) {
			return;
		}
		
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
		//layout();
	}
	
	private void updateHeaderColors() {
		if (section != null) {
			if (propertyEditors.isEmpty()) {
				section.setToggleColor(colorInactiveText);
				section.setTitleBarForeground(colorInactiveText);
			//	section.setTitleBarGradientBackground(colorInactiveBackground);

			} else {
				section.setToggleColor(colorActiveText);
				section.setTitleBarForeground(colorActiveText);
				//section.setTitleBarGradientBackground(colorActiveBackground);
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

	public void clearPropertyEditors(boolean dispose) {
		if (dispose) {
			for (IPropertyEditor editor : propertyEditors) {
				if (!editor.isDisposed()) {
					editor.dispose();
				}
			}
		}
		keys.clear();
		propertyEditors.clear();
		childrenChanged();
	}
	
	@Override
	protected void inputChanged(Object oldObject) {
		super.inputChanged(oldObject);
		if (section != null && section.isExpanded()) {
			//createChildren();
		}
		
		// XXX: Not necessary, as it seems; removed it:
		//updateHeaderColors();
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
			//colorActiveBackground = section.getTitleBarGradientBackground();
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
					layout();
				}
			});
			
			
			// Install tooltip into section's header and section
		
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
			section.setExpanded(initiallyExpanded); // updates twistie
		}

		updateHeaderColors();
		updateVisibility(true);
	}
	
	protected void createChildren() {
		if (!childrenCreated && childrenComposite != null) {
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
			layout.marginLeft = 5;
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
		// If we already have a section, make sure we only call section.setText(title), if the title changed
		if (section != null && !section.isDisposed()) {
			if (title != null && !title.equals(this.title)) {
				section.setText(title);
				this.title = title;
			}
		} else {
			// If we have no section created yet, save the title so that it is accessible upon section creation.
			this.title = title;
		}
	}

	protected ExpandableComposite createSection(Composite parent, FormToolkit factory) {
		int sectionStyle = Section.TITLE_BAR
				| Section.TWISTIE | Section.CLIENT_INDENT;
		if (initiallyExpanded) {
			sectionStyle |= Section.EXPANDED;
		}
		ExpandableComposite section = toolkit.createExpandableComposite(parent, sectionStyle);
		section.setText(title);
		return section;
	}

	@Override
	public void setInput(Object object) {
		// Do not change the value, if the resource has not been set, yet.
		// Reason: Notification is sent before and after the container is set,
		//         so we only react on the second notification.
		if (object instanceof EObject && ((EObject) object).eResource() == null) {
			object = null;
		}
		
		
		if (input != object) {
			super.setInput(object);
			for (IPropertyEditor editor : propertyEditors) {
				if (!editor.isDisposed()) {
					editor.setInput(object);
				}
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
			//section.setTitleBarBackground(null);
		} else {
			//section.setTitleBarBackground(new Color(null, 230, 230, 230));
		}
	}

	public ExpandableComposite getSection() {
		return section;
	}
	
	@Override
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		controls.add(section);
		controls.add(childrenComposite);
		if (section != null) {
			for (Control control : section.getChildren()) {
				controls.add(control);
			}
		}
		return controls;
	}
	
	public void setFocus() {
		if (!propertyEditors.isEmpty()) {
			IPropertyEditor first = propertyEditors.get(0);
			if (first != null) {
				first.setFocus();
			}
		}
	}
	
}

