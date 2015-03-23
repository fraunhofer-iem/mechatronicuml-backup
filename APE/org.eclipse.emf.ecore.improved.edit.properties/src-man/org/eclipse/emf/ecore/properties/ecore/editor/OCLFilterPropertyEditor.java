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

public class OCLFilterPropertyEditor extends CustomOCLPropertyEditor {

	public OCLFilterPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	
	@Override
	public String getLabelText() {
		return "Filter:";
	}
	
	protected String getFilter(Object value) {
		String val = "";
		EModelElement modelElement = getModelElement();
		if (element != null) {
			EAnnotation annotation = modelElement.getEAnnotation("http://www.muml.org/emf/OCLFilter");
			if (annotation != null) {
				val = annotation.getDetails().get("filter");
			}
		}
		return val;
	}

	protected void updateText() {
		String text = "";
		EAnnotation annotation = getAnnotation();
		if (annotation != null && annotation.getDetails().get("filter") != null) {
			text = annotation.getDetails().get("filter");
		}
		updateText(text);
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

	public void setDefaultValue() {
		final EAnnotation annotation = getAnnotation();
		if (annotation != null && annotation.getDetails().containsKey("filter")) {

			EditingDomain editingDomain = getEditingDomain(element);
			editingDomain.getCommandStack().execute(new ChangeCommand(element) {
	
				@Override
				protected void doExecute() {
					annotation.getDetails().removeKey("filter");
				}
			});
		}
	}

	@Override
	protected void doSetValue(final Object newObject) {
		if (newObject == null) {
			setDefaultValue();
			return;
		}
		EditingDomain editingDomain = getEditingDomain(element);
		editingDomain.getCommandStack().execute(new ChangeCommand(element) {

			@Override
			protected void doExecute() {
				String newValue = newObject.toString();
				String filter = getFilter(value);
				if (!newValue.equals(filter)) {
					EAnnotation annotation = getAnnotation();
		
					if (annotation == null) {
						annotation = (EAnnotation) EcoreUtil.create(EcorePackage.Literals.EANNOTATION);
						annotation.setSource("http://www.muml.org/emf/OCLFilter");
						EModelElement modelElement = (EModelElement) element;
						modelElement.getEAnnotations().add(annotation);
					}
					
					annotation.getDetails().put("filter", newValue);
				}
			}
		});
	}

}
