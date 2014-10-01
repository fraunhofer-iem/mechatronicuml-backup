package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;


/**
 * This ClassPropertyEditor is contained within an ObjectPropertyEditor and is
 * registered using the propertyEditors extension. Subclasses should add
 * properties to it.
 * 
 * @author bingo
 * 
 */
public abstract class ClassPropertyEditor extends CategoryPropertyEditor {
	
	private String tab;
	
	private EClass eClass;

	public ClassPropertyEditor(String tab, AdapterFactory adapterFactory, EClass eClass) {
		super(adapterFactory);
		this.eClass = eClass;
		this.tab = tab;
		initiallyExpanded = true;
		createProperties();
		sortProperties();
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
	
	protected void sortProperties() {
		final List<EClass> sortedSuperTypes = getSortedSuperTypes();
		sortedSuperTypes.add(eClass);
		
		sortEditors(new Comparator<IPropertyEditor>() {

			@Override
			public int compare(IPropertyEditor e1, IPropertyEditor e2) {
				if (false == e1 instanceof IStructuralFeaturePropertyEditor) {
					return 0;
				}
				if (false == e2 instanceof IStructuralFeaturePropertyEditor) {
					return 0;
				}
				IStructuralFeaturePropertyEditor se1 = (IStructuralFeaturePropertyEditor) e1;
				IStructuralFeaturePropertyEditor se2 = (IStructuralFeaturePropertyEditor) e2;
				
				EClass eClass1 = se1.getFeature().getEContainingClass();
				EClass eClass2 = se2.getFeature().getEContainingClass();
				
				return sortedSuperTypes.indexOf(eClass1) - sortedSuperTypes.indexOf(eClass2);
			}
			
		});
	}

	private List<EClass> getSortedSuperTypes() {
		// Get list of super classes in inverse BFS order
		List<EClass> allClasses = new ArrayList<EClass>();
		List<EClass> newClasses = new ArrayList<EClass>();
		List<EClass> nextClasses = new ArrayList<EClass>();
		nextClasses.add(eClass);

		do {
			for (EClass nextClass : nextClasses) {
				newClasses.addAll(nextClass.getESuperTypes());
			}
			allClasses.addAll(0, newClasses); // put to front to get inverse order
			nextClasses = newClasses;
			newClasses = new ArrayList<EClass>();
		} while (!nextClasses.isEmpty());

		return allClasses;
	}
	
	public EClass getEClass() {
		return eClass;
	}

}
