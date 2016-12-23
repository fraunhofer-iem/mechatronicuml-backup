package org.muml.ape.runtime.editors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.muml.ape.runtime.RuntimePlugin;
import org.muml.ape.runtime.factory.IPropertyEditorFactory;

/**
 * Category property editor which automatically adds subeditors based on the
 * input object (one for each subclass) which is set using the extension point
 * "org.muml.ape.runtime.propertyeditor".
 * 
 * @author bingo
 * 
 */
public class ObjectPropertyEditor extends CategoryPropertyEditor {
	
	public final static boolean USE_CACHE = false;

	private Map<EClass, List<IPropertyEditor>> cache = new HashMap<EClass, List<IPropertyEditor>>();
	
	private String tab;
	
	/**
	 * This defines if this ObjectPropertyEditor is managed by another editor (e.g. NavigationFeaturePropertyEditor).
	 * If managed by another editor, the other editor manages our visibility and enablement.
	 * Thus, we should not allow updateVisibility() and updateEnablement() on us directly.
	 * The other editor that manages us, must keep track of updating our visibility and enablement for us. 
	 */
	private boolean managed = false;
	
	public ObjectPropertyEditor(String tab, AdapterFactory adapterFactory, String title, boolean initiallyOpen) {
		super(adapterFactory, SWT.VERTICAL, title, initiallyOpen, false);
		this.tab = tab;
	}

	void setManaged(boolean embedded) {
		// XXX bug; self assignment! can we safely change behavior here?
		this.managed = managed;
	}
	
	@Override
	protected void inputChanged(Object oldObject) {
		super.inputChanged(oldObject);
		
		// Find out if EClasses match to reuse editors
		EClass newEClass = null;
		if (input instanceof EObject) {
			newEClass = ((EObject) input).eClass();
		}
		EClass oldEClass = null;
		if (oldObject instanceof EObject) {
			oldEClass =  ((EObject) oldObject).eClass();
		}
		if (oldEClass != null && newEClass != null && oldEClass.equals(newEClass)) {
			 return; // compatible, do nothing
		}
		

		// Remove invalid all property editors
		if (USE_CACHE) {
			List<IPropertyEditor> editors = cache.get(newEClass);

			clearPropertyEditors(false);	
			
			if (editors != null) {
				for (IPropertyEditor editor : editors) {
					editor.setVisible(false, true, true);
				}
			}
			childrenCreated = false;


		} else {
			clearPropertyEditors(true);
		}
		
		// Show new editors
		if (input == null) {

			setTitle("null");
			
		} else {
			// First try to find an existing editor in the cache
			List<IPropertyEditor> editors = cache.get(newEClass);
			if (editors == null || !USE_CACHE) {
				// Create an entry in the cache
				editors = new ArrayList<IPropertyEditor>();
				cache.put(newEClass, editors);
			
				
				// Make sure the input is an EMF Object
				Assert.isLegal(input instanceof EObject, "Can only handle EMF objects.");
				EObject element = (EObject) input;
				
				// Display its name
				setTitle("Properties");
				
				// Add new property editors for the first working super class found
				List<EClass> ecoreTypes = new ArrayList<EClass>();
				ecoreTypes.add(element.eClass());
				ecoreTypes.addAll(element.eClass().getEAllSuperTypes());
				List<IPropertyEditorFactory> foundFactories = null;
				for (EClass ecoreType : ecoreTypes) {
					foundFactories = RuntimePlugin.getPropertyEditorFactories(ecoreType);
					if (foundFactories != null && !foundFactories.isEmpty()) {
						break;
					}
				}
				if (foundFactories != null) {
					for (IPropertyEditorFactory factory : foundFactories) {
						IPropertyEditor editor = factory.createPropertyEditor(tab);
						addPropertyEditor(editor);
						editors.add(editor);
					}
				}
				createChildren();

			} else {
				for (IPropertyEditor editor : editors) {
					addPropertyEditor(editor);
					editor.setVisible(true, true, true);
				}
			}
		}
		
	}

	public void updateVisibility(boolean relayout, boolean force) {
		if (managed) {
			return;
		}
		super.updateVisibility(relayout, force);
	}
	
}
