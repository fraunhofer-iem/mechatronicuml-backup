package org.eclipse.emf.ecore.properties.ecore.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class OCLFilterPropertyEditor extends CustomOCLPropertyEditor {
	
	private boolean preventModification = false;

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
		EModelElement modelElement = getReference();
		if (element != null) {
			EAnnotation annotation = modelElement.getEAnnotation("http://www.muml.org/emf/OCLFilter");
			if (annotation != null) {
				val = annotation.getDetails().get("filter");
			}
		}
		return val;
	}
	@Override
	protected void inputChanged(Object oldObject) {
		preventModification = true;
		super.inputChanged(oldObject);
		preventModification = false;
	}

	protected void updateText() {
		String text = "";
		EReference reference = getReference();
		EAnnotation annotation = getAnnotation();
		if (annotation != null && annotation.getDetails().get("filter") != null) {
			text = annotation.getDetails().get("filter");
		} else if (reference != null && reference.getEType() != null && reference.getEContainingClass() != null && reference.getEType().getEPackage() != null) {
			if (reference.getEType().getEPackage() != reference.getEContainingClass().getEPackage()) {
				text = reference.getEType().getEPackage().getName() + "::";
			}
			text += reference.getEType().getName() + "::allInstances()";
		}
		updateText(text);
	}

	protected EReference getReference() {
		EObject object = element;
		while (!(object instanceof EReference) && object != null) {
			object = object.eContainer();
		}
		return (EReference) object;
	}

	protected EAnnotation getAnnotation() {
		EReference modelElement = getReference();
		if (modelElement != null) {
			EAnnotation annotation = modelElement.getEAnnotation("http://www.muml.org/emf/OCLFilter");
			return annotation;
		}
		return null;
	}

	public void setDefaultValue() {
		final EAnnotation annotation = getAnnotation();
		if (annotation != null && annotation.getDetails().containsKey("filter")) {

			EditingDomain editingDomain = getEditingDomainFor(element);
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
		if (preventModification) {
			return;
		}
		if (newObject == null) {
			setDefaultValue();
			return;
		}
		EditingDomain editingDomain = getEditingDomainFor(element);
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
