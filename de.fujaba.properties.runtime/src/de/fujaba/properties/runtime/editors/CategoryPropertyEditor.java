package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import de.fujaba.properties.runtime.RuntimePlugin;

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

	protected List<IPropertyEditor> propertyEditors = new ArrayList<IPropertyEditor>();

	protected Map<String, IPropertyEditor> keys = new HashMap<String, IPropertyEditor>();

	/**
	 * Constructs this CategoryPropertyEditor without title support.
	 * 
	 */
	public CategoryPropertyEditor(AdapterFactory adapterFactory) {
		this(adapterFactory, SWT.VERTICAL, null, false);
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
	public CategoryPropertyEditor(AdapterFactory adapterFactory, int orientation, String title, boolean initiallyExpanded) {
		super(adapterFactory);
		this.orientation = orientation;
		this.title = title;
		this.initiallyExpanded = initiallyExpanded;
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
		

		if (section != null) {
			
			if (propertyEditors.isEmpty()) {
				section.setToggleColor(colorInactiveText);
//				section.setBackground(COLOR_TEXT_INACTIVE);
				section.setTitleBarForeground(colorInactiveText);
//				section.setTitleBarBackground(COLOR_BACKGROUND_INACTIVE);
				section.setTitleBarGradientBackground(colorInactiveBackground);
//				section.setTitleBarBorderColor(COLOR_BACKGROUND_INACTIVE);

			} else {
				section.setToggleColor(colorActiveText);
				//section.setBackground(COLOR_TEXT_ACTIVE);
				section.setTitleBarForeground(colorActiveText);
//				section.setTitleBarBackground(COLOR_BACKGROUND_ACTIVE);
				section.setTitleBarGradientBackground(colorActiveBackground);
//				section.setTitleBarBorderColor(COLOR_BACKGROUND_ACTIVE);
			}

			RuntimePlugin.revalidateLayout(childrenComposite);
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
	public void createControls(Composite parent,
			FormToolkit toolkit) {
		this.toolkit = toolkit;
		Object layoutData = createLayoutData(parent);

		if (title != null) {
			// original:
			section = createSection(parent, toolkit);
			colorActiveText = new Color(null, 0, 85, 239);
			colorActiveBackground = section.getTitleBarGradientBackground();
			childrenComposite = toolkit.createComposite(section);
			section.setClient(childrenComposite);
			section.setLayoutData(layoutData);
			
			// this version is with border at the left
//			section = createSection(parent, toolkit);
//			section.setLayoutData(layoutData);
//			
//			Composite container = toolkit.createComposite(section, SWT.NONE);
//			container.setLayout(new GridLayout(2, false));
//			Composite border = toolkit.createComposite(container, SWT.NONE);
//			border.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
//			border.setBackground(new Color(null, 0, 0, 0));
//			
//			childrenComposite = toolkit.createComposite(container, SWT.NONE);
//			childrenComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
//			section.setClient(container);
			

			section.addExpansionListener(new IExpansionListener() {

				@Override
				public void expansionStateChanging(ExpansionEvent e) {
					
				}

				@Override
				public void expansionStateChanged(ExpansionEvent e) {
					boolean relayouted = false;
					if (e.getState() == true) {
						relayouted = !childrenCreated;
						createChildren(); // ### on demand creation of children
					}
					if (!relayouted) {
						RuntimePlugin.revalidateLayout(childrenComposite);
					}
				}
			});
			
			section.setExpanded(initiallyExpanded);
			
			
		} else {
			childrenComposite = toolkit.createComposite(parent);
			childrenComposite.setLayoutData(layoutData);
		}
		Layout layout = createLayout();
		if (layout != null) {
			childrenComposite.setLayout(layout);
		}

		// TODO Remove, to let the children be created on demand, see ### (faster).
		createChildren();
	}
	
	protected void createChildren() {
		if (!childrenCreated) {
			// Create initial editor controls that could not yet be created
			for (IPropertyEditor editor : propertyEditors) {
				editor.createControls(childrenComposite, toolkit);
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
			FormToolkit factory) {
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

		
		Section section = toolkit.createSection(parent,  Section.TITLE_BAR
				| Section.TWISTIE | ExpandableComposite.EXPANDED
				| Section.CLIENT_INDENT);
		
		section.setText(title);

//		section.setSeparatorControl(factory.createCompositeSeparator(section));
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
//		if (childrenCreated) {
			for (IPropertyEditor editor : propertyEditors) {
				if (!editor.isDisposed()) {
					editor.setInput(object);
				}
			}
//		}
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

}

