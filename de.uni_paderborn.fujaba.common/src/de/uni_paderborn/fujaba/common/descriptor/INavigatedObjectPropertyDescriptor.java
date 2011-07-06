package de.uni_paderborn.fujaba.common.descriptor;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface INavigatedObjectPropertyDescriptor {
	EStructuralFeature getNavigationFeature();
}
