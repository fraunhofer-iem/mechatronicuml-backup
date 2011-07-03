package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;


public class Property {
	private EStructuralFeature feature;
	private AbstractPropertyEditor propertyEditor;

	public Property(EStructuralFeature feature,
			AbstractPropertyEditor propertyEditor) {
		this.feature = feature;
		this.propertyEditor = propertyEditor;
		propertyEditor.init(this);
	}

	public EStructuralFeature getFeature() {
		return feature;
	}

	public AbstractPropertyEditor getPropertyEditor() {
		return propertyEditor;
	}

	public String getDisplayName() {
		return feature.getName().substring(0, 1).toUpperCase() + feature.getName().substring(1);
	}

	// public abstract boolean validatePropertyValue(Object value);
}
