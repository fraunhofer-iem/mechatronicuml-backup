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

public class EcoreDocumentationPropertyEditor extends TextPropertyEditor {

	public EcoreDocumentationPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature, true);
	}
	

	protected void setText(Object value) {
		String val = getDocumentation(value);

		if (text != null && !text.isDisposed() && !text.getText().equals(val)) {
			text.setText(val);
		}		
	}
	
	@Override
	public String getLabelText() {
		return "Documentation:";
	}
	
	protected String getDocumentation(Object value) {
		String val = "";
		EModelElement modelElement = getModelElement();
		if (element != null) {
			EAnnotation annotation = modelElement.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
			if (annotation != null && annotation.getDetails().containsKey("documentation")) {
				val = annotation.getDetails().get("documentation");
			}
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


	@Override
	protected void doSetValue(Object newObject) {
		String newValue = newObject.toString();
		String documentation = getDocumentation(value);
		if (text != null && !newValue.equals(documentation)) {
			//setValue(newValue);
			EModelElement modelElement = (EModelElement) element;
			EAnnotation annotation = modelElement.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
		
			if (annotation == null) {
				annotation = (EAnnotation) EcoreUtil.create(EcorePackage.Literals.EANNOTATION);
				annotation.setSource("http://www.eclipse.org/emf/2002/GenModel");
				modelElement.getEAnnotations().add(annotation);
			}
			
			annotation.getDetails().put("documentation", newValue);
		}
	}

}
