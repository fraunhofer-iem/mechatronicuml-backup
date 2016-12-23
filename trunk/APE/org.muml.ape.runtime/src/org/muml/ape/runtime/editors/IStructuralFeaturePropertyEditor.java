package org.muml.ape.runtime.editors;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface IStructuralFeaturePropertyEditor extends IPropertyEditor {
	EStructuralFeature getFeature();
}
