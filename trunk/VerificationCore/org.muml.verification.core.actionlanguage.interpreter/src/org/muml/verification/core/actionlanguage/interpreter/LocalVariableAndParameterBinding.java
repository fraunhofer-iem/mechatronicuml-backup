package org.muml.verification.core.actionlanguage.interpreter;

import org.muml.pim.behavior.TypedNamedElement;

public class LocalVariableAndParameterBinding {
	private TypedNamedElement typedNamedElement;
	private Object value;

	public LocalVariableAndParameterBinding() {

	}

	public LocalVariableAndParameterBinding(
			TypedNamedElement typedNamedElement, Object value) {
		this.typedNamedElement = typedNamedElement;
		this.value = value;
	}

	public LocalVariableAndParameterBinding(TypedNamedElement typedNamedElement) {
		this.typedNamedElement = typedNamedElement;
		this.value = null;
	}

	public TypedNamedElement getTypedNamedElement() {
		return typedNamedElement;
	}

	public void setTypedNamedElement(TypedNamedElement typedNamedElement) {
		this.typedNamedElement = typedNamedElement;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
