package org.eclipse.emf.ecore.properties.ecore.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor;

public class OCLFilterFeaturePropertyEditor extends TextPropertyEditor {

	public OCLFilterFeaturePropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature, false);
	}
	

	protected void setText(Object value) {
		String val = getFeature(value);

		if (text != null && !text.isDisposed() && !text.getText().equals(val)) {
			text.setText(val);
		}
	}
	
	@Override
	public String getLabelText() {
		return "Feature:";
	}
	
	protected String getFeature(Object value) {
		String val = "";
		
		EAnnotation annotation = getAnnotation();
		if (annotation != null && annotation.getDetails().containsKey("feature")) {
			val = annotation.getDetails().get("feature");
		}

		return val;
	}


	protected EModelElement getModelElement() {
		EObject object = element;
		while ((object instanceof EAnnotation) && object != null) { // forbid annotations
			object = object.eContainer();
		}
		return (EModelElement) object;
	}

	protected EAnnotation getAnnotation() {
		EModelElement modelElement = getModelElement();
		if (modelElement != null) {
			EAnnotation annotation = modelElement.getEAnnotation("http://www.muml.org/emf/OCLFilter");
			return annotation;
		}
		return null;
	}

	@Override
	protected void doSetValue(Object newObject) {
		String newValue = newObject.toString();
		String feature = getFeature(value);
		if (text != null && !newValue.equals(feature)) {
			EAnnotation annotation = getAnnotation();
		
			if (annotation == null) {
				annotation = (EAnnotation) EcoreUtil.create(EcorePackage.Literals.EANNOTATION);
				annotation.setSource("http://www.muml.org/emf/OCLFilter");
				EModelElement modelElement = (EModelElement) element;
				modelElement.getEAnnotations().add(annotation);
			}
			
			annotation.getDetails().put("feature", newValue);
		}
	}

}
