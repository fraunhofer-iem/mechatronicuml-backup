package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;


public interface IPropertiesListCreationDialogExtension extends ICreationDialogExtension {

	void updateModifyButtonEnablement();

	Collection<EClass> getInstanceClasses();

	EClass getInstanceClass();

	void setInstanceClass(EClass instanceClass);	
}
