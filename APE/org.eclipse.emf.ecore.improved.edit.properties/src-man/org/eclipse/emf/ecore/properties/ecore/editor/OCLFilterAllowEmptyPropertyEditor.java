package org.eclipse.emf.ecore.properties.ecore.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor;

public class OCLFilterAllowEmptyPropertyEditor extends CheckboxPropertyEditor {

	public OCLFilterAllowEmptyPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public String getLabelText() {
		return "Allow Empty";
	}

	@Override
	protected void updateCheckboxValue() {
		if (checkbox != null && !checkbox.isDisposed()) {
			EAnnotation annotation = getAnnotation();
			checkbox.setSelection(annotation != null && annotation.getDetails().containsKey("allowEmpty") && "true".equalsIgnoreCase(annotation.getDetails().get("allowEmpty")));
		}		
	}
	protected String getAllowEmpty(Object value) {
		String val = "";
		EAnnotation annotation = getAnnotation();
		if (annotation != null) {
			val = annotation.getDetails().get("allowEmpty");
		}
		return val;
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
	protected void doSetValue(Object newObject) {
		boolean allowEmpty = "true".equalsIgnoreCase(getAllowEmpty(value));
		if (checkbox != null && !newObject.equals(allowEmpty)) {
			
			EAnnotation annotation = getAnnotation();
			if (annotation == null) {
				annotation = (EAnnotation) EcoreUtil.create(EcorePackage.Literals.EANNOTATION);
				annotation.setSource("http://www.muml.org/emf/OCLFilter");
				EModelElement modelElement = (EModelElement) element;
				modelElement.getEAnnotations().add(annotation);
			}
			
			annotation.getDetails().put("allowEmpty", newObject.toString());
		}
	}

}
