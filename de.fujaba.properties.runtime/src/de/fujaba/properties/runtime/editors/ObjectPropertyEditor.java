package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;

import de.fujaba.properties.runtime.RuntimePlugin;

/**
 * Category property editor which automatically adds subeditors based on the
 * input object (one for each subclass) which is set using the extension point
 * "de.fujaba.properties.runtime.propertyeditor".
 * 
 * @author bingo
 * 
 */
public class ObjectPropertyEditor extends CategoryPropertyEditor {

	public ObjectPropertyEditor(String title) {
		super(SWT.VERTICAL, title);
		
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
			List<IPropertyEditor> foundEditors = null;
			for (EClass ecoreType : ecoreTypes) {
				foundEditors = RuntimePlugin.getPropertyEditors(ecoreType);
				if (foundEditors != null) {
					break;
				}
			}
			if (foundEditors != null) {
				for (IPropertyEditor editor : foundEditors) {
					addPropertyEditor(editor);
				}
			}
		}
	}

}
