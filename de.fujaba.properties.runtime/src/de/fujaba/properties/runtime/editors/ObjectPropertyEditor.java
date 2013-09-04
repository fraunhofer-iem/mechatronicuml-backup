package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;

import de.fujaba.properties.runtime.RuntimePlugin;
import de.fujaba.properties.runtime.factory.IPropertyEditorFactory;

/**
 * Category property editor which automatically adds subeditors based on the
 * input object (one for each subclass) which is set using the extension point
 * "de.fujaba.properties.runtime.propertyeditor".
 * 
 * @author bingo
 * 
 */
public class ObjectPropertyEditor extends CategoryPropertyEditor {

	private String tab;
	
	public ObjectPropertyEditor(String tab, AdapterFactory adapterFactory, String title, boolean initiallyOpen) {
		super(adapterFactory, SWT.VERTICAL, title, initiallyOpen);
		this.tab = tab;
	}

	@Override
	protected void inputChanged() {
		super.inputChanged();
		
		// Remove all property editors
		clearPropertyEditors();
		
		if (input == null) {

			setTitle("null");
			
		} else {
			// Make sure the input is an EMF Object
			Assert.isLegal(input instanceof EObject, "Can only handle EMF objects.");
			EObject element = (EObject) input;
			
			// Display its name
			String name = element.eClass().getName();
			setTitle(RuntimePlugin.makeHumanReadable(name) + " Properties");
			
			// Add new property editors for the first working subclass found
			List<EClass> ecoreTypes = new ArrayList<EClass>();
			ecoreTypes.add(element.eClass());
			ecoreTypes.addAll(element.eClass().getEAllSuperTypes());
			List<IPropertyEditorFactory> foundFactories = null;
			for (EClass ecoreType : ecoreTypes) {
				foundFactories = RuntimePlugin.getPropertyEditorFactories(ecoreType);
				if (foundFactories != null) {
					break;
				}
			}
			if (foundFactories != null) {
				for (IPropertyEditorFactory factory : foundFactories) {
					IPropertyEditor editor = factory.createPropertyEditor(tab);
					addPropertyEditor(editor);
				}
			}
		}
	}
	
}
