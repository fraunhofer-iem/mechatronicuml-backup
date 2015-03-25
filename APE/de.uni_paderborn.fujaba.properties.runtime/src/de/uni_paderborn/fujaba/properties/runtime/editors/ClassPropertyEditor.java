package de.uni_paderborn.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


/**
 * This ClassPropertyEditor is contained within an ObjectPropertyEditor and is
 * registered using the propertyEditors extension. Subclasses should add
 * properties to it.
 * 
 * @author bingo
 * 
 */
public abstract class ClassPropertyEditor extends CategoryPropertyEditor {
	
	protected String tab;
	
	private EClass eClass;
	
	private boolean created;

	public ClassPropertyEditor(String tab, AdapterFactory adapterFactory, EClass eClass) {
		super(adapterFactory);
		this.eClass = eClass;
		this.tab = tab;
		initiallyExpanded = true;
	}
	
	@Override
	protected void inputChanged(Object oldObject) {
		super.inputChanged(oldObject);
		if (!created && input != null) {
			if (input instanceof EObject && ((EObject)input).eResource() != null) {
				created = true;
				createProperties();
			}
		}
	}
	
	public String getTab() {
		return tab;
	}

	public CategoryPropertyEditor addSubCategory(String key, String title,
			int orientation, boolean initiallyExpanded) {
		CategoryPropertyEditor category = new CategoryPropertyEditor(adapterFactory,
				orientation, title, initiallyExpanded, true);
		addPropertyEditor(key, category, false);
		return category;
	}

	public void addEditorToCategory(String category, IPropertyEditor editor,
			boolean front) {
		CategoryPropertyEditor categoryEditor = this;
		IPropertyEditor subEditor = getEditor(category);
		if (subEditor instanceof CategoryPropertyEditor) {
			categoryEditor = (CategoryPropertyEditor) subEditor;
		}
		categoryEditor.addPropertyEditor(null, editor, front);
	}
	
	
	
	protected void createProperties() {
		
	}
	
	public EClass getEClass() {
		return eClass;
	}

}
