package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface IStructuralFeaturePropertyEditor extends IPropertyEditor {
	EStructuralFeature getFeature();
}
