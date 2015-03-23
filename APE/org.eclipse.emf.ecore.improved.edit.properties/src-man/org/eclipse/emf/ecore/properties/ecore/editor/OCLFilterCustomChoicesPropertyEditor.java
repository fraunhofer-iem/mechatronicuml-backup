package org.eclipse.emf.ecore.properties.ecore.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor;

public class OCLFilterCustomChoicesPropertyEditor extends CheckboxPropertyEditor {

	public OCLFilterCustomChoicesPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public String getLabelText() {
		return "Generate Custom Choices";
	}
	

	protected EAnnotation getAnnotation() {
		EModelElement modelElement = getModelElement();
		if (modelElement != null) {
			EAnnotation annotation = modelElement.getEAnnotation("http://www.muml.org/emf/OCLFilter");
			return annotation;
		}
		return null;
	}


	protected EModelElement getModelElement() {
		EObject object = element;
		while ((object instanceof EAnnotation) && object != null) { // forbid annotations
			object = object.eContainer();
		}
		return (EModelElement) object;
	}
	
	@Override
	protected void updateCheckboxValue() {
		if (checkbox != null && !checkbox.isDisposed()) {
			EAnnotation annotation = getAnnotation();
			checkbox.setSelection(annotation != null && annotation.getDetails().containsKey("choices"));
		}		
	}


	@Override
	protected void doSetValue(final Object newObject) {
		EditingDomain editingDomain = getEditingDomain(element);
		editingDomain.getCommandStack().execute(new ChangeCommand(element) {
			
			@Override
			protected void doExecute() {
			
				EAnnotation annotation = getAnnotation();
		
				if (Boolean.TRUE.equals(newObject)) {
					if (annotation == null) {
						annotation = (EAnnotation) EcoreUtil.create(EcorePackage.Literals.EANNOTATION);
						annotation.setSource("http://www.muml.org/emf/OCLFilter");
						EModelElement modelElement = (EModelElement) element;
						modelElement.getEAnnotations().add(annotation);
					}
					annotation.getDetails().put("choices", "");
				} else {
					if (annotation != null) {
						annotation.getDetails().removeKey("choices");
					}
				}
				
			}
		
		});
	}

}
